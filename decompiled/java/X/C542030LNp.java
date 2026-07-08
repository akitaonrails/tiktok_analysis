package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetDraftDetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl$checkDraftAndCameoPermissions$2$draftDeferred$1", f = "AITaskServiceImpl.kt", l = {203}, m = "invokeSuspend")
public final class C542030LNp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GetDraftDetailResponse>, Object> {
    public int LL;
    public final /* synthetic */ AITaskServiceImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542030LNp(AITaskServiceImpl aITaskServiceImpl, String str, InterfaceC1364105Vn<? super C542030LNp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aITaskServiceImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542030LNp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$2$draftDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AITaskServiceImpl aITaskServiceImpl = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = aITaskServiceImpl.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$2$draftDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$2$draftDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GetDraftDetailResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
