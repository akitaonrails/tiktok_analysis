package X;

import androidx.media.MediaBrowserServiceCompat;

/* JADX INFO: renamed from: X.0WIU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIU extends C0WII {
    public final /* synthetic */ MediaBrowserServiceCompat LJ;

    @Override // X.C0WIJ
    public void onCreate() {
        C0WIL c0wil = new C0WIL(this, this.LJ);
        this.LIZIZ = c0wil;
        c0wil.onCreate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WIU(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.LJ = mediaBrowserServiceCompat;
    }
}
