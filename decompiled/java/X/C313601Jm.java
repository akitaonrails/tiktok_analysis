package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.protocol.IAnimSeqShowUIThreadProvider$onSeqShow$2", f = "IAnimSeqShowUIThreadProvider.kt", l = {14}, m = "invokeSuspend")
public final class C313601Jm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC313701Jn LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313601Jm(InterfaceC313701Jn interfaceC313701Jn, InterfaceC1364105Vn<? super C313601Jm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC313701Jn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313601Jm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAnimSeqShowUIThreadProvider@4ef2.onSeqShow$2");
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
            InterfaceC313701Jn interfaceC313701Jn = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC313701Jn.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IAnimSeqShowUIThreadProvider@4ef2.onSeqShow$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IAnimSeqShowUIThreadProvider@4ef2.onSeqShow$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
