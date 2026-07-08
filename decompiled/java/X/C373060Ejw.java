package X;

import Y.AObjectS240S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.util.Size;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ejw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373060Ejw extends AbstractC381020Ewm<InterfaceC374660EmW> implements InterfaceC374660EmW, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final InterfaceC374660EmW LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public Size LLJJIJI;
    public C1397510mTF LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373060Ejw.class, "canvasScaleApiComponent", "getCanvasScaleApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/CanvasScaleApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373060Ejw.class, "bottomApiComponent", "getBottomApiComponent()Lcom/ss/android/ugc/gamora/editorpro/components/confirm/BottomApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373060Ejw.class, "panelNavApi", "getPanelNavApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/PanelNavApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373060Ejw.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C373060Ejw.class, "cutoutBrushApi", "getCutoutBrushApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutBrushApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C373060Ejw.class, "cutoutStrokeApi", "getCutoutStrokeApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C373060Ejw.class, "chromaKeyApi", "getChromaKeyApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/chromakey/ChromaKeyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C373060Ejw.class, "cutoutStrokeAdjustApi", "getCutoutStrokeAdjustApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeAdjustApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C373060Ejw.class, "cutoutPreviewApi", "getCutoutPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/preview/CutoutPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C373060Ejw.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C373060Ejw.class, "cutoutTrackApi", "getCutoutTrackApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/retouch/multitrackview/EPPanelTrackApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C373060Ejw.class, "consoleApi", "getConsoleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutPanelConsoleBarApi;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12};
        LLJJJIL = 8;
    }

    private final InterfaceC371300Eh6 B3() {
        return (InterfaceC371300Eh6) this.LLJJI.getValue(this, LLJJJ[10]);
    }

    private final InterfaceC373130Ek3 H2() {
        return (InterfaceC373130Ek3) this.LLILZLL.getValue(this, LLJJJ[0]);
    }

    private final C0E5S O3() {
        return (C0E5S) this.LLJJ.getValue(this, LLJJJ[9]);
    }

    private final InterfaceC373920ElK c3() {
        return (InterfaceC373920ElK) this.LLJI.getValue(this, LLJJJ[4]);
    }

    private final InterfaceC373570Ekl m3() {
        return (InterfaceC373570Ekl) this.LLJILJILJ.getValue(this, LLJJJ[7]);
    }

    public final C357270DzZ E3() {
        return (C357270DzZ) this.LLJ.getValue(this, LLJJJ[3]);
    }

    public final InterfaceC374530EmJ G2() {
        return (InterfaceC374530EmJ) this.LLIZ.getValue(this, LLJJJ[1]);
    }

    public final InterfaceC373200EkA H3() {
        return (InterfaceC373200EkA) this.LLIZLLLIL.getValue(this, LLJJJ[2]);
    }

    public final InterfaceC373120Ek2 T2() {
        return (InterfaceC373120Ek2) this.LLJILJIL.getValue(this, LLJJJ[6]);
    }

    public final InterfaceC374290Elv W2() {
        return (InterfaceC374290Elv) this.LLJJIII.getValue(this, LLJJJ[11]);
    }

    public final InterfaceC373870ElF i3() {
        return (InterfaceC373870ElF) this.LLJILLL.getValue(this, LLJJJ[8]);
    }

    public final InterfaceC373560Ekk q3() {
        return (InterfaceC373560Ekk) this.LLJIJIL.getValue(this, LLJJJ[5]);
    }

    private final boolean F4() {
        C05YD<Boolean> c05ydOF2;
        InterfaceC373870ElF interfaceC373870ElFI3 = i3();
        boolean zBooleanValue = (interfaceC373870ElFI3 == null || (c05ydOF2 = interfaceC373870ElFI3.OF2()) == null) ? false : c05ydOF2.getValue().booleanValue();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showStopCutoutDialog taskRunning: ");
        sbLIZ.append(zBooleanValue);
        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue) {
            return false;
        }
        Context contextLIZIZ = C545820Lau.LIZIZ(this.LLILLL);
        if (contextLIZIZ == null) {
            return true;
        }
        C1397510mTF c1397510mTF = this.LLJJIJIIJIL;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(contextLIZIZ);
        c1397580mTM.LJFF(2131830428);
        c1397580mTM.LJII = false;
        c1397580mTM.LIZ(2131830425);
        C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(this, 438));
        C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM);
        this.LLJJIJIIJIL = c1397510mTF2;
        c1397510mTF2.LIZLLL();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C373300EkK(this, null), 3);
        return true;
    }

    private final void H4() {
        C0E55 player;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (player = c0e48W1.getPlayer()) != null) {
            player.pause(false);
        }
        InterfaceC371300Eh6 interfaceC371300Eh6B3 = B3();
        if (interfaceC371300Eh6B3 != null) {
            interfaceC371300Eh6B3.Qc();
        }
        InterfaceC374290Elv interfaceC374290ElvW2 = W2();
        if (interfaceC374290ElvW2 != null) {
            interfaceC374290ElvW2.zB0();
        }
    }

    private final boolean Z1() {
        C385670FAf<Boolean> visible;
        C385670FAf<Boolean> visible2;
        C385670FAf<Boolean> visible3;
        C385670FAf<Boolean> visible4;
        C357270DzZ c357270DzZE3 = E3();
        if (c357270DzZE3 == null || !c357270DzZE3.LJIILJJIL()) {
            return false;
        }
        InterfaceC373570Ekl interfaceC373570EklM3 = m3();
        if (interfaceC373570EklM3 != null && (visible4 = interfaceC373570EklM3.getVisible()) != null && Intrinsics.LJFF(visible4.LIZJ(), Boolean.TRUE)) {
            InterfaceC373560Ekk interfaceC373560EkkQ3 = q3();
            if (interfaceC373560EkkQ3 != null) {
                interfaceC373560EkkQ3.LIZ();
            }
            InterfaceC373570Ekl interfaceC373570EklM32 = m3();
            if (interfaceC373570EklM32 != null) {
                interfaceC373570EklM32.LIZLLL();
            }
            return true;
        }
        InterfaceC373560Ekk interfaceC373560EkkQ32 = q3();
        if (interfaceC373560EkkQ32 != null && (visible3 = interfaceC373560EkkQ32.getVisible()) != null && Intrinsics.LJFF(visible3.LIZJ(), Boolean.TRUE)) {
            InterfaceC373180Ek8 interfaceC373180Ek8V3 = v3();
            if (interfaceC373180Ek8V3 != null) {
                interfaceC373180Ek8V3.LIZ();
            }
            InterfaceC373560Ekk interfaceC373560EkkQ33 = q3();
            if (interfaceC373560EkkQ33 != null) {
                interfaceC373560EkkQ33.LIZLLL();
            }
            return true;
        }
        InterfaceC373920ElK interfaceC373920ElKC3 = c3();
        if (interfaceC373920ElKC3 != null && (visible2 = interfaceC373920ElKC3.getVisible()) != null && Intrinsics.LJFF(visible2.LIZJ(), Boolean.TRUE)) {
            InterfaceC373180Ek8 interfaceC373180Ek8V32 = v3();
            if (interfaceC373180Ek8V32 != null) {
                interfaceC373180Ek8V32.LIZ();
            }
            InterfaceC373920ElK interfaceC373920ElKC32 = c3();
            if (interfaceC373920ElKC32 != null) {
                interfaceC373920ElKC32.LIZLLL();
            }
            return true;
        }
        InterfaceC373120Ek2 interfaceC373120Ek2T2 = T2();
        if (interfaceC373120Ek2T2 == null || (visible = interfaceC373120Ek2T2.getVisible()) == null || !Intrinsics.LJFF(visible.LIZJ(), Boolean.TRUE)) {
            return false;
        }
        InterfaceC373180Ek8 interfaceC373180Ek8V33 = v3();
        if (interfaceC373180Ek8V33 != null) {
            interfaceC373180Ek8V33.LIZ();
        }
        InterfaceC373120Ek2 interfaceC373120Ek2T22 = T2();
        if (interfaceC373120Ek2T22 != null) {
            interfaceC373120Ek2T22.LJJJJ();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o4() {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373060Ejw.o4():void");
    }

    public final void K4() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C357270DzZ c357270DzZE3;
        InterfaceC361710EGb interfaceC361710EGbLJIIL;
        LiveState<Size> canvasSize;
        Size sizeLIZJ;
        C357270DzZ c357270DzZE32;
        InterfaceC361710EGb interfaceC361710EGbLJIIL2;
        LiveState<Size> liveStateUc2;
        Size sizeLIZJ2;
        C0EO0 c0eo0LIZIZ;
        C0E48 c0e48;
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        C357270DzZ c357270DzZE33;
        C0E48 c0e482;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e483;
        C357270DzZ c357270DzZE34 = E3();
        if (c357270DzZE34 == null || (nLETrackSlotLJIIJJI = c357270DzZE34.LJIIJJI()) == null || (c357270DzZE3 = E3()) == null || (interfaceC361710EGbLJIIL = c357270DzZE3.LJIIL()) == null || (canvasSize = interfaceC361710EGbLJIIL.getCanvasSize()) == null || (sizeLIZJ = canvasSize.LIZJ()) == null || (c357270DzZE32 = E3()) == null || (interfaceC361710EGbLJIIL2 = c357270DzZE32.LJIIL()) == null || (liveStateUc2 = interfaceC361710EGbLJIIL2.uc2()) == null || (sizeLIZJ2 = liveStateUc2.LIZJ()) == null || (c0eo0LIZIZ = C363770ENz.LIZIZ(nLETrackSlotLJIIJJI, sizeLIZJ, sizeLIZJ2)) == null) {
            return;
        }
        float f = c0eo0LIZIZ.LIZ;
        float f2 = c0eo0LIZIZ.LIZIZ;
        C357270DzZ c357270DzZE35 = E3();
        if (c357270DzZE35 != null && (c0e483 = c357270DzZE35.LLILLJJLI) != null) {
            c0e483.setCanvasSize((int) f, (int) f2);
        }
        C357270DzZ c357270DzZE36 = E3();
        if (c357270DzZE36 == null || (c0e48 = c357270DzZE36.LLILLJJLI) == null || (tracks = C350870DpF.LJI(c0e48).getTracks()) == null) {
            return;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(C351220Dpo.LJLLJ(next), "track_brush_sticker")) {
                    break;
                }
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null || (slots = nLETrack.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) == null || (c357270DzZE33 = E3()) == null || (c0e482 = c357270DzZE33.LLILLJJLI) == null || (interfaceC351350Dq1LLFII = c0e482.LLFII()) == null) {
            return;
        }
        interfaceC351350Dq1LLFII.LLILZIL(nLETrackSlot, new Pair<>(Integer.valueOf((int) f), Integer.valueOf((int) f2)));
    }

    public final void X1() {
        final C0E60 c0e60;
        NLETrackSlot nLETrackSlotLJIIJJI;
        C357270DzZ c357270DzZE3;
        C0E48 c0e48;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0EI5 c0ei5LJIIIZ;
        C357270DzZ c357270DzZE32 = E3();
        if (c357270DzZE32 == null || (c0e60 = c357270DzZE32.LLILZ) == null) {
            return;
        }
        H4();
        C357270DzZ c357270DzZE33 = E3();
        if (c357270DzZE33 == null || (nLETrackSlotLJIIJJI = c357270DzZE33.LJIIJJI()) == null) {
            return;
        }
        if (C351220Dpo.LJZL(nLETrackSlotLJIIJJI) && (c357270DzZE3 = E3()) != null && !c357270DzZE3.LLJJJJ) {
            int iSwigValue = NLEAIMattingType.TYPE_INTERACTIVE.swigValue() | NLEAIMattingType.TYPE_CUSTOM.swigValue();
            if (C354090DuR.LJIIJ.LIZ.compareTo(EnumC356080Dxe.START) >= 0) {
                C357270DzZ c357270DzZE34 = E3();
                boolean z = c357270DzZE34 != null && c357270DzZE34.LLJJJJLIIL;
                C357270DzZ c357270DzZE35 = E3();
                VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZE35 != null ? c357270DzZE35.LJIIJ() : null;
                C357270DzZ c357270DzZE36 = E3();
                if (c357270DzZE36 == null || (c0ei5LJIIIZ = c357270DzZE36.LJIIIZ()) == null) {
                    return;
                }
                C0EI4 c0ei4 = C0EI4.LIZ;
                EnumC373350EkP enumC373350EkP = EnumC373350EkP.INTERRUPTED;
                c0ei4.getClass();
                C0EI4.LIZLLL(videoPublishEditModelLJIIJ, false, z, c0ei5LJIIIZ, enumC373350EkP);
            }
            C357270DzZ c357270DzZE37 = E3();
            if (c357270DzZE37 != null && (c0e48 = c357270DzZE37.LLILLJJLI) != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LJJZZI(nLETrackSlotLJIIJJI, iSwigValue, "");
            }
        }
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "shiwei", "cancelAndExitPanel");
        c0e60.LIZIZ(new AbstractC356490DyJ(c0e60) { // from class: X.0DyH
            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LIZ() {
                C357270DzZ c357270DzZE38 = this.E3();
                if (c357270DzZE38 != null) {
                    c357270DzZE38.LJIILLIIL(true);
                }
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final Pair<NLETrackSlot, Long> LIZJ() {
                C357270DzZ c357270DzZE38 = this.E3();
                NLETrackSlot nLETrackSlotLJIIJJI2 = c357270DzZE38 != null ? c357270DzZE38.LJIIJJI() : null;
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on seeek prepare slot uuid: ");
                sbLIZ.append(nLETrackSlotLJIIJJI2 != null ? nLETrackSlotLJIIJJI2.getUUID() : null);
                C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
                C357270DzZ c357270DzZE39 = this.E3();
                return new Pair<>(nLETrackSlotLJIIJJI2, Long.valueOf(c357270DzZE39 != null ? c357270DzZE39.LLJJL : 0L));
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LJ(Pair<? extends NLETrackSlot, Long> pair) {
                CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                C354090DuR.LJIILL(this.W1());
                InterfaceC373200EkA interfaceC373200EkAH3 = this.H3();
                if (interfaceC373200EkAH3 != null) {
                    interfaceC373200EkAH3.exit(false);
                }
            }

            @Override // X.AbstractC356490DyJ
            public final boolean LJFF(C0E48 c0e482) {
                this.e4();
                C357270DzZ c357270DzZE38 = this.E3();
                if (c357270DzZE38 != null) {
                    c357270DzZE38.LJIILL();
                    return false;
                }
                return false;
            }
        }, true);
    }

    public final void e4() {
        C357270DzZ c357270DzZE3;
        NLETrackSlot nLETrackSlotLJIIJJI;
        C357270DzZ c357270DzZE32;
        NLETrackSlot nLETrackSlotLJIIJJI2;
        InterfaceC373180Ek8 interfaceC373180Ek8V3 = v3();
        if ((interfaceC373180Ek8V3 != null && interfaceC373180Ek8V3.LLJJLIIIJLLLLLLLZ()) && (c357270DzZE32 = E3()) != null && (nLETrackSlotLJIIJJI2 = c357270DzZE32.LJIIJJI()) != null) {
            nLETrackSlotLJIIJJI2.setExtra("slot_extra_has_shown_cutout_main_menu_tips", "true");
        }
        InterfaceC373560Ekk interfaceC373560EkkQ3 = q3();
        if (interfaceC373560EkkQ3 == null || !interfaceC373560EkkQ3.LLJJLIIIJLLLLLLLZ() || (c357270DzZE3 = E3()) == null || (nLETrackSlotLJIIJJI = c357270DzZE3.LJIIJJI()) == null) {
            return;
        }
        nLETrackSlotLJIIJJI.setExtra("slot_extra_has_shown_stroke_tips", "true");
    }

    @Override // X.InterfaceC374660EmW
    public boolean onBackPressed() {
        return Z1();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C357270DzZ c357270DzZE3 = E3();
        if (c357270DzZE3 != null) {
            Q3(c357270DzZE3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r3 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void save() {
        /*
            r6 = this;
            X.0DzZ r0 = r6.E3()
            r5 = 1
            if (r0 == 0) goto L11
            boolean r0 = r0.LJIILIIL()
            if (r0 != r5) goto L11
        Ld:
            r6.o4()
            return
        L11:
            X.0DzZ r4 = r6.E3()
            if (r4 == 0) goto L5d
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r3 = r4.LJIIJJI()
            r1 = 0
            if (r3 == 0) goto L40
            com.bytedance.ies.nle.editor_jni.NLEAIMatting r0 = r3.getAIMatting()
            if (r0 == 0) goto L2e
            com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting r0 = r0.getSegment()
            if (r0 == 0) goto L2e
            com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode r1 = r0.getBlendMode()
        L2e:
            if (r3 == 0) goto L40
            com.bytedance.ies.nle.editor_jni.NLEAIMatting r0 = r3.getAIMatting()
            if (r0 == 0) goto L40
            com.bytedance.ies.nle.editor_jni.NLEAIMatting r0 = r3.getAIMatting()
            if (r0 == 0) goto L5b
            com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode r0 = com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode.NLEMattingBlendModeNone
            if (r1 != r0) goto L5b
        L40:
            r2 = 1
            if (r3 == 0) goto L59
        L43:
            boolean r0 = X.C351220Dpo.LLIZLLLIL(r3)
            if (r0 != r5) goto L59
            r0 = 1
        L4a:
            r1 = r0 ^ 1
            boolean r0 = r4.LLJJJJ
            if (r0 == 0) goto L52
            if (r2 != 0) goto Ld
        L52:
            boolean r0 = r4.LLJJJJJIL
            if (r0 == 0) goto L5d
            if (r1 == 0) goto L5d
            goto Ld
        L59:
            r0 = 0
            goto L4a
        L5b:
            r2 = 0
            goto L43
        L5d:
            r6.X1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373060Ejw.save():void");
    }

    public final InterfaceC373180Ek8 v3() {
        return C373700Eky.LIZ(getDiContainer());
    }

    public final boolean z4() {
        Keva keva;
        C357270DzZ c357270DzZE3 = E3();
        boolean z = (c357270DzZE3 == null || (keva = c357270DzZE3.LLJILLL) == null) ? false : keva.getBoolean("ep_custom_cutout_reset_do_not_remind", false);
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showResetDialog: ");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            return false;
        }
        this.LLJJIJIL = true;
        Activity activity = this.LLILLL.mActivity;
        if (activity != null) {
            C20692315y5 c20692315y5 = new C20692315y5(activity);
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJFF(2131830424);
            c1397580mTM.LJII = false;
            c1397580mTM.LIZ(2131830421);
            c1397580mTM.LJIIJJI = new C1054540dY4(c20692315y5);
            C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(c20692315y5, this, 90));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return true;
    }

    @Override // X.InterfaceC374660EmW
    public boolean Cp1() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public final C19A3 getParentScene() {
        return this.LLILLL;
    }

    public InterfaceC374660EmW w2() {
        return this.LLILZIL;
    }

    public final void Q3(final C357270DzZ c357270DzZ) {
        C385670FAf<Boolean> visible;
        C385670FAf<C375830EoP<Long>> c385670FAfZa;
        Pair<Integer, Integer> canvasSize;
        InterfaceC373130Ek3 interfaceC373130Ek3H2 = H2();
        if (interfaceC373130Ek3H2 != null) {
            interfaceC373130Ek3H2.bind();
        }
        InterfaceC373200EkA interfaceC373200EkAH3 = H3();
        if (interfaceC373200EkAH3 != null) {
            interfaceC373200EkAH3.lt1();
        }
        C0E48 c0e48 = c357270DzZ.LLILLJJLI;
        if (c0e48 != null && (canvasSize = c0e48.getCanvasSize()) != null) {
            this.LLJJIJI = new Size(canvasSize.getFirst().intValue(), canvasSize.getSecond().intValue());
        }
        InterfaceC373130Ek3 interfaceC373130Ek3H22 = H2();
        if (interfaceC373130Ek3H22 != null) {
            interfaceC373130Ek3H22.pV0(new AwS371S0200000_5(c357270DzZ, this, 89));
        }
        InterfaceC371300Eh6 interfaceC371300Eh6B3 = B3();
        if (interfaceC371300Eh6B3 != null && (c385670FAfZa = interfaceC371300Eh6B3.za()) != null) {
            c385670FAfZa.LIZ(this, new AObjectS240S0100000_5(this, 80));
        }
        InterfaceC373180Ek8 interfaceC373180Ek8V3 = v3();
        if (interfaceC373180Ek8V3 != null) {
            interfaceC373180Ek8V3.I1(new InterfaceC374650EmV() { // from class: X.0Ek0
                @Override // X.InterfaceC374650EmV
                public final void LIZ() {
                    C0EI4 c0ei4 = C0EI4.LIZ;
                    VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZ.LJIIJ();
                    boolean z = c357270DzZ.LLJJJJLIIL;
                    EnumC373110Ek1 enumC373110Ek1 = EnumC373110Ek1.SAVE;
                    c0ei4.getClass();
                    C0EI4.LJIIJ(videoPublishEditModelLJIIJ, z, enumC373110Ek1);
                    this.exit(true);
                }

                @Override // X.InterfaceC374650EmV
                public final void onCancel() {
                    C0EI4 c0ei4 = C0EI4.LIZ;
                    VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZ.LJIIJ();
                    boolean z = c357270DzZ.LLJJJJLIIL;
                    EnumC373110Ek1 enumC373110Ek1 = EnumC373110Ek1.RESET;
                    c0ei4.getClass();
                    C0EI4.LJIIJ(videoPublishEditModelLJIIJ, z, enumC373110Ek1);
                    if (this.z4()) {
                        return;
                    }
                    InterfaceC373180Ek8 interfaceC373180Ek8V32 = this.v3();
                    if (interfaceC373180Ek8V32 != null) {
                        interfaceC373180Ek8V32.reset();
                    }
                    InterfaceC373120Ek2 interfaceC373120Ek2T2 = this.T2();
                    if (interfaceC373120Ek2T2 != null) {
                        interfaceC373120Ek2T2.L22(false, EnumC356070Dxd.COMMIT, null);
                    }
                    InterfaceC373560Ekk interfaceC373560EkkQ3 = this.q3();
                    if (interfaceC373560EkkQ3 != null) {
                        interfaceC373560EkkQ3.V4(true);
                    }
                }
            });
        }
        if (c357270DzZ.LJIILJJIL()) {
            InterfaceC374530EmJ interfaceC374530EmJG2 = G2();
            if (interfaceC374530EmJG2 != null) {
                interfaceC374530EmJG2.setTitle("");
            }
            InterfaceC373180Ek8 interfaceC373180Ek8V32 = v3();
            if (interfaceC373180Ek8V32 != null && (visible = interfaceC373180Ek8V32.getVisible()) != null) {
                visible.LIZ(this, new AObjectS240S0100000_5(this, 81));
            }
        }
    }

    @Override // X.InterfaceC374710Emb
    public void exit(boolean z) {
        if (F4()) {
            return;
        }
        o2(z);
    }

    public final void o2(boolean z) {
        C0E48 c0e48;
        INLEMediaSession iNLEMediaSessionF1;
        INLEPlayer playerApi;
        long jJh;
        C0E48 c0e482;
        C0E48 c0e483;
        INLEMediaSession iNLEMediaSessionF12;
        INLEPlayer playerApi2;
        C357270DzZ c357270DzZE3;
        C0E48 c0e484;
        C0E48 c0e485;
        INLEMediaSession iNLEMediaSessionF13;
        INLEPlayer playerApi3;
        if (C373230EkD.LIZ(H3())) {
            return;
        }
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        C354090DuR.LJIILL(W1());
        InterfaceC373870ElF interfaceC373870ElFI3 = i3();
        if (interfaceC373870ElFI3 != null) {
            interfaceC373870ElFI3.Or1(false);
        }
        InterfaceC373200EkA interfaceC373200EkAH3 = H3();
        if (interfaceC373200EkAH3 != null) {
            interfaceC373200EkAH3.sr0();
        }
        InterfaceC373130Ek3 interfaceC373130Ek3H2 = H2();
        if (interfaceC373130Ek3H2 != null) {
            interfaceC373130Ek3H2.ml2(new AwS93S0110000_5(z, this, 5));
        }
        C357270DzZ c357270DzZE32 = E3();
        if (c357270DzZE32 != null && (c0e485 = c357270DzZE32.LLILLJJLI) != null && (iNLEMediaSessionF13 = c0e485.f1()) != null && (playerApi3 = iNLEMediaSessionF13.getPlayerApi()) != null) {
            playerApi3.releaseMagnifierSurface();
        }
        Size size = this.LLJJIJI;
        if (size != null && (c357270DzZE3 = E3()) != null && (c0e484 = c357270DzZE3.LLILLJJLI) != null) {
            c0e484.setCanvasSize(size.getWidth(), size.getHeight());
        }
        C357270DzZ c357270DzZE33 = E3();
        if (c357270DzZE33 != null && (c0e483 = c357270DzZE33.LLILLJJLI) != null && (iNLEMediaSessionF12 = c0e483.f1()) != null && (playerApi2 = iNLEMediaSessionF12.getPlayerApi()) != null) {
            playerApi2.prepare();
        }
        C357270DzZ c357270DzZE34 = E3();
        if (c357270DzZE34 != null && (c0e48 = c357270DzZE34.LLILLJJLI) != null && (iNLEMediaSessionF1 = c0e48.f1()) != null && (playerApi = iNLEMediaSessionF1.getPlayerApi()) != null) {
            C357270DzZ c357270DzZE35 = E3();
            if (c357270DzZE35 != null && (c0e482 = c357270DzZE35.LLILLJJLI) != null) {
                jJh = c0e482.getPlayer().Jh();
            } else {
                jJh = 0;
            }
            playerApi.seekTime(jJh, NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateSwingSync);
        }
    }

    public C373060Ejw(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = this;
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373130Ek3.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374530EmJ.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373200EkA.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373920ElK.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373560Ekk.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373120Ek2.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373570Ekl.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373870ElF.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC371300Eh6.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374290Elv.class, null);
    }
}
