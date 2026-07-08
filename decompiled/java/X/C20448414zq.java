package X;

import com.ss.android.ugc.aweme.music.model.MusicList;

/* JADX INFO: renamed from: X.14zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20448414zq implements InterfaceC2385309Wh {
    public final /* synthetic */ C204594153w LIZ;
    public final /* synthetic */ int LIZIZ;

    public /* synthetic */ C20448414zq(C204594153w c204594153w, int i) {
        this.LIZ = c204594153w;
        this.LIZIZ = i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        C204594153w c204594153w = this.LIZ;
        int i = this.LIZIZ;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.secondLevelMusicList$1L");
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "status_second_level_music_list");
        } else if (c15o7.LJIILJJIL()) {
            c204594153w.LIZIZ.zQ2(0, "status_second_level_music_list");
            MusicList musicList = (MusicList) c15o7.LJIIL();
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(musicList.getCursor()));
            c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(musicList.hasMore));
            c20449014zw.LIZ.put("action_type", (V) 1);
            c20449014zw.LIZ.put("list_level", (V) Integer.valueOf(i));
            c20449014zw.LIZIZ("list_collection_data", musicList.childCollections);
            C20448514zr.LIZLLL(c20449014zw, C15J0.LIZIZ(musicList.items, musicList.extra));
            c204594153w.LIZIZ.zQ2(c20449014zw, "second_level_music_list");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.secondLevelMusicList$1L");
        return null;
    }
}
