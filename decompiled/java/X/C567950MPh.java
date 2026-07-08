package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567950MPh {
    public static final C567950MPh LIZ = new C567950MPh();
    public static String LIZIZ = C0XQ7.LJFF().getCurUserId();
    public static C568040MPq LIZJ = new C568040MPq(C0XQ7.LJFF().getCurUserId());

    public final void LIZ() {
        synchronized (this) {
            try {
                if (!Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), LIZIZ)) {
                    Iterator it2 = ((List) LIZJ.LIZLLL.getValue()).iterator();
                    while (it2.hasNext()) {
                        ((C09AE) it2.next()).LIZIZ(null);
                    }
                    LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    LIZJ = new C568040MPq(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    static {
        StateOwner.LL.getClass();
        StateOwner.LLJI.add(AFwS239S0000000_8.get$arr$(275));
    }

    public final void LIZIZ(int i, Context context) {
        Object c098200Yq;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C201955140j.LIZLLL(C554890LpX.LIZIZ, "CeleRepo", "[return] request Celebration Material, not login");
            return;
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(context)) {
            LIZ();
            try {
                C568040MPq c568040MPq = LIZJ;
                c568040MPq.getClass();
                ((List) c568040MPq.LIZLLL.getValue()).add(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C567990MPl(c568040MPq, i, context, null), 3));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CeleRepo, preload Celebration And Material: error = ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        C201955140j.LJII(C554890LpX.LIZIZ, "CeleRepo, preload Celebration And Material fail, ve plugin not ready");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r13, int r14, int r15, int r16, boolean r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult> r18) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567950MPh.LIZJ(android.content.Context, int, int, int, boolean, X.05Vn):java.lang.Object");
    }
}
