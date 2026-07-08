package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.ContentConfiguration;
import com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration;
import com.bytedance.android.livesdk.livesetting.level.FansClubTaskPageInitSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubTaskPageSchemaSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubTaskPanelOptSetting;
import com.bytedance.android.livesdk.livesetting.level.GuidanceConfig;
import com.bytedance.android.livesdk.livesetting.level.IconConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubNewTextLanguageSetting;
import com.bytedance.android.livesdk.livesetting.level.TextConfig;
import com.bytedance.android.livesdk.livesetting.level.TextFormat;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.message.EntranceGuidanceContainer;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;
import qo2.w;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0eae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094580eae {
    public static final C1094580eae LIZ = new C1094580eae();

    public static String LIZLLL(long j) {
        if (j >= 1000000) {
            long j2 = 1 * j;
            if (j > 999000000) {
                j2 = 999000000;
            }
            String strJ4 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j2 * 1.0d) / ((double) 1000000))}, 1));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJI(strJ4));
            sbLIZ.append('M');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 1000) {
            String strJ42 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j * 1.0d) / ((double) LSPassThroughRecordSizeConfig.DEFAULT))}, 1));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJI(strJ42));
            sbLIZ2.append('K');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return String.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LJFF(com.bytedance.android.livesdk.model.message.common.Text r5) {
        /*
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r5.key
            if (r1 == 0) goto L3d
            X.0fNV r2 = X.C1124870fNV.LIZJ()
            java.lang.String r1 = r5.key
            r2.getClass()
            java.lang.String r1 = X.C1124870fNV.LIZIZ(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3d
            X.0fNV r2 = X.C1124870fNV.LIZJ()
            java.lang.String r1 = r5.key
            r2.getClass()
            java.lang.String r4 = X.C1124870fNV.LIZIZ(r1)
        L29:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L3c
            r3 = 0
            android.text.Spannable r2 = X.C1133830fbx.LJIILJJIL(r4, r5, r3)
            android.text.Spannable r1 = X.C1133830fbx.LIZ
            if (r2 == r1) goto L3c
            android.text.Spannable r0 = X.C1133830fbx.LJIILJJIL(r4, r5, r3)
        L3c:
            return r0
        L3d:
            java.lang.String r4 = r5.defaultPattern
            if (r4 != 0) goto L29
            r4 = r0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1094580eae.LJFF(com.bytedance.android.livesdk.model.message.common.Text):java.lang.CharSequence");
    }

    public static String LJI(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String strSubstring = str.substring(0, 4);
            if (u.LJIIZILJ(strSubstring, e3.d, false)) {
                return strSubstring.substring(0, 3);
            }
            return strSubstring;
        }
        return str;
    }

    public static boolean LJII(Gift gift) {
        Boolean boolValueOf;
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo != null) {
            boolValueOf = Boolean.valueOf(giftLockInfo.mLock);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) || !gift.isDisplayedOnPanel) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(TextView textView) {
        if (C13LQ.LJIILLIIL(C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale()), LiveFansClubNewTextLanguageSetting.INSTANCE.getValue()) && textView != null) {
            textView.setTextSize(1, 8.0f);
        }
    }

    public static Text LJIIJJI(TextConfig textConfig) {
        String str;
        String str2;
        int i;
        TextFormat textFormat;
        TextFormat textFormat2;
        TextFormat textFormat3;
        Text text = new Text();
        String str3 = null;
        if (textConfig != null) {
            str = textConfig.key;
        } else {
            str = null;
        }
        text.key = str;
        com.bytedance.android.livesdk.model.message.common.TextFormat textFormat4 = new com.bytedance.android.livesdk.model.message.common.TextFormat();
        if (textConfig == null || (textFormat3 = textConfig.defaultFormat) == null || (str2 = textFormat3.color) == null) {
            str2 = "";
        }
        textFormat4.color = str2;
        int i2 = 0;
        if (textConfig != null && (textFormat2 = textConfig.defaultFormat) != null) {
            i = textFormat2.weight;
        } else {
            i = 0;
        }
        textFormat4.weight = i;
        if (textConfig != null && (textFormat = textConfig.defaultFormat) != null) {
            i2 = textFormat.fontSize;
        }
        textFormat4.fontSize = Integer.valueOf(i2);
        text.defaultFormat = textFormat4;
        if (textConfig != null) {
            str3 = textConfig.defaultPattern;
        }
        text.defaultPattern = str3;
        return text;
    }

    public static String LJIIL(GuidanceConfig guidanceConfig) {
        String str;
        DisplayConfiguration displayConfiguration;
        ContentConfiguration contentConfiguration;
        IconConfig iconConfig;
        if (guidanceConfig == null || (displayConfiguration = guidanceConfig.displayConfiguration) == null || (contentConfiguration = displayConfiguration.contentConfiguration) == null || (iconConfig = contentConfiguration.icon) == null || (str = iconConfig.fileName) == null) {
            str = "";
        }
        if (!a0.LJJIIZI(str, ".png", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".png");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LJIILIIL(TextView textView) {
        String strLJIJI = C497740JfY.LJIJI(2131852384);
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        if (textView != null) {
            if (a0.LJJIIZI(strLJIJI, "New", false)) {
                strLJIJI = strLJIJI.toUpperCase(Locale.ROOT);
            }
            textView.setText(strLJIJI);
        }
    }

    public static Text LIZIZ(String str, String str2) {
        Text text = new Text();
        text.key = str;
        text.defaultPattern = str2;
        com.bytedance.android.livesdk.model.message.common.TextFormat textFormat = new com.bytedance.android.livesdk.model.message.common.TextFormat();
        textFormat.color = "#ffffff";
        textFormat.weight = 400;
        textFormat.italic = false;
        text.defaultFormat = textFormat;
        text.pieces = C13BV.INSTANCE;
        return text;
    }

    public static boolean LIZJ(DataChannel dataChannel, InterfaceC1095420ec0 interfaceC1095420ec0) {
        long j;
        long j2;
        User owner;
        User.FansClubInfo fansClubInfo;
        if (interfaceC1095420ec0 == null || dataChannel == null || !interfaceC1095420ec0.LIZ()) {
            return false;
        }
        C1095140ebY c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class);
        if (c1095140ebY != null) {
            j = c1095140ebY.LIZ;
        } else {
            j = 0;
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null && (owner = room.getOwner()) != null && (fansClubInfo = owner.fansClubInfo) != null) {
            j2 = fansClubInfo.fansLevel;
        } else {
            j2 = 0;
        }
        if (Math.max(j, j2) <= 0) {
            return false;
        }
        return true;
    }

    public static String LJ(C1094590eaf c1094590eaf, Map map) {
        String str;
        String str2;
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?");
        c495520Jby.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c495520Jby.LIZJ("roma_page_key", "roma_schema_page_user_main");
        c495520Jby.LIZJ("show_entrance", c1094590eaf.LIZ);
        c495520Jby.LIZJ("source_page", c1094590eaf.LIZ);
        if (c1094590eaf.LIZIZ) {
            str = "join";
        } else {
            str = "click";
        }
        c495520Jby.LIZJ("trigger_type", str);
        if (FansClubTaskPageInitSetting.INSTANCE.getValue()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c495520Jby.LIZJ("live_fans_task_ab_test", str2);
        w.LIZ.getClass();
        c495520Jby.LIZIZ(w.LJFF(), "start_watch_time");
        c495520Jby.LIZ(FansClubTaskPanelOptSetting.INSTANCE.getValue(), "live_fans_club_task_panel_opt");
        c495520Jby.LIZJ("roma_default_schema", FansClubTaskPageSchemaSetting.INSTANCE.getValue());
        c495520Jby.LIZJ("is_super_fan_upgrade", c1094590eaf.LJI);
        String str3 = c1094590eaf.LJII;
        if (str3 == null) {
            str3 = "other";
        }
        c495520Jby.LIZJ("direct_source_page", str3);
        if (!TextUtils.isEmpty(c1094590eaf.LJFF)) {
            c495520Jby.LIZJ("from_badge_status", c1094590eaf.LJFF);
        }
        C1094580eae c1094580eae = LIZ;
        boolean z = c1094590eaf.LIZJ;
        EnumC1095860eci enumC1095860eci = c1094590eaf.LIZLLL;
        c1094580eae.getClass();
        LIZ(c495520Jby, z, enumC1095860eci);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return c495520Jby.LIZLLL();
    }

    public static void LJIIIZ(DataChannel dataChannel, FansEventData.EntranceGuidanceData entranceGuidanceData) {
        EntranceGuidanceContainer entranceGuidanceContainer;
        Map<String, String> map;
        String strLIZIZ;
        long id;
        if (dataChannel != null && entranceGuidanceData != null && (entranceGuidanceContainer = entranceGuidanceData.entranceGuidanceContainer) != null && (map = entranceGuidanceContainer.extra) != null) {
            String str = map.get("system_message_default_pattern");
            String str2 = map.get("system_message_text_key");
            String str3 = map.get("system_message_decoration_key");
            String str4 = map.get("system_message_user_name");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str3)) {
                    strLIZIZ = "";
                } else {
                    C1124870fNV.LIZJ().getClass();
                    strLIZIZ = C1124870fNV.LIZIZ(str3);
                }
                Room room = (Room) dataChannel.gg0(RoomChannel.class);
                TextPiece textPiece = new TextPiece();
                EnumC1133850fbz enumC1133850fbz = EnumC1133850fbz.STRING;
                textPiece.type = enumC1133850fbz.getPieceType();
                textPiece.stringValue = str4;
                com.bytedance.android.livesdk.model.message.common.TextFormat textFormat = new com.bytedance.android.livesdk.model.message.common.TextFormat();
                textFormat.color = "#ffffff";
                textPiece.format = textFormat;
                TextPiece textPiece2 = new TextPiece();
                textPiece2.type = enumC1133850fbz.getPieceType();
                textPiece2.stringValue = strLIZIZ;
                com.bytedance.android.livesdk.model.message.common.TextFormat textFormat2 = new com.bytedance.android.livesdk.model.message.common.TextFormat();
                textFormat2.color = "#ffffff";
                textPiece2.format = textFormat2;
                Text text = new Text();
                text.key = str2;
                text.defaultPattern = str;
                com.bytedance.android.livesdk.model.message.common.TextFormat textFormat3 = new com.bytedance.android.livesdk.model.message.common.TextFormat();
                textFormat3.color = "#ffffff";
                text.defaultFormat = textFormat3;
                text.pieces = C1697810uHb.LJIIJJI(textPiece, textPiece2);
                CommonMessageData commonMessageData = new CommonMessageData();
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                commonMessageData.roomId = id;
                commonMessageData.showMsg = true;
                commonMessageData.messageId = C158B.LIZ();
                commonMessageData.foldType = 0L;
                commonMessageData.createTime = C158B.LIZ();
                commonMessageData.displayText = text;
                RoomMessage roomMessage = new RoomMessage();
                roomMessage.isLocalInsertMsg = true;
                roomMessage.scene = "community_redemption";
                roomMessage.LL = Integer.valueOf(R.raw.icon_heart_split);
                roomMessage.baseMessage = commonMessageData;
                IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(roomMessage, true);
                }
            }
        }
    }

    public static C495520Jby LJIIJ(String str, boolean z) {
        String str2;
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?");
        c495520Jby.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c495520Jby.LIZJ("roma_page_key", "roma_schema_page_anchor_main");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c495520Jby.LIZJ("switch_tab", str2);
        c495520Jby.LIZJ("source_page", str);
        return c495520Jby;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C495520Jby r3, boolean r4, X.EnumC1095860eci r5) {
        /*
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_marquee_effect_show"
            r3.LIZJ(r0, r1)
            if (r5 == 0) goto L37
            int[] r1 = X.C1094600eag.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L34
            r0 = 2
            if (r1 != r0) goto L37
            java.lang.String r1 = "points_to_claim"
        L25:
            java.lang.String r0 = "entrance_animation_type"
            r3.LIZJ(r0, r1)
            java.lang.String r2 = "entrance_click_ts"
            long r0 = java.lang.System.currentTimeMillis()
            r3.LIZIZ(r0, r2)
            return
        L34:
            java.lang.String r1 = "about_to_upgrade"
            goto L25
        L37:
            java.lang.String r1 = ""
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1094580eae.LIZ(X.0Jby, boolean, X.0eci):void");
    }

    public static void LJIILJJIL(C16F5 c16f5, List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(C497740JfY.LJI(0, (String) it2.next())));
        }
        TextPaint paint = c16f5.getPaint();
        if (paint != null) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, (int) paint.measureText(str), 0.0f, C13LP.LLII(arrayList), (float[]) null, Shader.TileMode.CLAMP));
        }
        c16f5.setText(str);
    }
}
