package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06pB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$updateBlockInfo$1", f = "IMContactManager.kt", l = {373, 375}, m = "invokeSuspend")
public final class C1724706pB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1724706pB(Long l, boolean z, InterfaceC1364105Vn<? super C1724706pB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1724706pB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.updateBlockInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Long l = this.LLILLJJLI;
            if (l != null) {
                boolean z = this.LLILLL;
                long jLongValue = l.longValue();
                if (z) {
                    InterfaceC1726606pU interfaceC1726606pULIZIZ = C805480Vik.LIZIZ();
                    this.LL = 1;
                    if (interfaceC1726606pULIZIZ.LJIILIIL(jLongValue, this) == objLJFF) {
                        C1C7U.LIZIZ("IMContactManager@fb8a.updateBlockInfo$1");
                        return objLJFF;
                    }
                } else {
                    InterfaceC1726606pU interfaceC1726606pULIZIZ2 = C805480Vik.LIZIZ();
                    this.LL = 2;
                    if (interfaceC1726606pULIZIZ2.LJIIIIZZ(jLongValue, this) == objLJFF) {
                        C1C7U.LIZIZ("IMContactManager@fb8a.updateBlockInfo$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMContactManager@fb8a.updateBlockInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
