package X;

import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VPV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPV {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(413));

    public static void LIZ(EnumC1483805rQ enumC1483805rQ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelWorkManagerTasksByTag(");
        sbLIZ.append(enumC1483805rQ.getType());
        sbLIZ.append(", ");
        sbLIZ.append(enumC1483805rQ.getTag());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C0VI7 c0vi7 = (C0VI7) LIZ.getValue();
        if (c0vi7 != null) {
            c0vi7.LIZIZ(enumC1483805rQ.getTag());
        }
    }
}
