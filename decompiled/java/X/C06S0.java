package X;

import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06S0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06S0 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("streak_pet_invite_banner", "guide_activity_status_public", "notice_activity_status_public", "smart_reply_inbox_creator");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1055));

    public static void LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeConfig: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ((Keva) LIZIZ.getValue()).storeString(str, str2);
    }
}
