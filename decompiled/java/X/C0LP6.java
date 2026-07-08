package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;

/* JADX INFO: renamed from: X.0LP6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LP6<PARAMS> implements C0LP2<PARAMS> {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    @Override // X.C0LP2
    public final void LIZIZ(Object obj, boolean z) {
    }

    @Override // X.C0LP2
    public final void we(Object obj) {
    }

    public static final boolean LJI() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        ICreativeSAAService iCreativeSAAService;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        return (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null || (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) == null || !iCreativeSAAService.isSAAActivity(activityLIZ)) ? false : true;
    }

    public static C0LSZ LJFF(String str) {
        boolean z;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z || (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) == null) {
            return null;
        }
        try {
            c098200Yq = (C0LSZ) C23250099c.LJ(C23271099x.INSTANCE, new C09BY(iCreationAsyncTaskManagerLIZ, str, null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C0LSZ) obj;
    }

    @Override // X.C0LP2
    public boolean LIZJ(C0LP1 c0lp1, InnerPushMessage innerPushMessage, Object obj) {
        return LJI();
    }

    @Override // X.C0LP2
    public C0LP4 LIZLLL(C0LP1 c0lp1, InnerPushMessage innerPushMessage, Object obj) {
        if (LJI()) {
            c0lp1.d("onAccept -> reject (in shoot page)");
            return C0LP5.LIZ("in_shoot_page");
        }
        return new C0LP4(true, "accepted");
    }
}
