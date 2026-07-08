package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.12Nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19746912Nv extends AbstractC1335900krs {
    public final String LL;

    public C19746912Nv(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        String path;
        C14ZT c14zt = C14ZT.LIZ;
        String str = this.LL;
        if (uri != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        String strValueOf = String.valueOf(path);
        c14zt.getClass();
        C14ZT.LJIILIIL("survey_image_display", new C01TI(false, str, strValueOf));
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String path;
        C14ZT c14zt = C14ZT.LIZ;
        String str = this.LL;
        if (uri != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        String strValueOf = String.valueOf(path);
        c14zt.getClass();
        C14ZT.LJIILIIL("survey_image_display", new C01TI(true, str, strValueOf));
    }
}
