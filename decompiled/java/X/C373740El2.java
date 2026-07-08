package X;

import Y.AObjectS240S0100000_5;
import android.app.Activity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESetting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0El2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373740El2 extends C0ETZ<InterfaceC374220Elo, C374500EmG, C374200Elm, C374470EmD> implements InterfaceC374220Elo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final int LLL;
    public final Activity LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final C358490E3r LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public InterfaceC374650EmV LLJLL;
    public final C373820ElA LLJLLIL;
    public boolean LLJLLL;
    public final C385670FAf<Boolean> LLJZ;

    @Override // X.InterfaceC374220Elo
    public void al0() {
        C5(true);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373740El2.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373740El2.class, "consoleApi", "getConsoleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutPanelConsoleBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373740El2.class, "cutoutPreviewApi", "getCutoutPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/preview/CutoutPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373740El2.class, "cutoutCanvasApi", "getCutoutCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/canvas/ICutoutCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C373740El2.class, "cutoutBrushApi", "getCutoutBrushApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutBrushApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C373740El2.class, "cutoutStrokeApi", "getCutoutStrokeApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C373740El2.class, "chromaKeyApi", "getChromaKeyApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/chromakey/ChromaKeyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C373740El2.class, "cutoutTrackApi", "getCutoutTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/ui/track/EPPanelTrackApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C373740El2.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLL = 8;
    }

    private final void E5() {
        C357270DzZ c357270DzZX5;
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLETrackSlot nLETrackSlotLJIIJJI2;
        NLETrackSlot nLETrackSlotLJIIJJI3;
        NLETrackSlot nLETrackSlotLJIIJJI4;
        NLETrackSlot nLETrackSlotLJIIJJI5;
        NLETrackSlot nLETrackSlotLJIIJJI6;
        EnumC373830ElB enumC373830ElB = EnumC373830ElB.AUTO_CUTOUT;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_person_cutout;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = C353850Du3.LIZ(null) ? R.raw.icon_color_person_cutout_tick_green : R.raw.icon_color_person_cutout_tick;
        C357270DzZ c357270DzZX52 = x5();
        C373800El8 c373800El8 = new C373800El8(enumC373830ElB, c419910GdJ, c419910GdJ2, 2131821201, (c357270DzZX52 == null || (nLETrackSlotLJIIJJI6 = c357270DzZX52.LJIIJJI()) == null || !C351220Dpo.LJLZ(nLETrackSlotLJIIJJI6)) ? false : true, false, false, 96);
        EnumC373830ElB enumC373830ElB2 = EnumC373830ElB.MANUAL_CUTOUT;
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_color_hand_nudge;
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LIZ = R.raw.icon_color_hand_nudge_tick;
        C357270DzZ c357270DzZX53 = x5();
        C373800El8 c373800El82 = new C373800El8(enumC373830ElB2, c419910GdJ3, c419910GdJ4, 2131834048, (c357270DzZX53 == null || (nLETrackSlotLJIIJJI5 = c357270DzZX53.LJIIJJI()) == null || !C351220Dpo.LJZL(nLETrackSlotLJIIJJI5)) ? false : true, false, false, 96);
        EnumC373830ElB enumC373830ElB3 = EnumC373830ElB.CHROMA_KEY;
        C419910GdJ c419910GdJ5 = new C419910GdJ();
        c419910GdJ5.LIZ = R.raw.icon_chroma_key;
        c419910GdJ5.LIZLLL = Integer.valueOf(R.attr.zi);
        c419910GdJ5.LJ = Integer.valueOf(R.attr.zi);
        C419910GdJ c419910GdJ6 = new C419910GdJ();
        c419910GdJ6.LIZ = R.raw.icon_color_chroma_key_tick;
        C357270DzZ c357270DzZX54 = x5();
        C373800El8 c373800El83 = new C373800El8(enumC373830ElB3, c419910GdJ5, c419910GdJ6, 2131834047, (c357270DzZX54 == null || (nLETrackSlotLJIIJJI4 = c357270DzZX54.LJIIJJI()) == null || !C351220Dpo.LLIZLLLIL(nLETrackSlotLJIIJJI4)) ? false : true, false, false, 96);
        C373800El8 c373800El84 = new C373800El8(EnumC373830ElB.SPLIT_LINE, null, null, 0, false, false, false, 126);
        EnumC373830ElB enumC373830ElB4 = EnumC373830ElB.STROKE;
        C419910GdJ c419910GdJ7 = new C419910GdJ();
        c419910GdJ7.LIZ = R.raw.icon_color_person_dash_line;
        C419910GdJ c419910GdJ8 = new C419910GdJ();
        c419910GdJ8.LIZ = R.raw.icon_color_person_dash_stroke_tick;
        C357270DzZ c357270DzZX55 = x5();
        boolean z = (c357270DzZX55 == null || (nLETrackSlotLJIIJJI3 = c357270DzZX55.LJIIJJI()) == null || !C351220Dpo.LLD(nLETrackSlotLJIIJJI3)) ? false : true;
        C357270DzZ c357270DzZX56 = x5();
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c373800El8, c373800El82, c373800El84, new C373800El8(enumC373830ElB4, c419910GdJ7, c419910GdJ8, 2131834049, z, !((c357270DzZX56 == null || (nLETrackSlotLJIIJJI2 = c357270DzZX56.LJIIJJI()) == null || !C351220Dpo.LLIZLLLIL(nLETrackSlotLJIIJJI2)) ? false : true), false, 64));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_cutout_chromakey", true, false) || ((c357270DzZX5 = x5()) != null && (nLETrackSlotLJIIJJI = c357270DzZX5.LJIIJJI()) != null && C351220Dpo.LLIZLLLIL(nLETrackSlotLJIIJJI))) {
            ListProtector.add(listLJIILJJIL, 2, c373800El83);
        }
        i3(new AwS584S0100000_5(listLJIILJJIL, (List<Pair<Long, Float>>) 499));
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C0E0S c0e0s = C0E0S.LIZ;
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            c0e0s.getClass();
            C0E0S.LJ(lifecycleScope, c0e48F4, null);
        }
    }

    private final void H5() {
        C357270DzZ c357270DzZX5 = x5();
        C376300EpA.LIZ("click_custom_cutout", c357270DzZX5 != null ? c357270DzZX5.LJIIJ() : null, null, null, null, 28);
        LIZLLL();
        Z4().LIZ();
    }

    private final void M5() {
        C05YD<Boolean> c05ydOF2;
        InterfaceC373870ElF interfaceC373870ElFK5;
        C357270DzZ c357270DzZX5 = x5();
        C376300EpA.LIZ("click_chroma_key", c357270DzZX5 != null ? c357270DzZX5.LJIIJ() : null, null, null, null, 28);
        InterfaceC373870ElF interfaceC373870ElFK52 = k5();
        if (interfaceC373870ElFK52 != null && (c05ydOF2 = interfaceC373870ElFK52.OF2()) != null && c05ydOF2.getValue().booleanValue() && (interfaceC373870ElFK5 = k5()) != null) {
            interfaceC373870ElFK5.p52();
        }
        LIZLLL();
        InterfaceC373120Ek2 interfaceC373120Ek2P4 = P4();
        if (interfaceC373120Ek2P4 != null) {
            interfaceC373120Ek2P4.LIZ();
        }
    }

    private final InterfaceC373120Ek2 P4() {
        return (InterfaceC373120Ek2) this.LLJJJJJIL.getValue(this, LLJZIJLIL[6]);
    }

    private final InterfaceC374660EmW d5() {
        return (InterfaceC374660EmW) this.LLJJJ.getValue(this, LLJZIJLIL[3]);
    }

    private final InterfaceC370450Efj t5() {
        return (InterfaceC370450Efj) this.LLJJJJLIIL.getValue(this, LLJZIJLIL[7]);
    }

    private final VideoPublishEditModel v5() {
        return (VideoPublishEditModel) this.LLJJL.getValue(this, LLJZIJLIL[8]);
    }

    public final InterfaceC374290Elv T4() {
        return (InterfaceC374290Elv) this.LLJJIJIIJIL.getValue(this, LLJZIJLIL[1]);
    }

    public final InterfaceC373920ElK Z4() {
        return (InterfaceC373920ElK) this.LLJJJIL.getValue(this, LLJZIJLIL[4]);
    }

    public final InterfaceC373870ElF k5() {
        return (InterfaceC373870ElF) this.LLJJIJIL.getValue(this, LLJZIJLIL[2]);
    }

    public final InterfaceC373560Ekk n5() {
        return (InterfaceC373560Ekk) this.LLJJJJ.getValue(this, LLJZIJLIL[5]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374200Elm> o2() {
        return new AwS549S0100000_5(this, 580);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374470EmD> w2() {
        return new AwS549S0100000_5(this, 581);
    }

    public final C357270DzZ x5() {
        return (C357270DzZ) this.LLJJIJI.getValue(this, LLJZIJLIL[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void N5() {
        /*
            r12 = this;
            X.0DzZ r0 = r12.x5()
            r5 = 0
            if (r0 == 0) goto L56
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r0.LJIIJJI()
            if (r0 == 0) goto L56
            boolean r0 = X.C351220Dpo.LLIZLLLIL(r0)
            r1 = 1
            if (r0 != r1) goto L56
        L14:
            java.lang.String r6 = "click_add_stroke"
            X.0DzZ r0 = r12.x5()
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r0.LJIIJ()
        L20:
            r8 = 0
            r0 = r1 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r11 = 12
            r9 = r8
            X.C376300EpA.LIZ(r6, r7, r8, r9, r10, r11)
            if (r1 == 0) goto L58
            android.app.Activity r4 = r12.LLJJI
            if (r4 == 0) goto L53
            X.0mHl r3 = X.C1390390mHl.LIZ
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r2 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r2.<init>()
            r0 = 2131834045(0x7f1134bd, float:1.930119E38)
            r2.messageRes(r0)
            r2.isCenterToast(r5)
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.duration(r0)
            r0 = 1074(0x432, float:1.505E-42)
            com.ss.android.ugc.aweme.services.uikit.CreativeToast r0 = r3.createToast(r4, r0, r2)
            X.0mHi r0 = (X.C1390360mHi) r0
            r0.show()
        L53:
            return
        L54:
            r7 = 0
            goto L20
        L56:
            r1 = 0
            goto L14
        L58:
            r12.LIZLLL()
            X.0Ekk r0 = r12.n5()
            r0.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373740El2.N5():void");
    }

    private final void U5() {
        C0EI5 c0ei5LJIIIZ;
        C357270DzZ c357270DzZX5 = x5();
        boolean z = c357270DzZX5 != null ? c357270DzZX5.LLJJJJLIIL : false;
        C357270DzZ c357270DzZX52 = x5();
        VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZX52 != null ? c357270DzZX52.LJIIJ() : null;
        C357270DzZ c357270DzZX53 = x5();
        if (c357270DzZX53 == null || (c0ei5LJIIIZ = c357270DzZX53.LJIIIZ()) == null) {
            return;
        }
        C0EI4 c0ei4 = C0EI4.LIZ;
        EnumC373350EkP enumC373350EkP = EnumC373350EkP.RESET;
        c0ei4.getClass();
        C0EI4.LIZLLL(videoPublishEditModelLJIIJ, false, z, c0ei5LJIIIZ, enumC373350EkP);
    }

    public final void H4() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C0E48 c0e48;
        NLEModel nLEModel;
        INLEMediaSession iNLEMediaSessionF1;
        NLEMediaConfig mediaConfig;
        C0E48 c0e48F4 = F4();
        boolean z = true;
        if (c0e48F4 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F4);
            if (nLEModelLJI.getSetting() == null) {
                nLEModelLJI.setSetting(new NLESetting());
            }
            NLESetting setting = nLEModelLJI.getSetting();
            if (setting != null) {
                setting.setEffectSegmentUpper(true);
            }
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (iNLEMediaSessionF1 = c0e48F42.f1()) != null && (mediaConfig = iNLEMediaSessionF1.getMediaConfig()) != null) {
            this.LLJLILLLLZIIL = mediaConfig.getEnableCoexistGlobalEffect();
            mediaConfig.setEnableCoexistGlobalEffect(true);
        }
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            c357270DzZX5.LLILZ.LIZ();
            C357270DzZ c357270DzZX52 = x5();
            if (c357270DzZX52 == null || (nLEModel = c357270DzZX52.LLILZLL) == null) {
                return;
            }
            long duration = nLEModel.getDuration();
            InterfaceC374290Elv interfaceC374290ElvT4 = T4();
            if (interfaceC374290ElvT4 != null) {
                interfaceC374290ElvT4.y2(C351220Dpo.LLLLLLL(duration));
            }
            this.LLJL = C351220Dpo.LLLLLLL(duration);
            long startTime = nLEModel.getStartTime();
            InterfaceC374290Elv interfaceC374290ElvT42 = T4();
            if (interfaceC374290ElvT42 != null) {
                interfaceC374290ElvT42.Y3(startTime);
            }
        }
        InterfaceC370450Efj interfaceC370450EfjT5 = t5();
        if (interfaceC370450EfjT5 != null) {
            interfaceC370450EfjT5.wf();
        }
        InterfaceC373870ElF interfaceC373870ElFK5 = k5();
        if (interfaceC373870ElFK5 != null) {
            interfaceC373870ElFK5.x10();
        }
        InterfaceC374290Elv interfaceC374290ElvT43 = T4();
        if (interfaceC374290ElvT43 != null) {
            interfaceC374290ElvT43.wR1();
        }
        n5().getData().LIZ(this, new AObjectS240S0100000_5(this, 83));
        C357270DzZ c357270DzZX53 = x5();
        if (c357270DzZX53 != null && (c0e48 = c357270DzZX53.LLILLJJLI) != null) {
            c0e48.fj(this.LLJLLIL);
        }
        C357270DzZ c357270DzZX54 = x5();
        if (c357270DzZX54 == null || (nLETrackSlotLJIIJJI = c357270DzZX54.LJIIJJI()) == null) {
            return;
        }
        if (!C351220Dpo.LJLZ(nLETrackSlotLJIIJJI) && !C351220Dpo.LJZL(nLETrackSlotLJIIJJI) && !C351220Dpo.LLIZLLLIL(nLETrackSlotLJIIJJI) && !C351220Dpo.LLD(nLETrackSlotLJIIJJI)) {
            z = false;
        }
        J6(z);
    }

    @Override // X.InterfaceC374220Elo, X.InterfaceC373170Ek7
    public void LIZ() {
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            c357270DzZX5.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(254));
    }

    @Override // X.InterfaceC374220Elo
    public void LIZLLL() {
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            c357270DzZX5.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(253));
    }

    @Override // X.InterfaceC374220Elo, X.InterfaceC373180Ek8
    public void LLJI() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLESegmentAIMatting segment;
        NLEMattingBlendMode blendMode;
        NLESegmentAIMatting segment2;
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 == null || (nLETrackSlotLJIIJJI = c357270DzZX5.LJIIJJI()) == null) {
            return;
        }
        if (nLETrackSlotLJIIJJI.getAIMatting() == null) {
            B0(false);
            InterfaceC373920ElK interfaceC373920ElKZ4 = Z4();
            interfaceC373920ElKZ4.Ml2(interfaceC373920ElKZ4.c31().LIZJ());
            return;
        }
        NLEMattingBlendMode blendMode2 = null;
        if (C351220Dpo.LJLZ(nLETrackSlotLJIIJJI)) {
            InterfaceC373870ElF interfaceC373870ElFK5 = k5();
            if (interfaceC373870ElFK5 != null) {
                interfaceC373870ElFK5.fy();
            }
            NLEAIMatting aIMatting = nLETrackSlotLJIIJJI.getAIMatting();
            if (aIMatting != null && (segment2 = aIMatting.getSegment()) != null) {
                blendMode2 = segment2.getBlendMode();
            }
            B0((blendMode2 == NLEMattingBlendMode.NLEMattingBlendModeNone || C351220Dpo.LJZL(nLETrackSlotLJIIJJI)) ? false : true);
        }
        InterfaceC373920ElK interfaceC373920ElKZ42 = Z4();
        interfaceC373920ElKZ42.Ml2(interfaceC373920ElKZ42.c31().LIZJ());
        NLEAIMatting aIMatting2 = nLETrackSlotLJIIJJI.getAIMatting();
        EnumC374420Em8 enumC374420Em8 = (aIMatting2 == null || (segment = aIMatting2.getSegment()) == null || (blendMode = segment.getBlendMode()) == null || C373840ElC.LIZ[blendMode.ordinal()] != 1) ? EnumC374420Em8.SELECTED : EnumC374420Em8.NORMAL;
        InterfaceC373870ElF interfaceC373870ElFK52 = k5();
        if (interfaceC373870ElFK52 != null) {
            interfaceC373870ElFK52.OJ0(enumC374420Em8, false);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        E5();
        this.LLJJLIIIJLLLLLLLZ.LIZIZ(0L, new C0FX3(this, 8), true, true);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0E55 player;
        INLEMediaSession iNLEMediaSessionF1;
        NLEMediaConfig mediaConfig;
        C0E48 c0e48;
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null && (c0e48 = c357270DzZX5.LLILLJJLI) != null) {
            c0e48.Ej(this.LLJLLIL);
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F4);
            if (nLEModelLJI.getSetting() == null) {
                nLEModelLJI.setSetting(new NLESetting());
            }
            NLESetting setting = nLEModelLJI.getSetting();
            if (setting != null) {
                setting.setEffectSegmentUpper(false);
            }
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (iNLEMediaSessionF1 = c0e48F42.f1()) != null && (mediaConfig = iNLEMediaSessionF1.getMediaConfig()) != null) {
            mediaConfig.setEnableCoexistGlobalEffect(this.LLJLILLLLZIIL);
        }
        super.onDestroy();
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null) {
            player.pause(false);
        }
        C0E0S.LIZ.getClass();
        C0E0S.LIZJ();
        C0E0S.LIZJ = null;
    }

    @Override // X.InterfaceC374220Elo, X.InterfaceC373180Ek8
    public void reset() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C357270DzZ c357270DzZX5;
        C357270DzZ c357270DzZX52 = x5();
        if (c357270DzZX52 == null || (nLETrackSlotLJIIJJI = c357270DzZX52.LJIIJJI()) == null) {
            return;
        }
        if (C351220Dpo.LJLZ(nLETrackSlotLJIIJJI) || C351220Dpo.LJZL(nLETrackSlotLJIIJJI)) {
            U5();
        }
        if (nLETrackSlotLJIIJJI.getAIMatting() != null || ((c357270DzZX5 = x5()) != null && c357270DzZX5.LJIIIIZZ())) {
            O4(nLETrackSlotLJIIJJI);
            if (Z4().DG0()) {
                Z4().Ml2(EnumC373860ElE.QUICK_BRUSH);
                B0(false);
            }
        }
    }

    @Override // X.InterfaceC374220Elo
    public boolean sd() {
        C373800El8 next;
        Iterator<C373800El8> it2 = T2().LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LIZ == EnumC373830ElB.AUTO_CUTOUT) {
                break;
            }
        }
        C373800El8 c373800El8 = next;
        return c373800El8 != null && c373800El8.LJ;
    }

    @Override // X.InterfaceC374220Elo, X.InterfaceC373180Ek8
    public boolean LLJJLIIIJLLLLLLLZ() {
        return this.LLJLLL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC374220Elo, X.InterfaceC373170Ek7
    public C385670FAf<Boolean> getVisible() {
        return this.LLJZ;
    }

    private final void C5(boolean z) {
        EnumC373350EkP enumC373350EkP;
        NLETrackSlot nLETrackSlotLJIIJJI;
        C05YD<Boolean> c05ydOF2;
        EnumC373860ElE enumC373860ElELIZJ = EnumC373860ElE.NULL;
        S5(enumC373860ElELIZJ);
        InterfaceC373870ElF interfaceC373870ElFK5 = k5();
        if (interfaceC373870ElFK5 != null && (c05ydOF2 = interfaceC373870ElFK5.OF2()) != null && c05ydOF2.getValue().booleanValue()) {
            enumC373350EkP = EnumC373350EkP.INTERRUPTED;
        } else {
            enumC373350EkP = EnumC373350EkP.UNLIKE;
        }
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            nLETrackSlotLJIIJJI = c357270DzZX5.LJIIJJI();
        } else {
            nLETrackSlotLJIIJJI = null;
        }
        this.LLJLIL = z;
        if (z) {
            if (nLETrackSlotLJIIJJI != null && C351220Dpo.LJZL(nLETrackSlotLJIIJJI)) {
                R5(enumC373350EkP);
            }
            InterfaceC373870ElF interfaceC373870ElFK52 = k5();
            if (interfaceC373870ElFK52 != null) {
                interfaceC373870ElFK52.OJ0(EnumC374420Em8.SELECTED, false);
            }
        } else {
            R5(enumC373350EkP);
            InterfaceC373870ElF interfaceC373870ElFK53 = k5();
            if (interfaceC373870ElFK53 != null) {
                interfaceC373870ElFK53.OJ0(EnumC374420Em8.NORMAL, false);
            }
            enumC373860ElELIZJ = Z4().c31().LIZJ();
        }
        Z4().Ml2(enumC373860ElELIZJ);
        B0(z);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            K4(c0e48F4, z);
        }
    }

    private final void O4(NLETrackSlot nLETrackSlot) {
        C0E48 c0e48;
        C0E55 player;
        NLEModel nLEModelLLZ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLJIIJJI;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII3;
        C0E48 c0e482;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII4;
        if (C351220Dpo.LJZL(nLETrackSlot)) {
            int iSwigValue = NLEAIMattingType.TYPE_INTERACTIVE.swigValue() | NLEAIMattingType.TYPE_CUSTOM.swigValue();
            C357270DzZ c357270DzZX5 = x5();
            if (c357270DzZX5 != null && (c0e482 = c357270DzZX5.LLILLJJLI) != null && (interfaceC351350Dq1LLFII4 = c0e482.LLFII()) != null) {
                interfaceC351350Dq1LLFII4.LJJZZI(nLETrackSlot, iSwigValue, "");
            }
        }
        C357270DzZ c357270DzZX52 = x5();
        if (c357270DzZX52 != null && (c0e48 = c357270DzZX52.LLILLJJLI) != null && (player = c0e48.getPlayer()) != null) {
            player.LJIIZILJ(false);
            C357270DzZ c357270DzZX53 = x5();
            if (c357270DzZX53 != null) {
                c357270DzZX53.LJIILLIIL(false);
            }
            C357270DzZ c357270DzZX54 = x5();
            if (c357270DzZX54 != null && (nLETrackSlotLJIIJJI = c357270DzZX54.LJIIJJI()) != null) {
                C0E48 c0e48F4 = F4();
                if (c0e48F4 != null && (interfaceC351350Dq1LLFII3 = c0e48F4.LLFII()) != null) {
                    interfaceC351350Dq1LLFII3.LJJZ(nLETrackSlotLJIIJJI, EnumC356070Dxd.NONE, null);
                }
                C0E48 c0e48F42 = F4();
                if (c0e48F42 != null && (interfaceC351350Dq1LLFII2 = c0e48F42.LLFII()) != null) {
                    interfaceC351350Dq1LLFII2.LJZL(nLETrackSlotLJIIJJI, EnumC356070Dxd.COMMIT, null);
                }
                C357270DzZ c357270DzZX55 = x5();
                if (c357270DzZX55 != null) {
                    c357270DzZX55.LLJLIL = true;
                }
            }
            player.LJIIZILJ(true);
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null && (interfaceC351350Dq1LLFII = c0e48F43.LLFII()) != null) {
                nLEModelLLZ = interfaceC351350Dq1LLFII.LLZ();
            } else {
                nLEModelLLZ = null;
            }
            player.LJIIJ(nLEModelLLZ, false, null);
            C354270Duj.LIZ(100L, new AwS549S0100000_5(this, 578));
            InterfaceC374290Elv interfaceC374290ElvT4 = T4();
            if (interfaceC374290ElvT4 != null) {
                interfaceC374290ElvT4.nZ1(EnumC373450EkZ.UNDO, false);
            }
            C354270Duj.LIZ(10L, new AwS549S0100000_5(this, 579));
        }
    }

    private final void S5(EnumC373860ElE enumC373860ElE) {
        C0EI5 c0ei5;
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        int i = C373840ElC.LIZJ[enumC373860ElE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c0ei5 = C0EI5.AUTO_CUTOUT;
                } else {
                    c0ei5 = C0EI5.QUICK_BRUSH;
                }
            } else {
                c0ei5 = C0EI5.BRUSH;
            }
        } else {
            c0ei5 = C0EI5.ERASER;
        }
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null) {
            z = c357270DzZX5.LLJJJJLIIL;
        } else {
            z = false;
        }
        C357270DzZ c357270DzZX52 = x5();
        if (c357270DzZX52 != null) {
            videoPublishEditModelLJIIJ = c357270DzZX52.LJIIJ();
        } else {
            videoPublishEditModelLJIIJ = null;
        }
        if (c0ei5 == C0EI5.AUTO_CUTOUT) {
            C0EI4.LIZ.getClass();
            C0EI4.LJFF(videoPublishEditModelLJIIJ, z);
        } else {
            C0EI4.LIZ.getClass();
            C0EI4.LJIIIIZZ(videoPublishEditModelLJIIJ, c0ei5, z);
        }
    }

    @Override // X.InterfaceC374220Elo, X.InterfaceC373180Ek8
    public void B0(boolean z) {
        K6(EnumC373830ElB.AUTO_CUTOUT, z);
    }

    @Override // X.InterfaceC374220Elo, X.InterfaceC373180Ek8
    public void I1(InterfaceC374650EmV interfaceC374650EmV) {
        this.LLJLL = interfaceC374650EmV;
    }

    public final void J6(boolean z) {
        if (T2().LJ == z) {
            return;
        }
        i3(new AwS20S0010000_5(z, 25));
    }

    public final void R5(EnumC373350EkP enumC373350EkP) {
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        C0EI5 c0ei5LJIIIZ;
        if (C354090DuR.LJIIJ.LIZ.compareTo(EnumC356080Dxe.START) >= 0 || enumC373350EkP == EnumC373350EkP.INTERNET_ERROR || enumC373350EkP == EnumC373350EkP.CUTOUT_FAIL || enumC373350EkP == EnumC373350EkP.NO_OBJECT) {
            C357270DzZ c357270DzZX5 = x5();
            if (c357270DzZX5 != null) {
                z = c357270DzZX5.LLJJJJLIIL;
            } else {
                z = false;
            }
            C357270DzZ c357270DzZX52 = x5();
            if (c357270DzZX52 != null) {
                videoPublishEditModelLJIIJ = c357270DzZX52.LJIIJ();
            } else {
                videoPublishEditModelLJIIJ = null;
            }
            C357270DzZ c357270DzZX53 = x5();
            if (c357270DzZX53 != null && (c0ei5LJIIIZ = c357270DzZX53.LJIIIZ()) != null) {
                C0EI4.LIZ.getClass();
                C0EI4.LIZLLL(videoPublishEditModelLJIIJ, false, z, c0ei5LJIIIZ, enumC373350EkP);
            }
        }
    }

    private final void K4(final C0E48 c0e48, final boolean z) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        final NLETrackSlot nLETrackSlotLJIIJJI2;
        NLETrackSlot nLETrackSlotLJIIJJI3;
        C0E48 c0e482;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLJIIJJI4;
        C0E55 player;
        C0E48 c0e48F4;
        C0E55 player2;
        NLETrackSlot nLETrackSlotLJIIJJI5;
        C0E48 c0e48F42;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMattingRuntime mattingApi;
        C357270DzZ c357270DzZX5 = x5();
        if (c357270DzZX5 != null && (nLETrackSlotLJIIJJI5 = c357270DzZX5.LJIIJJI()) != null && (c0e48F42 = F4()) != null && (iNLEMediaSessionF1 = c0e48F42.f1()) != null && (mattingApi = iNLEMediaSessionF1.getMattingApi()) != null) {
            mattingApi.removeMattingTask(nLETrackSlotLJIIJJI5.getUUID());
        }
        C0E48 c0e48F43 = F4();
        boolean z2 = true;
        if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null && player.isPlaying() && (c0e48F4 = F4()) != null && (player2 = c0e48F4.getPlayer()) != null) {
            player2.pause(false);
        }
        if (z) {
            final C013C c013c = new C013C();
            C357270DzZ c357270DzZX52 = x5();
            if (c357270DzZX52 == null || (nLETrackSlotLJIIJJI4 = c357270DzZX52.LJIIJJI()) == null || nLETrackSlotLJIIJJI4.getAIMatting() == null) {
                z2 = false;
            }
            c013c.element = z2;
            C357270DzZ c357270DzZX53 = x5();
            if (c357270DzZX53 != null && (nLETrackSlotLJIIJJI3 = c357270DzZX53.LJIIJJI()) != null && C351220Dpo.LJZL(nLETrackSlotLJIIJJI3)) {
                int iSwigValue = NLEAIMattingType.TYPE_INTERACTIVE.swigValue() | NLEAIMattingType.TYPE_CUSTOM.swigValue();
                C357270DzZ c357270DzZX54 = x5();
                if (c357270DzZX54 != null && (c0e482 = c357270DzZX54.LLILLJJLI) != null && (interfaceC351350Dq1LLFII = c0e482.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LJJZZI(nLETrackSlotLJIIJJI3, iSwigValue, "");
                }
                C357270DzZ c357270DzZX55 = x5();
                if (c357270DzZX55 != null) {
                    c357270DzZX55.LJIILLIIL(false);
                }
                InterfaceC373920ElK interfaceC373920ElKZ4 = Z4();
                interfaceC373920ElKZ4.Ml2(interfaceC373920ElKZ4.c31().LIZJ());
            }
            C357270DzZ c357270DzZX56 = x5();
            if (c357270DzZX56 != null && (nLETrackSlotLJIIJJI2 = c357270DzZX56.LJIIJJI()) != null) {
                C0E0S c0e0s = C0E0S.LIZ;
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                InterfaceC353530DtX interfaceC353530DtX = new InterfaceC353530DtX() { // from class: X.0El6
                    @Override // X.InterfaceC353530DtX
                    public final void LIZJ() {
                        this.LIZ.R5(EnumC373350EkP.INTERNET_ERROR);
                        this.LIZ.d6(2131830452, false);
                    }

                    @Override // X.InterfaceC353530DtX
                    public final void onSuccess() {
                        C354270Duj.LIZJ(0L, new C373770El5(c013c, this.LIZ, c0e48, nLETrackSlotLJIIJJI2, NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY.swigValue(), z));
                    }

                    @Override // X.InterfaceC353530DtX
                    public final void onProgress(float f) {
                        C563650M8t c563650M8t = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("applyAutoCutout, startApplyAiMatting progress ");
                        sbLIZ.append(f);
                        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC373870ElF interfaceC373870ElFK5 = this.LIZ.k5();
                        if (interfaceC373870ElFK5 != null) {
                            interfaceC373870ElFK5.e71(Float.valueOf(f));
                        }
                    }
                };
                c0e0s.getClass();
                C0E0S.LJ(lifecycleScope, c0e48, interfaceC353530DtX);
                return;
            }
            return;
        }
        C357270DzZ c357270DzZX57 = x5();
        if (c357270DzZX57 == null || (nLETrackSlotLJIIJJI = c357270DzZX57.LJIIJJI()) == null) {
            return;
        }
        C0E0S.LIZ.getClass();
        C0E0S.LIZJ();
        C0E0S.LIZJ = null;
        O4(nLETrackSlotLJIIJJI);
        InterfaceC373920ElK interfaceC373920ElKZ42 = Z4();
        interfaceC373920ElKZ42.Ml2(interfaceC373920ElKZ42.c31().LIZJ());
        n5().V4(false);
    }

    public final void D5(C373800El8 c373800El8, int i) {
        int i2 = C373840ElC.LIZIZ[c373800El8.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        N5();
                        return;
                    }
                    return;
                }
                M5();
                return;
            }
            H5();
            return;
        }
        C5(!c373800El8.LJ);
    }

    public final void K6(EnumC373830ElB enumC373830ElB, boolean z) {
        C373800El8 next;
        Iterator<C373800El8> it2 = T2().LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == enumC373830ElB) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C373800El8 c373800El8 = next;
        if (c373800El8 != null && c373800El8.LJ == z) {
            return;
        }
        List<C373800El8> list = T2().LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C373800El8 c373800El8LIZ : list) {
            if (c373800El8LIZ.LIZ == enumC373830ElB) {
                c373800El8LIZ = C373800El8.LIZ(c373800El8LIZ, z, false, 111);
            }
            arrayList.add(c373800El8LIZ);
        }
        i3(new AwS584S0100000_5(C13LP.LLIIII(arrayList), (List<Pair<Long, Float>>) 501));
    }

    public final void d6(int i, boolean z) {
        Activity activity;
        InterfaceC374660EmW interfaceC374660EmWD5 = d5();
        if ((interfaceC374660EmWD5 == null || !interfaceC374660EmWD5.Cp1()) && (activity = this.LLJJI) != null) {
            if (z) {
                C15L2.LIZ(activity, activity.getString(i));
                return;
            }
            C1390390mHl c1390390mHl = C1390390mHl.LIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(i);
            creativeToastBuilder.isCenterToast(true);
            creativeToastBuilder.duration(2000L);
            ((C1390360mHi) c1390390mHl.createToast(activity, 1074, creativeToastBuilder)).show();
        }
    }

    public final void u6(EnumC373830ElB enumC373830ElB, boolean z) {
        C373800El8 next;
        Iterator<C373800El8> it2 = T2().LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == enumC373830ElB) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C373800El8 c373800El8 = next;
        if (c373800El8 != null && c373800El8.LJFF == z) {
            return;
        }
        List<C373800El8> list = T2().LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C373800El8 c373800El8LIZ : list) {
            if (c373800El8LIZ.LIZ == enumC373830ElB) {
                c373800El8LIZ = C373800El8.LIZ(c373800El8LIZ, false, z, 95);
            }
            arrayList.add(c373800El8LIZ);
        }
        i3(new AwS584S0100000_5(C13LP.LLIIII(arrayList), (List<Pair<Long, Float>>) 500));
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0ElA] */
    public C373740El2(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = activity;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374290Elv.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373870ElF.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374660EmW.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC373920ElK.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC373560Ekk.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373120Ek2.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC370450Efj.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJLIIIJLLLLLLLZ = new C358490E3r(F4());
        this.LLJLLIL = new NLEEditorListener() { // from class: X.0ElA
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                NLETrackSlot nLETrackSlotLJIIJJI;
                C357270DzZ c357270DzZX5 = this.LIZ.x5();
                if (c357270DzZX5 == null || (nLETrackSlotLJIIJJI = c357270DzZX5.LJIIJJI()) == null) {
                    return;
                }
                boolean zLJLZ = C351220Dpo.LJLZ(nLETrackSlotLJIIJJI);
                boolean zLJZL = C351220Dpo.LJZL(nLETrackSlotLJIIJJI);
                boolean zLLIZLLLIL = C351220Dpo.LLIZLLLIL(nLETrackSlotLJIIJJI);
                boolean zLLD = C351220Dpo.LLD(nLETrackSlotLJIIJJI);
                this.LIZ.K6(EnumC373830ElB.MANUAL_CUTOUT, zLJZL);
                this.LIZ.K6(EnumC373830ElB.AUTO_CUTOUT, zLJLZ && !zLJZL);
                this.LIZ.K6(EnumC373830ElB.CHROMA_KEY, zLLIZLLLIL);
                C373740El2 c373740El2 = this.LIZ;
                EnumC373830ElB enumC373830ElB = EnumC373830ElB.STROKE;
                c373740El2.u6(enumC373830ElB, !zLLIZLLLIL);
                this.LIZ.K6(enumC373830ElB, zLLD);
                this.LIZ.J6(zLJLZ || zLJZL || zLLIZLLLIL || zLLD);
            }
        };
        this.LLJZ = Z1(new C2217381BqS() { // from class: X.0ElY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374200Elm) obj).LIZ);
            }
        });
    }
}
