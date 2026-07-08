package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.INLEBrushRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.ugc.android.editor.core.editor.ColorPickerInfo;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS24S0000100_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS42S0100100_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0ElM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373940ElM extends C0ETZ<InterfaceC373870ElF, C374400Em6, C374140Elg, C374300Elw> implements InterfaceC373870ElF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC332260D0u<Boolean> LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final Boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final InterfaceC354120DuU LLJLLL;
    public C374400Em6 LLJZ;
    public final C373960ElO LLJZIJLIL;
    public final C385670FAf<Size> LLL;
    public final C373950ElN LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373940ElM.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373940ElM.class, "consoleApi", "getConsoleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutPanelConsoleBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373940ElM.class, "cutoutBrushApi", "getCutoutBrushApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/panel/CutoutBrushApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373940ElM.class, "cutoutStrokeApi", "getCutoutStrokeApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C373940ElM.class, "chromaKeyApi", "getChromaKeyApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/chromakey/ChromaKeyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C373940ElM.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLLFFI = 8;
    }

    @Override // X.InterfaceC373870ElF
    public void Bp() {
        RelativeLayout relativeLayout;
        int[] iArr = new int[2];
        SurfaceView surfaceViewKO0 = kO0();
        if (surfaceViewKO0 != null) {
            surfaceViewKO0.getLocationOnScreen(iArr);
        }
        int[] iArr2 = new int[2];
        C374400Em6 c374400Em6 = this.LLJZ;
        if (c374400Em6 != null && (relativeLayout = c374400Em6.LLJJL) != null) {
            relativeLayout.getLocationOnScreen(iArr2);
        }
        Integer numLJJIIJ = C13LQ.LJJIIJ(0, iArr);
        int iIntValue = numLJJIIJ != null ? numLJJIIJ.intValue() : 0;
        Integer numLJJIIJ2 = C13LQ.LJJIIJ(0, iArr2);
        int iIntValue2 = iIntValue - (numLJJIIJ2 != null ? numLJJIIJ2.intValue() : 0);
        if (iIntValue2 >= 0) {
            boolean z = iIntValue2 > 0;
            if (0 == 0) {
                if (z) {
                    O4(EnumC373980ElQ.LEFT);
                    return;
                }
                return;
            }
        }
        O4(EnumC373980ElQ.RIGHT);
    }

    @Override // X.InterfaceC373870ElF
    public void fy() {
        this.LLJLL = true;
    }

    private final InterfaceC373120Ek2 Z4() {
        return (InterfaceC373120Ek2) this.LLJJJJ.getValue(this, LLLFF[4]);
    }

    private final C1361400lX0 x5() {
        return (C1361400lX0) this.LLJLLIL.getValue();
    }

    public final VideoPublishEditModel C5() {
        return (VideoPublishEditModel) this.LLJJJJJIL.getValue(this, LLLFF[5]);
    }

    public final C357270DzZ D5() {
        return (C357270DzZ) this.LLJJIJIIJIL.getValue(this, LLLFF[0]);
    }

    @Override // ge.i
    public Function0<C374400Em6> E3() {
        return new AwS549S0100000_5(this, 553);
    }

    public final Integer E5() {
        return (Integer) this.LLJL.getValue();
    }

    @Override // X.InterfaceC373870ElF
    public void Eo1() {
        N42(new AwS584S0100000_5(this, 462));
    }

    public final Integer H5() {
        return (Integer) this.LLJLIL.getValue();
    }

    public final int M5() {
        return ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
    }

    public final int N5() {
        return ((Number) this.LLJJL.getValue()).intValue();
    }

    public final String T4() {
        return (String) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC373870ElF
    public void XH1() {
        C374770Emh c374770Emh;
        C374400Em6 c374400Em6 = this.LLJZ;
        if (c374400Em6 == null || (c374770Emh = c374400Em6.LLJLLIL) == null) {
            return;
        }
        c374770Emh.LLJ = 0L;
        c374770Emh.setRingColor(0L);
        c374770Emh.LIZJ();
    }

    public final InterfaceC374290Elv k5() {
        return (InterfaceC374290Elv) this.LLJJIJIL.getValue(this, LLLFF[1]);
    }

    @Override // X.InterfaceC373870ElF
    public SurfaceView kO0() {
        C374400Em6 c374400Em6 = this.LLJZ;
        if (c374400Em6 != null) {
            return c374400Em6.LLJJJJLIIL;
        }
        return null;
    }

    public final InterfaceC373920ElK n5() {
        return (InterfaceC373920ElK) this.LLJJJ.getValue(this, LLLFF[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374140Elg> o2() {
        return AFwS191S0000000_5.get$arr$(158);
    }

    @Override // X.InterfaceC373870ElF
    public void p52() {
        C0E0S.LIZ.getClass();
        C0E0S.LIZJ();
        C0E0S.LIZJ = null;
        K4();
        if (OF2().getValue().booleanValue()) {
            C354270Duj.LIZ(100L, new AwS549S0100000_5(this, 546));
        }
    }

    public final InterfaceC373560Ekk t5() {
        return (InterfaceC373560Ekk) this.LLJJJIL.getValue(this, LLLFF[3]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C374300Elw> w2() {
        return new AwS549S0100000_5(this, 552);
    }

    @Override // X.InterfaceC373870ElF
    public void x10() {
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        C354090DuR.LJIILJJIL(this.LLJLLL);
    }

    private final void K4() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C0E48 c0e48;
        L1(2131830451);
        InterfaceC373180Ek8 interfaceC373180Ek8V5 = v5();
        if (interfaceC373180Ek8V5 != null) {
            interfaceC373180Ek8V5.B0(false);
        }
        C357270DzZ c357270DzZD5 = D5();
        if (c357270DzZD5 == null || (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) == null) {
            return;
        }
        if (nLETrackSlotLJIIJJI.getAIMatting() == null) {
            InterfaceC373560Ekk interfaceC373560EkkT5 = t5();
            if (interfaceC373560EkkT5 != null) {
                interfaceC373560EkkT5.V4(false);
                return;
            }
            return;
        }
        C357270DzZ c357270DzZD52 = D5();
        if (c357270DzZD52 != null) {
            if (c357270DzZD52.LJIIIIZZ()) {
                C357270DzZ c357270DzZD53 = D5();
                if (c357270DzZD53 != null) {
                    c357270DzZD53.LJIIZILJ();
                }
                InterfaceC373180Ek8 interfaceC373180Ek8V52 = v5();
                if (interfaceC373180Ek8V52 != null) {
                    interfaceC373180Ek8V52.LLJI();
                }
                InterfaceC373560Ekk interfaceC373560EkkT52 = t5();
                if (interfaceC373560EkkT52 != null) {
                    interfaceC373560EkkT52.LLJI();
                }
            }
            InterfaceC374290Elv interfaceC374290ElvK5 = k5();
            if (interfaceC374290ElvK5 != null) {
                interfaceC374290ElvK5.nZ1(EnumC373450EkZ.UNDO, c357270DzZD52.LJIIIIZZ());
            }
        }
        C357270DzZ c357270DzZD54 = D5();
        if (c357270DzZD54 == null || (c0e48 = c357270DzZD54.LLILLJJLI) == null) {
            return;
        }
        C354270Duj.LIZ(10L, new AwS406S0200000_5(this, c0e48, 53));
    }

    private final boolean K6() {
        C357270DzZ c357270DzZD5;
        NLETrackSlot nLETrackSlotLJIIJJI;
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_cutout_chromakey", true, false) || !((c357270DzZD5 = D5()) == null || (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) == null || !C351220Dpo.LLIZLLLIL(nLETrackSlotLJIIJJI));
    }

    private final InterfaceC373180Ek8 v5() {
        return C373700Eky.LIZ(getDiContainer());
    }

    @Override // X.InterfaceC373870ElF
    public long A81() {
        return T2().LJFF;
    }

    public final void P4() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C0E48 c0e48;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e482;
        C357270DzZ c357270DzZD5 = D5();
        if (c357270DzZD5 == null || (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) == null) {
            return;
        }
        if ((c357270DzZD5.LJIIIIZZ() || (c0e482 = c357270DzZD5.LLILLJJLI) == null || !c0e482.Bo().LJFF()) && nLETrackSlotLJIIJJI.getAIMatting() != null) {
            return;
        }
        int iSwigValue = NLEAIMattingType.TYPE_CUSTOM.swigValue();
        C357270DzZ c357270DzZD52 = D5();
        if (c357270DzZD52 == null || (c0e48 = c357270DzZD52.LLILLJJLI) == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null) {
            return;
        }
        interfaceC351350Dq1LLFII.LJJZZI(nLETrackSlotLJIIJJI, iSwigValue, "");
    }

    public final void S5() {
        C0EI5 c0ei5LJIIIZ;
        NLETrackSlot nLETrackSlotLJIIJJI;
        C357270DzZ c357270DzZD5 = D5();
        Boolean boolValueOf = (c357270DzZD5 == null || (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) == null) ? null : Boolean.valueOf(C351220Dpo.LJLZ(nLETrackSlotLJIIJJI));
        C357270DzZ c357270DzZD52 = D5();
        boolean z = c357270DzZD52 != null ? c357270DzZD52.LLJJJJLIIL : false;
        C357270DzZ c357270DzZD53 = D5();
        VideoPublishEditModel videoPublishEditModelLJIIJ = c357270DzZD53 != null ? c357270DzZD53.LJIIJ() : null;
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C0EI4 c0ei4 = C0EI4.LIZ;
            C0EI5 c0ei5 = C0EI5.AUTO_CUTOUT;
            c0ei4.getClass();
            C0EI4.LJIIL(videoPublishEditModelLJIIJ, c0ei5, z);
            return;
        }
        C357270DzZ c357270DzZD54 = D5();
        if (c357270DzZD54 == null || (c0ei5LJIIIZ = c357270DzZD54.LJIIIZ()) == null) {
            return;
        }
        C0EI4.LIZ.getClass();
        C0EI4.LJIIL(videoPublishEditModelLJIIJ, c0ei5LJIIIZ, z);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C0E48 c0e48F4;
        InterfaceC361710EGb interfaceC361710EGbLJIIL;
        super.onCreate();
        C357270DzZ c357270DzZD5 = D5();
        if (c357270DzZD5 != null && (interfaceC361710EGbLJIIL = c357270DzZD5.LJIIL()) != null) {
            interfaceC361710EGbLJIIL.V52(this.LLLF);
        }
        if (!K6() || (c0e48F4 = F4()) == null) {
            return;
        }
        c0e48F4.fj(this.LLJZIJLIL);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC361710EGb interfaceC361710EGbLJIIL;
        super.onDestroy();
        C357270DzZ c357270DzZD5 = D5();
        if (c357270DzZD5 != null && (interfaceC361710EGbLJIIL = c357270DzZD5.LJIIL()) != null) {
            interfaceC361710EGbLJIIL.sc0(this.LLLF);
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            c0e48F4.Ej(this.LLJZIJLIL);
        }
    }

    @Override // X.InterfaceC373870ElF
    public C05YD<Boolean> OF2() {
        return this.LLJJIJI;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public final C19A3 getParentScene() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC373870ElF
    public C385670FAf<Size> getResourceSize() {
        return this.LLL;
    }

    private final void N42(Function1<? super Bitmap, Unit> function1) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        long timeClipStart;
        C0E55 player;
        C357270DzZ c357270DzZD5 = D5();
        if (c357270DzZD5 != null && (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) != null) {
            long jJh = 0;
            if (!C351220Dpo.LLJJIJIL(nLETrackSlotLJIIJJI)) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLJIIJJI.getMainSegment());
                if (nLESegmentVideoDynamicCast != null) {
                    timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                } else {
                    timeClipStart = 0;
                }
                C0E48 c0e48F4 = F4();
                if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
                    jJh = player.Jh();
                }
                jJh += timeClipStart / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            Size sizeH4 = T2().LIZIZ;
            if (sizeH4 == null && (sizeH4 = H4(T2().LIZ)) == null) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C371170Egt(nLETrackSlotLJIIJJI, jJh, sizeH4, this, function1, null), 2);
        }
    }

    private final void O4(EnumC373980ElQ enumC373980ElQ) {
        int width;
        int width2;
        int i;
        ConstraintLayout constraintLayout;
        View view;
        RelativeLayout relativeLayout;
        ConstraintLayout constraintLayout2;
        C19MB c19mb = new C19MB();
        C374400Em6 c374400Em6 = this.LLJZ;
        int width3 = 0;
        if (c374400Em6 != null && (constraintLayout2 = c374400Em6.LLJLL) != null) {
            width = constraintLayout2.getWidth();
        } else {
            width = 0;
        }
        C374400Em6 c374400Em62 = this.LLJZ;
        if (c374400Em62 != null && (relativeLayout = c374400Em62.LLJJL) != null) {
            width2 = relativeLayout.getWidth();
        } else {
            width2 = 0;
        }
        C374400Em6 c374400Em63 = this.LLJZ;
        if (c374400Em63 != null && (view = c374400Em63.LLJJJJJIL) != null) {
            width3 = view.getWidth();
        }
        if (enumC373980ElQ == EnumC373980ElQ.LEFT) {
            i = width - width2;
        } else {
            i = width + width2;
        }
        int i2 = (i - width3) / 2;
        C374400Em6 c374400Em64 = this.LLJZ;
        ConstraintLayout constraintLayout3 = null;
        if (c374400Em64 != null) {
            constraintLayout = c374400Em64.LLJLL;
        } else {
            constraintLayout = null;
        }
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(R.id.nvv, 3, R.id.tre, 3);
        c19mb.LJIIIZ(R.id.nvv, 6, R.id.tre, 6, i2);
        C374400Em6 c374400Em65 = this.LLJZ;
        if (c374400Em65 != null) {
            constraintLayout3 = c374400Em65.LLJLL;
        }
        c19mb.LIZIZ(constraintLayout3);
    }

    public final Size H4(Size size) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEResourceAV aVFile;
        C357270DzZ c357270DzZD5 = D5();
        if (c357270DzZD5 == null || (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) == null || size == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLJIIJJI.getMainSegment())) == null || (aVFile = nLESegmentVideoDynamicCast.getAVFile()) == null) {
            return null;
        }
        Size size2 = new Size((int) aVFile.getWidth(), (int) aVFile.getHeight());
        if (size2.getWidth() <= 0 || size2.getHeight() <= 0) {
            return null;
        }
        float fMin = Math.min(size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight());
        return new Size((int) (size2.getWidth() * fMin), (int) (size2.getHeight() * fMin));
    }

    public final void L1(int i) {
        Activity activity = this.LLJJI.mActivity;
        if (activity != null) {
            C15L2.LIZ(activity, activity.getString(i));
        }
    }

    @Override // X.InterfaceC373870ElF
    public void Or1(boolean z) {
        if (z) {
            show();
            return;
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            c0e48F4.Ej(this.LLJZIJLIL);
        }
        hide();
    }

    @Override // X.InterfaceC373870ElF
    public void QY1(boolean z) {
        C357270DzZ c357270DzZD5;
        NLETrackSlot nLETrackSlotLJIIJJI;
        C374770Emh c374770Emh;
        Long l;
        C374770Emh c374770Emh2;
        float fFloatValue;
        NLEChromaChannel nLEChromaChannel;
        NLESegmentChromaChannel segment;
        String extra;
        if (z) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (c357270DzZD5 = D5()) != null && (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) != null) {
                long jLJJIII = C351220Dpo.LJJIII(nLETrackSlotLJIIJJI);
                VecNLEChromaChannelSPtr chromaChannels = nLETrackSlotLJIIJJI.getChromaChannels();
                ColorPickerInfo colorPickerInfo = null;
                if (chromaChannels != null && (nLEChromaChannel = (NLEChromaChannel) C13LP.LJJJLL(chromaChannels)) != null && (segment = nLEChromaChannel.getSegment()) != null && (extra = segment.getExtra("extra_color_picker_info")) != null) {
                    colorPickerInfo = (ColorPickerInfo) C051R.LIZ(extra, ColorPickerInfo.class);
                }
                long micros = 0;
                if (!C351220Dpo.LLJJIJIL(nLETrackSlotLJIIJJI)) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLJIIJJI.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        micros = nLESegmentVideoDynamicCast.getTimeClipStart();
                    }
                    micros += TimeUnit.MILLISECONDS.toMicros(c0e48F4.getPlayer().Jh());
                }
                i3(new AwS24S0000100_5(jLJJIII, 2));
                if (colorPickerInfo != null && (l = colorPickerInfo.time) != null && l.longValue() == micros) {
                    C374400Em6 c374400Em6 = this.LLJZ;
                    if (c374400Em6 != null && (c374770Emh2 = c374400Em6.LLJLLIL) != null) {
                        Float f = colorPickerInfo.positionX;
                        float fFloatValue2 = 0.0f;
                        if (f != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        Float f2 = colorPickerInfo.positionY;
                        if (f2 != null) {
                            fFloatValue2 = f2.floatValue();
                        }
                        if (c374770Emh2.LL.getWidth() != 0 && c374770Emh2.LL.getHeight() != 0 && c374770Emh2.LLILLL.getWidth() != 0 && c374770Emh2.LLILLJJLI.getWidth() != 0) {
                            c374770Emh2.LIZIZ(c374770Emh2.LL.getX() + (c374770Emh2.LL.getWidth() / 2.0f) + fFloatValue, c374770Emh2.LL.getY() + (c374770Emh2.LL.getHeight() / 2.0f) + fFloatValue2);
                        }
                    }
                } else {
                    C374400Em6 c374400Em62 = this.LLJZ;
                    if (c374400Em62 != null && (c374770Emh = c374400Em62.LLJLLIL) != null) {
                        c374770Emh.LIZJ();
                    }
                }
                i3(AFwS234S0000000_5.get$arr$(229));
                N42(new AwS42S0100100_5(this, jLJJIII, 1));
                return;
            }
            return;
        }
        i3(AFwS234S0000000_5.get$arr$(230));
    }

    public final void R5(EnumC373350EkP enumC373350EkP) {
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        C0EI5 c0ei5LJIIIZ;
        if (C354090DuR.LJIIJ.LIZ.compareTo(EnumC356080Dxe.START) >= 0 || enumC373350EkP == EnumC373350EkP.INTERNET_ERROR || enumC373350EkP == EnumC373350EkP.CUTOUT_FAIL || enumC373350EkP == EnumC373350EkP.NO_OBJECT) {
            C357270DzZ c357270DzZD5 = D5();
            if (c357270DzZD5 != null) {
                z = c357270DzZD5.LLJJJJLIIL;
            } else {
                z = false;
            }
            C357270DzZ c357270DzZD52 = D5();
            if (c357270DzZD52 != null) {
                videoPublishEditModelLJIIJ = c357270DzZD52.LJIIJ();
            } else {
                videoPublishEditModelLJIIJ = null;
            }
            C357270DzZ c357270DzZD53 = D5();
            if (c357270DzZD53 != null && (c0ei5LJIIIZ = c357270DzZD53.LJIIIZ()) != null) {
                C0EI4.LIZ.getClass();
                C0EI4.LIZLLL(videoPublishEditModelLJIIJ, false, z, c0ei5LJIIIZ, enumC373350EkP);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U5(long r11) {
        /*
            r10 = this;
            X.0DzZ r0 = r10.D5()
            r2 = 0
            if (r0 == 0) goto L7b
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r0.LJIIJJI()
            if (r0 == 0) goto L7b
            boolean r0 = X.C351220Dpo.LJLZ(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L15:
            X.0DzZ r0 = r10.D5()
            if (r0 == 0) goto L79
            boolean r0 = r0.LLJJJJLIIL
            r5 = 1
            if (r0 != r5) goto L79
        L20:
            X.0DzZ r0 = r10.D5()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r0.LJIIJ()
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r6 = r11
            if (r0 == 0) goto L41
            X.0EI4 r0 = X.C0EI4.LIZ
            r4 = 0
            X.0EI5 r8 = X.C0EI5.AUTO_CUTOUT
            java.lang.String r9 = ""
            r0.getClass()
            X.C0EI4.LIZJ(r3, r4, r5, r6, r8, r9)
        L40:
            return
        L41:
            X.0DzZ r0 = r10.D5()
            if (r0 == 0) goto L40
            X.0EI5 r8 = r0.LJIIIZ()
            if (r8 == 0) goto L40
            X.0DzZ r0 = r10.D5()
            if (r0 == 0) goto L61
            X.0E48 r0 = r0.LLILLJJLI
            if (r0 == 0) goto L61
            X.0Dq1 r0 = r0.LLFII()
            if (r0 == 0) goto L61
            kotlin.Pair r2 = r0.LJJII()
        L61:
            X.0EI4 r0 = X.C0EI4.LIZ
            r4 = 0
            if (r2 == 0) goto L6e
            java.lang.Object r9 = r2.getFirst()
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L70
        L6e:
            java.lang.String r9 = ""
        L70:
            r0.getClass()
            X.C0EI4.LIZJ(r3, r4, r5, r6, r8, r9)
            return
        L77:
            r3 = r2
            goto L2a
        L79:
            r5 = 0
            goto L20
        L7b:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373940ElM.U5(long):void");
    }

    public final int d5(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, x5());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC373870ElF
    public void e71(Float f) {
        if (f != null && !Intrinsics.LIZLLL(f, 1.0f)) {
            this.LLJJIJI.setValue(Boolean.TRUE);
        } else {
            this.LLJJIJI.setValue(Boolean.FALSE);
        }
        i3(new AwS584S0100000_5(f, 464));
    }

    @Override // X.InterfaceC373870ElF
    public void hx1(boolean z) {
        i3(new AwS20S0010000_5(z, 22));
    }

    @Override // X.InterfaceC373870ElF
    public void jH1(Size size) {
        i3(new AwS371S0200000_5(size, this, 96));
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.0ElO] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0ElN] */
    public C373940ElM(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1BNE.LIZ(Boolean.FALSE);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374290Elv.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373920ElK.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373560Ekk.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373120Ek2.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJJLIIL = VEConfigCenter.getInstance().getValue("ve_optimize_custom_matting", false);
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 544));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 554));
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 550));
        this.LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 551));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 545));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 548));
        this.LLJLLL = new InterfaceC354120DuU() { // from class: X.0ElL
            /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC354120DuU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.String r11) {
                /*
                    Method dump skipped, instruction units count: 240
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C373930ElL.LIZIZ(java.lang.String):void");
            }

            @Override // X.InterfaceC354120DuU
            public final void LIZJ(String str) {
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mattingListener, onCancel ");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC354120DuU
            public final void LJIIJ(String str) {
                C201955140j.LIZLLL(C563650M8t.LIZIZ, "shiwei", "mattingListener, onStart");
                this.LIZ.S5();
            }

            @Override // X.InterfaceC354120DuU
            public final void LIZLLL(Float f, String str) {
                if (f != null) {
                    this.LIZ.e71(Float.valueOf((float) ((((double) f.floatValue()) * 0.9d) + 0.1d)));
                }
            }

            @Override // X.InterfaceC354120DuU
            public final void LIZ(String str, String str2, String str3) {
                Object c098200Yq;
                this.LIZ.d6(false, str2, str3);
                try {
                    c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Integer numValueOf = Integer.valueOf(C386801es.DEFAULT);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = numValueOf;
                }
                int iIntValue = ((Number) c098200Yq).intValue();
                if (iIntValue != -60004 && iIntValue != -60001 && iIntValue != -1) {
                    this.LIZ.R5(EnumC373350EkP.CUTOUT_FAIL);
                } else {
                    this.LIZ.R5(EnumC373350EkP.INTERNET_ERROR);
                }
                C13SS.LIZ.getClass();
                C13SS.LIZ("tangshuai", "onError taskId = " + str + ", ErrorCode = " + str2 + ", errorMsg = " + str3);
                C354270Duj.LIZJ(0L, new AwS549S0100000_5(this.LIZ, 549));
            }

            @Override // X.InterfaceC354120DuU
            public final void onSuccess(String str, String str2, boolean z) {
                this.LIZ.U5(C354090DuR.LJIIJ.LIZLLL);
                this.LIZ.d6(true, "-1", "");
                C354270Duj.LIZJ(0L, new C373970ElP(str2, z, this.LIZ));
            }
        };
        this.LLJZIJLIL = new NLEEditorListener() { // from class: X.0ElO
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                NLETrackSlot nLETrackSlotLJIIJJI;
                NLESegmentAIMatting segment;
                C357270DzZ c357270DzZD5 = this.LIZ.D5();
                if (c357270DzZD5 == null || (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) == null) {
                    return;
                }
                if (nLETrackSlotLJIIJJI.getAIMatting() == null) {
                    this.LIZ.u6(EnumC374420Em8.GONE, false);
                    return;
                }
                if (C351220Dpo.LJZL(nLETrackSlotLJIIJJI) && this.LIZ.T2().LIZJ == EnumC374420Em8.GONE) {
                    this.LIZ.u6(EnumC374420Em8.NORMAL, true);
                    return;
                }
                if (C351220Dpo.LJLZ(nLETrackSlotLJIIJJI) && this.LIZ.T2().LIZJ == EnumC374420Em8.GONE) {
                    this.LIZ.u6(EnumC374420Em8.SELECTED, true);
                    return;
                }
                NLEAIMatting aIMatting = nLETrackSlotLJIIJJI.getAIMatting();
                if (aIMatting == null || (segment = aIMatting.getSegment()) == null) {
                    return;
                }
                int blendColor = segment.getBlendColor();
                if (this.LIZ.T2().LIZJ == EnumC374420Em8.GONE) {
                    return;
                }
                if (blendColor == 0) {
                    this.LIZ.u6(EnumC374420Em8.SELECTED, false);
                } else {
                    this.LIZ.u6(EnumC374420Em8.NORMAL, false);
                }
            }
        };
        this.LLL = Z1(new C2217381BqS() { // from class: X.0Ell
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C374140Elg) obj).LIZIZ;
            }
        });
        this.LLLF = new AbstractC385780FAq() { // from class: X.0ElN
            public final int LL = Integer.MAX_VALUE;

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZIZ(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.AbstractC385780FAq
            public final int getPriority() {
                return this.LL;
            }

            /* JADX WARN: Type inference failed for: r0v104, types: [X.0Elu] */
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void onTouchEvent(MotionEvent motionEvent) {
                C385670FAf<Boolean> visible;
                int iIntValue;
                int iIntValue2;
                EnumC373860ElE enumC373860ElELIZJ;
                C357270DzZ c357270DzZD5;
                NLETrackSlot nLETrackSlotLJIIJJI;
                boolean z;
                C0E48 c0e48;
                Pair<Integer, Integer> canvasSize;
                EnumC373860ElE enumC373860ElELIZJ2;
                C0E55 player;
                C0E48 c0e48F4;
                C0E55 player2;
                C385670FAf<EnumC373860ElE> c385670FAfC31;
                C354790DvZ c354790DvZ;
                NLETrackSlot nLETrackSlotCI0;
                NLETrackSlot nLETrackSlotKy;
                C0E55 player3;
                INLEMediaSession iNLEMediaSessionF1;
                INLEPlayer playerApi;
                INLEMediaSession iNLEMediaSessionF12;
                INLEBrushRuntime brushApi;
                String uuid;
                NLETrackSlot nLETrackSlotCI02;
                NLETrackSlot nLETrackSlotCI03;
                NLETrackSlot nLETrackSlotCI04;
                InterfaceC373560Ekk interfaceC373560EkkT5;
                InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
                C385670FAf<EnumC373860ElE> c385670FAfC312;
                if (motionEvent.getPointerCount() >= 2) {
                    return;
                }
                InterfaceC373920ElK interfaceC373920ElKN5 = this.LLILLJJLI.n5();
                boolean z2 = false;
                if (interfaceC373920ElKN5 != null && (visible = interfaceC373920ElKN5.getVisible()) != null && Intrinsics.LJFF(visible.LIZJ(), Boolean.TRUE)) {
                    Integer numH5 = this.LLILLJJLI.H5();
                    if (numH5 != null) {
                        iIntValue = numH5.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer numE5 = this.LLILLJJLI.E5();
                    if (numE5 != null) {
                        iIntValue2 = numE5.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    float fN5 = this.LLILLJJLI.N5() / this.LLILLJJLI.M5();
                    InterfaceC373920ElK interfaceC373920ElKN52 = this.LLILLJJLI.n5();
                    String extra = null;
                    if (interfaceC373920ElKN52 != null && (c385670FAfC312 = interfaceC373920ElKN52.c31()) != null) {
                        enumC373860ElELIZJ = c385670FAfC312.LIZJ();
                    } else {
                        enumC373860ElELIZJ = null;
                    }
                    EnumC373860ElE enumC373860ElE = EnumC373860ElE.NULL;
                    if (enumC373860ElELIZJ != enumC373860ElE && (c357270DzZD5 = this.LLILLJJLI.D5()) != null && (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) != null) {
                        if (nLETrackSlotLJIIJJI.getAIMatting() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C357270DzZ c357270DzZD52 = this.LLILLJJLI.D5();
                        if (c357270DzZD52 != null && (c0e48 = c357270DzZD52.LLILLJJLI) != null && (canvasSize = c0e48.getCanvasSize()) != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("cutoutBrushListener, canvasSize.w: ");
                            sbLIZ.append(canvasSize.getFirst().intValue());
                            sbLIZ.append(", canvasSize.h: $");
                            sbLIZ.append(canvasSize.getSecond().intValue());
                            C355090Dw3.LIZIZ("TangshuaiK", C2188811AlT.LIZIZ(sbLIZ));
                            int action = motionEvent.getAction();
                            if (action == 0 || action == 2) {
                                InterfaceC373920ElK interfaceC373920ElKN53 = this.LLILLJJLI.n5();
                                if (interfaceC373920ElKN53 != null && (c385670FAfC31 = interfaceC373920ElKN53.c31()) != null) {
                                    enumC373860ElELIZJ2 = c385670FAfC31.LIZJ();
                                } else {
                                    enumC373860ElELIZJ2 = null;
                                }
                                if (enumC373860ElELIZJ2 != enumC373860ElE) {
                                    this.LLILLJJLI.u6(EnumC374420Em8.NORMAL, true);
                                }
                                this.LLILLJJLI.hx1(true);
                                C0E48 c0e48F42 = this.LLILLJJLI.F4();
                                if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null && player.isPlaying() && (c0e48F4 = this.LLILLJJLI.F4()) != null && (player2 = c0e48F4.getPlayer()) != null) {
                                    player2.pause(false);
                                }
                            }
                            SurfaceView surfaceViewKO0 = this.LLILLJJLI.kO0();
                            if (surfaceViewKO0 != null) {
                                final C373940ElM c373940ElM = this.LLILLJJLI;
                                c354790DvZ = new C354790DvZ(surfaceViewKO0, new InterfaceC354860Dvg() { // from class: X.0Elu
                                    @Override // X.InterfaceC354860Dvg
                                    public final void Bp() {
                                        c373940ElM.Bp();
                                    }
                                });
                            } else {
                                c354790DvZ = null;
                            }
                            InterfaceC373920ElK interfaceC373920ElKN54 = this.LLILLJJLI.n5();
                            if (interfaceC373920ElKN54 != null) {
                                nLETrackSlotCI0 = interfaceC373920ElKN54.cI0();
                            } else {
                                nLETrackSlotCI0 = null;
                            }
                            Size size = new Size(iIntValue, iIntValue2);
                            float fFloatValue = canvasSize.getFirst().floatValue() / canvasSize.getSecond().intValue();
                            InterfaceC373920ElK interfaceC373920ElKN55 = this.LLILLJJLI.n5();
                            if (interfaceC373920ElKN55 != null) {
                                nLETrackSlotKy = interfaceC373920ElKN55.Ky();
                            } else {
                                nLETrackSlotKy = null;
                            }
                            C354750DvV c354750DvV = new C354750DvV(c354790DvZ, nLETrackSlotLJIIJJI, nLETrackSlotCI0, nLETrackSlotKy, motionEvent, size, fN5, fFloatValue);
                            C0E48 c0e48F43 = this.LLILLJJLI.F4();
                            if (c0e48F43 != null && (interfaceC351350Dq1LLFII = c0e48F43.LLFII()) != null) {
                                interfaceC351350Dq1LLFII.LJJLIL(c354750DvV);
                            }
                            int action2 = motionEvent.getAction();
                            if (action2 != 1 && action2 != 3) {
                                return;
                            }
                            if (!z && (interfaceC373560EkkT5 = this.LLILLJJLI.t5()) != null) {
                                interfaceC373560EkkT5.ZD();
                            }
                            this.LLILLJJLI.hx1(false);
                            this.LLILLJJLI.P4();
                            InterfaceC373920ElK interfaceC373920ElKN56 = this.LLILLJJLI.n5();
                            if (interfaceC373920ElKN56 != null && (nLETrackSlotCI03 = interfaceC373920ElKN56.cI0()) != null && nLETrackSlotCI03.hasExtra("ep_cutout_brush_type")) {
                                InterfaceC373920ElK interfaceC373920ElKN57 = this.LLILLJJLI.n5();
                                if (interfaceC373920ElKN57 != null && (nLETrackSlotCI04 = interfaceC373920ElKN57.cI0()) != null) {
                                    extra = nLETrackSlotCI04.getExtra("ep_cutout_brush_type");
                                }
                            } else {
                                extra = "NORMAL";
                            }
                            if (nLETrackSlotLJIIJJI.getAIMatting() != null) {
                                z2 = true;
                            }
                            long jJh = 0;
                            if (!z2 && Intrinsics.LJFF(extra, "ERASER")) {
                                C0E48 c0e48F44 = this.LLILLJJLI.F4();
                                if (c0e48F44 != null && (iNLEMediaSessionF12 = c0e48F44.f1()) != null && (brushApi = iNLEMediaSessionF12.getBrushApi()) != null) {
                                    InterfaceC373920ElK interfaceC373920ElKN58 = this.LLILLJJLI.n5();
                                    if (interfaceC373920ElKN58 == null || (nLETrackSlotCI02 = interfaceC373920ElKN58.cI0()) == null || (uuid = nLETrackSlotCI02.getUUID()) == null) {
                                        uuid = "";
                                    }
                                    brushApi.clear2DBrush(uuid);
                                }
                                C0E48 c0e48F45 = this.LLILLJJLI.F4();
                                if (c0e48F45 == null || (iNLEMediaSessionF1 = c0e48F45.f1()) == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) {
                                    return;
                                }
                                C0E48 c0e48F46 = this.LLILLJJLI.F4();
                                if (c0e48F46 != null) {
                                    jJh = c0e48F46.getPlayer().Jh();
                                }
                                playerApi.seekTime(jJh);
                                return;
                            }
                            AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(nLETrackSlotLJIIJJI, this.LLILLJJLI, 54);
                            if (this.LLILLJJLI.LLJJJJLIIL.booleanValue()) {
                                C0E48 c0e48F47 = this.LLILLJJLI.F4();
                                if (c0e48F47 == null || (player3 = c0e48F47.getPlayer()) == null) {
                                    return;
                                }
                                C0E48 c0e48F48 = this.LLILLJJLI.F4();
                                if (c0e48F48 != null) {
                                    jJh = c0e48F48.getPlayer().Jh();
                                }
                                player3.ba(jJh, new C0FX3(awS406S0200000_5, 6));
                                return;
                            }
                            awS406S0200000_5.invoke();
                        }
                    }
                }
            }
        };
    }

    public final void J6(long j, PointF pointF) {
        i3(new AwS42S0100100_5(j, pointF, 0));
        InterfaceC373120Ek2 interfaceC373120Ek2Z4 = Z4();
        if (interfaceC373120Ek2Z4 != null) {
            interfaceC373120Ek2Z4.XO2(j, pointF, null);
        }
    }

    @Override // X.InterfaceC373870ElF
    @InterfaceC1294060jmO
    public void OJ0(EnumC374420Em8 enumC374420Em8, boolean z) {
        if (K6()) {
            return;
        }
        u6(enumC374420Em8, z);
    }

    public final void u6(EnumC374420Em8 enumC374420Em8, boolean z) {
        boolean z2;
        NLETrackSlot nLETrackSlotLJIIJJI;
        C0E48 c0e48F4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        if (T2().LIZJ != enumC374420Em8) {
            i3(new AwS584S0100000_5(enumC374420Em8, 463));
            if (z) {
                if (enumC374420Em8 == EnumC374420Em8.SELECTED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C357270DzZ c357270DzZD5 = D5();
                if (c357270DzZD5 != null && (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) != null && (c0e48F4 = F4()) != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LLI(z2, nLETrackSlotLJIIJJI, d5(R.attr.a06), EnumC356070Dxd.COMMIT);
                }
            }
        }
    }

    public final void d6(boolean z, String str, String str2) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        boolean z2;
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        int iSwigValue;
        C357270DzZ c357270DzZD5 = D5();
        if (c357270DzZD5 != null && (nLETrackSlotLJIIJJI = c357270DzZD5.LJIIJJI()) != null) {
            C357270DzZ c357270DzZD52 = D5();
            if (c357270DzZD52 != null) {
                z2 = c357270DzZD52.LLJJJJLIIL;
            } else {
                z2 = false;
            }
            C357270DzZ c357270DzZD53 = D5();
            if (c357270DzZD53 != null) {
                videoPublishEditModelLJIIJ = c357270DzZD53.LJIIJ();
            } else {
                videoPublishEditModelLJIIJ = null;
            }
            NLEAIMatting aIMatting = nLETrackSlotLJIIJJI.getAIMatting();
            if (aIMatting != null) {
                if (C351220Dpo.LJZL(nLETrackSlotLJIIJJI)) {
                    iSwigValue = NLEAIMattingType.TYPE_CUSTOM.swigValue();
                } else {
                    NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(aIMatting.getSegment());
                    if (nLESegmentAIMattingDynamicCast != null) {
                        iSwigValue = nLESegmentAIMattingDynamicCast.getMattingType();
                    } else {
                        iSwigValue = NLEAIMattingType.TYPE_AI.swigValue();
                    }
                }
                C0EI4.LIZ.getClass();
                C0EI4.LJIIJJI(videoPublishEditModelLJIIJ, iSwigValue, z, str, str2, z2);
                if (z) {
                    C359130E6d c359130E6d = new C359130E6d(nLETrackSlotLJIIJJI, videoPublishEditModelLJIIJ, F4(), z2);
                    if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_MULTITHREADED_OPT, Boolean.FALSE)).booleanValue()) {
                        c359130E6d.invoke();
                    } else {
                        C1524705y1.LIZ(new AwS549S0100000_5(c359130E6d, 1293));
                    }
                }
            }
        }
    }
}
