package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.MinisAboutActivity;
import com.ss.android.ugc.profile.business.commerce.OrderCenterGuidanceDialog;

/* JADX INFO: renamed from: X.0j2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265730j2h extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$0(C1265730j2h c1265730j2h, Uri uri, View view, Throwable th) {
    }

    public static final void cm$1(C1265730j2h c1265730j2h, Uri uri, View view, Throwable th) {
    }

    public static final void cm$2(C1265730j2h c1265730j2h, Uri uri, View view, Throwable th) {
    }

    public static final void cm$5(C1265730j2h c1265730j2h, Uri uri, View view, Throwable th) {
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
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                C2187451AjH.LIZ;
                break;
            case 4:
                C2187451AjH.LIZ;
                break;
            case 5:
                Ad$5(this, uri, view, c428600GrK, animatable);
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
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            case 4:
                cm$4(this, uri, view, th);
                break;
            case 5:
                cm$5(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1265730j2h(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$3(C1265730j2h c1265730j2h, Uri uri, View view, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed，url:");
        sbLIZ.append(uri);
        sbLIZ.append(", minisIconUrl:");
        sbLIZ.append(((C2196981Aye) c1265730j2h.l0).LJIIJJI);
        sbLIZ.append(", view:");
        sbLIZ.append(view);
        sbLIZ.append(", throwable:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void cm$4(C1265730j2h c1265730j2h, Uri uri, View view, Throwable th) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed，url:");
        sbLIZ.append(uri);
        sbLIZ.append(", minisIconUrl:");
        MinisMetaResp minisMetaResp = ((MinisAboutActivity) c1265730j2h.l0).LL;
        if (minisMetaResp != null) {
            str = minisMetaResp.iconUrl;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", view:");
        sbLIZ.append(view);
        sbLIZ.append(", throwable:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void Ad$0(C1265730j2h c1265730j2h, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1242620iRQ c1242620iRQLJI = ((C1242590iRN) c1265730j2h.l0).LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZJ("show_profile");
        }
    }

    public static final void Ad$1(C1265730j2h c1265730j2h, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1242620iRQ c1242620iRQLJI = ((C1242590iRN) c1265730j2h.l0).LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LJ = "static";
        }
        C1242620iRQ c1242620iRQLJI2 = ((C1242590iRN) c1265730j2h.l0).LJI();
        if (c1242620iRQLJI2 != null) {
            c1242620iRQLJI2.LIZJ("show_cover");
        }
    }

    public static final void Ad$2(C1265730j2h c1265730j2h, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1242620iRQ c1242620iRQLJI = ((C1242590iRN) c1265730j2h.l0).LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZJ("show_profile");
        }
    }

    public static final void Ad$5(C1265730j2h c1265730j2h, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((OrderCenterGuidanceDialog) c1265730j2h.l0).LIZ = true;
    }
}
