package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZVP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZVP implements IIMCallRoomService {
    public static final C0ZVP LIZIZ = new C0ZVP();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(92));
    public static volatile IIMCallRoomService LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static volatile long LJI;

    public static IIMCallRoomService LJFF() {
        Object c098200Yq;
        try {
            final Class<?> cls = Class.forName("com.ss.android.ugc.aweme.im.callroom.service.IMCallRoomServiceImpl");
            ServiceManager.get().bind(IIMCallRoomService.class, new ServiceProvider() { // from class: X.0ZVQ
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return cls.newInstance();
                }
            }).asSingleton();
            c098200Yq = (IIMCallRoomService) PluggableExtentionKt.pluggableSpi$default(IIMCallRoomService.class, false, false, false, 14, null);
            if (c098200Yq == null || c098200Yq == LJII()) {
                LJI = SystemClock.elapsedRealtime();
                c098200Yq = LJII();
            } else {
                LJI = 0L;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LJI = SystemClock.elapsedRealtime();
        }
        C0ZVM c0zvmLJII = LJII();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c0zvmLJII;
        }
        return (IIMCallRoomService) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService LJI() {
        /*
            com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService r0 = X.C0ZVP.LIZLLL
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class<com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService> r0 = com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService r1 = (com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService) r1
            if (r1 != 0) goto L27
            boolean r0 = X.C0ZVP.LJ
            r7 = 1
            if (r0 != 0) goto L32
            X.1E0m r2 = X.C2274381E0m.LIZIZ
            boolean r0 = X.C10UI.LIZ()
            r1 = r0 ^ 1
            r0 = 0
            boolean r0 = r2.LIZJ(r1, r0)
            if (r0 != 0) goto L30
            X.0ZVM r1 = LJII()
        L27:
            X.0ZVM r0 = LJII()
            if (r1 == r0) goto L2f
            X.C0ZVP.LIZLLL = r1
        L2f:
            return r1
        L30:
            X.C0ZVP.LJ = r7
        L32:
            long r5 = X.C0ZVP.LJI
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r5
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4a
            X.0ZVM r1 = LJII()
            goto L27
        L4a:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L71
            boolean r0 = X.C0ZVP.LJFF
            if (r0 != 0) goto L6c
            X.C0ZVP.LJFF = r7
            X.03Hh r4 = X.C817503Hh.LL
            X.1DFB r3 = X.C0PEM.LIZJ
            X.0ZVO r2 = new X.0ZVO
            r1 = 0
            r2.<init>(r1)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
        L6c:
            X.0ZVM r1 = LJII()
            goto L27
        L71:
            com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService r1 = LJFF()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZVP.LJI():com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService");
    }

    public static C0ZVM LJII() {
        return (C0ZVM) LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService
    public final void LIZ() {
        LJI().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService
    public final void init() {
        LJI().init();
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService
    public final void LIZIZ(String str) {
        LJI().LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService
    public final void LIZJ(String str) {
        LJI().LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService
    public final boolean LIZLLL(Activity activity) {
        return LJI().LIZLLL(activity);
    }

    @Override // com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService
    public final void LJ(Context context, String str, String str2, String str3, UrlModel urlModel, String str4, String str5, Integer num, String str6, View view, long j) {
        LJI().LJ(context, str, str2, str3, urlModel, str4, str5, num, str6, view, j);
    }
}
