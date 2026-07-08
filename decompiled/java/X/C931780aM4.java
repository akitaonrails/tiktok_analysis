package X;

import com.bytedance.android.livesdk.comp.api.linkcore.api.VoiceChatLayoutRefactorAnchorSetting;
import com.bytedance.android.livesdk.comp.api.linkcore.api.VoiceChatLayoutRefactorAudienceSetting;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0aM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931780aM4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(502));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(412));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(501));
    public static volatile boolean LIZLLL;

    public static boolean LIZ() {
        return LinkCoreModelKt.currentUserIsAnchor() ? LJFF(null) && LIZLLL() : LJFF(null) && LIZLLL();
    }

    public static boolean LIZIZ() {
        if (!LIZ()) {
            return false;
        }
        if (!LinkCoreModelKt.currentUserIsAnchor()) {
            Integer numLJ = C931820aM8.LJ("multi_guest_layout_function_voice");
            if (numLJ == null || (numLJ.intValue() & 1) <= 0) {
                return false;
            }
        } else if ((LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_layout_function_voice") & 1) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ() {
        if (!LIZ()) {
            return false;
        }
        if (!LinkCoreModelKt.currentUserIsAnchor()) {
            Integer numLJ = C931820aM8.LJ("multi_guest_layout_function_voice");
            if (numLJ == null || (numLJ.intValue() & 2) <= 0) {
                return false;
            }
        } else if ((LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_layout_function_voice") & 2) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL() {
        if (!LinkCoreModelKt.currentUserIsAnchor()) {
            Boolean boolLIZLLL = C931820aM8.LIZLLL("linkmic_sdk_layout_refactor_voice");
            if (boolLIZLLL == null || !boolLIZLLL.booleanValue() || !VoiceChatLayoutRefactorAudienceSetting.INSTANCE.getEnable()) {
                return false;
            }
            if (LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().optNotMatchGuest) {
                if ((!a0.LJJJIL((String) LIZIZ.getValue())) && (!a0.LJJJIL((String) LIZJ.getValue()))) {
                    return true;
                }
                if (LIZLLL) {
                    return false;
                }
                LIZLLL = true;
                C1304660k3U.LIZ.LIZIZ(90001, "dolphin not match", new Throwable("dolphin not match"), null);
                return false;
            }
        } else if (!LiveAbLabelSetting.INSTANCE.getBooleanValue("linkmic_sdk_layout_refactor_voice") || !VoiceChatLayoutRefactorAnchorSetting.INSTANCE.getEnable()) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Room room) {
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            if (LJFF(room) && LIZLLL()) {
                return true;
            }
            return false;
        }
        if (LJFF(room) && LIZLLL()) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Room room) {
        if (room == null) {
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        }
        return C781520UlC.LJFF(room);
    }
}
