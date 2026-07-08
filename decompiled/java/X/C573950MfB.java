package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C573950MfB extends C2217421BqW implements Function1<C540340LHc, Unit> {
    public final /* synthetic */ C573930Mf9 LL;
    public final /* synthetic */ Function1<C540340LHc, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C573950MfB(C573930Mf9 c573930Mf9, Function1<? super C540340LHc, Unit> function1) {
        super(1, C1449605lu.class, "processSaveCallback", "saveCheckPoint$processSaveCallback(Lcom/ss/android/ugc/gamora/editor/draft/EditDraftComponent;Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/port/internal/draft/DraftSaveResultWrap;)V", 0);
        this.LL = c573930Mf9;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C540340LHc c540340LHc) {
        C573930Mf9.c3(this.LL, this.LLILLJJLI, c540340LHc);
        return Unit.LIZ;
    }
}
