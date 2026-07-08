package Y;

import X.AbstractC19483511Kn;
import X.C1371420lnA;
import X.C1371430lnB;
import X.C1376500lvM;
import X.InterfaceC1254030ijp;
import X.InterfaceC1369790lkX;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AkS9S1210000_21 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS9S1210000_21 akS9S1210000_21, Object obj) {
        final C1371420lnA c1376500lvM;
        String str = (String) obj;
        if (akS9S1210000_21.z3) {
            str = ((WebSharePackage) akS9S1210000_21.l1).url;
        }
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) akS9S1210000_21.l2).key(), "email")) {
            c1376500lvM = new C1371430lnB(str, ((WebSharePackage) akS9S1210000_21.l1).title, akS9S1210000_21.s0);
        } else {
            c1376500lvM = new C1376500lvM(str, akS9S1210000_21.s0, ((WebSharePackage) akS9S1210000_21.l1).LJJ());
        }
        final WebSharePackage webSharePackage = (WebSharePackage) akS9S1210000_21.l1;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lwM
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                C1371420lnA c1371420lnA = c1376500lvM;
                String str2 = webSharePackage.remoteImagePath;
                if (str2 == null) {
                    str2 = "";
                }
                String strLJIILL = C1324840ka2.LJIILL(str2);
                if (strLJIILL.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C844470XAv.LIZ.getClass();
                    sbLIZ.append(C2427709fH.LJIILLIIL(C844470XAv.LIZ()));
                    sbLIZ.append("image_for_share.jpg");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C2354709Kn.LJIJJLI(strLIZIZ);
                    C2354709Kn.LIZLLL(strLJIILL, strLIZIZ);
                    c1371420lnA.LIZIZ("image", C1374720lsU.LJFF(C844470XAv.LIZ(), strLIZIZ).toString());
                }
                c11ky.onSuccess(c1371420lnA);
            }
        });
    }

    public static final Object apply$1(AkS9S1210000_21 akS9S1210000_21, Object obj) {
        String str;
        final C1371420lnA c1376500lvM;
        String str2 = (String) obj;
        if (akS9S1210000_21.z3) {
            str = ((WebSharePackage) akS9S1210000_21.l1).url;
        } else {
            str = str2;
        }
        ((WebSharePackage) akS9S1210000_21.l1).getClass();
        if (!SharePackage.LJIL(str2)) {
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lwQ
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB("", "", ""));
                }
            });
        }
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) akS9S1210000_21.l2).key(), "email")) {
            c1376500lvM = new C1371430lnB(str, ((WebSharePackage) akS9S1210000_21.l1).title, akS9S1210000_21.s0);
        } else {
            c1376500lvM = new C1376500lvM(str, akS9S1210000_21.s0, ((WebSharePackage) akS9S1210000_21.l1).LJJ());
        }
        final WebSharePackage webSharePackage = (WebSharePackage) akS9S1210000_21.l1;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lwN
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                C1371420lnA c1371420lnA = c1376500lvM;
                String str3 = webSharePackage.remoteImagePath;
                if (str3 == null) {
                    str3 = "";
                }
                String strLJIILL = C1324840ka2.LJIILL(str3);
                if (strLJIILL.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C844470XAv.LIZ.getClass();
                    sbLIZ.append(C2427709fH.LJIILLIIL(C844470XAv.LIZ()));
                    sbLIZ.append("image_for_share.jpg");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C2354709Kn.LJIJJLI(strLIZIZ);
                    C2354709Kn.LIZLLL(strLJIILL, strLIZIZ);
                    c1371420lnA.LIZIZ("image", C1374720lsU.LJFF(C844470XAv.LIZ(), strLIZIZ).toString());
                }
                c11ky.onSuccess(c1371420lnA);
            }
        });
    }

    public AkS9S1210000_21(boolean z, WebSharePackage webSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, String str, int i) {
        this.$t = i;
        this.z3 = z;
        this.l1 = webSharePackage;
        this.l2 = interfaceC1369790lkX;
        this.s0 = str;
    }
}
