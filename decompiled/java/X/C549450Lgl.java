package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Lgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549450Lgl {
    public static final Regex LIZ = new Regex("[^a-z0-9]+");

    public static final boolean LIZ(MentionDataItem mentionDataItem) {
        if (!Intrinsics.LJFF(mentionDataItem.relationType, "MySelf") || mentionDataItem.cameoId != null || LJI(mentionDataItem)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(MentionDataItem mentionDataItem) {
        if (!LIZLLL(mentionDataItem) || mentionDataItem.cameoId == null) {
            return false;
        }
        return true;
    }

    public static final String LIZJ(MentionDataItem mentionDataItem) {
        String lowerCase;
        if (Intrinsics.LJFF(mentionDataItem.isVirtual, Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("virtual_");
            String str = mentionDataItem.name;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            sbLIZ.append(lowerCase);
            return LIZ.replace(C2188811AlT.LIZIZ(sbLIZ), "_");
        }
        String str2 = mentionDataItem.relationType;
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1976203464) {
                if (iHashCode != 397853386) {
                    if (iHashCode != 2112550590 || !str2.equals("Friend")) {
                        return "else";
                    }
                    return "friends";
                }
                if (!str2.equals("RecentUseFriend")) {
                    return "else";
                }
                return "friends";
            }
            if (!str2.equals("MySelf")) {
                return "else";
            }
            return "self";
        }
        return "else";
    }

    public static final boolean LIZLLL(MentionDataItem mentionDataItem) {
        Integer num = mentionDataItem.permissionResult;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(MentionDataItem mentionDataItem) {
        if (!Intrinsics.LJFF(mentionDataItem.relationType, "Friend") && !Intrinsics.LJFF(mentionDataItem.relationType, "RecentUseFriend")) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(MentionDataItem mentionDataItem) {
        return Intrinsics.LJFF(mentionDataItem.relationType, "MySelf");
    }

    public static final boolean LJI(MentionDataItem mentionDataItem) {
        if (Intrinsics.LJFF(mentionDataItem.relationType, "MySelf")) {
            if (mentionDataItem.progress == null) {
                String str = mentionDataItem.generatingTaskId;
                if (str != null && !a0.LJJJIL(str)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJII(MentionDataItem mentionDataItem) {
        if (mentionDataItem.cameoId == null && LJ(mentionDataItem)) {
            return true;
        }
        return false;
    }
}
