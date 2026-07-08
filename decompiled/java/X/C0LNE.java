package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigateCloudDraftEdit$5", f = "NavigateServiceImpl.kt", l = {295}, m = "invokeSuspend")
public final class C0LNE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LLILLJJLI;
    public final /* synthetic */ C0LNF<Object> LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ AIGCDraft LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LNE(C259800zU<DialogC1389620mGW> c259800zU, C0LNF<Object> c0lnf, Context context, AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super C0LNE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c0lnf;
        this.LLILZ = context;
        this.LLILZIL = aIGCDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LNE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        InterfaceC1631620sYq<Context, AIGCDraft, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq;
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$5");
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
            DialogC1389620mGW dialogC1389620mGW = this.LLILLJJLI.element;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            C0LNF<Object> c0lnf = this.LLILLL;
            if (c0lnf != null && (interfaceC1631620sYq = c0lnf.LJ) != null) {
                Context context = this.LLILZ;
                AIGCDraft aIGCDraft = this.LLILZIL;
                this.LL = 1;
                if (interfaceC1631620sYq.invoke(context, aIGCDraft, this) == objLJFF) {
                    C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$5");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$5");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$5");
        return unit;
    }
}
