package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Lb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545930Lb5 {
    public static final C01GW<Boolean> LJII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(465));
    public final LifecycleOwner LIZ;
    public AnonymousClass0956 LIZLLL;
    public AnonymousClass0956 LJ;
    public String LJI;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(466));
    public final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public List<String> LJFF = C13BV.INSTANCE;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
            this.LJ = null;
            this.LJI = null;
        }
        AnonymousClass0956 anonymousClass09562 = this.LIZLLL;
        if (anonymousClass09562 == null) {
            return;
        }
        anonymousClass09562.LIZIZ(null);
        ICreationAsyncTaskManager iCreationAsyncTaskManager = (ICreationAsyncTaskManager) this.LIZIZ.getValue();
        if (iCreationAsyncTaskManager != null) {
            iCreationAsyncTaskManager.LJI("ProfileDraftTaskProgress", AFwS189S0000000_3.get$arr$(377), false);
        }
        this.LIZLLL = null;
        AnonymousClass0913.LIZJ("ProfileDraftTaskProgress");
        this.LJFF = null;
        C201955140j.LJFF("ProfileDraftTaskProgress", "cancelJob");
    }

    public C545930Lb5(LifecycleOwner lifecycleOwner) {
        this.LIZ = lifecycleOwner;
    }

    public static List LIZIZ(C553680Lna c553680Lna) {
        List listLIZ;
        AwemeDraft awemeDraft = c553680Lna.LIZIZ;
        if (awemeDraft == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (!C545950Lb7.LIZIZ(awemeDraft) && !C0MUK.LJ(awemeDraft)) {
            listLIZ = C13BV.INSTANCE;
        } else {
            listLIZ = C545950Lb7.LIZ(awemeDraft);
        }
        if (!listLIZ.isEmpty()) {
            arrayList.addAll(listLIZ);
        }
        return arrayList;
    }

    public final void LIZLLL(C553680Lna c553680Lna) {
        AwemeDraft awemeDraft;
        AwemeDraft awemeDraft2 = c553680Lna.LIZIZ;
        if (awemeDraft2 != null && awemeDraft2.LIZ.aigcWorkflowModel.hasAigcNewFrameworkTask) {
            try {
                C23250099c.LJ(C23271099x.INSTANCE, new C545850Lax(awemeDraft2, this, c553680Lna, null));
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJFF("ProfileDraftTaskProgress", String.valueOf(e));
            }
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManager = (ICreationAsyncTaskManager) this.LIZIZ.getValue();
        if (iCreationAsyncTaskManager == null || (awemeDraft = c553680Lna.LIZIZ) == null) {
            return;
        }
        List listLIZIZ = LIZIZ(c553680Lna);
        iCreationAsyncTaskManager.LJIILIIL();
        Set<String> setLIZIZ = C0LCT.LIZIZ();
        if (!listLIZIZ.isEmpty() && !setLIZIZ.contains(awemeDraft.LIZ())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateFirstDraftAsyncProgress, taskList=");
            sbLIZ.append(listLIZIZ);
            C201955140j.LJFF("ProfileDraftTaskProgress", C2188811AlT.LIZIZ(sbLIZ));
            try {
                C23250099c.LJ(C23271099x.INSTANCE, new C545860Lay(iCreationAsyncTaskManager, listLIZIZ, awemeDraft, this, c553680Lna, null));
            } catch (InterruptedException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C201955140j.LJFF("ProfileDraftTaskProgress", String.valueOf(e2));
            }
        }
    }

    public static void LIZJ(AIGCBusinessModelSet aIGCBusinessModelSet, C553680Lna c553680Lna, C539070LCf c539070LCf) {
        c553680Lna.LIZJ = c539070LCf.LIZJ;
        c553680Lna.LIZLLL = c539070LCf.LIZIZ;
        AITheaterModel aITheaterModel = aIGCBusinessModelSet.aiTheaterModel;
        if (aITheaterModel != null) {
            c553680Lna.LJ = C547980LeO.LIZLLL(aITheaterModel);
        }
    }
}
