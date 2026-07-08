package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04J8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J8 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 1:
                updateDrawState$0(this, textPaint);
                break;
            case 2:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C04J8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C04J8 c04j8, View view) {
        Function0 function0 = (Function0) c04j8.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$1(C04J8 c04j8, View view) {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C19EG c19eg = (C19EG) c04j8.l0;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ("https://support.tiktok.com/en/safety-hc/report-a-problem");
        c1537900q7g.getClass();
        new C1541950qED(c19eg, sparkContext).LIZIZ();
    }

    public static final void onClick$2(C04J8 c04j8, View view) {
        HashMap<String, Object> mapHi1;
        Map<String, Object> mapLIZ;
        String str;
        C817603Hi c817603Hi;
        String str2;
        C03O0 c03o0 = C03O0.LIZ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C038K) c04j8.l0).LLJJI;
        if (orderSubmitAssemViewModel != null) {
            mapHi1 = orderSubmitAssemViewModel.hi1(false);
            InsuranceInfo insuranceInfo = ((C038K) c04j8.l0).LLJILLL;
            if (insuranceInfo != null) {
                str2 = insuranceInfo.insuranceProductNameEn;
            } else {
                str2 = null;
            }
            mapHi1.put("insurance_name", String.valueOf(str2));
        } else {
            mapHi1 = null;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = ((C038K) c04j8.l0).LLJJI;
        if (orderSubmitAssemViewModel2 != null && (c817603Hi = orderSubmitAssemViewModel2.LLLZLZ) != null) {
            mapLIZ = c817603Hi.LIZ("c62882.d34562");
        } else {
            mapLIZ = null;
        }
        C03O0.LJJJJLL(c03o0, "learn_more", null, mapHi1, "order_submit", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mapLIZ, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -536870926, 8388607);
        InsuranceInfo insuranceInfo2 = ((C038K) c04j8.l0).LLJILLL;
        if (insuranceInfo2 != null && (str = insuranceInfo2.introduceUrl) != null && str.length() != 0) {
            SmartRouter.buildRoute(((C038K) c04j8.l0).getContext(), UriProtector.parse(str).toString()).open();
        }
    }

    public static final void onClick$3(C04J8 c04j8, View view) {
        Function0 function0 = (Function0) c04j8.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void updateDrawState$0(C04J8 c04j8, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(-16776961);
    }

    public static final void updateDrawState$1(C04J8 c04j8, TextPaint textPaint) {
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a1n, ((C038K) c04j8.l0).getContext());
        if (numLIZ != null) {
            textPaint.setColor(numLIZ.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
