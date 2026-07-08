package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0W2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$triggerFullUpdate$2$result$1", f = "StorageDataSource.kt", l = {110}, m = "invokeSuspend")
public final class C0W2Z extends C09AX implements Function2<C0W2P, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C816720W2c LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W2Z(C816720W2c c816720W2c, int i, InterfaceC1364105Vn<? super C0W2Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c816720W2c;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0W2Z c0w2z = new C0W2Z(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0w2z.LLILLJJLI = obj;
        return c0w2z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageDataSource@15ec.triggerFullUpdate$2$result$1");
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
            C0W2P c0w2p = (C0W2P) this.LLILLJJLI;
            C816720W2c c816720W2c = this.LLILLL;
            C816880W2s c816880W2s = new C816880W2s(0);
            int i2 = this.LLILZ;
            this.LL = 1;
            obj = c816720W2c.LJ(c816880W2s, c0w2p, i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StorageDataSource@15ec.triggerFullUpdate$2$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StorageDataSource@15ec.triggerFullUpdate$2$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0W2P c0w2p, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c0w2p, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
