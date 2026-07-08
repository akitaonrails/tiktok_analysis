package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.dispatch.ComponentDispatcher$triggerVideoFirstFrame$1$deferredList$1$1", f = "ComponentDispatcher.kt", l = {113}, m = "invokeSuspend")
public final class C1331705Jb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1333305Jr<Object, Object> LLILLJJLI;
    public final /* synthetic */ AbstractC1333605Ju<Object, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331705Jb(C1333305Jr<Object, Object> c1333305Jr, AbstractC1333605Ju<Object, Object> abstractC1333605Ju, InterfaceC1364105Vn<? super C1331705Jb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1333305Jr;
        this.LLILLL = abstractC1333605Ju;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1331705Jb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1$deferredList$1$1");
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
            C1333805Jw<Object, Object> c1333805Jw = this.LLILLJJLI.LIZLLL;
            AbstractC1333605Ju<Object, Object> abstractC1333605Ju = this.LLILLL;
            this.LL = 1;
            c1333805Jw.getClass();
            if (C23250099c.LJI(this, C0PEM.LIZJ, new C05JY(c1333805Jw, abstractC1333605Ju, null)) == objLJFF) {
                C1C7U.LIZIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1$deferredList$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1$deferredList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
