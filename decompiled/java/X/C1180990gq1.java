package X;

import com.ss.android.ugc.aweme.slash.data.UpdateStrategy;

/* JADX INFO: renamed from: X.0gq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180990gq1 {
    public final UpdateStrategy LIZ;
    public boolean LIZIZ = false;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashAttachedDataInfo(updateStrategy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", attachedToHost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1180990gq1(UpdateStrategy updateStrategy) {
        this.LIZ = updateStrategy;
    }
}
