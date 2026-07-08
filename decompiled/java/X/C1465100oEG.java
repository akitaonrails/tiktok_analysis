package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS245S0100000_22;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS43S0200100_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465100oEG {
    public final C0EGC LIZ;
    public final C0E48 LIZIZ;
    public final C1465110oEH LIZJ;

    public final void LIZ(boolean z) {
        InterfaceC1465140oEK interfaceC1465140oEK;
        Integer numValueOf;
        Integer numLIZLLL;
        int iIntValue;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String musicId;
        VecNLETrackSlotSPtr sortedSlots;
        int iIntValue2;
        boolean zLJFF;
        Long l;
        boolean zLJFF2;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        boolean editMusicSyncMode;
        boolean z2;
        MusicObject musicObject;
        Object next;
        Pair<Integer, Integer> pair;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        final C1465110oEH c1465110oEH = this.LIZJ;
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1465110oEH.LIZ);
        InterfaceC1453610nvj interfaceC1453610nvj = null;
        if (c1drgLJIIIZ != null) {
            interfaceC1465140oEK = (InterfaceC1465140oEK) c1drgLJIIIZ.LJIIL(null, InterfaceC1465140oEK.class);
        } else {
            interfaceC1465140oEK = null;
        }
        c1465110oEH.LJIIIIZZ = interfaceC1465140oEK;
        C0EU6 c0eu6 = c1465110oEH.LJJII;
        c0eu6.LJFF = null;
        c0eu6.LIZLLL = null;
        c0eu6.LJ = null;
        c0eu6.LJIIIZ = System.currentTimeMillis();
        C0E48 c0e48 = c1465110oEH.LIZJ;
        if (c0e48 != null) {
            c0e48.getPlayer().pause(false);
            if (c1465110oEH.LJIIIIZZ()) {
                c1465110oEH.LJIIL = !z;
            } else {
                c1465110oEH.LJIIL = ((ArrayList) C349930Dnj.LJFF(C350870DpF.LJI(c0e48))).isEmpty();
            }
            c1465110oEH.LJJI = C349940Dnk.LJ(C350870DpF.LJI(c0e48), AFwS234S0000000_5.get$arr$(19));
            c1465110oEH.LJIIJJI = c0e48.getPlayer().Jh();
            c1465110oEH.LJIIJ = null;
            c1465110oEH.LJIILJJIL = null;
            c1465110oEH.LJIJ = C350890DpH.LJ(c0e48);
            if (c1465110oEH.LJIIIIZZ() && !z) {
                c1465110oEH.LJIJJ = null;
            } else {
                if (c1465110oEH.LJIJ) {
                    NLETrack nLETrackPt = c0e48.Pt();
                    if (C351220Dpo.LLLFF(nLETrackPt) && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
                        if (nLETrackPt != null) {
                            numLIZLLL = Integer.valueOf(nLETrackPt.getSlotIndex(nLETrackSlotLLLLLLIL));
                        }
                        iIntValue = 0;
                        numValueOf = Integer.valueOf(iIntValue);
                    } else {
                        numLIZLLL = C349940Dnk.LIZLLL(c1465110oEH.LJIIJJI * 1000, c0e48);
                    }
                    if (numLIZLLL != null && numLIZLLL.intValue() >= 0) {
                        iIntValue = numLIZLLL.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue);
                } else if (z && c1465110oEH.LJIIIIZZ()) {
                    numValueOf = 0;
                } else {
                    numValueOf = null;
                }
                c1465110oEH.LJIJJ = numValueOf;
            }
            AVMusic aVMusicLJI = c1465110oEH.LJI(z);
            if (aVMusicLJI == null || (musicId = aVMusicLJI.getMusicId()) == null) {
                musicId = "";
            }
            c1465110oEH.LJIJI = musicId;
            if (c1465110oEH.LJIIL && c1465110oEH.LJIIIIZZ()) {
                c1465110oEH.LJIIJ = Long.valueOf(C0EC2.LIZLLL(c0e48) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            } else {
                NLETrack nLETrack = (NLETrack) C13LP.LJJJLL(C349930Dnj.LJFF(C350870DpF.LJI(c0e48)));
                if (nLETrack != null && (sortedSlots = nLETrack.getSortedSlots()) != null) {
                    Integer num = c1465110oEH.LJIJJ;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLZIJ(iIntValue2, sortedSlots);
                    if (nLETimeSpaceNode != null) {
                        c1465110oEH.LJIIJ = Long.valueOf(nLETimeSpaceNode.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                }
            }
            MutableLiveData mutableLiveDataLIZ = c0e48.S7().LIZ("status_music_sync_on");
            if (mutableLiveDataLIZ != null) {
                zLJFF = Intrinsics.LJFF(mutableLiveDataLIZ.getValue(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (zLJFF) {
                c1465110oEH.LJIIIZ = 0L;
            } else if (c1465110oEH.LJIJJ != null) {
                c1465110oEH.LJIIIZ = 0L;
                Long l2 = c1465110oEH.LJIIJ;
                if (l2 != null) {
                    c1465110oEH.LJIIIZ = l2.longValue();
                }
            } else {
                c1465110oEH.LJIIIZ = 0L;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_change_replace_sound_position", true, false) && (l = c1465110oEH.LJIIJ) != null) {
                    c1465110oEH.LJIIIZ = l.longValue();
                }
            }
            C1DRG c1drgLJIIIZ2 = C1664600tQ2.LJIIIZ(c1465110oEH.LIZ);
            if (c1drgLJIIIZ2 != null) {
                interfaceC1453610nvj = (InterfaceC1453610nvj) c1drgLJIIIZ2.LJIIL(null, InterfaceC1453610nvj.class);
            }
            c1465110oEH.LJJIII = interfaceC1453610nvj;
            c1465110oEH.LJJ = false;
            c1465110oEH.LJIIIZ().LJIIIZ().LIZ(c1465110oEH.LIZ, new AObjectS245S0100000_22(c1465110oEH, 3));
            c1465110oEH.LJIIIZ().LJIILJJIL().LIZ(c1465110oEH.LIZ, new AObjectS240S0100000_5(c1465110oEH, 7));
            c1465110oEH.LJIIIZ().LIZLLL().LIZ(c1465110oEH.LIZ, new AObjectS245S0100000_22(c1465110oEH, 4));
            InterfaceC1459070o4X interfaceC1459070o4X = c1465110oEH.LJFF;
            if (interfaceC1459070o4X != null) {
                interfaceC1459070o4X.refresh();
                c1465110oEH.LJIILIIL();
            } else {
                final C0E48 c0e482 = c1465110oEH.LIZJ;
                if (c0e482 != null) {
                    IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
                    C1DRG c1drgLJIIIZ3 = C1664600tQ2.LJIIIZ(c1465110oEH.LIZ);
                    if (c1drgLJIIIZ3 == null) {
                        c1drgLJIIIZ3 = new C1DRG(new C1DRF[0]);
                    }
                    c1465110oEH.LJFF = musicService.hl(c1drgLJIIIZ3, new C155W(c0e482) { // from class: X.0oED
                        public final C1465080oEE LIZ;
                        public final /* synthetic */ C0E48 LIZJ;

                        @Override // X.C155W
                        public final void Bt() {
                        }

                        @Override // X.C155W
                        public final boolean Ct() {
                            return false;
                        }

                        @Override // X.C155W
                        public final Boolean Dt() {
                            return null;
                        }

                        @Override // X.C155W
                        public final void F5() {
                        }

                        @Override // X.C155W
                        public final void Ft() {
                        }

                        @Override // X.C155W
                        public final void G5() {
                        }

                        @Override // X.C155W
                        public final Boolean Ht() {
                            return null;
                        }

                        @Override // X.C155W
                        public final MusicModel I5(MusicModel musicModel) {
                            return musicModel;
                        }

                        @Override // X.C155W
                        public final boolean J5() {
                            return false;
                        }

                        @Override // X.C155W
                        public final boolean Kt() {
                            return false;
                        }

                        @Override // X.C155W
                        public final C11PQ<Integer> yt() {
                            return null;
                        }

                        @Override // X.C155W
                        public final C204628155e At() {
                            return new C204628155e(false, false, false, 0.0f, false, false, false, false, 8191);
                        }

                        @Override // X.C155W
                        public final InterfaceC1459100o4a Et() {
                            return this.LIZIZ.LJIIIZ();
                        }

                        @Override // X.C155W
                        public final C155D H5() {
                            final C1465110oEH c1465110oEH2 = this.LIZIZ;
                            final C0E48 c0e483 = this.LIZJ;
                            return new C155D() { // from class: X.0FGE
                                @Override // X.C155D
                                public final void LIZ() {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    C0EU6 c0eu62 = c1465110oEH2.LJJII;
                                    long j = jCurrentTimeMillis - (c0eu62.LJIIIZ - c0eu62.LJIIIIZZ);
                                    c0eu62.LIZLLL = Long.valueOf(j);
                                    c0eu62.LIZ();
                                    C0EU6 c0eu63 = c1465110oEH2.LJJII;
                                    c0eu63.LJFF = Long.valueOf(j);
                                    c0eu63.LIZ();
                                }

                                @Override // X.C155D
                                public final void LIZIZ() {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    C0EU6 c0eu62 = c1465110oEH2.LJJII;
                                    c0eu62.LIZIZ(jCurrentTimeMillis - (c0eu62.LJIIIZ - c0eu62.LJIIIIZZ));
                                }

                                @Override // X.C155D
                                public final void LIZJ(boolean z3) {
                                    C0EU5.LIZIZ(c0e483, "ep_audio_list", null, z3);
                                }
                            };
                        }

                        @Override // X.C155W
                        public final boolean Jt() {
                            this.LIZIZ.getClass();
                            VideoPublishEditModel videoPublishEditModelLJIIJ2 = C1465110oEH.LJIIJ();
                            if (videoPublishEditModelLJIIJ2 != null) {
                                return C1403850mdT.LJFF(videoPublishEditModelLJIIJ2);
                            }
                            return false;
                        }

                        @Override // X.C155W
                        public final boolean K5() {
                            this.LIZIZ.getClass();
                            VideoPublishEditModel videoPublishEditModelLJIIJ2 = C1465110oEH.LJIIJ();
                            if (videoPublishEditModelLJIIJ2 != null) {
                                return u4.LJIIIIZZ(videoPublishEditModelLJIIJ2);
                            }
                            return false;
                        }

                        @Override // X.C155W
                        public final InterfaceC1455230nyL zt() {
                            return this.LIZ;
                        }

                        @Override // X.C155W
                        public final int Gt(MusicModel musicModel) {
                            MusicBuzModel musicBuzModel;
                            CreativeModel creativeModel;
                            if (C1399580mWa.LIZ() && new C15KP().apply(musicModel) != null && C1459090o4Z.LIZIZ(musicModel)) {
                                this.LIZIZ.getClass();
                                VideoPublishEditModel videoPublishEditModelLJIIJ2 = C1465110oEH.LJIIJ();
                                if (videoPublishEditModelLJIIJ2 != null && (creativeModel = videoPublishEditModelLJIIJ2.creativeModel) != null) {
                                    musicBuzModel = creativeModel.musicBuzModel;
                                } else {
                                    musicBuzModel = null;
                                }
                                return C1465190oEP.LIZIZ(musicBuzModel, musicModel, null);
                            }
                            return musicModel.getPresenterDuration();
                        }

                        @Override // X.C155W
                        public final void It(List<? extends MusicModel> list) {
                            InterfaceC1459150o4f interfaceC1459150o4f = this.LIZIZ.LJI;
                            if (interfaceC1459150o4f != null) {
                                interfaceC1459150o4f.cancel();
                                this.LIZIZ.LJI = null;
                            }
                            C1465110oEH c1465110oEH2 = this.LIZIZ;
                            IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
                            C2216191BoX.LIZ.getClass();
                            c1465110oEH2.LJI = iMusicService.LJIJ(C2216191BoX.LIZ(), list);
                            InterfaceC1459150o4f interfaceC1459150o4f2 = this.LIZIZ.LJI;
                            if (interfaceC1459150o4f2 != null) {
                                interfaceC1459150o4f2.load();
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.0oEE] */
                        {
                            this.LIZJ = c0e482;
                            this.LIZ = new InterfaceC1455230nyL() { // from class: X.0oEE
                                @Override // X.InterfaceC1455230nyL
                                public final MusicBuzModel LIZIZ() {
                                    return c1465110oEH.LJII();
                                }

                                @Override // X.InterfaceC1455230nyL
                                public final void LIZ(AVMusic aVMusic) {
                                    CreativeModel creativeModel;
                                    MusicBuzModel musicBuzModel;
                                    CreativeModel creativeModel2;
                                    C1465110oEH c1465110oEH2 = c1465110oEH;
                                    MusicBuzModel musicBuzModel2 = null;
                                    if (c1465110oEH2.LJIIIIZZ() && c1465110oEH2.LJIIJJI()) {
                                        Integer num2 = c1465110oEH2.LJIJJ;
                                        if (num2 != null) {
                                            int iIntValue3 = num2.intValue();
                                            VideoPublishEditModel videoPublishEditModelLJIIJ2 = C1465110oEH.LJIIJ();
                                            if (videoPublishEditModelLJIIJ2 != null && (creativeModel2 = videoPublishEditModelLJIIJ2.creativeModel) != null) {
                                                musicBuzModel2 = creativeModel2.musicBuzModel;
                                            }
                                            if (iIntValue3 >= 0) {
                                                if (iIntValue3 == 0) {
                                                    C1452640nuA.LJII(aVMusic, false, musicBuzModel2);
                                                }
                                                if (musicBuzModel2 != null && (musicBuzModel = (MusicBuzModel) C13LP.LJJJLZIJ(iIntValue3, C1429680nJ8.LIZIZ(musicBuzModel2))) != null) {
                                                    MusicBeanUtilKt.updateAVMusic(musicBuzModel, aVMusic);
                                                    musicBuzModel.isPhotoMvModeMusic = false;
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    VideoPublishEditModel videoPublishEditModelLJIIJ3 = C1465110oEH.LJIIJ();
                                    if (videoPublishEditModelLJIIJ3 != null && (creativeModel = videoPublishEditModelLJIIJ3.creativeModel) != null) {
                                        musicBuzModel2 = creativeModel.musicBuzModel;
                                    }
                                    C1452640nuA.LJII(aVMusic, false, musicBuzModel2);
                                }
                            };
                        }
                    });
                    long jLJII = C351220Dpo.LJII(c0e482.LLFII().LLZ()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    VideoPublishEditModel videoPublishEditModelLJIIJ2 = C1465110oEH.LJIIJ();
                    if (videoPublishEditModelLJIIJ2 == null) {
                        videoPublishEditModelLJIIJ2 = new VideoPublishEditModel();
                    }
                    C1458190o37 c1458190o37 = new C1458190o37(videoPublishEditModelLJIIJ2, true);
                    C1465150oEL c1465150oEL = new C1465150oEL(c1465110oEH);
                    VideoPublishEditModel videoPublishEditModelLJIIJ3 = C1465110oEH.LJIIJ();
                    if (videoPublishEditModelLJIIJ3 != null) {
                        zLJFF2 = C1403850mdT.LJFF(videoPublishEditModelLJIIJ3);
                    } else {
                        zLJFF2 = false;
                    }
                    C129C c129c = new C129C(false, c1465150oEL, zLJFF2, C293810BfP.LIZ(), true, 32);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bn, c1465110oEH.LJ);
                    MusicBuzModel musicBuzModelLJII = c1465110oEH.LJII();
                    if (musicBuzModelLJII != null && !C1429680nJ8.LJFF(musicBuzModelLJII) && musicBuzModelLJII != null && (musicObject = musicBuzModelLJII.music) != null) {
                        MusicBeanUtilKt.getMusicId(musicObject);
                    }
                    AwS43S0200100_22 awS43S0200100_22 = new AwS43S0200100_22(c1465110oEH, jLJII, c0e482, 0);
                    C1465110oEH.LJIIJ();
                    C363500EMy c363500EMy = C363500EMy.LIZ;
                    VideoPublishEditModel videoPublishEditModelLJIIJ4 = C1465110oEH.LJIIJ();
                    c363500EMy.getClass();
                    boolean zLJIIJ = C363500EMy.LJIIJ(videoPublishEditModelLJIIJ4);
                    C19GS c19gs = c1465110oEH.LJ;
                    C19A3 c19a3 = c1465110oEH.LIZ;
                    VideoPublishEditModel videoPublishEditModelLJIIJ5 = C1465110oEH.LJIIJ();
                    if ((videoPublishEditModelLJIIJ5 == null || !videoPublishEditModelLJIIJ5.isPhotoMvMode()) && (videoPublishEditModelLJIIJ = C1465110oEH.LJIIJ()) != null) {
                        C1428470nHB.LJJZZI(videoPublishEditModelLJIIJ);
                    }
                    C204628155e c204628155e = new C204628155e(false, false, false, 0.0f, false, false, false, false, 8191);
                    VideoPublishEditModel videoPublishEditModelLJIIJ6 = C1465110oEH.LJIIJ();
                    if (videoPublishEditModelLJIIJ6 != null) {
                        editMusicSyncMode = videoPublishEditModelLJIIJ6.getEditMusicSyncMode();
                    } else {
                        editMusicSyncMode = false;
                    }
                    C1465090oEF c1465090oEF = c1465110oEH.LJJIIJZLJL;
                    C00IV c00iv = C00IV.EDITPAGE;
                    if (c1465110oEH.LJIIJJI() && !c1465110oEH.LJIIIIZZ()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C155H c155h = new C155H(c129c, null, awS43S0200100_22, zLJIIJ, numLIZJ, c19gs, c19a3, c204628155e, editMusicSyncMode, false, true, true, c1465090oEF, c1458190o37, c00iv, false, false, 8, z2, null, new C204636155m(true, C373030Ejt.LIZIZ(c1465110oEH.LJ), C0JAI.LIZIZ(r3) * 0.9f), null, null, new AwS566S0100000_22(c1465110oEH, 34), false, false, null, null, null, null, new C1465160oEM(false), new C1465180oEO(false), new C1465170oEN(false), -39452672, 241);
                    InterfaceC1459070o4X interfaceC1459070o4X2 = c1465110oEH.LJFF;
                    if (interfaceC1459070o4X2 != null) {
                        interfaceC1459070o4X2.LJI(c155h);
                    }
                    c1465110oEH.LJIL = c155h;
                    c1465110oEH.LJIILIIL();
                }
            }
            C363500EMy.LIZ.getClass();
            Iterator it2 = ((ArrayList) C351220Dpo.LJIJJ(C350870DpF.LJI(c0e48))).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    NLETrack nLETrack2 = (NLETrack) next;
                    if (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack3 = (NLETrack) next;
            if (nLETrack3 != null && (!nLETrack3.getSortedSlots().isEmpty()) && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrack3.getSortedSlots().get(0).getMainSegment())) != null) {
                pair = new Pair<>(Integer.valueOf((int) nLESegmentAudioDynamicCast.getTimeClipStart()), Integer.valueOf((int) nLESegmentAudioDynamicCast.getTimeClipEnd()));
            } else {
                pair = null;
            }
            c1465110oEH.LJIIZILJ = pair;
        }
    }

    public C1465100oEG(C372480Ej0 c372480Ej0, C0EGC c0egc, C0E48 c0e48, C0EC6 c0ec6) {
        this.LIZ = c0egc;
        this.LIZIZ = c0e48;
        this.LIZJ = new C1465110oEH(c372480Ej0, c0egc, c0e48, c0ec6);
    }
}
