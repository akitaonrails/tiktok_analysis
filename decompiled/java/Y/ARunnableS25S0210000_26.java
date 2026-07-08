package Y;

import X.C049X;
import X.C098200Yq;
import X.C1748720vbi;
import X.C1753660vjg;
import X.C1764030w0P;
import X.C1768560w7i;
import X.C189200o6;
import X.C1AF0;
import X.C1C7U;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C714530S1b;
import X.C786410Ut5;
import X.C7879035x;
import X.EnumC1768570w7j;
import X.EnumC1768950w8L;
import X.EnumC1768960w8M;
import X.EnumC1768980w8O;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS43S0310000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS25S0210000_26 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (((C1764030w0P) this.l0).LLJJ.getParent() == null || ((C1764030w0P) this.l0).LLJJ.getChildCount() == 0) {
            return;
        }
        C1764030w0P c1764030w0P = (C1764030w0P) this.l0;
        View childAt = c1764030w0P.LLJJ.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight();
            int i = C1764030w0P.LLJJIJIL;
            c1764030w0P.setItemHeightWithSpace(height + i);
            int itemHeightWithSpace = ((C1764030w0P) this.l0).getItemHeightWithSpace();
            C1764030w0P c1764030w0P2 = (C1764030w0P) this.l0;
            int itemHeightWithSpace2 = (itemHeightWithSpace * c1764030w0P2.LLILZ) + c1764030w0P2.getItemHeightWithSpace();
            C1764030w0P c1764030w0P3 = (C1764030w0P) this.l0;
            ViewGroup.LayoutParams layoutParams = c1764030w0P3.getLayoutParams();
            layoutParams.height = itemHeightWithSpace2 - i;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1764030w0P3);
            c1764030w0P3.setLayoutParams(layoutParams);
            LinearLayout linearLayout = ((C1764030w0P) this.l0).LLJJ;
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            C1764030w0P c1764030w0P4 = (C1764030w0P) this.l0;
            layoutParams2.height = itemHeightWithSpace2;
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = c1764030w0P4.getItemHeightWithSpace();
            }
            C786410Ut5.d6(linearLayout, layoutParams2);
            C1764030w0P c1764030w0P5 = (C1764030w0P) this.l0;
            c1764030w0P5.LLJI = true;
            Function1 function1 = (Function1) this.l1;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(c1764030w0P5.getItemHeightWithSpace()));
            }
            if (this.z2) {
                ((C1764030w0P) this.l0).LIZLLL();
            }
        }
    }

    public final void LIZ$1() {
        C1753660vjg c1753660vjgC6 = ((PdpBundleDealVH) this.l0).c6();
        PdpBundleDealVH pdpBundleDealVH = (PdpBundleDealVH) this.l0;
        BundleInfo bundleInfo = (BundleInfo) this.l1;
        boolean z = this.z2;
        Map<String, Object> mapLJ = pdpBundleDealVH.e6().LLILZIL.LJ("c1720.d9604");
        c1753660vjgC6.getClass();
        C1748720vbi.LIZIZ(pdpBundleDealVH, new C049X(), new AwS43S0310000_26(c1753660vjgC6, (C1753660vjg) bundleInfo, (BundleInfo) z, (boolean) mapLJ, (Map<String, ? extends Object>) 5));
    }

    public final void LIZ$2() {
        CustomDotVMV2 customDotVMV2 = (CustomDotVMV2) this.l0;
        C714530S1b c714530S1b = (C714530S1b) this.l1;
        boolean z = this.z2;
        if (C7879035x.LIZLLL()) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShopTab VideoPageChange aid: ");
            Aweme aweme = customDotVMV2.LLJILLL;
            sbLIZ.append(aweme != null ? aweme.getAid() : null);
            sbLIZ.append(" isFromPageResume: ");
            sbLIZ.append(c714530S1b.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            if (customDotVMV2.LLJJ) {
                customDotVMV2.LLJJ = false;
                C1768560w7i c1768560w7i = C1768560w7i.LIZ;
                EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.TRIGGER_REQUEST;
                EnumC1768960w8M enumC1768960w8M = EnumC1768960w8M.HOME_TAB_VIDEO_CHANGE;
                c1768560w7i.getClass();
                C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8M, false, null);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ShopTab VideoPageChange aid: ");
            Aweme aweme2 = customDotVMV2.LLJILLL;
            sbLIZ2.append(aweme2 != null ? aweme2.getAid() : null);
            sbLIZ2.append(" isFromPageResume: ");
            sbLIZ2.append(c714530S1b.LIZIZ);
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (!customDotVMV2.ge2() && customDotVMV2.LLILLL.needFetch && Intrinsics.LJFF(customDotVMV2.LLILLL.lastReachFailReason, EnumC1768980w8O.HOME_TAB_ADSVIDEO_SHOWING.getValue()) && !customDotVMV2.LLJLIL) {
                customDotVMV2.JQ2(z, EnumC1768950w8L.HOME_TAB_VIDEO_CHANGE, null, null);
                return;
            }
            C1768560w7i c1768560w7i2 = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j2 = EnumC1768570w7j.TRIGGER_REQUEST;
            EnumC1768960w8M enumC1768960w8M2 = EnumC1768960w8M.HOME_TAB_VIDEO_CHANGE;
            c1768560w7i2.getClass();
            C1768560w7i.LJ(enumC1768570w7j2, enumC1768960w8M2, false, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ShopTab VideoPageChange aid: ");
            Aweme aweme3 = customDotVMV2.LLJILLL;
            sbLIZ3.append(aweme3 != null ? aweme3.getAid() : null);
            sbLIZ3.append(" isFromPageResume: ");
            sbLIZ3.append(c714530S1b.LIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c2341109Fh2.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
            if (customDotVMV2.LLJJ) {
                customDotVMV2.LLJJ = false;
                C1768560w7i c1768560w7i3 = C1768560w7i.LIZ;
                EnumC1768570w7j enumC1768570w7j3 = EnumC1768570w7j.TRIGGER_REQUEST;
                EnumC1768960w8M enumC1768960w8M3 = EnumC1768960w8M.HOME_TAB_VIDEO_CHANGE;
                c1768560w7i3.getClass();
                C1768560w7i.LJ(enumC1768570w7j3, enumC1768960w8M3, false, null);
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ShopTab VideoPageChange aid: ");
            Aweme aweme4 = customDotVMV2.LLJILLL;
            sbLIZ4.append(aweme4 != null ? aweme4.getAid() : null);
            sbLIZ4.append(" isFromPageResume: ");
            sbLIZ4.append(c714530S1b.LIZIZ);
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            if (!customDotVMV2.ge2() && customDotVMV2.LLILLL.needFetch && Intrinsics.LJFF(customDotVMV2.LLILLL.lastReachFailReason, EnumC1768980w8O.HOME_TAB_ADSVIDEO_SHOWING.getValue()) && !customDotVMV2.LLJLIL) {
                customDotVMV2.JQ2(z, EnumC1768950w8L.HOME_TAB_VIDEO_CHANGE, null, null);
                return;
            }
            C1768560w7i c1768560w7i4 = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j4 = EnumC1768570w7j.TRIGGER_REQUEST;
            EnumC1768960w8M enumC1768960w8M4 = EnumC1768960w8M.HOME_TAB_VIDEO_CHANGE;
            c1768560w7i4.getClass();
            C1768560w7i.LJ(enumC1768570w7j4, enumC1768960w8M4, false, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS25S0210000_26 aRunnableS25S0210000_26) {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpSellingPointsVerticalCarouselView@1ce0.updateData$2");
        try {
            aRunnableS25S0210000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpSellingPointsVerticalCarouselView@1ce0.updateData$2");
    }

    public static final void run$1(ARunnableS25S0210000_26 aRunnableS25S0210000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PdpBundleDealVH@7dd9.initView$1$6$4");
        try {
            aRunnableS25S0210000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpBundleDealVH@7dd9.initView$1$6$4");
    }

    public static final void run$2(ARunnableS25S0210000_26 aRunnableS25S0210000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CustomDotVMV2@ba3d.handleVideoPageChangeEvent$1");
        try {
            aRunnableS25S0210000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.handleVideoPageChangeEvent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS25S0210000_26(Object obj, C1764030w0P c1764030w0P, Function1<? super Integer, Unit> function1, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = c1764030w0P;
        this.z2 = function1;
    }
}
