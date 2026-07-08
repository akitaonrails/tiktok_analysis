package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911450ZpH {
    public static final C911450ZpH LIZ = new C911450ZpH();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(476));

    public static void LJFF() {
        C13LE.LIZ(C911450ZpH.class);
    }

    public static void LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearAddingPhotoState msgId=");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        LJFF();
        LJI(new C06ZY(j, CardStruct.IStatusCode.DEFAULT, null));
    }

    public static C911480ZpK LIZIZ(String str) {
        int iIntValue;
        Integer numLJIIJJI;
        String strLJFF = C0YNP.LJFF(str, "KEY_AI_GROUP_SHOT_CREATE_NEW_GROUP_CHAT_PRESELECTED_TEMPLATE");
        if (strLJFF == null) {
            strLJFF = "";
        }
        String strLJFF2 = C0YNP.LJFF(str, "KEY_AI_GROUP_SHOT_CREATE_NEW_GROUP_CHAT_DISPLAY_COUNT_REMAINING");
        if (strLJFF2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLJFF2)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTemplateForNewGroupChatCreation preselectedId:");
        sbLIZ.append(strLJFF);
        sbLIZ.append(", displayCountRemaining:");
        sbLIZ.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ);
        LJFF();
        return new C911480ZpK(strLJFF, iIntValue);
    }

    public static boolean LIZJ(C869590Y9l c869590Y9l) {
        return Intrinsics.LJFF(c869590Y9l.getLocalExt().get("local_ext_ai_group_shot_adding_photo_loading_state"), "1");
    }

    public static boolean LIZLLL(String str) {
        boolean zLJFF = Intrinsics.LJFF(str.substring(0, 12), "aigroupcard_");
        C911450ZpH c911450ZpH = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCardMsgCommand ");
        sbLIZ.append(zLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        c911450ZpH.getClass();
        LJFF();
        return zLJFF;
    }

    public static boolean LJ(String str) {
        boolean zLJFF = Intrinsics.LJFF(str.substring(0, 12), "aigroupfake_");
        C911450ZpH c911450ZpH = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isFakeMsgCommand ");
        sbLIZ.append(zLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        c911450ZpH.getClass();
        LJFF();
        return zLJFF;
    }

    public static void LJI(Function1 function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C01L5(function1, null), 3);
    }
}
