package X;

import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.wishlistv2.LiveStreamGoalPresenter$getGoalInfo$1$2$1", f = "LiveStreamGoalPresenter.kt", l = {529}, m = "invokeSuspend")
public final class C312301Iz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2632010c LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C312301Iz(C2632010c c2632010c, String str, long j, boolean z, String str2, InterfaceC1364105Vn<? super C312301Iz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2632010c;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C312301Iz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LiveStreamGoalPresenter@dd38.getGoalInfo$1$2$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C01J5 c01j5 = new C01J5(this.LLILZLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c01j5);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveStreamGoalPresenter@dd38.getGoalInfo$1$2$1");
                return objLJFF;
            }
        }
        GetResponse.Data data = (GetResponse.Data) obj;
        if (data != null) {
            try {
                LiveStreamGoal liveStreamGoal = data.ongoingGoal;
                if (liveStreamGoal != null) {
                    liveStreamGoal.id = CastLongProtector.parseLong(liveStreamGoal.idStr);
                }
                CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
                C1125820fP2.LJIIIIZZ(data.ongoingGoal);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJII(th);
                this.LLILLJJLI.LJIIIIZZ(this.LLILZ, this.LLILLL, this.LLILZIL);
            }
        } else {
            this.LLILLJJLI.LJIIIIZZ(this.LLILZ, this.LLILLL, this.LLILZIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveStreamGoalPresenter@dd38.getGoalInfo$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
