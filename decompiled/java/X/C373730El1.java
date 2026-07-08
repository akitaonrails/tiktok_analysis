package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.core.editor.ColorPickerInfo;
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
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0El1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373730El1 extends C0ETZ<InterfaceC373920ElK, C374370Em3, C374000ElS, C374240Elq> implements InterfaceC373920ElK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final int LLLF;
    public final C19A3 LLJJI;
    public final Activity LLJJIII;
    public final C1DRG LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final List<ResourceItem> LLJJJJJIL;
    public NLETrackSlot LLJJJJLIIL;
    public NLETrackSlot LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public NLESegmentChromaChannel LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final h0<EnumC373860ElE> LLJLL;
    public final C385670FAf<EnumC373860ElE> LLJLLIL;
    public final h0<EnumC373900ElI> LLJLLL;
    public final C385670FAf<EnumC373900ElI> LLJZ;
    public final C385670FAf<Boolean> LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373730El1.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373730El1.class, "cutoutToolBarApi", "getCutoutToolBarApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/toolbar/CutoutToolBarNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373730El1.class, "cutoutPreviewApi", "getCutoutPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/preview/CutoutPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373730El1.class, "cutoutCanvasApi", "getCutoutCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/canvas/ICutoutCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C373730El1.class, "chromaKeyApi", "getChromaKeyApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/chromakey/ChromaKeyApi;", 0);
        c09r3.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLLF = 8;
    }

    private final float M5(int i) {
        return (i * 0.0019191919f) + 0.008080808f;
    }

    private final void C5() {
        EnumC373830ElB enumC373830ElB = EnumC373830ElB.QUICK_BRUSH;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_quick_brush;
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJ = numValueOf;
        C373800El8 c373800El8 = new C373800El8(enumC373830ElB, c419910GdJ, null, 2131821211, false, false, true, 36);
        EnumC373830ElB enumC373830ElB2 = EnumC373830ElB.BRUSH;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_brush;
        c419910GdJ2.LJ = numValueOf;
        C373800El8 c373800El82 = new C373800El8(enumC373830ElB2, c419910GdJ2, null, 2131821202, false, false, true, 36);
        EnumC373830ElB enumC373830ElB3 = EnumC373830ElB.ERASER;
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_eraser_fill;
        c419910GdJ3.LJ = numValueOf;
        i3(new AwS584S0100000_5(C1697810uHb.LJIILJJIL(c373800El8, c373800El82, new C373800El8(enumC373830ElB3, c419910GdJ3, null, R.string.effect_tool_create_draw_eraser, false, false, true, 36)), (List<Pair<Long, Float>>) 427));
    }

    private final void D5() {
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
        if (interfaceC360730ECh == null) {
            return;
        }
        this.LLJLLL.LJII(EnumC373900ElI.LOADING);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C373750El3(this, interfaceC360730ECh, null), 3);
    }

    private final InterfaceC373120Ek2 T4() {
        return (InterfaceC373120Ek2) this.LLJJJJ.getValue(this, LLL[4]);
    }

    private final InterfaceC374660EmW d5() {
        return (InterfaceC374660EmW) this.LLJJJIL.getValue(this, LLL[3]);
    }

    private final C1361400lX0 t5() {
        return (C1361400lX0) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC373920ElK
    public ResourceItem Ba1() {
        ResourceItem next;
        Iterator<ResourceItem> it2 = this.LLJJJJJIL.iterator();
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
        return !this.LLJJJJJIL.isEmpty();
    }

    public final InterfaceC373870ElF k5() {
        return (InterfaceC373870ElF) this.LLJJJ.getValue(this, LLL[2]);
    }

    public final InterfaceC374220Elo n5() {
        return (InterfaceC374220Elo) this.LLJJIJIL.getValue(this, LLL[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374000ElS> o2() {
        return AFwS191S0000000_5.get$arr$(155);
    }

    @Override // X.InterfaceC373920ElK
    public String tB0() {
        ResourceItem next;
        Iterator<ResourceItem> it2 = this.LLJJJJJIL.iterator();
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

    public final C357270DzZ v5() {
        return (C357270DzZ) this.LLJJIJIIJIL.getValue(this, LLL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374240Elq> w2() {
        return new AwS549S0100000_5(this, 522);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void O4() {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373730El1.O4():void");
    }

    @Override // X.InterfaceC373920ElK, X.InterfaceC373170Ek7
    public void LIZ() {
        C357270DzZ c357270DzZV5 = v5();
        if (c357270DzZV5 != null) {
            c357270DzZV5.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(213));
        C357270DzZ c357270DzZV52 = v5();
        NLETrackSlot nLETrackSlotLJIIJJI = c357270DzZV52 != null ? c357270DzZV52.LJIIJJI() : null;
        if (nLETrackSlotLJIIJJI == null || !C351220Dpo.LLIZLLLIL(nLETrackSlotLJIIJJI)) {
            this.LLJLIL = null;
        } else {
            InterfaceC373120Ek2 interfaceC373120Ek2T4 = T4();
            if (interfaceC373120Ek2T4 != null) {
                interfaceC373120Ek2T4.L22(false, EnumC356070Dxd.DONE, new AwS584S0100000_5(this, 429));
            }
        }
        show();
        if (DG0()) {
            Ml2(EnumC373860ElE.QUICK_BRUSH);
            InterfaceC373870ElF interfaceC373870ElFK5 = k5();
            if (interfaceC373870ElFK5 != null) {
                interfaceC373870ElFK5.OJ0(EnumC374420Em8.NORMAL, false);
            }
        }
    }

    @Override // X.InterfaceC373920ElK
    public void LIZLLL() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLESegmentChromaChannel nLESegmentChromaChannel;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C357270DzZ c357270DzZV5 = v5();
        if (c357270DzZV5 != null && (nLETrackSlotLJIIJJI = c357270DzZV5.LJIIJJI()) != null && !C351220Dpo.LJZL(nLETrackSlotLJIIJJI) && (nLESegmentChromaChannel = this.LLJLIL) != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            C357270DzZ c357270DzZV52 = v5();
            NLETrackSlot nLETrackSlotLJIIJJI2 = c357270DzZV52 != null ? c357270DzZV52.LJIIJJI() : null;
            long color = nLESegmentChromaChannel.getColor();
            float intensity = nLESegmentChromaChannel.getIntensity();
            float shadow = nLESegmentChromaChannel.getShadow();
            NLEResourceNode effectSDKChroma = nLESegmentChromaChannel.getEffectSDKChroma();
            String resourceFile = effectSDKChroma != null ? effectSDKChroma.getResourceFile() : null;
            NLEResourceNode effectSDKChroma2 = nLESegmentChromaChannel.getEffectSDKChroma();
            String resourceId = effectSDKChroma2 != null ? effectSDKChroma2.getResourceId() : null;
            String extra = nLESegmentChromaChannel.getExtra("extra_color_picker_info");
            interfaceC351350Dq1LLFII.LJLLL(nLETrackSlotLJIIJJI2, color, intensity, shadow, resourceId, resourceFile, extra != null ? (ColorPickerInfo) C051R.LIZ(extra, ColorPickerInfo.class) : null, EnumC356070Dxd.COMMIT);
        }
        C357270DzZ c357270DzZV53 = v5();
        if (c357270DzZV53 != null) {
            c357270DzZV53.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(211));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C5();
        D5();
        Z1(new C2217381BqS() { // from class: X.0Elp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C374000ElS) obj).LIZIZ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 428));
    }

    @Override // X.InterfaceC373920ElK
    public NLETrackSlot Ky() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC373920ElK
    public C385670FAf<EnumC373900ElI> OE0() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC373920ElK
    public void Wm0() {
        D5();
    }

    @Override // X.InterfaceC373920ElK
    public C385670FAf<EnumC373860ElE> c31() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC373920ElK
    public NLETrackSlot cI0() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC373920ElK, X.InterfaceC373170Ek7
    public C385670FAf<Boolean> getVisible() {
        return this.LLJZIJLIL;
    }

    private final void E5(EnumC373860ElE enumC373860ElE) {
        C0EI5 c0ei5;
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        int i = C373850ElD.LIZIZ[enumC373860ElE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c0ei5 = C0EI5.AUTO_CUTOUT;
                } else {
                    c0ei5 = C0EI5.BRUSH;
                }
            } else {
                c0ei5 = C0EI5.ERASER;
            }
        } else {
            c0ei5 = C0EI5.QUICK_BRUSH;
        }
        C357270DzZ c357270DzZV5 = v5();
        if (c357270DzZV5 != null) {
            z = c357270DzZV5.LLJJJJLIIL;
        } else {
            z = false;
        }
        C357270DzZ c357270DzZV52 = v5();
        if (c357270DzZV52 != null) {
            videoPublishEditModelLJIIJ = c357270DzZV52.LJIIJ();
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

    private final void H4(EnumC356150Dxl enumC356150Dxl) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        boolean z;
        String strJ4;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEAIMatting aIMatting;
        NLESegmentAIMatting segment;
        C357270DzZ c357270DzZV5 = v5();
        if (c357270DzZV5 != null && (nLETrackSlotLJIIJJI = c357270DzZV5.LJIIJJI()) != null) {
            if (nLETrackSlotLJIIJJI.getAIMatting() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (aIMatting = nLETrackSlotLJIIJJI.getAIMatting()) != null && (segment = aIMatting.getSegment()) != null) {
                segment.setBlendMode(NLEMattingBlendMode.NLEMattingBlendModePreview);
                segment.setBlendColor(Z4(R.attr.a06));
                C0E48 c0e48F42 = F4();
                if (c0e48F42 != null) {
                    C350870DpF.LIZ(c0e48F42, false);
                }
            }
            O4();
            long jZ4 = Z4(R.attr.a0_);
            long jZ42 = Z4(R.attr.a06);
            if (enumC356150Dxl == EnumC356150Dxl.ERASER) {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(jZ4 & 4294967295L)}, 1));
            } else {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(jZ42 & 4294967295L)}, 1));
            }
            NLETrackSlot nLETrackSlot = this.LLJJJJLIIL;
            if (nLETrackSlot != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LLILII(nLETrackSlot, strJ4, enumC356150Dxl, EnumC356070Dxd.COMMIT);
            }
            K4(T2().LIZJ.getFirst().intValue());
        }
    }

    private final int Z4(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, t5());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    public final void K4(int i) {
        NLETrackSlot nLETrackSlot;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlot2 = this.LLJJJJLIIL;
        if (nLETrackSlot2 != null && (nLETrackSlot = this.LLJJL) != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJFF(nLETrackSlot2, nLETrackSlot, M5(i), EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.InterfaceC373920ElK
    public void Ml2(EnumC373860ElE enumC373860ElE) {
        boolean z;
        EnumC356150Dxl enumC356150Dxl;
        if (this.LLJJJJJIL.isEmpty()) {
            return;
        }
        EnumC373830ElB enumC373830ElB = null;
        if (enumC373860ElE != EnumC373860ElE.NULL) {
            int i = C373850ElD.LIZIZ[enumC373860ElE.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    enumC356150Dxl = EnumC356150Dxl.NORMAL;
                } else {
                    enumC356150Dxl = EnumC356150Dxl.ERASER;
                }
            } else {
                enumC356150Dxl = EnumC356150Dxl.QUICK;
            }
            Iterator<ResourceItem> it2 = this.LLJJJJJIL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ResourceItem next = it2.next();
                if (C373880ElG.LJ(next)) {
                    if (next != null) {
                        H4(enumC356150Dxl);
                    }
                }
            }
        }
        int i2 = C373850ElD.LIZIZ[enumC373860ElE.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    enumC373830ElB = EnumC373830ElB.BRUSH;
                }
            } else {
                enumC373830ElB = EnumC373830ElB.ERASER;
            }
        } else {
            enumC373830ElB = EnumC373830ElB.QUICK_BRUSH;
        }
        List<C373800El8> list = T2().LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C373800El8 c373800El8 : list) {
            if (c373800El8.LIZ == enumC373830ElB) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(C373800El8.LIZ(c373800El8, z, false, 111));
        }
        i3(new AwS214S0300000_5(enumC373860ElE, (EnumC373860ElE) this, (C373730El1) arrayList, (List<C373800El8>) 8));
    }

    public final void N5(int i) {
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E55 player;
        C0E48 c0e48F42;
        C0E55 player2;
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null && player.isPlaying() && (c0e48F42 = F4()) != null && (player2 = c0e48F42.getPlayer()) != null) {
            player2.pause(false);
        }
        NLETrackSlot nLETrackSlot = this.LLJJL;
        if (nLETrackSlot != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJIIIZ(nLETrackSlot, M5(i));
        }
    }

    public final void H5(InterfaceC360730ECh interfaceC360730ECh, C354690DvP c354690DvP) {
        InterfaceC1635390sev.LJJLIIIIJ.getClass();
        interfaceC360730ECh.LIZLLL(2, "editor_pro_cutout", "", new AwS371S0200000_5(c354690DvP, this, 87));
    }

    public final void R5(int i, boolean z) {
        Activity activity;
        InterfaceC374660EmW interfaceC374660EmWD5 = d5();
        if ((interfaceC374660EmWD5 == null || !interfaceC374660EmWD5.Cp1()) && (activity = this.LLJJI.mActivity) != null) {
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

    public final void x5(C373800El8 c373800El8, int i) {
        EnumC373860ElE enumC373860ElE;
        int i2 = C373850ElD.LIZ[c373800El8.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    enumC373860ElE = EnumC373860ElE.NULL;
                } else {
                    enumC373860ElE = EnumC373860ElE.ERASER;
                }
            } else {
                enumC373860ElE = EnumC373860ElE.NORMAL_BRUSH;
            }
        } else {
            enumC373860ElE = EnumC373860ElE.QUICK_BRUSH;
        }
        Ml2(enumC373860ElE);
        if (enumC373860ElE != EnumC373860ElE.NULL) {
            E5(enumC373860ElE);
            InterfaceC373870ElF interfaceC373870ElFK5 = k5();
            if (interfaceC373870ElFK5 != null) {
                interfaceC373870ElFK5.OJ0(EnumC374420Em8.NORMAL, false);
            }
        }
    }

    public C373730El1(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = activity;
        this.LLJJIJI = c1drg;
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC374220Elo.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373870ElF.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374660EmW.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373120Ek2.class, null);
        this.LLJJJJJIL = new ArrayList();
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 521));
        h0<EnumC373860ElE> h0Var = new h0<>(EnumC373860ElE.NULL);
        this.LLJLL = h0Var;
        this.LLJLLIL = h0Var;
        h0<EnumC373900ElI> h0Var2 = new h0<>(EnumC373900ElI.NONE);
        this.LLJLLL = h0Var2;
        this.LLJZ = h0Var2;
        this.LLJZIJLIL = Z1(new C2217381BqS() { // from class: X.0ElX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374000ElS) obj).LIZ);
            }
        });
    }

    public final Object P4(ResourceItem resourceItem, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C353210Dt1(resourceItem, str, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
