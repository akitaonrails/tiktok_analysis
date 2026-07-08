package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.banner.SeaBannerPendantVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.mask.SeaPdpHeaderMaskPendantVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.textlabel.SeaTextLabelPendantVO;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764190w0f extends FrameLayout {
    public final InterfaceC665370Q7z LL;
    public final Map<String, AbstractC1764240w0k<?, ?>> LLILLJJLI;

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        ((LinkedHashMap) this.LLILLJJLI).clear();
    }

    public final Map<String, AbstractC1764240w0k<?, ?>> getCurrentPendantMap() {
        return this.LLILLJJLI;
    }

    public final InterfaceC665370Q7z getVScope() {
        return this.LL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v23, types: [VO, java.lang.Object] */
    public final void LIZ(List<C1068804Fy> list) {
        boolean zLJIILIIL;
        SeaPdpHeadFeatures seaPdpHeadFeatures;
        if (list != null) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            for (Object obj : C13LP.LLIIII(((LinkedHashMap) this.LLILLJJLI).keySet())) {
                if (!list.isEmpty()) {
                    Iterator<C1068804Fy> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LJIJJLI.LIZ, obj)) {
                            break;
                        }
                    }
                }
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) ((LinkedHashMap) this.LLILLJJLI).get(obj);
                if (abstractC1764240w0k != null) {
                    abstractC1764240w0k.LJIILL();
                    View view = abstractC1764240w0k.LL;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
                    removeView(view);
                    this.LLILLJJLI.remove(obj);
                }
            }
            final InterfaceC665370Q7z interfaceC665370Q7zLIZ = this.LL;
            if (interfaceC665370Q7zLIZ == null && (interfaceC665370Q7zLIZ = C1764650w1P.LIZ(this)) == null) {
                return;
            }
            for (C1068804Fy c1068804Fy : list) {
                if ((!Intrinsics.LJFF(c1068804Fy.LJIJJLI.LIZ, "selling_point_style") && ((seaPdpHeadFeatures = c1068804Fy.LJIL) == null || !Intrinsics.LJFF(seaPdpHeadFeatures.ignoreCache, Boolean.TRUE))) || !c1068804Fy.LJIJI.LIZ()) {
                    AbstractC1764240w0k<?, ?> c1764320w0s = (AbstractC1764240w0k) ((LinkedHashMap) this.LLILLJJLI).get(c1068804Fy.LJIJJLI.LIZ);
                    if (c1764320w0s == null) {
                        new Object() { // from class: X.0w1e
                        }.getClass();
                        if (Intrinsics.LJFF(c1068804Fy.LJIJJLI.LIZIZ, "Myna")) {
                            c1764320w0s = new C1764320w0s(this, interfaceC665370Q7zLIZ);
                        } else {
                            String str = c1068804Fy.LJIJJLI.LIZ;
                            switch (str.hashCode()) {
                                case -1878245228:
                                    if (str.equals("text_label_style")) {
                                        c1764320w0s = new AbstractC1764240w0k<TuxTextView, SeaTextLabelPendantVO>(this, interfaceC665370Q7zLIZ) { // from class: X.0w0o
                                            @Override // X.AbstractC1764240w0k
                                            public final FrameLayout.LayoutParams LJIIJJI() {
                                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) C0H9H.LIZ(20));
                                                layoutParams.gravity = 8388693;
                                                layoutParams.bottomMargin = (int) C0H9H.LIZ(44);
                                                layoutParams.rightMargin = (int) C0H9H.LIZ(16);
                                                return layoutParams;
                                            }

                                            @Override // X.AbstractC1764240w0k
                                            public final void LJIILJJIL() {
                                                TuxTextView tuxTextView = (TuxTextView) this.LL;
                                                tuxTextView.setTuxFont(91);
                                                tuxTextView.setTextColorRes(R.attr.a1j);
                                                tuxTextView.setBackgroundResource(R.drawable.b8v);
                                                float f = 8;
                                                float f2 = 2;
                                                tuxTextView.setPadding((int) C0H9H.LIZ(f), (int) C0H9H.LIZ(f2), (int) C0H9H.LIZ(f), (int) C0H9H.LIZ(f2));
                                                tuxTextView.setGravity(16);
                                            }

                                            @Override // X.AbstractC1764240w0k
                                            public final boolean LJIILIIL(SeaTextLabelPendantVO seaTextLabelPendantVO) {
                                                String str2 = seaTextLabelPendantVO.text;
                                                if (str2 != null) {
                                                    ((TextView) this.LL).setText(str2);
                                                    return true;
                                                }
                                                return false;
                                            }

                                            {
                                                TuxTextView tuxTextView = new TuxTextView(this.getContext(), null, 6, 0);
                                            }
                                        };
                                    }
                                    break;
                                case -951998707:
                                    if (str.equals("gradient_mask_style")) {
                                        c1764320w0s = new AbstractC1764240w0k<View, SeaPdpHeaderMaskPendantVO>(this, interfaceC665370Q7zLIZ) { // from class: X.0w0j
                                            @Override // X.AbstractC1764240w0k
                                            public final FrameLayout.LayoutParams LJIIJJI() {
                                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
                                                layoutParams.gravity = 80;
                                                return layoutParams;
                                            }

                                            @Override // X.AbstractC1764240w0k
                                            public final boolean LJIILIIL(SeaPdpHeaderMaskPendantVO seaPdpHeaderMaskPendantVO) {
                                                Integer numLIZ;
                                                int iIntValue;
                                                int iIntValue2;
                                                SeaPdpHeaderMaskPendantVO seaPdpHeaderMaskPendantVO2 = seaPdpHeaderMaskPendantVO;
                                                CustomColor customColor = seaPdpHeaderMaskPendantVO2.gradientTopColor;
                                                Integer numLIZ2 = null;
                                                if (customColor != null) {
                                                    numLIZ = C038L.LIZ(customColor, this.LL.getContext(), null);
                                                } else {
                                                    numLIZ = null;
                                                }
                                                CustomColor customColor2 = seaPdpHeaderMaskPendantVO2.gradientBottomColor;
                                                if (customColor2 != null) {
                                                    numLIZ2 = C038L.LIZ(customColor2, this.LL.getContext(), null);
                                                }
                                                int iIntValue3 = 0;
                                                if (numLIZ == null && numLIZ2 == null) {
                                                    return false;
                                                }
                                                Integer num = seaPdpHeaderMaskPendantVO2.height;
                                                if (num != null && num.intValue() > 0) {
                                                    Integer num2 = seaPdpHeaderMaskPendantVO2.height;
                                                    int height = this.LL.getHeight();
                                                    if (num2 == null || num2.intValue() != height) {
                                                        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(seaPdpHeaderMaskPendantVO2.height)), this.LL);
                                                    }
                                                }
                                                Drawable background = this.LL.getBackground();
                                                if (background instanceof GradientDrawable) {
                                                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                                                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                                                    int[] iArr = new int[2];
                                                    if (numLIZ != null) {
                                                        iIntValue2 = numLIZ.intValue();
                                                    } else {
                                                        iIntValue2 = 0;
                                                    }
                                                    iArr[0] = iIntValue2;
                                                    if (numLIZ2 != null) {
                                                        iIntValue3 = numLIZ2.intValue();
                                                    }
                                                    iArr[1] = iIntValue3;
                                                    gradientDrawable.setColors(iArr);
                                                    this.LL.setBackground(background);
                                                    return true;
                                                }
                                                T t = this.LL;
                                                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                                int[] iArr2 = new int[2];
                                                if (numLIZ != null) {
                                                    iIntValue = numLIZ.intValue();
                                                } else {
                                                    iIntValue = 0;
                                                }
                                                iArr2[0] = iIntValue;
                                                if (numLIZ2 != null) {
                                                    iIntValue3 = numLIZ2.intValue();
                                                }
                                                iArr2[1] = iIntValue3;
                                                t.setBackground(new GradientDrawable(orientation, iArr2));
                                                return true;
                                            }

                                            {
                                                View view2 = new View(this.getContext());
                                            }
                                        };
                                    }
                                    break;
                                case -1179693:
                                    if (str.equals("selling_point_style")) {
                                        c1764320w0s = new C1764020w0O(this, interfaceC665370Q7zLIZ);
                                    }
                                    break;
                                case 1017376478:
                                    if (str.equals("banner_style")) {
                                        c1764320w0s = new AbstractC1764240w0k<C1421960n6g, SeaBannerPendantVO>(this, interfaceC665370Q7zLIZ) { // from class: X.0w0N
                                            @Override // X.AbstractC1764240w0k
                                            public final FrameLayout.LayoutParams LJIIJJI() {
                                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                                layoutParams.gravity = 8388691;
                                                return layoutParams;
                                            }

                                            @Override // X.AbstractC1764240w0k
                                            public final boolean LJIILIIL(SeaBannerPendantVO seaBannerPendantVO) {
                                                SeaBannerPendantVO seaBannerPendantVO2 = seaBannerPendantVO;
                                                if (seaBannerPendantVO2.labels != null) {
                                                    ((C1421960n6g) this.LL).setLabels(seaBannerPendantVO2.labels);
                                                    return true;
                                                }
                                                ((C1421960n6g) this.LL).setLabels(null);
                                                return false;
                                            }

                                            {
                                                C1421960n6g c1421960n6g = new C1421960n6g(this.getContext(), null, 6);
                                            }
                                        };
                                    }
                                    break;
                                case 1948155015:
                                    if (str.equals("tab_style")) {
                                        c1764320w0s = new C1764250w0l(this, interfaceC665370Q7zLIZ);
                                    }
                                    break;
                            }
                        }
                        this.LLILLJJLI.put(c1068804Fy.LJIJJLI.LIZ, c1764320w0s);
                        c1764320w0s.LJIILJJIL();
                        getContext();
                        FrameLayout.LayoutParams layoutParamsLJIIJJI = c1764320w0s.LJIIJJI();
                        View view2 = c1764320w0s.LL;
                        if (layoutParamsLJIIJJI != null) {
                            addView(view2, layoutParamsLJIIJJI);
                        } else {
                            addView(view2);
                        }
                    }
                    c1764320w0s.LLILZ = c1068804Fy;
                    Object obj2 = c1068804Fy.LJIJJ;
                    if (obj2 != null) {
                        zLJIILIIL = c1764320w0s.LJIILIIL(obj2);
                    } else {
                        n nVar = c1068804Fy.LJIIZILJ;
                        if (nVar != null) {
                            Type genericSuperclass = c1764320w0s.getClass().getGenericSuperclass();
                            if (genericSuperclass instanceof ParameterizedType) {
                                ?? FromJson = GsonProtectorUtils.fromJson(C04DJ.LIZ, nVar, ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]);
                                if (FromJson != 0) {
                                    c1764320w0s.LLILZIL = FromJson;
                                    zLJIILIIL = c1764320w0s.LJIILIIL(FromJson);
                                }
                            }
                        }
                        View view3 = c1764320w0s.LL;
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view3);
                        removeView(view3);
                        this.LLILLJJLI.remove(c1068804Fy.LJIJJLI.LIZ);
                        c1764320w0s.LJIILL();
                    }
                    if (!zLJIILIIL) {
                        View view32 = c1764320w0s.LL;
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view32);
                        removeView(view32);
                        this.LLILLJJLI.remove(c1068804Fy.LJIJJLI.LIZ);
                        c1764320w0s.LJIILL();
                    }
                }
            }
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        ((LinkedHashMap) this.LLILLJJLI).clear();
        int visibility2 = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764190w0f(Context context, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        super(context, null, 0);
        interfaceC665370Q7z = (i & 8) != 0 ? null : interfaceC665370Q7z;
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = new LinkedHashMap();
    }
}
