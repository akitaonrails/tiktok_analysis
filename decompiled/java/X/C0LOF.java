package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS327S0000000_2;
import kotlin.jvm.internal.AFwS332S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LOF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LOF {
    public final C0LQY LIZ;
    public final InterfaceC1631620sYq<CameoDraft, Integer, Function0<Unit>, Unit> LIZIZ;
    public final InterfaceC1631620sYq<Context, CameoDraft, AIGCEntranceInfo, Unit> LIZJ;
    public final Function1<Context, String> LIZLLL;
    public final String LJ = ".png";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LOF)) {
            return false;
        }
        C0LOF c0lof = (C0LOF) obj;
        return this.LIZ == c0lof.LIZ && Intrinsics.LJFF(this.LIZIZ, c0lof.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lof.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lof.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lof.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloudDraftListConfig(aiBiz=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onUpdateCloudDraftType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onCloudDraftClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loadingText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resultType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LOF(C0LQY c0lqy, AFwS327S0000000_2 aFwS327S0000000_2, AFwS332S0000000_8 aFwS332S0000000_8, AFwS239S0000000_8 aFwS239S0000000_8) {
        this.LIZ = c0lqy;
        this.LIZIZ = aFwS327S0000000_2;
        this.LIZJ = aFwS332S0000000_8;
        this.LIZLLL = aFwS239S0000000_8;
    }
}
