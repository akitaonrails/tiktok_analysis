package X;

import Y.AComparatorS24S0000000_5;
import Y.AComparatorS362S0200000_5;
import Y.AObserverS209S0100000_5;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS41S0500000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385710FAj extends C0ETZ<InterfaceC361710EGb, C0FBI, C385730FAl, C0FUX> implements InterfaceC361710EGb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C1DRG LLJJI;
    public C0FBI LLJJIII;
    public final C0FUL LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public Function1<? super Boolean, Unit> LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public NLEEditorListener LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C385710FAj.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C385710FAj.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C385710FAj.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJJJLIIL = 8;
    }

    private final InterfaceC360800ECo O4() {
        return (InterfaceC360800ECo) this.LLJJIJIIJIL.getValue(this, LLJJJJJIL[0]);
    }

    private final InterfaceC359950E9h T4() {
        return (InterfaceC359950E9h) this.LLJJJIL.getValue(this, LLJJJJJIL[2]);
    }

    private final InterfaceC1452360nti Z4() {
        return (InterfaceC1452360nti) this.LLJJIJIL.getValue(this, LLJJJJJIL[1]);
    }

    @Override // X.InterfaceC361710EGb
    public void BE() {
        i3(AFwS234S0000000_5.get$arr$(352));
    }

    @Override // X.InterfaceC361710EGb
    public LiveState<Size> CY1() {
        return Z1(new C2217381BqS() { // from class: X.0FAm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LIZLLL;
            }
        });
    }

    @Override // ge.i
    public Function0<C0FBI> E3() {
        return new AwS549S0100000_5(this, 826);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap P4() {
        /*
            r3 = this;
            X.01GW r0 = X.C284640BDq.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 != 0) goto L26
            X.0E48 r0 = r3.F4()
            if (r0 == 0) goto L25
            com.bytedance.ies.nle.editor_jni.INLEMediaSession r0 = r0.f1()
            if (r0 == 0) goto L25
            com.bytedance.ies.nle.editor_jni.INLEMediaRuntime r0 = r0.getMediaRuntimeApi()
            if (r0 == 0) goto L25
            android.graphics.Bitmap r2 = r0.getCurrDisplayImage()
        L25:
            return r2
        L26:
            java.lang.Object r0 = r3.T2()
            X.0FAl r0 = (X.C385730FAl) r0
            android.util.Size r0 = r0.LIZIZ
            if (r0 == 0) goto L5b
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L5b
            int r1 = r1.intValue()
        L44:
            X.0E48 r0 = r3.F4()
            if (r0 == 0) goto L5a
            com.bytedance.ies.nle.editor_jni.INLEMediaSession r0 = r0.f1()
            if (r0 == 0) goto L5a
            com.bytedance.ies.nle.editor_jni.INLEMediaRuntime r0 = r0.getMediaRuntimeApi()
            if (r0 == 0) goto L5a
            android.graphics.Bitmap r2 = r0.getCurrDisplayImage(r1)
        L5a:
            return r2
        L5b:
            int r0 = X.C1415610mwR.LIZIZ()
            int r1 = r0 / 4
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385710FAj.P4():android.graphics.Bitmap");
    }

    @Override // X.InterfaceC361710EGb
    public void ZF0() {
        i3(AFwS234S0000000_5.get$arr$(351));
    }

    @Override // X.InterfaceC361710EGb
    public void d80() {
        i3(AFwS234S0000000_5.get$arr$(353));
    }

    @Override // X.InterfaceC361710EGb
    public LiveState<Size> getCanvasSize() {
        return Z1(new C2217381BqS() { // from class: X.0FAI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LIZIZ;
            }
        });
    }

    public final void k5() {
        NLEEditorListener nLEEditorListener = new NLEEditorListener() { // from class: X.0FAk
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                C0E48 c0e48F4 = this.LIZ.F4();
                if (c0e48F4 != null) {
                    if (!Intrinsics.LIZ(C350870DpF.LJI(c0e48F4).getCanvasRatio(), this.LIZ.T2().LIZJ) || this.LIZ.T2().LIZIZ == null) {
                        C385710FAj c385710FAj = this.LIZ;
                        c385710FAj.t5(c385710FAj.T2().LIZ);
                    }
                    List<AbstractC383800F3a> listLJJIJLIJ = this.LIZ.LLJJIJI.LJJIJLIJ();
                    C385710FAj c385710FAj2 = this.LIZ;
                    for (AbstractC383800F3a abstractC383800F3a : listLJJIJLIJ) {
                        C0E48 c0e48F42 = c385710FAj2.F4();
                        abstractC383800F3a.LJJJI(c0e48F42 != null ? C350870DpF.LJI(c0e48F42) : null);
                    }
                }
            }
        };
        this.LLJJJJ = nLEEditorListener;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            c0e48F4.fj(nLEEditorListener);
        }
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C385730FAl> o2() {
        return AFwS191S0000000_5.get$arr$(263);
    }

    @Override // X.InterfaceC361710EGb
    public LiveState<Size> uc2() {
        return Z1(new C2217381BqS() { // from class: X.0FAn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LIZ;
            }
        });
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FUX> w2() {
        return new AwS549S0100000_5(this, 825);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.bytedance.ies.nle.editor_jni.PairIntInt] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.ies.nle.editor_jni.PairIntInt] */
    @Override // X.InterfaceC361710EGb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wF() {
        /*
            r5 = this;
            X.00zU r4 = new X.00zU
            r4.<init>()
            X.0E48 r0 = r5.F4()
            if (r0 == 0) goto L1d
            com.bytedance.ies.nle.editor_jni.INLEMediaSession r0 = r0.f1()
            if (r0 == 0) goto L1d
            com.bytedance.ies.nle.editor_jni.INLEMediaRuntime r0 = r0.getMediaRuntimeApi()
            if (r0 == 0) goto L1d
            com.bytedance.ies.nle.editor_jni.PairIntInt r1 = r0.getInitSize()
            if (r1 != 0) goto L23
        L1d:
            com.bytedance.ies.nle.editor_jni.PairIntInt r1 = new com.bytedance.ies.nle.editor_jni.PairIntInt
            r0 = 0
            r1.<init>(r0, r0)
        L23:
            r4.element = r1
            int r0 = r1.getFirst()
            if (r0 == 0) goto L35
            T r0 = r4.element
            com.bytedance.ies.nle.editor_jni.PairIntInt r0 = (com.bytedance.ies.nle.editor_jni.PairIntInt) r0
            int r0 = r0.getSecond()
            if (r0 != 0) goto L55
        L35:
            X.0E48 r0 = r5.F4()
            if (r0 == 0) goto L60
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r0)
            float r3 = r0.getCanvasRatio()
        L43:
            com.bytedance.ies.nle.editor_jni.PairIntInt r2 = new com.bytedance.ies.nle.editor_jni.PairIntInt
            int r1 = X.C1415610mwR.LIZIZ()
            int r0 = X.C1415610mwR.LIZIZ()
            float r0 = (float) r0
            float r0 = r0 / r3
            int r0 = (int) r0
            r2.<init>(r1, r0)
            r4.element = r2
        L55:
            kotlin.jvm.internal.AwS584S0100000_5 r1 = new kotlin.jvm.internal.AwS584S0100000_5
            r0 = 729(0x2d9, float:1.022E-42)
            r1.<init>(r4, r0)
            r5.i3(r1)
            return
        L60:
            r3 = 1058013184(0x3f100000, float:0.5625)
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385710FAj.wF():void");
    }

    private final void Xi() {
        LiveData<Boolean> liveDataQO0;
        LiveState<Long> liveStateJq;
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (mutableLiveDataLIZ = c0e48F4.S7().LIZ("selected_nle_track_slot")) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 91));
        }
        InterfaceC360800ECo interfaceC360800ECoO4 = O4();
        if (interfaceC360800ECoO4 != null && (liveStateJq = interfaceC360800ECoO4.jq()) != null) {
            liveStateJq.LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 731));
        }
        if (!C301680Bs6.LIZ()) {
            k5();
            return;
        }
        InterfaceC359950E9h interfaceC359950E9hT4 = T4();
        if (interfaceC359950E9hT4 == null || (liveDataQO0 = interfaceC359950E9hT4.QO0()) == null) {
            return;
        }
        liveDataQO0.observe(this, new AObserverS209S0100000_5(this, 92));
    }

    @Override // X.InterfaceC361710EGb
    public SurfaceView LJIJJLI() {
        InterfaceC1452360nti interfaceC1452360ntiZ4 = Z4();
        if (interfaceC1452360ntiZ4 != null) {
            return interfaceC1452360ntiZ4.LJIJJLI();
        }
        return null;
    }

    @Override // X.InterfaceC361710EGb
    public int W02() {
        return T2().LJ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        if (iPreviewServiceLIZ != null) {
            iPreviewServiceLIZ.init(this);
        }
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        if (iPreviewServiceLIZ != null) {
            iPreviewServiceLIZ.onDestroy();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        C0E48 c0e48F4;
        super.onPause();
        NLEEditorListener nLEEditorListener = this.LLJJJJ;
        if (nLEEditorListener == null || (c0e48F4 = F4()) == null) {
            return;
        }
        c0e48F4.Ej(nLEEditorListener);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C0E48 c0e48F4;
        super.onResume();
        NLEEditorListener nLEEditorListener = this.LLJJJJ;
        if (nLEEditorListener == null || (c0e48F4 = F4()) == null) {
            return;
        }
        c0e48F4.fj(nLEEditorListener);
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    private final C0FBM H4(C0EO0 c0eo0) {
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (c0eo0 == null) {
            return new C0FBM(false, false, false, false);
        }
        if (((int) c0eo0.LJ) % 90 != 0) {
            return new C0FBM(false, false, false, false);
        }
        Size size = T2().LIZ;
        if (size == null) {
            return new C0FBM(false, false, false, false);
        }
        Size size2 = T2().LIZIZ;
        if (size2 == null) {
            return new C0FBM(false, false, false, false);
        }
        int width = (size.getWidth() - size2.getWidth()) / 2;
        int height = (size.getHeight() - size2.getHeight()) / 2;
        int width2 = size2.getWidth() + width;
        int height2 = size2.getHeight() + height;
        if ((((int) c0eo0.LJ) / 90) % 2 == 0) {
            f = c0eo0.LIZ;
            f2 = c0eo0.LIZIZ;
        } else {
            f = c0eo0.LIZIZ;
            f2 = c0eo0.LIZ;
        }
        float f3 = 2;
        float f4 = c0eo0.LIZJ - (f / f3);
        float f5 = c0eo0.LIZLLL - (f2 / f3);
        float f6 = f + f4;
        float f7 = f2 + f5;
        if (Math.abs(f4 - width) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f5 - height) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Math.abs(f6 - width2) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Math.abs(f7 - height2) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
            z4 = true;
        }
        return new C0FBM(z, z2, z3, z4);
    }

    private final C0EO3 K4(C0EO0 c0eo0) {
        boolean z;
        boolean z2 = false;
        if (c0eo0 == null) {
            return new C0EO3(false, false);
        }
        if (T2().LIZ == null) {
            return new C0EO3(false, false);
        }
        if (Math.abs(c0eo0.LIZJ - (r5.getWidth() / 2)) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(c0eo0.LIZLLL - (r5.getHeight() / 2)) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
            z2 = true;
        }
        return new C0EO3(z, z2);
    }

    @Override // X.InterfaceC361710EGb
    public void DN0(int i) {
        i3(new AwS20S0001000_5(i, 28));
    }

    @Override // X.InterfaceC361710EGb
    public void Ho2(Function1<? super Boolean, Unit> function1) {
        this.LLJJJ = function1;
    }

    @Override // X.InterfaceC361710EGb
    public void LLJJIJIIJIL(boolean z) {
        i3(new AwS20S0010000_5(z, 35));
    }

    @Override // X.InterfaceC361710EGb
    public void LR1(boolean z) {
        i3(new AwS20S0010000_5(z, 34));
    }

    @Override // X.InterfaceC361710EGb
    public void N42(Function1<? super Bitmap, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C428801le(this, function1, null), 3);
    }

    @Override // X.InterfaceC361710EGb
    public void Nk2(Function0<Unit> function0) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C428901lf(this, function0, null), 3);
    }

    @Override // X.InterfaceC361710EGb
    public void V52(AbstractC385780FAq abstractC385780FAq) {
        if (abstractC385780FAq instanceof AbstractC383800F3a) {
            i3(new AwS584S0100000_5(C2097608Jq.LJIILIIL(T2().LJI, new Pair(((AbstractC383800F3a) abstractC385780FAq).LJJIZ(), Boolean.TRUE)), (Map<EnumC373450EkZ, C373430EkX>) 726));
        }
        C0FUL c0ful = this.LLJJIJI;
        if (!((ArrayList) c0ful.LLILZ).contains(abstractC385780FAq)) {
            ((ArrayList) c0ful.LLILZ).add(abstractC385780FAq);
            c0ful.LLILZ = new ArrayList(C13LP.LJLLLL(new AComparatorS24S0000000_5(130), c0ful.LLILZ));
        }
    }

    @Override // X.InterfaceC361710EGb
    public void XF1(boolean z) {
        i3(AFwS234S0000000_5.get$arr$(350));
        if (z) {
            BE();
        }
    }

    public final void d5(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.LLJJJ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC361710EGb
    public void dP1(boolean z) {
        i3(new AwS20S0010000_5(z, 36));
    }

    @Override // X.InterfaceC361710EGb
    public void kV0(Function1<? super Boolean, Unit> function1) {
        this.LLJJJ = function1;
    }

    @Override // X.InterfaceC361710EGb
    public void pT1(C0FBW c0fbw) {
        List<C0FBW> list = T2().LJIILLIIL;
        if (!list.contains(c0fbw)) {
            return;
        }
        i3(new AwS371S0200000_5((List) list, (List<? extends C0FBW>) c0fbw, (C0FBW) 157));
    }

    @Override // X.InterfaceC361710EGb
    public void sc0(AbstractC385780FAq abstractC385780FAq) {
        this.LLJJIJI.LLILZ.remove(abstractC385780FAq);
    }

    public final void t5(Size size) {
        Float fValueOf;
        if (size != null && size.getWidth() > 0 && size.getHeight() > 0) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (fValueOf = Float.valueOf(C350870DpF.LJI(c0e48F4).getCanvasRatio())) != null && fValueOf.floatValue() > 0.0f) {
                i3(new AwS214S0300000_5(size, C363770ENz.LIZ(fValueOf.floatValue(), size.getWidth(), size.getHeight()), fValueOf, 17));
            } else {
                i3(new AwS584S0100000_5(size, 725));
            }
        }
    }

    @Override // X.InterfaceC361710EGb
    public void tK2(C0EO0 c0eo0) {
        i3(new AwS214S0300000_5(c0eo0, K4(c0eo0), H4(c0eo0), 18));
    }

    @Override // X.InterfaceC361710EGb
    public void vf0(C0FBW c0fbw) {
        List<C0FBW> list = T2().LJIILLIIL;
        if (list.contains(c0fbw)) {
            return;
        }
        i3(new AwS371S0200000_5((List) list, (List<? extends C0FBW>) c0fbw, (C0FBW) 156));
    }

    public C385710FAj(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIJI = new C0FUL(c19a3, G2(), getDiContainer());
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
    }

    @Override // X.InterfaceC361710EGb
    public void Ix2(C0ELW[] c0elwArr, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LJII);
        for (C0ELW c0elw : c0elwArr) {
            linkedHashMap.put(c0elw, Boolean.valueOf(z));
        }
        i3(new AwS584S0100000_5(linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) 728));
    }

    @Override // X.InterfaceC361710EGb
    public void mi1(boolean z, Function0<Unit> function0) {
        View view;
        if (z) {
            i3(AFwS234S0000000_5.get$arr$(354));
            C0FBI c0fbi = this.LLJJIII;
            if (c0fbi != null && (view = c0fbi.mView) != null) {
                C372570Ej9.LIZIZ(view, new AwS549S0100000_5(function0, (Function0<Unit>) 827));
                return;
            }
            return;
        }
        Nk2(new AwS406S0200000_5(this, (C385710FAj) function0, (Function0<Unit>) 85));
    }

    @Override // X.InterfaceC361710EGb
    public void o10(C0ELW[] c0elwArr, boolean z) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrack trackBySlot;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        NLEModel nLEModelLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LJI);
        for (C0ELW c0elw : c0elwArr) {
            linkedHashMap.put(c0elw, Boolean.valueOf(z));
        }
        i3(new AwS584S0100000_5(linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) 730));
        if (z) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null) {
                nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null) {
                trackBySlot = C350870DpF.LJI(c0e48F42).getTrackBySlot(nLETrackSlotLLLLLLIL);
            } else {
                trackBySlot = null;
            }
            for (AbstractC383800F3a abstractC383800F3a : n5(this.LLJJIJI.LJJIJLIJ(), nLETrackSlotLLLLLLIL, trackBySlot)) {
                C0E48 c0e48F43 = F4();
                if (c0e48F43 != null) {
                    nLETrackSlotLLLLLLIL2 = c0e48F43.LLLLLLIL();
                } else {
                    nLETrackSlotLLLLLLIL2 = null;
                }
                abstractC383800F3a.LJJJIL(nLETrackSlotLLLLLLIL2);
                abstractC383800F3a.LJJJ(O4().jq().LIZJ().longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                C0E48 c0e48F44 = F4();
                if (c0e48F44 != null) {
                    nLEModelLJI = C350870DpF.LJI(c0e48F44);
                } else {
                    nLEModelLJI = null;
                }
                abstractC383800F3a.LJJJI(nLEModelLJI);
            }
        }
    }

    public final List<AbstractC383800F3a> n5(List<? extends AbstractC383800F3a> list, NLETrackSlot nLETrackSlot, NLETrack nLETrack) {
        return C13LP.LJLLLL(new AComparatorS362S0200000_5(nLETrack, nLETrackSlot, 0), list);
    }

    @Override // X.InterfaceC361710EGb
    public void Kq2(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        i3(new AwS41S0500000_5(bool4, this, bool, bool2, bool3, 4));
    }
}
