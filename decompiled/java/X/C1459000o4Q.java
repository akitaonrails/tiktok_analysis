package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS101S0210000_22;

/* JADX INFO: renamed from: X.0o4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459000o4Q implements C155Z {
    public final /* synthetic */ C1459010o4R LIZ;

    @Override // X.C155Z
    public final void LJFF() {
    }

    @Override // X.C155Z
    public final void LJIILLIIL(int i, Aweme aweme) {
    }

    @Override // X.C155Z
    public final void LJIJJ(Aweme aweme, int i, String str) {
    }

    @Override // X.C155Z
    public final void LJJIFFI() {
    }

    @Override // X.C155Z
    public final boolean LIZIZ() {
        return C570830Ma9.LIZIZ(this.LIZ.LLLLII());
    }

    @Override // X.C155Z
    public final boolean LIZJ() {
        return C1428470nHB.LJJZZI(this.LIZ.LLLLII()) && !C0EM4.LIZ();
    }

    @Override // X.C155Z
    public final void LIZLLL() {
        C1459010o4R c1459010o4R = this.LIZ;
        c1459010o4R.LLJJIII = true;
        c1459010o4R.LLLIL().hide();
        C1453500nvY c1453500nvY = C1453500nvY.LIZ;
        String creationId = this.LIZ.LLLLII().getCreationId();
        String musicId = this.LIZ.LLLLII().getMusicId();
        c1453500nvY.getClass();
        C1453500nvY.LIZ("video_edit_page", creationId, musicId, "edit_volume");
    }

    @Override // X.C155Z
    public final void LJII() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1455860nzM interfaceC1455860nzMLLLILZ = this.LIZ.LLLILZ();
        if (interfaceC1455860nzMLLLILZ == null || (liveDataG = interfaceC1455860nzMLLLILZ.g()) == null || (value = liveDataG.getValue()) == null) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ != null) {
            C347200DjK.LIZ(c348100DkmLIZIZ.LIZ);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C155Z
    public final void LJIIL() {
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLII = this.LIZ.LLLLII();
        c1458310o3J.getClass();
        C1458310o3J.LJ(0L, videoPublishEditModelLLLLII, true);
    }

    @Override // X.C155Z
    public final boolean LJIILIIL() {
        InterfaceC1459100o4a interfaceC1459100o4aLLLJL = this.LIZ.LLLJL();
        if (interfaceC1459100o4aLLLJL != null) {
            return interfaceC1459100o4aLLLJL.LIZJ();
        }
        return false;
    }

    @Override // X.C155Z
    public final void LJI() {
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1;
        String musicId;
        String musicId2;
        if (C1399580mWa.LIZ()) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZ.LLLLII().creativeModel.musicBuzModel);
            String str = "";
            if (C1458070o2v.LIZ()) {
                if (aVMusicExtractAVMusic != null && (musicId2 = aVMusicExtractAVMusic.getMusicId()) != null) {
                    str = musicId2;
                }
                new Pair(str, Boolean.FALSE);
            } else {
                if (aVMusicExtractAVMusic != null && (musicId = aVMusicExtractAVMusic.getMusicId()) != null) {
                    str = musicId;
                }
                new Pair(str, Boolean.valueOf(C1416310mxZ.LJJLI(this.LIZ.LLLLII()) || (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isLoopMusic())));
            }
            if (C1458070o2v.LJFF()) {
                C1654360t9W.LIZLLL = C1416310mxZ.LJJJJZ(this.LIZ.LLLLII());
                C1654360t9W.LJII = 0;
                C1654360t9W.LJIIIIZZ = C1458070o2v.LIZLLL();
            }
        }
        InterfaceC1413540mt6 interfaceC1413540mt6LLLJ = this.LIZ.LLLJ();
        if (interfaceC1413540mt6LLLJ != null) {
            interfaceC1413540mt6LLLJ.is0(true);
        }
        this.LIZ.LLLIL().hide();
        InterfaceC1455860nzM interfaceC1455860nzMLLLILZ = this.LIZ.LLLILZ();
        if (interfaceC1455860nzMLLLILZ != null && (mutableLiveDataVW1 = interfaceC1455860nzMLLLILZ.vW1()) != null) {
            mutableLiveDataVW1.setValue(C1452730nuJ.LIZJ());
        }
        this.LIZ.LLLLIIIILLL().cr();
        VideoPublishEditModel videoPublishEditModelLLLLII = this.LIZ.LLLLII();
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModelLLLLII);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModelLLLLII.getCreationId());
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelLLLLII));
        c0labLJIILIIL.LJ("is_editor_pro", CardStruct.IStatusCode.DEFAULT);
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelLLLLII));
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModelLLLLII.mShootWay);
        c0labLJIILIIL.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        c0labLJIILIIL.LJ("enter_from", videoPublishEditModelLLLLII.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene() ? "promote" : "video_edit_page");
        c0labLJIILIIL.LJI(new C15M8().LJFF("is_promote_pa"));
        c0labLJIILIIL.LIZ(videoPublishEditModelLLLLII.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0labLJIILIIL.LJI(new C15M8().LJFF("is_commercial"));
        C1403470mcr.LIZIZ(videoPublishEditModelLLLLII, c0labLJIILIIL);
        c0labLJIILIIL.LJ("music_id", videoPublishEditModelLLLLII.getMusicId());
        if (videoPublishEditModelLLLLII.hasExtendMusic()) {
            c0labLJIILIIL.LIZ(1, "is_smart_extend");
            c0labLJIILIIL.LJ("stitched_clip_id", C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(videoPublishEditModelLLLLII.creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(110), 30));
        }
        C20684815ws.LJIILLIIL("change_music", c0labLJIILIIL.LIZ);
    }

    public C1459000o4Q(C1459010o4R c1459010o4R) {
        this.LIZ = c1459010o4R;
    }

    @Override // X.C155Z
    public final void LIZ(String str) {
        MutableLiveData<Boolean> mutableLiveDataFz0;
        InterfaceC1457250o1b interfaceC1457250o1bLLLIILIL;
        String musicId;
        FullSongDetail fullSongDetail;
        C1459010o4R c1459010o4R = this.LIZ;
        c1459010o4R.LLJJ = true;
        c1459010o4R.LLJJI = str;
        c1459010o4R.LLLLII().creativeModel.musicBuzModel.enterTrimPanelTime = System.currentTimeMillis();
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIIJ();
        if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIL()) {
            C1459010o4R c1459010o4R2 = this.LIZ;
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(c1459010o4R2.LLLLII().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null && !C389120FNm.LIZ(aVMusicExtractAVMusic).isLocalMusic()) {
                if (c1459010o4R2.LLLLII().creativeModel.musicBuzModel.fullSongDetail == null || !c1459010o4R2.LLLLII().creativeModel.musicBuzModel.isFullSong || (fullSongDetail = c1459010o4R2.LLLLII().creativeModel.musicBuzModel.fullSongDetail) == null || (musicId = fullSongDetail.getFullSongId()) == null) {
                    musicId = c1459010o4R2.LLLLII().getMusicId();
                }
                C15O7.LJJIFFI(C1697810uHb.LJIIJJI(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJ(c1459010o4R2.LLLLII().getVideoLength(), c1459010o4R2.LLLLII().getMCurMusicLength(), musicId), ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJIL())).LIZLLL(new C0FXC(c1459010o4R2, 2)).LJIJJLI();
            } else {
                c1459010o4R2.LLJILJIL = c1459010o4R2.LLLLII().creativeModel.musicBuzModel.trimPointsList;
                c1459010o4R2.LLLLII().creativeModel.musicBuzModel.trimPointsList = c1459010o4R2.LLJILJIL;
            }
        }
        InterfaceC1457250o1b interfaceC1457250o1bLLLIILIL2 = this.LIZ.LLLIILIL();
        if (interfaceC1457250o1bLLLIILIL2 != null) {
            interfaceC1457250o1bLLLIILIL2.LLLIIII(this.LIZ.LLJILJIL);
        }
        InterfaceC1413540mt6 interfaceC1413540mt6LLLJ = this.LIZ.LLLJ();
        if (interfaceC1413540mt6LLLJ != null) {
            interfaceC1413540mt6LLLJ.is0(true);
        }
        if (C12DO.LIZ()) {
            InterfaceC1457250o1b interfaceC1457250o1bLLLIILIL3 = this.LIZ.LLLIILIL();
            if (interfaceC1457250o1bLLLIILIL3 != null) {
                interfaceC1457250o1bLLLIILIL3.Xv0(true);
            }
            InterfaceC1457250o1b interfaceC1457250o1bLLLIILIL4 = this.LIZ.LLLIILIL();
            if (interfaceC1457250o1bLLLIILIL4 != null) {
                interfaceC1457250o1bLLLIILIL4.ca(false);
            }
            if (str != null && (interfaceC1457250o1bLLLIILIL = this.LIZ.LLLIILIL()) != null) {
                interfaceC1457250o1bLLLIILIL.gp1(str);
            }
            InterfaceC1457250o1b interfaceC1457250o1bLLLIILIL5 = this.LIZ.LLLIILIL();
            if (interfaceC1457250o1bLLLIILIL5 != null) {
                interfaceC1457250o1bLLLIILIL5.show();
            }
        } else {
            this.LIZ.LLLIL().hide();
        }
        InterfaceC1461350o8D interfaceC1461350o8DLLLILZLLLI = this.LIZ.LLLILZLLLI();
        if (interfaceC1461350o8DLLLILZLLLI != null && (mutableLiveDataFz0 = interfaceC1461350o8DLLLILZLLLI.fz0()) != null) {
            mutableLiveDataFz0.setValue(Boolean.FALSE);
        }
    }

    @Override // X.C155Z
    public final void LJ(boolean z) {
        this.LIZ.LLLI = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    @Override // X.C155Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(boolean r14) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459000o4Q.LJIIJJI(boolean):void");
    }

    @Override // X.C155Z
    public final void LJIILJJIL(String str) {
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLII = this.LIZ.LLLLII();
        c1458310o3J.getClass();
        C2344009Gk c2344009GkLIZ = C1458310o3J.LIZ(videoPublishEditModelLLLLII);
        c2344009GkLIZ.LJIIIIZZ("type", str);
        C20684815ws.LJIILLIIL("restore_button_show", c2344009GkLIZ.LIZ);
    }

    @Override // X.C155Z
    public final void LJIIZILJ(boolean z) {
        InterfaceC1461350o8D interfaceC1461350o8DLLLILZLLLI;
        C1459010o4R c1459010o4R = this.LIZ;
        InterfaceC1459040o4U interfaceC1459040o4UQr2 = (InterfaceC1459040o4U) c1459010o4R.LLJLIL.getValue(c1459010o4R, C1459010o4R.LLLIIL[10]);
        if (interfaceC1459040o4UQr2 != null || ((interfaceC1461350o8DLLLILZLLLI = this.LIZ.LLLILZLLLI()) != null && (interfaceC1459040o4UQr2 = interfaceC1461350o8DLLLILZLLLI.Qr2()) != null)) {
            this.LIZ.LLLLII().creativeModel.stickerModel.musicStickerLastState = z;
            if (z) {
                interfaceC1459040o4UQr2.mU0(1, false);
                interfaceC1459040o4UQr2.zi(false);
            } else {
                interfaceC1459040o4UQr2.Qj(null);
            }
        }
    }

    @Override // X.C155Z
    public final void LJIJ(C204628155e c204628155e) {
        if (this.LIZ.LLLLII().getVeAudioRecorderParam() == null) {
            this.LIZ.LLLLII().setVeAudioRecorderParam(new AudioRecorderParam());
        }
        AudioRecorderParam veAudioRecorderParam = this.LIZ.LLLLII().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setHasOriginalSound(c204628155e.LIZ);
            veAudioRecorderParam.setNeedOriginalSound(c204628155e.LIZIZ);
        }
    }

    @Override // X.C155Z
    public final void LJJ(float f) {
        Function1<Boolean, Unit> function1;
        boolean z;
        this.LIZ.getClass();
        InterfaceC1418580n1E interfaceC1418580n1ELLLIZZ = this.LIZ.LLLIZZ();
        boolean z2 = false;
        if (interfaceC1418580n1ELLLIZZ != null) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1418580n1ELLLIZZ.Hr1(!z, false, true);
        }
        C1457860o2a c1457860o2aLLLIIIIL = this.LIZ.LLLIIIIL();
        if (c1457860o2aLLLIIIIL != null && (function1 = c1457860o2aLLLIIIIL.LJFF) != null) {
            if (f == 0.0f) {
                z2 = true;
            }
            function1.invoke(Boolean.valueOf(!z2));
        }
        InterfaceC1459020o4S interfaceC1459020o4SLLLLIL = this.LIZ.LLLLIL();
        if (interfaceC1459020o4SLLLLIL != null) {
            interfaceC1459020o4SLLLLIL.mA1();
        }
    }

    @Override // X.C155Z
    public final void LJJI(boolean z) {
        InterfaceC1461350o8D interfaceC1461350o8DLLLILZLLLI;
        C1459010o4R c1459010o4R = this.LIZ;
        InterfaceC1459040o4U interfaceC1459040o4UQr2 = (InterfaceC1459040o4U) c1459010o4R.LLJLIL.getValue(c1459010o4R, C1459010o4R.LLLIIL[10]);
        if (interfaceC1459040o4UQr2 != null || ((interfaceC1461350o8DLLLILZLLLI = this.LIZ.LLLILZLLLI()) != null && (interfaceC1459040o4UQr2 = interfaceC1461350o8DLLLILZLLLI.Qr2()) != null)) {
            if (z) {
                interfaceC1459040o4UQr2.zi(true);
            } else {
                interfaceC1459040o4UQr2.b6();
            }
        }
    }

    @Override // X.C155Z
    public final void LJIIJ(MusicModel musicModel, boolean z) {
        boolean zLIZJ;
        String strLJJLIIIJ;
        String str;
        InterfaceC1459100o4a interfaceC1459100o4aLLLJL = this.LIZ.LLLJL();
        if (interfaceC1459100o4aLLLJL != null) {
            zLIZJ = interfaceC1459100o4aLLLJL.LIZJ();
        } else {
            zLIZJ = false;
        }
        C01TT.LIZLLL(new AwS101S0210000_22(this.LIZ, z, musicModel, 5));
        if (musicModel != null) {
            VideoPublishEditModel videoPublishEditModelLLLLII = this.LIZ.LLLLII();
            boolean z2 = !zLIZJ;
            C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModelLLLLII);
            c0labLJIILIIL.LJ("creation_id", videoPublishEditModelLLLLII.getCreationId());
            List<MusicModel> mergedMusicList = musicModel.getMergedMusicList();
            if (mergedMusicList.isEmpty()) {
                strLJJLIIIJ = "";
            } else {
                strLJJLIIIJ = C13LP.LJJLIIIJ(mergedMusicList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(275), 30);
            }
            c0labLJIILIIL.LJ("music_id", strLJJLIIIJ);
            if (z2) {
                str = "on";
            } else {
                str = "off";
            }
            c0labLJIILIIL.LJ("to_status", str);
            C20684815ws.LJIILLIIL("ttcrt_select_music_lyrics", c0labLJIILIIL.LIZ);
        }
    }

    @Override // X.C155Z
    public final void LJIILL(int i, boolean z) {
        this.LIZ.LLLLII().getCreativeFlowData().setFlowDataMusicInfo(new FlowDataMusicInfo(z, i));
    }

    @Override // X.C155Z
    public final void LJIJJLI(AVMusic aVMusic, Function1<? super Boolean, Unit> function1) {
        this.LIZ.LLLLIIIILLL().M9(aVMusic, C0C64.LJIILLIIL().LJIIIZ(31744, "studio_sound_sync_show_dialog_edit_music", true, false), function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    @Override // X.C155Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(java.lang.String r13, kotlin.jvm.internal.AwS610S0100000_31 r14, X.InterfaceC1364105Vn r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459000o4Q.LJIL(java.lang.String, kotlin.jvm.internal.AwS610S0100000_31, X.05Vn):java.lang.Object");
    }

    @Override // X.C155Z
    public final void LJIIIZ(MusicModel musicModel, boolean z, String str, long j) {
        String str2;
        if (musicModel != null) {
            VideoPublishEditModel videoPublishEditModelLLLLII = this.LIZ.LLLLII();
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelLLLLII));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelLLLLII));
            c0lab.LJ("shoot_way", videoPublishEditModelLLLLII.mShootWay);
            c0lab.LJ("creation_id", videoPublishEditModelLLLLII.getCreationId());
            c0lab.LJ("music_id", videoPublishEditModelLLLLII.getMusicId());
            if (z) {
                str2 = "auto";
            } else {
                str2 = "manual";
            }
            c0lab.LJ("music_selected_method", str2);
            c0lab.LJ("tab_name", str);
            c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c0lab.LIZIZ(jCurrentTimeMillis, "duration");
            C20684815ws.LJIILLIIL("ai_recommend_panel_music_play_duration", c0lab.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    @Override // X.C155Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.ss.android.ugc.aweme.creative.model.music.AVMusic r12, com.ss.android.ugc.aweme.shortvideo.model.MultiChoose r13, java.lang.Long r14, boolean r15, boolean r16, boolean r17, boolean r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            r11 = this;
            X.0o4R r0 = r11.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLLLII()
            boolean r0 = r0.isCurrentAutoCutMode()
            if (r0 == 0) goto L7f
            X.0o4R r0 = r11.LIZ
            X.0nzM r0 = r0.LLLILZ()
            long r8 = com.ss.android.ugc.aweme.autocut.s.LJIILL(r0)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7f
        L1c:
            X.0o4R r0 = r11.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLLLII()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r2 = r0.musicBuzModel
            X.0o4R r1 = r11.LIZ
            r0 = 0
            r1.LLJILJIL = r0
            r2.trimTypeList = r0
            r3 = r19
            r2.musicSelectTab = r3
            r0 = r20
            r2.musicRecTypeRecent = r0
            X.0nxu r1 = r1.LLLLIIIILLL()
            java.lang.String r0 = "recent"
            boolean r10 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            r5 = 0
            r6 = r16
            r4 = r15
            r3 = r13
            r2 = r12
            r7 = r5
            r1.Tq(r2, r3, r4, r5, r6, r7, r8, r10)
            r3 = 1
            if (r21 == 0) goto L4f
            r11.LJIIZILJ(r3)
        L4f:
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            java.lang.String r1 = "av_mute_sound_with_music"
            r0 = 31744(0x7c00, float:4.4483E-41)
            int r1 = r2.LJIJ(r0, r5, r1, r3)
            r0 = 2
            if (r1 != r0) goto L7e
            if (r18 == 0) goto L7e
            X.0o4R r0 = r11.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLLLII()
            java.lang.String r1 = X.C1428470nHB.LJIILIIL(r0)
            java.lang.String r0 = "upload"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
            X.0o4R r0 = r11.LIZ
            X.0n1E r1 = r0.LLLIZZ()
            if (r1 == 0) goto L7e
            r0 = 0
            r1.N81(r0)
        L7e:
            return
        L7f:
            r8 = -1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459000o4Q.LJIJI(com.ss.android.ugc.aweme.creative.model.music.AVMusic, com.ss.android.ugc.aweme.shortvideo.model.MultiChoose, java.lang.Long, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01db  */
    @Override // X.C155Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r22, com.ss.android.ugc.aweme.creative.model.music.AVMusic r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.String r28, java.lang.String r29, boolean r30, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r31, boolean r32, kotlin.jvm.functions.Function0 r33) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459000o4Q.LJIIIIZZ(java.lang.String, com.ss.android.ugc.aweme.creative.model.music.AVMusic, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, boolean, kotlin.jvm.functions.Function0):void");
    }
}
