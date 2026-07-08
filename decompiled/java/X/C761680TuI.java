package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS55S0010000_12;

/* JADX INFO: renamed from: X.0TuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761680TuI {
    public static boolean LIZ;

    public static void LIZJ(DataChannel dataChannel, boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sound_panel_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (z) {
            str = "shortcut";
        } else {
            str = "normal";
        }
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJIIZ(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LIZ)) ? 1 : 0), "is_live_take_default", new AwS55S0010000_12(z, 3));
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(DataChannel dataChannel, EnumC761690TuJ enumC761690TuJ, long j) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sound_position_button_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(enumC761690TuJ.getStr(), "button_type");
        c474500IjALIZ.LJJIIZ(Long.valueOf(j), "effect_id", new AwS556S0100000_12(enumC761690TuJ, 688));
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(long j, DataChannel dataChannel, boolean z) {
        String str;
        if (j == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sound_panel_duration");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (z) {
            str = "shortcut";
        } else {
            str = "normal";
        }
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(DataChannel dataChannel, TreeMap treeMap, List list, EnumC761670TuH enumC761670TuH) {
        long j;
        if (treeMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            arrayList.add(Integer.valueOf(((C781670UlR) entry.getValue()).LIZ + 1));
            SoundEffect soundEffect = (SoundEffect) C13LP.LJJJLZIJ(((C781670UlR) entry.getValue()).LIZ, list);
            if (soundEffect != null) {
                j = soundEffect.id;
            } else {
                j = 0;
            }
            arrayList2.add(Long.valueOf(j));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sound_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(arrayList.toString(), "sound_position");
        c474500IjALIZ.LJJII(arrayList2.toString(), "effect_id_set");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        c474500IjALIZ.LJJII(enumC761670TuH.getStr(), "panel_type");
        c474500IjALIZ.LIZ();
    }
}
