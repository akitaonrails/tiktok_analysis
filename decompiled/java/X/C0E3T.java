package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.NleClipTimeAdjustData;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.SelectSegmentInfo;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E3T, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3T extends C0ETZ<InterfaceC373210EkB, C383790F2z, C0E3X, C0F37> implements InterfaceC373210EkB {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C1DRG LLJJI;
    public final C01GW LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final FrameCacheViewModel LLJJIJIIJIL;
    public final C358370E3f LLJJIJIL;
    public final C358160E2k LLJJJ;
    public final C358490E3r LLJJJIL;
    public final C0E3V LLJJJJ;
    public int LLJJJJJIL;
    public final C0E3U LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E3T.class, "consoleApi", "getConsoleApi()Lcom/ss/android/ugc/gamora/editorpro/components/consolebar/PanelConsoleBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E3T.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/model/PanelContext;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJL = 8;
    }

    private final C360050E9r K4() {
        return (C360050E9r) this.LLJJL.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    public final C0E5D H4() {
        return (C0E5D) this.LLJJIJI.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    public final InterfaceC372990Ejp O4() {
        return (InterfaceC372990Ejp) this.LLJJIII.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0E3X> o2() {
        return AFwS191S0000000_5.get$arr$(194);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0F37> w2() {
        return new AwS549S0100000_5(this, 703);
    }

    private final void T4() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJ(this.LLJJJ);
    }

    private final void Z4() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJIII(this.LLJJJ);
    }

    public final void P4() {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C350110Do1.LJII(C350870DpF.LJI(c0e48F4));
        }
    }

    @Override // X.InterfaceC373210EkB
    public void cancel() {
        final C0E60 c0e60;
        C360050E9r c360050E9rK4 = K4();
        if (c360050E9rK4 == null || (c0e60 = c360050E9rK4.LLILZ) == null) {
            return;
        }
        Z4();
        c0e60.LIZIZ(new AbstractC356490DyJ(c0e60) { // from class: X.0DyL
            @Override // X.AbstractC356490DyJ, X.C0E62
            public final Pair<NLETrackSlot, Long> LIZJ() {
                NLETrack nLETrackRn;
                C0E3T c0e3t = this;
                int i = c0e3t.LLJJJJ.LJIIIZ;
                C0E48 c0e48F4 = c0e3t.F4();
                return new Pair<>((c0e48F4 == null || (nLETrackRn = c0e48F4.Rn()) == null) ? null : nLETrackRn.getSlotByIndex(i), Long.valueOf(C352310DrZ.LIZLLL(this.LLJJJJ.LJIIJ)));
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LIZIZ() {
                super.LIZIZ();
                this.P4();
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LJ(Pair<? extends NLETrackSlot, Long> pair) {
                InterfaceC372990Ejp interfaceC372990EjpO4 = this.O4();
                if (interfaceC372990EjpO4 != null) {
                    interfaceC372990EjpO4.setVisibility(0);
                }
            }
        }, true);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        T4();
        C360050E9r c360050E9rK4 = K4();
        if (c360050E9rK4 != null) {
            c360050E9rK4.LLILZ.LIZ = "adjustVideoInterval";
            r20(c360050E9rK4);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C370920EgU c370920EgUWQ2 = this.LLJJIJIIJIL.wQ2();
        c370920EgUWQ2.getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c370920EgUWQ2, C2107308Nj.LIZ, null, new C358440E3m(c370920EgUWQ2, null), 2);
        ((ArrayList) this.LLJJIJIL.LJ).clear();
        FrameCacheViewModel frameCacheViewModel = this.LLJJIJIIJIL;
        C358370E3f c358370E3f = this.LLJJIJIL;
        C370920EgU c370920EgUWQ22 = frameCacheViewModel.wQ2();
        C23250099c.LIZLLL(c370920EgUWQ22, c370920EgUWQ22.LLJILJIL, null, new C358350E3d(c370920EgUWQ22, c358370E3f, null), 2);
        C0E3V c0e3v = this.LLJJJJ;
        ((ArrayList) c0e3v.LJFF).clear();
        c0e3v.LIZJ.clear();
    }

    @Override // X.InterfaceC373210EkB
    public void save() {
        final C0E60 c0e60;
        C360050E9r c360050E9rK4 = K4();
        if (c360050E9rK4 == null || (c0e60 = c360050E9rK4.LLILZ) == null) {
            return;
        }
        final int i = this.LLJJJJJIL;
        Z4();
        c0e60.LIZIZ(new AbstractC356490DyJ(c0e60) { // from class: X.0DyK
            @Override // X.AbstractC356490DyJ, X.C0E62
            public final Pair<NLETrackSlot, Long> LIZJ() {
                NLETrack nLETrackRn;
                NLETrackSlot slotByIndex;
                C0E48 c0e48F4 = this.F4();
                if (c0e48F4 == null || (nLETrackRn = c0e48F4.Rn()) == null || (slotByIndex = nLETrackRn.getSlotByIndex(i)) == null) {
                    return null;
                }
                return new Pair<>(slotByIndex, Long.valueOf(slotByIndex.getStartTime() + 1000));
            }

            @Override // X.AbstractC356490DyJ
            public final void LJI() {
                super.LJI();
                ((LinkedHashMap) C350110Do1.LIZJ.LIZ).clear();
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LJ(Pair<? extends NLETrackSlot, Long> pair) {
                InterfaceC372990Ejp interfaceC372990EjpO4 = this.O4();
                if (interfaceC372990EjpO4 != null) {
                    interfaceC372990EjpO4.setVisibility(0);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            @Override // X.AbstractC356490DyJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJFF(X.C0E48 r19) {
                /*
                    Method dump skipped, instruction units count: 231
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C356500DyK.LJFF(X.0E48):boolean");
            }
        }, true);
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Override // X.InterfaceC373210EkB
    public void r20(C360050E9r c360050E9r) {
        C0E5D c0e5dH4;
        ?? arrayList;
        List sortedSlots;
        long jJh;
        boolean z;
        NLEResourceNode resource;
        String resourceFile;
        float f;
        float f2;
        C0E55 player;
        C0E55 player2;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player2 = c0e48F4.getPlayer()) != null) {
            player2.skipNextSeek(true);
        }
        C0E3V c0e3v = this.LLJJJJ;
        C0E48 c0e48 = c0e3v.LIZ;
        if (c0e48 != null) {
            c0e3v.LJIIIZ = c0e48.Rn().getSlotIndex(c0e48.LLLLLLIL());
            c0e3v.LJIIJ = c0e48.getPlayer().Jh();
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            if (nLEModelLJI.getMainTrack() != null) {
                NLETrack mainTrack = nLEModelLJI.getMainTrack();
                VecNLETrackSlotSPtr sortedSlots2 = mainTrack.getSortedSlots();
                if (sortedSlots2 != null) {
                    arrayList = new ArrayList();
                    for (NLETrackSlot nLETrackSlot : sortedSlots2) {
                        if (C351220Dpo.LLI(nLETrackSlot)) {
                            arrayList.add(nLETrackSlot);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelLJI);
                if (nLETrackLIZ == null || (sortedSlots = nLETrackLIZ.getSortedSlots()) == null) {
                    sortedSlots = C13BV.INSTANCE;
                }
                c0e3v.LIZJ.clear();
                ((ArrayList) c0e3v.LIZIZ).clear();
                ((ArrayList) c0e3v.LJFF).clear();
                C0E48 c0e482 = c0e3v.LIZ;
                if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
                    jJh = player.Jh();
                } else {
                    jJh = 0;
                }
                long j = jJh * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                VecNLETrackSlotSPtr sortedSlots3 = mainTrack.getSortedSlots();
                if (sortedSlots3 != null) {
                    int i = 0;
                    for (NLETrackSlot nLETrackSlot2 : sortedSlots3) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            NLETrackSlot nLETrackSlot3 = nLETrackSlot2;
                            long measuredStartTime = nLETrackSlot3.getMeasuredStartTime();
                            if (j <= nLETrackSlot3.getMeasuredEndTime() && measuredStartTime <= j) {
                                c0e3v.LJIIIIZZ = i;
                            }
                            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment());
                            if (nLESegmentVideoDynamicCast != null && (resource = nLESegmentVideoDynamicCast.getResource()) != null) {
                                String stringId = nLETrackSlot3.getStringId();
                                NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment());
                                C351510DqH.LIZ.getClass();
                                if (C351510DqH.LJJIL(nLETrackSlot3)) {
                                    NLEResourceAV nLEResourceAVLJJIIJZLJL = C351510DqH.LJJIIJZLJL(nLETrackSlot3);
                                    if (nLEResourceAVLJJIIJZLJL == null || (resourceFile = nLEResourceAVLJJIIJZLJL.getResourceFile()) == null) {
                                        resourceFile = "";
                                    }
                                } else {
                                    resourceFile = nLESegmentVideoDynamicCast2.getPlayResource().getResourceFile();
                                }
                                long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                                long timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd();
                                long jLIZ = C349490Dn1.LIZ(nLETrackSlot3);
                                if (nLETrackSlot3.getRewind()) {
                                    f = -1.0f;
                                } else {
                                    f = 1.0f;
                                }
                                c0e3v.LIZJ.add(new C0E3W(stringId, resourceFile, timeClipStart, timeClipEnd, jLIZ, f, (int) resource.getWidth(), (int) resource.getHeight()));
                                ((ArrayList) c0e3v.LIZIZ).add(new NleClipTimeAdjustData(nLETrackSlot3.getStringId(), nLESegmentVideoDynamicCast.getTimeClipStart(), nLESegmentVideoDynamicCast.getTimeClipEnd(), 1.0f, nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()));
                                List<NLETrackSlot> list = c0e3v.LJFF;
                                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot3.deepClone(true));
                                NLESegment mainSegment = nLETrackSlotDynamicCast.getMainSegment();
                                if (mainSegment != null) {
                                    NLESegmentVideo nLESegmentVideoDynamicCast3 = NLESegmentVideo.dynamicCast(mainSegment.deepClone(true));
                                    nLETrackSlotDynamicCast.setStartTime(0L);
                                    long jLIZ2 = C349490Dn1.LIZ(nLETrackSlot3);
                                    if (C351220Dpo.LLF(nLETrackSlotDynamicCast)) {
                                        nLETrackSlotDynamicCast.clearKeyframe();
                                    }
                                    nLETrackSlotDynamicCast.clearSwingKeyframe();
                                    C351220Dpo.LLLLLJLJLL(nLESegmentVideoDynamicCast3);
                                    nLESegmentVideoDynamicCast3.setEnableAudio(true);
                                    nLETrackSlotDynamicCast.setEndTime(nLETrackSlotDynamicCast.getStartTime() + jLIZ2);
                                    nLESegmentVideoDynamicCast3.setTimeClipStart(0L);
                                    if (nLESegmentVideoDynamicCast3.getRewind()) {
                                        f2 = -1.0f;
                                    } else {
                                        f2 = 1.0f;
                                    }
                                    nLESegmentVideoDynamicCast3.setSpeed(f2);
                                    nLESegmentVideoDynamicCast3.clearSegCurveSpeedPoint();
                                    nLESegmentVideoDynamicCast3.setTimeClipEnd(nLESegmentVideoDynamicCast3.getTimeClipStart() + jLIZ2);
                                    nLETrackSlotDynamicCast.setMainSegment(nLESegmentVideoDynamicCast3);
                                }
                                ((ArrayList) list).add(nLETrackSlotDynamicCast);
                                if (sortedSlots.size() == arrayList.size() && arrayList.contains(nLETrackSlot3)) {
                                    List<NLETrackSlot> list2 = c0e3v.LJI;
                                    Object obj = ListProtector.get(sortedSlots, arrayList.indexOf(nLETrackSlot3));
                                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
                                    nLETimeSpaceNode.setStartTime(0L);
                                    nLETimeSpaceNode.setEndTime(-2L);
                                    ((ArrayList) list2).add(obj);
                                } else {
                                    ((ArrayList) c0e3v.LJI).add(null);
                                }
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                c0e3v.LJII.clear();
                int i3 = 0;
                for (C0E3W c0e3w : c0e3v.LIZJ) {
                    int i4 = i3 + 1;
                    ArrayList<SelectSegmentInfo> arrayList2 = c0e3v.LJII;
                    String str = c0e3w.LIZ;
                    String str2 = c0e3w.LIZIZ;
                    long j2 = c0e3w.LIZJ;
                    long j3 = c0e3w.LIZLLL;
                    long j4 = c0e3w.LJ;
                    float f3 = c0e3w.LJFF;
                    int i5 = c0e3w.LJI;
                    int i6 = c0e3w.LJII;
                    if (i3 == c0e3v.LJIIIIZZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(new SelectSegmentInfo(str, str2, j2, j3, j4, f3, i5, i6, z, 0L));
                    i3 = i4;
                }
                c0e3v.LIZJ();
                nLEModelLJI.clearTrack();
                NLETrack nLETrack = c0e3v.LIZLLL;
                if (nLETrack != null) {
                    nLEModelLJI.addTrack(nLETrack);
                }
                NLETrack nLETrack2 = c0e3v.LJ;
                if (nLETrack2 != null) {
                    nLEModelLJI.addTrack(nLETrack2);
                }
                C350110Do1.LJII(nLEModelLJI);
            }
            C350410DoV.LIZ(c0e48.LLFII().LJI(), false, true);
        }
        C0E3U c0e3u = this.LLJJJJLIIL;
        int i7 = this.LLJJJJ.LJIIIIZZ;
        C0E3T c0e3t = c0e3u.LIZ;
        c0e3t.LLJJJJJIL = i7;
        c0e3t.i3(new AwS20S0001000_5(i7, 17));
        this.LLJJJJLIIL.LIZIZ();
        i3(new AwS584S0100000_5(this, 605));
        NleClipTimeAdjustData nleClipTimeAdjustDataLIZ = this.LLJJJJ.LIZ();
        if (nleClipTimeAdjustDataLIZ != null) {
            C0E5D c0e5dH42 = H4();
            if (c0e5dH42 != null) {
                c0e5dH42.Y3(C351220Dpo.LLLLLLL(nleClipTimeAdjustDataLIZ.startTime));
            }
            this.LLJJJIL.LIZIZ(nleClipTimeAdjustDataLIZ.startTime, C0E3L.LIZ, true, true);
        }
        C0E3W c0e3wLIZIZ = this.LLJJJJ.LIZIZ();
        if (c0e3wLIZIZ != null && (c0e5dH4 = H4()) != null) {
            c0e5dH4.y2(C351220Dpo.LLLLLLL(c0e3wLIZIZ.LJ));
        }
    }

    public C0E3T(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(195));
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C0E5D.class, null);
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        this.LLJJIJIIJIL = (FrameCacheViewModel) C364210EPr.LIZIZ(FrameCacheViewModel.class);
        this.LLJJIJIL = new C358370E3f();
        this.LLJJJ = new C358160E2k(this);
        this.LLJJJIL = new C358490E3r(F4());
        this.LLJJJJ = new C0E3V(F4());
        this.LLJJJJLIIL = new C0E3U(this);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), C360050E9r.class, null);
    }
}
