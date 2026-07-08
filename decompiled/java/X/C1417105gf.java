package X;

import com.ss.android.ugc.aweme.compliance.audiencecontrol.creator.AudienceControlViewModel;

/* JADX INFO: renamed from: X.05gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.audiencecontrol.creator.AudienceControlViewModel", f = "AudienceControlViewModel.kt", l = {21}, m = "updateSettings-gIAlu-s")
public final class C1417105gf extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AudienceControlViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417105gf(AudienceControlViewModel audienceControlViewModel, InterfaceC1364105Vn<? super C1417105gf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = audienceControlViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudienceControlViewModel@a86e.updateSettings$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(false, this);
        if (objVQ2 == C099R.LJFF()) {
            C1C7U.LIZIZ("AudienceControlViewModel@a86e.updateSettings$1");
            return objVQ2;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objVQ2);
        C1C7U.LIZIZ("AudienceControlViewModel@a86e.updateSettings$1");
        return c189200o6M1boximpl;
    }
}
