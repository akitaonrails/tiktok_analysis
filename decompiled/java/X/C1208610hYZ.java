package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208610hYZ extends ClickableSpan {
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
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C1208610hYZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C1208610hYZ c1208610hYZ, View view) {
        Context context = ((MyMomentsMainElementsAssem) c1208610hYZ.l0).getContext();
        if (context != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_anchor_campaign_rule&section=rewards");
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public static final void onClick$1(C1208610hYZ c1208610hYZ, View view) {
        ((Function0) c1208610hYZ.l0).invoke();
    }

    public static final void updateDrawState$0(C1208610hYZ c1208610hYZ, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C1180060goW.LJII("#FFFFFFFF"));
        textPaint.setUnderlineText(true);
    }

    public static final void updateDrawState$1(C1208610hYZ c1208610hYZ, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
