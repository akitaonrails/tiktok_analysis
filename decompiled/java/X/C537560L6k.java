package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterCreationLauncherImpl$launchInternal$1", f = "AITheaterCreationLauncherImpl.kt", l = {83}, m = "invokeSuspend")
public final class C537560L6k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IAITheaterCreationLauncher.EnterParams LL;
    public Object LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C549650Lh5 LLILZLL;
    public final /* synthetic */ Activity LLIZ;
    public final /* synthetic */ IAITheaterCreationLauncher.EnterParams LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ Context LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537560L6k(C549650Lh5 c549650Lh5, Activity activity, IAITheaterCreationLauncher.EnterParams enterParams, String str, Function0<Unit> function0, Context context, boolean z, InterfaceC1364105Vn<? super C537560L6k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c549650Lh5;
        this.LLIZ = activity;
        this.LLIZLLLIL = enterParams;
        this.LLJ = str;
        this.LLJI = function0;
        this.LLJIJIL = context;
        this.LLJILJIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C537560L6k c537560L6k = new C537560L6k(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c537560L6k.LLILZIL = obj;
        return c537560L6k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        IAITheaterCreationLauncher.EnterParams enterParams;
        Context context;
        boolean z;
        Object obj2;
        C1C7U.LIZ("AITheaterCreationLauncherImpl@c251.launchInternal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    z = this.LLILLL;
                    context = (Context) this.LLILLJJLI;
                    enterParams = this.LL;
                    Object obj3 = this.LLILZIL;
                    C155000ia.LIZIZ(obj);
                    obj2 = obj3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C549650Lh5 c549650Lh5 = this.LLILZLL;
                Activity activity = this.LLIZ;
                enterParams = this.LLIZLLLIL;
                String str = this.LLJ;
                Function0<Unit> function0 = this.LLJI;
                context = this.LLJIJIL;
                z = this.LLJILJIL;
                this.LLILZIL = c549650Lh5;
                this.LL = enterParams;
                this.LLILLJJLI = context;
                this.LLILLL = z;
                this.LLILZ = 1;
                obj = c549650Lh5.LJIIIIZZ(activity, enterParams, str, function0, this);
                obj2 = c549650Lh5;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AITheaterCreationLauncherImpl@c251.launchInternal$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (((Boolean) obj).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCreationLauncherImpl@c251.launchInternal$1");
            return unit;
        }
        if (!z) {
            z2 = false;
        }
        obj2.getClass();
        C549650Lh5.LJII(enterParams, context, z2);
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C549650Lh5 c549650Lh52 = this.LLILZLL;
        IAITheaterCreationLauncher.EnterParams enterParams2 = this.LLIZLLLIL;
        Context context2 = this.LLJIJIL;
        boolean z3 = this.LLJILJIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C537540L6i.LIZ.LIZIZ("AITheaterCreationLauncherImpl", "launchInternal failed, fallback", thM5exceptionOrNullimpl);
            c549650Lh52.getClass();
            C549650Lh5.LJII(enterParams2, context2, z3);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCreationLauncherImpl@c251.launchInternal$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
