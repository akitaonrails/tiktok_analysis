package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotTemplateInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901500ZYe extends FrameLayout {
    public Function1<? super C0ZTS, Unit> LL;
    public C0ZQ8 LLILLJJLI;
    public final C0ZYW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    private final C901550ZYj getAddingPhotoLoadingStyle() {
        return (C901550ZYj) this.LLIZ.getValue();
    }

    private final C901530ZYh getFinishStyle() {
        return (C901530ZYh) this.LLILZIL.getValue();
    }

    private final C901560ZYk getGeneratingStyle() {
        return (C901560ZYk) this.LLILZLL.getValue();
    }

    private final C901540ZYi getProgressStyle() {
        return (C901540ZYi) this.LLILZ.getValue();
    }

    public final C0ZQ8 getCurrentStyle() {
        return this.LLILLJJLI;
    }

    public final Function1<C0ZTS, Unit> getOnActionCallback() {
        return this.LL;
    }

    public final void LIZ(InterfaceC901580ZYm interfaceC901580ZYm) {
        C0ZYW c0zyw = this.LLILLL;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0zyw, null);
        c0zyw.removeAllViews();
        this.LLILLL.addView(interfaceC901580ZYm.getView());
    }

    public final void LIZJ(int i) {
        int i2;
        while (getChildCount() - 1 < i) {
            addView(new C0ZYW(getContext()));
        }
        while (getChildCount() - 1 > i) {
            int childCount = getChildCount() - 1;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeViewAt(childCount);
        }
        int childCount2 = getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                if (i3 % 2 == 0) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                C786410Ut5.Ab(childAt, i2 * 4.0f * ((i3 + 1) / 2));
                childAt.setElevation((getChildCount() - i3) * 4.0f);
            }
        }
    }

    public final void setCurrentStyle(C0ZQ8 c0zq8) {
        this.LLILLJJLI = c0zq8;
    }

    public final void setOnActionCallback(Function1<? super C0ZTS, Unit> function1) {
        this.LL = function1;
    }

    public C901500ZYe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0ZYW c0zyw = new C0ZYW(context);
        this.LLILLL = c0zyw;
        addView(c0zyw);
        setClipChildren(false);
        setClipToPadding(false);
        new Object() { // from class: X.0ZYl
        };
        this.LLILZ = C452501pT.LIZIZ(new AwS415S0200000_14(context, this, 119));
        this.LLILZIL = C452501pT.LIZIZ(new AwS415S0200000_14(context, this, 117));
        this.LLILZLL = C452501pT.LIZIZ(new AwS415S0200000_14(context, this, 118));
        this.LLIZ = C452501pT.LIZIZ(new AwS415S0200000_14(context, this, 116));
    }

    public final void LIZIZ(boolean z, AIGroupShotCardTemplate aIGroupShotCardTemplate, AwS558S0100000_14 awS558S0100000_14) {
        if (z) {
            LIZJ(Math.min(aIGroupShotCardTemplate.userInfo.size() + 1, 5) - 1);
            C901550ZYj addingPhotoLoadingStyle = getAddingPhotoLoadingStyle();
            LIZ(addingPhotoLoadingStyle);
            C0ZQ9 c0zq9 = C0ZQ9.LIZ;
            this.LLILLJJLI = c0zq9;
            addingPhotoLoadingStyle.LIZ(c0zq9);
            return;
        }
        switch (C2241521CoI.LIZ[aIGroupShotCardTemplate.status.ordinal()]) {
            case 1:
                LIZJ(Math.min(aIGroupShotCardTemplate.userInfo.size() + 1, 5) - 1);
                if (aIGroupShotCardTemplate.userInfo.size() == aIGroupShotCardTemplate.templateInfo.participantCount) {
                    C901560ZYk generatingStyle = getGeneratingStyle();
                    LIZ(generatingStyle);
                    C0ZQA c0zqa = C0ZQA.LIZ;
                    this.LLILLJJLI = c0zqa;
                    generatingStyle.LIZ(c0zqa);
                    return;
                }
                C901540ZYi progressStyle = getProgressStyle();
                LIZ(progressStyle);
                List<AIGroupShotUserInfoComponent> list = aIGroupShotCardTemplate.userInfo;
                AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent = aIGroupShotCardTemplate.templateInfo;
                C901510ZYf c901510ZYf = new C901510ZYf(list, aIGroupShotTemplateInfoComponent.participantCount, aIGroupShotCardTemplate.taskId, aIGroupShotTemplateInfoComponent.templateId);
                this.LLILLJJLI = c901510ZYf;
                progressStyle.LIZ(c901510ZYf);
                return;
            case 2:
                LIZJ(0);
                C901530ZYh finishStyle = getFinishStyle();
                LIZ(finishStyle);
                C901520ZYg c901520ZYg = new C901520ZYg(aIGroupShotCardTemplate.results, awS558S0100000_14);
                this.LLILLJJLI = c901520ZYg;
                finishStyle.LIZ(c901520ZYg);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                C337180DJs.LIZ(this);
                return;
            default:
                throw new C1954807lC();
        }
    }
}
