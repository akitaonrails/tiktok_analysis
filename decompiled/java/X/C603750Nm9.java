package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Nm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionExitServiceImpl$triggerStoreJob$1", f = "LightInteractionExitServiceImpl.kt", l = {320}, m = "invokeSuspend")
public final class C603750Nm9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C603750Nm9(InterfaceC1364105Vn<? super C603750Nm9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C603750Nm9(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        C1C7U.LIZ("LightInteractionExitServiceImpl@10e1.triggerStoreJob$1");
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
            long j = C603760NmA.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LightInteractionExitServiceImpl@10e1.triggerStoreJob$1");
                return objLJFF;
            }
        }
        try {
            try {
                for (LightInteractionExitBean lightInteractionExitBean : C603760NmA.LLILZIL) {
                    String strLJ = C051M.LJ(lightInteractionExitBean, false);
                    String[] strArr = new String[2];
                    Long l = lightInteractionExitBean.updateTimingMs;
                    if (l == null || (strValueOf = l.toString()) == null) {
                        strValueOf = String.valueOf(System.currentTimeMillis());
                    }
                    strArr[0] = strValueOf;
                    strArr[1] = strLJ;
                    Keva keva = C603760NmA.LLILZLL;
                    if (keva != null) {
                        keva.storeStringArray(lightInteractionExitBean.key, strArr);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C603760NmA.LLILZIL.clear();
            C603760NmA.LLIZ = null;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LightInteractionExitServiceImpl@10e1.triggerStoreJob$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C603760NmA.LLILZIL.clear();
            C603760NmA.LLIZ = null;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C603750Nm9(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
