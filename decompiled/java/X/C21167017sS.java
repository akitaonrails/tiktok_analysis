package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatDraftComponent$saveDraft$2", f = "AiChatDraftComponent.kt", l = {77}, m = "invokeSuspend")
public final class C21167017sS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21171417tA LLILLJJLI;
    public final /* synthetic */ C21167417sW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21167017sS(C21171417tA c21171417tA, C21167417sW c21167417sW, InterfaceC1364105Vn<? super C21167017sS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21171417tA;
        this.LLILLL = c21167417sW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21167017sS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatDraftComponent@3694.saveDraft$2");
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
            C21167117sT c21167117sT = new C21167117sT(this.LLILLJJLI, C2286608xc.LJFF(System.currentTimeMillis()));
            C21167217sU c21167217sUH2 = this.LLILLL.H2();
            this.LL = 1;
            Object objLJIILIIL = c21167217sUH2.LIZ.LJIILIIL(c21167117sT.LIZ(), this);
            if (objLJIILIIL != C099R.LJFF()) {
                objLJIILIIL = Unit.LIZ;
            }
            if (objLJIILIIL == objLJFF) {
                C1C7U.LIZIZ("AiChatDraftComponent@3694.saveDraft$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatDraftComponent@3694.saveDraft$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
