package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.List;

/* JADX INFO: renamed from: X.0fbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133690fbj {
    public static final C1133690fbj LIZ = new C1133690fbj();

    public static String LIZIZ(GiftMessage giftMessage) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        User user;
        User user2;
        StringBuilder sb = new StringBuilder(90);
        Long lValueOf4 = null;
        if (giftMessage != null) {
            lValueOf = Long.valueOf(giftMessage.giftId);
        } else {
            lValueOf = null;
        }
        sb.append(lValueOf);
        if (giftMessage != null && (user2 = giftMessage.fromUser) != null) {
            lValueOf2 = Long.valueOf(user2.getId());
        } else {
            lValueOf2 = null;
        }
        sb.append(lValueOf2);
        if (giftMessage != null && (user = giftMessage.toUser) != null) {
            lValueOf3 = Long.valueOf(user.getId());
        } else {
            lValueOf3 = null;
        }
        sb.append(lValueOf3);
        if (giftMessage != null) {
            lValueOf4 = Long.valueOf(giftMessage.groupId);
        }
        sb.append(lValueOf4);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LIZJ(com.bytedance.android.livesdk.model.message.common.Text r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L44
            java.lang.String r1 = r5.key
        L5:
            java.lang.String r0 = ""
            if (r1 == 0) goto L3c
            X.0fNV r2 = X.C1124870fNV.LIZJ()
            java.lang.String r1 = r5.key
            r2.getClass()
            java.lang.String r1 = X.C1124870fNV.LIZIZ(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3e
            X.0fNV r2 = X.C1124870fNV.LIZJ()
            java.lang.String r1 = r5.key
            r2.getClass()
            java.lang.String r3 = X.C1124870fNV.LIZIZ(r1)
        L29:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L3b
            android.text.Spannable r2 = X.C1133830fbx.LJIILJJIL(r3, r5, r4)
            android.text.Spannable r1 = X.C1133830fbx.LIZ
            if (r2 == r1) goto L3b
            android.text.Spannable r0 = X.C1133830fbx.LJIILJJIL(r3, r5, r4)
        L3b:
            return r0
        L3c:
            if (r5 == 0) goto L42
        L3e:
            java.lang.String r3 = r5.defaultPattern
            if (r3 != 0) goto L29
        L42:
            r3 = r0
            goto L29
        L44:
            r1 = r4
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133690fbj.LIZJ(com.bytedance.android.livesdk.model.message.common.Text):java.lang.CharSequence");
    }

    public static boolean LIZLLL(C1135810ff9 c1135810ff9) {
        GiftMessage giftMessage;
        if (!LJFF(c1135810ff9)) {
            return false;
        }
        if (c1135810ff9 != null) {
            giftMessage = c1135810ff9.LIZ;
        } else {
            giftMessage = null;
        }
        AssetsModel assetsModelLIZJ = C1133680fbi.LIZJ(giftMessage);
        if (assetsModelLIZJ == null || assetsModelLIZJ.resourceType != AssetsModel.RESOURCE_TYPE_MP4) {
            return false;
        }
        return true;
    }

    public static boolean LJ(C1135810ff9 c1135810ff9) {
        Gift gift;
        GiftMessage giftMessage;
        if (!LJFF(c1135810ff9)) {
            if (c1135810ff9 != null && (giftMessage = c1135810ff9.LIZ) != null) {
                gift = giftMessage.mGift;
            } else {
                gift = null;
            }
            if (!LJII(gift)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LJFF(C1135810ff9 c1135810ff9) {
        Gift gift;
        if (c1135810ff9 == null) {
            return false;
        }
        EnumC743790TFp enumC743790TFp = c1135810ff9.LJIIIIZZ;
        if (enumC743790TFp == EnumC743790TFp.VIDEO_ONLY) {
            return true;
        }
        if (enumC743790TFp == EnumC743790TFp.TRAY_ONLY) {
            return false;
        }
        C1133690fbj c1133690fbj = LIZ;
        GiftMessage giftMessage = c1135810ff9.LIZ;
        if (giftMessage != null) {
            gift = giftMessage.mGift;
        } else {
            gift = null;
        }
        c1133690fbj.getClass();
        return LJI(gift);
    }

    public static boolean LJI(Gift gift) {
        Integer numValueOf;
        if (gift != null) {
            numValueOf = Integer.valueOf(gift.type);
        } else {
            numValueOf = null;
        }
        return C1135870ffF.LJIILL(numValueOf);
    }

    public static boolean LJII(Gift gift) {
        Integer numValueOf;
        if (gift != null) {
            numValueOf = Integer.valueOf(gift.type);
        } else {
            numValueOf = null;
        }
        return C1135870ffF.LJIILJJIL(numValueOf);
    }

    public static boolean LJIIIZ(GiftMessage giftMessage) {
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        if (giftMessage != null) {
            List<GiftMessage.SponsorshipInfo> list = giftMessage.sponsorshipInfo;
            if ((list != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list)) != null && sponsorshipInfo.giftGalleryClickSponsor) || giftMessage.multiGenerateMessage) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJIIIIZZ(C1135810ff9 c1135810ff9, C1135810ff9 c1135810ff92) {
        long messageId;
        Integer numValueOf;
        List<GiftMessage.SponsorshipInfo> list;
        GiftMessage giftMessage = c1135810ff9.LIZ;
        Integer numValueOf2 = null;
        if (giftMessage != null) {
            GiftMessage giftMessage2 = c1135810ff92.LIZ;
            if (giftMessage2 != null) {
                list = giftMessage2.sponsorshipInfo;
            } else {
                list = null;
            }
            giftMessage.sponsorshipInfo = list;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("merge from ");
        GiftMessage giftMessage3 = c1135810ff92.LIZ;
        long messageId2 = 0;
        if (giftMessage3 != null) {
            messageId = giftMessage3.getMessageId();
        } else {
            messageId = 0;
        }
        long j = 100;
        sbLIZ.append(messageId % j);
        sbLIZ.append(" to ");
        GiftMessage giftMessage4 = c1135810ff9.LIZ;
        if (giftMessage4 != null) {
            messageId2 = giftMessage4.getMessageId();
        }
        sbLIZ.append(messageId2 % j);
        sbLIZ.append(": ");
        sbLIZ.append(C1132700fa8.LJIILIIL(c1135810ff9));
        sbLIZ.append(" other.combo ");
        GiftMessage giftMessage5 = c1135810ff92.LIZ;
        if (giftMessage5 != null) {
            numValueOf = Integer.valueOf(giftMessage5.comboCount);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" this.combo ");
        GiftMessage giftMessage6 = c1135810ff9.LIZ;
        if (giftMessage6 != null) {
            numValueOf2 = Integer.valueOf(giftMessage6.comboCount);
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LJIIIZ("LiveGiftGeneralTrayMessageHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int LIZ(int i, int i2, boolean z) {
        if (!z) {
            return 1;
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf != null) {
            numValueOf.intValue();
            if (C1135870ffF.LJIILL(numValueOf) || C1135870ffF.LJIILJJIL(numValueOf)) {
                return i;
            }
        }
        if (i == 1) {
            return 1;
        }
        return 2;
    }
}
