package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Insets;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.PadMatchLayoutMeasureMarginBottomSetting;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.PadMatchLayoutMeasureMarginTopSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkLinkMicLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.SmallScreenAudienceCoHostAdaptationSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AFE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFE {
    public final C1AXO LIZ;
    public final EnumC945310aht LIZIZ;
    public EnumC1779420wPE LIZJ = EnumC1779420wPE.NONE;
    public int LIZLLL;
    public volatile EnumC921070a4n LJ;

    public static String LJI(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_LayoutMeasureHelper_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Rect LJIIIIZZ(ViewGroup.LayoutParams layoutParams) {
        Rect rect = new Rect();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.leftMargin;
        rect.left = i;
        int i2 = marginLayoutParams.topMargin;
        rect.top = i2;
        rect.right = i + layoutParams.width;
        rect.bottom = i2 + layoutParams.height;
        return rect;
    }

    public final boolean LJFF(String str) {
        boolean z;
        if (!Intrinsics.LJFF(str, "2003") || this.LIZJ != EnumC1779420wPE.AUDIENCE || !SmallScreenAudienceCoHostAdaptationSetting.INSTANCE.isEnable()) {
            return false;
        }
        int iLJFF = C14KS.LJFF();
        int iLIZLLL = C14KS.LIZLLL();
        if (iLIZLLL / iLJFF < 1.7777777777777777d) {
            z = true;
        } else {
            z = false;
        }
        String strLJI = LJI(290);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSmallScreenDevice  ret=");
        sbLIZ.append(z);
        sbLIZ.append("  w=");
        sbLIZ.append(iLJFF);
        sbLIZ.append(" h=");
        sbLIZ.append(iLIZLLL);
        C1AZW.LJIIJ(12, strLJI, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (!z) {
            return false;
        }
        return true;
    }

    public final void LJII(int i) {
        String strLJI = LJI(74);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateOffsetY offsetY:");
        sbLIZ.append(i);
        C1AZW.LJIIJ(12, strLJI, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZLLL = i;
    }

    public C1AFE(C1AXO c1axo, EnumC945310aht enumC945310aht) {
        this.LIZ = c1axo;
        this.LIZIZ = enumC945310aht;
    }

    public static Rect LIZ(Insets insets, C1AFF c1aff) {
        int iLIZ;
        int iLIZ2;
        Pair<Integer, Integer> pair;
        if (((Number) ListProtector.get(insets.insets, 0)).intValue() == 0) {
            iLIZ = 0;
        } else {
            iLIZ = C439101nJ.LIZ(((Number) ListProtector.get(insets.insets, 0)).intValue());
        }
        if (((Number) ListProtector.get(insets.insets, 1)).intValue() == 0) {
            iLIZ2 = 0;
        } else {
            iLIZ2 = C439101nJ.LIZ(((Number) ListProtector.get(insets.insets, 1)).intValue());
        }
        Rect rect = new Rect(iLIZ, iLIZ2 + c1aff.LJIIIZ, C439101nJ.LIZ(((Number) ListProtector.get(insets.insets, 2)).intValue()), C439101nJ.LIZ(((Number) ListProtector.get(insets.insets, 3)).intValue()));
        List<Float> list = insets.viewPercent;
        if (list != null && list.size() >= 4 && (pair = c1aff.LJ) != null) {
            float fFloatValue = ((Number) ListProtector.get(list, 0)).floatValue() * pair.getFirst().floatValue();
            float fFloatValue2 = ((Number) ListProtector.get(list, 1)).floatValue() * pair.getSecond().floatValue();
            float fFloatValue3 = ((Number) ListProtector.get(list, 2)).floatValue() * pair.getFirst().floatValue();
            float fFloatValue4 = ((Number) ListProtector.get(list, 3)).floatValue() * pair.getSecond().floatValue();
            rect.left += (int) fFloatValue;
            rect.right += (int) fFloatValue3;
            rect.top += (int) fFloatValue2;
            rect.bottom += (int) fFloatValue4;
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && C500260Jjc.LJJII(C497740JfY.LIZ)) {
            int i = rect.top;
            int i2 = rect.bottom;
            float value = PadMatchLayoutMeasureMarginTopSetting.INSTANCE.getValue();
            float value2 = PadMatchLayoutMeasureMarginBottomSetting.INSTANCE.getValue();
            if (value > 0.0f) {
                rect.top = (int) C497740JfY.LIZIZ(value);
            }
            if (value2 > 0.0f) {
                rect.bottom = (int) C497740JfY.LIZIZ(value2);
            }
            C20441214yg.LIZIZ("link_layer_sdk_LayoutMeasureHelper", "createMarginRect, srcTop=" + i + ", srcBottom:" + i2 + ", top=" + rect.top + ", bottom=" + rect.bottom);
        }
        return rect;
    }

    public final Rect LIZIZ(Insets insets, C1AFF c1aff) {
        int iIntValue;
        Rect rect = new Rect();
        Pair<Integer, Integer> pair = c1aff.LJ;
        if (pair == null) {
            C1AZW.LJFF(LJI(232), "getCommonLayoutLocation return as originalSize is null", null, null);
            return rect;
        }
        Rect rectLIZ = LIZ(insets, c1aff);
        if (this.LIZIZ == EnumC945310aht.LIVE_ROOM && ((Number) ListProtector.get(insets.insets, 1)).intValue() == 0 && ((Number) ListProtector.get(insets.insets, 3)).intValue() == 0 && Intrinsics.LJFF(insets.scaleType, "fill_height") && pair.getFirst().intValue() / pair.getSecond().floatValue() > insets.ratio) {
            rectLIZ.top = -c1aff.LJII.top;
        }
        int iIntValue2 = pair.getFirst().intValue();
        int i = rectLIZ.left;
        int i2 = iIntValue2 - (rectLIZ.right + i);
        rect.left = i;
        rect.right = i + i2;
        if (LiveSdkLinkMicLandscapeSetting.isEnable() && !C497740JfY.LJIL()) {
            iIntValue = pair.getSecond().intValue();
        } else {
            iIntValue = pair.getSecond().intValue() - (rectLIZ.top + rectLIZ.bottom);
        }
        int i3 = rectLIZ.top;
        rect.top = i3;
        rect.bottom = i3 + iIntValue;
        return rect;
    }

    public final ViewGroup.MarginLayoutParams LIZJ(ViewGroup viewGroup, Rect rect) {
        if (viewGroup instanceof ConstraintLayout) {
            C19ME c19me = new C19ME(rect.width(), rect.height());
            if (LiveSdkLinkMicLandscapeSetting.isEnable() && !C497740JfY.LJIL()) {
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = rect.top + this.LIZLLL;
                c19me.topToTop = 0;
                c19me.rightToRight = 0;
                c19me.leftToLeft = 0;
                return c19me;
            }
            ((ViewGroup.MarginLayoutParams) c19me).leftMargin = rect.left;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = rect.top + this.LIZLLL;
            c19me.topToTop = 0;
            c19me.leftToLeft = 0;
            return c19me;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.gravity = 51;
            layoutParams.leftMargin = rect.left;
            layoutParams.topMargin = rect.top;
            return layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(rect.width(), rect.height());
        marginLayoutParams.leftMargin = rect.left;
        marginLayoutParams.topMargin = rect.top;
        return marginLayoutParams;
    }

    public static Rect LJ(Rect rect, Rect rect2, Rect rect3) {
        Rect rect4 = new Rect();
        if (!rect.contains(rect2)) {
            rect4.left = Math.max(rect2.left, rect.left) - rect3.left;
            rect4.top = Math.max(rect2.top, rect.top) - rect3.top;
            rect4.right = Math.min(rect2.right, rect.right) - rect3.left;
            rect4.bottom = Math.min(rect2.bottom, rect.bottom) - rect3.top;
            return rect4;
        }
        int i = rect2.left - rect3.left;
        rect4.left = i;
        rect4.top = rect2.top - rect3.top;
        rect4.right = i + rect2.width();
        rect4.bottom = rect4.top + rect2.height();
        return rect4;
    }

    public static Rect LIZLLL(Pair pair, Rect rect, int i, Insets insets) {
        Rect rect2 = new Rect();
        Insets.Companion companion = Insets.Companion;
        if (companion.isContains(insets, i, 2)) {
            int i2 = rect.left;
            rect2.left = i2;
            rect2.right = i2 + ((Number) pair.getFirst()).intValue();
        } else if (companion.isContains(insets, i, 4)) {
            int iWidth = ((rect.width() - ((Number) pair.getFirst()).intValue()) / 2) + rect.left;
            rect2.left = iWidth;
            rect2.right = iWidth + ((Number) pair.getFirst()).intValue();
        } else if (companion.isContains(insets, i, 8)) {
            int i3 = rect.right;
            rect2.right = i3;
            rect2.left = i3 - ((Number) pair.getFirst()).intValue();
        } else {
            int i4 = rect.left;
            rect2.left = i4;
            rect2.right = i4 + ((Number) pair.getFirst()).intValue();
        }
        if (companion.isContains(insets, i, 32)) {
            int i5 = rect.top;
            rect2.top = i5;
            rect2.bottom = i5 + ((Number) pair.getSecond()).intValue();
            return rect2;
        }
        if (companion.isContains(insets, i, 64)) {
            int iHeight = ((rect.height() - ((Number) pair.getSecond()).intValue()) / 2) + rect.top;
            rect2.top = iHeight;
            rect2.bottom = iHeight + ((Number) pair.getSecond()).intValue();
            return rect2;
        }
        if (companion.isContains(insets, i, 128)) {
            int i6 = rect.bottom;
            rect2.bottom = i6;
            rect2.top = i6 - ((Number) pair.getSecond()).intValue();
            return rect2;
        }
        int i7 = rect.top;
        rect2.top = i7;
        rect2.bottom = i7 + ((Number) pair.getSecond()).intValue();
        return rect2;
    }
}
