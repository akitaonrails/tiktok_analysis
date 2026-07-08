package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LND, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigateCloudDraftEdit$2", f = "NavigateServiceImpl.kt", l = {266}, m = "invokeSuspend")
public final class C0LND extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LNF<Object> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AIGCDraft LLILZ;
    public final /* synthetic */ AwemeDraft LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LND(C0LNF<Object> c0lnf, Context context, AIGCDraft aIGCDraft, AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C0LND> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lnf;
        this.LLILLL = context;
        this.LLILZ = aIGCDraft;
        this.LLILZIL = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LND(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        InterfaceC1631620sYq<Context, AIGCDraft, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq;
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$2");
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
            C0LNF<Object> c0lnf = this.LLILLJJLI;
            unit = null;
            if (c0lnf != null) {
                InterfaceC1631620sYq<Context, AIGCDraft, Object, Unit> interfaceC1631620sYq2 = c0lnf.LIZLLL;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(this.LLILLL, this.LLILZ, this.LLILZIL);
                    unit = Unit.LIZ;
                } else if (c0lnf != null && (interfaceC1631620sYq = c0lnf.LJ) != null) {
                    Context context = this.LLILLL;
                    AIGCDraft aIGCDraft = this.LLILZ;
                    this.LL = 1;
                    if (interfaceC1631620sYq.invoke(context, aIGCDraft, this) == objLJFF) {
                        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$2");
                        return objLJFF;
                    }
                }
            }
            C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$2");
            return unit;
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
