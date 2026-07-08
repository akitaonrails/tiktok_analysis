package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.surveybutton.FeedBottomSurveyButtonComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C600080NgE extends C2217421BqW implements Function2<String, String, Boolean> {
    public C600080NgE(Object obj) {
        super(2, obj, FeedBottomSurveyButtonComponent.class, "onRuleTriggered", "onRuleTriggered(Ljava/lang/String;Ljava/lang/String;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, String str2) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        Aweme awemeLJIIIIZZ;
        Fragment fragment;
        LifecycleCoroutineScope lifecycleScope;
        String str3 = str2;
        FeedBottomSurveyButtonComponent feedBottomSurveyButtonComponent = (FeedBottomSurveyButtonComponent) this.receiver;
        feedBottomSurveyButtonComponent.getClass();
        if (!C1578630rBN.LJIIIZ(feedBottomSurveyButtonComponent) && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) feedBottomSurveyButtonComponent.LL.getValue()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null && C587470N2j.LIZ(awemeLJIIIIZZ) && (fragment = feedBottomSurveyButtonComponent.getPanelContext().LJ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C600060NgC(feedBottomSurveyButtonComponent, str3, null), 2);
        }
        return Boolean.FALSE;
    }
}
