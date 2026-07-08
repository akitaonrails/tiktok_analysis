package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.MusicInfoAndEffectUseCount;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652610t6h {
    public static final C1652610t6h LJIIIIZZ = new C1652610t6h(null, null);
    public static final int LJIIIZ = 50;
    public final RecommendMusic LIZ;
    public final List<SimpleMusic> LIZIZ;
    public List<? extends MusicModel> LIZJ;
    public List<? extends MusicModel> LIZLLL;
    public Pair<? extends MusicModel, Long> LJ;
    public Pair<? extends MusicModel, Long> LJFF;
    public Pair<? extends MusicModel, Long> LJI;
    public Pair<? extends MusicModel, Long> LJII;

    public final void LIZIZ() {
        List<MusicInfoAndEffectUseCount> musicList;
        Object objLJJJLL;
        Object objLJJJLL2;
        List<MusicInfoAndEffectUseCount> musicList2;
        MusicModel musicModelConvertToMusicModel;
        Pair<? extends MusicModel, Long> pair = null;
        Object obj = null;
        pair = null;
        this.LJI = null;
        this.LJII = null;
        this.LJ = null;
        this.LJFF = null;
        List<SimpleMusic> list = this.LIZIZ;
        if (!(list == null || list.isEmpty())) {
            List<SimpleMusic> list2 = this.LIZIZ;
            Music music = ((SimpleMusic) C13LP.LJJJJZI(list2)).musicModel;
            if (music == null || (musicModelConvertToMusicModel = music.convertToMusicModel()) == null) {
                musicModelConvertToMusicModel = null;
            } else {
                RecommendMusic recommendMusic = this.LIZ;
                musicModelConvertToMusicModel.setLogPbOrNot(recommendMusic != null ? recommendMusic.getLogPb() : null);
                RecommendMusic recommendMusic2 = this.LIZ;
                if (recommendMusic2 != null) {
                    musicModelConvertToMusicModel.setFromRecommend(recommendMusic2.getFromRecommend());
                }
            }
            this.LJI = new Pair<>(musicModelConvertToMusicModel, 0L);
            Iterator<SimpleMusic> it2 = list2.iterator();
            while (it2.hasNext()) {
                Music music2 = it2.next().musicModel;
                if (music2 != null) {
                    if ((music2.getShootDuration() > 0 ? music2.getShootDuration() : music2.getDuration()) > 180) {
                        MusicModel musicModelConvertToMusicModel2 = music2.convertToMusicModel();
                        if (musicModelConvertToMusicModel2 != null) {
                            RecommendMusic recommendMusic3 = this.LIZ;
                            musicModelConvertToMusicModel2.setLogPbOrNot(recommendMusic3 != null ? recommendMusic3.getLogPb() : null);
                            RecommendMusic recommendMusic4 = this.LIZ;
                            if (recommendMusic4 != null) {
                                musicModelConvertToMusicModel2.setFromRecommend(recommendMusic4.getFromRecommend());
                            }
                        } else {
                            musicModelConvertToMusicModel2 = null;
                        }
                        this.LJII = new Pair<>(musicModelConvertToMusicModel2, 0L);
                    }
                }
            }
        }
        RecommendMusic recommendMusic5 = this.LIZ;
        if (recommendMusic5 != null) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "effect_recommend_music_algo_opt", true);
            if (iLJIJ == 1 || iLJIJ == 2) {
                List<MusicInfoAndEffectUseCount> musicList3 = recommendMusic5.getMusicList();
                if (musicList3 != null && !musicList3.isEmpty() && (musicList = recommendMusic5.getMusicList()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(musicList, 10));
                    Iterator<MusicInfoAndEffectUseCount> it3 = musicList.iterator();
                    while (it3.hasNext()) {
                        MusicModel musicModelConvertToMusicModel3 = it3.next().musicInfo.convertToMusicModel();
                        musicModelConvertToMusicModel3.setLogPbOrNot(recommendMusic5.getLogPb());
                        musicModelConvertToMusicModel3.setFromRecommend(recommendMusic5.getFromRecommend());
                        arrayList.add(musicModelConvertToMusicModel3);
                    }
                    this.LIZJ = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    for (MusicInfoAndEffectUseCount musicInfoAndEffectUseCount : musicList) {
                        MusicInfoAndEffectUseCount musicInfoAndEffectUseCount2 = musicInfoAndEffectUseCount;
                        if ((musicInfoAndEffectUseCount2.musicInfo.getShootDuration() > 0 ? musicInfoAndEffectUseCount2.musicInfo.getShootDuration() : musicInfoAndEffectUseCount2.musicInfo.getDuration()) >= 180) {
                            arrayList2.add(musicInfoAndEffectUseCount);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        MusicModel musicModelConvertToMusicModel4 = ((MusicInfoAndEffectUseCount) it4.next()).musicInfo.convertToMusicModel();
                        musicModelConvertToMusicModel4.setLogPbOrNot(recommendMusic5.getLogPb());
                        musicModelConvertToMusicModel4.setFromRecommend(recommendMusic5.getFromRecommend());
                        arrayList3.add(musicModelConvertToMusicModel4);
                    }
                    this.LIZLLL = arrayList3;
                    List<? extends MusicModel> list3 = this.LIZJ;
                    this.LJ = (list3 == null || (objLJJJLL2 = C13LP.LJJJLL(list3)) == null) ? null : new Pair<>(objLJJJLL2, 0L);
                    List<? extends MusicModel> list4 = this.LIZLLL;
                    if (list4 != null && (objLJJJLL = C13LP.LJJJLL(list4)) != null) {
                        pair = new Pair<>(objLJJJLL, 0L);
                    }
                    this.LJFF = pair;
                }
            } else {
                List<MusicInfoAndEffectUseCount> musicList4 = recommendMusic5.getMusicList();
                if (musicList4 != null && !musicList4.isEmpty() && (musicList2 = recommendMusic5.getMusicList()) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (MusicInfoAndEffectUseCount musicInfoAndEffectUseCount3 : musicList2) {
                        if (musicInfoAndEffectUseCount3.useCount >= LJIIIZ) {
                            arrayList4.add(musicInfoAndEffectUseCount3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    C13LP.LLFII(arrayList4, arrayList5);
                    MusicInfoAndEffectUseCount musicInfoAndEffectUseCount4 = (MusicInfoAndEffectUseCount) ListProtector.get(arrayList5, AbstractC19994813Le.Default.nextInt(arrayList5.size()));
                    MusicModel musicModelConvertToMusicModel5 = musicInfoAndEffectUseCount4.musicInfo.convertToMusicModel();
                    musicModelConvertToMusicModel5.setLogPbOrNot(recommendMusic5.getLogPb());
                    musicModelConvertToMusicModel5.setFromRecommend(recommendMusic5.getFromRecommend());
                    this.LJ = new Pair<>(musicModelConvertToMusicModel5, Long.valueOf(musicInfoAndEffectUseCount4.useCount));
                    Iterator it5 = arrayList5.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        Object next = it5.next();
                        MusicInfoAndEffectUseCount musicInfoAndEffectUseCount5 = (MusicInfoAndEffectUseCount) next;
                        if ((musicInfoAndEffectUseCount5.musicInfo.getShootDuration() > 0 ? musicInfoAndEffectUseCount5.musicInfo.getShootDuration() : musicInfoAndEffectUseCount5.musicInfo.getDuration()) >= 180) {
                            obj = next;
                            break;
                        }
                    }
                    MusicInfoAndEffectUseCount musicInfoAndEffectUseCount6 = (MusicInfoAndEffectUseCount) obj;
                    if (musicInfoAndEffectUseCount6 != null) {
                        MusicModel musicModelConvertToMusicModel6 = musicInfoAndEffectUseCount6.musicInfo.convertToMusicModel();
                        musicModelConvertToMusicModel6.setLogPbOrNot(recommendMusic5.getLogPb());
                        musicModelConvertToMusicModel6.setFromRecommend(recommendMusic5.getFromRecommend());
                        this.LJFF = new Pair<>(musicModelConvertToMusicModel6, Long.valueOf(musicInfoAndEffectUseCount6.useCount));
                    }
                }
            }
        }
        if (this.LJI == null) {
            this.LJI = this.LJ;
        }
        if (this.LJII == null) {
            this.LJII = this.LJFF;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1652610t6h)) {
            return false;
        }
        C1652610t6h c1652610t6h = (C1652610t6h) obj;
        return Intrinsics.LJFF(this.LIZ, c1652610t6h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1652610t6h.LIZIZ);
    }

    public final MusicModel LIZ(boolean z) {
        if (z) {
            Pair<? extends MusicModel, Long> pair = this.LJFF;
            if (pair == null) {
                return null;
            }
            return pair.getFirst();
        }
        Pair<? extends MusicModel, Long> pair2 = this.LJ;
        if (pair2 == null) {
            return null;
        }
        return pair2.getFirst();
    }

    public C1652610t6h(RecommendMusic recommendMusic, List<SimpleMusic> list) {
        this.LIZ = recommendMusic;
        this.LIZIZ = list;
        LIZIZ();
    }
}
