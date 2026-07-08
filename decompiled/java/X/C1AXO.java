package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.1AXO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXO {
    public static final /* synthetic */ int LJFF = 0;
    public final C1AXM LIZ;
    public final C1AYR LIZIZ;
    public final InterfaceC2181151AXx LIZJ;
    public final C2181141AXw LIZLLL;
    public final C21614619iS LJ = new C21614619iS();

    public final boolean LJII() {
        Layout layoutLIZ = LIZ(false);
        return (layoutLIZ == null || layoutLIZ.isFixedType()) ? false : true;
    }

    public final int LIZJ() {
        return this.LIZJ.LIZIZ();
    }

    public final boolean LJI() {
        Layout layoutLIZJ = this.LIZIZ.LIZJ(false);
        return (layoutLIZJ != null && layoutLIZJ.isFixedType()) || this.LIZLLL.LIZ();
    }

    public final Map<String, OnLineMicInfo> LJFF() {
        return LJI() ? this.LIZJ.LIZ() : this.LIZJ.LJJII();
    }

    public static String LJIIIIZZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_MicHelper_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.comp.api.linkcore.model.Layout LIZ(boolean r9) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AXO.LIZ(boolean):com.bytedance.android.livesdk.comp.api.linkcore.model.Layout");
    }

    public final int LIZIZ(Layout layout) {
        Map<String, LayoutArray> map;
        if (this.LIZLLL.LIZ()) {
            return layout.micCount;
        }
        LayoutArrayList layoutMaskConfigListByOnlineMicCount = layout.getLayoutMaskConfigListByOnlineMicCount(LJFF().size());
        if (layoutMaskConfigListByOnlineMicCount != null && (map = layoutMaskConfigListByOnlineMicCount.indexLayoutArrayMap) != null) {
            return map.size();
        }
        return 0;
    }

    public final Integer LIZLLL(String str) {
        OnLineMicInfo onLineMicInfoLJFF;
        MicPositionInfo micPositionInfo;
        if (LJI()) {
            onLineMicInfoLJFF = this.LIZJ.LJIJI(str);
        } else {
            onLineMicInfoLJFF = this.LIZJ.LJFF(str);
        }
        if (onLineMicInfoLJFF != null && (micPositionInfo = onLineMicInfoLJFF.micPositionData) != null) {
            return Integer.valueOf(micPositionInfo.position);
        }
        return null;
    }

    public C1AXO(C1AXM c1axm, C1AYR c1ayr, InterfaceC2181151AXx interfaceC2181151AXx, C2181141AXw c2181141AXw) {
        this.LIZ = c1axm;
        this.LIZIZ = c1ayr;
        this.LIZJ = interfaceC2181151AXx;
        this.LIZLLL = c2181141AXw;
    }

    public final C1AYE LJ(int i, Layout layout, Rect rect, Rect rect2) {
        LayoutArrayList layoutMaskConfigListByOnlineMicCount;
        Map<String, LayoutArray> map;
        if (layout.isNormalType()) {
            return new C1AYE(0, new Rect());
        }
        LayoutArray layoutByPosAndSize = layout.getLayoutByPosAndSize(i, LIZJ());
        int i2 = 1;
        if (layoutByPosAndSize == null) {
            String strLJIIIIZZ = LJIIIIZZ(67);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPosRect return as can't find layoutArray pos = ");
            sbLIZ.append(i);
            sbLIZ.append(" micCount = ");
            Layout layoutLIZJ = this.LIZIZ.LIZJ(false);
            if (layoutLIZJ != null) {
                i2 = layoutLIZJ.micCount;
            }
            sbLIZ.append(i2);
            sbLIZ.append('!');
            C1AZW.LJFF(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return new C1AYE(0, new Rect());
        }
        if (i != 0 || !layout.isFloatType() || this.LIZJ.LIZIZ() != 1 || ((layoutMaskConfigListByOnlineMicCount = layout.getLayoutMaskConfigListByOnlineMicCount(LIZJ())) != null && (map = layoutMaskConfigListByOnlineMicCount.indexLayoutArrayMap) != null && map.size() > 1)) {
            i2 = 0;
        }
        RectF locationRectF = layoutByPosAndSize.getLocationRectF();
        float radius = layoutByPosAndSize.getRadius();
        if (locationRectF == null) {
            C1AZW.LJFF(LJIIIIZZ(95), "createLayoutParamsByData return as  layoutArray is null", null, null);
            return new C1AYE(0, new Rect());
        }
        if (i2 != 0) {
            return new C1AYE(0, rect);
        }
        int iLIZ = C1283940jW4.LIZ(rect2.width() * radius);
        Rect rect3 = new Rect();
        rect3.left = C1283940jW4.LIZ(locationRectF.left * rect.width());
        rect3.top = C1283940jW4.LIZ(locationRectF.top * rect.height());
        rect3.right = C1283940jW4.LIZ(rect3.left + (locationRectF.width() * rect.width()));
        rect3.bottom = C1283940jW4.LIZ(rect3.top + (locationRectF.height() * rect.height()));
        C1AZW c1azw = C1AZW.LIZ;
        String strLJIIIIZZ2 = LJIIIIZZ(245);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createLayoutParamsByData newRect = ");
        sbLIZ2.append(rect3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c1azw.getClass();
        C1AZW.LIZ(strLJIIIIZZ2, strLIZIZ, null, null);
        return new C1AYE(iLIZ, rect3);
    }
}
