package X;

import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModuleSubItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03HV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HV extends AbstractC2172971A2l<PromotionCouponModuleSubItem, RecyclerView.ViewHolder> {
    public Integer LLILLJJLI;
    public final /* synthetic */ PlatformDiscountsCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03HV(PlatformDiscountsCell platformDiscountsCell) {
        super(new AbstractC339510DSr<PromotionCouponModuleSubItem>() { // from class: X.039Z
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(PromotionCouponModuleSubItem promotionCouponModuleSubItem, PromotionCouponModuleSubItem promotionCouponModuleSubItem2) {
                return Intrinsics.LJFF(promotionCouponModuleSubItem, promotionCouponModuleSubItem2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(PromotionCouponModuleSubItem promotionCouponModuleSubItem, PromotionCouponModuleSubItem promotionCouponModuleSubItem2) {
                return Intrinsics.LJFF(PromotionCouponModuleSubItem.class, PromotionCouponModuleSubItem.class);
            }
        });
        this.LLILLL = platformDiscountsCell;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Integer num = this.LLILLJJLI;
        if (num != null && num.intValue() == 1) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Pair pair;
        ViewGroup viewGroup;
        String color;
        Object obj;
        Object obj2;
        PromotionCouponModuleSubItem promotionCouponModuleSubItemLLLFZ = LLLFZ(i);
        boolean z = viewHolder instanceof C03HX;
        Double dValueOf = Double.valueOf(0.5d);
        if (z) {
            C03HX c03hx = (C03HX) viewHolder;
            c03hx.LL.LJJJJJ(C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
            C03C8.LIZJ(c03hx.LLILLJJLI, promotionCouponModuleSubItemLLLFZ.title, "coupon_sub_text", null);
            C03C8.LIZJ(c03hx.LLILLL, promotionCouponModuleSubItemLLLFZ.discountText, "coupon_sub_text", null);
            HandlerHook.viewPost(c03hx.LLILLL, new ARunnableS101S0100000_1(c03hx, 6));
            RadiusLayout radiusLayout = c03hx.LLILZ;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{-9155551, -12507637});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            radiusLayout.setBackground(gradientDrawable);
            TuxTextView tuxTextView = c03hx.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('x');
            sbLIZ.append(promotionCouponModuleSubItemLLLFZ.couponCount);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!(viewHolder instanceof C03HW)) {
            return;
        }
        C03HW c03hw = (C03HW) viewHolder;
        c03hw.LL.LJJJJJ(C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
        C03C8.LIZJ(c03hw.LLILLJJLI, promotionCouponModuleSubItemLLLFZ.title, "coupon_sub_text", null);
        C03C8.LIZJ(c03hw.LLILLL, promotionCouponModuleSubItemLLLFZ.discountText, "coupon_sub_text", null);
        ECRichText eCRichText = promotionCouponModuleSubItemLLLFZ.badgeText;
        CommonColor commonColor = promotionCouponModuleSubItemLLLFZ.badgeBackgroundColor;
        int iIntValue = 0;
        if (eCRichText != null && commonColor != null) {
            RadiusLayout radiusLayout2 = c03hw.LLILZ;
            TuxTextView tuxTextView2 = c03hw.LLILZIL;
            if (radiusLayout2 != null && tuxTextView2 != null) {
                pair = new Pair(radiusLayout2, tuxTextView2);
            } else {
                Context context = c03hw.itemView.getContext();
                TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
                tuxTextView3.setId(View.generateViewId());
                C786410Ut5.R6(tuxTextView3, new ViewGroup.LayoutParams(-2, -2));
                tuxTextView3.setGravity(17);
                tuxTextView3.setMaxLines(1);
                tuxTextView3.setSingleLine(true);
                tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView3.setTuxFont(81);
                RadiusLayout radiusLayout3 = new RadiusLayout(context, null, 6);
                radiusLayout3.setId(View.generateViewId());
                C19ME c19me = new C19ME(-2, -2);
                c19me.endToEnd = 0;
                c19me.topToTop = 0;
                C786410Ut5.b7(radiusLayout3, c19me);
                C786410Ut5.LLZZ(radiusLayout3, 8);
                radiusLayout3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
                radiusLayout3.addView(tuxTextView3);
                View view = c03hw.itemView;
                if ((view instanceof ConstraintLayout) && (viewGroup = (ViewGroup) view) != null) {
                    viewGroup.addView(radiusLayout3);
                }
                c03hw.LLILZ = radiusLayout3;
                c03hw.LLILZIL = tuxTextView3;
                pair = new Pair(radiusLayout3, tuxTextView3);
            }
            RadiusLayout radiusLayout4 = (RadiusLayout) pair.getFirst();
            TextView textView = (TextView) pair.getSecond();
            C786410Ut5.LJLLLLLL(0, radiusLayout4);
            C03C8.LIZJ(textView, eCRichText, "coupon_sub_text", null);
            radiusLayout4.LIZ(0.0f, C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), 0.0f);
            PlatformDiscountsCell platformDiscountsCell = this.LLILLL;
            Context context2 = c03hw.itemView.getContext();
            platformDiscountsCell.getClass();
            if (C960203pA.LIZIZ(context2)) {
                color = commonColor.getDarkColor();
            } else {
                color = commonColor.getColor();
            }
            if (color != null && !a0.LJJJIL(color)) {
                try {
                    boolean zLJJIIJZLJL = u.LJJIIJZLJL(color, "#", false);
                    String strLIZIZ = color;
                    if (!zLJJIIJZLJL) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('#');
                        sbLIZ2.append(color);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    C189200o6.m2constructorimpl(strLIZIZ);
                    obj = strLIZIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                if (C189200o6.m8isSuccessimpl(obj)) {
                    try {
                        Integer numValueOf = Integer.valueOf(Color.parseColor((String) obj));
                        C189200o6.m2constructorimpl(numValueOf);
                        obj2 = numValueOf;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C098200Yq c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        obj2 = c098200Yq2;
                    }
                } else {
                    C189200o6.m2constructorimpl(obj);
                    obj2 = obj;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj2);
                Object obj3 = obj2;
                if (zM7isFailureimpl) {
                    obj3 = 0;
                }
                iIntValue = ((Number) obj3).intValue();
            }
            radiusLayout4.setBackgroundColor(iIntValue);
            return;
        }
        RadiusLayout radiusLayout5 = c03hw.LLILZ;
        if (radiusLayout5 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, radiusLayout5);
        radiusLayout5.setBackgroundColor(0);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c03hx;
        if (i == 1) {
            Context context = viewGroup.getContext();
            int iGenerateViewId = View.generateViewId();
            int iGenerateViewId2 = View.generateViewId();
            ConstraintLayout constraintLayout = new ConstraintLayout(context);
            C786410Ut5.m6(constraintLayout, new RecyclerView.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(114)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74))));
            C0FJI c0fji = new C0FJI(context, null, 6);
            c0fji.setId(View.generateViewId());
            C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(114)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74)));
            c19me.startToStart = 0;
            c19me.topToTop = 0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0fji);
            c0fji.setLayoutParams(c19me);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setId(iGenerateViewId);
            C19ME c19me2 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(114)), -2);
            c19me2.startToStart = 0;
            c19me2.endToEnd = 0;
            c19me2.topToTop = 0;
            c19me2.bottomToTop = iGenerateViewId2;
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c19me2.verticalChainStyle = 2;
            C786410Ut5.R6(tuxTextView, c19me2);
            tuxTextView.setGravity(17);
            tuxTextView.setMaxLines(1);
            tuxTextView.setSingleLine(true);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setTuxFont(72);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0);
            TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
            tuxTextView2.setId(iGenerateViewId2);
            C19ME c19me3 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(114)), -2);
            c19me3.startToStart = 0;
            c19me3.endToEnd = 0;
            c19me3.topToBottom = iGenerateViewId;
            c19me3.bottomToBottom = 0;
            C786410Ut5.R6(tuxTextView2, c19me3);
            tuxTextView2.setGravity(17);
            tuxTextView2.setMaxLines(2);
            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView2.setTuxFont(52);
            tuxTextView2.setTextColorRes(R.attr.a1j);
            tuxTextView2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0);
            constraintLayout.addView(c0fji);
            constraintLayout.addView(tuxTextView);
            constraintLayout.addView(tuxTextView2);
            c03hx = new C03HW(constraintLayout, c0fji, tuxTextView, tuxTextView2);
        } else {
            c03hx = new C03HX(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.alc, viewGroup, false));
        }
        try {
            View view = c03hx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03hx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03hx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    e = e;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c03hx.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03hx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03hx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C2081408Dk.LIZ(e3);
            C2344809Gs.LIZ(e3);
        }
        C20612085q.LIZ = c03hx.getClass().getName();
        return c03hx;
    }
}
