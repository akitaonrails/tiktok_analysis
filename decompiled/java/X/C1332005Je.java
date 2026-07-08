package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.dispatch.ComponentDispatcher$ensureTriggerFirstFrame$1", f = "ComponentDispatcher.kt", l = {70}, m = "invokeSuspend")
public final class C1332005Je extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1333305Jr<Object, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332005Je(C1333305Jr<Object, Object> c1333305Jr, InterfaceC1364105Vn<? super C1332005Je> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1333305Jr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1332005Je(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComponentDispatcher@4f48.ensureTriggerFirstFrame$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("ComponentDispatcher@4f48.ensureTriggerFirstFrame$1");
                return objLJFF;
            }
        }
        C1333305Jr<Object, Object> c1333305Jr = this.LLILLJJLI;
        AnonymousClass0956 anonymousClass0956 = c1333305Jr.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1333205Jq c1333205Jq = c1333305Jr.LJ;
        c1333205Jq.getClass();
        c1333205Jq.LIZ(EnumC1333405Js.RENDER_FIRST_FRAME);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComponentDispatcher@4f48.ensureTriggerFirstFrame$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
