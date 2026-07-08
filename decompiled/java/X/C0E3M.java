package X;

import Y.AObserverS209S0100000_5;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEAudioFadeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E3M, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3M extends C0ETZ<InterfaceC373240EkE, C370000Ef0, C0E3P, InterfaceC370120EfC> implements InterfaceC373240EkE {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final C1DRG LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public final C358490E3r LLJJJ;
    public C0E3G LLJJJIL;
    public final InterfaceC370120EfC LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public long LLJJJJLIIL;
    public final Observer<Integer> LLJJL;
    public final C0E3O LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E3M.class, "consoleApi", "getConsoleApi()Lcom/ss/android/ugc/gamora/editorpro/components/consolebar/PanelConsoleBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E3M.class, "draftApi", "getDraftApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/PanelNavApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E3M.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/adjust/ui/SoundAdjustPanelContext;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJLIL = 8;
    }

    private final InterfaceC373200EkA O4() {
        return (InterfaceC373200EkA) this.LLJJIJI.getValue(this, LLJL[1]);
    }

    private final C0E3Q P4() {
        return (C0E3Q) this.LLJJJJJIL.getValue(this, LLJL[2]);
    }

    public final void H4() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        Pair<Long, Long> pairLJLI;
        NLETrackSlot nLETrackSlotLIZIZ;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        NLESegmentAudio nLESegmentAudioDynamicCast2;
        NLEModel nLEModel;
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETimeSpaceNode nLETimeSpaceNode;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            this.LLJJJJLIIL = c0e48F4.getPlayer().Jh() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C0E3Q c0e3qP4 = P4();
        if (c0e3qP4 == null || c0e3qP4.LLILZLL == null) {
            return;
        }
        C0E3Q c0e3qP42 = P4();
        if (c0e3qP42 != null) {
            C0E60 c0e60 = c0e3qP42.LLILZ;
            if (c0e60 != null) {
                c0e60.LIZ();
            }
            NLEModel nLEModel2 = c0e3qP42.LLILZLL;
            if (nLEModel2 != null) {
                long duration = nLEModel2.getDuration();
                C0E5D c0e5dK4 = K4();
                if (c0e5dK4 != null) {
                    c0e5dK4.y2(C351220Dpo.LLLLLLL(duration));
                }
            }
        }
        if (c0e3qP42 != null && (nLEModel = c0e3qP42.LLILZLL) != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                NLETrack nLETrack = next;
                if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                    break;
                }
            }
            NLETrack nLETrack2 = next;
            if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(slots)) != null) {
                long startTime = nLETimeSpaceNode.getStartTime();
                C0E5D c0e5dK42 = K4();
                if (c0e5dK42 != null) {
                    c0e5dK42.Y3(C351220Dpo.LLLLLLL(startTime));
                }
            }
        }
        C0E3G c0e3g = this.LLJJJIL;
        C0E3E c0e3e = c0e3g.LIZIZ;
        c0e3e.getClass();
        c0e3e.LIZIZ = System.currentTimeMillis();
        C0E48 c0e48 = c0e3g.LIZ;
        C350410DoV.LIZ(c0e48 != null ? c0e48.LLFII().LJI() : null, false, true);
        NLETrackSlot nLETrackSlotLIZIZ2 = c0e3g.LIZIZ();
        if (nLETrackSlotLIZIZ2 != null && (nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlotLIZIZ2.getMainSegment())) != null) {
            c0e3g.LIZJ = new C0E3H(nLETrackSlotLIZIZ2.getStartTime(), nLETrackSlotLIZIZ2.getEndTime(), (long) (nLESegmentAudioDynamicCast2.getTimeClipStart() / nLESegmentAudioDynamicCast2.getAbsSpeed()), (long) (nLESegmentAudioDynamicCast2.getTimeClipEnd() / nLESegmentAudioDynamicCast2.getAbsSpeed()), false);
        }
        EditModelProvider.Companion.getClass();
        if (C0E1T.LIZ().getBgmSoundTrimModel$tools_camera_edit_release() == null && (nLETrackSlotLIZIZ = c0e3g.LIZIZ()) != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotLIZIZ.getMainSegment())) != null) {
            long duration2 = nLETrackSlotLIZIZ.getDuration();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(new C0E3I(duration2 / j, nLETrackSlotLIZIZ.getStartTime() / j, nLETrackSlotLIZIZ.getEndTime() / j, nLESegmentAudioDynamicCast.getTimeClipStart() / j, nLESegmentAudioDynamicCast.getTimeClipEnd() / j));
        }
        NLETrackSlot nLETrackSlotLIZIZ3 = this.LLJJJIL.LIZIZ();
        if (nLETrackSlotLIZIZ3 != null) {
            i3(new AwS584S0100000_5(nLETrackSlotLIZIZ3, 333));
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (interfaceC351350Dq1LLFII = c0e48F42.LLFII()) != null && (pairLJLI = interfaceC351350Dq1LLFII.LJLI(nLETrackSlotLIZIZ3, EnumC356070Dxd.COMMIT, null)) != null) {
                this.LLJJIJIIJIL = pairLJLI.getFirst().longValue();
                this.LLJJIJIL = pairLJLI.getSecond().longValue();
            }
        }
        T4();
    }

    public final C0E5D K4() {
        return (C0E5D) this.LLJJIII.getValue(this, LLJL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0E3P> o2() {
        return AFwS191S0000000_5.get$arr$(117);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<InterfaceC370120EfC> w2() {
        return new AwS549S0100000_5(this, 378);
    }

    private final void T4() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LJJ(this.LLJJLIIIJLLLLLLLZ);
        }
        this.LLJJJIL.LIZJ(true);
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(this, this.LLJJL);
    }

    @Override // X.InterfaceC373240EkE
    public void cancel() {
        final C0E60 c0e60;
        C0E3Q c0e3qP4 = P4();
        if (c0e3qP4 == null || (c0e60 = c0e3qP4.LLILZ) == null) {
            return;
        }
        i3(AFwS234S0000000_5.get$arr$(169));
        d5();
        c0e60.LIZIZ(new AbstractC356490DyJ(c0e60) { // from class: X.0E3K
            @Override // X.AbstractC356490DyJ, X.C0E62
            public final Pair<NLETrackSlot, Long> LIZJ() {
                return new Pair<>(this.LLJJJIL.LIZIZ(), Long.valueOf(this.LLJJJJLIIL));
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LIZLLL() {
                this.d5();
            }
        }, false);
    }

    public final void d5() {
        C0E55 player;
        C0E55 player2;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player2 = c0e48F4.getPlayer()) != null) {
            player2.pause(false);
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null) {
            player.LJJIII(this.LLJJLIIIJLLLLLLLZ);
        }
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).removeObserver(this.LLJJL);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H4();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        super.onDestroy();
        d5();
        if ((this.LLJJIJIIJIL <= 0 && this.LLJJIJIL <= 0) || (c0e48F4 = F4()) == null || (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) == null) {
            return;
        }
        long j = this.LLJJIJIIJIL;
        NLETrackSlot nLETrackSlot = T2().LIZ;
        Long lValueOf = Long.valueOf(Math.min(j, nLETrackSlot != null ? nLETrackSlot.getDuration() / ((long) 2) : this.LLJJIJIIJIL));
        long j2 = this.LLJJIJIL;
        NLETrackSlot nLETrackSlot2 = T2().LIZ;
        interfaceC351350Dq1LLFII.LJIIZILJ(new C350350DoP(lValueOf, Long.valueOf(Math.min(j2, nLETrackSlot2 != null ? nLETrackSlot2.getDuration() / ((long) 2) : this.LLJJIJIIJIL)), NLEAudioFadeType.Sine), null, EnumC356070Dxd.COMMIT, null);
    }

    @Override // X.InterfaceC373240EkE
    public void save() {
        final C0E60 c0e60;
        C0E3Q c0e3qP4 = P4();
        if (c0e3qP4 == null || (c0e60 = c0e3qP4.LLILZ) == null) {
            return;
        }
        i3(AFwS234S0000000_5.get$arr$(170));
        d5();
        final C0E3G c0e3g = this.LLJJJIL;
        c0e3g.getClass();
        c0e60.LIZIZ(new AbstractC356490DyJ(c0e60) { // from class: X.0E3D
            public final /* synthetic */ Runnable LIZJ = new Runnable() { // from class: X.0E3F
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SoundAdjustPanelComponent@25e5.save$2");
                    C1C7U.LIZIZ("SoundAdjustPanelComponent@25e5.save$2");
                }
            };

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LIZLLL() {
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final Pair<NLETrackSlot, Long> LIZJ() {
                this.LIZJ.run();
                NLETrackSlot nLETrackSlotLIZIZ = c0e3g.LIZIZ();
                return new Pair<>(nLETrackSlotLIZIZ, nLETrackSlotLIZIZ != null ? Long.valueOf(nLETrackSlotLIZIZ.getStartTime()) : null);
            }

            @Override // X.AbstractC356490DyJ
            public final boolean LJFF(C0E48 c0e48) {
                NLENode nLENodeDeepClone;
                NLESegmentAudio nLESegmentAudioDynamicCast;
                NLETrackSlot nLETrackSlotLIZIZ = c0e3g.LIZIZ();
                int i = 0;
                if (nLETrackSlotLIZIZ == null) {
                    return false;
                }
                NLETrackSlot nLETrackSlotLIZIZ2 = c0e3g.LIZIZ();
                if (nLETrackSlotLIZIZ2 != null) {
                    nLENodeDeepClone = nLETrackSlotLIZIZ2.deepClone();
                } else {
                    nLENodeDeepClone = null;
                }
                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLENodeDeepClone);
                C0E3H c0e3h = c0e3g.LIZJ;
                if (c0e3h.LJ) {
                    C0E3G.LIZ(nLETrackSlotLIZIZ, c0e3h);
                }
                if (nLETrackSlotDynamicCast != null) {
                    if (nLETrackSlotDynamicCast.getKeyframes().size() > 0) {
                        c0e48.og().LJJIJL(nLETrackSlotLIZIZ, nLETrackSlotDynamicCast);
                    }
                    if (C351220Dpo.LLIIIJ(nLETrackSlotDynamicCast)) {
                        c0e48.og().LJJIII(nLETrackSlotLIZIZ);
                    }
                }
                if (c0e3g.LIZJ.LJ) {
                    C350870DpF.LIZJ(c0e48, C051R.LIZIZ(new C0E1X(C0E1V.SOUND_ADJUST.getNameId(), null, null, null, null, 30)));
                } else {
                    C350870DpF.LIZ(c0e48, false);
                }
                NLETrackSlot nLETrackSlotLIZIZ3 = c0e3g.LIZIZ();
                if (nLETrackSlotLIZIZ3 != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotLIZIZ3.getMainSegment())) != null) {
                    EditModelProvider.Companion.getClass();
                    C0E3I bgmSoundTrimModel$tools_camera_edit_release = C0E1T.LIZ().getBgmSoundTrimModel$tools_camera_edit_release();
                    if (bgmSoundTrimModel$tools_camera_edit_release != null) {
                        long startTime = nLETrackSlotLIZIZ3.getStartTime();
                        long j = LSPassThroughRecordSizeConfig.DEFAULT;
                        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(new C0E3I(bgmSoundTrimModel$tools_camera_edit_release.LIZ, startTime / j, nLETrackSlotLIZIZ3.getEndTime() / j, nLESegmentAudioDynamicCast.getTimeClipStart() / j, nLESegmentAudioDynamicCast.getTimeClipEnd() / j));
                    }
                }
                EditModelProvider.Companion.getClass();
                VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
                if (editModel != null) {
                    C0E3G c0e3g2 = c0e3g;
                    long duration = nLETrackSlotLIZIZ.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    C0E48 c0e482 = c0e3g2.LIZ;
                    if (c0e482 != null) {
                        ArrayList<String> arrayList = c0e3g2.LIZIZ.LIZ;
                        StringBuilder sb = new StringBuilder();
                        if (arrayList.isEmpty()) {
                            sb.append("null");
                        }
                        for (String str : arrayList) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                sb.append(str);
                                if (i != arrayList.size() - 1) {
                                    sb.append(",");
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, editModel, c0e482, new Pair(-1, -1));
                        c0labLJFF.LJ("music_id", editModel.getMusicId());
                        c0labLJFF.LIZIZ(duration, "sound_length");
                        c0labLJFF.LJ("action_type", sb.toString());
                        C20684815ws.LJIILLIIL("save_sound_adjust", c0labLJFF.LIZ);
                    }
                    C0E3E c0e3e = c0e3g2.LIZIZ;
                    c0e3e.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0e3e.LIZIZ;
                    c0e3g2.LIZIZ.getClass();
                    C361680EFy.LJLILLLLZI(nLETrackSlotLIZIZ, "adjust_sound_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlotLIZIZ, "adjust_sound_duration") + jCurrentTimeMillis));
                    c0e3g2.LIZIZ.getClass();
                    C361680EFy.LJLILLLLZI(nLETrackSlotLIZIZ, "edit_music_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlotLIZIZ, "edit_music_duration") + jCurrentTimeMillis));
                    if (nLETrackSlotDynamicCast.getDuration() == nLETrackSlotLIZIZ.getDuration()) {
                        nLETrackSlotLIZIZ.setExtra("is_editorpro_trim_music_length", "1");
                    }
                }
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
                if (c0e3g.LIZJ.LJ && !nLEModelLJI.hasExtra("model_extra_is_sound_trim")) {
                    nLEModelLJI.setExtra("model_extra_is_sound_trim", "true");
                    return true;
                }
                return true;
            }
        }, false);
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    public final void Z4(float f) {
        i3(new AwS3S0000001_5(f, 4));
    }

    public C0E3M(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C0E5D.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373200EkA.class, null);
        this.LLJJJ = new C358490E3r(F4());
        this.LLJJJIL = new C0E3G(F4());
        this.LLJJJJ = new InterfaceC370120EfC() { // from class: X.0E3J
            @Override // X.InterfaceC370120EfC
            public final C0E48 LIZ() {
                return this.LIZ.F4();
            }

            @Override // X.InterfaceC370120EfC
            public final void LIZIZ() {
                this.LIZ.LLJJJ.LIZ();
            }

            @Override // X.InterfaceC370120EfC
            public final NLETrackSlot LIZJ(C0E3H c0e3h) {
                C0E3M c0e3m = this.LIZ;
                c0e3m.LLJJJJLIIL = c0e3h.LIZ;
                C0E5D c0e5dK4 = c0e3m.K4();
                if (c0e5dK4 != null) {
                    c0e5dK4.Y3(C351220Dpo.LLLLLLL(c0e3h.LIZ));
                }
                C0E3G c0e3g = this.LIZ.LLJJJIL;
                c0e3g.LIZJ = c0e3h;
                c0e3h.LJ = true;
                NLETrackSlot nLETrackSlotLIZIZ = c0e3g.LIZIZ();
                if (nLETrackSlotLIZIZ == null) {
                    return null;
                }
                C0E3G.LIZ(nLETrackSlotLIZIZ, c0e3h);
                C0E48 c0e48 = c0e3g.LIZ;
                if (c0e48 == null) {
                    return nLETrackSlotLIZIZ;
                }
                C350870DpF.LIZ(c0e48, false);
                return nLETrackSlotLIZIZ;
            }

            @Override // X.InterfaceC370120EfC
            public final void LIZLLL(boolean z) {
                this.LIZ.LLJJJIL.LIZJ(z);
            }

            @Override // X.InterfaceC370120EfC
            public final void LJ(String str) {
                C0E3E c0e3e = this.LIZ.LLJJJIL.LIZIZ;
                if (!c0e3e.LIZ.contains(str)) {
                    c0e3e.LIZ.add(str);
                }
            }

            @Override // X.InterfaceC370120EfC
            public final void LJFF(float f, float f2, long j) {
                C0E55 player;
                this.LIZ.LLJJJJLIIL = j;
                if (((Boolean) C273610Anv.LIZ.getValue()).booleanValue()) {
                    C0E48 c0e48F4 = this.LIZ.F4();
                    if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
                        player.LJIIL(f, f2, C351220Dpo.LLLLLLL(j));
                    }
                } else {
                    this.LIZ.LLJJJ.LIZIZ(j, C0E3L.LIZ, true, true);
                }
                C0E5D c0e5dK4 = this.LIZ.K4();
                if (c0e5dK4 != null) {
                    c0e5dK4.Y3(C351220Dpo.LLLLLLL(j));
                }
            }
        };
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E3Q.class, null);
        this.LLJJL = new AObserverS209S0100000_5(this, 40);
        this.LLJJLIIIJLLLLLLLZ = new C0E3O(this);
    }
}
