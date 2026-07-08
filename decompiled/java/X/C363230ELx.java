package X;

import Y.AComparatorS24S0000000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS74S0200000_5;
import Y.AfS174S0100000_5;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.creative.model.music.UnSelectMusic;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.ugc.android.editor.base.viewmodel.AudioViewModel;
import com.ss.ugc.android.editor.components.base.model.SelectedMusicInfo;
import com.ss.ugc.android.editor.track.TrackShowType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS0S2720000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ELx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363230ELx implements C0EGC {
    public final C19EG LIZ;
    public final C358780E4u LIZIZ;
    public final C0E48 LIZJ;
    public final Scene LIZLLL;
    public Function0<Unit> LJI;
    public final C357990E1t LJII;
    public boolean LJIIIIZZ;
    public List<? extends AVMusic> LJIIJJI;
    public C11JF LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final SafeHandler LJIIZILJ;
    public final SafeHandler LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public Long LJIL;
    public C0EM3 LJJ;
    public boolean LJJI;
    public final C01GW LJJIFFI;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(27));
    public final C15J2 LJFF = new C15J2();
    public final C0EM2 LJIIIZ = new InterfaceC377040EqM() { // from class: X.0EM2
        @Override // X.InterfaceC377040EqM
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC377040EqM
        public final void LIZ() {
            this.LIZ.LJFF().LIZ();
        }
    };
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 36));

    public final C386820FEq LJFF() {
        return (C386820FEq) this.LJIIJ.getValue();
    }

    public final VideoPublishEditModel LJI() {
        return ((EditModelProvider) this.LJ.getValue()).getEditModel();
    }

    public final NLEModel LJII() {
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 != null) {
            return C350870DpF.LJI(c0e48);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    @Override // X.C0EGC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0() {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363230ELx.T0():void");
    }

    @Override // X.C0EGC
    public final void U0() {
        this.LJIIZILJ.post(new ARunnableS105S0100000_5(this, 7));
    }

    @Override // X.C0EGC
    public final void g1() {
        NLETrack nLETrackLIZLLL;
        VecNLETrackSlotSPtr sortedSlots;
        C0E48 c0e48 = this.LIZJ;
        NLETrackSlot nLETrackSlot = null;
        if (c0e48 != null && (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48)) != null && (sortedSlots = nLETrackLIZLLL.getSortedSlots()) != null && sortedSlots.size() > 1) {
            nLETrackSlot = (NLETrackSlot) C13LP.LJJLIIIJL(sortedSlots);
        }
        if (nLETrackSlot != null) {
            LIZLLL(this, nLETrackSlot, false, false, 8);
        } else {
            LIZJ(this, false, false, 4);
        }
    }

    public final void LJ() {
        NLEModel nLEModelLJII = LJII();
        if (nLEModelLJII == null) {
            return;
        }
        List<NLETrack> listLJIJJ = C351220Dpo.LJIJJ(nLEModelLJII);
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : listLJIJJ) {
            NLETrack nLETrack2 = nLETrack;
            if (!nLETrack2.hasExtra("AudioTrackType") || nLETrack2.getExtra("AudioTrackType").length() == 0) {
                arrayList.add(nLETrack);
            }
        }
        arrayList.size();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setExtra("AudioTrackType", "BGM");
        }
        VecNLETrackSPtr tracks = nLEModelLJII.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack3 : tracks) {
            if (C351220Dpo.LLJILLL(nLETrack3)) {
                arrayList2.add(nLETrack3);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((NLENode) it3.next()).setExtra("AudioTrackType", "BGM");
        }
    }

    @Override // X.C0EGC
    public final void onDestroy() {
        LJFF().LIZ();
    }

    @Override // X.C0EGC
    public final boolean a1() {
        return this.LJIILLIIL;
    }

    @Override // X.C0EGC
    public final boolean b1() {
        return this.LJIILIIL;
    }

    public final void LIZIZ(boolean z) {
        MusicBuzModel musicBuzModel;
        NLETimeSpaceNode nLETimeSpaceNode;
        long measuredEndTime;
        VecNLETrackSlotSPtr sortedSlots;
        CreativeModel creativeModel;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelLJI = LJI();
        if (videoPublishEditModelLJI != null && (creativeModel = videoPublishEditModelLJI.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic != null && !aVMusicExtractAVMusic.isPgc() && c0e48.getPlayer().qq() >= 61000) {
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48);
            if (nLETrackLIZLLL != null && (sortedSlots = nLETrackLIZLLL.getSortedSlots()) != null) {
                nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(sortedSlots);
            } else {
                nLETimeSpaceNode = null;
            }
            long measuredStartTime = 0;
            if (nLETimeSpaceNode != null) {
                measuredEndTime = nLETimeSpaceNode.getMeasuredEndTime();
            } else {
                measuredEndTime = 0;
            }
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = 61000 * j;
            if (measuredEndTime >= j2) {
                if (nLETimeSpaceNode != null) {
                    measuredStartTime = nLETimeSpaceNode.getMeasuredStartTime();
                }
                if (measuredStartTime >= j * 60900) {
                    LIZJ(this, false, false, 6);
                    LJIIIIZZ(null);
                    if (z) {
                        this.LIZ.runOnUiThread(new ARunnableS105S0100000_5(this, 3));
                        return;
                    }
                    return;
                }
                if (nLETimeSpaceNode != null) {
                    nLETimeSpaceNode.setEndTime(j2 - 10);
                }
                C350870DpF.LIZ(c0e48, false);
                return;
            }
            LIZJ(this, false, false, 6);
            LJIIIIZZ(null);
            if (!z) {
                return;
            }
            this.LIZ.runOnUiThread(new ARunnableS105S0100000_5(this, 4));
        }
    }

    public final void LJIIIIZZ(AVMusic aVMusic) {
        String musicId;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 != null) {
            if (aVMusic == null || (musicId = aVMusic.getMusicId()) == null) {
                musicId = "";
            }
            C350870DpF.LJI(c0e48).setExtra("value_last_used_music_id", musicId);
        }
    }

    public final void LJIIJJI(boolean z) {
        boolean z2;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 != null && C350890DpH.LIZLLL(c0e48) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2 != this.LJIILIIL) {
            this.LJIILIIL = z2;
            C0E48 c0e482 = this.LIZJ;
            if (c0e482 != null) {
                C350870DpF.LJIIIZ(c0e482, "event_music_added", Boolean.valueOf(z2));
            }
        }
    }

    public final void LJIIL(boolean z) {
        boolean z2;
        if (this.LIZIZ.LJI().Q82().LIZJ() == TrackShowType.AUDIO) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJIIIIZZ = C348850Dlz.LJIIIIZZ(this.LIZJ, z2);
        if (zLJIIIIZZ != this.LJIJJLI || z) {
            this.LJIJJLI = zLJIIIIZZ;
            C0E48 c0e48 = this.LIZJ;
            if (c0e48 != null) {
                c0e48.S7().LIZIZ(Boolean.valueOf(zLJIIIIZZ), "status_show_null_audio_track", false);
            }
        }
    }

    public final void LJIILIIL(boolean z) {
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        VecNLETrackSlotSPtr slots = c0e48.Rn().getSlots();
        boolean z2 = false;
        if (slots != null && slots.size() >= 2 && !C350890DpH.LJ(c0e48) && !C352250DrT.LJIIL(C350870DpF.LJI(c0e48))) {
            z2 = true;
        }
        if (z || z2 != this.LJIILL) {
            this.LJIILL = z2;
            C350870DpF.LJIIIZ(c0e48, "status_sync_func_enabled", Boolean.valueOf(z2));
        }
    }

    @Override // X.C0EGC
    public final void W0(C0EM3 c0em3) {
        this.LJJ = c0em3;
    }

    @Override // X.C0EGC
    public final void f1(C0EL0 c0el0) {
        String musicId;
        MusicBuzModel musicBuzModel;
        C204607154j c204607154jLJLZ;
        String musicId2;
        CreativeModel creativeModel;
        this.LJIILJJIL = c0el0.LIZIZ;
        this.LJIILIIL = c0el0.LIZJ;
        this.LJIILLIIL = c0el0.LIZLLL;
        this.LJIILL = c0el0.LJ;
        AVMusic aVMusic = c0el0.LIZ;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        String str = "";
        if (aVMusic == null || (musicId = aVMusic.getMusicId()) == null) {
            musicId = "";
        }
        C350870DpF.LJI(c0e48).setExtra("value_last_used_music_id", musicId);
        VideoPublishEditModel videoPublishEditModelLJI = LJI();
        InterfaceC420801kM interfaceC420801kMLJJLJLI = null;
        if (videoPublishEditModelLJI != null && (creativeModel = videoPublishEditModelLJI.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        C1452640nuA.LJII(aVMusic, false, musicBuzModel);
        C0E48 c0e482 = this.LIZJ;
        if (aVMusic != null && (musicId2 = aVMusic.getMusicId()) != null) {
            str = musicId2;
        }
        C350870DpF.LJI(c0e482).setExtra("value_current_used_music_id", str);
        C350870DpF.LJIIIZ(this.LIZJ, "event_music_added", Boolean.valueOf(this.LJIILIIL));
        C350870DpF.LJIIIZ(this.LIZJ, "status_sync_func_enabled", Boolean.valueOf(this.LJIILL));
        C350870DpF.LJIIIZ(this.LIZJ, "status_music_sync_on", Boolean.valueOf(this.LJIILLIIL));
        C1403010mc7.LIZ.getMusicService().dl().getClass();
        C11PQ<C204607154j> c11pq = C1458410o3T.LIZLLL;
        if (c11pq != null) {
            c204607154jLJLZ = c11pq.LJLZ();
        } else {
            c204607154jLJLZ = null;
        }
        C1403010mc7.LIZ.getMusicService().dl().getClass();
        C11PQ<C204607154j> c11pq2 = C1458410o3T.LIZLLL;
        if (this.LJIIL == null) {
            if (c11pq2 != null) {
                interfaceC420801kMLJJLJLI = c11pq2.LJJLJLI(new AfS174S0100000_5(this, 0));
            }
            this.LJIIL = (C11JF) interfaceC420801kMLJJLJLI;
        }
        if (c204607154jLJLZ != null) {
            this.LJIIJJI = C15KO.LIZIZ(c204607154jLJLZ.LIZ);
        }
    }

    @Override // X.C0EGC
    public final void h1(AwS549S0100000_5 awS549S0100000_5) {
        this.LJI = awS549S0100000_5;
    }

    @Override // X.C0EGC
    public final void V0(final C357920E1m c357920E1m, final VideoPublishEditModel videoPublishEditModel) {
        final String uuid;
        NLECommit head;
        VecNLETrackSlotSPtr slots;
        final C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        boolean z = !this.LJIILLIIL;
        LJIILIIL(true);
        ((CreativeToast) this.LJJIFFI.getValue()).dismiss();
        if (!this.LJIILL) {
            VecNLETrackSlotSPtr slots2 = c0e48.Rn().getSlots();
            if (slots2 != null && slots2.size() >= 2) {
                NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48);
                if (nLETrackLIZLLL != null && (slots = nLETrackLIZLLL.getSlots()) != null && slots.size() > 1) {
                    C19EG c19eg = this.LIZ;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131837601);
                    C1390380mHk.LIZ(c19eg, 1056, creativeToastBuilder);
                    C0EFJ.LIZ.getClass();
                    C20684815ws.LJIILLIIL("sound_sync_unavailable_toast_show", C0EFJ.LIZ(videoPublishEditModel, c0e48).LIZ);
                    return;
                }
                return;
            }
            C19EG c19eg2 = this.LIZ;
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131833430);
            C1390380mHk.LIZ(c19eg2, 1055, creativeToastBuilder2);
            return;
        }
        if (z) {
            C350870DpF.LIZ(c0e48, true);
            NLEBranch branch = c0e48.LLFII().LJI().getBranch();
            if (branch != null && (head = branch.getHead()) != null) {
                uuid = head.getUUID();
            } else {
                uuid = null;
            }
            e1(null, true, true, true, new C0EM5() { // from class: X.0E1l
                @Override // X.C0EM5
                public final void onFailed() {
                    String str = uuid;
                    if (str != null) {
                        c0e48.LLFII().LJI().goTo(str);
                    }
                }

                @Override // X.C0EM5
                public final void onSuccess() {
                    EditorProModel editorProModel;
                    C363500EMy c363500EMy = C363500EMy.LIZ;
                    C0E48 c0e482 = c0e48;
                    c363500EMy.getClass();
                    C363500EMy.LJIILLIIL(c0e482);
                    if (C294060Bfo.LIZ()) {
                        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        if (u.LJIJI((videoPublishEditModel2 == null || (editorProModel = videoPublishEditModel2.getEditorProModel()) == null) ? null : editorProModel.getClickFrom(), "shoot_page_edit_tab", false)) {
                            C363500EMy.LJIIZILJ(c0e48, "sync_page_recommend");
                        } else {
                            C363500EMy.LJIIZILJ(c0e48, "edit_page_recommend");
                        }
                    } else {
                        C363500EMy.LJIIZILJ(c0e48, "sync_page_recommend");
                    }
                    EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT;
                    Boolean bool = Boolean.TRUE;
                    if (!((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
                        C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
                    }
                    if (c357920E1m.LIZ) {
                        C350870DpF.LIZJ(c0e48, C051R.LIZIZ(new C0E1X(C0E1V.OPEN_MUSIC_SYNC.getNameId(), null, null, null, null, 30)));
                        c0e48.getPlayer().LJIJ(0L, bool, new AwS406S0200000_5(this, c0e48, 7));
                        return;
                    }
                    C350870DpF.LIZIZ(c0e48, false);
                    c0e48.LLFII().LJI().trim(0L, 0L);
                    InterfaceC350420DoW interfaceC350420DoWBs = c0e48.bs();
                    if (interfaceC350420DoWBs != null) {
                        interfaceC350420DoWBs.LIZ();
                    }
                }
            });
            return;
        }
        e1(null, false, true, true, new C0EM5(this) { // from class: X.0E0o
            public final /* synthetic */ C363230ELx LIZIZ;

            @Override // X.C0EM5
            public final void onFailed() {
            }

            /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
            @Override // X.C0EM5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess() {
                /*
                    Method dump skipped, instruction units count: 409
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C357680E0o.onSuccess():void");
            }

            {
                this.LIZIZ = this;
            }
        });
    }

    @Override // X.C0EGC
    public final void i1(AVMusic aVMusic, boolean z) {
        LJIIIZ(this, aVMusic, false, false, z, 6);
        if (aVMusic != null && C1400490mY3.LIZ() && C123100dR.LIZ(aVMusic.getLyricContent()) && aVMusic.getLyricContentType() == 2) {
            C2286008xW.LIZ(new C2286308xZ(String.valueOf(aVMusic.id), aVMusic.getLyricContent(), Integer.valueOf(aVMusic.getLyricContentType()), (long) (aVMusic.getPreviewStartTime() * LSPassThroughRecordSizeConfig.DEFAULT), aVMusic.getDuration() * LSPassThroughRecordSizeConfig.DEFAULT)).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00OZ
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LyricInfoManagerV2@960c.preloadLyricInfoInner$1");
                    C1C7U.LIZIZ("LyricInfoManagerV2@960c.preloadLyricInfoInner$1");
                }
            }, new C09JN() { // from class: X.00Oa
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LyricInfoManagerV2@960c.preloadLyricInfoInner$2");
                    C1C7U.LIZIZ("LyricInfoManagerV2@960c.preloadLyricInfoInner$2");
                }
            });
        }
    }

    @Override // X.C0EGC
    public final void Y0(NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEEditor nLEEditorLJI;
        NLEModel model;
        VecNLETrackSPtr tracks;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null && (nLEEditorLJI = interfaceC351350Dq1LLFII.LJI()) != null && (model = nLEEditorLJI.getModel()) != null && (tracks = model.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (Intrinsics.LJFF(C348350DlB.LIZ(nLETrack), "TEXT_SPEAK") && nLETrack.hasExtra("is_tts_reuse")) {
                    this.LIZJ.LLFII().LJI().getModel().removeTrack(nLETrack);
                    this.LIZJ.LLFII().LJI().commit();
                }
            }
        }
        if (nLETrackSlot != null) {
            LIZLLL(this, nLETrackSlot, z2, z, 4);
            return;
        }
        LIZJ(this, z2, z, 2);
        C0EM3 c0em3 = this.LJJ;
        if (c0em3 == null) {
            return;
        }
        LJIIIZ(this, null, false, true, false, 10);
        c0em3.LIZIZ();
    }

    @Override // X.C0EGC
    public final void c1(boolean z, boolean z2, boolean z3) {
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        if (z2 || z != this.LJIILLIIL) {
            if (z3) {
                c0e48.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
            }
            this.LJIILLIIL = z;
            c0e48.S7().LIZIZ(Boolean.valueOf(z), "status_music_sync_on", false);
            c0e48.Rn().setExtra("ep_stick_point_switch", String.valueOf(z));
            VideoPublishEditModel videoPublishEditModelLJI = LJI();
            if (videoPublishEditModelLJI != null) {
                videoPublishEditModelLJI.setEditMusicSyncMode(z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0EM2] */
    public C363230ELx(C19GS c19gs, C358780E4u c358780E4u, C0E48 c0e48, C372480Ej0 c372480Ej0) {
        int size;
        NLETrack nLETrackLIZLLL;
        VecNLETrackSlotSPtr slots;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots2;
        this.LIZ = c19gs;
        this.LIZIZ = c358780E4u;
        this.LIZJ = c0e48;
        this.LIZLLL = c372480Ej0;
        this.LJII = new C357990E1t(c19gs, this, c0e48, c372480Ej0);
        this.LJIIZILJ = new SafeHandler(c358780E4u.LLILLJJLI);
        this.LJIJ = new SafeHandler(c358780E4u.LLILLJJLI);
        int size2 = 0;
        if (c0e48 != null && (nLETrackRn = c0e48.Rn()) != null && (slots2 = nLETrackRn.getSlots()) != null) {
            size = slots2.size();
        } else {
            size = 0;
        }
        this.LJIJI = size;
        if (c0e48 != null && (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48)) != null && (slots = nLETrackLIZLLL.getSlots()) != null) {
            size2 = slots.size();
        }
        this.LJIJJ = size2;
        this.LJIJJLI = true;
        this.LJJIFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 37));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C363230ELx r16, boolean r17, boolean r18, int r19) {
        /*
            r14 = r18
            r0 = r19 & 2
            r13 = 0
            r2 = 1
            if (r0 == 0) goto L6a
            r10 = 1
        L9:
            r0 = r19 & 4
            if (r0 == 0) goto Le
            r14 = 0
        Le:
            r11 = r16
            X.0E48 r0 = r11.LIZJ
            if (r0 == 0) goto Lae
            com.bytedance.ies.nle.editor_jni.NLETrack r9 = X.C350890DpH.LIZLLL(r0)
            if (r9 == 0) goto Lae
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r9.getSortedSlots()
            if (r0 == 0) goto L7a
            java.util.Iterator r8 = r0.iterator()
            r7 = 1
        L25:
            r6 = 0
        L26:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r3 = r8.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r3 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r3
            long r4 = java.lang.System.currentTimeMillis()
            if (r7 == 0) goto L68
            X.0Dww r0 = com.ss.ugc.android.editor.base.viewmodel.AudioViewModel.Companion
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0EPt> r0 = X.C364210EPr.LIZ
            java.lang.Class<com.ss.ugc.android.editor.base.viewmodel.AudioViewModel> r0 = com.ss.ugc.android.editor.base.viewmodel.AudioViewModel.class
            androidx.lifecycle.ViewModel r1 = X.C364210EPr.LIZIZ(r0)
            com.ss.ugc.android.editor.base.viewmodel.AudioViewModel r1 = (com.ss.ugc.android.editor.base.viewmodel.AudioViewModel) r1
            X.0E48 r0 = r11.LIZJ
            boolean r0 = r1.deleteAudio(r3, r0)
            if (r0 == 0) goto L68
            r7 = 1
        L50:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            X.C361680EFy.LJJJJJL(r0)
            if (r6 != 0) goto L66
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r9.getSortedSlots()
            if (r0 == 0) goto L25
            boolean r0 = r0.contains(r3)
            if (r0 != r2) goto L25
        L66:
            r6 = 1
            goto L26
        L68:
            r7 = 0
            goto L50
        L6a:
            r10 = 0
            goto L9
        L6c:
            if (r7 == 0) goto L70
            if (r6 == 0) goto L7a
        L70:
            X.0E5P r2 = X.C0E5P.LIZIZ
            java.lang.String r1 = "deleteMusic"
            java.lang.String r0 = "delete Music failed."
            X.C356530DyN.LIZIZ(r2, r1, r0)
            return
        L7a:
            X.0E48 r0 = r11.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r0)
            X.C348850Dlz.LJII(r0)
            r12 = 0
            r16 = 10
            r15 = r13
            LJIIIZ(r11, r12, r13, r14, r15, r16)
            if (r10 == 0) goto Lae
            X.0E1X r2 = new X.0E1X
            X.0E1V r0 = X.C0E1V.DELETE
            java.lang.String r3 = r0.getNameId()
            r4 = 0
            r8 = 30
            r5 = r4
            r6 = r4
            r7 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            if (r17 == 0) goto La9
            X.0E48 r1 = r11.LIZJ
            java.lang.String r0 = X.C051R.LIZIZ(r2)
            X.C350870DpF.LIZJ(r1, r0)
            return
        La9:
            X.0E48 r0 = r11.LIZJ
            X.C350870DpF.LIZ(r0, r13)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363230ELx.LIZJ(X.0ELx, boolean, boolean, int):void");
    }

    public static void LIZLLL(C363230ELx c363230ELx, NLETrackSlot nLETrackSlot, boolean z, boolean z2, int i) {
        boolean z3;
        NLETrack nLETrackLIZLLL;
        boolean z4;
        MusicBuzModel musicBuzModel;
        String extra;
        String musicId;
        CreativeModel creativeModel;
        boolean z5;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z6 = false;
        }
        C0E48 c0e48 = c363230ELx.LIZJ;
        if (c0e48 != null && (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48)) != null) {
            VecNLETrackSlotSPtr sortedSlots = nLETrackLIZLLL.getSortedSlots();
            if (sortedSlots.size() > 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            List<AVMusic> listSubList = null;
            if (sortedSlots.contains(nLETrackSlot2)) {
                if (nLETrackSlot2 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    AudioViewModel.Companion.getClass();
                    ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
                    boolean zDeleteAudio = ((AudioViewModel) C364210EPr.LIZIZ(AudioViewModel.class)).deleteAudio(nLETrackSlot2, c363230ELx.LIZJ);
                    C361680EFy.LJJJJJL(System.currentTimeMillis() - jCurrentTimeMillis);
                    VecNLETrackSlotSPtr sortedSlots2 = nLETrackLIZLLL.getSortedSlots();
                    if (sortedSlots2 != null && sortedSlots2.contains(nLETrackSlot2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!zDeleteAudio || z5) {
                        C356530DyN.LIZIZ(C0E5P.LIZIZ, "deleteMusic", "delete Music failed.");
                        return;
                    }
                }
            } else {
                nLETrackSlot2 = null;
            }
            if (z4 && !C349930Dnj.LIZ(c363230ELx.LJI(), c363230ELx.LJII(), false)) {
                c363230ELx.LIZJ.LLFII().LJZ(nLETrackLIZLLL);
            }
            C348850Dlz.LJII(C350870DpF.LJI(c363230ELx.LIZJ));
            VideoPublishEditModel videoPublishEditModelLJI = c363230ELx.LJI();
            if (videoPublishEditModelLJI != null && (creativeModel = videoPublishEditModelLJI.creativeModel) != null) {
                musicBuzModel = creativeModel.musicBuzModel;
            } else {
                musicBuzModel = null;
            }
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
            if (nLETrackSlot2 != null) {
                extra = nLETrackSlot2.getExtra("ep_audio_music_id");
            } else {
                extra = null;
            }
            if (aVMusicExtractAVMusic != null && (musicId = aVMusicExtractAVMusic.getMusicId()) != null && musicId.length() > 0 && extra != null && extra.length() != 0) {
                List<AVMusic> extendMusicList = aVMusicExtractAVMusic.getExtendMusicList();
                if (Intrinsics.LJFF(extra, aVMusicExtractAVMusic.getMusicId())) {
                    if (extendMusicList != null && !extendMusicList.isEmpty()) {
                        AVMusic aVMusic = (AVMusic) C13LP.LJJJLL(extendMusicList);
                        if (aVMusic != null) {
                            if (extendMusicList.size() > 1) {
                                listSubList = extendMusicList.subList(1, extendMusicList.size());
                            }
                            aVMusic.setExtendMusicList(listSubList);
                        }
                        LJIIIZ(c363230ELx, aVMusic, false, z6, false, 10);
                    } else {
                        LJIIIZ(c363230ELx, null, false, z6, false, 10);
                    }
                } else if (extendMusicList != null && !extendMusicList.isEmpty()) {
                    Iterator<AVMusic> it2 = extendMusicList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AVMusic next = it2.next();
                        if (Intrinsics.LJFF(next.getMusicId(), extra)) {
                            if (next != null) {
                                extendMusicList.remove(next);
                            }
                        }
                    }
                    LJIIIZ(c363230ELx, aVMusicExtractAVMusic, false, z6, false, 10);
                } else {
                    LJIIIZ(c363230ELx, null, false, z6, false, 10);
                }
            } else {
                LJIIIZ(c363230ELx, null, false, z6, false, 10);
            }
            if (!z3) {
                return;
            }
            C0E1X c0e1x = new C0E1X(C0E1V.DELETE.getNameId(), null, null, null, null, 30);
            if (z) {
                C350870DpF.LIZJ(c363230ELx.LIZJ, C051R.LIZIZ(c0e1x));
            } else {
                C350870DpF.LIZ(c363230ELx.LIZJ, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d  */
    @Override // X.C0EGC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z0(X.C0EGP r59, X.C0EC6 r60, com.ss.android.ugc.aweme.creative.model.music.AVMusic r61, boolean r62, java.lang.Integer r63) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363230ELx.Z0(X.0EGP, X.0EC6, com.ss.android.ugc.aweme.creative.model.music.AVMusic, boolean, java.lang.Integer):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.0E1v, X.0ELy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0EGC
    public final void e1(AVMusic aVMusic, boolean z, boolean z2, boolean z3, final C0EM5 c0em5) {
        VecNLETrackSlotSPtr sortedSlots;
        VecNLETrackSlotSPtr sortedSlots2;
        long maxEnd;
        VecNLETrackSlotSPtr sortedSlots3;
        VecNLETrackSlotSPtr sortedSlots4;
        boolean z4;
        VecNLETrackSPtr tracks;
        VecNLETrackSlotSPtr slots;
        List listLJLLLL;
        NLETrackSlot nLETrackSlot;
        NLETrackSlot nLETrackSlot2;
        VecNLETrackSlotSPtr sortedSlots5;
        VecNLETrackSlotSPtr sortedSlots6;
        NLEStyCrop crop;
        C0E48 c0e48;
        MusicBuzModel musicBuzModel;
        final int musicStartFromCut;
        CreativeModel creativeModel;
        VideoPublishEditModel videoPublishEditModelLJI;
        String strLJIIJ;
        String str;
        final C363230ELx c363230ELx = this;
        if (c363230ELx.LIZJ == null) {
            if (c0em5 != null) {
                c0em5.onFailed();
                return;
            }
            return;
        }
        if (z2 && (videoPublishEditModelLJI = c363230ELx.LJI()) != null) {
            videoPublishEditModelLJI.creativeModel.musicBuzModel.syncClickFrom = C1403850mdT.LJIIIZ(videoPublishEditModelLJI);
            if (z) {
                videoPublishEditModelLJI.creativeModel.musicBuzModel.stickPointStrategy = Boolean.FALSE;
            }
            C0E48 c0e482 = c363230ELx.LIZJ;
            String str2 = videoPublishEditModelLJI.creativeModel.musicBuzModel.syncClickFrom;
            if (!z && (str2 == null || str2.length() == 0)) {
                strLJIIJ = "editor_pro_panel_edit";
            } else {
                strLJIIJ = C1403850mdT.LJIIJ(videoPublishEditModelLJI);
            }
            String strLIZIZ = C1412490mrP.LIZIZ(videoPublishEditModelLJI);
            if (C294060Bfo.LIZ()) {
                if (!videoPublishEditModelLJI.getEditorProModel().getClickFrom().equals("shoot_page_edit_tab")) {
                    strLIZIZ = "edit_page_recommend";
                } else if (z && "original".equals(strLIZIZ)) {
                    strLIZIZ = "sync_page_recommend";
                }
            }
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJI, c0e482, new Pair(-1, -1));
            if (z) {
                str = "sync_on";
            } else {
                str = "sync_off";
            }
            c0labLJFF.LJ("to_status", str);
            c0labLJFF.LJ("icon_page", "trim_page");
            c0labLJFF.LJ("sync_click_from", strLJIIJ);
            c0labLJFF.LJ("music_selected_from", strLIZIZ);
            C1414930mvL.LIZ.getClass();
            c0labLJFF.LIZ(C1414930mvL.LIZJ(videoPublishEditModelLJI), "is_edit_carousel_show");
            c0labLJFF.LIZ(Intrinsics.LJFF(videoPublishEditModelLJI.creativeModel.musicBuzModel.stickPointStrategy, Boolean.TRUE) ? 1 : 0, "is_audio_drive_strategy");
            c0labLJFF.LIZ(1, "is_editor_pro");
            C20684815ws.LJIILLIIL("change_sync_mode", c0labLJFF.LIZ);
        }
        if (z) {
            c363230ELx.LIZ.runOnUiThread(new ARunnableS74S0200000_5(c363230ELx, c0em5, 2));
            VideoPublishEditModel videoPublishEditModelLJI2 = c363230ELx.LJI();
            if (videoPublishEditModelLJI2 != null && (creativeModel = videoPublishEditModelLJI2.creativeModel) != null) {
                musicBuzModel = creativeModel.musicBuzModel;
            } else {
                musicBuzModel = null;
            }
            final AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
            if (aVMusic != null) {
                aVMusicExtractAVMusic = aVMusic;
            } else if (aVMusicExtractAVMusic == null) {
                List<? extends AVMusic> list = c363230ELx.LJIIJJI;
                if (list != null) {
                    aVMusicExtractAVMusic = (AVMusic) C13LP.LJJJLL(list);
                } else {
                    aVMusicExtractAVMusic = null;
                }
            }
            final C357990E1t c357990E1t = c363230ELx.LJII;
            if (aVMusicExtractAVMusic != null) {
                musicStartFromCut = aVMusicExtractAVMusic.getMusicStartFromCut();
            } else {
                musicStartFromCut = 0;
            }
            final ?? r3 = new InterfaceC358010E1v() { // from class: X.0ELy
                @Override // X.InterfaceC358010E1v
                public final void onFailed() {
                    C363230ELx c363230ELx2 = this.LIZ;
                    c363230ELx2.LIZ.runOnUiThread(new ARunnableS74S0200000_5(c363230ELx2, c0em5, 3));
                }

                @Override // X.InterfaceC358010E1v
                public final void LIZ(int i) {
                    C363230ELx c363230ELx2 = this.LIZ;
                    if (c363230ELx2.LJIIIIZZ) {
                        c363230ELx2.LJIIIIZZ = false;
                        c363230ELx2.LJFF().LIZ();
                        this.LIZ.LJIJ.removeCallbacksAndMessages(null);
                        C363230ELx c363230ELx3 = this.LIZ;
                        c363230ELx3.LJIILLIIL = true;
                        C363230ELx.LJIIIZ(c363230ELx3, c363230ELx3.LJII.LJ, false, false, false, 14);
                        this.LIZ.c1(true, true, false);
                        C0EM5 c0em52 = c0em5;
                        if (c0em52 != null) {
                            c0em52.onSuccess();
                        }
                        C356530DyN.LIZIZ(C0E5P.LIZIZ, "startMusicSync", "Music Sync success");
                        C0EFJ c0efj = C0EFJ.LIZ;
                        C363230ELx c363230ELx4 = this.LIZ;
                        C0E48 c0e483 = c363230ELx4.LIZJ;
                        VideoPublishEditModel videoPublishEditModelLJI3 = c363230ELx4.LJI();
                        c0efj.getClass();
                        C0LAB c0labLIZ = C0EFJ.LIZ(videoPublishEditModelLJI3, c0e483);
                        c0labLIZ.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                        C20684815ws.LJIILLIIL("edit_sound_sync_status", c0labLIZ.LIZ);
                    }
                }
            };
            if (c357990E1t.LIZJ != null && c357990E1t.LJI == null) {
                C2472609mW c2472609mW = new C2472609mW();
                c357990E1t.LJI = c2472609mW;
                C15O7.LIZIZ(new Callable() { // from class: X.0EM8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.startMusicSync$1");
                        AVMusic aVMusic2 = aVMusicExtractAVMusic;
                        AVMusic aVMusicM174clone = aVMusic2 != null ? aVMusic2.m174clone() : null;
                        int size = c357990E1t.LIZJ.Rn().getSortedSlots().size();
                        StringBuilder sb = new StringBuilder();
                        int i = 0;
                        long duration = 0;
                        for (NLETrackSlot nLETrackSlot3 : c357990E1t.LIZJ.Rn().getSortedSlots()) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                            NLETrackSlot nLETrackSlot4 = nLETrackSlot3;
                            long duration2 = nLETrackSlot4.getDuration();
                            long j = LSPassThroughRecordSizeConfig.DEFAULT;
                            sb.append(duration2 / j);
                            duration += nLETrackSlot4.getDuration() / j;
                            if (i < size - 1) {
                                sb.append(",");
                            }
                            i = i2;
                        }
                        InterfaceC1463310oBN interfaceC1463310oBNLIZ = C1660660tJg.LIZ();
                        Context contextP3 = C786410Ut5.P3(c357990E1t.LIZ);
                        String string = sb.toString();
                        c357990E1t.getClass();
                        VideoPublishEditModel videoPublishEditModelLIZ = C357990E1t.LIZ();
                        String creationId = videoPublishEditModelLIZ != null ? videoPublishEditModelLIZ.getCreationId() : null;
                        c357990E1t.getClass();
                        C1446210njn c1446210njnLJ = C1442040nd4.LJ(C357990E1t.LIZ(), duration, false, null, null, false, 0L, false, null, null, false, 1022);
                        final AVMusic aVMusic3 = aVMusicExtractAVMusic;
                        final C357990E1t c357990E1t2 = c357990E1t;
                        final InterfaceC358010E1v interfaceC358010E1v = r3;
                        final int i3 = musicStartFromCut;
                        interfaceC1463310oBNLIZ.LIZ(size, duration, contextP3, aVMusicM174clone, c1446210njnLJ, new InterfaceC1455230nyL() { // from class: X.0EM9
                            @Override // X.InterfaceC1455230nyL
                            public final void LIZ(AVMusic aVMusic4) {
                            }

                            @Override // X.InterfaceC1455230nyL
                            public final MusicBuzModel LIZIZ() {
                                CreativeModel creativeModel2;
                                c357990E1t2.getClass();
                                VideoPublishEditModel videoPublishEditModelLIZ2 = C357990E1t.LIZ();
                                if (videoPublishEditModelLIZ2 == null || (creativeModel2 = videoPublishEditModelLIZ2.creativeModel) == null) {
                                    return null;
                                }
                                return creativeModel2.musicBuzModel;
                            }
                        }, new InterfaceC1463380oBU() { // from class: X.0EGU
                            @Override // X.InterfaceC1463380oBU
                            public final void LIZJ(AVMusic aVMusic4, EnumC1463370oBT enumC1463370oBT) {
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LIZLLL(AVMusic aVMusic4, EnumC1463370oBT enumC1463370oBT) {
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LJ(List<? extends AVMusic> list2) {
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LJII() {
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LJIIIIZZ(EnumC1463370oBT enumC1463370oBT) {
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LJIIIZ() {
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LIZ(Exception exc) {
                                String musicId;
                                C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                                AVMusic aVMusic4 = aVMusic3;
                                if (aVMusic4 == null || (musicId = aVMusic4.getMusicId()) == null) {
                                    musicId = "";
                                }
                                C1441170nbf.LIZJ(c1441170nbf, false, 1, 0, musicId, null, exc, null, 84);
                                c357990E1t2.LIZLLL(interfaceC358010E1v);
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LJI(Exception exc) {
                                String musicId;
                                C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                                AVMusic aVMusic4 = aVMusic3;
                                if (aVMusic4 == null || (musicId = aVMusic4.getMusicId()) == null) {
                                    musicId = "";
                                }
                                C1441170nbf.LIZJ(c1441170nbf, false, 2, 0, musicId, null, exc, null, 84);
                                c357990E1t2.LIZLLL(interfaceC358010E1v);
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LIZIZ(final AVMusic aVMusic4, EnumC1463370oBT enumC1463370oBT) {
                                INLEMediaSession iNLEMediaSessionF1;
                                INLERhythmPointRuntime algorithmApi;
                                C2472709mX c2472709mXLIZ;
                                if (aVMusic4 == null) {
                                    C1441170nbf.LIZJ(C1441170nbf.LIZ, false, 9, 0, "", "onDownloadMusicAlgSucc but musicModel is null", null, null, 100);
                                    c357990E1t2.LIZLLL(interfaceC358010E1v);
                                    return;
                                }
                                C2472609mW c2472609mW2 = c357990E1t2.LJI;
                                if (c2472609mW2 != null && c2472609mW2.LIZIZ()) {
                                    return;
                                }
                                final C357990E1t c357990E1t3 = c357990E1t2;
                                final int i4 = i3;
                                final InterfaceC358010E1v interfaceC358010E1v2 = interfaceC358010E1v;
                                C0E48 c0e483 = c357990E1t3.LIZJ;
                                if (c0e483 != null && (iNLEMediaSessionF1 = c0e483.f1()) != null && (algorithmApi = iNLEMediaSessionF1.getAlgorithmApi()) != null && algorithmApi.initBingoAlgorithm() >= 0) {
                                    InterfaceC358010E1v interfaceC358010E1v3 = new InterfaceC358010E1v() { // from class: X.0E25
                                        @Override // X.InterfaceC358010E1v
                                        public final void onFailed() {
                                            C1441170nbf.LIZJ(C1441170nbf.LIZ, false, 4, 0, aVMusic4.getMusicId(), null, null, null, 116);
                                            c357990E1t3.LIZLLL(interfaceC358010E1v2);
                                        }

                                        @Override // X.InterfaceC358010E1v
                                        public final void LIZ(int i5) {
                                            String musicId;
                                            C2472609mW c2472609mW3 = c357990E1t3.LJI;
                                            if (c2472609mW3 != null && c2472609mW3.LIZIZ()) {
                                                return;
                                            }
                                            final C357990E1t c357990E1t4 = c357990E1t3;
                                            final AVMusic aVMusic5 = aVMusic4;
                                            final int i6 = i4;
                                            final InterfaceC358010E1v interfaceC358010E1v4 = interfaceC358010E1v2;
                                            c357990E1t4.LJ = aVMusic5;
                                            c357990E1t4.LJFF.LIZIZ = aVMusic5;
                                            StickPointMusicAlg stickPointMusicAlg = null;
                                            if (aVMusic5 != null && aVMusic5.getStickPointMusicAlg() != null) {
                                                final String strLJFF = C1444820nhY.LJFF(aVMusic5);
                                                if (aVMusic5.musicType != 0 ? C2354709Kn.LIZIZ(strLJFF) : TEVideoUtils.nativeCheckAudioFile(strLJFF) == 0) {
                                                    c357990E1t4.LJFF.getClass();
                                                    final VEAlgorithmPath vEAlgorithmPathLIZIZ = C1446430nk9.LIZIZ(aVMusic5);
                                                    if (C1420940n52.LIZ()) {
                                                        InterfaceC358010E1v interfaceC358010E1v5 = new InterfaceC358010E1v() { // from class: X.0E1x
                                                            public final /* synthetic */ int LIZJ = 0;

                                                            @Override // X.InterfaceC358010E1v
                                                            public final void onFailed() {
                                                                C357990E1t.LJFF(c357990E1t4, strLJFF, this.LIZJ, vEAlgorithmPathLIZIZ, i6, aVMusic5, interfaceC358010E1v4);
                                                            }

                                                            @Override // X.InterfaceC358010E1v
                                                            public final void LIZ(int i7) {
                                                                c357990E1t4.LJ(interfaceC358010E1v4, i7);
                                                            }
                                                        };
                                                        if (c357990E1t4.LIZJ == null) {
                                                            c357990E1t4.LIZLLL(interfaceC358010E1v5);
                                                            return;
                                                        } else {
                                                            C23250099c.LIZLLL(c357990E1t4.LJII, null, null, new C0E20(c357990E1t4, interfaceC358010E1v5, strLJFF, 0, null), 3);
                                                            return;
                                                        }
                                                    }
                                                    C357990E1t.LJFF(c357990E1t4, strLJFF, 0, vEAlgorithmPathLIZIZ, i6, aVMusic5, interfaceC358010E1v4);
                                                    return;
                                                }
                                                C1441170nbf.LIZJ(C1441170nbf.LIZ, false, 7, 0, aVMusic5.getMusicId(), null, null, null, 116);
                                                c357990E1t4.LIZLLL(interfaceC358010E1v4);
                                                return;
                                            }
                                            C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("musicModel:");
                                            sbLIZ.append(aVMusic5);
                                            sbLIZ.append(" alg:");
                                            if (aVMusic5 != null) {
                                                stickPointMusicAlg = aVMusic5.getStickPointMusicAlg();
                                            }
                                            sbLIZ.append(stickPointMusicAlg);
                                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                            if (aVMusic5 == null || (musicId = aVMusic5.getMusicId()) == null) {
                                                musicId = "";
                                            }
                                            C1441170nbf.LIZJ(c1441170nbf, false, 5, 0, musicId, strLIZIZ2, null, null, 100);
                                            c357990E1t4.LIZLLL(interfaceC358010E1v4);
                                        }
                                    };
                                    if (c357990E1t3.LIZJ == null) {
                                        return;
                                    }
                                    C2472609mW c2472609mW3 = new C2472609mW();
                                    c357990E1t3.LJI = c2472609mW3;
                                    C15O7 c15o7LIZIZ = C15O7.LIZIZ(new Callable() { // from class: X.0E26
                                        public final /* synthetic */ boolean LLILLJJLI = false;

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            INLERhythmPointRuntime algorithmApi2;
                                            INLERhythmPointRuntime algorithmApi3;
                                            C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.updateAlgorithmFromNormal$1");
                                            INLEMediaSession iNLEMediaSessionF12 = c357990E1t3.LIZJ.f1();
                                            int iGenRandomSolve = -1;
                                            int iUpdateAlgorithmFromNormal = (iNLEMediaSessionF12 == null || (algorithmApi3 = iNLEMediaSessionF12.getAlgorithmApi()) == null) ? -1 : algorithmApi3.updateAlgorithmFromNormal();
                                            if (this.LLILLJJLI && iUpdateAlgorithmFromNormal >= 0) {
                                                INLEMediaSession iNLEMediaSessionF13 = c357990E1t3.LIZJ.f1();
                                                if (iNLEMediaSessionF13 != null && (algorithmApi2 = iNLEMediaSessionF13.getAlgorithmApi()) != null) {
                                                    iGenRandomSolve = algorithmApi2.genRandomSolve();
                                                }
                                                iUpdateAlgorithmFromNormal = iGenRandomSolve;
                                            }
                                            Integer numValueOf = Integer.valueOf(iUpdateAlgorithmFromNormal);
                                            C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.updateAlgorithmFromNormal$1");
                                            return numValueOf;
                                        }
                                    }, C15O7.LJI, c2472609mW3.LIZ());
                                    C0FXB c0fxb = new C0FXB(c357990E1t3, interfaceC358010E1v3, 2);
                                    ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
                                    C2472609mW c2472609mW4 = c357990E1t3.LJI;
                                    if (c2472609mW4 != null) {
                                        c2472709mXLIZ = c2472609mW4.LIZ();
                                    } else {
                                        c2472709mXLIZ = null;
                                    }
                                    c15o7LIZIZ.LJ(c0fxb, executorC2206508kh, c2472709mXLIZ);
                                    return;
                                }
                                C1441170nbf.LIZJ(C1441170nbf.LIZ, false, 13, 0, aVMusic4.getMusicId(), null, null, null, 116);
                                c357990E1t3.LIZLLL(interfaceC358010E1v2);
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LJFF(AVMusic aVMusic4, EnumC1463370oBT enumC1463370oBT) {
                                String musicId;
                                C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                                if (aVMusic4 == null || (musicId = aVMusic4.getMusicId()) == null) {
                                    musicId = "";
                                }
                                C1441170nbf.LIZJ(c1441170nbf, false, 5, 0, musicId, null, null, null, 116);
                                c357990E1t2.LIZLLL(interfaceC358010E1v);
                            }

                            @Override // X.InterfaceC1463380oBU
                            public final void LJIIJ(AVMusic aVMusic4, EnumC1463370oBT enumC1463370oBT) {
                                String musicId;
                                C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                                if (aVMusic4 == null || (musicId = aVMusic4.getMusicId()) == null) {
                                    musicId = "";
                                }
                                C1441170nbf.LIZJ(c1441170nbf, false, 3, 0, musicId, null, null, null, 84);
                                c357990E1t2.LIZLLL(interfaceC358010E1v);
                            }
                        }, string, creationId, null, null);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startMusicSync$1");
                        return unit;
                    }
                }, C15O7.LJII, c2472609mW.LIZ());
                return;
            }
            c357990E1t.LIZLLL(r3);
            return;
        }
        boolean z5 = !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_music_when_cancel_soundsync", true, false);
        C357990E1t c357990E1t2 = c363230ELx.LJII;
        C0E48 c0e483 = c357990E1t2.LIZJ;
        if (c0e483 == null) {
            z4 = false;
        } else {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e483);
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c357990E1t2.LIZJ).deepClone());
            NLETrack mainTrack = nLEModelDynamicCast.getMainTrack();
            if (mainTrack != null) {
                sortedSlots = mainTrack.getSortedSlots();
            } else {
                sortedSlots = null;
            }
            VecNLETrackSPtr tracks2 = nLEModelDynamicCast.getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks2) {
                NLETrack nLETrack2 = nLETrack;
                if (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            NLETrack nLETrack3 = (NLETrack) C13LP.LJJJLL(arrayList);
            if (nLETrack3 != null) {
                sortedSlots2 = nLETrack3.getSortedSlots();
            } else {
                sortedSlots2 = null;
            }
            NLETrack mainTrack2 = nLEModelLJI.getMainTrack();
            if (mainTrack2 != null) {
                maxEnd = mainTrack2.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            C351510DqH c351510DqH = C351510DqH.LIZ;
            NLEModel nLEModelLJI2 = C350870DpF.LJI(c357990E1t2.LIZJ);
            c351510DqH.getClass();
            C351510DqH.LJIJI(nLEModelLJI2, false);
            C0E5P c0e5p = C0E5P.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("slots before:");
            NLETrack mainTrack3 = nLEModelLJI.getMainTrack();
            if (mainTrack3 != null) {
                sortedSlots3 = mainTrack3.getSortedSlots();
            } else {
                sortedSlots3 = null;
            }
            sbLIZ.append(sortedSlots3);
            sbLIZ.append(' ');
            C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
            NLETrack mainTrack4 = nLEModelLJI.getMainTrack();
            if (mainTrack4 != null && (sortedSlots6 = mainTrack4.getSortedSlots()) != null) {
                int i = 0;
                for (NLETrackSlot nLETrackSlot3 : sortedSlots6) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        NLETrackSlot nLETrackSlot4 = nLETrackSlot3;
                        NLETrackSlot nLETrackSlot5 = new NLETrackSlot();
                        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot4.getMainSegment());
                        nLESegmentVideo.setCanvasStyle(nLESegmentVideoDynamicCast.getCanvasStyle());
                        nLESegmentVideo.setAVFile(NLEResourceAV.dynamicCast(nLESegmentVideoDynamicCast.getResource().deepClone()));
                        nLESegmentVideo.setTimeClipStart(0L);
                        nLESegmentVideo.setTimeClipEnd(nLESegmentVideo.getTimeClipStart() + nLESegmentVideoDynamicCast.getResource().getDuration());
                        C351220Dpo.LLLLLJLJLL(nLESegmentVideo);
                        NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot4.getMainSegment());
                        if (nLESegmentVideoDynamicCast2 != null) {
                            crop = nLESegmentVideoDynamicCast2.getCrop();
                        } else {
                            crop = null;
                        }
                        nLESegmentVideo.setCrop(crop);
                        if (C351220Dpo.LJJLIIIJJI(nLESegmentVideoDynamicCast).length() > 0) {
                            nLESegmentVideo.setExtra("ep_origin_media_path", C351220Dpo.LJJLIIIJJI(nLESegmentVideoDynamicCast));
                        }
                        nLETrackSlot5.setMainSegment(nLESegmentVideo);
                        nLETrackSlot5.setScale(nLETrackSlot4.getScale());
                        nLETrackSlot5.setTransformX(nLETrackSlot4.getTransformX());
                        nLETrackSlot5.setTransformY(nLETrackSlot4.getTransformY());
                        nLETrackSlot5.setRotation(nLETrackSlot4.getRotation());
                        C351220Dpo.LLLLLILLIL(nLETrackSlot5, C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot4));
                        for (String str3 : nLETrackSlot4.getExtraKeys()) {
                            if (!Intrinsics.LJFF(str3, "ep_curve_speed_resource_id")) {
                                nLETrackSlot5.setExtra(str3, nLETrackSlot4.getExtra(str3));
                            }
                        }
                        nLETrackSlot5.setEndTransition(nLETrackSlot4.getEndTransition());
                        nLETrackSlot5.setProcessor(nLETrackSlot4.getProcessor());
                        nLETrackSlot5.setRenderProxy(nLETrackSlot4.getRenderProxy());
                        nLETrackSlot5.clearFilter();
                        Iterator it2 = ((ArrayList) C13LP.LJJJJLI(nLETrackSlot4.getFilters())).iterator();
                        while (it2.hasNext()) {
                            nLETrackSlot5.addFilter((NLEFilter) it2.next());
                        }
                        nLETrackSlot5.clearMask();
                        Iterator it3 = ((ArrayList) C13LP.LJJJJLI(nLETrackSlot4.getMasks())).iterator();
                        while (it3.hasNext()) {
                            nLETrackSlot5.addMask((NLEMask) it3.next());
                        }
                        for (NLEVideoAnimation nLEVideoAnimation : nLETrackSlot4.getVideoAnims()) {
                            if (!C351220Dpo.LLJJJJJIL(nLEVideoAnimation)) {
                                nLETrackSlot5.addVideoAnim(nLEVideoAnimation);
                            }
                        }
                        if (C357990E1t.LIZJ() && (c0e48 = c357990E1t2.LIZJ) != null) {
                            C350690Dox.LJFF(nLETrackSlot4, nLETrackSlot5, c0e48);
                        }
                        nLETrackSlot5.setAIMatting(nLETrackSlot4.getAIMatting());
                        NLEChromaChannel nLEChromaChannel = (NLEChromaChannel) C13LP.LJJJLL(nLETrackSlot4.getChromaChannels());
                        if (nLEChromaChannel != null) {
                            nLETrackSlot5.addChromaChannel(nLEChromaChannel);
                        }
                        VecNLETrackSlotSPtr keyframes = nLETrackSlot4.getKeyframes();
                        if (keyframes != null && !keyframes.isEmpty()) {
                            nLETrackSlot5.clearKeyframe();
                            Iterator<NLETrackSlot> it4 = nLETrackSlot4.getKeyframes().iterator();
                            while (it4.hasNext()) {
                                nLETrackSlot5.addKeyframe(it4.next());
                            }
                        }
                        if (C351220Dpo.LLIIIJ(nLETrackSlot4)) {
                            nLETrackSlot5.clearSwingKeyframe();
                            Iterator<NLEKeyframe> it5 = nLETrackSlot4.getSwingKeyframes().iterator();
                            while (it5.hasNext()) {
                                nLETrackSlot5.addSwingKeyframe(it5.next());
                            }
                        }
                        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot4.getVideoEffects();
                        if (!videoEffects.isEmpty()) {
                            Iterator<NLEVideoEffect> it6 = videoEffects.iterator();
                            while (it6.hasNext()) {
                                nLETrackSlot5.addVideoEffect(it6.next());
                            }
                        }
                        VecNLEFilterSPtr filters = nLETrackSlot4.getFilters();
                        ArrayList arrayList2 = new ArrayList();
                        for (NLEFilter nLEFilter : filters) {
                            C351510DqH.LIZ.getClass();
                            if (C351510DqH.LJJIJL(nLEFilter)) {
                                arrayList2.add(nLEFilter);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            Iterator it7 = arrayList2.iterator();
                            while (it7.hasNext()) {
                                nLETrackSlot5.addFilter((NLEFilter) it7.next());
                            }
                        }
                        NLEFilter nLEFilterLJJJI = C351220Dpo.LJJJI(nLETrackSlot4);
                        if (nLEFilterLJJJI != null) {
                            nLETrackSlot5.addFilter(nLEFilterLJJJI);
                        }
                        VecNLEFilterSPtr filters2 = nLETrackSlot4.getFilters();
                        ArrayList arrayList3 = new ArrayList();
                        for (NLEFilter nLEFilter2 : filters2) {
                            if (C351220Dpo.LLIIL(nLEFilter2)) {
                                arrayList3.add(nLEFilter2);
                            }
                        }
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            nLETrackSlot5.addFilter((NLEFilter) it8.next());
                        }
                        nLEModelLJI.getMainTrack().removeSlot(nLETrackSlot4);
                        nLEModelLJI.getMainTrack().addSlotAtIndex(nLETrackSlot5, i);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            C0E5P c0e5p2 = C0E5P.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("slots after:");
            NLETrack mainTrack5 = nLEModelLJI.getMainTrack();
            if (mainTrack5 != null) {
                sortedSlots4 = mainTrack5.getSortedSlots();
            } else {
                sortedSlots4 = null;
            }
            sbLIZ2.append(sortedSlots4);
            sbLIZ2.append(' ');
            C356530DyN.LIZ(c0e5p2, C2188811AlT.LIZIZ(sbLIZ2));
            C351510DqH.LJIIIZ(C351510DqH.LIZ, c357990E1t2.LIZJ);
            if (!C357990E1t.LIZJ()) {
                C350700Doy.LJI(nLEModelDynamicCast, C350870DpF.LJI(c357990E1t2.LIZJ), false);
            }
            VecNLETrackSlotSPtr sortedSlots7 = c357990E1t2.LIZJ.Rn().getSortedSlots();
            if (sortedSlots7 != null) {
                for (NLETrackSlot nLETrackSlot6 : sortedSlots7) {
                    if (C351220Dpo.LLI(nLETrackSlot6)) {
                        nLETrackSlot6.setExtra("slot_mute_volume", "1.0");
                    }
                }
            }
            NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelLJI);
            if (nLETrackLIZ != null && (sortedSlots5 = nLETrackLIZ.getSortedSlots()) != null) {
                int i3 = 0;
                for (NLETrackSlot nLETrackSlot7 : sortedSlots5) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        NLETrackSlot nLETrackSlot8 = nLETrackSlot7;
                        if (NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot8.getMainSegment()) != null) {
                            nLETrackSlot8.setExtra("slot_mute_volume", "1.0");
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            int i5 = 0;
            c357990E1t2.LIZJ.LLFII().LLIIZ(false, true, EnumC356070Dxd.NONE);
            int i6 = 0;
            for (NLETrackSlot nLETrackSlot9 : c357990E1t2.LIZJ.Rn().getSortedSlots()) {
                i5++;
                if (i6 >= 0) {
                    NLETrackSlot nLETrackSlot10 = nLETrackSlot9;
                    if (sortedSlots != null && (nLETrackSlot2 = sortedSlots.get(i6)) != null) {
                        if (nLETrackSlot2.getKeyframes().size() > 0) {
                            c357990E1t2.LIZJ.og().LJJIJL(nLETrackSlot10, nLETrackSlot2);
                        } else if (C351220Dpo.LLIIIJ(nLETrackSlot2)) {
                            c357990E1t2.LIZJ.og().LJJIII(nLETrackSlot10);
                        }
                    }
                    i6 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            NLEModel nLEModelLLZ = c357990E1t2.LIZJ.LLFII().LLZ();
            if (nLEModelLLZ != null && (tracks = nLEModelLLZ.getTracks()) != null) {
                ArrayList arrayList4 = new ArrayList();
                for (NLETrack nLETrack4 : tracks) {
                    NLETrack nLETrack5 = nLETrack4;
                    if (C351220Dpo.LLILLL(nLETrack5) || C351220Dpo.LLJILLL(nLETrack5)) {
                        arrayList4.add(nLETrack4);
                    }
                }
                NLETrack nLETrack6 = (NLETrack) C13LP.LJJJLL(arrayList4);
                if (nLETrack6 != null && (slots = nLETrack6.getSlots()) != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(70), slots)) != null) {
                    int i7 = 0;
                    for (Object obj : listLJLLLL) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            NLETrackSlot nLETrackSlot11 = (NLETrackSlot) obj;
                            if (sortedSlots2 != null && (nLETrackSlot = sortedSlots2.get(i7)) != null) {
                                if (nLETrackSlot.getKeyframes().size() > 0) {
                                    c357990E1t2.LIZJ.og().LJJIJL(nLETrackSlot11, nLETrackSlot);
                                } else if (C351220Dpo.LLIIIJ(nLETrackSlot)) {
                                    c357990E1t2.LIZJ.og().LJJIII(nLETrackSlot11);
                                }
                            }
                            i7 = i8;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            if (z5) {
                C0E48 c0e484 = c357990E1t2.LIZJ;
                if (c0e484 != null) {
                    Iterator it9 = ((ArrayList) C349930Dnj.LJFF(C350870DpF.LJI(c0e484))).iterator();
                    int i9 = 0;
                    while (it9.hasNext()) {
                        C350870DpF.LJI(c357990E1t2.LIZJ).removeTrack((NLETrack) it9.next());
                        i9++;
                    }
                    VecNLETrackSPtr sortedTracks = C350870DpF.LJI(c357990E1t2.LIZJ).getSortedTracks();
                    ArrayList arrayList5 = new ArrayList();
                    for (NLETrack nLETrack7 : sortedTracks) {
                        if (C351220Dpo.LLLILZJ(nLETrack7, true)) {
                            arrayList5.add(nLETrack7);
                        }
                    }
                    for (NLETimeSpaceNode nLETimeSpaceNode : C13LP.LJLLLL(new AComparatorS24S0000000_5(69), arrayList5)) {
                        nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() - i9);
                    }
                }
            } else {
                C351510DqH c351510DqH2 = C351510DqH.LIZ;
                C0E48 c0e485 = c357990E1t2.LIZJ;
                c351510DqH2.getClass();
                C351510DqH.LIZIZ(maxEnd, c0e485);
            }
            C350110Do1.LJFF(C350870DpF.LJI(c357990E1t2.LIZJ));
            C350110Do1.LIZLLL(C350870DpF.LJI(c357990E1t2.LIZJ), c357990E1t2.LIZ);
            if (z3) {
                c357990E1t2.LIZJ.getPlayer().LJIJI(0L, C351110Dpd.LIZ);
            }
            if (z5) {
                z4 = false;
                c357990E1t2.LIZIZ.LJIIJJI(false);
            } else {
                z4 = false;
            }
        }
        C0E54.LJIIIIZZ(c363230ELx.LIZIZ, null, null, 7);
        c363230ELx.LJIILLIIL = z4;
        if (z5) {
            c363230ELx = c363230ELx;
            LJIIIZ(c363230ELx, null, z4, z4, z4, 14);
        }
        c363230ELx.c1(z4, true, z4);
        if (c0em5 == null) {
            return;
        }
        c0em5.onSuccess();
    }

    public static void LJIIIZ(C363230ELx c363230ELx, AVMusic aVMusic, boolean z, boolean z2, boolean z3, int i) {
        MusicBuzModel musicBuzModel;
        int musicStartFromCut;
        CreativeModel creativeModel;
        VideoPublishEditModel videoPublishEditModelLJI;
        CreativeModel creativeModel2;
        MusicBuzModel musicBuzModel2;
        String creationId;
        MusicBuzModel musicBuzModel3;
        CreativeModel creativeModel3;
        String musicId;
        CreativeModel creativeModel4;
        CreativeModel creativeModel5;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        String str = "";
        if (c363230ELx.LJJ != null && !z2) {
            if (aVMusic != null) {
                C363250ELz.LIZ(aVMusic);
                C0E48 c0e48 = c363230ELx.LIZJ;
                if (c0e48 != null) {
                    String musicId2 = aVMusic.getMusicId();
                    if (musicId2 != null) {
                        str = musicId2;
                    }
                    C350870DpF.LJI(c0e48).setExtra("value_current_used_music_id", str);
                    return;
                }
                return;
            }
            return;
        }
        VideoPublishEditModel videoPublishEditModelLJI2 = c363230ELx.LJI();
        MusicBuzModel musicBuzModel4 = null;
        if (videoPublishEditModelLJI2 != null && (creativeModel5 = videoPublishEditModelLJI2.creativeModel) != null) {
            musicBuzModel = creativeModel5.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (Intrinsics.LJFF(aVMusicExtractAVMusic, aVMusic) && !z) {
            return;
        }
        boolean zLIZ = C349930Dnj.LIZ(c363230ELx.LJI(), c363230ELx.LJII(), false);
        if (aVMusic != null) {
            if (!zLIZ || aVMusicExtractAVMusic == null) {
                c363230ELx.LJIIIIZZ(aVMusic);
            }
            C363250ELz.LIZ(aVMusic);
            musicStartFromCut = aVMusic.getMusicStartFromCut();
        } else {
            musicStartFromCut = 0;
        }
        c363230ELx.LJIILJJIL = musicStartFromCut;
        if (aVMusicExtractAVMusic != null && zLIZ && z3) {
            C1452640nuA c1452640nuA = C1452640nuA.LIZ;
            VideoPublishEditModel videoPublishEditModelLJI3 = c363230ELx.LJI();
            if (videoPublishEditModelLJI3 != null && (creativeModel4 = videoPublishEditModelLJI3.creativeModel) != null) {
                musicBuzModel4 = creativeModel4.musicBuzModel;
            }
            c1452640nuA.getClass();
            C1452640nuA.LIZ(musicBuzModel4, aVMusic);
        } else {
            if (aVMusic == null && (videoPublishEditModelLJI = c363230ELx.LJI()) != null && (creativeModel2 = videoPublishEditModelLJI.creativeModel) != null && (musicBuzModel2 = creativeModel2.musicBuzModel) != null) {
                VideoPublishEditModel videoPublishEditModelLJI4 = c363230ELx.LJI();
                if (videoPublishEditModelLJI4 != null) {
                    creationId = videoPublishEditModelLJI4.getCreationId();
                } else {
                    creationId = null;
                }
                VideoPublishEditModel videoPublishEditModelLJI5 = c363230ELx.LJI();
                if (videoPublishEditModelLJI5 != null && (creativeModel3 = videoPublishEditModelLJI5.creativeModel) != null) {
                    musicBuzModel3 = creativeModel3.musicBuzModel;
                } else {
                    musicBuzModel3 = null;
                }
                musicBuzModel2.unSelectMusic = new UnSelectMusic(creationId, C1429680nJ8.LIZJ(musicBuzModel3), 4);
            }
            VideoPublishEditModel videoPublishEditModelLJI6 = c363230ELx.LJI();
            if (videoPublishEditModelLJI6 != null && (creativeModel = videoPublishEditModelLJI6.creativeModel) != null) {
                musicBuzModel4 = creativeModel.musicBuzModel;
            }
            C1452640nuA.LJII(aVMusic, false, musicBuzModel4);
        }
        C0E48 c0e482 = c363230ELx.LIZJ;
        if (c0e482 != null) {
            if (aVMusic != null && (musicId = aVMusic.getMusicId()) != null) {
                str = musicId;
            }
            C350870DpF.LJI(c0e482).setExtra("value_current_used_music_id", str);
        }
        Function0<Unit> function0 = c363230ELx.LJI;
        if (function0 != null) {
            function0.invoke();
        }
        c363230ELx.LJIIJJI(z);
    }

    public final void LIZ(boolean z, EnumC356070Dxd enumC356070Dxd, boolean z2, NLETrackSlot nLETrackSlot, Function1<? super NLETrackSlot, Unit> function1, Function0<Unit> function0) {
        C0E48 c0e48;
        C0E55 player;
        if (function0 != null) {
            function0.invoke();
        }
        if (enumC356070Dxd == EnumC356070Dxd.COMMIT) {
            function1.invoke(nLETrackSlot);
            return;
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        C0E48 c0e482 = this.LIZJ;
        c363500EMy.getClass();
        C363500EMy.LJIILLIIL(c0e482);
        if (z) {
            C0E48 c0e483 = this.LIZJ;
            if (c0e483 != null) {
                C350890DpH.LIZJ(c0e483);
            }
        } else {
            C0E48 c0e484 = this.LIZJ;
            if (c0e484 != null) {
                C350890DpH.LJFF(c0e484);
            }
        }
        Long l = this.LJIL;
        if (l != null) {
            long jLongValue = l.longValue();
            if (!z2 && (c0e48 = this.LIZJ) != null && (player = c0e48.getPlayer()) != null) {
                player.LJIJI(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
            }
        }
        this.LJIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot LJIIJ(boolean r53, com.ss.android.ugc.aweme.creative.model.music.AVMusic r54, java.lang.String r55, long r56, java.lang.String r58, long r59, boolean r61, java.lang.Integer r62) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363230ELx.LJIIJ(boolean, com.ss.android.ugc.aweme.creative.model.music.AVMusic, java.lang.String, long, java.lang.String, long, boolean, java.lang.Integer):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    @Override // X.C0EGC
    public final NLETrackSlot X0(AVMusic aVMusic, String str, long j, long j2, boolean z, EnumC356070Dxd enumC356070Dxd, boolean z2, boolean z3) {
        String str2;
        float fLIZ;
        int size;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLLILLIZIL;
        long jCurrentTimeMillis;
        NLETrack trackBySlot;
        long maxEnd;
        NLETrackSlot nLETrackSlot;
        boolean z4;
        ArrayList<C349420Dmu> arrayListLJ;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot next;
        long jLJII;
        long j3 = j2;
        String extra = null;
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            C0E48 c0e48 = this.LIZJ;
            if (c0e48 != null) {
                jLJII = C351220Dpo.LJII(C350870DpF.LJI(c0e48));
            } else {
                jLJII = 0;
            }
            if ((jLJII - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.IMPORT_LIMIT, 100)).intValue()) {
                C19EG c19eg = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131827574);
                C1390380mHk.LIZ(c19eg, 6007, creativeToastBuilder);
                return null;
            }
        }
        String strLIZIZ = C1419800n3C.LIZIZ(this.LIZ, aVMusic);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String musicId = aVMusic.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        SelectedMusicInfo selectedMusicInfo = new SelectedMusicInfo(strLIZIZ, str, musicId, EnumC356650DyZ.SONG);
        long jLIZIZ = C141Q.LIZIZ(aVMusic.getDuration(), str);
        C141Q.LIZ.getClass();
        long jLJI = C141Q.LJI(aVMusic, str);
        long jMin = Math.min(jLJI, jLIZIZ - ((long) aVMusic.getMusicStartFromCut()));
        String strLIZIZ2 = C1419800n3C.LIZIZ(this.LIZ, aVMusic);
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        String str3 = selectedMusicInfo.path;
        String str4 = selectedMusicInfo.musicId;
        if (j3 == 0) {
            j3 = (((long) LSPassThroughRecordSizeConfig.DEFAULT) * jMin) + j;
        }
        long musicStartFromCut = aVMusic.getMusicStartFromCut();
        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j5 = musicStartFromCut * j4;
        if (z2) {
            str2 = "BGM";
        } else {
            str2 = null;
        }
        VideoPublishEditModel videoPublishEditModelLJI = LJI();
        if (videoPublishEditModelLJI != null) {
            fLIZ = C1458320o3K.LIZ(aVMusic, videoPublishEditModelLJI, z3);
        } else {
            fLIZ = 0.0f;
        }
        C350340DoO c350340DoO = new C350340DoO(strLIZIZ2, str3, str4, j, j3, false, false, j5, 0L, 0, false, null, str2, fLIZ, false, null, 1006176);
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realAddMusic: hasExtendMusicList=");
        sbLIZ.append(aVMusic.hasExtendMusicList());
        sbLIZ.append(", extendMusicSize=");
        List<AVMusic> extendMusicList = aVMusic.getExtendMusicList();
        if (extendMusicList != null) {
            size = extendMusicList.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        if (C349930Dnj.LIZ(LJI(), LJII(), false)) {
            int i = C0EC2.LIZIZ;
            C0E48 c0e482 = this.LIZJ;
            long j6 = jMin * j4;
            if (c0e482 != null) {
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e482);
                NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModelLJI);
                if (nLETrackLIZLLL == null) {
                    nLETrackSlotLLILLIZIL = c0e482.LLFII().LLILLIZIL(c350340DoO, EnumC356070Dxd.COMMIT);
                } else {
                    VecNLETrackSlotSPtr sortedSlots2 = nLETrackLIZLLL.getSortedSlots();
                    if (sortedSlots2.size() <= 0) {
                        nLETrackSlotLLILLIZIL = c0e482.LLFII().LLILLL(c350340DoO, nLETrackLIZLLL, EnumC356070Dxd.COMMIT);
                    } else if (sortedSlots2.size() < 20) {
                        NLETrack mainTrack = nLEModelLJI.getMainTrack();
                        if (mainTrack != null) {
                            maxEnd = mainTrack.getMaxEnd();
                        } else {
                            maxEnd = 0;
                        }
                        int size2 = sortedSlots2.size();
                        long j7 = C0EC2.LIZ;
                        if (((long) (size2 + 1)) * j7 <= maxEnd && (nLETrackSlot = (NLETrackSlot) C13LP.LJJLIIIJL(sortedSlots2)) != null) {
                            if (Math.abs(maxEnd - nLETrackSlot.getEndTime()) <= 1000) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            long duration = nLETrackSlot.getDuration();
                            if (size2 == 1 && z4 && duration > ((long) 5) * j7) {
                                c0e482.LLFII().LJIILJJIL(nLETrackSlot, 0L, 0L, (long) (duration * 0.8f), EnumC356070Dxd.COMMIT);
                                c350340DoO.LIZLLL = nLETrackSlot.getEndTime();
                                c350340DoO.LJ = c350340DoO.LIZLLL + Math.min(maxEnd - nLETrackSlot.getEndTime(), j6);
                                nLETrackLIZLLL.setExtra("is_ep_multi_music", "true");
                                nLETrackSlotLLILLIZIL = c0e482.LLFII().LLILLL(c350340DoO, nLETrackLIZLLL, EnumC356070Dxd.COMMIT);
                            } else {
                                if (!C351220Dpo.LLLFF(nLETrackLIZLLL)) {
                                    arrayListLJ = new ArrayList();
                                } else {
                                    VecNLETrackSlotSPtr sortedSlots3 = nLETrackLIZLLL.getSortedSlots();
                                    if (sortedSlots3 != null && !sortedSlots3.isEmpty()) {
                                        arrayListLJ = new ArrayList();
                                        long startTime = ((NLETimeSpaceNode) C13LP.LJJJJZI(sortedSlots3)).getStartTime();
                                        for (NLETrackSlot nLETrackSlot2 : sortedSlots3) {
                                            if (nLETrackSlot2.getStartTime() > ((long) 10000) + startTime) {
                                                arrayListLJ.add(new C349420Dmu(startTime, nLETrackSlot2.getStartTime(), "", true));
                                                nLETrackSlot2.getStartTime();
                                            }
                                            arrayListLJ.add(new C349420Dmu(nLETrackSlot2.getStartTime(), nLETrackSlot2.getEndTime(), nLETrackSlot2.getUUID(), false));
                                            startTime = nLETrackSlot2.getEndTime();
                                        }
                                        if (((long) 10000) + startTime < maxEnd) {
                                            arrayListLJ.add(new C349420Dmu(startTime, maxEnd, "", true));
                                        }
                                    } else {
                                        arrayListLJ = C1697810uHb.LJ(new C349420Dmu(0L, maxEnd, "", true));
                                    }
                                }
                                C349420Dmu c349420Dmu = (C349420Dmu) C13LP.LJJLIIIJL(arrayListLJ);
                                if (c349420Dmu != null) {
                                    if (c349420Dmu.LIZIZ) {
                                        long j8 = c349420Dmu.LIZLLL;
                                        long j9 = c349420Dmu.LIZJ;
                                        long j10 = j8 - j9;
                                        if (j10 >= C0EC2.LIZ) {
                                            c350340DoO.LIZLLL = j9;
                                            c350340DoO.LJ = j9 + Math.min(j10, j6);
                                            nLETrackLIZLLL.setExtra("is_ep_multi_music", "true");
                                            nLETrackSlotLLILLIZIL = c0e482.LLFII().LLILLL(c350340DoO, nLETrackLIZLLL, EnumC356070Dxd.COMMIT);
                                        }
                                    }
                                    C349420Dmu c349420Dmu2 = (C349420Dmu) C13LP.LJJLIIIJL(arrayListLJ);
                                    if (c349420Dmu2 != null) {
                                        if (!c349420Dmu2.LIZIZ) {
                                            long j11 = c349420Dmu2.LIZLLL;
                                            long j12 = c349420Dmu2.LIZJ;
                                            long j13 = j11 - j12;
                                            long j14 = C0EC2.LIZ;
                                            if (j13 >= ((long) 2) * j14) {
                                                c349420Dmu2.LIZLLL = j12 + (j13 - j14);
                                                ListProtector.add(arrayListLJ, arrayListLJ.size(), new C349420Dmu(c349420Dmu2.LIZLLL, maxEnd, "", true));
                                            } else if (j13 > j14) {
                                                long j15 = maxEnd - j14;
                                                c349420Dmu2.LIZLLL = j15;
                                                c349420Dmu2.LIZJ = j15 - j14;
                                                ListProtector.add(arrayListLJ, arrayListLJ.size(), new C349420Dmu(c349420Dmu2.LIZLLL, maxEnd, "", true));
                                                C0EC2.LIZ(arrayListLJ.size() - 3, arrayListLJ);
                                            } else {
                                                c349420Dmu2.LIZJ = j12 - j14;
                                                c349420Dmu2.LIZLLL = j11 - j14;
                                                ListProtector.add(arrayListLJ, arrayListLJ.size(), new C349420Dmu(c349420Dmu2.LIZLLL, maxEnd, "", true));
                                                C0EC2.LIZ(arrayListLJ.size() - 3, arrayListLJ);
                                            }
                                        } else {
                                            long j16 = c349420Dmu2.LIZLLL;
                                            long j17 = j16 - c349420Dmu2.LIZJ;
                                            long j18 = C0EC2.LIZ;
                                            if (j17 < j18) {
                                                c349420Dmu2.LIZJ = j16 - j18;
                                                C0EC2.LIZ(arrayListLJ.size() - 2, arrayListLJ);
                                            }
                                        }
                                    }
                                    if (C351220Dpo.LLLFF(nLETrackLIZLLL) && (sortedSlots = nLETrackLIZLLL.getSortedSlots()) != null && !sortedSlots.isEmpty()) {
                                        for (C349420Dmu c349420Dmu3 : arrayListLJ) {
                                            if (!c349420Dmu3.LIZIZ) {
                                                Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (Intrinsics.LJFF(next.getUUID(), c349420Dmu3.LIZ)) {
                                                            break;
                                                        }
                                                    } else {
                                                        next = null;
                                                        break;
                                                    }
                                                }
                                                NLETrackSlot nLETrackSlot3 = next;
                                                if (nLETrackSlot3 != null) {
                                                    long startTime2 = c349420Dmu3.LIZJ - nLETrackSlot3.getStartTime();
                                                    if (startTime2 != 0 || c349420Dmu3.LIZLLL - c349420Dmu3.LIZJ != nLETrackSlot3.getDuration()) {
                                                        c0e482.LLFII().LJIILJJIL(nLETrackSlot3, startTime2, 0L, c349420Dmu3.LIZLLL - c349420Dmu3.LIZJ, EnumC356070Dxd.COMMIT);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C349420Dmu c349420Dmu4 = (C349420Dmu) C13LP.LJJLIIIJL(arrayListLJ);
                                    if (c349420Dmu4 != null) {
                                        long j19 = c349420Dmu4.LIZJ;
                                        c350340DoO.LIZLLL = j19;
                                        c350340DoO.LJ = j19 + Math.min(c349420Dmu4.LIZLLL - j19, j6);
                                        nLETrackLIZLLL.setExtra("is_ep_multi_music", "true");
                                        nLETrackSlotLLILLIZIL = c0e482.LLFII().LLILLL(c350340DoO, nLETrackLIZLLL, EnumC356070Dxd.COMMIT);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        C0E48 c0e483 = this.LIZJ;
        if (c0e483 == null || (interfaceC351350Dq1LLFII = c0e483.LLFII()) == null) {
            return null;
        }
        nLETrackSlotLLILLIZIL = interfaceC351350Dq1LLFII.LLILLIZIL(c350340DoO, enumC356070Dxd);
        if (nLETrackSlotLLILLIZIL != null) {
            nLETrackSlotLLILLIZIL.setExtra("is_editor_pro_add_sound_used", "true");
            nLETrackSlotLLILLIZIL.setExtra("is_editorpro_add_music_material", "1");
            C0E48 c0e484 = this.LIZJ;
            if (c0e484 != null) {
                extra = C350870DpF.LJI(c0e484).getExtra("enter_select_music_time");
            }
            if (C123100dR.LIZ(extra)) {
                jCurrentTimeMillis = CastLongProtector.parseLong(extra);
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            C361680EFy.LJLILLLLZI(nLETrackSlotLLILLIZIL, "add_music_material_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlotLLILLIZIL, "add_music_material_duration") + (System.currentTimeMillis() - jCurrentTimeMillis)));
            nLETrackSlotLLILLIZIL.setExtra("ep_bgm_shoot_duration", String.valueOf(jLJI));
            nLETrackSlotLLILLIZIL.setExtra("d_bgmId", aVMusic.getMusicId());
            nLETrackSlotLLILLIZIL.setExtra("d_bgmName", c350340DoO.LIZ);
            nLETrackSlotLLILLIZIL.getMainSegment().getResource().setExtra("biz_res_id", C0FGD.LIZIZ(aVMusic.getMusicId()));
            C0E5P c0e5p = C0E5P.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Replace audio success, musicid: ");
            sbLIZ2.append(aVMusic.getMusicId());
            sbLIZ2.append(", shootDuration:");
            sbLIZ2.append(jLJI);
            C356530DyN.LIZIZ(c0e5p, "realAddMusic", C2188811AlT.LIZIZ(sbLIZ2));
            C0E48 c0e485 = this.LIZJ;
            if (c0e485 != null && (trackBySlot = C350870DpF.LJI(c0e485).getTrackBySlot(nLETrackSlotLLILLIZIL)) != null) {
                this.LIZJ.getPlayer().LIZIZ(TimeUnit.MICROSECONDS.toMillis(j));
                trackBySlot.setExtra("AudioTrackType", "BGM");
                trackBySlot.setExtra("use_music_in_editor_pro", "true");
                if (z) {
                    C350870DpF.LJIIJ(this.LIZJ, "selected_audio_track_slot", new C358740E4q(nLETrackSlotLLILLIZIL, 0, null, false, 0, 254));
                }
            }
            LJIIIZ(this, aVMusic, false, false, true, 6);
        }
        return nLETrackSlotLLILLIZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0Dxd] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, X.0Dxd] */
    @Override // X.C0EGC
    public final void d1(AVMusic aVMusic, String str, String str2, boolean z, Long l, Integer num, Function0<Unit> function0, Function1<? super NLETrackSlot, Unit> function1) {
        boolean z2;
        C0E55 player;
        long jJh;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = EnumC356070Dxd.DONE;
        if (z) {
            c259800zU.element = EnumC356070Dxd.COMMIT;
        }
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 != null && c0e48.getPlayer().qq() >= 61000 && !aVMusic.isPgc() && !C290880Bag.LIZ()) {
            this.LIZ.runOnUiThread(new ARunnableS105S0100000_5(this, 5));
            LJIIIZ(this, null, false, false, false, 14);
            return;
        }
        C141Q.LIZ.getClass();
        long jLJI = C141Q.LJI(aVMusic, str);
        C238400w2 c238400w2 = new C238400w2();
        if (aVMusic.getMusicEndFromCut() != 0) {
            jLJI = Math.min(aVMusic.getMusicEndFromCut() - aVMusic.getMusicStartFromCut(), jLJI);
        }
        c238400w2.element = jLJI;
        long jJh2 = 0;
        if (!C290880Bag.LIZ()) {
            long j = c238400w2.element;
            C0E48 c0e482 = this.LIZJ;
            if (c0e482 != null) {
                jJh = c0e482.getPlayer().Jh();
            } else {
                jJh = 0;
            }
            if (!aVMusic.isPgc()) {
                if (100 + jJh < 61000) {
                    if (jJh + j >= 61000) {
                        j = (61000 - jJh) - 10;
                    }
                }
                this.LIZ.runOnUiThread(new ARunnableS105S0100000_5(this, 6));
                LJIIIZ(this, null, false, false, false, 14);
                return;
            }
            if (j != 0) {
                c238400w2.element = j;
            }
            this.LIZ.runOnUiThread(new ARunnableS105S0100000_5(this, 6));
            LJIIIZ(this, null, false, false, false, 14);
            return;
        }
        C0E48 c0e483 = this.LIZJ;
        if ((c0e483 != null && ((ArrayList) C349930Dnj.LJFF(C350870DpF.LJI(c0e483))).isEmpty()) || (C349930Dnj.LIZ(LJI(), LJII(), false) && num == null)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.LJIILLIIL) {
            C0E48 c0e484 = this.LIZJ;
            if (c0e484 != null) {
                jJh2 = c0e484.getPlayer().Jh();
            }
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            long jLongValue = jJh2 * j2;
            if (l != null) {
                jLongValue = l.longValue() * j2;
            }
            LIZ(z2, (EnumC356070Dxd) c259800zU.element, false, LJIIJ(z2, aVMusic, str, c238400w2.element, str2, jLongValue, z, num), function1, function0);
        } else {
            C0E48 c0e485 = this.LIZJ;
            if (c0e485 != null && (player = c0e485.getPlayer()) != null) {
                player.LJIJ(0L, Boolean.TRUE, new AwS0S2720000_5(this, z2, aVMusic, str, c238400w2, str2, z, num, function0, c259800zU, function1, 0));
            }
        }
        C366800EZq.LIZIZ(aVMusic.getMusicId(), AFwS234S0000000_5.get$arr$(18));
    }
}
