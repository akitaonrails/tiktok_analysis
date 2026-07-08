package X;

import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import kotlin.Unit;
import v7.o;

/* JADX INFO: renamed from: X.090d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23017090d implements FetchResourcesListener {
    public final /* synthetic */ o<Unit> LIZ;

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onSuccess() {
        C201955140j.LJIIL("fetchRequirement onSuccess");
        this.LIZ.LJ(null);
    }

    public C23017090d(o<Unit> oVar) {
        this.LIZ = oVar;
    }

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onFailed(Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchRequirement fail : ");
        sbLIZ.append(exc);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJ(null);
    }
}
