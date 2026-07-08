package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J57, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.LiveNearByGuideManager$startRequest$1", f = "LiveNearByGuideManager.kt", l = {264}, m = "invokeSuspend")
public final class C0J57 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0J58 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J57(C0J58 c0j58, InterfaceC1364105Vn<? super C0J57> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0j58;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0J57(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNearByGuideManager@ef5d.startRequest$1");
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
            C0J58 c0j58 = this.LLILLJJLI;
            this.LL = 1;
            obj = c0j58.LJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveNearByGuideManager@ef5d.startRequest$1");
                return objLJFF;
            }
        }
        C0J5L c0j5l = (C0J5L) obj;
        if (c0j5l != null) {
            this.LLILLJJLI.LJIIIIZZ(c0j5l);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNearByGuideManager@ef5d.startRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
