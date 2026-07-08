package X;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: X.0I71, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I71 implements InterfaceC461270I6z {
    public final InputContentInfo LIZ;

    @Override // X.InterfaceC461270I6z
    public final Uri LIZIZ() {
        return this.LIZ.getContentUri();
    }

    @Override // X.InterfaceC461270I6z
    public final Uri LIZJ() {
        return this.LIZ.getLinkUri();
    }

    @Override // X.InterfaceC461270I6z
    public final void LIZLLL() {
        this.LIZ.requestPermission();
    }

    @Override // X.InterfaceC461270I6z
    public final void LJ() {
        this.LIZ.releasePermission();
    }

    @Override // X.InterfaceC461270I6z
    public final ClipDescription getDescription() {
        return this.LIZ.getDescription();
    }

    @Override // X.InterfaceC461270I6z
    public final Object LIZ() {
        return this.LIZ;
    }

    public C0I71(Object obj) {
        this.LIZ = (InputContentInfo) obj;
    }

    public C0I71(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.LIZ = new InputContentInfo(uri, clipDescription, uri2);
    }
}
