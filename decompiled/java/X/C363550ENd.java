package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ENd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363550ENd extends C0ETX<InterfaceC363580ENg, C0FB8, C0FB3, C363630ENl> implements InterfaceC363580ENg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public static final int LLLFF;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final C0E95 LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public boolean LLJLLL;
    public String LLJZ;
    public final C0ENS LLJZIJLIL;
    public final C363560ENe LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C363550ENd.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C363550ENd.class, "consoleApi", "getConsoleApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C363550ENd.class, "keyFrameApi", "getKeyFrameApi()Lcom/ss/ugc/android/editor/core/api/IKeyFrameApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C363550ENd.class, "maskResourceListApi", "getMaskResourceListApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/mask/resourcelist/MaskResourceListApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C363550ENd.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/ui/component/EPPanelTopBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C363550ENd.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLLFF = 8;
    }

    public final void H5() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        MaskParam maskParamLJJJJ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        this.LLJLLL = true;
        C0ENB c0enbR5 = R5();
        NLEKeyframeType nLEKeyframeType = NLEKeyframeType.Mask;
        if (c0enbR5.yv(nLEKeyframeType) || R5().f80()) {
            R5().Xb(nLEKeyframeType, false);
        }
        C0E48 c0e48F4 = F4();
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48F4 != null ? c0e48F4.LLLLLLIL() : null;
        C0E48 c0e48F42 = F4();
        if (c0e48F42 == null || (interfaceC351350Dq1LLFII = c0e48F42.LLFII()) == null || (maskParamLJJJJ = interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlotLLLLLLIL)) == null) {
            return;
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (interfaceC351350Dq1LLFII2 = c0e48F43.LLFII()) != null) {
            interfaceC351350Dq1LLFII2.LJIIL(nLETrackSlotLLLLLLIL, maskParamLJJJJ);
        }
        C0E48 c0e48F44 = F4();
        if (c0e48F44 != null) {
            C350890DpH.LIZ(c0e48F44, new C0E1X(C0E1V.ADD_MASK.getNameId(), null, null, null, null, 30));
        }
    }

    private final InterfaceC363570ENf S5() {
        return (InterfaceC363570ENf) this.LLJLILLLLZIIL.getValue(this, LLLF[3]);
    }

    private final void S6() {
        C0E12 c0e12 = C363750ENx.LIZ;
        if (c0e12.LIZ("has_show_text_mask_tips", false)) {
            return;
        }
        i3(AFwS234S0000000_5.get$arr$(314));
        c0e12.LIZIZ("has_show_text_mask_tips", true);
    }

    private final C0E2R d6() {
        return (C0E2R) this.LLJLL.getValue(this, LLLF[4]);
    }

    @Override // ge.i
    public Function0<C0FB8> E3() {
        return new AwS549S0100000_5(this, 723);
    }

    public final InterfaceC360800ECo N5() {
        return (InterfaceC360800ECo) this.LLJL.getValue(this, LLLF[1]);
    }

    public final C0ENB R5() {
        return (C0ENB) this.LLJLIL.getValue(this, LLLF[2]);
    }

    public final InterfaceC361710EGb U5() {
        return (InterfaceC361710EGb) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLF[0]);
    }

    public final C0E5S m6() {
        return (C0E5S) this.LLJLLIL.getValue(this, LLLF[5]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FB3> o2() {
        return new AwS549S0100000_5(this, 721);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C363630ENl> w2() {
        return new AwS549S0100000_5(this, 722);
    }

    private final void J6() {
        AbstractC363520ENa abstractC363520ENa = T2().LIZIZ;
        if (abstractC363520ENa instanceof C0ENW) {
            C385070F7x c385070F7x = ((C0ENW) abstractC363520ENa).LIZJ().richTextData;
            String str = c385070F7x != null ? c385070F7x.textStr : null;
            if (str == null || a0.LJJJIL(str)) {
                N6(this.LLJJJJJIL.getString(2131834127), false);
            } else {
                N6(a0.LJLIIIL(str).toString(), false);
            }
        }
    }

    private final void M5() {
        R5().Ax2();
    }

    private final void Mf() {
        LiveEvent<Unit> liveEventL72;
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            c0e48F4.Bo().LIZLLL(this.LLJZIJLIL);
        }
        C350440DoY.LIZ(this.LLJZIJLIL);
        N5().P42(this.LLL);
        N5().jq().LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 627));
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (mutableLiveDataLIZ = c0e48F42.S7().LIZ("selected_nle_track_slot")) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 77));
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null && (liveEventL72 = c0etqP4.L72()) != null) {
            liveEventL72.LIZ(this, new AObjectS240S0100000_5(this, 106));
        }
        U5().getCanvasSize().LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 628));
        U5().CY1().LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 629));
        U5().uc2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 630));
    }

    private final void P6() {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            c0e48F4.Bo().LIZJ(this.LLJZIJLIL);
        }
        C350440DoY.LIZIZ(this.LLJZIJLIL);
        N5().pz2(this.LLL);
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventGs1;
        super.onCreate();
        Mf();
        U5().o10(new C0ELW[]{C0ELW.VIDEO}, false);
        U5().Kq2(Boolean.FALSE, null, null, null);
        m6().yV(AFwS234S0000000_5.get$arr$(313));
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 == null || (liveEventGs1 = c0etqP4.Gs1()) == null) {
            return;
        }
        liveEventGs1.LIZ(this, new AObjectS240S0100000_5(this, 107));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        P6();
        U5().o10(new C0ELW[]{C0ELW.VIDEO}, true);
        U5().Kq2(Boolean.TRUE, null, null, null);
    }

    public final boolean u6() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrack trackBySlot;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) {
            return true;
        }
        C0E48 c0e48F42 = F4();
        boolean z = false;
        if (c0e48F42 != null && (trackBySlot = C350870DpF.LJI(c0e48F42).getTrackBySlot(nLETrackSlotLLLLLLIL)) != null && trackBySlot.getMainTrack()) {
            z = true;
        }
        return !z;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    public final void E5(boolean z) {
        C0E55 player;
        if (z) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
                player.pause(false);
            }
            N5().IO();
            C0EB4.LIZIZ(N5(), new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO}, null, Boolean.FALSE, null, null, 26);
        } else {
            N5().Fi2();
        }
        i3(new AwS93S0110000_5(z, this, 9));
        U5().ZF0();
    }

    public final void K6(AbstractC363520ENa abstractC363520ENa) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E55 player;
        if (this.LLJLLL) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
                player.pause(false);
            }
            M5();
            this.LLJLLL = false;
        }
        MaskParam maskParamLIZIZ = C0ENT.LIZIZ(abstractC363520ENa);
        if (maskParamLIZIZ == null) {
            return;
        }
        C0E48 c0e48F42 = F4();
        NLETrackSlot nLETrackSlotLLLLLLIL2 = null;
        if (c0e48F42 != null) {
            nLETrackSlotLLLLLLIL2 = c0e48F42.LLLLLLIL();
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (interfaceC351350Dq1LLFII = c0e48F43.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJJZZIII(maskParamLIZIZ, nLETrackSlotLLLLLLIL2, EnumC356070Dxd.COMMIT);
        }
        C0ENB c0enbR5 = R5();
        NLEKeyframeType nLEKeyframeType = NLEKeyframeType.Mask;
        if (c0enbR5.yv(nLEKeyframeType) || R5().f80()) {
            R5().Xb(nLEKeyframeType, false);
        }
        C0E48 c0e48F44 = F4();
        if (c0e48F44 != null) {
            C350870DpF.LIZ(c0e48F44, false);
        }
        C0E48 c0e48F45 = F4();
        if (c0e48F45 != null) {
            nLETrackSlotLLLLLLIL = c0e48F45.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        W6(nLETrackSlotLLLLLLIL);
    }

    public final void L6(boolean z) {
        NLETrackSlot nLETrackSlotLIZ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        MaskParam maskParamLJJJJ;
        C0E48 c0e48F4;
        C0E55 player;
        C0E48 c0e48F42;
        C0E55 player2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        C0E48 c0e48F43;
        C0E55 player3;
        if (z && (c0e48F43 = F4()) != null && (player3 = c0e48F43.getPlayer()) != null) {
            player3.pause(false);
        }
        J6();
        C0E48 c0e48F44 = F4();
        if (c0e48F44 != null) {
            nLETrackSlotLIZ = C346680DiU.LIZ(C350870DpF.LJI(c0e48F44), T2().LJII);
        } else {
            nLETrackSlotLIZ = null;
        }
        C0E48 c0e48F45 = F4();
        if (c0e48F45 != null && (interfaceC351350Dq1LLFII = c0e48F45.LLFII()) != null && (maskParamLJJJJ = interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlotLIZ)) != null) {
            C0E48 c0e48F46 = F4();
            if (c0e48F46 != null && (interfaceC351350Dq1LLFII2 = c0e48F46.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LJIIL(nLETrackSlotLIZ, maskParamLJJJJ);
            }
            if (!z && (c0e48F42 = F4()) != null && (player2 = c0e48F42.getPlayer()) != null) {
                player2.skipNextSeek(true);
            }
            C0E48 c0e48F47 = F4();
            if (c0e48F47 != null) {
                C350890DpH.LIZ(c0e48F47, new C0E1X(C0E1V.ADD_MASK.getNameId(), null, null, null, null, 30));
            }
            if (!z && (c0e48F4 = F4()) != null && (player = c0e48F4.getPlayer()) != null) {
                player.skipNextSeek(false);
            }
        }
    }

    public final void T6(NLETrackSlot nLETrackSlot) {
        boolean z;
        float f;
        if (nLETrackSlot == null) {
            return;
        }
        if (!C0E5J.LIZJ(nLETrackSlot) && !C0E5J.LIZLLL(nLETrackSlot)) {
            z = true;
        } else {
            z = false;
        }
        s4(z);
        S5().s4(z);
        C0E2R c0e2rD6 = d6();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        c0e2rD6.cD(f);
        d6().TC(z);
    }

    public final void W6(NLETrackSlot nLETrackSlot) {
        MaskParam maskParamLJJJJ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        if (nLETrackSlot == null) {
            return;
        }
        AbstractC363520ENa abstractC363520ENa = T2().LIZIZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            maskParamLJJJJ = interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlot);
        } else {
            maskParamLJJJJ = null;
        }
        AbstractC363520ENa abstractC363520ENaLIZ = C0ENT.LIZ(maskParamLJJJJ);
        i3(new AwS584S0100000_5(abstractC363520ENaLIZ, 631));
        U5().ZF0();
        if (!(abstractC363520ENa instanceof C0ENW) && (abstractC363520ENaLIZ instanceof C0ENW)) {
            S6();
        }
    }

    public final void k7(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return;
        }
        i3(new AwS584S0100000_5(C363770ENz.LIZIZ(nLETrackSlot, U5().getCanvasSize().LIZJ(), U5().uc2().LIZJ()), 632));
        T6(nLETrackSlot);
    }

    @Override // X.InterfaceC363580ENg
    public void s4(boolean z) {
        i3(new AwS20S0010000_5(z, 27));
    }

    public final void N6(String str, boolean z) {
        C0ENW c0enw;
        MaskParam maskParamLIZIZ;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        EnumC356070Dxd enumC356070Dxd;
        C0E48 c0e48F4;
        C0E55 player;
        if (z && (c0e48F4 = F4()) != null && (player = c0e48F4.getPlayer()) != null) {
            player.pause(false);
        }
        AbstractC363520ENa abstractC363520ENa = T2().LIZIZ;
        NLETrackSlot nLETrackSlotLIZ = null;
        if ((abstractC363520ENa instanceof C0ENW) && (c0enw = (C0ENW) abstractC363520ENa) != null) {
            if (str.length() > 500) {
                str = str.substring(0, 500);
            }
            NLETextRichContent nLETextRichContentLIZJ = c0enw.LIZJ();
            nLETextRichContentLIZJ.richTextData.setTextStr(str);
            nLETextRichContentLIZJ.setRichText(nLETextRichContentLIZJ.richTextData.toLabelStr());
            String jsonStr = nLETextRichContentLIZJ.toJsonStr();
            if (jsonStr == null || (maskParamLIZIZ = C0ENT.LIZIZ(C0ENW.LIZIZ(c0enw, null, jsonStr, 0.0f, 29))) == null) {
                return;
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null) {
                nLETrackSlotLIZ = C346680DiU.LIZ(C350870DpF.LJI(c0e48F42), T2().LJII);
            }
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null && (interfaceC351350Dq1LLFII = c0e48F43.LLFII()) != null) {
                if (z) {
                    enumC356070Dxd = EnumC356070Dxd.COMMIT;
                } else {
                    enumC356070Dxd = EnumC356070Dxd.NONE;
                }
                interfaceC351350Dq1LLFII.LJJZZIII(maskParamLIZIZ, nLETrackSlotLIZ, enumC356070Dxd);
            }
            C0E48 c0e48F44 = F4();
            if (c0e48F44 != null) {
                nLETrackSlotLLLLLLIL = c0e48F44.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            W6(nLETrackSlotLLLLLLIL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0ENe] */
    public C363550ENd(C19A3 c19a3, Activity activity, C1DRG c1drg, C0E95 c0e95) {
        super(c19a3, c1drg, false);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = c0e95;
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(getDiContainer(), C0ENB.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC363570ENf.class, null);
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), C0E2R.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJLLL = true;
        this.LLJZIJLIL = new C0ENS(this);
        this.LLL = new InterfaceC373540Eki() { // from class: X.0ENe
            @Override // X.InterfaceC373540Eki
            public void onEvent(C0E2F c0e2f) {
                if (Intrinsics.LJFF(c0e2f, C0E2H.LIZ) && Intrinsics.LJFF(this.LIZ.T2().LJI, Boolean.TRUE)) {
                    this.LIZ.i3(AFwS234S0000000_5.get$arr$(312));
                }
            }
        };
    }
}
