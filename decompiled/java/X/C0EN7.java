package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EN7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EN7 extends C0ETX<InterfaceC363570ENf, C0ENL, C0ENF, C0ENI> implements InterfaceC363570ENf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final C01GW LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EN7.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EN7.class, "keyFrameApi", "getKeyFrameApi()Lcom/ss/ugc/android/editor/core/api/IKeyFrameApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EN7.class, "consoleApi", "getConsoleApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJLLL = 8;
    }

    public static /* synthetic */ void N5() {
    }

    private final C0ENA U5() {
        return (C0ENA) this.LLJJL.getValue();
    }

    private final InterfaceC361710EGb d6() {
        return (InterfaceC361710EGb) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLIL[0]);
    }

    @Override // ge.i
    public Function0<C0ENL> E3() {
        return new AwS549S0100000_5(this, 728);
    }

    public final InterfaceC360800ECo M5() {
        return (InterfaceC360800ECo) this.LLJLIL.getValue(this, LLJLLIL[2]);
    }

    public final C0ENB R5() {
        return (C0ENB) this.LLJL.getValue(this, LLJLLIL[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0ENF> o2() {
        return AFwS191S0000000_5.get$arr$(201);
    }

    public final void u6() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        MaskParam maskParam;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) {
            return;
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 == null || (interfaceC351350Dq1LLFII = c0e48F42.LLFII()) == null || (maskParam = interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlotLLLLLLIL)) == null) {
            maskParam = new MaskParam(null, null, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "none", "", "");
        }
        String str = maskParam.maskType;
        this.LLJLILLLLZIIL = str;
        L6(this, str, Boolean.TRUE, null, null, null, null);
        C0E2R c0e2rT4 = T4();
        if (c0e2rT4 != null) {
            c0e2rT4.zs2(!Intrinsics.LJFF(maskParam.maskType, "none"));
        }
        i3(AFwS234S0000000_5.get$arr$(319));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0ENI> w2() {
        return new AwS549S0100000_5(this, 727);
    }

    @Override // X.C0ETX
    public boolean d5() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        MaskParam maskParamLJJJJ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII3;
        boolean z;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (nLETrackSlotLLLLLLIL = c0e48F42.LLLLLLIL()) != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null && (maskParamLJJJJ = interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlotLLLLLLIL)) != null) {
            String str = maskParamLJJJJ.maskType;
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            C0E48 c0e48F43 = F4();
            if (videoPublishEditModelLJJJLIIL != null) {
                if (c0e48F43 == null || (nLETrackSlotLLLLLLIL2 = c0e48F43.LLLLLLIL()) == null) {
                    z = false;
                } else {
                    NLETrack trackBySlot = C350870DpF.LJI(c0e48F43).getTrackBySlot(nLETrackSlotLLLLLLIL2);
                    z = !(trackBySlot != null && trackBySlot.getMainTrack());
                }
                String str2 = videoPublishEditModelLJJJLIIL.creativeModel.pugcTemplateData.isFromCreateTemplate ? "1" : CardStruct.IStatusCode.DEFAULT;
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F43, new Pair(-1, -1));
                c0labLJFF.LJ("is_from_pip", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                c0labLJFF.LJ("is_from_create_template", str2);
                c0labLJFF.LJ("mask_type", str);
                C20684815ws.LJIILLIIL("click_mask_invert", c0labLJFF.LIZ);
            }
            if (maskParamLJJJJ.invert == null) {
                maskParamLJJJJ.invert = Boolean.TRUE;
            } else {
                maskParamLJJJJ.invert = Boolean.valueOf(!r0.booleanValue());
            }
            C0E48 c0e48F44 = F4();
            if (c0e48F44 != null && (interfaceC351350Dq1LLFII3 = c0e48F44.LLFII()) != null) {
                interfaceC351350Dq1LLFII3.LJJZZIII(maskParamLJJJJ, nLETrackSlotLLLLLLIL, EnumC356070Dxd.COMMIT);
            }
            C0E48 c0e48F45 = F4();
            if (c0e48F45 != null && (interfaceC351350Dq1LLFII2 = c0e48F45.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LJIIL(nLETrackSlotLLLLLLIL, maskParamLJJJJ);
            }
            C0ENB c0enbR5 = R5();
            NLEKeyframeType nLEKeyframeType = NLEKeyframeType.Mask;
            if (c0enbR5.yv(nLEKeyframeType) || R5().f80()) {
                R5().Xb(nLEKeyframeType, false);
            }
            C0E48 c0e48F46 = F4();
            if (c0e48F46 != null) {
                C350890DpH.LIZ(c0e48F46, new C0E1X(C0E1V.ADD_MASK.getNameId(), null, null, null, null, 30));
            }
        }
        return false;
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        MutableLiveData mutableLiveDataLIZ;
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        super.onCreate();
        U5().getClass();
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
        if (interfaceC360730ECh != null) {
            interfaceC360730ECh.LJII("editor_pro_mask", false, true, false, null);
        }
        C0E2R c0e2rT4 = T4();
        if (c0e2rT4 != null) {
            c0e2rT4.TC(true);
        }
        C0E2R c0e2rT42 = T4();
        if (c0e2rT42 != null) {
            c0e2rT42.ob1(true);
        }
        i3(AFwS234S0000000_5.get$arr$(320));
        u6();
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null && (liveEventEb1 = interfaceC357900E1kH4.eb1()) != null) {
            liveEventEb1.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 110));
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (mutableLiveDataLIZ = c0e48F4.S7().LIZ("selected_nle_track_slot")) == null) {
            return;
        }
        mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 78));
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    private final boolean J6(String str) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        MaskParam maskParam;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) != null) {
            C0E48 c0e48F42 = F4();
            if (c0e48F42 == null || (interfaceC351350Dq1LLFII = c0e48F42.LLFII()) == null || (maskParam = interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlotLLLLLLIL)) == null) {
                maskParam = new MaskParam(null, null, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "none", "", "");
            }
            return Intrinsics.LJFF(maskParam.maskType, str);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.ugc.android.editor.core.api.params.MaskParam S5(X.C0EN8 r71) {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EN7.S5(X.0EN8):com.ss.ugc.android.editor.core.api.params.MaskParam");
    }

    public final void E5(String str) {
        C0E48 c0e48F4;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        MaskParam maskParamLJJJJ;
        C0EN8 next;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII3;
        if (!J6(str) && (c0e48F4 = F4()) != null && (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) != null) {
            Iterator<C0EN8> it2 = T2().LIZ.iterator();
            while (true) {
                maskParamLJJJJ = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0EN8 c0en8 = next;
            if (c0en8 == null) {
                return;
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (interfaceC351350Dq1LLFII3 = c0e48F42.LLFII()) != null) {
                maskParamLJJJJ = interfaceC351350Dq1LLFII3.LJJJJ(nLETrackSlotLLLLLLIL);
            }
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null && (interfaceC351350Dq1LLFII2 = c0e48F43.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LJJIIZI(nLETrackSlotLLLLLLIL, EnumC356070Dxd.NONE);
            }
            if (Intrinsics.LJFF(str, "none")) {
                C0E2R c0e2rT4 = T4();
                if (c0e2rT4 != null) {
                    c0e2rT4.zs2(false);
                }
                H5(nLETrackSlotLLLLLLIL, maskParamLJJJJ);
                C0E48 c0e48F44 = F4();
                if (c0e48F44 != null) {
                    C350890DpH.LIZ(c0e48F44, new C0E1X(C0E1V.DELETE_MASK.getNameId(), null, null, null, null, 30));
                    return;
                }
                return;
            }
            MaskParam maskParamS5 = S5(c0en8);
            if (maskParamS5 == null) {
                return;
            }
            C0E2R c0e2rT42 = T4();
            if (c0e2rT42 != null) {
                c0e2rT42.zs2(true);
            }
            C0E48 c0e48F45 = F4();
            if (c0e48F45 != null && (interfaceC351350Dq1LLFII = c0e48F45.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LLIIIZ(maskParamS5, nLETrackSlotLLLLLLIL, null, EnumC356070Dxd.NONE, null);
            }
            C0E48 c0e48F46 = F4();
            if (c0e48F46 != null) {
                C350890DpH.LIZ(c0e48F46, new C0E1X(C0E1V.ADD_MASK.getNameId(), null, null, null, null, 30));
            }
        }
    }

    @Override // X.InterfaceC363570ENf
    public void s4(boolean z) {
        i3(new AwS20S0010000_5(z, 31));
    }

    @Override // X.C0ETX
    public void t5(boolean z) {
        C5();
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    private final void H5(NLETrackSlot nLETrackSlot, MaskParam maskParam) {
        Iterator<T> it2 = nLETrackSlot.swingKeyframesOfType(NLEKeyframeType.Mask).values().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            nLETrackSlot.removeSwingKeyframe((NLEKeyframe) it2.next());
            z = true;
        }
        if (!z) {
            return;
        }
        K6(nLETrackSlot, maskParam);
    }

    private final void K6(NLETrackSlot nLETrackSlot, MaskParam maskParam) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        MaskParam maskParamLJJLIIIJJI;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        if (maskParam == null) {
            return;
        }
        for (String str : C1697810uHb.LJIIJJI("line", "mirror", "circle", "text", "rectangle")) {
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (interfaceC351350Dq1LLFII = c0e48F42.LLFII()) != null && (maskParamLJJLIIIJJI = interfaceC351350Dq1LLFII.LJJLIIIJJI(nLETrackSlot, str)) != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII2 = c0e48F4.LLFII()) != null) {
                Float f = maskParam.maskCenterX;
                if (f == null) {
                    f = maskParamLJJLIIIJJI.maskCenterX;
                }
                Float f2 = maskParam.maskCenterY;
                if (f2 == null) {
                    f2 = maskParamLJJLIIIJJI.maskCenterY;
                }
                Float f3 = maskParam.maskRotate;
                if (f3 == null) {
                    f3 = maskParamLJJLIIIJJI.maskRotate;
                }
                Float f4 = maskParam.maskFeather;
                if (f4 == null) {
                    f4 = maskParamLJJLIIIJJI.maskFeather;
                }
                interfaceC351350Dq1LLFII2.LJIIL(nLETrackSlot, MaskParam.LIZ(maskParamLJJLIIIJJI, f, f2, f3, null, null, f4, null, null, 15331));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0EN9] */
    public final void m6(final C0EN8 c0en8, int i) {
        String second;
        boolean z;
        String str;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        boolean z2;
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            final long jLLLLLLJ = C351220Dpo.LLLLLLJ(c0e48F4.getPlayer().Jh());
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null) {
                player.pause(false);
            }
            if (Intrinsics.LJFF(this.LLJLILLLLZIIL, c0en8.LIZ) && c0en8.LJII != EnumC1641380soa.FAILED) {
                return;
            }
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            C0E48 c0e48F43 = F4();
            boolean z3 = true;
            if (videoPublishEditModelLJJJLIIL != null) {
                if (c0e48F43 != null && (nLETrackSlotLLLLLLIL = c0e48F43.LLLLLLIL()) != null) {
                    NLETrack trackBySlot = C350870DpF.LJI(c0e48F43).getTrackBySlot(nLETrackSlotLLLLLLIL);
                    if (trackBySlot != null && trackBySlot.getMainTrack()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = !z2;
                } else {
                    z = false;
                }
                String str2 = "1";
                if (videoPublishEditModelLJJJLIIL.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F43, new Pair(-1, -1));
                if (!z) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c0labLJFF.LJ("is_from_pip", str2);
                c0labLJFF.LJ("is_from_create_template", str);
                if (!Intrinsics.LJFF(c0en8.LIZ, "none")) {
                    c0labLJFF.LJ("mask_type", c0en8.LIZ);
                    C20684815ws.LJIILLIIL("click_mask_option", c0labLJFF.LIZ);
                } else {
                    C20684815ws.LJIILLIIL("click_mask_none", c0labLJFF.LIZ);
                }
            }
            String str3 = c0en8.LIZ;
            this.LLJLILLLLZIIL = str3;
            if (Intrinsics.LJFF(str3, "none")) {
                InterfaceC360800ECo interfaceC360800ECoM5 = M5();
                if (R5().Ah(jLLLLLLJ) == null) {
                    z3 = false;
                }
                interfaceC360800ECoM5.zB(false, z3);
                L6(this, c0en8.LIZ, Boolean.TRUE, null, null, null, null);
                E5(c0en8.LIZ);
                return;
            }
            C0ENA c0enaU5 = U5();
            final String str4 = c0en8.LIZLLL;
            final ?? r6 = new C0ENE() { // from class: X.0EN9
                @Override // X.C0ENE
                public final void LIZIZ() {
                    C0EN7.L6(this.LIZ, c0en8.LIZ, null, EnumC1641380soa.FAILED, null, null, null);
                }

                @Override // X.C0ENE
                public final void onProgress(int i2) {
                    C0EN7.L6(this.LIZ, c0en8.LIZ, null, EnumC1641380soa.START, Integer.valueOf(i2), null, null);
                }

                @Override // X.C0ENE
                public final void LIZ(String str5, String str6) {
                    boolean z4;
                    InterfaceC360800ECo interfaceC360800ECoM52 = this.LIZ.M5();
                    if (this.LIZ.R5().Ah(jLLLLLLJ) != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    interfaceC360800ECoM52.zB(true, z4);
                    String str7 = c0en8.LIZ;
                    C0EN7.L6(this.LIZ, str7, Boolean.valueOf(Intrinsics.LJFF(this.LIZ.LLJLILLLLZIIL, str7)), EnumC1641380soa.SUCCESS, null, str5, str6);
                    if (Intrinsics.LJFF(this.LIZ.LLJLILLLLZIIL, c0en8.LIZ)) {
                        this.LIZ.E5(c0en8.LIZ);
                    }
                }
            };
            c0enaU5.getClass();
            C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
            final InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
            Pair<String, String> pairLIZJ = C0FGD.LIZJ(str4);
            if (pairLIZJ != null) {
                second = pairLIZJ.getSecond();
            } else {
                second = null;
            }
            if (interfaceC360730ECh != null && second != null) {
                Effect effectLJ = C365460EUm.LJ(second);
                if (effectLJ != null && interfaceC360730ECh.LIZ(effectLJ.getEffect_id())) {
                    r6.LIZ(effectLJ.getUnzipPath(), effectLJ.getSdkExtra());
                    return;
                }
                final C365600EVa c365600EVa = new C365600EVa();
                c365600EVa.LIZ(new AwS584S0100000_5((C0EN9) r6, 875), c0enaU5.LIZ);
                interfaceC360730ECh.LJIIJ(C1697810uHb.LJ(second), "editor_pro_mask", false, new IFetchEffectListListener() { // from class: X.0ENC
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        Exception exception;
                        c365600EVa.LIZIZ();
                        C0ENE c0ene = r6;
                        if (c0ene != null) {
                            if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
                                exception.getMessage();
                            }
                            c0ene.LIZIZ();
                        }
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list) {
                        final Effect effect;
                        List<Effect> list2 = list;
                        c365600EVa.LIZIZ();
                        C0ENE c0ene = r6;
                        if (c0ene != null) {
                            c0ene.onProgress(100);
                        }
                        if (list2 != null && (effect = (Effect) C13LP.LJJJLL(list2)) != null) {
                            if (interfaceC360730ECh.LIZ(effect.getEffect_id())) {
                                C0ENE c0ene2 = r6;
                                if (c0ene2 != null) {
                                    c0ene2.LIZ(effect.getUnzipPath(), effect.getSdkExtra());
                                    return;
                                }
                                return;
                            }
                            InterfaceC360730ECh interfaceC360730ECh2 = interfaceC360730ECh;
                            String effect_id = effect.getEffect_id();
                            final C0ENE c0ene3 = r6;
                            final String str5 = str4;
                            interfaceC360730ECh2.LIZJ(new InterfaceC365420EUi(str5, effect) { // from class: X.0END
                                public final /* synthetic */ Effect LIZIZ;

                                @Override // X.InterfaceC365420EUi
                                public final void onProgress(int i2) {
                                }

                                @Override // X.InterfaceC365420EUi
                                public final void LIZ(String str6, C0EDV c0edv) {
                                    C0ENE c0ene4 = this.LIZ;
                                    if (c0ene4 != null) {
                                        Exception exc = c0edv.LIZ;
                                        if (exc != null) {
                                            exc.getMessage();
                                        }
                                        c0ene4.LIZIZ();
                                    }
                                }

                                @Override // X.InterfaceC365420EUi
                                public final void LJJI(String str6, String str7) {
                                    C0ENE c0ene4 = this.LIZ;
                                    if (c0ene4 != null) {
                                        c0ene4.LIZ(str7, this.LIZIZ.getSdkExtra());
                                    }
                                }

                                {
                                    this.LIZIZ = effect;
                                }
                            }, effect_id);
                            return;
                        }
                        C0ENE c0ene4 = r6;
                        if (c0ene4 == null) {
                            return;
                        }
                        c0ene4.LIZIZ();
                    }
                });
                return;
            }
            r6.LIZIZ();
        }
    }

    public C0EN7(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(202));
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), C0ENB.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
    }

    public static final void L6(C0EN7 c0en7, String str, Boolean bool, EnumC1641380soa enumC1641380soa, Integer num, String str2, String str3) {
        boolean z;
        C0EN8 c0en8LIZ;
        boolean zBooleanValue;
        EnumC1641380soa enumC1641380soa2;
        int iIntValue;
        String str4;
        String str5;
        List<C0EN8> list = c0en7.T2().LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0EN8 c0en8 : list) {
            if (Intrinsics.LJFF(c0en8.LIZ, str)) {
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = c0en8.LJ;
                }
                if (enumC1641380soa == null) {
                    enumC1641380soa2 = c0en8.LJII;
                } else {
                    enumC1641380soa2 = enumC1641380soa;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = c0en8.LJIIIIZZ;
                }
                if (str2 == null) {
                    str4 = c0en8.LJFF;
                } else {
                    str4 = str2;
                }
                if (str3 == null) {
                    str5 = c0en8.LJI;
                } else {
                    str5 = str3;
                }
                c0en8LIZ = C0EN8.LIZ(c0en8, zBooleanValue, str4, str5, enumC1641380soa2, iIntValue, 15);
            } else {
                if (bool != null) {
                    z = false;
                } else {
                    z = c0en8.LJ;
                }
                c0en8LIZ = C0EN8.LIZ(c0en8, z, null, null, null, 0, 495);
            }
            arrayList.add(c0en8LIZ);
        }
        c0en7.i3(new AwS584S0100000_5(C13LP.LLIIII(arrayList), (List<Pair<Long, Float>>) 650));
    }
}
