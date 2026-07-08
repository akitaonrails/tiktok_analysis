package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.level.BarrageEnterRoomResConfig;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.LevelSystemResourceConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveLevelRenderEffectABControlSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveLevelSystemResourceSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eUW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090780eUW {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(164));

    public static boolean LIZ(BarrageMessage barrageMessage) {
        String str;
        Integer numValueOf = Integer.valueOf(LJI(barrageMessage));
        if (numValueOf.intValue() <= -1) {
            return false;
        }
        BarrageGradeResConfig barrageGradeResConfigLJIIJJI = LJIIJJI(numValueOf.intValue(), barrageMessage.msgType);
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if (iHostResource == null) {
            return false;
        }
        if (barrageGradeResConfigLJIIJJI == null || (str = barrageGradeResConfigLJIIJJI.barrageChannel) == null) {
            str = "";
        }
        return iHostResource.u61(str);
    }

    public static Text LIZIZ(int i) {
        Text text = new Text();
        text.key = "pm_mt_alp_reach_animation_text_1New";
        text.defaultPattern = C497740JfY.LJIJI(2131840953);
        TextPiece textPiece = new TextPiece();
        textPiece.type = EnumC1133850fbz.USER.getPieceType();
        textPiece.format = new TextFormat();
        TextPiece textPiece2 = new TextPiece();
        textPiece2.type = EnumC1133850fbz.STRING.getPieceType();
        textPiece2.stringValue = String.valueOf(i);
        TextFormat textFormat = new TextFormat();
        textFormat.color = "#ffffff";
        textPiece2.format = textFormat;
        text.pieces = C1697810uHb.LJIIJJI(textPiece, textPiece2);
        return text;
    }

    public static Text LIZJ(int i) {
        String strLJIJI = C497740JfY.LJIJI(2131841660);
        Text text = new Text();
        text.key = "pm_fan_live_upgrade_bullet_client";
        text.defaultPattern = strLJIJI;
        TextFormat textFormat = new TextFormat();
        textFormat.color = "#ffffff";
        textFormat.weight = 400;
        textFormat.italic = false;
        text.defaultFormat = textFormat;
        TextPiece textPiece = new TextPiece();
        textPiece.type = EnumC1133850fbz.STRING.getPieceType();
        textPiece.stringValue = String.valueOf(i);
        TextFormat textFormat2 = new TextFormat();
        textFormat2.color = "#ffffff";
        textPiece.format = textFormat2;
        text.pieces = Collections.singletonList(textPiece);
        return text;
    }

    public static Text LIZLLL(int i) {
        String strLJIJI = C497740JfY.LJIJI(2131840952);
        Text text = new Text();
        text.key = "pm_alp_reach_animation_client";
        text.defaultPattern = strLJIJI;
        TextFormat textFormat = new TextFormat();
        textFormat.color = "#ffffff";
        textFormat.weight = 400;
        textFormat.italic = false;
        text.defaultFormat = textFormat;
        TextPiece textPiece = new TextPiece();
        textPiece.type = EnumC1133850fbz.STRING.getPieceType();
        textPiece.stringValue = String.valueOf(i);
        TextFormat textFormat2 = new TextFormat();
        textFormat2.color = "#ffffff";
        textPiece.format = textFormat2;
        text.pieces = Collections.singletonList(textPiece);
        return text;
    }

    public static boolean LJ(BarrageMessage barrageMessage) {
        int i = barrageMessage.msgType;
        if (i != 10 && i != 11) {
            return false;
        }
        return true;
    }

    public static BarrageEnterRoomResConfig LJFF(int i) {
        boolean z;
        int i2;
        List<BarrageEnterRoomResConfig> list;
        int i3;
        if (((Number) C1090790eUX.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        BarrageEnterRoomResConfig barrageEnterRoomResConfig = null;
        if (z) {
            LevelSystemResourceConfig levelSystemResConfig = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
            if (levelSystemResConfig == null || (list = levelSystemResConfig.levelBarrageEnterRoomConfigList) == null || !(!list.isEmpty())) {
                return null;
            }
            Iterator<BarrageEnterRoomResConfig> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BarrageEnterRoomResConfig next = it2.next();
                BarrageEnterRoomResConfig barrageEnterRoomResConfig2 = next;
                if (barrageEnterRoomResConfig2 != null) {
                    i3 = barrageEnterRoomResConfig2.level;
                } else {
                    i3 = 0;
                }
                if (i <= i3) {
                    barrageEnterRoomResConfig = next;
                    break;
                }
            }
            return barrageEnterRoomResConfig;
        }
        List<BarrageEnterRoomResConfig> list2 = UserLevelSettings.INSTANCE.getUserLevelConfig().barrageEnterRoomConfigList;
        if (list2 == null || !(!list2.isEmpty())) {
            return null;
        }
        Iterator<BarrageEnterRoomResConfig> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            BarrageEnterRoomResConfig next2 = it3.next();
            BarrageEnterRoomResConfig barrageEnterRoomResConfig3 = next2;
            if (barrageEnterRoomResConfig3 != null) {
                i2 = barrageEnterRoomResConfig3.level;
            } else {
                i2 = 0;
            }
            if (i <= i2) {
                barrageEnterRoomResConfig = next2;
                break;
            }
        }
        return barrageEnterRoomResConfig;
    }

    public static int LJI(BarrageMessage barrageMessage) {
        if (barrageMessage == null) {
            return -1;
        }
        switch (barrageMessage.msgType) {
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                if (barrageTypeUserGradeParam == null) {
                    return -1;
                }
                return barrageTypeUserGradeParam.currentGrade;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                if (barrageTypeFansLevelParam == null) {
                    return -1;
                }
                return barrageTypeFansLevelParam.currentGrade;
            default:
                return -1;
        }
    }

    public static int LJII(BarrageMessage barrageMessage) {
        BarrageTypeFansLevelParam barrageTypeFansLevelParam;
        int i = barrageMessage.msgType;
        if (i != 8) {
            if (i != 10 || (barrageTypeFansLevelParam = barrageMessage.fansLevelParam) == null) {
                return -1;
            }
            return barrageTypeFansLevelParam.displayConfig;
        }
        BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
        if (barrageTypeUserGradeParam == null) {
            return -1;
        }
        return barrageTypeUserGradeParam.displayConfig;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static User LJIIIIZZ(BarrageMessage barrageMessage) {
        if (barrageMessage != null) {
            switch (barrageMessage.msgType) {
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                    BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                    if (barrageTypeUserGradeParam != null) {
                        return barrageTypeUserGradeParam.user;
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                    BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                    if (barrageTypeFansLevelParam == null) {
                        return null;
                    }
                    return barrageTypeFansLevelParam.user;
            }
        }
        return null;
    }

    public static String LJIIIZ(BarrageMessage barrageMessage) {
        User user;
        String string;
        String str;
        if (barrageMessage != null) {
            switch (barrageMessage.msgType) {
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                    BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                    if (barrageTypeUserGradeParam == null || (str = barrageTypeUserGradeParam.userId) == null) {
                        return "";
                    }
                    return str;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                    BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                    if (barrageTypeFansLevelParam == null || (user = barrageTypeFansLevelParam.user) == null || (string = Long.valueOf(user.getId()).toString()) == null) {
                        return "";
                    }
                    return string;
                default:
                    String str2 = barrageMessage.subType;
                    if (Intrinsics.LJFF(str2, "ecom_live_pdp") || Intrinsics.LJFF(str2, "ecom_live_plp")) {
                        return "ecom";
                    }
                    break;
            }
        }
        return "";
    }

    public static BarrageEnterRoomResConfig LJIIJ(int i) {
        boolean z;
        int i2;
        List<BarrageEnterRoomResConfig> list;
        int i3;
        if (((Number) C1090790eUX.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        BarrageEnterRoomResConfig barrageEnterRoomResConfig = null;
        if (z) {
            LevelSystemResourceConfig levelSystemResConfig = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
            if (levelSystemResConfig == null || (list = levelSystemResConfig.fansBarrageEnterRoomConfigList) == null || !(!list.isEmpty())) {
                return null;
            }
            Iterator<BarrageEnterRoomResConfig> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BarrageEnterRoomResConfig next = it2.next();
                BarrageEnterRoomResConfig barrageEnterRoomResConfig2 = next;
                if (barrageEnterRoomResConfig2 != null) {
                    i3 = barrageEnterRoomResConfig2.level;
                } else {
                    i3 = 0;
                }
                if (i <= i3) {
                    barrageEnterRoomResConfig = next;
                    break;
                }
            }
            return barrageEnterRoomResConfig;
        }
        List<BarrageEnterRoomResConfig> list2 = FansClubSettings.INSTANCE.getFansClubConfig().barrageEnterRoomConfigList;
        if (list2 == null || !(!list2.isEmpty())) {
            return null;
        }
        Iterator<BarrageEnterRoomResConfig> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            BarrageEnterRoomResConfig next2 = it3.next();
            BarrageEnterRoomResConfig barrageEnterRoomResConfig3 = next2;
            if (barrageEnterRoomResConfig3 != null) {
                i2 = barrageEnterRoomResConfig3.level;
            } else {
                i2 = 0;
            }
            if (i <= i2) {
                barrageEnterRoomResConfig = next2;
                break;
            }
        }
        return barrageEnterRoomResConfig;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIL(com.bytedance.android.livesdk.model.message.BarrageMessage r2) {
        /*
            int r0 = r2.msgType
            r1 = 0
            switch(r0) {
                case 8: goto L7;
                case 9: goto L7;
                case 10: goto Ld;
                case 11: goto Ld;
                default: goto L6;
            }
        L6:
            return r1
        L7:
            com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam r0 = r2.userGradeParam
            if (r0 == 0) goto L6
            r1 = 1
            return r1
        Ld:
            com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam r0 = r2.fansLevelParam
            if (r0 == 0) goto L12
            r1 = 1
        L12:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090780eUW.LJIIL(com.bytedance.android.livesdk.model.message.BarrageMessage):boolean");
    }

    public static boolean LJIILIIL(BarrageMessage barrageMessage) {
        String strLJIIIZ = LJIIIZ(barrageMessage);
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (!TextUtils.isEmpty(strValueOf) && TextUtils.equals(strLJIIIZ, strValueOf)) {
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(BarrageMessage barrageMessage) {
        int i = barrageMessage.msgType;
        if (i != 8 && i != 9 && !LJ(barrageMessage)) {
            return false;
        }
        return true;
    }

    public static BarrageGradeResConfig LJIIJJI(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        List<BarrageGradeResConfig> list;
        int i5;
        List<BarrageGradeResConfig> list2;
        int i6;
        if (LiveLevelRenderEffectABControlSetting.INSTANCE.getValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z && i2 == 10 && i >= 30 && i <= 39) {
            return new BarrageGradeResConfig(0, "", "", "", "levelup30-offset", Mp4ScreenVideoLoadTimeout.CONTROL, "video", "gbl_privilege_alpha_player_effect");
        }
        if (((Number) C1090790eUX.LIZ.getValue()).intValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        BarrageGradeResConfig barrageGradeResConfig = null;
        if (z2) {
            if (i2 == 10) {
                LevelSystemResourceConfig levelSystemResConfig = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
                if (levelSystemResConfig == null || (list2 = levelSystemResConfig.fansBarrageResConfigList) == null || !(!list2.isEmpty())) {
                    return null;
                }
                Iterator<BarrageGradeResConfig> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    BarrageGradeResConfig next = it2.next();
                    BarrageGradeResConfig barrageGradeResConfig2 = next;
                    if (barrageGradeResConfig2 != null) {
                        i6 = barrageGradeResConfig2.level;
                    } else {
                        i6 = 0;
                    }
                    if (i <= i6) {
                        barrageGradeResConfig = next;
                        break;
                    }
                }
                return barrageGradeResConfig;
            }
            LevelSystemResourceConfig levelSystemResConfig2 = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
            if (levelSystemResConfig2 == null || (list = levelSystemResConfig2.levelBarrageResConfigList) == null || !(!list.isEmpty())) {
                return null;
            }
            Iterator<BarrageGradeResConfig> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                BarrageGradeResConfig next2 = it3.next();
                BarrageGradeResConfig barrageGradeResConfig3 = next2;
                if (barrageGradeResConfig3 != null) {
                    i5 = barrageGradeResConfig3.level;
                } else {
                    i5 = 0;
                }
                if (i <= i5) {
                    barrageGradeResConfig = next2;
                    break;
                }
            }
            return barrageGradeResConfig;
        }
        if (i2 == 10) {
            List<BarrageGradeResConfig> list3 = FansClubSettings.INSTANCE.getFansClubConfig().barrageResConfigList;
            if (list3 == null || !(!list3.isEmpty())) {
                return null;
            }
            Iterator<BarrageGradeResConfig> it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                BarrageGradeResConfig next3 = it4.next();
                BarrageGradeResConfig barrageGradeResConfig4 = next3;
                if (barrageGradeResConfig4 != null) {
                    i4 = barrageGradeResConfig4.level;
                } else {
                    i4 = 0;
                }
                if (i <= i4) {
                    barrageGradeResConfig = next3;
                    break;
                }
            }
            return barrageGradeResConfig;
        }
        List<BarrageGradeResConfig> list4 = UserLevelSettings.INSTANCE.getUserLevelConfig().barrageResConfigList;
        if (list4 == null || !(!list4.isEmpty())) {
            return null;
        }
        Iterator<BarrageGradeResConfig> it5 = list4.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            BarrageGradeResConfig next4 = it5.next();
            BarrageGradeResConfig barrageGradeResConfig5 = next4;
            if (barrageGradeResConfig5 != null) {
                i3 = barrageGradeResConfig5.level;
            } else {
                i3 = 0;
            }
            if (i <= i3) {
                barrageGradeResConfig = next4;
                break;
            }
        }
        return barrageGradeResConfig;
    }
}
