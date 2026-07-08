package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.composition.SummaryCompositionTask", f = "SummaryCompositionTask.kt", l = {31, 58, BaseNotice.CREATOR}, m = "run")
public final class C539340LDg extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C539320LDe LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539340LDg(C539320LDe c539320LDe, InterfaceC1364105Vn<? super C539340LDg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c539320LDe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SummaryCompositionTask@31ac.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("SummaryCompositionTask@31ac.run$1");
        return objLJFF;
    }
}
