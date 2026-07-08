package X;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: X.0I70, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I70 {
    public final InterfaceC461270I6z LIZ;

    public final void LIZ() {
        this.LIZ.LJ();
    }

    public C0I70(C0I71 c0i71) {
        this.LIZ = c0i71;
    }

    public C0I70(final Uri uri, final ClipDescription clipDescription, final Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.LIZ = new C0I71(uri, clipDescription, uri2);
        } else {
            this.LIZ = new InterfaceC461270I6z(uri, clipDescription, uri2) { // from class: X.0I72
                public final Uri LIZ;
                public final ClipDescription LIZIZ;
                public final Uri LIZJ;

                @Override // X.InterfaceC461270I6z
                public final Object LIZ() {
                    return null;
                }

                @Override // X.InterfaceC461270I6z
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC461270I6z
                public final void LJ() {
                }

                @Override // X.InterfaceC461270I6z
                public final Uri LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC461270I6z
                public final Uri LIZJ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC461270I6z
                public final ClipDescription getDescription() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = uri;
                    this.LIZIZ = clipDescription;
                    this.LIZJ = uri2;
                }
            };
        }
    }
}
