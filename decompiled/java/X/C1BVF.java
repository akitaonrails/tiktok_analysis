package X;

import com.ss.android.ugc.aweme.account.experiment.prompt.ShowPromptToConfirmDynamicDataExperiment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS31S1101000_34;

/* JADX INFO: renamed from: X.1BVF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVF extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ShowPromptToConfirmDynamicDataExperiment.MetaData LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1BVI LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C19EG LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BVF(String str, ShowPromptToConfirmDynamicDataExperiment.MetaData metaData, String str2, C1BVI c1bvi, int i, C19EG c19eg) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = metaData;
        this.LLILLL = str2;
        this.LLILZ = c1bvi;
        this.LLILZIL = i;
        this.LLILZLL = c19eg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        C1BVD c1bvd = C1BVD.LIZ;
        String str = this.LL;
        c1bvd.getClass();
        if (C1BVD.LIZ(str)) {
            c1397620mTQ2.LIZJ(0, this.LLILLJJLI.verifyEmailPhonePopupStrings.autoConfirmPopupConfirmPhone, new AwS31S1101000_34(this.LLILLL, this.LLILZ, this.LLILZIL, 0));
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI.verifyEmailPhonePopupStrings.nonAutoConfirmPopupNotnowPhone, new AwS31S1101000_34(this.LLILLL, this.LLILZ, this.LLILZIL, 1));
        } else {
            c1397620mTQ2.LIZJ(0, this.LLILLJJLI.verifyEmailPhonePopupStrings.nonAutoConfirmPopupConfirmPhone, new AwS31S1101000_34(this.LLILLL, this.LLILZ, this.LLILZIL, 2));
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI.verifyEmailPhonePopupStrings.autoConfirmPopupUpdateEmail, new C1BVG(this.LLILZLL, this.LLILLL, this.LLILZIL, this.LLILZ));
        }
        return Unit.LIZ;
    }
}
