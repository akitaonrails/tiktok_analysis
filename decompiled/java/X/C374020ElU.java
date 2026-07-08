package X;

import Y.AObjectS240S0100000_5;
import android.graphics.PointF;
import android.util.Size;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.chromakey.ChromaKeyTutorialDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ElU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374020ElU extends C0ETZ<InterfaceC373120Ek2, C374830Emn, C374720Emc, C374730Emd> implements InterfaceC373120Ek2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final int LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public ChromaKeyTutorialDialogFragment LLJJJJLIIL;
    public NLEAIMatting LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C385670FAf<Boolean> LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C374020ElU.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C374020ElU.class, "cutoutPreviewApi", "getCutoutPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/preview/CutoutPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C374020ElU.class, "consoleApi", "getConsoleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutPanelConsoleBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C374020ElU.class, "cutoutToolBarNewApi", "getCutoutToolBarNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/toolbar/CutoutToolBarNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C374020ElU.class, "cutoutBrushApi", "getCutoutBrushApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutBrushApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C374020ElU.class, "cutoutStrokeApi", "getCutoutStrokeApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeApi;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJLILLLLZIIL = 8;
    }

    private final InterfaceC373560Ekk n5() {
        return (InterfaceC373560Ekk) this.LLJJJJJIL.getValue(this, LLJLIL[5]);
    }

    private final InterfaceC374220Elo t5() {
        return (InterfaceC374220Elo) this.LLJJJIL.getValue(this, LLJLIL[3]);
    }

    public final void H5() {
        ChromaKeyTutorialDialogFragment chromaKeyTutorialDialogFragment;
        C385670FAf<Size> resourceSize;
        Keva keva = C374630EmT.LIZ;
        if (keva.getBoolean("chroma_key_tutorial_shown", false)) {
            E5();
            return;
        }
        if (this.LLJJJJLIIL == null) {
            C357270DzZ c357270DzZX5 = x5();
            int i = this.LLJJIJI;
            InterfaceC373870ElF interfaceC373870ElFK5 = k5();
            Size sizeLIZJ = (interfaceC373870ElFK5 == null || (resourceSize = interfaceC373870ElFK5.getResourceSize()) == null) ? null : resourceSize.LIZJ();
            ChromaKeyTutorialDialogFragment chromaKeyTutorialDialogFragment2 = new ChromaKeyTutorialDialogFragment();
            chromaKeyTutorialDialogFragment2.LLILLJJLI = c357270DzZX5;
            chromaKeyTutorialDialogFragment2.LLILLL = i;
            chromaKeyTutorialDialogFragment2.LL = sizeLIZJ;
            this.LLJJJJLIIL = chromaKeyTutorialDialogFragment2;
        }
        ChromaKeyTutorialDialogFragment chromaKeyTutorialDialogFragment3 = this.LLJJJJLIIL;
        if (chromaKeyTutorialDialogFragment3 != null) {
            chromaKeyTutorialDialogFragment3.LLILZIL = new C374620EmS(this);
        }
        FragmentManager fragmentManagerLJIIL = C20622515mp.LJIIL(this.LLJJI);
        if (fragmentManagerLJIIL != null && (chromaKeyTutorialDialogFragment = this.LLJJJJLIIL) != null && !chromaKeyTutorialDialogFragment.isAdded() && !fragmentManagerLJIIL.LJL()) {
            chromaKeyTutorialDialogFragment.show(fragmentManagerLJIIL, "ChromaKeyTutorialDialog");
        }
        keva.storeBoolean("chroma_key_tutorial_shown", true);
    }

    @Override // X.InterfaceC373120Ek2
    public void LJJJJ() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLETrackSlot nLETrackSlotLJIIJJI2;
        C357270DzZ c357270DzZX5 = x5();
        C376300EpA.LIZ("apply_chroma_key_cutout", c357270DzZX5 != null ? c357270DzZX5.LJIIJ() : null, null, null, null, 28);
        C357270DzZ c357270DzZX52 = x5();
        long jLJJIII = (c357270DzZX52 == null || (nLETrackSlotLJIIJJI2 = c357270DzZX52.LJIIJJI()) == null) ? 0L : C351220Dpo.LJJIII(nLETrackSlotLJIIJJI2);
        if (jLJJIII == 0) {
            NLEAIMatting nLEAIMatting = this.LLJJL;
            if (nLEAIMatting != null) {
                C357270DzZ c357270DzZX53 = x5();
                if (c357270DzZX53 != null && (nLETrackSlotLJIIJJI = c357270DzZX53.LJIIJJI()) != null) {
                    nLETrackSlotLJIIJJI.setAIMatting(nLEAIMatting);
                }
                InterfaceC373870ElF interfaceC373870ElFK5 = k5();
                if (interfaceC373870ElFK5 != null) {
                    interfaceC373870ElFK5.fy();
                }
                C0E48 c0e48F4 = F4();
                C350410DoV.LIZ(c0e48F4 != null ? c0e48F4.LLFII().LJI() : null, true, false);
            }
        } else if (this.LLJJLIIIJLLLLLLLZ) {
            XO2(jLJJIII, null, EnumC356070Dxd.DONE);
            InterfaceC373560Ekk interfaceC373560EkkN5 = n5();
            if (interfaceC373560EkkN5 != null) {
                interfaceC373560EkkN5.V4(true);
            }
        }
        LIZLLL();
        InterfaceC374220Elo interfaceC374220EloT5 = t5();
        if (interfaceC374220EloT5 != null) {
            interfaceC374220EloT5.LIZ();
        }
    }

    public final InterfaceC374290Elv Z4() {
        return (InterfaceC374290Elv) this.LLJJJ.getValue(this, LLJLIL[2]);
    }

    public final InterfaceC373920ElK d5() {
        return (InterfaceC373920ElK) this.LLJJJJ.getValue(this, LLJLIL[4]);
    }

    public final InterfaceC373870ElF k5() {
        return (InterfaceC373870ElF) this.LLJJIJIL.getValue(this, LLJLIL[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374720Emc> o2() {
        return AFwS191S0000000_5.get$arr$(156);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374730Emd> w2() {
        return new AwS549S0100000_5(this, 530);
    }

    public final C357270DzZ x5() {
        return (C357270DzZ) this.LLJJIJIIJIL.getValue(this, LLJLIL[0]);
    }

    private final void E5() {
        InterfaceC373870ElF interfaceC373870ElFK5 = k5();
        if (interfaceC373870ElFK5 != null) {
            interfaceC373870ElFK5.QY1(true);
        }
    }

    public final void H4() {
        C385670FAf<EnumC373900ElI> c385670FAfOE0;
        C385670FAf<EnumC373900ElI> c385670FAfOE02;
        InterfaceC373920ElK interfaceC373920ElKD5 = d5();
        if (interfaceC373920ElKD5 != null && (c385670FAfOE02 = interfaceC373920ElKD5.OE0()) != null) {
            c385670FAfOE02.LJI(this);
        }
        InterfaceC373920ElK interfaceC373920ElKD52 = d5();
        if (interfaceC373920ElKD52 == null || (c385670FAfOE0 = interfaceC373920ElKD52.OE0()) == null) {
            return;
        }
        c385670FAfOE0.LIZ(this, new AObjectS240S0100000_5(this, 82));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // X.InterfaceC373120Ek2, X.InterfaceC373170Ek7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ() {
        /*
            r5 = this;
            X.0DzZ r0 = r5.x5()
            if (r0 == 0) goto L9
            r0.LIZLLL()
        L9:
            r0 = 221(0xdd, float:3.1E-43)
            kotlin.jvm.internal.AFwS234S0000000_5 r0 = kotlin.jvm.internal.AFwS234S0000000_5.get$arr$(r0)
            r5.i3(r0)
            X.0DzZ r0 = r5.x5()
            if (r0 == 0) goto L4b
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r0.LJIIJJI()
        L1c:
            r3 = 0
            if (r4 == 0) goto L3f
            boolean r0 = X.C351220Dpo.LLIZLLLIL(r4)
            r2 = 1
            if (r0 != r2) goto L3f
        L26:
            kotlin.jvm.internal.AwS93S0110000_5 r1 = new kotlin.jvm.internal.AwS93S0110000_5
            r0 = 6
            r1.<init>(r4, r2, r0)
            r5.i3(r1)
            r5.show()
            X.0Elv r0 = r5.Z4()
            if (r0 == 0) goto L3b
            r0.LD(r3)
        L3b:
            r5.H4()
            return
        L3f:
            r2 = 0
            kotlin.jvm.internal.AwS584S0100000_5 r1 = new kotlin.jvm.internal.AwS584S0100000_5
            r0 = 442(0x1ba, float:6.2E-43)
            r1.<init>(r5, r0)
            r5.P4(r1)
            goto L26
        L4b:
            r4 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C374020ElU.LIZ():void");
    }

    @Override // X.InterfaceC373120Ek2
    public void LIZLLL() {
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            c357270DzZX5.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(219));
        InterfaceC374290Elv interfaceC374290ElvZ4 = Z4();
        if (interfaceC374290ElvZ4 != null) {
            interfaceC374290ElvZ4.LD(true);
        }
        InterfaceC373870ElF interfaceC373870ElFK5 = k5();
        if (interfaceC373870ElFK5 != null) {
            interfaceC373870ElFK5.QY1(false);
        }
    }

    public final void C5() {
        E5();
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC373120Ek2, X.InterfaceC373170Ek7
    public C385670FAf<Boolean> getVisible() {
        return this.LLJL;
    }

    public final boolean v5() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    private final void P4(Function1<? super NLEAIMatting, Unit> function1) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E55 player;
        C0E48 c0e48F42;
        C0E55 player2;
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null && player.isPlaying() && (c0e48F42 = F4()) != null && (player2 = c0e48F42.getPlayer()) != null) {
            player2.pause(false);
        }
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null && (nLETrackSlotLJIIJJI = c357270DzZX5.LJIIJJI()) != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJJZZI(nLETrackSlotLJIIJJI, NLEAIMattingType.TYPE_INTERACTIVE.swigValue() | NLEAIMattingType.TYPE_CUSTOM.swigValue(), "");
            EnumC356070Dxd enumC356070Dxd = EnumC356070Dxd.COMMIT;
            interfaceC351350Dq1LLFII.LJZL(nLETrackSlotLJIIJJI, enumC356070Dxd, function1);
            interfaceC351350Dq1LLFII.LJJIJIIJIL(nLETrackSlotLJIIJJI, enumC356070Dxd);
        }
    }

    public final void D5(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    private final void K4(EnumC356070Dxd enumC356070Dxd, Function1<? super NLESegmentChromaChannel, Unit> function1) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            c357270DzZX5.LIZLLL();
        }
        C357270DzZ c357270DzZX52 = x5();
        if (c357270DzZX52 != null) {
            nLETrackSlotLJIIJJI = c357270DzZX52.LJIIJJI();
        } else {
            nLETrackSlotLJIIJJI = null;
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJJZ(nLETrackSlotLJIIJJI, enumC356070Dxd, function1);
        }
        i3(AFwS234S0000000_5.get$arr$(218));
    }

    public C374020ElU(C19A3 c19a3, C1DRG c1drg, int i) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373870ElF.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374290Elv.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374220Elo.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373920ElK.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373560Ekk.class, null);
        this.LLJL = Z1(new C2217381BqS() { // from class: X.0ElZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374720Emc) obj).LIZ);
            }
        });
    }

    @Override // X.InterfaceC373120Ek2
    public void L22(boolean z, EnumC356070Dxd enumC356070Dxd, Function1<? super NLESegmentChromaChannel, Unit> function1) {
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            videoPublishEditModelLJIIJ = c357270DzZX5.LJIIJ();
        } else {
            videoPublishEditModelLJIIJ = null;
        }
        C376300EpA.LIZ("reset_chroma_key_cutout", videoPublishEditModelLJIIJ, null, null, null, 28);
        if (x5() != null) {
            C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 529));
        }
        K4(enumC356070Dxd, function1);
        InterfaceC373870ElF interfaceC373870ElFK5 = k5();
        if (interfaceC373870ElFK5 != null) {
            interfaceC373870ElFK5.XH1();
        }
        i3(AFwS234S0000000_5.get$arr$(220));
    }

    @Override // X.InterfaceC373120Ek2
    public void XO2(long j, PointF pointF, EnumC356070Dxd enumC356070Dxd) {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || j == 0) {
            return;
        }
        i3(AFwS234S0000000_5.get$arr$(217));
        C0E55 player2 = c0e48F4.getPlayer();
        if (player2 != null && player2.isPlaying() && (player = c0e48F4.getPlayer()) != null) {
            player.pause(false);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C356480DyI(this, c0e48F4, pointF, enumC356070Dxd, j, null), 2);
        i3(new AwS584S0100000_5(this, 441));
        this.LLJJLIIIJLLLLLLLZ = true;
    }
}
