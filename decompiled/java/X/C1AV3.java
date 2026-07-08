package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AV3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AV3 {
    public static C1AV2 LIZLLL(EnumC2180541AVo enumC2180541AVo) {
        return new C1AV2(enumC2180541AVo, "?", true, null, 112);
    }

    public static C1AV2 LIZJ(Object obj, String str) {
        return LIZIZ(EnumC2180541AVo.V_ALL, str, obj, null);
    }

    public static C1AV2 LIZ(Object obj, String str, Boolean bool, String str2) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(obj);
        return LIZIZ(enumC2180541AVo, str, C2188811AlT.LIZIZ(sbLIZ), bool);
    }

    public static C1AV2 LIZIZ(EnumC2180541AVo enumC2180541AVo, String str, Object obj, Boolean bool) {
        String string = obj.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(string);
        return new C1AV2(enumC2180541AVo, C2188811AlT.LIZIZ(sbLIZ), Intrinsics.LJFF(str, "NaN"), bool, 96);
    }
}
