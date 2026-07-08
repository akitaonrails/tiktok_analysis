package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.19LJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LJ extends AbstractC1335900krs {
    public final int $t;

    public static final void Ad$0(C19LJ c19lj, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$1(C19LJ c19lj, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C19LJ(int i) {
        this.$t = i;
    }

    public static final void cm$0(C19LJ c19lj, Uri uri, View view, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load image error. uri:");
        sbLIZ.append(uri);
        sbLIZ.append(", exception:");
        sbLIZ.append(th);
        C1720106oR.LIZ("ProfileOutreachBanner", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void cm$1(C19LJ c19lj, Uri uri, View view, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load image error. uri:");
        sbLIZ.append(uri);
        sbLIZ.append(", exception:");
        sbLIZ.append(th);
        C1720106oR.LIZ("RectWithoutButtonBannerProvider", C2188811AlT.LIZIZ(sbLIZ));
    }
}
