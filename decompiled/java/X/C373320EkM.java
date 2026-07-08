package X;

import Y.AObserverS209S0100000_5;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS24S0000100_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS64S0100100_5;

/* JADX INFO: renamed from: X.0EkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373320EkM extends C0ETZ<InterfaceC374290Elv, C373410EkV, C373330EkN, C373400EkU> implements InterfaceC374290Elv {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public C557050Lt1 LLJJJ;
    public final C373360EkQ LLJJJIL;
    public final InterfaceC350420DoW LLJJJJ;
    public C366590EYv LLJJJJJIL;
    public final AObserverS209S0100000_5 LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373320EkM.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373320EkM.class, "cutoutPreviewApi", "getCutoutPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/preview/CutoutPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373320EkM.class, "cutoutStrokeApi", "getCutoutStrokeApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373320EkM.class, "chromaKeyApi", "getChromaKeyApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/chromakey/ChromaKeyApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final InterfaceC373120Ek2 H4() {
        return (InterfaceC373120Ek2) this.LLJJIJIL.getValue(this, LLJJL[3]);
    }

    @Override // X.InterfaceC374290Elv
    public boolean HL0() {
        return this.LLJJJ.LIZIZ();
    }

    public final InterfaceC373870ElF K4() {
        return (InterfaceC373870ElF) this.LLJJIJI.getValue(this, LLJJL[1]);
    }

    public final InterfaceC373560Ekk O4() {
        return (InterfaceC373560Ekk) this.LLJJIJIIJIL.getValue(this, LLJJL[2]);
    }

    public final C357270DzZ T4() {
        return (C357270DzZ) this.LLJJIII.getValue(this, LLJJL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373330EkN> o2() {
        return AFwS191S0000000_5.get$arr$(157);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373400EkU> w2() {
        return new AwS549S0100000_5(this, 542);
    }

    private final InterfaceC373180Ek8 P4() {
        return C373700Eky.LIZ(getDiContainer());
    }

    public final void Z4() {
        C0EI5 c0ei5LJIIIZ;
        C05YD<Boolean> c05ydOF2;
        C357270DzZ c357270DzZT4 = T4();
        boolean z = c357270DzZT4 != null ? c357270DzZT4.LLJJJJLIIL : false;
        C357270DzZ c357270DzZT42 = T4();
        VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZT42 != null ? c357270DzZT42.LJIIJ() : null;
        InterfaceC373870ElF interfaceC373870ElFK4 = K4();
        boolean zBooleanValue = (interfaceC373870ElFK4 == null || (c05ydOF2 = interfaceC373870ElFK4.OF2()) == null) ? false : c05ydOF2.getValue().booleanValue();
        C357270DzZ c357270DzZT43 = T4();
        if (c357270DzZT43 == null || (c0ei5LJIIIZ = c357270DzZT43.LJIIIZ()) == null) {
            return;
        }
        C0EI4 c0ei4 = C0EI4.LIZ;
        EnumC373350EkP enumC373350EkP = zBooleanValue ? EnumC373350EkP.UNDO_DURING_LOADING : EnumC373350EkP.UNDO_AFTER_APPLY;
        c0ei4.getClass();
        C0EI4.LIZLLL(videoPublishEditModelLJIIJ, false, z, c0ei5LJIIIZ, enumC373350EkP);
    }

    public final void k5() {
        C0E55 player;
        C0E55 player2;
        C0E55 player3;
        C0E48 c0e48;
        C357270DzZ c357270DzZT4 = T4();
        if (c357270DzZT4 != null) {
            nZ1(EnumC373450EkZ.UNDO, c357270DzZT4.LJIIIIZZ());
        }
        C357270DzZ c357270DzZT42 = T4();
        if (c357270DzZT42 != null && (c0e48 = c357270DzZT42.LLILLJJLI) != null) {
            C354270Duj.LIZ(10L, new AwS406S0200000_5(this, c0e48, 52));
        }
        InterfaceC373180Ek8 interfaceC373180Ek8P4 = P4();
        if (interfaceC373180Ek8P4 != null) {
            interfaceC373180Ek8P4.LLJI();
        }
        InterfaceC373560Ekk interfaceC373560EkkO4 = O4();
        if (interfaceC373560EkkO4 != null) {
            interfaceC373560EkkO4.LLJI();
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null || !player.isPlaying()) {
            return;
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (player3 = c0e48F42.getPlayer()) != null) {
            player3.pause(false);
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 == null || (player2 = c0e48F43.getPlayer()) == null) {
            return;
        }
        player2.LJJIIZ(null);
    }

    public final void n5() {
        C05YD<Boolean> c05ydOF2;
        InterfaceC373870ElF interfaceC373870ElFK4 = K4();
        if (interfaceC373870ElFK4 != null && (c05ydOF2 = interfaceC373870ElFK4.OF2()) != null && c05ydOF2.getValue().booleanValue()) {
            C354270Duj.LIZ(100L, new AwS549S0100000_5(this, 540));
        }
        this.LLJJJ.LIZJ(true);
        C354270Duj.LIZ(2000L, new AwS549S0100000_5(this, 541));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C0E55 player;
        super.onCreate();
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(this, this.LLJJJJLIIL);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LJJ(this.LLJJJIL);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C363270EMb(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0E55 player;
        super.onDestroy();
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).removeObserver(this.LLJJJJLIIL);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LJJIII(this.LLJJJIL);
        }
        C350440DoY.LIZIZ(this.LLJJJJ);
        zB0();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        b5(EnumC373600Eko.PAUSE);
    }

    @Override // X.InterfaceC374290Elv
    public void wR1() {
        C0E48 c0e48;
        C357270DzZ c357270DzZT4 = T4();
        if (c357270DzZT4 == null || (c0e48 = c357270DzZT4.LLILLJJLI) == null) {
            return;
        }
        c0e48.Bo().LIZLLL(this.LLJJJJJIL);
    }

    @Override // X.InterfaceC374290Elv
    public void zB0() {
        C0E48 c0e48;
        C357270DzZ c357270DzZT4 = T4();
        if (c357270DzZT4 == null || (c0e48 = c357270DzZT4.LLILLJJLI) == null) {
            return;
        }
        c0e48.Bo().LIZJ(this.LLJJJJJIL);
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC374290Elv
    public void LD(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
        EnumC373450EkZ enumC373450EkZ = EnumC373450EkZ.UNDO;
        C373430EkX c373430EkX = (C373430EkX) linkedHashMap.get(enumC373450EkZ);
        if (c373430EkX != null) {
            linkedHashMap.put(enumC373450EkZ, C373430EkX.LIZ(c373430EkX, i, false, 0.0f, null, 0.0f, 30));
        }
        EnumC373450EkZ enumC373450EkZ2 = EnumC373450EkZ.REDO;
        C373430EkX c373430EkX2 = (C373430EkX) linkedHashMap.get(enumC373450EkZ2);
        if (c373430EkX2 != null) {
            linkedHashMap.put(enumC373450EkZ2, C373430EkX.LIZ(c373430EkX2, i, false, 0.0f, null, 0.0f, 30));
        }
        i3(new AwS584S0100000_5(linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) 452));
    }

    @Override // X.C0E5D
    public void Y3(long j) {
        i3(new AwS24S0000100_5(j, 0));
    }

    @Override // X.C0E5D
    public void b5(EnumC373600Eko enumC373600Eko) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
        EnumC373450EkZ enumC373450EkZ = EnumC373450EkZ.PLAY_PAUSE;
        C373430EkX c373430EkX = (C373430EkX) linkedHashMap.get(enumC373450EkZ);
        if (c373430EkX != null) {
            if (enumC373600Eko == EnumC373600Eko.PLAY) {
                i = R.raw.icon_pause_fill;
            } else {
                i = R.raw.icon_play_fill;
            }
            linkedHashMap.put(enumC373450EkZ, C373430EkX.LIZ(c373430EkX, 0, false, 0.0f, Integer.valueOf(i), 0.0f, 23));
        }
        i3(new AwS371S0200000_5((Map) linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) enumC373600Eko, (EnumC373600Eko) 95));
    }

    public final void d5(EnumC373110Ek1 enumC373110Ek1) {
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        boolean z;
        C0EI4 c0ei4 = C0EI4.LIZ;
        C357270DzZ c357270DzZT4 = T4();
        if (c357270DzZT4 != null) {
            videoPublishEditModelLJIIJ = c357270DzZT4.LJIIJ();
        } else {
            videoPublishEditModelLJIIJ = null;
        }
        C357270DzZ c357270DzZT42 = T4();
        if (c357270DzZT42 != null) {
            z = c357270DzZT42.LLJJJJLIIL;
        } else {
            z = false;
        }
        c0ei4.getClass();
        C0EI4.LJIIJ(videoPublishEditModelLJIIJ, z, enumC373110Ek1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0E5D
    public void y2(long j) {
        i3(new AwS24S0000100_5(j, 1));
        if (j > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
            linkedHashMap.put(EnumC373450EkZ.TIME_PROGRESS, new C373430EkX(0, (boolean) (0 == true ? 1 : 0), 0.0f, (Integer) null, 30));
            i3(new AwS584S0100000_5(linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) 454));
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0EYv] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0EkQ] */
    public C373320EkM(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373870ElF.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373560Ekk.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373120Ek2.class, null);
        this.LLJJJ = new C557050Lt1(false);
        this.LLJJJIL = new INLEListenerVideoOutput() { // from class: X.0EkQ
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                if (i != 0) {
                    return;
                }
                C354270Duj.LIZJ(0L, new AwS64S0100100_5(this.LL, j, 0));
            }
        };
        this.LLJJJJ = new InterfaceC350420DoW() { // from class: X.0EYw
            @Override // X.InterfaceC350420DoW
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC350420DoW
            public final void LIZ() {
                C0E48 c0e48;
                C357270DzZ c357270DzZT4 = this.LIZ.T4();
                boolean zLJFF = false;
                boolean zLJIIIIZZ = c357270DzZT4 != null ? c357270DzZT4.LJIIIIZZ() : false;
                C357270DzZ c357270DzZT42 = this.LIZ.T4();
                if (c357270DzZT42 != null && (c0e48 = c357270DzZT42.LLILLJJLI) != null) {
                    zLJFF = c0e48.Bo().LJFF();
                }
                this.LIZ.nZ1(EnumC373450EkZ.UNDO, zLJIIIIZZ);
                C354270Duj.LIZ(10L, new AwS123S0110000_5(this.LIZ, zLJFF, 5));
                C201955140j.LIZLLL(C563650M8t.LIZIZ, "shiwei", "nleDoneListener, onDone");
            }
        };
        this.LLJJJJJIL = new InterfaceC357170DzP() { // from class: X.0EYv
            @Override // X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
                this.LIZ.n5();
            }

            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
                if (z) {
                    this.LIZ.k5();
                }
            }
        };
        this.LLJJJJLIIL = new AObserverS209S0100000_5(this, 61);
    }

    @Override // X.InterfaceC374290Elv
    public void nZ1(EnumC373450EkZ enumC373450EkZ, boolean z) {
        float f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
        C373430EkX c373430EkX = (C373430EkX) linkedHashMap.get(enumC373450EkZ);
        if (c373430EkX != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            linkedHashMap.put(enumC373450EkZ, C373430EkX.LIZ(c373430EkX, 0, z, f, null, 0.0f, 25));
        }
        i3(new AwS584S0100000_5(linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) 453));
    }
}
