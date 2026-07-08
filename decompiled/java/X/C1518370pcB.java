package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0pcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.engine.PNSNetworkEngine$executeInternal$2", f = "PNSNetworkEngine.kt", l = {140}, m = "invokeSuspend")
public final class C1518370pcB<T> extends C09AX implements Function1<InterfaceC1364105Vn<? super C1518330pc7<T>>, Object> {
    public int LL;
    public final /* synthetic */ C1518410pcF LLILLJJLI;
    public final /* synthetic */ C1518420pcG LLILLL;
    public final /* synthetic */ Class<T> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518370pcB(C1518410pcF c1518410pcF, C1518420pcG c1518420pcG, Class<T> cls, InterfaceC1364105Vn<? super C1518370pcB> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1518410pcF;
        this.LLILLL = c1518420pcG;
        this.LLILZ = cls;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518370pcB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSNetworkEngine@3e07.executeInternal$2");
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
            C1518410pcF c1518410pcF = this.LLILLJJLI;
            C1518420pcG c1518420pcG = this.LLILLL;
            Class<T> cls = this.LLILZ;
            this.LL = 1;
            obj = c1518410pcF.LIZJ(c1518420pcG, cls, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PNSNetworkEngine@3e07.executeInternal$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PNSNetworkEngine@3e07.executeInternal$2");
        return obj;
    }
}
