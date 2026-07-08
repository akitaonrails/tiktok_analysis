package X;

import com.bytedance.retrofit2.SsHttpCall;
import com.ss.android.ugc.aweme.performance.preload.PostModeTaskPreloadComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0SNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.performance.preload.PostModeTaskPreloadComponent$onParentViewCreated$1$onStateChange$2", f = "PostModeTaskPreloadComponent.kt", l = {53}, m = "invokeSuspend")
public final class C720420SNs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PostModeTaskPreloadComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C720420SNs(PostModeTaskPreloadComponent postModeTaskPreloadComponent, InterfaceC1364105Vn<? super C720420SNs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = postModeTaskPreloadComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C720420SNs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostModeTaskPreloadComponent@222.onParentViewCreated$1$onStateChange$2");
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
            if (C0SNG.LIZ().enable) {
                long j = C0SNG.LIZ().delayDuration;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("PostModeTaskPreloadComponent@222.onParentViewCreated$1$onStateChange$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PostModeTaskPreloadComponent@222.onParentViewCreated$1$onStateChange$2");
            return unit;
        }
        this.LLILLJJLI.getClass();
        C720400SNq.LIZ.getClass();
        if (C0SNG.LIZ().enable && !C720400SNq.LIZJ.getAndSet(true)) {
            SsHttpCall.setPriorityControl(new InterfaceC725990Sdp() { // from class: X.0SNr
                @Override // X.InterfaceC725990Sdp
                public final int LIZ(int i2, String str) {
                    if (a0.LJJIIZI(str, "photomode", false)) {
                        C720400SNq.LIZ.getClass();
                        if (C720400SNq.LIZLLL.LIZIZ(str) != null) {
                            C720400SNq.LJ.LIZJ(str, Boolean.TRUE);
                            return 3;
                        }
                        return i2;
                    }
                    return i2;
                }
            });
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PostModeTaskPreloadComponent@222.onParentViewCreated$1$onStateChange$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
