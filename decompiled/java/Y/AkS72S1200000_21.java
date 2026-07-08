package Y;

import X.AbstractC19483511Kn;
import X.C11IG;
import X.C1372380loi;
import X.C1374720lsU;
import X.C2188811AlT;
import X.C259800zU;
import X.C786410Ut5;
import X.InterfaceC1254030ijp;
import X.InterfaceC1369790lkX;
import X.InterfaceC1487280oo2;
import android.os.Bundle;
import com.ss.android.ugc.aweme.lemon.share.Lemon8SharePackage;
import com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public class AkS72S1200000_21 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS72S1200000_21 akS72S1200000_21, Object obj) {
        final String str = (String) obj;
        ((Lemon8SharePackage) akS72S1200000_21.l1).getClass();
        if (!SharePackage.LJIL(str)) {
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmm
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB("", "", ""));
                }
            });
        }
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) akS72S1200000_21.l2).key(), "email")) {
            final Lemon8SharePackage lemon8SharePackage = (Lemon8SharePackage) akS72S1200000_21.l1;
            final String str2 = akS72S1200000_21.s0;
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lml
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB(str, lemon8SharePackage.title, str2));
                }
            });
        }
        final String str3 = akS72S1200000_21.s0;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmn
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(str, str3, 4));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(AkS72S1200000_21 akS72S1200000_21, Object obj) {
        String str = (String) obj;
        ((LinkDefaultSharePackageV2) akS72S1200000_21.l1).getClass();
        if (!SharePackage.LJIL(str)) {
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmq
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB("", "", ""));
                }
            });
        }
        Bundle bundle = ((LinkDefaultSharePackageV2) akS72S1200000_21.l1).extras.getBundle("short_link_params");
        final C259800zU c259800zU = new C259800zU();
        String strLIZ = C1374720lsU.LIZ(bundle, str);
        T t = strLIZ;
        if (strLIZ == null) {
            t = "";
        }
        c259800zU.element = t;
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) akS72S1200000_21.l2).key(), "email")) {
            final LinkDefaultSharePackageV2 linkDefaultSharePackageV2 = (LinkDefaultSharePackageV2) akS72S1200000_21.l1;
            final String str2 = akS72S1200000_21.s0;
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmp
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB(c259800zU.element, linkDefaultSharePackageV2.title, str2));
                }
            });
        }
        final String str3 = akS72S1200000_21.s0;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmd
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(c259800zU.element, str3, 4));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(AkS72S1200000_21 akS72S1200000_21, Object obj) {
        String str = (String) obj;
        ((LinkDefaultSharePackage) akS72S1200000_21.l1).getClass();
        if (!SharePackage.LJIL(str)) {
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmt
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB("", "", ""));
                }
            });
        }
        Bundle bundle = ((LinkDefaultSharePackage) akS72S1200000_21.l1).extras.getBundle("short_link_params");
        final C259800zU c259800zU = new C259800zU();
        String strLIZ = C1374720lsU.LIZ(bundle, str);
        T t = strLIZ;
        if (strLIZ == null) {
            t = "";
        }
        c259800zU.element = t;
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) akS72S1200000_21.l2).key(), "email")) {
            final LinkDefaultSharePackage linkDefaultSharePackage = (LinkDefaultSharePackage) akS72S1200000_21.l1;
            final String str2 = akS72S1200000_21.s0;
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmr
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB(c259800zU.element, linkDefaultSharePackage.title, str2));
                }
            });
        }
        final String str3 = akS72S1200000_21.s0;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lms
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(c259800zU.element, str3, 4));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static final Object apply$3(AkS72S1200000_21 akS72S1200000_21, Object obj) {
        String str = (String) obj;
        ((SharePackage) akS72S1200000_21.l1).getClass();
        if (!SharePackage.LJIL(str)) {
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmh
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB("", "", ""));
                }
            });
        }
        Bundle bundle = ((SharePackage) akS72S1200000_21.l1).extras.getBundle("short_link_params");
        final C259800zU c259800zU = new C259800zU();
        String strLIZ = C1374720lsU.LIZ(bundle, str);
        ?? r3 = strLIZ;
        if (strLIZ == null) {
            r3 = "";
        }
        c259800zU.element = r3;
        C786410Ut5.LJJJI("share_url", r3, ((SharePackage) akS72S1200000_21.l1).extras);
        ((SharePackage) akS72S1200000_21.l1).extras.putInt("is_preload", 0);
        String strKey = ((InterfaceC1369790lkX) akS72S1200000_21.l2).key();
        if (Intrinsics.LJFF(strKey, "email")) {
            final String str2 = akS72S1200000_21.s0;
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmg
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB(c259800zU.element, C1374720lsU.LIZIZ().getString(2131845764), str2));
                }
            });
        }
        if (Intrinsics.LJFF(strKey, "copy")) {
            final String str3 = akS72S1200000_21.s0;
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lme
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB(c259800zU.element, str3, 4));
                }
            });
        }
        final String str4 = akS72S1200000_21.s0;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmf
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(c259800zU.element, str4, 4));
            }
        });
    }

    public static final Object apply$4(AkS72S1200000_21 akS72S1200000_21, Object obj) {
        String str = (String) obj;
        ((LiveSharePackage) akS72S1200000_21.l1).getClass();
        if (!SharePackage.LJIL(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("short link illegal: ");
            sbLIZ.append(str);
            return new C11IG(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        final String strLIZ = C1374720lsU.LIZ(((LiveSharePackage) akS72S1200000_21.l1).extras.getBundle("short_link_params"), str);
        String str2 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        C1372380loi c1372380loi = LiveSharePackage.Companion;
        LiveSharePackage liveSharePackage = (LiveSharePackage) akS72S1200000_21.l1;
        c1372380loi.getClass();
        String string = liveSharePackage.extras.getString("default_edit_text_msg");
        if (string != null) {
            str2 = string;
        }
        String string2 = a0.LJLIIIL(str2).toString();
        if (!a0.LJJJIL(string2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZ);
            sbLIZ2.append(' ');
            sbLIZ2.append(string2);
            strLIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (Intrinsics.LJFF(((InterfaceC1369790lkX) akS72S1200000_21.l2).key(), "email")) {
            final LiveSharePackage liveSharePackage2 = (LiveSharePackage) akS72S1200000_21.l1;
            final String str3 = akS72S1200000_21.s0;
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lnE
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(new C1371430lnB(strLIZ, liveSharePackage2.title, str3));
                }
            });
        }
        final String str4 = akS72S1200000_21.s0;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lnF
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(strLIZ, str4, 4));
            }
        });
    }

    public AkS72S1200000_21(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
