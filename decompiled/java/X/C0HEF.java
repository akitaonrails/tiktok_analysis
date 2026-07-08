package X;

import android.os.SystemClock;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDynamicSettingResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HEF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource$getDynamicSettingInfoAsync$dynamicSettingInfoDeferred$1", f = "SocialAvatarEntranceDynamicDataSource.kt", l = {230}, m = "invokeSuspend")
public final class C0HEF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends SocialAvatarDynamicSettingResult>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C0HEF(InterfaceC1364105Vn<? super C0HEF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HEF c0hef = new C0HEF(interfaceC1364105Vn);
        c0hef.LLILLL = obj;
        return c0hef;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        Object c098200Yq;
        C1C7U.LIZ("SocialAvatarEntranceDynamicDataSource@248e.getDynamicSettingInfoAsync$dynamicSettingInfoDeferred$1");
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
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                C0HMR.LIZ.getClass();
                C0HEN c0henLIZ = C0HMR.LIZ();
                this.LL = jElapsedRealtime;
                this.LLILLJJLI = 1;
                boolean zLJI = MethodIDManager.LJI(137820);
                obj = null;
                if (!C1644806cI.LIZJ()) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                } else {
                    obj = C0HEN.LIZIZ.LIZ(new C0HEH(c0henLIZ, null), this);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarEntranceDynamicDataSource@248e.getDynamicSettingInfoAsync$dynamicSettingInfoDeferred$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = (SocialAvatarDynamicSettingResult) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        SocialAvatarEntranceDynamicDataSource.LL.LIZLLL().LIZ("DynamicEntranceSetting", "getDynamicSettingInfoAsync, result is " + ((Object) C189200o6.m9toStringimpl(c098200Yq)) + ", time cost is " + jElapsedRealtime2);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("SocialAvatarEntranceDynamicDataSource@248e.getDynamicSettingInfoAsync$dynamicSettingInfoDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends SocialAvatarDynamicSettingResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
