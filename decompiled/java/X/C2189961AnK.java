package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2189961AnK implements C0PTC {
    public final String LIZ;

    public C2189961AnK(String str) {
        this.LIZ = str;
    }

    @Override // X.C0PTC
    public void LIZIZ(int i, long j, long j2, String str) {
        if (Intrinsics.LJFF(this.LIZ, "create")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" onSuccess: type=");
            sbLIZ.append(str);
            sbLIZ.append(" taskTime=");
            sbLIZ.append(j);
            sbLIZ.append(" waitTime=");
            sbLIZ.append(j2);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(" onSuccess: position=");
        sbLIZ2.append(i);
        sbLIZ2.append(" type=");
        sbLIZ2.append(str);
        sbLIZ2.append(" taskTime=");
        sbLIZ2.append(j);
        sbLIZ2.append(" waitTime=");
        sbLIZ2.append(j2);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
