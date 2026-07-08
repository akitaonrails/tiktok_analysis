package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.services.FindCtxSettingServiceImpl$tryToRemoveContact$1$1$1", f = "FindCtxSettingServiceImpl.kt", l = {102, 109}, m = "invokeSuspend")
public final class C446601oW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446601oW(int i, Context context, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446601oW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILZIL, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int errorCode;
        C1C7U.LIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C23112093u c23112093u = null;
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof C23112093u) {
                c23112093u = th;
            }
            if (c23112093u != null) {
                errorCode = c23112093u.getErrorCode();
            } else {
                errorCode = 0;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C446801oY c446801oY = new C446801oY(errorCode, this.LLILLL, this.LLILZ, null, this.LLILZIL, this.LLILZLL);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c446801oY) == objLJFF) {
                C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            PushSettingsApiManager.LJIIIZ(this.LLILLJJLI);
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C446701oX c446701oX = new C446701oX(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq2, c446701oX) == objLJFF) {
                C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
