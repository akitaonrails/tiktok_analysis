package X;

import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowETData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LUA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LUA extends C0LU9 {
    public final String LIZ;
    public final C0LU8 LIZIZ;
    public final AIGCArchWorkflowETData LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LUA)) {
            return false;
        }
        C0LUA c0lua = (C0LUA) obj;
        return Intrinsics.LJFF(this.LIZ, c0lua.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lua.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lua.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCArchWorkflowFailed(serverTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", etData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LUA(String str, C0LUN c0lun, AIGCArchWorkflowETData aIGCArchWorkflowETData) {
        this.LIZ = str;
        this.LIZIZ = c0lun;
        this.LIZJ = aIGCArchWorkflowETData;
    }
}
