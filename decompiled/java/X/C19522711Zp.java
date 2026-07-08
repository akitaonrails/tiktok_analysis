package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPHandlerGroup$processItemGroup$job$1$1$1", f = "PPHandlerGroup.kt", l = {203}, m = "invokeSuspend")
public final class C19522711Zp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC19524211a4 LLILLJJLI;
    public final /* synthetic */ InterfaceC19526511aR LLILLL;
    public final /* synthetic */ InterfaceC19526611aS LLILZ;
    public final /* synthetic */ C11ZU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19522711Zp(AbstractC19524211a4 abstractC19524211a4, InterfaceC19526511aR interfaceC19526511aR, InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu, InterfaceC1364105Vn<? super C19522711Zp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC19524211a4;
        this.LLILLL = interfaceC19526511aR;
        this.LLILZ = interfaceC19526611aS;
        this.LLILZIL = c11zu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19522711Zp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PPHandlerGroup@c6a1.processItemGroup$job$1$1$1");
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
            AbstractC19524211a4 abstractC19524211a4 = this.LLILLJJLI;
            InterfaceC19526511aR interfaceC19526511aR = this.LLILLL;
            List<? extends InterfaceC19526611aS> listSingletonList = Collections.singletonList(this.LLILZ);
            C11ZU c11zu = this.LLILZIL;
            this.LL = 1;
            if (abstractC19524211a4.LIZ(interfaceC19526511aR, listSingletonList, c11zu, this) == objLJFF) {
                C1C7U.LIZIZ("PPHandlerGroup@c6a1.processItemGroup$job$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PPHandlerGroup@c6a1.processItemGroup$job$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
