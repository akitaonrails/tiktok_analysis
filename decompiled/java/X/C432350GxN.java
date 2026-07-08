package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordBtnAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordBtnAssem$onViewCreated$6", f = "RecordBtnAssem.kt", l = {252}, m = "invokeSuspend")
public final class C432350GxN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecordBtnAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432350GxN(RecordBtnAssem recordBtnAssem, InterfaceC1364105Vn<? super C432350GxN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recordBtnAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432350GxN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordBtnAssem@e701.onViewCreated$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C259800zU c259800zU = new C259800zU();
            RecordBtnAssem recordBtnAssem = this.LLILLJJLI;
            recordBtnAssem.getClass();
            C05YD c05ydLIZIZ = C459000HzG.LIZIZ(recordBtnAssem);
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLJJLI, c259800zU, 6);
            this.LL = 1;
            if (c05ydLIZIZ.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("RecordBtnAssem@e701.onViewCreated$6");
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
