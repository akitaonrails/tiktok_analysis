package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Etl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.aicreate.EPAICreateComponent$persistCache$1", f = "EPAICreateComponent.kt", l = {276}, m = "invokeSuspend")
public final class C379150Etl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C379110Eth LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C379150Etl(C379110Eth c379110Eth, InterfaceC1364105Vn<? super C379150Etl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c379110Eth;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C379150Etl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAICreateComponent@2888.persistCache$1");
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
            InterfaceC379060Etc interfaceC379060EtcH2 = this.LLILLJJLI.H2();
            this.LL = 1;
            obj = interfaceC379060EtcH2.jo0(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EPAICreateComponent@2888.persistCache$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.O3((List) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPAICreateComponent@2888.persistCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
