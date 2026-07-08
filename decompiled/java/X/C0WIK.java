package X;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WIK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIK extends MediaBrowserService {
    public final /* synthetic */ C0WII LL;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    public C0WIK(C0WII c0wii, MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.LL = c0wii;
        attachBaseContext(mediaBrowserServiceCompat);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(final String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        C0WII c0wii = this.LL;
        final C0WIO c0wio = new C0WIO(result);
        c0wii.getClass();
        c0wii.LIZLLL.LIZJ(new C0WIS<List<MediaBrowserCompat.MediaItem>>(str) { // from class: X.0WIQ
            @Override // X.C0WIS
            public final void LIZ() {
                c0wio.LIZ.detach();
            }

            @Override // X.C0WIS
            public final void LIZJ(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                List<MediaBrowserCompat.MediaItem> list2 = list;
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                c0wio.LIZ(arrayList);
            }
        });
        c0wii.LIZLLL.getClass();
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2;
        Bundle bundle3;
        IBinder iBinderAsBinder;
        MediaSessionCompat.LIZ(bundle);
        C0WII c0wii = this.LL;
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        c0wii.getClass();
        if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
            bundle2.remove("extra_client_version");
            c0wii.LIZJ = new Messenger(c0wii.LIZLLL.LLILZIL);
            bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            C786410Ut5.LJJIIZ(bundle3, c0wii.LIZJ.getBinder(), "extra_messenger");
            MediaSessionCompat.Token token = c0wii.LIZLLL.LLILZLL;
            if (token != null) {
                C1ATP c1atpLIZ = token.LIZ();
                if (c1atpLIZ == null) {
                    iBinderAsBinder = null;
                } else {
                    iBinderAsBinder = c1atpLIZ.asBinder();
                }
                C786410Ut5.LJJIIZ(bundle3, iBinderAsBinder, "extra_session_binder");
            } else {
                ((ArrayList) c0wii.LIZ).add(bundle3);
            }
            i2 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
        } else {
            i2 = -1;
            bundle3 = null;
        }
        C0WIX c0wix = new C0WIX(c0wii.LIZLLL, str, i2, i, null);
        c0wii.LIZLLL.getClass();
        C0WIH c0wihLIZIZ = c0wii.LIZLLL.LIZIZ(str);
        c0wii.LIZLLL.getClass();
        if (c0wihLIZIZ == null) {
            return null;
        }
        if (c0wii.LIZJ != null) {
            c0wii.LIZLLL.LLILLL.add(c0wix);
        }
        if (bundle3 == null) {
            bundle3 = c0wihLIZIZ.LIZIZ;
        } else {
            Bundle bundle4 = c0wihLIZIZ.LIZIZ;
            if (bundle4 != null) {
                C786410Ut5.LJJIIJZLJL(bundle3, bundle4);
            }
        }
        C0WIH c0wih = new C0WIH(c0wihLIZIZ.LIZ, bundle3);
        return new MediaBrowserService.BrowserRoot(c0wih.LIZ, c0wih.LIZIZ);
    }
}
