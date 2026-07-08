package X;

import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.0krs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1335900krs implements InterfaceC427850Gq7 {
    @Override // X.InterfaceC427850Gq7
    public void e1(Uri uri) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" uri=");
        sbLIZ.append(uri);
        C1330590kjJ.LJIIIZ("Lighten:", "onRelease", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" uri=");
        sbLIZ.append(uri);
        sbLIZ.append(", imageInfo=");
        sbLIZ.append(c428600GrK);
        C1330590kjJ.LJIIIZ("Lighten:", "onIntermediateImageSet", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC427850Gq7
    public void Bh(Uri uri, View view) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uri=");
        sbLIZ.append(uri);
        C1330590kjJ.LJIIIZ("Lighten:", "onStart", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uri=");
        sbLIZ.append(uri);
        sbLIZ.append(", throwable=");
        sbLIZ.append(th);
        C1330590kjJ.LJIIIZ("Lighten:", "onIntermediateImageFailed", C2188811AlT.LIZIZ(sbLIZ));
    }
}
