package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MultiChoose;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS101S0210000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS59S0210000_5;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465110oEH implements C0EM3 {
    public final C19A3 LIZ;
    public final C0EGC LIZIZ;
    public final C0E48 LIZJ;
    public final C0EC6 LIZLLL;
    public final C19GS LJ;
    public InterfaceC1459070o4X LJFF;
    public InterfaceC1459150o4f LJI;
    public final C0EY2 LJII;
    public InterfaceC1465140oEK LJIIIIZZ;
    public long LJIIIZ;
    public Long LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public AVMusic LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public Pair<Integer, Integer> LJIIZILJ;
    public boolean LJIJ;
    public String LJIJI;
    public Integer LJIJJ;
    public boolean LJIJJLI;
    public C155H LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public final C0EU6 LJJII;
    public InterfaceC1453610nvj LJJIII;
    public final C01GW LJJIIJ;
    public final C1465090oEF LJJIIJZLJL;

    public static VideoPublishEditModel LJIIJ() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // X.C0EM3
    public final Long LIZ() {
        return Long.valueOf(this.LJIIIZ);
    }

    @Override // X.C0EM3
    public final void LIZIZ() {
        InterfaceC1459070o4X interfaceC1459070o4X = this.LJFF;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.refresh();
        }
    }

    @Override // X.C0EM3
    public final void LIZJ() {
        InterfaceC1459070o4X interfaceC1459070o4X = this.LJFF;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.hide();
        }
        if (C306610C0d.LIZ()) {
            return;
        }
        C0CHQ.LIZ().LJIIL().updateCurrentScene("tool_editor_pro_scene", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C991110btl LJ() {
        /*
            r9 = this;
            X.0E48 r0 = r9.LIZJ
            if (r0 == 0) goto Le
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.Rn()
            java.lang.String r6 = X.C348160Dks.LIZ(r0)
            if (r6 != 0) goto L10
        Le:
            java.lang.String r6 = ""
        L10:
            boolean r0 = X.C0C1M.LIZ()
            java.lang.String r8 = "enable_load_recommend_sync"
            r7 = 31744(0x7c00, float:4.4483E-41)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L78
            int r0 = r6.length()
            if (r0 <= 0) goto L78
            X.0C64 r0 = X.C0C64.LJIILLIIL()
            boolean r0 = r0.LJIIIZ(r7, r8, r5, r4)
            if (r0 == 0) goto L6b
            boolean r0 = X.C0C1M.LIZ()
            if (r0 == 0) goto L6b
            X.0oEK r0 = r9.LJIIIIZZ
            if (r0 == 0) goto L76
            boolean r0 = r0.Us1(r6)
            if (r0 != r5) goto L76
        L3c:
            r1 = 1
        L3d:
            X.0oEK r0 = r9.LJIIIIZZ
            if (r0 == 0) goto L69
            boolean r0 = r0.mw1(r6)
            if (r0 != r5) goto L69
            r0 = 1
        L48:
            if (r1 == 0) goto L78
            if (r0 != 0) goto L78
            r3 = 1
        L4d:
            X.0btl r2 = new X.0btl
            boolean r1 = X.C0C1M.LIZ()
            X.0C64 r0 = X.C0C64.LJIILLIIL()
            boolean r0 = r0.LJIIIZ(r7, r8, r5, r4)
            if (r0 == 0) goto L67
            boolean r0 = X.C0C1M.LIZ()
            if (r0 == 0) goto L67
        L63:
            r2.<init>(r3, r6, r1, r5)
            return r2
        L67:
            r5 = 0
            goto L63
        L69:
            r0 = 0
            goto L48
        L6b:
            X.0oEK r0 = r9.LJIIIIZZ
            if (r0 == 0) goto L76
            boolean r0 = r0.eC0(r6)
            if (r0 != r5) goto L76
            goto L3c
        L76:
            r1 = 0
            goto L3d
        L78:
            r3 = 0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465110oEH.LJ():X.0btl");
    }

    public final Integer LJFF() {
        NLETrack nLETrackLIZLLL;
        VecNLETrackSlotSPtr sortedSlots;
        Integer numValueOf;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 != null && this.LJIIL && LJIIIIZZ() && this.LJIILJJIL != null && (nLETrackLIZLLL = C349930Dnj.LIZLLL(C350870DpF.LJI(c0e48))) != null && (sortedSlots = nLETrackLIZLLL.getSortedSlots()) != null && (numValueOf = Integer.valueOf(sortedSlots.size() - 1)) != null) {
            numValueOf.intValue();
            String extra = sortedSlots.get(numValueOf.intValue()).getExtra("ep_audio_music_id");
            AVMusic aVMusic = this.LJIILJJIL;
            if (Intrinsics.LJFF(extra, aVMusic != null ? aVMusic.getMusicId() : null)) {
                return numValueOf;
            }
        }
        return null;
    }

    public final boolean LJIIIIZZ() {
        return C349940Dnk.LIZ(this.LIZJ, LJIIJ());
    }

    public final InterfaceC1459100o4a LJIIIZ() {
        return (InterfaceC1459100o4a) this.LJJIIJ.getValue();
    }

    public final boolean LJIIJJI() {
        return this.LJIJ && this.LJIJI.length() > 0 && this.LJIJJ != null && !this.LJIIL;
    }

    public final void LJIIL() {
        Object next;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr sortedSlots2;
        NLETrackSlot nLETrackSlot;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        if (this.LJIIL) {
            NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(C350870DpF.LJI(c0e48));
            if (nLETrackLIZLLL == null || (sortedSlots2 = nLETrackLIZLLL.getSortedSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJLIIIJL(sortedSlots2)) == null) {
                return;
            }
            c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 238), "selected_audio_track_slot", true);
            return;
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        Integer num = this.LJIJJ;
        c363500EMy.getClass();
        Iterator it2 = ((ArrayList) C351220Dpo.LJIJJ(C350870DpF.LJI(c0e48))).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            nLETrack = (NLETrack) next;
            if (C351220Dpo.LLILLL(nLETrack)) {
                break;
            }
        } while (!C351220Dpo.LLJILLL(nLETrack));
        NLETrack nLETrack2 = (NLETrack) next;
        if (nLETrack2 == null || (sortedSlots = nLETrack2.getSortedSlots()) == null || sortedSlots.isEmpty()) {
            return;
        }
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(num != null ? num.intValue() : 0, sortedSlots);
        if (nLETrackSlot2 == null) {
            nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(sortedSlots);
        }
        if (nLETrackSlot2 != null) {
            c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlot2, 0, null, false, 0, 238), "selected_audio_track_slot", true);
        }
    }

    public final void LJIILIIL() {
        String musicId;
        C1456960o18 stripMusicModel;
        CreativeModel creativeModel;
        C1456960o18 stripMusicModel2;
        CreativeModel creativeModel2;
        CreativeModel creativeModel3;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        LJIIIZ().LJIILIIL(true, this.LJIIL);
        this.LJJIFFI = false;
        VideoPublishEditModel videoPublishEditModelLJIIJ = LJIIJ();
        if (videoPublishEditModelLJIIJ != null && videoPublishEditModelLJIIJ.getMusicId() != null) {
            VideoPublishEditModel videoPublishEditModelLJIIJ2 = LJIIJ();
            if (MusicBeanUtilKt.extractAVMusic((videoPublishEditModelLJIIJ2 == null || (creativeModel3 = videoPublishEditModelLJIIJ2.creativeModel) == null) ? null : creativeModel3.musicBuzModel) != null) {
                if (LJIIIIZZ() && LJIIJJI()) {
                    Integer num = this.LJIJJ;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        VideoPublishEditModel videoPublishEditModelLJIIJ3 = LJIIJ();
                        AVMusic aVMusicLIZLLL = C1452640nuA.LIZLLL((videoPublishEditModelLJIIJ3 == null || (creativeModel2 = videoPublishEditModelLJIIJ3.creativeModel) == null) ? null : creativeModel2.musicBuzModel, iIntValue);
                        if (aVMusicLIZLLL == null || ((stripMusicModel2 = aVMusicLIZLLL.getStripMusicModel()) != null && stripMusicModel2.getStrippedMusic())) {
                            aVMusicLIZLLL = null;
                        }
                        this.LJIILJJIL = aVMusicLIZLLL;
                        this.LJIILLIIL = aVMusicLIZLLL != null ? aVMusicLIZLLL.getPath() : null;
                    }
                } else if (!LJIIIIZZ() || !this.LJIIL) {
                    VideoPublishEditModel videoPublishEditModelLJIIJ4 = LJIIJ();
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic((videoPublishEditModelLJIIJ4 == null || (creativeModel = videoPublishEditModelLJIIJ4.creativeModel) == null) ? null : creativeModel.musicBuzModel);
                    if (aVMusicExtractAVMusic == null || ((stripMusicModel = aVMusicExtractAVMusic.getStripMusicModel()) != null && stripMusicModel.getStrippedMusic())) {
                        aVMusicExtractAVMusic = null;
                    }
                    this.LJIILJJIL = aVMusicExtractAVMusic;
                    this.LJIILLIIL = aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.getPath() : null;
                }
            }
        }
        C155H c155h = this.LJIL;
        if (c155h != null) {
            c155h.LJIIZILJ = LJIIJJI() && !LJIIIIZZ();
            c155h.LJIJI = new C204636155m(true, C373030Ejt.LIZIZ(c155h.LJFF), C0JAI.LIZIZ(r0) * 0.9f);
        }
        c0e48.S7().LIZIZ(new C0E2C(0.0f, "ai_music_panel", true), "panel_bounce_event", false);
        this.LIZIZ.W0(this);
        AVMusic aVMusicLJI = LJI(false);
        if (aVMusicLJI == null || (musicId = aVMusicLJI.getMusicId()) == null) {
            musicId = "";
        }
        this.LJIJI = musicId;
        InterfaceC1459070o4X interfaceC1459070o4X = this.LJFF;
        TuxSheet tuxSheetShow = interfaceC1459070o4X != null ? interfaceC1459070o4X.show() : null;
        if (C301730BsB.LIZ()) {
            C0EHK.LJI(tuxSheetShow);
        }
    }

    public final void LJIILJJIL() {
        CreativeModel creativeModel;
        Integer num = this.LJIJJ;
        AVMusic aVMusic = this.LJIILJJIL;
        if (num == null || aVMusic == null) {
            this.LIZIZ.i1(aVMusic, this.LJIIL);
            return;
        }
        if (num.intValue() == 0 && !this.LJIJ) {
            this.LIZIZ.i1(this.LJIILJJIL, this.LJIIL);
            return;
        }
        VideoPublishEditModel videoPublishEditModelLJIIJ = LJIIJ();
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic((videoPublishEditModelLJIIJ == null || (creativeModel = videoPublishEditModelLJIIJ.creativeModel) == null) ? null : creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic == null) {
            this.LIZIZ.i1(aVMusic, false);
            return;
        }
        if (num.intValue() == 0) {
            aVMusic.setExtendMusicList(aVMusicExtractAVMusic.getExtendMusicList());
            this.LIZIZ.i1(aVMusic, false);
            return;
        }
        List<AVMusic> extendMusicList = aVMusicExtractAVMusic.getExtendMusicList();
        if (extendMusicList == null) {
            aVMusicExtractAVMusic.setExtendMusicList(new ArrayList());
            List<AVMusic> extendMusicList2 = aVMusicExtractAVMusic.getExtendMusicList();
            if (extendMusicList2 != null) {
                extendMusicList2.add(aVMusic);
            }
        } else if (!extendMusicList.isEmpty() && num.intValue() - 1 < extendMusicList.size()) {
            ListProtector.set(extendMusicList, num.intValue() - 1, aVMusic);
        }
        this.LIZIZ.i1(aVMusicExtractAVMusic, false);
    }

    public final MusicBuzModel LJII() {
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        if (!LJIIIIZZ() || !LJIIJJI()) {
            VideoPublishEditModel videoPublishEditModelLJIIJ = LJIIJ();
            if (videoPublishEditModelLJIIJ == null || (creativeModel = videoPublishEditModelLJIIJ.creativeModel) == null) {
                return null;
            }
            return creativeModel.musicBuzModel;
        }
        Integer num = this.LJIJJ;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        VideoPublishEditModel videoPublishEditModelLJIIJ2 = LJIIJ();
        MusicBuzModel musicBuzModel = (videoPublishEditModelLJIIJ2 == null || (creativeModel2 = videoPublishEditModelLJIIJ2.creativeModel) == null) ? null : creativeModel2.musicBuzModel;
        if (musicBuzModel == null || iIntValue < 0) {
            return null;
        }
        return (MusicBuzModel) C13LP.LJJJLZIJ(iIntValue, C1429680nJ8.LIZIZ(musicBuzModel));
    }

    @Override // X.C0EM3
    public final boolean LIZLLL(String str) {
        return C349940Dnk.LJFF(LJIIJ(), str, this.LJIIL);
    }

    public final AVMusic LJI(boolean z) {
        CreativeModel creativeModel;
        Integer num;
        CreativeModel creativeModel2;
        MusicBuzModel musicBuzModel = null;
        if (LJIIIIZZ() && ((z || LJIIJJI()) && (num = this.LJIJJ) != null)) {
            int iIntValue = num.intValue();
            VideoPublishEditModel videoPublishEditModelLJIIJ = LJIIJ();
            if (videoPublishEditModelLJIIJ != null && (creativeModel2 = videoPublishEditModelLJIIJ.creativeModel) != null) {
                musicBuzModel = creativeModel2.musicBuzModel;
            }
            return C1452640nuA.LIZLLL(musicBuzModel, iIntValue);
        }
        VideoPublishEditModel videoPublishEditModelLJIIJ2 = LJIIJ();
        if (videoPublishEditModelLJIIJ2 != null && (creativeModel = videoPublishEditModelLJIIJ2.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        }
        return MusicBeanUtilKt.extractAVMusic(musicBuzModel);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0oEF] */
    public C1465110oEH(C372480Ej0 c372480Ej0, C0EGC c0egc, C0E48 c0e48, C0EC6 c0ec6) {
        this.LIZ = c372480Ej0;
        this.LIZIZ = c0egc;
        this.LIZJ = c0e48;
        this.LIZLLL = c0ec6;
        this.LJ = (C19GS) c372480Ej0.requireActivity();
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c372480Ej0);
        this.LJII = c1drgLJIIIZ != null ? (C0EY2) c1drgLJIIIZ.LJIIL(null, C0EY2.class) : null;
        this.LJIIL = true;
        this.LJIILL = "";
        this.LJIJI = "";
        C0EU6 c0eu6 = new C0EU6("ep_audio_list", false);
        c0eu6.LJII = c0e48;
        this.LJJII = c0eu6;
        this.LJJIIJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 32));
        this.LJJIIJZLJL = new C155Z() { // from class: X.0oEF
            @Override // X.C155Z
            public final void LIZ(String str) {
            }

            @Override // X.C155Z
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.C155Z
            public final boolean LIZJ() {
                return true;
            }

            @Override // X.C155Z
            public final void LIZLLL() {
            }

            @Override // X.C155Z
            public final void LJII() {
            }

            @Override // X.C155Z
            public final void LJIIIZ(MusicModel musicModel, boolean z, String str, long j) {
            }

            @Override // X.C155Z
            public final void LJIIL() {
            }

            @Override // X.C155Z
            public final void LJIILJJIL(String str) {
            }

            @Override // X.C155Z
            public final void LJIILLIIL(int i, Aweme aweme) {
            }

            @Override // X.C155Z
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.C155Z
            public final void LJIJ(C204628155e c204628155e) {
            }

            @Override // X.C155Z
            public final void LJIJJ(Aweme aweme, int i, String str) {
            }

            @Override // X.C155Z
            public final void LJJ(float f) {
            }

            @Override // X.C155Z
            public final void LJJI(boolean z) {
            }

            @Override // X.C155Z
            public final void LJJIFFI() {
            }

            @Override // X.C155Z
            public final void LJFF() {
                CreativeModel creativeModel;
                MusicBuzModel musicBuzModel;
                CreativeModel creativeModel2;
                MusicBuzModel musicBuzModel2;
                C0E48 c0e482 = this.LIZ.LIZJ;
                if (c0e482 == null) {
                    return;
                }
                C363500EMy.LIZ.getClass();
                C363500EMy.LJIILLIIL(c0e482);
                if (this.LIZ.LJIIL) {
                    C350890DpH.LIZJ(c0e482);
                } else {
                    C350890DpH.LJFF(c0e482);
                }
                this.LIZ.getClass();
                VideoPublishEditModel videoPublishEditModelLJIIJ = C1465110oEH.LJIIJ();
                if (videoPublishEditModelLJIIJ != null) {
                    C1465110oEH c1465110oEH = this.LIZ;
                    AVMusic aVMusic = c1465110oEH.LJIILJJIL;
                    String musicId = aVMusic != null ? aVMusic.getMusicId() : null;
                    AVMusic aVMusic2 = c1465110oEH.LJIILJJIL;
                    C1402610mbT.LJIIZILJ(videoPublishEditModelLJIIJ, musicId, aVMusic2 != null ? aVMusic2.getPromoId() : null, c1465110oEH.LIZLLL(c1465110oEH.LJIJI));
                }
                boolean z = false;
                c0e482.getPlayer().pause(false);
                c0e482.getPlayer().LJIJI(this.LIZ.LIZ().longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
                this.LIZ.LIZIZ.W0(null);
                AVMusic aVMusic3 = this.LIZ.LJIILJJIL;
                String musicId2 = aVMusic3 != null ? aVMusic3.getMusicId() : null;
                this.LIZ.getClass();
                VideoPublishEditModel videoPublishEditModelLJIIJ2 = C1465110oEH.LJIIJ();
                if (Intrinsics.LJFF(musicId2, (videoPublishEditModelLJIIJ2 == null || (creativeModel2 = videoPublishEditModelLJIIJ2.creativeModel) == null || (musicBuzModel2 = creativeModel2.musicBuzModel) == null) ? null : C1429680nJ8.LIZJ(musicBuzModel2))) {
                    AVMusic aVMusic4 = this.LIZ.LJIILJJIL;
                    if (aVMusic4 != null) {
                        VideoPublishEditModel videoPublishEditModelLJIIJ3 = C1465110oEH.LJIIJ();
                        if (videoPublishEditModelLJIIJ3 != null && (creativeModel = videoPublishEditModelLJIIJ3.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
                            z = musicBuzModel.isCollected;
                        }
                        aVMusic4.setCollected(z);
                    }
                } else {
                    AVMusic aVMusic5 = this.LIZ.LJIILJJIL;
                    if (aVMusic5 != null) {
                        aVMusic5.setCollected(C1152660g6K.LIZ.containsKey(aVMusic5.getMusicId()));
                    }
                }
                this.LIZ.LJIILJJIL();
                InterfaceC1459070o4X interfaceC1459070o4X = this.LIZ.LJFF;
                if (interfaceC1459070o4X != null) {
                    interfaceC1459070o4X.hide();
                }
                C363500EMy.LJIIZILJ(c0e482, this.LIZ.LJIILL);
                C1465110oEH c1465110oEH2 = this.LIZ;
                c1465110oEH2.LJIILJJIL = null;
                c1465110oEH2.LJIILLIIL = null;
                c1465110oEH2.LJIILL = "";
                c1465110oEH2.LJIIL();
                if (C306610C0d.LIZ()) {
                    return;
                }
                C0CHQ.LIZ().LJIIL().updateCurrentScene("tool_editor_pro_scene", true);
            }

            @Override // X.C155Z
            public final boolean LJIILIIL() {
                InterfaceC1459100o4a interfaceC1459100o4aLJIIIZ = this.LIZ.LJIIIZ();
                if (interfaceC1459100o4aLJIIIZ != null) {
                    return interfaceC1459100o4aLJIIIZ.LIZJ();
                }
                return false;
            }

            @Override // X.C155Z
            public final void LJI() {
                C0E55 player;
                String musicId;
                CreativeModel creativeModel;
                if (C1399580mWa.LIZ()) {
                    this.LIZ.getClass();
                    VideoPublishEditModel videoPublishEditModelLJIIJ = C1465110oEH.LJIIJ();
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic((videoPublishEditModelLJIIJ == null || (creativeModel = videoPublishEditModelLJIIJ.creativeModel) == null) ? null : creativeModel.musicBuzModel);
                    if (aVMusicExtractAVMusic == null || (musicId = aVMusicExtractAVMusic.getMusicId()) == null) {
                        musicId = "";
                    }
                    this.LIZ.getClass();
                    new Pair(musicId, Boolean.valueOf(C1416310mxZ.LJJLI(C1465110oEH.LJIIJ())));
                }
                this.LIZ.getClass();
                VideoPublishEditModel videoPublishEditModelLJIIJ2 = C1465110oEH.LJIIJ();
                if (videoPublishEditModelLJIIJ2 != null) {
                    C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModelLJIIJ2);
                    c0labLJIILIIL.LJ("creation_id", videoPublishEditModelLJIIJ2.getCreationId());
                    c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelLJIIJ2));
                    c0labLJIILIIL.LJ("is_editor_pro", "1");
                    c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelLJIIJ2));
                    c0labLJIILIIL.LJ("shoot_way", videoPublishEditModelLJIIJ2.mShootWay);
                    c0labLJIILIIL.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
                    c0labLJIILIIL.LJ("enter_from", videoPublishEditModelLJIIJ2.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene() ? "promote" : "video_edit_page");
                    c0labLJIILIIL.LJI(new C15M8().LJFF("is_promote_pa"));
                    c0labLJIILIIL.LIZ(videoPublishEditModelLJIIJ2.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                    c0labLJIILIIL.LJI(new C15M8().LJFF("is_commercial"));
                    C1403470mcr.LIZIZ(videoPublishEditModelLJIIJ2, c0labLJIILIIL);
                    c0labLJIILIIL.LJ("music_id", videoPublishEditModelLJIIJ2.getMusicId());
                    if (videoPublishEditModelLJIIJ2.hasExtendMusic()) {
                        c0labLJIILIIL.LIZ(1, "is_smart_extend");
                        c0labLJIILIIL.LJ("stitched_clip_id", C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(videoPublishEditModelLJIIJ2.creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(120), 30));
                    }
                    C20684815ws.LJIILLIIL("change_music", c0labLJIILIIL.LIZ);
                }
                C0E48 c0e482 = this.LIZ.LIZJ;
                if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
                    player.pause(false);
                }
                Integer numLJFF = this.LIZ.LJFF();
                if (numLJFF != null) {
                    this.LIZ.LJIJJ = numLJFF;
                }
                Integer num = this.LIZ.LJIIIIZZ() ? this.LIZ.LJIJJ : null;
                C1465110oEH c1465110oEH = this.LIZ;
                c1465110oEH.LJJ = true;
                c1465110oEH.LIZIZ.Z0(null, c1465110oEH.LIZLLL, c1465110oEH.LJIILJJIL, !c1465110oEH.LJIIL, num);
            }

            @Override // X.C155Z
            public final void LJ(boolean z) {
                C0E55 player;
                C0E55 player2;
                C1465110oEH c1465110oEH = this.LIZ;
                if (c1465110oEH.LJIILJJIL == null && !c1465110oEH.LJIILIIL && (!c1465110oEH.LJIIIIZZ() || a0.LJJJIL(this.LIZ.LJIJI))) {
                    C1465110oEH c1465110oEH2 = this.LIZ;
                    c1465110oEH2.LJIILJJIL = null;
                    C0E48 c0e482 = c1465110oEH2.LIZJ;
                    if (c0e482 != null && (player2 = c0e482.getPlayer()) != null) {
                        player2.pause(true);
                    }
                    C0E48 c0e483 = this.LIZ.LIZJ;
                    if (c0e483 != null && (player = c0e483.getPlayer()) != null) {
                        player.LJIJI(((long) LSPassThroughRecordSizeConfig.DEFAULT) * this.LIZ.LJIIJJI, C351110Dpd.LIZ);
                    }
                }
                this.LIZ.LJJ = false;
                VideoPublishEditModel videoPublishEditModelLJIIJ = C1465110oEH.LJIIJ();
                if (videoPublishEditModelLJIIJ != null) {
                    C361680EFy.LJJIJ(videoPublishEditModelLJIIJ, "music", z, true);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
            @Override // X.C155Z
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIIJJI(boolean r11) {
                /*
                    Method dump skipped, instruction units count: 394
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1465090oEF.LJIIJJI(boolean):void");
            }

            @Override // X.C155Z
            public final void LJIIJ(MusicModel musicModel, boolean z) {
                C01TT.LIZLLL(new AwS101S0210000_22(this.LIZ, z, musicModel, 0));
            }

            @Override // X.C155Z
            public final void LJIILL(int i, boolean z) {
                CreativeFlowData creativeFlowData;
                this.LIZ.getClass();
                VideoPublishEditModel videoPublishEditModelLJIIJ = C1465110oEH.LJIIJ();
                if (videoPublishEditModelLJIIJ != null && (creativeFlowData = videoPublishEditModelLJIIJ.getCreativeFlowData()) != null) {
                    creativeFlowData.setFlowDataMusicInfo(new FlowDataMusicInfo(z, i));
                }
            }

            @Override // X.C155Z
            public final void LJIJJLI(AVMusic aVMusic, Function1<? super Boolean, Unit> function1) {
                function1.invoke(Boolean.TRUE);
            }

            @Override // X.C155Z
            public final Object LJIL(String str, AwS610S0100000_31 awS610S0100000_31, InterfaceC1364105Vn interfaceC1364105Vn) {
                return true;
            }

            @Override // X.C155Z
            public final void LJIJI(AVMusic aVMusic, MultiChoose multiChoose, Long l, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5) {
                String str3;
                String str4;
                String musicId;
                AVMusic aVMusic2 = aVMusic;
                Map<String, String> map = multiChoose.musicFilePaths;
                if (map != null) {
                    if (aVMusic2 == null || (musicId = aVMusic2.getMusicId()) == null) {
                        musicId = "";
                    }
                    str3 = map.get(musicId);
                } else {
                    str3 = null;
                }
                if (aVMusic2 != null) {
                    List<AVMusic> extendMusicList = aVMusic2.getExtendMusicList();
                    if (extendMusicList != null) {
                        for (AVMusic aVMusic3 : extendMusicList) {
                            Map<String, String> map2 = multiChoose.musicFilePaths;
                            if (map2 != null) {
                                str4 = map2.get(aVMusic3.getMusicId());
                            } else {
                                str4 = null;
                            }
                            aVMusic3.path = str4;
                        }
                    }
                } else {
                    aVMusic2 = null;
                }
                LJIIIIZZ(str3, aVMusic2, z, z2, z3, z4, str, str2, z5, null, false, null);
            }

            @Override // X.C155Z
            public final void LJIIIIZZ(String str, AVMusic aVMusic, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, boolean z5, MusicModel musicModel, boolean z6, Function0 function0) {
                String str4;
                Long lLIZ;
                MutableLiveData mutableLiveDataLIZ;
                long jLongValue;
                String str5 = str;
                C0E48 c0e482 = this.LIZ.LIZJ;
                if (c0e482 == null) {
                    return;
                }
                if (aVMusic != null) {
                    if (!TextUtils.isEmpty(str5)) {
                        C1465110oEH c1465110oEH = this.LIZ;
                        c1465110oEH.LJIILIIL = false;
                        c1465110oEH.LJJIFFI = true;
                        Integer numLJFF = c1465110oEH.LJFF();
                        if (numLJFF != null) {
                            this.LIZ.LJIJJ = Integer.valueOf(numLJFF.intValue());
                        }
                        Boolean bool = Boolean.TRUE;
                        C1D75.LIZ.LIZ.put("edit_use_music", new C1448330nnD<>("edit_use_music", bool));
                        C1465110oEH c1465110oEH2 = this.LIZ;
                        c1465110oEH2.LJIILLIIL = str5;
                        c1465110oEH2.LJIILJJIL = aVMusic;
                        if (z) {
                            str4 = "edit_page_recommend";
                        } else if (z2) {
                            str4 = "edit_page_recommend_favourite_recommend";
                        } else {
                            str4 = "edit_page_recommend_favourite";
                        }
                        c1465110oEH2.LJIILL = str4;
                        if (z3 && (mutableLiveDataLIZ = c0e482.S7().LIZ("status_music_sync_on")) != null && Intrinsics.LJFF(mutableLiveDataLIZ.getValue(), bool)) {
                            c0e482.LLFII().LJI().resetHead();
                            C0E55 player = c0e482.getPlayer();
                            Long l = this.LIZ.LJIIJ;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            player.LJIJI(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
                            c0e482.getPlayer().LLIL(false);
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            C1465110oEH c1465110oEH3 = this.LIZ;
                            C0EGC c0egc2 = c1465110oEH3.LIZIZ;
                            if (str5 == null) {
                                str5 = "";
                            }
                            String str6 = c1465110oEH3.LJIILL;
                            if (z3) {
                                lLIZ = c1465110oEH3.LJIIJ;
                            } else {
                                lLIZ = c1465110oEH3.LIZ();
                            }
                            C1465110oEH c1465110oEH4 = this.LIZ;
                            c0egc2.d1(aVMusic, str5, str6, true, lLIZ, c1465110oEH4.LJIJJ, function0, new AwS59S0210000_5(c0e482, z3, c1465110oEH4, 1));
                        }
                    }
                } else {
                    C1465110oEH c1465110oEH5 = this.LIZ;
                    if (c1465110oEH5.LJIILJJIL != null && !TextUtils.isEmpty(c1465110oEH5.LJIILLIIL)) {
                        C1465110oEH c1465110oEH6 = this.LIZ;
                        c1465110oEH6.LJIILIIL = true;
                        c1465110oEH6.LJIILJJIL = null;
                        c1465110oEH6.LIZIZ.Y0(null, true, false);
                        c0e482.getPlayer().LJIJI(this.LIZ.LIZ().longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
                        c0e482.getPlayer().LLIL(false);
                    }
                }
                this.LIZ.getClass();
                if (z3) {
                    c0e482.getPlayer().LIZLLL().observe(this.LIZ.LIZ, new Observer() { // from class: X.04jq
                        @Override // androidx.lifecycle.Observer
                        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                        }
                    });
                } else {
                    c0e482.getPlayer().LIZLLL().removeObservers(this.LIZ.LIZ);
                }
            }
        };
    }
}
