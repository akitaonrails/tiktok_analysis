package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.051j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12857051j {
    public static final Keva LIZ = Keva.getRepo("ai_group_shot_keva");

    public static void LIZ() {
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get_started_display_count_");
        sbLIZ.append(C461720I8s.LIZIZ());
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("last_get_started_display_time_");
        sbLIZ2.append(C461720I8s.LIZIZ());
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
    }
}
