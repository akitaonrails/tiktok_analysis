package X;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;

/* JADX INFO: renamed from: X.0WIL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIL extends C0WIK {
    public final /* synthetic */ C0WIU LLILLJJLI;

    @Override // X.C0WIK, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WIL(C0WIU c0wiu, MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(c0wiu, mediaBrowserServiceCompat);
        this.LLILLJJLI = c0wiu;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(final String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        C0WIU c0wiu = this.LLILLJJLI;
        final C0WIO c0wio = new C0WIO(result);
        c0wiu.getClass();
        C0WIS<MediaBrowserCompat.MediaItem> c0wis = new C0WIS<MediaBrowserCompat.MediaItem>(str) { // from class: X.0WIT
            @Override // X.C0WIS
            public final void LIZ() {
                c0wio.LIZ.detach();
            }

            @Override // X.C0WIS
            public final void LIZJ(MediaBrowserCompat.MediaItem mediaItem) {
                MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
                if (mediaItem2 == null) {
                    c0wio.LIZ(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem2.writeToParcel(parcelObtain, 0);
                c0wio.LIZ(parcelObtain);
            }
        };
        c0wis.LJ = 2;
        c0wis.LIZLLL(null);
        c0wiu.LJ.getClass();
    }
}
