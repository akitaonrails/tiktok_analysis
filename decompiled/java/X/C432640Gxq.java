package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTrashBinAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTrashBinAssem$onViewCreated$4", f = "RecordTrashBinAssem.kt", l = {147}, m = "invokeSuspend")
public final class C432640Gxq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecordTrashBinAssem LLILLJJLI;
    public final /* synthetic */ C1295960jpS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432640Gxq(RecordTrashBinAssem recordTrashBinAssem, C1295960jpS c1295960jpS, InterfaceC1364105Vn<? super C432640Gxq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recordTrashBinAssem;
        this.LLILLL = c1295960jpS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432640Gxq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordTrashBinAssem@1bc3.onViewCreated$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            RecordTrashBinAssem recordTrashBinAssem = this.LLILLJJLI;
            recordTrashBinAssem.getClass();
            C01S9<Unit> c01s9 = ((C432660Gxs) C459000HzG.LIZ(recordTrashBinAssem)).LIZ;
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLJJLI, this.LLILLL, 11);
            this.LL = 1;
            if (c01s9.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("RecordTrashBinAssem@1bc3.onViewCreated$4");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
