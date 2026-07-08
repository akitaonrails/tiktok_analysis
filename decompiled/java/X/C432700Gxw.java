package X;

import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTrashBinAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTrashBinAssem$onViewCreated$3", f = "RecordTrashBinAssem.kt", l = {143}, m = "invokeSuspend")
public final class C432700Gxw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecordTrashBinAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432700Gxw(RecordTrashBinAssem recordTrashBinAssem, InterfaceC1364105Vn<? super C432700Gxw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recordTrashBinAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432700Gxw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordTrashBinAssem@1bc3.onViewCreated$3");
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
            RecordTrashBinAssem recordTrashBinAssem = this.LLILLJJLI;
            C2252321DDq c2252321DDq = recordTrashBinAssem.LLJJIII;
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(recordTrashBinAssem), 20));
            RecordTrashBinAssem recordTrashBinAssem2 = this.LLILLJJLI;
            recordTrashBinAssem2.getClass();
            C515901zh c515901zhLJIIIIZZ = C09IC.LJIIIIZZ(c2252321DDq, interfaceC346201WaLJIILL, C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(recordTrashBinAssem2), 21)), new C432690Gxv(this.LLILLJJLI, null));
            this.LL = 1;
            if (C09IC.LJI(c515901zhLJIIIIZZ, this) == objLJFF) {
                C1C7U.LIZIZ("RecordTrashBinAssem@1bc3.onViewCreated$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordTrashBinAssem@1bc3.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
