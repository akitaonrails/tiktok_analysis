package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.assem.ability.IPlayerProgressAbility;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.FusedMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0P4D, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4D extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[PHI: r6
      0x00ae: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:34:0x0070, B:39:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(X.C0P4D r7, android.view.View r8) {
        /*
            java.lang.Object r3 = r7.l0
            com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem r3 = (com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem) r3
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.music.model.MusicPromoTagInfo r0 = (com.ss.android.ugc.aweme.music.model.MusicPromoTagInfo) r0
            r2 = 0
            if (r0 == 0) goto Lb8
            java.lang.String r5 = r0.schemaUrl
        Ld:
            android.content.Context r4 = r3.getContext()
            if (r4 == 0) goto Lad
            X.0Sb3 r0 = r3.LLJI
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r0.LL
        L19:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.music.model.MusicPromoTagInfo r1 = r0.getMusicPromoTagInfo()
            X.0Sb3 r0 = r3.LLJI
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r0.LL
        L29:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            java.lang.String r6 = ""
            if (r0 == 0) goto L3d
            java.lang.String r8 = r0.getIdStr()
            if (r8 != 0) goto L3e
        L3d:
            r8 = r6
        L3e:
            X.0Sb3 r0 = r3.LLJI
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r0.LL
        L44:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r7 = r0.getAid()
            if (r7 != 0) goto L51
            r7 = r6
        L51:
            X.0Sb3 r0 = r3.LLJI
            if (r0 == 0) goto L57
            java.lang.Object r2 = r0.LL
        L57:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            if (r0 == 0) goto L6f
            java.lang.String r3 = r0.getId()
            if (r3 != 0) goto L70
        L6f:
            r3 = r6
        L70:
            if (r1 == 0) goto Lae
            java.lang.String r0 = r1.text
            if (r0 == 0) goto L77
            r6 = r0
        L77:
            java.lang.Integer r0 = r1.type
            if (r0 == 0) goto Lae
            int r2 = r0.intValue()
        L7f:
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            java.lang.String r0 = "clip_id"
            r1.LJIIIIZZ(r0, r8)
            java.lang.String r0 = "item_id"
            r1.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "metasong_id"
            r1.LJIIIIZZ(r0, r3)
            java.lang.String r0 = "copywriting"
            r1.LJIIIIZZ(r0, r6)
            java.lang.String r0 = "type"
            r1.LIZJ(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "campaign_fyp_ticker_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            if (r5 == 0) goto Lad
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r4, r5)
            r0.open()
        Lad:
            return
        Lae:
            r2 = 0
            goto L7f
        Lb0:
            r0 = r2
            goto L44
        Lb2:
            r0 = r2
            goto L29
        Lb5:
            r0 = r2
            goto L19
        Lb8:
            r5 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0P4D.LIZ$0(X.0P4D, android.view.View):void");
    }

    public static final void LIZ$1(C0P4D c0p4d, View view) {
        Object obj;
        Integer value;
        Object obj2;
        Object obj3;
        String playlistPreviousPage;
        Object obj4;
        Object obj5;
        Object obj6;
        String playlistPreviousPage2;
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62;
        LiveData<Integer> liveDataHw;
        VideoMusicTitleAssem videoMusicTitleAssem = (VideoMusicTitleAssem) c0p4d.l0;
        Music music = (Music) c0p4d.l1;
        if (music == null) {
            videoMusicTitleAssem.getClass();
            return;
        }
        C724270Sb3 c724270Sb3 = videoMusicTitleAssem.LLJI;
        Music music2 = null;
        Object obj7 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        IPlayerProgressAbility iPlayerProgressAbility = (IPlayerProgressAbility) videoMusicTitleAssem.LLLI.getValue();
        if (iPlayerProgressAbility != null && (liveDataHw = iPlayerProgressAbility.Hw()) != null) {
            value = liveDataHw.getValue();
        } else {
            value = null;
        }
        videoMusicTitleAssem.wq(videoItemParams, value);
        C631140OpE c631140OpE = C631140OpE.LIZ;
        C724270Sb3 c724270Sb32 = videoMusicTitleAssem.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String str = ((VideoItemParams) obj2).mEventType;
        C724270Sb3 c724270Sb33 = videoMusicTitleAssem.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj3).baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An62 = baseFeedPageParams.param) != null) {
            playlistPreviousPage = c2189821An62.getPlaylistPreviousPage();
        } else {
            playlistPreviousPage = null;
        }
        c631140OpE.getClass();
        EnumC631120OpC enumC631120OpCLIZIZ = C631140OpE.LIZIZ(str, playlistPreviousPage);
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        c633020OsG.LJIIIZ(music, enumC631120OpCLIZIZ);
        if (videoMusicTitleAssem.Xp().LLILLL) {
            c633020OsG.LJJJLIIL(enumC631120OpCLIZIZ);
        }
        MusicFusion musicFusion = music.getMusicFusion();
        if (musicFusion != null && C631290OpT.LIZ(musicFusion)) {
            List<FusedMusic> list = musicFusion.fusedMusicInfos;
            ArrayList<Music> arrayList = new ArrayList();
            Iterator<FusedMusic> it2 = list.iterator();
            while (it2.hasNext()) {
                Music music3 = it2.next().music;
                if (music3 != null) {
                    arrayList.add(music3);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (Music music4 : arrayList) {
                C633020OsG c633020OsG2 = C633020OsG.LIZIZ;
                C724270Sb3 c724270Sb34 = videoMusicTitleAssem.LLJI;
                if (c724270Sb34 != null) {
                    obj4 = c724270Sb34.LL;
                } else {
                    obj4 = null;
                }
                Aweme aweme = ((VideoItemParams) obj4).getAweme();
                C631140OpE c631140OpE2 = C631140OpE.LIZ;
                C724270Sb3 c724270Sb35 = videoMusicTitleAssem.LLJI;
                if (c724270Sb35 != null) {
                    obj5 = c724270Sb35.LL;
                } else {
                    obj5 = null;
                }
                String str2 = ((VideoItemParams) obj5).mEventType;
                C724270Sb3 c724270Sb36 = videoMusicTitleAssem.LLJI;
                if (c724270Sb36 != null) {
                    obj6 = c724270Sb36.LL;
                } else {
                    obj6 = null;
                }
                BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) obj6).baseFeedPageParams;
                if (baseFeedPageParams2 != null && (c2189821An6 = baseFeedPageParams2.param) != null) {
                    playlistPreviousPage2 = c2189821An6.getPlaylistPreviousPage();
                } else {
                    playlistPreviousPage2 = null;
                }
                c631140OpE2.getClass();
                arrayList2.add(new Pair(music4, Boolean.valueOf(c633020OsG2.LJJJ(aweme, C631140OpE.LIZIZ(str2, playlistPreviousPage2), music4))));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj8 : arrayList2) {
                if (((Boolean) ((Pair) obj8).getSecond()).booleanValue()) {
                    arrayList3.add(obj8);
                }
            }
            if (arrayList3.size() > 1) {
                C633020OsG c633020OsG3 = C633020OsG.LIZIZ;
                Fragment fragmentLJI = C724240Sb0.LJI(videoMusicTitleAssem);
                C724270Sb3 c724270Sb37 = videoMusicTitleAssem.LLJI;
                if (c724270Sb37 != null) {
                    obj7 = c724270Sb37.LL;
                }
                c633020OsG3.LJJIJIIJIL(fragmentLJI, videoMusicTitleAssem.Ip((VideoItemParams) obj7, music, enumC631120OpCLIZIZ, DspPlatform.UNKNOWN, true), arrayList2, videoMusicTitleAssem.Vp().LLILLJJLI, videoMusicTitleAssem.Vp().LL, videoMusicTitleAssem.Xp().LLILLJJLI);
                return;
            }
            if (arrayList3.size() == 1) {
                Pair pair = (Pair) C13LP.LJJJLL(arrayList3);
                if (pair != null) {
                    music2 = (Music) pair.getFirst();
                }
                videoMusicTitleAssem.Ep(music2, enumC631120OpCLIZIZ);
                return;
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(videoMusicTitleAssem);
            if (fragmentLJI2 == null) {
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI2);
            c1389890mGx.LJIIIZ(2131824945);
            c1389890mGx.LJIIJJI();
            return;
        }
        videoMusicTitleAssem.Ep(music, enumC631120OpCLIZIZ);
    }

    public static final void LIZ$2(C0P4D c0p4d, View view) {
        String schema;
        String scene;
        String mid;
        MusicResourceBitStruct musicResourceBitStruct = ((C630100OnY) c0p4d.l0).LIZ.musicResourceBitStruct;
        if (musicResourceBitStruct != null && (schema = musicResourceBitStruct.getSchema()) != null) {
            MusicResourceBitStruct musicResourceBitStruct2 = ((C630100OnY) c0p4d.l0).LIZ.musicResourceBitStruct;
            String str = "";
            if (musicResourceBitStruct2 == null || (scene = musicResourceBitStruct2.getScene()) == null) {
                scene = "";
            }
            Music music = ((C630100OnY) c0p4d.l0).LIZ.music;
            if (music != null && (mid = music.getMid()) != null) {
                str = mid;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(schema);
            sbLIZ.append("&open_timestamp=");
            sbLIZ.append(jCurrentTimeMillis);
            SmartRouter.buildRoute(((MusicDetailNavBarAssem) c0p4d.l1).getContext(), C2188811AlT.LIZIZ(sbLIZ)).open();
            C1398280mUU.LIZLLL(scene, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P4D(C630100OnY c630100OnY, MusicDetailNavBarAssem musicDetailNavBarAssem, int i) {
        super(500L);
        this.$t = i;
        this.l0 = c630100OnY;
        this.l1 = musicDetailNavBarAssem;
    }

    public C0P4D(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
