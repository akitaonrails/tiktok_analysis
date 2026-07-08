package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Wu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838030Wu9 implements Function2<Throwable, C838310Wub, C838040WuA> {
    @Override // kotlin.jvm.functions.Function2
    public final C838040WuA invoke(Throwable th, C838310Wub c838310Wub) {
        Throwable th2 = th;
        C838310Wub c838310Wub2 = c838310Wub;
        c838310Wub2.LJFF = EnumC838050WuB.WARN;
        c838310Wub2.LIZJ = -1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inner error:");
        sbLIZ.append(th2.getLocalizedMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c838310Wub2.LIZLLL = strLIZIZ;
        c838310Wub2.LJI = th2;
        if (strLIZIZ == null && (strLIZIZ = th2.getLocalizedMessage()) == null) {
            strLIZIZ = "";
        }
        return new C838040WuA(-1, strLIZIZ, 4);
    }
}
