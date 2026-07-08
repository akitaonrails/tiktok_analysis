package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.profile.GameProfileMixPageHost$requestHomeDetail$1", f = "GameProfileMixPageHost.kt", l = {154}, m = "invokeSuspend")
public final class C1881550z3x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1881470z3p LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881550z3x(C1881470z3p c1881470z3p, InterfaceC1364105Vn<? super C1881550z3x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1881470z3p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1881550z3x(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        C1C7U.LIZ("GameProfileMixPageHost@e062.requestHomeDetail$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJFF("GameProfileMixPageHost", "requestGameDetailHomeData error", th);
                    C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_duration", C2286608xc.LJFF(System.currentTimeMillis() - jElapsedRealtime));
                    C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_success", false);
                    C1CC2.LIZ("GameDetailMixPageHost.requestGameDetailHomeData", th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                C1881470z3p c1881470z3p = this.LLILLL;
                this.LL = jElapsedRealtime;
                this.LLILLJJLI = 1;
                obj = c1881470z3p.LJJ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GameProfileMixPageHost@e062.requestHomeDetail$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJFF("GameProfileMixPageHost", "requestGameDetailHomeData error", th);
                C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_duration", C2286608xc.LJFF(System.currentTimeMillis() - jElapsedRealtime));
                C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_success", false);
                C1CC2.LIZ("GameDetailMixPageHost.requestGameDetailHomeData", th);
            }
        }
        RawGameDetailHomeResponse$ResponseData rawGameDetailHomeResponse$ResponseData = (RawGameDetailHomeResponse$ResponseData) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - jElapsedRealtime;
        C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_success", true);
        C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(this.LLILLL.LJIIIZ()), "home_network_duration", C2286608xc.LJFF(jCurrentTimeMillis));
        if (rawGameDetailHomeResponse$ResponseData != null) {
            this.LLILLL.LJIL(rawGameDetailHomeResponse$ResponseData);
        }
        C176600m4.LIZJ(new C1881540z3w(this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameProfileMixPageHost@e062.requestHomeDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
