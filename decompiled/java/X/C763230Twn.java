package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Twn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763230Twn {
    public static MusicSong LIZ;
    public static String LIZIZ;

    public static void LIZLLL() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_play");
        c474500IjALIZ.LJIL();
        MusicSong musicSong = LIZ;
        c474500IjALIZ.LJJII(musicSong != null ? Long.valueOf(musicSong.id) : null, "music_id");
        MusicSong musicSong2 = LIZ;
        c474500IjALIZ.LJJII(musicSong2 != null ? musicSong2.title : null, "music_name");
        MusicSong musicSong3 = LIZ;
        c474500IjALIZ.LJJII(musicSong3 != null ? musicSong3.author : null, "artist_name");
        MusicSong musicSong4 = LIZ;
        c474500IjALIZ.LJJII(musicSong4 != null ? musicSong4.previewUrl : null, "music_url");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        c474500IjALIZ.LJJII("decorate", "enter_from");
        c474500IjALIZ.LIZ();
        LIZIZ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
    }

    public static void LIZJ(int i, String str) {
        Long lValueOf;
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_play_duration");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "is_finish");
        MusicSong musicSong = LIZ;
        String str4 = null;
        if (musicSong != null) {
            lValueOf = Long.valueOf(musicSong.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "music_id");
        MusicSong musicSong2 = LIZ;
        if (musicSong2 != null) {
            str2 = musicSong2.title;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "music_name");
        MusicSong musicSong3 = LIZ;
        if (musicSong3 != null) {
            str3 = musicSong3.author;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "artist_name");
        MusicSong musicSong4 = LIZ;
        if (musicSong4 != null) {
            str4 = musicSong4.previewUrl;
        }
        c474500IjALIZ.LJJII(str4, "music_url");
        c474500IjALIZ.LJJII(LIZIZ, "select_scene");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(DataChannel dataChannel, MusicSong musicSong) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(1, "is_shortcut_panel");
        c474500IjALIZ.LJJII(1, "music_position");
        if (musicSong != null) {
            lValueOf = Long.valueOf(musicSong.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "music_id_set");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(DataChannel dataChannel, String str, String str2) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_request_button_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str2, "button_type");
        MusicSong musicSong = LIZ;
        if (musicSong != null) {
            lValueOf = Long.valueOf(musicSong.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "music_id");
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJII(str2, "button_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(DataChannel dataChannel, String str, MusicSong musicSong) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_remove");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "click_type");
        if (musicSong != null) {
            c474500IjALIZ.LJJII(Long.valueOf(musicSong.id), "music_id");
            c474500IjALIZ.LJJII(musicSong.title, "music_name");
            c474500IjALIZ.LJJII(musicSong.author, "artist_name");
            c474500IjALIZ.LJJII(musicSong.previewUrl, "music_url");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(DataChannel dataChannel, TreeMap treeMap, List list, boolean z) {
        MusicSong musicSong;
        long j;
        if (!treeMap.isEmpty() && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : treeMap.entrySet()) {
                int i = ((C781670UlR) entry.getValue()).LIZ;
                if (!z) {
                    i++;
                }
                arrayList.add(Integer.valueOf(i));
                int i2 = ((C781670UlR) entry.getValue()).LIZ;
                if (!z ? (musicSong = (MusicSong) C13LP.LJJJLZIJ(i2, list)) != null : (musicSong = (MusicSong) C13LP.LJJJLZIJ(i2 - 1, list)) != null) {
                    j = musicSong.id;
                } else {
                    j = 0;
                }
                arrayList2.add(Long.valueOf(j));
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(0, "is_shortcut_panel");
            c474500IjALIZ.LJJII(arrayList.toString(), "music_position");
            c474500IjALIZ.LJJII(arrayList2.toString(), "music_id_set");
            c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJII(long j, DataChannel dataChannel, String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_panel_duration");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(j), "use_time");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_default_open");
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel, MusicSong musicSong, String str, long j, String str2) {
        Long lValueOf;
        String str3;
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_favorite_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "click_type");
        String str5 = null;
        if (musicSong != null) {
            lValueOf = Long.valueOf(musicSong.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "music_id");
        if (musicSong != null) {
            str3 = musicSong.title;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "music_name");
        if (musicSong != null) {
            str4 = musicSong.author;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "artist_name");
        if (musicSong != null) {
            str5 = musicSong.previewUrl;
        }
        c474500IjALIZ.LJJII(str5, "music_url");
        c474500IjALIZ.LJJII(Long.valueOf(j), "collection_id");
        c474500IjALIZ.LJJII(str2, "from_request_type");
        c474500IjALIZ.LIZ();
    }
}
