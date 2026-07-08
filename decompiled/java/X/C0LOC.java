package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigateGenerateFail$3", f = "NavigateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LOC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCDraft LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOC(Context context, AIGCDraft aIGCDraft, AwemeDraft awemeDraft, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCDraft;
        this.LLILLJJLI = context;
        this.LLILLL = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOC(this.LLILLJJLI, this.LL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0LNF c0lnf;
        InterfaceC1631620sYq<Context, CreativeModel, AIGCDraft, Unit> interfaceC1631620sYq;
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigateGenerateFail$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C547860LeC.LIZ.getClass();
        C546230LbZ c546230LbZLJ = C547860LeC.LIZIZ().LJ(this.LL.businessKey);
        Object obj2 = null;
        if (c546230LbZLJ != null && (c0lnf = (C0LNF) c546230LbZLJ.LJIIJJI.getValue()) != null && (interfaceC1631620sYq = c0lnf.LIZJ) != null) {
            Context context = this.LLILLJJLI;
            AwemeDraft awemeDraft = this.LLILLL;
            if (awemeDraft != null) {
                obj2 = awemeDraft.LIZ;
            }
            interfaceC1631620sYq.invoke(context, (CreativeModel) obj2, this.LL);
            obj2 = Unit.LIZ;
        }
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateGenerateFail$3");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
