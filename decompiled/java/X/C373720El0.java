package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESetting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0El0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373720El0 extends C0ETZ<InterfaceC373710Ekz, C374180Elk, C373910ElJ, C374170Elj> implements InterfaceC373710Ekz {
    public static final C374640EmU LLLF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C19A3 LLJJI;
    public final Activity LLJJIII;
    public final C1DRG LLJJIJI;
    public final C385670FAf<EnumC373860ElE> LLJJIJIIJIL;
    public final C385670FAf<EnumC373900ElI> LLJJIJIL;
    public final C01GW LLJJJ;
    public final C385670FAf<Boolean> LLJJJIL;
    public final C358490E3r LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final List<ResourceItem> LLJLIL;
    public long LLJLILLLLZIIL;
    public NLETrackSlot LLJLL;
    public NLETrackSlot LLJLLIL;
    public boolean LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;
    public InterfaceC374650EmV LLL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0EmU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373720El0.class, "cutoutTrackApi", "getCutoutTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/ui/track/EPPanelTrackApi;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C373720El0.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0), new C2217381BqS(C373720El0.class, "consoleApi", "getConsoleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutPanelConsoleBarApi;", 0), new C2217381BqS(C373720El0.class, "cutoutPreviewApi", "getCutoutPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/preview/CutoutPreviewApi;", 0), new C2217381BqS(C373720El0.class, "cutoutCanvasApi", "getCutoutCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/canvas/ICutoutCanvasApi;", 0)};
        LLLF = new Object() { // from class: X.0EmU
        };
        LLLFFI = 8;
    }

    private final float d6(int i) {
        return (i * 0.0019191919f) + 0.008080808f;
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373170Ek7
    public void LIZ() {
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373920ElK
    public void LIZLLL() {
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373180Ek8
    public boolean LLJJLIIIJLLLLLLLZ() {
        return false;
    }

    @Override // X.InterfaceC373920ElK
    public void Wm0() {
    }

    private final C1361400lX0 C5() {
        return (C1361400lX0) this.LLJJJ.getValue();
    }

    private final void H5() {
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
        if (interfaceC360730ECh == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C373760El4(this, interfaceC360730ECh, null), 3);
    }

    private final InterfaceC374660EmW t5() {
        return (InterfaceC374660EmW) this.LLJL.getValue(this, LLLFF[4]);
    }

    private final InterfaceC370450Efj x5() {
        return (InterfaceC370450Efj) this.LLJJJJJIL.getValue(this, LLLFF[0]);
    }

    @Override // X.InterfaceC373920ElK
    public ResourceItem Ba1() {
        ResourceItem next;
        Iterator<ResourceItem> it2 = this.LLJLIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C373880ElG.LIZJ(next)) {
                break;
            }
        }
        return next;
    }

    @Override // X.InterfaceC373920ElK
    public boolean DG0() {
        return !this.LLJLIL.isEmpty();
    }

    public final C357270DzZ E5() {
        return (C357270DzZ) this.LLJJJJLIIL.getValue(this, LLLFF[1]);
    }

    public final InterfaceC374290Elv n5() {
        return (InterfaceC374290Elv) this.LLJJL.getValue(this, LLLFF[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373910ElJ> o2() {
        return AFwS191S0000000_5.get$arr$(162);
    }

    @Override // X.InterfaceC373920ElK
    public String tB0() {
        ResourceItem next;
        Iterator<ResourceItem> it2 = this.LLJLIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C373880ElG.LIZ(next)) {
                break;
            }
        }
        ResourceItem resourceItem = next;
        if (resourceItem != null) {
            return resourceItem.getPath();
        }
        return null;
    }

    public final InterfaceC373870ElF v5() {
        return (InterfaceC373870ElF) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLFF[3]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374170Elj> w2() {
        return new AwS549S0100000_5(this, 574);
    }

    private final void L6() {
        C0E48 c0e48F4;
        C357270DzZ c357270DzZE5;
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLETrackSlot nLETrackSlotLJIIJJI2;
        C357270DzZ c357270DzZE52 = E5();
        boolean z = (c357270DzZE52 == null || (nLETrackSlotLJIIJJI2 = c357270DzZE52.LJIIJJI()) == null || !C351220Dpo.LJLZ(nLETrackSlotLJIIJJI2)) ? false : true;
        C357270DzZ c357270DzZE53 = E5();
        VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZE53 != null ? c357270DzZE53.LJIIJ() : null;
        boolean z2 = ((videoPublishEditModelLJIIJ != null && videoPublishEditModelLJIIJ.creativeModel.pugcTemplateData.isFromCreateTemplate) || !((Boolean) C273650Anz.LIZ.getValue()).booleanValue()) && ((c357270DzZE5 = E5()) == null || (nLETrackSlotLJIIJJI = c357270DzZE5.LJIIJJI()) == null || nLETrackSlotLJIIJJI.getAIMatting() == null);
        if (z || z2) {
            i3(AFwS234S0000000_5.get$arr$(252));
            InterfaceC373870ElF interfaceC373870ElFV5 = v5();
            if (interfaceC373870ElFV5 != null) {
                interfaceC373870ElFV5.OJ0(EnumC374420Em8.SELECTED, false);
            }
            if (!z2 || (c0e48F4 = F4()) == null) {
                return;
            }
            N5(EnumC373860ElE.NULL);
            K4(c0e48F4, true);
        }
    }

    private final void R5() {
        C0EI5 c0ei5LJIIIZ;
        C357270DzZ c357270DzZE5 = E5();
        boolean z = c357270DzZE5 != null ? c357270DzZE5.LLJJJJLIIL : false;
        C357270DzZ c357270DzZE52 = E5();
        VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZE52 != null ? c357270DzZE52.LJIIJ() : null;
        C357270DzZ c357270DzZE53 = E5();
        if (c357270DzZE53 == null || (c0ei5LJIIIZ = c357270DzZE53.LJIIIZ()) == null) {
            return;
        }
        C0EI4 c0ei4 = C0EI4.LIZ;
        EnumC373350EkP enumC373350EkP = EnumC373350EkP.RESET;
        c0ei4.getClass();
        C0EI4.LIZLLL(videoPublishEditModelLJIIJ, false, z, c0ei5LJIIIZ, enumC373350EkP);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T4() {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373720El0.T4():void");
    }

    private final void m6() {
        InterfaceC370450Efj interfaceC370450EfjX5 = x5();
        if (interfaceC370450EfjX5 != null) {
            interfaceC370450EfjX5.wf();
        }
        InterfaceC373870ElF interfaceC373870ElFV5 = v5();
        if (interfaceC373870ElFV5 != null) {
            interfaceC373870ElFV5.x10();
        }
        InterfaceC374290Elv interfaceC374290ElvN5 = n5();
        if (interfaceC374290ElvN5 != null) {
            interfaceC374290ElvN5.wR1();
        }
    }

    public final void H4() {
        NLEModel nLEModel;
        INLEMediaSession iNLEMediaSessionF1;
        NLEMediaConfig mediaConfig;
        C0E48 c0e48F4 = F4();
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
            this.LLJLLL = mediaConfig.getEnableCoexistGlobalEffect();
            mediaConfig.setEnableCoexistGlobalEffect(true);
        }
        C357270DzZ c357270DzZE5 = E5();
        if (c357270DzZE5 != null) {
            c357270DzZE5.LLILZ.LIZ();
            C357270DzZ c357270DzZE52 = E5();
            if (c357270DzZE52 == null || (nLEModel = c357270DzZE52.LLILZLL) == null) {
                return;
            }
            long duration = nLEModel.getDuration();
            InterfaceC374290Elv interfaceC374290ElvN5 = n5();
            if (interfaceC374290ElvN5 != null) {
                interfaceC374290ElvN5.y2(C351220Dpo.LLLLLLL(duration));
            }
            this.LLJLILLLLZIIL = C351220Dpo.LLLLLLL(duration);
            long startTime = nLEModel.getStartTime();
            InterfaceC374290Elv interfaceC374290ElvN52 = n5();
            if (interfaceC374290ElvN52 != null) {
                interfaceC374290ElvN52.Y3(startTime);
            }
        }
        m6();
        L6();
        H5();
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373180Ek8
    public void LLJI() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLEMattingBlendMode blendMode;
        C357270DzZ c357270DzZE5 = E5();
        if (c357270DzZE5 == null || (nLETrackSlotLJIIJJI = c357270DzZE5.LJIIJJI()) == null) {
            return;
        }
        if (nLETrackSlotLJIIJJI.getAIMatting() == null) {
            InterfaceC373870ElF interfaceC373870ElFV5 = v5();
            if (interfaceC373870ElFV5 != null) {
                interfaceC373870ElFV5.OJ0(EnumC374420Em8.NORMAL, false);
            }
            i3(AFwS234S0000000_5.get$arr$(250));
            U5(T2().LIZIZ);
            return;
        }
        if (C351220Dpo.LJLZ(nLETrackSlotLJIIJJI)) {
            InterfaceC373870ElF interfaceC373870ElFV52 = v5();
            if (interfaceC373870ElFV52 != null) {
                interfaceC373870ElFV52.fy();
            }
            i3(new AwS20S0010000_5(nLETrackSlotLJIIJJI.getAIMatting().getSegment().getBlendMode() != NLEMattingBlendMode.NLEMattingBlendModeNone, 23));
        }
        U5(T2().LIZIZ);
        NLESegmentAIMatting segment = nLETrackSlotLJIIJJI.getAIMatting().getSegment();
        EnumC374420Em8 enumC374420Em8 = (segment == null || (blendMode = segment.getBlendMode()) == null || C373890ElH.LIZIZ[blendMode.ordinal()] != 1) ? EnumC374420Em8.SELECTED : EnumC374420Em8.NORMAL;
        InterfaceC373870ElF interfaceC373870ElFV53 = v5();
        if (interfaceC373870ElFV53 != null) {
            interfaceC373870ElFV53.OJ0(enumC374420Em8, false);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJJJJ.LIZIZ(0L, new C0FX3(this, 7), true, true);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0E55 player;
        INLEMediaSession iNLEMediaSessionF1;
        NLEMediaConfig mediaConfig;
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
            mediaConfig.setEnableCoexistGlobalEffect(this.LLJLLL);
        }
        super.onDestroy();
        C0E48 c0e48F43 = F4();
        if (c0e48F43 == null || (player = c0e48F43.getPlayer()) == null) {
            return;
        }
        player.pause(false);
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373180Ek8
    public void reset() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        Pair<EnumC373860ElE, Boolean> next;
        C357270DzZ c357270DzZE5;
        C357270DzZ c357270DzZE52 = E5();
        if (c357270DzZE52 == null || (nLETrackSlotLJIIJJI = c357270DzZE52.LJIIJJI()) == null) {
            return;
        }
        if (C351220Dpo.LJLZ(nLETrackSlotLJIIJJI) || C351220Dpo.LJZL(nLETrackSlotLJIIJJI)) {
            R5();
        }
        if (nLETrackSlotLJIIJJI.getAIMatting() != null || ((c357270DzZE5 = E5()) != null && c357270DzZE5.LJIIIIZZ())) {
            Z4(nLETrackSlotLJIIJJI);
            Iterator<Pair<EnumC373860ElE, Boolean>> it2 = T2().LIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next.getFirst() == EnumC373860ElE.QUICK_BRUSH) {
                        break;
                    }
                }
            }
            Pair<EnumC373860ElE, Boolean> pair = next;
            if (pair == null || !pair.getSecond().booleanValue()) {
                return;
            }
            U5(EnumC373860ElE.QUICK_BRUSH);
            i3(AFwS234S0000000_5.get$arr$(251));
        }
    }

    @Override // X.InterfaceC373710Ekz
    public boolean sd() {
        return T2().LIZJ;
    }

    @Override // X.InterfaceC373920ElK
    public NLETrackSlot Ky() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC373920ElK
    public C385670FAf<EnumC373900ElI> OE0() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC373920ElK
    public C385670FAf<EnumC373860ElE> c31() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC373920ElK
    public NLETrackSlot cI0() {
        return this.LLJLL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIJI;
    }

    public final C19A3 getParentScene() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373170Ek7
    public C385670FAf<Boolean> getVisible() {
        return this.LLJJJIL;
    }

    private final void O4(EnumC356150Dxl enumC356150Dxl) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        boolean z;
        String strJ4;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C357270DzZ c357270DzZE5 = E5();
        if (c357270DzZE5 != null && (nLETrackSlotLJIIJJI = c357270DzZE5.LJIIJJI()) != null) {
            if (nLETrackSlotLJIIJJI.getAIMatting() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                NLESegmentAIMatting segment = nLETrackSlotLJIIJJI.getAIMatting().getSegment();
                segment.setBlendMode(NLEMattingBlendMode.NLEMattingBlendModePreview);
                segment.setBlendColor(k5(R.attr.a06));
                C0E48 c0e48F42 = F4();
                if (c0e48F42 != null) {
                    C350870DpF.LIZ(c0e48F42, false);
                }
            }
            T4();
            long jK5 = k5(R.attr.a0_);
            long jK52 = k5(R.attr.a06);
            if (enumC356150Dxl == EnumC356150Dxl.ERASER) {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(jK5 & 4294967295L)}, 1));
            } else {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(jK52 & 4294967295L)}, 1));
            }
            NLETrackSlot nLETrackSlot = this.LLJLL;
            if (nLETrackSlot != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LLILII(nLETrackSlot, strJ4, enumC356150Dxl, EnumC356070Dxd.COMMIT);
            }
            P4(T2().LIZ.getFirst().intValue());
        }
    }

    private final void Z4(NLETrackSlot nLETrackSlot) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        if (C351220Dpo.LJZL(nLETrackSlot)) {
            int iSwigValue = NLEAIMattingType.TYPE_INTERACTIVE.swigValue() | NLEAIMattingType.TYPE_CUSTOM.swigValue();
            C357270DzZ c357270DzZE5 = E5();
            if (c357270DzZE5 != null && (c0e48 = c357270DzZE5.LLILLJJLI) != null && (interfaceC351350Dq1LLFII2 = c0e48.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LJJZZI(nLETrackSlot, iSwigValue, "");
            }
        }
        C357270DzZ c357270DzZE52 = E5();
        if (c357270DzZE52 != null) {
            c357270DzZE52.LJIILLIIL(false);
        }
        C357270DzZ c357270DzZE53 = E5();
        if (c357270DzZE53 != null && (nLETrackSlotLJIIJJI = c357270DzZE53.LJIIJJI()) != null) {
            C357270DzZ c357270DzZE54 = E5();
            if (c357270DzZE54 != null) {
                c357270DzZE54.LLJLIL = true;
            }
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LJZL(nLETrackSlotLJIIJJI, EnumC356070Dxd.COMMIT, null);
            }
        }
        C354270Duj.LIZ(100L, new AwS549S0100000_5(this, 571));
        InterfaceC374290Elv interfaceC374290ElvN5 = n5();
        if (interfaceC374290ElvN5 != null) {
            interfaceC374290ElvN5.nZ1(EnumC373450EkZ.UNDO, false);
        }
        C354270Duj.LIZ(10L, new AwS549S0100000_5(this, 572));
    }

    private final int k5(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, C5());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373180Ek8
    public void B0(boolean z) {
        i3(new AwS20S0010000_5(z, 24));
    }

    @Override // X.InterfaceC373710Ekz, X.InterfaceC373180Ek8
    public void I1(InterfaceC374650EmV interfaceC374650EmV) {
        this.LLL = interfaceC374650EmV;
    }

    public final void M5(EnumC373350EkP enumC373350EkP) {
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        C0EI5 c0ei5LJIIIZ;
        if (C354090DuR.LJIIJ.LIZ.compareTo(EnumC356080Dxe.START) >= 0 || enumC373350EkP == EnumC373350EkP.INTERNET_ERROR || enumC373350EkP == EnumC373350EkP.CUTOUT_FAIL || enumC373350EkP == EnumC373350EkP.NO_OBJECT) {
            C357270DzZ c357270DzZE5 = E5();
            if (c357270DzZE5 != null) {
                z = c357270DzZE5.LLJJJJLIIL;
            } else {
                z = false;
            }
            C357270DzZ c357270DzZE52 = E5();
            if (c357270DzZE52 != null) {
                videoPublishEditModelLJIIJ = c357270DzZE52.LJIIJ();
            } else {
                videoPublishEditModelLJIIJ = null;
            }
            C357270DzZ c357270DzZE53 = E5();
            if (c357270DzZE53 != null && (c0ei5LJIIIZ = c357270DzZE53.LJIIIZ()) != null) {
                C0EI4.LIZ.getClass();
                C0EI4.LIZLLL(videoPublishEditModelLJIIJ, false, z, c0ei5LJIIIZ, enumC373350EkP);
            }
        }
    }

    @Override // X.InterfaceC373920ElK
    public void Ml2(EnumC373860ElE enumC373860ElE) {
        U5(enumC373860ElE);
        i3(new AwS584S0100000_5(enumC373860ElE, 493));
    }

    public final void N5(EnumC373860ElE enumC373860ElE) {
        C0EI5 c0ei5;
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        int i = C373890ElH.LIZ[enumC373860ElE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c0ei5 = C0EI5.AUTO_CUTOUT;
                } else {
                    c0ei5 = C0EI5.BRUSH;
                }
            } else {
                c0ei5 = C0EI5.QUICK_BRUSH;
            }
        } else {
            c0ei5 = C0EI5.ERASER;
        }
        C357270DzZ c357270DzZE5 = E5();
        if (c357270DzZE5 != null) {
            z = c357270DzZE5.LLJJJJLIIL;
        } else {
            z = false;
        }
        C357270DzZ c357270DzZE52 = E5();
        if (c357270DzZE52 != null) {
            videoPublishEditModelLJIIJ = c357270DzZE52.LJIIJ();
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

    public final void P4(int i) {
        NLETrackSlot nLETrackSlot;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlot2 = this.LLJLL;
        if (nLETrackSlot2 != null && (nLETrackSlot = this.LLJLLIL) != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJFF(nLETrackSlot2, nLETrackSlot, d6(i), EnumC356070Dxd.COMMIT);
        }
    }

    public final void U5(EnumC373860ElE enumC373860ElE) {
        EnumC356150Dxl enumC356150Dxl;
        if (enumC373860ElE != EnumC373860ElE.NULL) {
            int i = C373890ElH.LIZ[enumC373860ElE.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    enumC356150Dxl = EnumC356150Dxl.NORMAL;
                } else {
                    enumC356150Dxl = EnumC356150Dxl.QUICK;
                }
            } else {
                enumC356150Dxl = EnumC356150Dxl.ERASER;
            }
            for (ResourceItem resourceItem : this.LLJLIL) {
                if (C373880ElG.LJ(resourceItem)) {
                    if (resourceItem != null) {
                        O4(enumC356150Dxl);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void u6(int i) {
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E55 player;
        C0E48 c0e48F42;
        C0E55 player2;
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null && player.isPlaying() && (c0e48F42 = F4()) != null && (player2 = c0e48F42.getPlayer()) != null) {
            player2.pause(false);
        }
        NLETrackSlot nLETrackSlot = this.LLJLLIL;
        if (nLETrackSlot != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJIIIZ(nLETrackSlot, d6(i));
        }
    }

    public final List<Pair<EnumC373860ElE, Boolean>> D5(boolean z, boolean z2) {
        return C1697810uHb.LJIIJJI(new Pair(EnumC373860ElE.QUICK_BRUSH, Boolean.valueOf(z)), new Pair(EnumC373860ElE.NORMAL_BRUSH, Boolean.valueOf(z)), new Pair(EnumC373860ElE.ERASER, Boolean.valueOf(z2)));
    }

    public final void J6(int i, boolean z) {
        Activity activity;
        InterfaceC374660EmW interfaceC374660EmWT5 = t5();
        if ((interfaceC374660EmWT5 == null || !interfaceC374660EmWT5.Cp1()) && (activity = this.LLJJI.mActivity) != null) {
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

    public final void K4(final C0E48 c0e48, final boolean z) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        final NLETrackSlot nLETrackSlotLJIIJJI2;
        NLETrackSlot nLETrackSlotLJIIJJI3;
        C0E48 c0e482;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E55 player;
        C0E48 c0e48F4;
        C0E55 player2;
        NLETrackSlot nLETrackSlotLJIIJJI4;
        C0E48 c0e48F42;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMattingRuntime mattingApi;
        C357270DzZ c357270DzZE5 = E5();
        if (c357270DzZE5 != null && (nLETrackSlotLJIIJJI4 = c357270DzZE5.LJIIJJI()) != null && (c0e48F42 = F4()) != null && (iNLEMediaSessionF1 = c0e48F42.f1()) != null && (mattingApi = iNLEMediaSessionF1.getMattingApi()) != null) {
            mattingApi.removeMattingTask(nLETrackSlotLJIIJJI4.getUUID());
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null && player.isPlaying() && (c0e48F4 = F4()) != null && (player2 = c0e48F4.getPlayer()) != null) {
            player2.pause(false);
        }
        if (z) {
            C357270DzZ c357270DzZE52 = E5();
            if (c357270DzZE52 != null && (nLETrackSlotLJIIJJI3 = c357270DzZE52.LJIIJJI()) != null && C351220Dpo.LJZL(nLETrackSlotLJIIJJI3)) {
                int iSwigValue = NLEAIMattingType.TYPE_INTERACTIVE.swigValue() | NLEAIMattingType.TYPE_CUSTOM.swigValue();
                C357270DzZ c357270DzZE53 = E5();
                if (c357270DzZE53 != null && (c0e482 = c357270DzZE53.LLILLJJLI) != null && (interfaceC351350Dq1LLFII = c0e482.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LJJZZI(nLETrackSlotLJIIJJI3, iSwigValue, "");
                }
                C357270DzZ c357270DzZE54 = E5();
                if (c357270DzZE54 != null) {
                    c357270DzZE54.LJIILLIIL(false);
                }
                U5(T2().LIZIZ);
            }
            C357270DzZ c357270DzZE55 = E5();
            if (c357270DzZE55 != null && (nLETrackSlotLJIIJJI2 = c357270DzZE55.LJIIJJI()) != null) {
                C0E0S c0e0s = C0E0S.LIZ;
                InterfaceC353530DtX interfaceC353530DtX = new InterfaceC353530DtX() { // from class: X.0El7
                    @Override // X.InterfaceC353530DtX
                    public final void LIZJ() {
                        this.LIZ.M5(EnumC373350EkP.INTERNET_ERROR);
                        this.LIZ.J6(2131830452, false);
                    }

                    @Override // X.InterfaceC353530DtX
                    public final void onSuccess() {
                        C354270Duj.LIZJ(0L, new C373810El9(this.LIZ, c0e48, nLETrackSlotLJIIJJI2, NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY.swigValue(), z));
                    }

                    @Override // X.InterfaceC353530DtX
                    public final void onProgress(float f) {
                        C563650M8t c563650M8t = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("applyAutoCutout, startApplyAiMatting progress ");
                        sbLIZ.append(f);
                        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC373870ElF interfaceC373870ElFV5 = this.LIZ.v5();
                        if (interfaceC373870ElFV5 != null) {
                            interfaceC373870ElFV5.e71(Float.valueOf(f));
                        }
                    }
                };
                c0e0s.getClass();
                C0E0S.LIZJ = interfaceC353530DtX;
                C569610MVr.LIZIZ().LJIIJ(C1697810uHb.LJ("7301210488958882306", "7328289135402160641"), "editor_pro_gameplay", true, new C0FX9(c0e48, 4));
                C118300cf c118300cf = new C118300cf();
                PthreadTimer pthreadTimer = new PthreadTimer("/MattingUtils");
                pthreadTimer.schedule(new C391480FWo(c118300cf, 3), 0L, 500L);
                C0E0S.LIZIZ = pthreadTimer;
                return;
            }
            return;
        }
        C357270DzZ c357270DzZE56 = E5();
        if (c357270DzZE56 == null || (nLETrackSlotLJIIJJI = c357270DzZE56.LJIIJJI()) == null) {
            return;
        }
        C0E0S.LIZ.getClass();
        C0E0S.LIZJ();
        C0E0S.LIZJ = null;
        Z4(nLETrackSlotLJIIJJI);
        U5(T2().LIZIZ);
    }

    public final void S5(InterfaceC360730ECh interfaceC360730ECh, C354690DvP c354690DvP) {
        InterfaceC1635390sev.LJJLIIIIJ.getClass();
        interfaceC360730ECh.LIZLLL(2, "editor_pro_cutout", "", new AwS371S0200000_5(c354690DvP, this, 100));
    }

    public C373720El0(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = activity;
        this.LLJJIJI = c1drg;
        this.LLJJIJIIJIL = Z1(new C2217381BqS() { // from class: X.0Eli
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C373910ElJ) obj).LIZIZ;
            }
        });
        this.LLJJIJIL = Z1(new C2217381BqS() { // from class: X.0Elh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C373910ElJ) obj).LJI;
            }
        });
        this.LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 573));
        this.LLJJJIL = new h0(Boolean.TRUE);
        this.LLJJJJ = new C358490E3r(F4());
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC370450Efj.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374290Elv.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373870ElF.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374660EmW.class, null);
        this.LLJLIL = new ArrayList();
    }

    public final Object d5(ResourceItem resourceItem, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C353220Dt2(resourceItem, str, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
