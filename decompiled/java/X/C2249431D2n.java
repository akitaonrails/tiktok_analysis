package X;

import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetAnchorViewAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249431D2n {
    public final InterfaceC1773310wFN LIZ;
    public final Function0<ShopMallMixViewModel> LIZIZ;
    public final Function0<String> LIZJ;
    public final C21316218bQ LIZLLL;
    public final Function1<String, Unit> LJ;

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = X.C1767800w6U.LJ()
            if (r0 == 0) goto L1b
            kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel> r0 = r5.LIZIZ
            java.lang.Object r2 = r0.invoke()
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r2
            if (r2 == 0) goto L1a
            kotlin.jvm.internal.AwS74S1000000_24 r1 = new kotlin.jvm.internal.AwS74S1000000_24
            r0 = 10
            r1.<init>(r6, r0)
            r2.setState(r1)
        L1a:
            return
        L1b:
            X.0wFN r0 = r5.LIZ
            X.0wEM r0 = r0.LJIIIZ()
            X.0wEH r4 = r0.c82()
            if (r4 == 0) goto L1a
            int r1 = r6.hashCode()
            r3 = 0
            r0 = -1306012042(0xffffffffb227d676, float:-9.769442E-9)
            r2 = 1
            if (r1 == r0) goto La5
            r0 = 3075958(0x2eef76, float:4.310335E-39)
            if (r1 == r0) goto L9c
            r0 = 102970646(0x6233516, float:3.0695894E-35)
            if (r1 != r0) goto L44
            java.lang.String r0 = "light"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5d
        L44:
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO r0 = r4.LIZIZ
            if (r0 == 0) goto L8d
            int r0 = r0.statusBarStyle
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L8d
            int r0 = r1.intValue()
            if (r0 == r2) goto L5e
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L8d
        L5d:
            r2 = 0
        L5e:
            X.0wFN r0 = r5.LIZ
            X.0wEJ r0 = r0.LIZLLL()
            X.19EG r0 = r0.LIZLLL
            com.bytedance.tux.system.TuxImmersionBar r1 = X.C1766560w4U.LJ(r0)
            r1.LIZ(r3)
            com.bytedance.immersionbar.ImmersionBar r0 = r1.LIZIZ
            r0.LJIIJ(r2)
            r1.LIZLLL()
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r3 = r5.LJ
            if (r3 == 0) goto L1a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "autoDarkMode: false, statusBarDarkFont: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.invoke(r0)
            return
        L8d:
            X.0wFN r0 = r5.LIZ
            X.0wEJ r0 = r0.LIZLLL()
            android.content.Context r0 = r0.LIZIZ
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 != 0) goto L5d
            goto L5e
        L9c:
            java.lang.String r0 = "dark"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L44
            goto L5e
        La5:
            java.lang.String r0 = "adaptive"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L44
            X.0wFN r0 = r5.LIZ
            X.0wEJ r0 = r0.LIZLLL()
            android.content.Context r0 = r0.LIZIZ
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 != 0) goto L5d
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2249431D2n.LIZLLL(java.lang.String):void");
    }

    public static Map LIZJ(String str, String str2) {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("dynamic_style", str);
        if (str2.length() == 0) {
            str2 = "";
        }
        pairArr[1] = new Pair("dynamic_color", str2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final void LIZ(C2249411D2l c2249411D2l, String str) {
        String str2;
        String str3 = c2249411D2l.LJ;
        if (str3 == null) {
            LIZLLL(this.LIZJ.invoke());
        } else {
            LIZLLL(str3);
        }
        LIZIZ(c2249411D2l.LJFF, c2249411D2l.LJI);
        Function1<String, Unit> function1 = this.LJ;
        if (function1 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyBarStyles success, source=");
            sbLIZ.append(str);
            sbLIZ.append(", isSticky=");
            sbLIZ.append(c2249411D2l.LIZ);
            sbLIZ.append(", statusBarStyle=");
            DynamicBarStyleConfig dynamicBarStyleConfig = c2249411D2l.LIZJ;
            String str4 = null;
            if (dynamicBarStyleConfig != null) {
                str2 = dynamicBarStyleConfig.style;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", searchBarStyle=");
            DynamicBarStyleConfig dynamicBarStyleConfig2 = c2249411D2l.LIZLLL;
            if (dynamicBarStyleConfig2 != null) {
                str4 = dynamicBarStyleConfig2.style;
            }
            sbLIZ.append(str4);
            sbLIZ.append(", searchBarDynamicStyle=");
            sbLIZ.append(c2249411D2l.LJFF);
            sbLIZ.append(", searchBarDynamicColor=");
            sbLIZ.append(c2249411D2l.LJI);
            function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZIZ(String str, String str2) {
        C1774640wHW c1774640wHWLz1;
        View view = null;
        GetAnchorViewAbility getAnchorViewAbility = (GetAnchorViewAbility) C1558520qew.LIZ(C1558360qeg.LJI(this.LIZLLL.LIZ.LIZLLL().LIZLLL, null), GetAnchorViewAbility.class, null);
        if (getAnchorViewAbility != null && (c1774640wHWLz1 = getAnchorViewAbility.lz1("header", null, null)) != null) {
            view = c1774640wHWLz1.LIZIZ;
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                View view2 = (View) c09re.next();
                if (view2 instanceof LynxView) {
                    LynxView lynxView = (LynxView) view2;
                    if (lynxView != null) {
                        lynxView.updateGlobalProps(LIZJ(str, str2));
                        return;
                    }
                }
            }
        }
        Function1<String, Unit> function1 = this.LJ;
        if (function1 == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applySearchBarDynamicProps skipped: searchView is null, dynamicStyle=");
        sbLIZ.append(str);
        sbLIZ.append(", dynamicColor=");
        sbLIZ.append(str2);
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C2249431D2n(InterfaceC1773310wFN interfaceC1773310wFN, AwS579S0100000_35 awS579S0100000_35, AwS570S0100000_26 awS570S0100000_26, C21316218bQ c21316218bQ, AwS614S0100000_35 awS614S0100000_35) {
        this.LIZ = interfaceC1773310wFN;
        this.LIZIZ = awS579S0100000_35;
        this.LIZJ = awS570S0100000_26;
        this.LIZLLL = c21316218bQ;
        this.LJ = awS614S0100000_35;
    }
}
