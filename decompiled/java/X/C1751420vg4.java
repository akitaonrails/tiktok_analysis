package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Card;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShopPromotionData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.settings.EcomStoreFgYkModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751420vg4 extends AbstractC1751430vg5 implements Function1<Long, Unit> {
    public final SeaPdpViewModel LL;
    public final SeaPdpViewModel LLILLJJLI;
    public boolean LLILLL;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        long jLongValue = l.longValue();
        if (jLongValue <= 0) {
            C786410Ut5.LJZL(0, (LinearLayout) this.itemView.findViewById(R.id.xw6));
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zwo), 8);
            ((TextView) this.itemView.findViewById(R.id.zq1)).setText("00");
            ((TextView) this.itemView.findViewById(R.id.zxr)).setText("00");
            ((TextView) this.itemView.findViewById(R.id.tv_second)).setText("00");
        } else {
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = 60;
            long j3 = ((jLongValue / j) / j2) / j2;
            long j4 = j3 / ((long) 24);
            if (j4 >= 1) {
                C786410Ut5.LJZL(8, (LinearLayout) this.itemView.findViewById(R.id.xw6));
                C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zwo), 0);
                ((TextView) this.itemView.findViewById(R.id.zwo)).setText(this.itemView.getContext().getResources().getQuantityString(2131755289, (int) j4, Long.valueOf(j4)));
            } else {
                long j5 = jLongValue - (((j3 * j) * j2) * j2);
                long j6 = ((j5 / j) / j2) % j2;
                long j7 = ((j5 - ((j6 * j) * j2)) / j) % j2;
                C786410Ut5.LJZL(0, (LinearLayout) this.itemView.findViewById(R.id.xw6));
                C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.zwo), 8);
                TextView textView = (TextView) this.itemView.findViewById(R.id.zq1);
                if (j3 < 10) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('0');
                    sbLIZ.append(j3);
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strValueOf = String.valueOf(j3);
                }
                textView.setText(strValueOf);
                TextView textView2 = (TextView) this.itemView.findViewById(R.id.zxr);
                if (j6 < 10) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('0');
                    sbLIZ2.append(j6);
                    strValueOf2 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strValueOf2 = String.valueOf(j6);
                }
                textView2.setText(strValueOf2);
                TextView textView3 = (TextView) this.itemView.findViewById(R.id.tv_second);
                if (j7 < 10) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('0');
                    sbLIZ3.append(j7);
                    strValueOf3 = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    strValueOf3 = String.valueOf(j7);
                }
                textView3.setText(strValueOf3);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1751420vg4(ViewGroup viewGroup, SeaPdpViewModel seaPdpViewModel) {
        final Context context = viewGroup.getContext();
        super(new FrameLayout(context) { // from class: X.0vg3
            public final Feed getData() {
                return null;
            }

            {
                super(context, null, 0);
                C1755600vmo.LIZ.getClass();
                View viewLIZ = C1755600vmo.LIZ(R.layout.axl, context, this, false, true);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C0H9H.LIZ(108), (int) C0H9H.LIZ(135));
                layoutParams.setMarginEnd((int) C0H9H.LIZ(8));
                addView(viewLIZ, layoutParams);
            }
        });
        this.LL = seaPdpViewModel;
        this.LLILLJJLI = seaPdpViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1751430vg5
    public final void I5(Feed feed, int i) {
        PDPShopPromotionData pDPShopPromotionData;
        FlashSale flashSale;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Card card = feed.card;
        if (card == null || (pDPShopPromotionData = card.pdpShopPromotionData) == null || (flashSale = pDPShopPromotionData.flashSaleInfo) == null) {
            return;
        }
        ((TextView) this.itemView.findViewById(R.id.title)).setText(flashSale.title);
        ((TuxIconView) this.itemView.findViewById(R.id.jxe)).setTintColorRes(R.attr.gh);
        ((TuxTextView) this.itemView.findViewById(R.id.title)).setTextColorRes(R.attr.gh);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.gf);
        C958103op.LIZ.getClass();
        c384050F3z.LIZLLL = Integer.valueOf(C958103op.LJIIIZ);
        c384050F3z.LJFF = Integer.valueOf(R.attr.gg);
        c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZ(8));
        this.itemView.findViewById(R.id.ic3).setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        String str = flashSale.startTime;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            String str2 = flashSale.endTime;
            if (str2 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str2)) != null) {
                long jLongValue2 = lLJIILIIL2.longValue();
                if (jLongValue <= jLongValue2) {
                    String str3 = flashSale.activityId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    HashMap<String, C1703050uQ3> map = C1703050uQ3.LJIIJ;
                    C1703050uQ3 c1703050uQ3 = map.get(str3);
                    if (c1703050uQ3 == null) {
                        c1703050uQ3 = new C1703050uQ3(str3);
                        map.put(str3, c1703050uQ3);
                    }
                    C1703050uQ3 c1703050uQ32 = c1703050uQ3;
                    if (!((ArrayList) c1703050uQ32.LJI).contains(this)) {
                        ((ArrayList) c1703050uQ32.LJI).add(this);
                    }
                    VoucherCountdown voucherCountdown = new VoucherCountdown(0, jLongValue, jLongValue2, null, false, null, null);
                    c1703050uQ32.LIZJ = true;
                    C23250099c.LIZLLL(c1703050uQ32.LJIIIZ, null, null, new C1703040uQ2(c1703050uQ32, voucherCountdown, null), 3);
                    if (!((EcomStoreFgYkModel) C1751450vg7.LIZIZ.getValue()).getDisableList().contains("fix_pdp_shop_leak_revert")) {
                        ((ArrayList) this.LL.LLLLZLLLI).add(new AwS427S0200000_26(c1703050uQ32, this, 101));
                    }
                }
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.gm, this.itemView.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            gradientDrawable.setColor(iIntValue);
            gradientDrawable.setStroke((int) C0H9H.LIZ(1), iIntValue, C0H9H.LIZ(2), C0H9H.LIZ(4));
        }
        gradientDrawable.setShape(2);
        this.itemView.findViewById(R.id.fzj).setBackground(gradientDrawable);
        for (View view : C1697810uHb.LJIIJJI(this.itemView.findViewById(R.id.zq1), this.itemView.findViewById(R.id.zxr), this.itemView.findViewById(R.id.tv_second))) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C0H9H.LIZ(4));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            view.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        for (View view2 : C1697810uHb.LJIIJJI(this.itemView.findViewById(R.id.g3d), this.itemView.findViewById(R.id.g3e), this.itemView.findViewById(R.id.g3f), this.itemView.findViewById(R.id.g3g))) {
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZJ = Float.valueOf(C0H9H.LIZ(2));
            c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a00);
            view2.setBackground(c384050F3z3.LIZ(this.itemView.getContext()));
        }
        C786410Ut5.I7(new AjS44S0200000_26(this, pDPShopPromotionData, 53), this.itemView);
        if (!this.LLILLL) {
            this.LLILLL = true;
            if (this.LLILLJJLI.LLJLIL != null) {
                new AwS570S0100000_26(this, 1607).invoke();
            }
            if (this.LLILLJJLI.LLJLIL != null) {
                new AwS570S0100000_26(this, 1608).invoke();
            }
        }
    }
}
