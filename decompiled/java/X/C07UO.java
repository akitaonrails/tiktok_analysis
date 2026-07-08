package X;

import java.util.List;

/* JADX INFO: renamed from: X.07UO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UO {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryThoughtImageUploadResult(avatarTosKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", framesTosKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07UO(String str, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
