package X;

import Y.ARunnableS121S0100000_21;
import Y.ARunnableS131S0100000_31;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.16Hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749016Hg implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return then$12(this, c15o7);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return then$13(this, c15o7);
            case 14:
                return then$14(this, c15o7);
            case 15:
                return then$15(this, c15o7);
            case 16:
                return then$16(this, c15o7);
            default:
                return null;
        }
    }

    public C20749016Hg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$0(X.C20749016Hg r11, X.C15O7 r12) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20749016Hg.then$0(X.16Hg, X.15O7):java.lang.Object");
    }

    public static final Object then$1(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C1C7U.LIZ("InnerPushWindowManager@e2e3.reallyShow$2$1");
        C1908390zlF c1908390zlF = C1908400zlG.LIZ;
        InnerPushMessage innerPushMessage = (InnerPushMessage) c20749016Hg.l0;
        c1908390zlF.getClass();
        CopyOnWriteArraySet copyOnWriteArraySetLIZIZ = C1908390zlF.LIZIZ(innerPushMessage);
        if (!copyOnWriteArraySetLIZIZ.isEmpty()) {
            Iterator it2 = copyOnWriteArraySetLIZIZ.iterator();
            while (it2.hasNext()) {
                ((LruCache) c1908390zlF.LIZ.getValue()).remove(it2.next());
            }
        }
        List<Integer> list = C20665115th.LIZ;
        C20665115th.LIZ((InnerPushMessage) c20749016Hg.l0);
        C0ZKZ.LIZ.getClass();
        C1909710znN c1909710znN = C1909710znN.LIZ;
        InnerPushMessage innerPushMessage2 = (InnerPushMessage) c20749016Hg.l0;
        c1909710znN.getClass();
        C15O7<Unit> c15o7LJIIJ = C19331310k3.LJIIJ(new AwS572S0100000_28(innerPushMessage2, 270));
        C1C7U.LIZIZ("InnerPushWindowManager@e2e3.reallyShow$2$1");
        return c15o7LJIIJ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object then$10(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20749016Hg.l0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.loadMoreMusicSheet$1L");
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "loadmore_status_music_sheet");
        } else if (c15o7.LJIILJJIL()) {
            c204594153w.LIZIZ.zQ2(0, "loadmore_status_music_sheet");
            MusicCollection musicCollection = (MusicCollection) c15o7.LJIIL();
            List list = (List) ((C20449014zw) c204594153w.LIZIZ.get("music_sheet_list")).LIZ("list_data");
            list.addAll(musicCollection.getItems());
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("list_cursor", (V) Long.valueOf(musicCollection.cursor));
            c20449014zw.LIZ.put("list_hasmore", (V) Boolean.valueOf(musicCollection.hasMore));
            c20449014zw.LIZ.put("action_type", (V) 2);
            c20449014zw.LIZIZ("list_data", list);
            c204594153w.LIZIZ.zQ2(c20449014zw, "music_sheet_list");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.loadMoreMusicSheet$1L");
        return null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object then$11(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20749016Hg.l0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.loadMoreHotMusicList$1L");
        c204594153w.LJIIIZ = false;
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "loadmore_status_hot_music_list");
        } else if (c15o7.LJIILJJIL()) {
            MusicList musicList = (MusicList) c15o7.LJIIL();
            List<MusicModel> listLIZIZ = C20448514zr.LIZIZ((C20449014zw) c204594153w.LIZIZ.get("hot_music_list_data"));
            listLIZIZ.addAll(C15J0.LIZIZ(musicList.items, musicList.extra));
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("loadmore_status_hot_music_list", (V) 0);
            c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(musicList.getCursor()));
            c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(musicList.hasMore));
            c20449014zw.LIZIZ("action_type", 2);
            C20448514zr.LIZLLL(c20449014zw, listLIZIZ);
            c204594153w.LIZIZ.zQ2(c20449014zw, "hot_music_list_data");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.loadMoreHotMusicList$1L");
        return null;
    }

    public static final Object then$12(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20749016Hg.l0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.fetchMusicSheetInMoreTab$1L");
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "more_tab_music_sheet_refresh_status");
            c204594153w.LIZIZ.zQ2(1, "more_tab_refresh_status");
        } else if (c15o7.LJIILJJIL()) {
            c204594153w.LIZIZ.zQ2(0, "more_tab_music_sheet_refresh_status");
            ArrayList arrayList = new ArrayList();
            MusicCollection musicCollection = (MusicCollection) c15o7.LJIIL();
            if (musicCollection.getItems().size() > 0) {
                arrayList.add(new C20448714zt(musicCollection.getItems()));
            }
            Collection collection = (Collection) c204594153w.LIZIZ.get("more_tab_collection_feed");
            if (collection == null) {
                if (((Integer) c204594153w.LIZIZ.get("more_tab_collection_feed_refresh_status", 2)).intValue() == 2) {
                    c204594153w.LIZIZ.zQ2(arrayList, "more_tab_music_sheet");
                } else {
                    c204594153w.LIZIZ.zQ2(arrayList, "list");
                    c204594153w.LIZIZ.zQ2(0, "more_tab_refresh_status");
                    c204594153w.LIZIZ.zQ2(Boolean.TRUE, "more_tab_has_fetched");
                }
            } else {
                arrayList.addAll(collection);
                c204594153w.LIZIZ.zQ2(arrayList, "list");
                c204594153w.LIZIZ.zQ2(0, "more_tab_refresh_status");
                c204594153w.LIZIZ.zQ2(Boolean.TRUE, "more_tab_has_fetched");
            }
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.fetchMusicSheetInMoreTab$1L");
        return null;
    }

    public static final Object then$13(C20749016Hg c20749016Hg, C15O7 c15o7) {
        Music music;
        Music music2 = (Music) c20749016Hg.l0;
        C1C7U.LIZ("ChooseMusicModel@8dbe.queryMusic$1L");
        try {
            if (!ChooseMusicApi.LIZLLL()) {
                String mid = music2.getMid();
                Object objLIZ = AnonymousClass1541.LIZ(mid);
                if (objLIZ instanceof Music) {
                    music = (Music) objLIZ;
                } else {
                    music = MusicApi.LIZ(0, mid).music;
                    AnonymousClass1541.LIZIZ(music, mid);
                }
            } else {
                music = MusicApi.LIZ(0, music2.getMid()).music;
            }
            if (music != null) {
                music2.setCollectStatus(music.getCollectStatus());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Object objLJIIL = c15o7.LJIIL();
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.queryMusic$1L");
        return objLJIIL;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object then$14(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20749016Hg.l0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.refreshMusicSheet$1L");
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "refresh_status_music_sheet");
        } else if (c15o7.LJIILJJIL()) {
            c204594153w.LIZIZ.zQ2(0, "refresh_status_music_sheet");
            MusicCollection musicCollection = (MusicCollection) c15o7.LJIIL();
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("list_cursor", (V) Long.valueOf(musicCollection.cursor));
            c20449014zw.LIZ.put("list_hasmore", (V) Boolean.valueOf(musicCollection.hasMore));
            c20449014zw.LIZ.put("action_type", (V) 1);
            c20449014zw.LIZIZ("list_data", musicCollection.getItems());
            c204594153w.LIZIZ.zQ2(c20449014zw, "music_sheet_list");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.refreshMusicSheet$1L");
        return null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object then$15(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20749016Hg.l0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.refreshHotMusicList$1L");
        c204594153w.LJIIIZ = false;
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "refresh_status_hot_music_list");
        } else if (c15o7.LJIILJJIL()) {
            MusicList musicList = (MusicList) c15o7.LJIIL();
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("refresh_status_hot_music_list", (V) 0);
            c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(musicList.getCursor()));
            c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(musicList.hasMore));
            c20449014zw.LIZIZ("action_type", 1);
            C20448514zr.LIZLLL(c20449014zw, C15J0.LIZIZ(musicList.items, musicList.extra));
            c204594153w.LIZIZ.zQ2(c20449014zw, "hot_music_list_data");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.refreshHotMusicList$1L");
        return null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object then$16(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20749016Hg.l0;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.loadMoreUserCollectedMusicList$1L");
        c204594153w.LJIIIIZZ = false;
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "loadmore_status_user_collected_music");
        } else if (c15o7.LJIILJJIL()) {
            CollectedMusicList collectedMusicList = (CollectedMusicList) c15o7.LJIIL();
            List<MusicModel> listLIZIZ = C20448514zr.LIZIZ((C20449014zw) c204594153w.LIZIZ.get("user_collected_music_list"));
            listLIZIZ.addAll(C15J0.LIZIZ(collectedMusicList.getItems(), collectedMusicList.extra));
            C20449014zw c20449014zw = new C20449014zw();
            c20449014zw.LIZ.put("loadmore_status_user_collected_music", (V) 0);
            c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(collectedMusicList.getCursor()));
            c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(collectedMusicList.getHasMore()));
            c20449014zw.LIZIZ("action_type", 2);
            C20448514zr.LIZLLL(c20449014zw, listLIZIZ);
            c204594153w.LIZIZ.zQ2(c20449014zw, "user_collected_music_list");
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.loadMoreUserCollectedMusicList$1L");
        return null;
    }

    public static final Object then$2(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C1C7U.LIZ("MusicWaveHelper$Companion@cc6a.getAvMusicWaveBean$2");
        C15RJ c15rj = (C15RJ) c20749016Hg.l0;
        if (c15rj != null) {
            if (c15o7 == null) {
                c15rj.LIZ(null);
            } else {
                c15rj.LIZ(c15o7.LJIIL());
            }
        }
        C1C7U.LIZIZ("MusicWaveHelper$Companion@cc6a.getAvMusicWaveBean$2");
        return null;
    }

    public static final Object then$3(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C15OG c15og = (C15OG) c20749016Hg.l0;
        c15og.getClass();
        C1C7U.LIZ("DuetWithMovieHelper@adfe.privacyGrantAndNext$2L");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL() && c15o7.LJIIL() != null) {
            c15og.LJIILL = (Aweme) c15o7.LJIIL();
        }
        c15og.LJIILIIL();
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.privacyGrantAndNext$2L");
        return null;
    }

    public static final Object then$4(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C15OG c15og = (C15OG) c20749016Hg.l0;
        c15og.getClass();
        C1C7U.LIZ("DuetWithMovieHelper@adfe.updateAwemeSuccessAndNext$1L");
        if (c15o7.LJIILL()) {
            c15og.LJ();
        } else if (!c15og.LJIJJ) {
            C810560Vqw.LIZJ(new ARunnableS121S0100000_21(c15og, 95));
            C810560Vqw.LJ(new ARunnableS131S0100000_31(c15og, 113));
        }
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.updateAwemeSuccessAndNext$1L");
        return null;
    }

    public static final Object then$5(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.privacyGrantAndNext$2");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL() && c15o7.LJIIL() != null) {
            ((C15OF) c20749016Hg.l0).LIZLLL = (Aweme) c15o7.LJIIL();
        }
        ((C15OF) c20749016Hg.l0).LJIIIZ();
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.privacyGrantAndNext$2");
        return null;
    }

    public static final Object then$6(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C1C7U.LIZ("DynamicModuleStateListener@72c0.morpheusStateListener$1$2");
        if (!c15o7.LJIILL()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DynamicModuleStateListener@72c0.morpheusStateListener$1$2");
            return unit;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error while start downloading ");
        sbLIZ.append(((C1BLM) c20749016Hg.l0).LIZ);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), c15o7.LJIIJJI());
    }

    public static final Object then$7(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C1C7U.LIZ("MusicWaveDataFetcher@f064.getMultiMusicWaveBeanAsync$2");
        ((C15KK) c20749016Hg.l0).LIZ(c15o7.LJIIL());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicWaveDataFetcher@f064.getMultiMusicWaveBeanAsync$2");
        return unit;
    }

    public static final Object then$8(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C2472709mX c2472709mX = ((C15OA) c20749016Hg.l0).LL;
        if (c2472709mX != null && c2472709mX.LIZ()) {
            ((C15OA) c20749016Hg.l0).LLILLJJLI.LIZ();
            return null;
        }
        if (c15o7.LJIILIIL()) {
            ((C15OA) c20749016Hg.l0).LLILLJJLI.LIZ();
            return null;
        }
        if (c15o7.LJIILL()) {
            ((C15OA) c20749016Hg.l0).LLILLJJLI.LIZIZ(c15o7.LJIIJJI());
            return null;
        }
        ((C15OA) c20749016Hg.l0).LLILLJJLI.LIZJ(c15o7.LJIIL());
        return null;
    }

    public static final Object then$9(C20749016Hg c20749016Hg, C15O7 c15o7) {
        C1C7U.LIZ("VideoTagFriendsListViewModel@4d0b.refresh$3");
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && iUserService.isLogin()) {
            ((VideoTagFriendsListViewModel) c20749016Hg.l0).setState(new AwS610S0100000_31(c15o7, (C15O7<C15NH>) 539));
        } else {
            ((VideoTagFriendsListViewModel) c20749016Hg.l0).setState(AFwS276S0000000_31.get$arr$(350));
        }
        C1C7U.LIZIZ("VideoTagFriendsListViewModel@4d0b.refresh$3");
        return null;
    }
}
