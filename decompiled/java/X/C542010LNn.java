package X;

import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl$checkDraftAndCameoPermissions$2$cameoDeferred$1", f = "AITaskServiceImpl.kt", l = {206}, m = "invokeSuspend")
public final class C542010LNn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MentionCheckResult>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542010LNn(List<String> list, InterfaceC1364105Vn<? super C542010LNn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542010LNn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$2$cameoDeferred$1");
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
            C546890Lcd.LIZ.getClass();
            MentionService mentionServiceLIZJ = C546890Lcd.LIZJ();
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = mentionServiceLIZJ.LIZJ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$2$cameoDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AITaskServiceImpl@999e.checkDraftAndCameoPermissions$2$cameoDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MentionCheckResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
