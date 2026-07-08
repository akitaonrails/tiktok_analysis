package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0OPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618930OPj {
    public static final C618930OPj LIZ = new C618930OPj();

    public static void LIZ(DmMessageConfig dmMessageConfig) {
        DspPlatform dspPlatform;
        HashMap map = new HashMap();
        map.put("enter_from", "dsp2tt");
        if (dmMessageConfig != null) {
            String str = dmMessageConfig.entityUri;
            if (str != null) {
                map.put("entity_uri", str);
            }
            String str2 = dmMessageConfig.musicId;
            if (str2 != null) {
                map.put("clip_id", str2);
            }
            String str3 = dmMessageConfig.title;
            if (str3 != null) {
                map.put("dsp2tt_title", str3);
            }
            String str4 = dmMessageConfig.subtitle;
            if (str4 != null) {
                map.put("dsp2tt_sub_title", str4);
            }
        }
        map.put("volume_level", String.valueOf((int) (C2179771ASp.LJIIIIZZ() * ((double) 100))));
        if (dmMessageConfig != null && (dspPlatform = dmMessageConfig.dspPlatform) != null) {
            map.put("share_from_dsp", dspPlatform.getEventName());
        }
        C20684815ws.LJIILLIIL("music_card_play", map);
    }

    public static void LIZIZ(DmMessageConfig dmMessageConfig, float f, boolean z) {
        String str;
        DspPlatform dspPlatform;
        HashMap map = new HashMap();
        map.put("enter_from", "dsp2tt");
        if (dmMessageConfig != null) {
            String str2 = dmMessageConfig.entityUri;
            if (str2 != null) {
                map.put("entity_uri", str2);
            }
            String str3 = dmMessageConfig.musicId;
            if (str3 != null) {
                map.put("clip_id", str3);
            }
            String str4 = dmMessageConfig.title;
            if (str4 != null) {
                map.put("dsp2tt_title", str4);
            }
            String str5 = dmMessageConfig.subtitle;
            if (str5 != null) {
                map.put("dsp2tt_sub_title", str5);
            }
        }
        map.put("volume_level", String.valueOf((int) (C2179771ASp.LJIIIIZZ() * ((double) 100))));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_finish", str);
        map.put("play_percent", String.valueOf((int) (f * 100)));
        if (dmMessageConfig != null && (dspPlatform = dmMessageConfig.dspPlatform) != null) {
            map.put("share_from_dsp", dspPlatform.getEventName());
        }
        C20684815ws.LJIILLIIL("play_music_card_end", map);
    }
}
