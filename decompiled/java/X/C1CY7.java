package X;

/* JADX INFO: renamed from: X.1CY7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CY7 {
    public static C1CXJ LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return C1CXJ.Paused;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unmatched primitive enum value: LinkMicOnlineUserState with ");
                sbLIZ.append(i);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return C1CXJ.Normal;
        }
        return C1CXJ.Undefined;
    }
}
