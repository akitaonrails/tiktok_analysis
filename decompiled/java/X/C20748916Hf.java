package X;

import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.16Hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748916Hf implements InterfaceC2385309Wh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object then$0(C20748916Hf c20748916Hf, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20748916Hf.l1;
        String str = c20748916Hf.s0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.loadMoreMusicList$1L");
        c204594153w.LJII = false;
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "loadmore_status_music_list");
        } else if (c15o7.LJIILJJIL()) {
            c204594153w.LIZIZ.zQ2(0, "loadmore_status_music_list");
            MusicList musicList = (MusicList) c15o7.LJIIL();
            List<MusicModel> listLIZIZ = C20448514zr.LIZIZ((C20449014zw) c204594153w.LIZIZ.get("music_list"));
            List<MusicModel> listLIZIZ2 = C15J0.LIZIZ(musicList.items, musicList.extra);
            if (listLIZIZ2 != null) {
                for (MusicModel musicModel : (ArrayList) listLIZIZ2) {
                    if (musicModel != null) {
                        musicModel.setCategoryID(str);
                    }
                }
            }
            listLIZIZ.addAll(listLIZIZ2);
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(musicList.getCursor()));
            c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(musicList.hasMore));
            c20449014zw.LIZIZ("action_type", 2);
            C20448514zr.LIZLLL(c20449014zw, listLIZIZ);
            c204594153w.LIZIZ.zQ2(c20449014zw, "music_list");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.loadMoreMusicList$1L");
        return null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object then$1(C20748916Hf c20748916Hf, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20748916Hf.l1;
        String str = c20748916Hf.s0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.refreshMusicList$1L");
        c204594153w.LJII = false;
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "refresh_status_music_list");
        } else if (c15o7.LJIILJJIL()) {
            c204594153w.LIZIZ.zQ2(0, "refresh_status_music_list");
            MusicList musicList = (MusicList) c15o7.LJIIL();
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(musicList.getCursor()));
            c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(musicList.hasMore));
            c20449014zw.LIZ.put("action_type", (V) 1);
            c20449014zw.LIZ.put("suggestion_id", (V) musicList.suggestionId);
            c20449014zw.LIZIZ("vertical_playlist", musicList.getIsVerticalPlaylist());
            List<MusicModel> listLIZIZ = C15J0.LIZIZ(musicList.items, musicList.extra);
            if (listLIZIZ != null) {
                for (MusicModel musicModel : (ArrayList) listLIZIZ) {
                    if (musicModel != null) {
                        musicModel.setCategoryID(str);
                    }
                }
            }
            C20448514zr.LIZLLL(c20449014zw, listLIZIZ);
            c204594153w.LIZIZ.zQ2(c20449014zw, "music_list");
            c204594153w.LIZIZ.zQ2(musicList.mcInfo.shareInfo, "data_share_info");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.refreshMusicList$1L");
        return null;
    }

    public C20748916Hf(C204594153w c204594153w, String str, int i) {
        this.$t = i;
        this.l1 = c204594153w;
        this.s0 = str;
    }
}
