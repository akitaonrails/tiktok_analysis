package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.livesetting.level.LevelPrivilegeBubbleCacheLengthSetting;
import com.bytedance.android.livesdk.livesetting.level.LevelPrivilegeUnlockBubbleCacheLengthSetting;
import com.bytedance.android.livesdk.livesetting.level.LevelVaultCampaignBubbleCacheLengthSetting;
import com.bytedance.android.livesdk.livesetting.level.LevelVaultInvitationBubbleCacheLengthSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121590fID {
    public static final C1121590fID LIZ = new C1121590fID();
    public static final int LIZIZ = LevelPrivilegeBubbleCacheLengthSetting.INSTANCE.getValue();
    public static final int LIZJ = LevelPrivilegeUnlockBubbleCacheLengthSetting.INSTANCE.getValue();
    public static final int LIZLLL = LevelVaultCampaignBubbleCacheLengthSetting.INSTANCE.getValue();
    public static final int LJ = LevelVaultInvitationBubbleCacheLengthSetting.INSTANCE.getValue();

    public static void LIZ(Room room, String str, String str2, String str3, String str4) {
        long jLongValue;
        Long lValueOf;
        C480460Ism.LIZ().getClass();
        GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C480460Ism.LIZLLL(GiftRetrofitApi.class);
        if (room != null && (lValueOf = Long.valueOf(room.getId())) != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        giftRetrofitApi.reportGiftGuide(jLongValue, str2, 1, str, str3, str4).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Mc
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveGiftPrivilegeHelper@dd4a.notifyStrategyServer$1");
                C1C7U.LIZIZ("LiveGiftPrivilegeHelper@dd4a.notifyStrategyServer$1");
            }
        }, new C09JN() { // from class: X.00Md
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveGiftPrivilegeHelper@dd4a.notifyStrategyServer$2");
                C1C7U.LIZIZ("LiveGiftPrivilegeHelper@dd4a.notifyStrategyServer$2");
            }
        });
    }

    public static void LIZIZ(EnumC1120860fH2 enumC1120860fH2, String str, Room room, String str2, String str3) {
        String str4;
        String strSubstring;
        int iLJJJJI;
        String str5;
        String str6;
        String strSubstring2;
        int iLJJJJI2;
        String str7;
        String strSubstring3;
        int iLJJJJI3;
        String str8;
        String str9;
        String strSubstring4;
        int iLJJJJI4;
        String str10;
        if (enumC1120860fH2 == null) {
        }
        switch (C1121030fHJ.LIZ[enumC1120860fH2.ordinal()]) {
            case 1:
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append('+');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = LIZIZ;
                    if (i <= 0 || (strSubstring = InterfaceC1094160eZy.f2.LIZ()) == null) {
                        strSubstring = "";
                    }
                    int length = strSubstring.length();
                    if (length > i && (iLJJJJI = a0.LJJJJI(strSubstring, "+", (length - 1) - 1, 4)) >= 0) {
                        strSubstring = strSubstring.substring(iLJJJJI + 1, length);
                    }
                    C0JT6<String> c0jt6 = InterfaceC1094160eZy.f2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strSubstring);
                    sbLIZ2.append(strLIZIZ);
                    c0jt6.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (str == null) {
                    str = "";
                }
                LIZ(room, str, EnumC1123470fLF.GIFT_GUIDE_PREMIUM_SHOP_GIFT_GUIDE.getValue(), str2, str3);
                break;
            case 2:
                if (str == null) {
                    str = "";
                }
                LIZ(room, str, EnumC1123470fLF.GIFT_GUIDE_PRIVILEGE_GAIN_GIFT_GUIDE.getValue(), str2, str3);
                break;
            case 3:
                if (str == null) {
                    str = "";
                }
                LIZ(room, str, EnumC1123470fLF.GIFT_GUIDE_PRIVILEGE_CENTER_UPGRADE_GUIDE.getValue(), str2, str3);
                break;
            case 4:
                if (str2 == null) {
                    str5 = "";
                } else {
                    str5 = str2;
                }
                if (str == null) {
                    str6 = "";
                } else {
                    str6 = str;
                }
                try {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str5);
                    sbLIZ3.append('@');
                    sbLIZ3.append(str6);
                    sbLIZ3.append('+');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    int i2 = LIZJ;
                    if (i2 <= 0 || (strSubstring2 = InterfaceC1094160eZy.g2.LIZ()) == null) {
                        strSubstring2 = "";
                    }
                    int length2 = strSubstring2.length();
                    if (length2 > i2 && (iLJJJJI2 = a0.LJJJJI(strSubstring2, "+", (length2 - 1) - 1, 4)) >= 0) {
                        strSubstring2 = strSubstring2.substring(iLJJJJI2 + 1, length2);
                    }
                    C0JT6<String> c0jt62 = InterfaceC1094160eZy.g2;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strSubstring2);
                    sbLIZ4.append(strLIZIZ2);
                    c0jt62.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (str == null) {
                    str = "";
                }
                LIZ(room, str, EnumC1123470fLF.GIFT_GUIDE_PREMIUM_SHOP_UNLOCK_GIFT_GUIDE.getValue(), str2, str3);
                break;
            case 5:
                if (str == null) {
                    str7 = "";
                } else {
                    str7 = str;
                }
                try {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str7);
                    sbLIZ5.append('+');
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                    int i3 = LIZLLL;
                    if (i3 <= 0 || (strSubstring3 = InterfaceC1094160eZy.h2.LIZ()) == null) {
                        strSubstring3 = "";
                    }
                    int length3 = strSubstring3.length();
                    if (length3 > i3 && (iLJJJJI3 = a0.LJJJJI(strSubstring3, "+", (length3 - 1) - 1, 4)) >= 0) {
                        strSubstring3 = strSubstring3.substring(iLJJJJI3 + 1, length3);
                    }
                    C0JT6<String> c0jt63 = InterfaceC1094160eZy.h2;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(strSubstring3);
                    sbLIZ6.append(strLIZIZ3);
                    c0jt63.LIZJ(C2188811AlT.LIZIZ(sbLIZ6));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                if (str == null) {
                    str = "";
                }
                LIZ(room, str, EnumC1123470fLF.GIFT_GUIDE_PREMIUM_SHOP_CAMPAIGN_GUIDE.getValue(), str2, str3);
                break;
            case 6:
                if (str == null) {
                    str8 = "";
                } else {
                    str8 = str;
                }
                if (str3 == null) {
                    str9 = "";
                } else {
                    str9 = str3;
                }
                try {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(str8);
                    sbLIZ7.append('@');
                    sbLIZ7.append(str9);
                    sbLIZ7.append('+');
                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
                    int i4 = LJ;
                    if (i4 <= 0 || (strSubstring4 = InterfaceC1094160eZy.i2.LIZ()) == null) {
                        strSubstring4 = "";
                    }
                    int length4 = strSubstring4.length();
                    if (length4 > i4 && (iLJJJJI4 = a0.LJJJJI(strSubstring4, "+", (length4 - 1) - 1, 4)) >= 0) {
                        strSubstring4 = strSubstring4.substring(iLJJJJI4 + 1, length4);
                    }
                    C0JT6<String> c0jt64 = InterfaceC1094160eZy.i2;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(strSubstring4);
                    sbLIZ8.append(strLIZIZ4);
                    c0jt64.LIZJ(C2188811AlT.LIZIZ(sbLIZ8));
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                if (str == null) {
                    str = "";
                }
                LIZ(room, str, EnumC1123470fLF.GIFT_GUIDE_PREMIUM_SHOP_INVITATION_GUIDE.getValue(), str2, str3);
                break;
            case 7:
            case 8:
                if (str == null) {
                    str = "";
                }
                if (enumC1120860fH2 == EnumC1120860fH2.GAMEPLAY_GIFT) {
                    str10 = "privilege_gameplay_gift_bubble";
                } else {
                    str10 = "privilege_gameplay_upgrade_bubble";
                }
                LIZ(room, str, str10, str2, str3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (str == null) {
                    str = "";
                }
                LIZ(room, str, "privilege_level_up_blast_invite_bubble", str2, str3);
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("bubble_");
                sbLIZ9.append(enumC1120860fH2.getKey());
                String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ9);
                c1128760fTm.getClass();
                C1128760fTm.LJJIL(strLIZIZ5);
                break;
        }
    }
}
