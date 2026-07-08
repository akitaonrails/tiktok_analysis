package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06Cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1570606Cy {
    public static final Map<String, EnumC12986056i> LIZ = C2097908Jt.LIZJ(new Pair("streak_pet_invite_banner", EnumC12986056i.STREAK_PET_INVITE_BANNER));

    public static boolean LIZ(String str) {
        EnumC12986056i enumC12986056i = LIZ.get(str);
        if (enumC12986056i == null) {
            return false;
        }
        return C306990C1p.LIZ(enumC12986056i.getSceneName());
    }
}
