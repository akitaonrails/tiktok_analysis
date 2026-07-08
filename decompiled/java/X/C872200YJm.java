package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$onProcessingAllPagesEnd$2", f = "SingleInboxMessageReceiveBuffer.kt", l = {}, m = "invokeSuspend")
public final class C872200YJm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C872150YJh LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0YK7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872200YJm(int i, C872150YJh c872150YJh, boolean z, C0YK7 c0yk7, InterfaceC1364105Vn<? super C872200YJm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c872150YJh;
        this.LLILLL = z;
        this.LLILZ = c0yk7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872200YJm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.onProcessingAllPagesEnd$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == 0) {
            this.LLILLJJLI.LIZ.LJIIZILJ().getDomain().LIZ.LJIILLIIL(this.LLILLJJLI.LIZIZ, this.LLILLL);
        }
        this.LLILLJJLI.LIZ.LJIIZILJ().getDomain().LIZ.LJIJJLI(this.LLILZ.isSuccess());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.onProcessingAllPagesEnd$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
