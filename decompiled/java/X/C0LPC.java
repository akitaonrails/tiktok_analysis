package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.portrait.notify.push.AIPortraitGenerationPushPayload;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LPC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LPC implements C0LP2<AIPortraitGenerationPushPayload> {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final AIGCWorkflowManagementApi LIZIZ = (AIGCWorkflowManagementApi) PluggableExtentionKt.pluggableSpi$default(AIGCWorkflowManagementApi.class, false, false, false, 14, null);
    public final int[] LIZJ = {2533, 2534};
    public final Class<AIPortraitGenerationPushPayload> LIZLLL = AIPortraitGenerationPushPayload.class;

    public static final boolean LJI() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        ICreativeSAAService iCreativeSAAService;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        return (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null || (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) == null || !iCreativeSAAService.isSAAActivity(activityLIZ)) ? false : true;
    }

    @Override // X.C0LP2
    public final int[] LIZ() {
        return this.LIZJ;
    }

    @Override // X.C0LP2
    public final Class<AIPortraitGenerationPushPayload> LJ() {
        return this.LIZLLL;
    }

    @Override // X.C0LP2
    public final /* bridge */ /* synthetic */ void we(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C552940LmO> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0LPF
            if (r0 == 0) goto L51
            r5 = r8
            X.0LPF r5 = (X.C0LPF) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L57
            X.C155000ia.LIZIZ(r1)
        L23:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L33
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L33
            java.lang.Object r2 = X.C13LP.LJJJLL(r0)
        L33:
            return r2
        L34:
            X.C155000ia.LIZIZ(r1)
            if (r7 == 0) goto L5f
            int r0 = r7.length()
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r6.LIZIZ
            if (r1 == 0) goto L33
            X.0LPG r0 = new X.0LPG
            r0.<init>(r7)
            r5.LLILLL = r3
            java.lang.Object r1 = r1.LJFF(r0, r5)
            if (r1 != r4) goto L23
            return r4
        L51:
            X.0LPF r5 = new X.0LPF
            r5.<init>(r6, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPC.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.C0LP2
    public final /* bridge */ /* synthetic */ void LIZIZ(Object obj, boolean z) {
    }

    @Override // X.C0LP2
    public final boolean LIZJ(C0LP1 c0lp1, InnerPushMessage innerPushMessage, Object obj) {
        Object c098200Yq;
        AIPortraitGenerationPushPayload aIPortraitGenerationPushPayload = (AIPortraitGenerationPushPayload) obj;
        if (LJI()) {
            c0lp1.d("[AIPortraitGenerationPushProcessor] shouldBlockShow -> true (in shoot page)");
            return true;
        }
        if (Intrinsics.LJFF(aIPortraitGenerationPushPayload.success, Boolean.FALSE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[AIPortraitGenerationPushProcessor] shouldBlockShow -> false (push reports failure, serverTaskId=");
            sbLIZ.append(aIPortraitGenerationPushPayload.serverTaskId);
            sbLIZ.append(')');
            c0lp1.d(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        String str = aIPortraitGenerationPushPayload.serverTaskId;
        if (str != null && str.length() != 0) {
            Object obj2 = null;
            try {
                c098200Yq = (C1346605Ou) C23250099c.LJ(C23271099x.INSTANCE, new C0LPE(this, str, null));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[AIPortraitGenerationPushProcessor] isAsyncTaskDownloadFinished: query workflow state failed, serverTaskId=");
                sbLIZ2.append(str);
                c0lp1.e(C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            C1346605Ou c1346605Ou = (C1346605Ou) obj2;
            if (c1346605Ou == null) {
                c0lp1.d("[AIPortraitGenerationPushProcessor] isAsyncTaskDownloadFinished: workflow/state not found, serverTaskId=" + str + ", allow show");
                return false;
            }
            boolean zLIZJ = C542430LPd.LIZJ(c1346605Ou);
            boolean z = !zLIZJ;
            c0lp1.d("[AIPortraitGenerationPushProcessor] isAsyncTaskDownloadFinished: serverTaskId=" + str + ", isWorkflowDone=" + zLIZJ + ", shouldBlock=" + z);
            return z;
        }
        c0lp1.d("[AIPortraitGenerationPushProcessor] isAsyncTaskDownloadFinished: serverTaskId is null/empty, allow show");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    @Override // X.C0LP2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0LP4 LIZLLL(X.C0LP1 r7, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r8, java.lang.Object r9) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.portrait.notify.push.AIPortraitGenerationPushPayload r9 = (com.ss.android.ugc.aweme.portrait.notify.push.AIPortraitGenerationPushPayload) r9
            boolean r0 = LJI()
            if (r0 == 0) goto L14
            java.lang.String r0 = "[AIPortraitGenerationPushProcessor] onAccept -> reject (in shoot page)"
            r7.d(r0)
            java.lang.String r0 = "in_shoot_page"
            X.0LP4 r1 = X.C0LP5.LIZ(r0)
            return r1
        L14:
            java.lang.String r5 = r9.serverTaskId
            r3 = 1
            if (r5 == 0) goto L8e
            int r0 = r5.length()
            if (r0 == 0) goto L8e
            r0 = 0
        L20:
            r4 = 0
            if (r0 == 0) goto L82
            java.lang.String r0 = "[AIPortraitGenerationPushProcessor] restoreTask: skip (serverTaskId is null/empty)"
            r7.d(r0)
        L28:
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L90
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L90
            android.app.Activity r1 = X.C1388190mED.LIZ(r0)
            if (r1 == 0) goto L90
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L90
            r0 = r1
            X.15ms r0 = (X.InterfaceC20622815ms) r0
            com.bytedance.scene.navigation.NavigationScene r0 = r0.getNavigationScene()
            if (r0 == 0) goto L80
            com.bytedance.scene.Scene r2 = r0.LLLLIIIILLL()
        L4b:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.adaptation.saa.SAAActivity
            if (r0 != 0) goto L7e
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene
            if (r0 == 0) goto L7e
            r1 = r2
            com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene r1 = (com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene) r1
            boolean r0 = r1.LLLFZ
            if (r0 != 0) goto L7e
            com.bytedance.scene.navigation.NavigationScene r0 = r1.LLJLIL
            if (r0 == 0) goto L62
            com.bytedance.scene.Scene r4 = r0.LLLLIIIILLL()
        L62:
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabRootScene
            if (r0 != 0) goto L72
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.portrait.generate.scene.AIPortraitGenerationRootScene
            if (r0 != 0) goto L72
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.portrait.preview.AIPortraitStylePreviewRootScene
            if (r0 != 0) goto L72
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeRootScene
            if (r0 == 0) goto L90
        L72:
            java.lang.String r0 = "[AIPortraitGenerationPushProcessor] onAccept -> reject (in AIPortrait page)"
            r7.d(r0)
            java.lang.String r0 = "in_ai_portrait_page"
            X.0LP4 r1 = X.C0LP5.LIZ(r0)
            return r1
        L7e:
            r4 = r2
            goto L62
        L80:
            r2 = r4
            goto L4b
        L82:
            X.054G r2 = r6.LIZ
            X.0LPD r1 = new X.0LPD
            r1.<init>(r6, r5, r7, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
            goto L28
        L8e:
            r0 = 1
            goto L20
        L90:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[AIPortraitGenerationPushProcessor] onAccept -> accept (serverTaskId="
            r1.append(r0)
            java.lang.String r0 = r9.serverTaskId
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r7.d(r0)
            X.0LP4 r1 = new X.0LP4
            java.lang.String r0 = "accepted"
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPC.LIZLLL(X.0LP1, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage, java.lang.Object):X.0LP4");
    }
}
