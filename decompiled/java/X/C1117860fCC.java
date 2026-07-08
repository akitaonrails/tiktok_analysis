package X;

import Y.ACListenerS86S1100000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fCC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117860fCC extends ConstraintLayout implements C0T8B {
    public final C1117870fCD LL;
    public final C16F5 LLILLJJLI;
    public final ImageView LLILLL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public final void setCampaignPageUrl(String str) {
        if (str != null && (!a0.LJJJIL(str))) {
            C786410Ut5.B8(this, new ACListenerS86S1100000_17(this, str, 0));
        } else {
            C786410Ut5.B8(this, null);
            setClickable(false);
        }
    }

    public C1117860fCC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1117860fCC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hxr, this);
        this.LL = (C1117870fCD) findViewById(R.id.q66);
        this.LLILLJJLI = (C16F5) findViewById(R.id.z3g);
        this.LLILLL = (ImageView) findViewById(R.id.l6f);
        findViewById(R.id.l65);
    }

    public final boolean e0(GiftCampaignProgress giftCampaignProgress, long j, Long l) {
        boolean z;
        List urls;
        C249200xm.LIZ.getClass();
        GiftCampaignProgress.CampaignProgress campaignProgressLIZIZ = C249200xm.LIZIZ(giftCampaignProgress, j, l);
        if (campaignProgressLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateProgress: no matching campaign for giftId=");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("CampaignProgressPanel", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        GiftCampaignProgress.ConditionProgress conditionProgressLIZJ = C249200xm.LIZJ(campaignProgressLIZIZ, j);
        if (conditionProgressLIZJ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateProgress: no matching condition for giftId=");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("CampaignProgressPanel", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        long j2 = conditionProgressLIZJ.targetValue;
        if (j2 > 0 && conditionProgressLIZJ.currentValue >= j2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LL.clearAnimation();
            C500260Jjc.LJIILIIL(this.LL);
            this.LL.setLevelProgress(0.0f);
            this.LLILLJJLI.setTextColor(C497740JfY.LIZLLL(R.attr.c9i, getContext()));
            C1119920fFW.LJI(500, this.LLILLJJLI);
            this.LLILLJJLI.setText(C497740JfY.LJIJI(2131852612));
        } else {
            this.LLILLJJLI.setTextColor(C497740JfY.LIZLLL(R.attr.c9k, getContext()));
            C1119920fFW.LJI(400, this.LLILLJJLI);
            if (conditionProgressLIZJ.targetValue > 0 && conditionProgressLIZJ.currentValue >= 0) {
                C500260Jjc.LLFFF(this.LL);
                this.LL.setMaxProgress(conditionProgressLIZJ.targetValue);
                C1117870fCD c1117870fCD = this.LL;
                c1117870fCD.LIZ(c1117870fCD.LLILZLL, conditionProgressLIZJ.currentValue, null);
            } else {
                C500260Jjc.LJIILIIL(this.LL);
            }
            Text text = conditionProgressLIZJ.conditionText;
            C16F5 c16f5 = this.LLILLJJLI;
            C244400x0.LIZ.getClass();
            c16f5.setText(C244400x0.LIZ(text));
        }
        ImageModel imageModel = campaignProgressLIZIZ.giftIconMap.get(Long.valueOf(j));
        if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
            ImageView imageView = this.LLILLL;
            C1117830fC9.LIZLLL(imageView, imageModel, imageView.getWidth(), this.LLILLL.getHeight());
            return true;
        }
        this.LLILLL.setImageDrawable(null);
        return true;
    }
}
