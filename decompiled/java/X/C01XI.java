package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.SmartCoverExtractor$executeOnMainThread$1", f = "SmartCoverExtractor.kt", l = {319}, m = "invokeSuspend")
public final class C01XI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XI(Function0<Object> function0, InterfaceC1364105Vn<? super C01XI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SmartCoverExtractor@7b55.executeOnMainThread$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C01XJ c01xj = new C01XJ(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2238408pq, c01xj);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SmartCoverExtractor@7b55.executeOnMainThread$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SmartCoverExtractor@7b55.executeOnMainThread$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
