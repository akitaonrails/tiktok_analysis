package X;

import java.util.Set;

/* JADX INFO: renamed from: X.08Lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102808Lq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Set set, Object obj, int i, String str, String str2, boolean z) {
        C089K.LIZ();
        if (set != null && !set.contains(str2)) {
            return;
        }
        C2103208Lu c2103208Lu = C2103208Lu.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        C2103208Lu.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), i, 0, z, obj);
    }
}
