package X;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WIV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIV extends C0WIU {
    public final /* synthetic */ MediaBrowserServiceCompat LJFF;

    @Override // X.C0WIU, X.C0WIJ
    public final void onCreate() {
        final MediaBrowserServiceCompat mediaBrowserServiceCompat = this.LJFF;
        C0WIL c0wil = new C0WIL(mediaBrowserServiceCompat) { // from class: X.0WIM
            @Override // X.C0WIL, X.C0WIK, android.app.Service, android.content.ContextWrapper
            public final void attachBaseContext(Context context) {
                if (NxRewordManager.LJIILIIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attachBaseContextWrapper: ");
                    sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
                    C2188811AlT.LIZIZ(sbLIZ);
                    context = new C817700W5w(context, false);
                }
                if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
                    C2188191AkT.LIZJ();
                }
                super.attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(final String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, final Bundle bundle) {
                MediaSessionCompat.LIZ(bundle);
                final C0WIV c0wiv = this.LLILLL;
                final C0WIO c0wio = new C0WIO(result);
                c0wiv.getClass();
                C0WIS<List<MediaBrowserCompat.MediaItem>> c0wis = new C0WIS<List<MediaBrowserCompat.MediaItem>>(str) { // from class: X.0WIP
                    @Override // X.C0WIS
                    public final void LIZ() {
                        c0wio.LIZ.detach();
                    }

                    @Override // X.C0WIS
                    public final void LIZJ(List<MediaBrowserCompat.MediaItem> list) {
                        List<MediaBrowserCompat.MediaItem> listLIZ = list;
                        if (listLIZ == null) {
                            c0wio.LIZ(null);
                            return;
                        }
                        if ((this.LJ & 1) != 0) {
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = c0wiv.LJFF;
                            Bundle bundle2 = bundle;
                            mediaBrowserServiceCompat2.getClass();
                            listLIZ = MediaBrowserServiceCompat.LIZ(bundle2, listLIZ);
                        }
                        ArrayList arrayList = new ArrayList(listLIZ.size());
                        for (MediaBrowserCompat.MediaItem mediaItem : listLIZ) {
                            Parcel parcelObtain = Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList.add(parcelObtain);
                        }
                        c0wio.LIZ(arrayList);
                    }
                };
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = c0wiv.LJFF;
                c0wis.LJ = 1;
                mediaBrowserServiceCompat2.LIZJ(c0wis);
                c0wiv.LJFF.getClass();
                this.LLILLL.LJFF.getClass();
            }
        };
        this.LIZIZ = c0wil;
        c0wil.onCreate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WIV(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.LJFF = mediaBrowserServiceCompat;
    }
}
