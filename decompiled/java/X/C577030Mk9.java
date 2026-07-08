package X;

import Y.AObjectS241S0100000_8;
import Y.AfS177S0100000_8;
import Y.AkS472S0100000_8;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577030Mk9 extends AbstractC2255721DQs<InterfaceC577380Mki> implements InterfaceC577380Mki, InterfaceC379610EuV {
    public static final C577180MkO LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C1DRG LL;
    public final ShortVideoContext LLILLJJLI = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1651080t4E.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C0MFK.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1632360sa2.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1632360sa2.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576780Mjk.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576630MjV.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC577060MkC.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576680Mja.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC577190MkP.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576620MjU.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576870Mjt.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576910Mjx.class, null);
    public final C11NJ LLJJIII = new C11NJ();
    public final InterfaceC577380Mki LLJJIJI = this;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(309));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 716));
    public boolean LLJJJ;

    private final InterfaceC577060MkC m3() {
        this.LLJJJ = true;
        return q3();
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.0MkO] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C577030Mk9.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C577030Mk9.class, "recordTooltipComponent", "getRecordTooltipComponent()Lcom/ss/android/ugc/gamora/recorder/tooltip/RecordTooltipApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "recordGreenScreenUIComponent", "getRecordGreenScreenUIComponent()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenUIApi;", 0), new C2217381BqS(C577030Mk9.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0), new C2217381BqS(C577030Mk9.class, "recordGreenScreenUIApi", "getRecordGreenScreenUIApi()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenUIApi;", 0), new C2217381BqS(C577030Mk9.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutWorkspaceComponent", "getLayoutWorkspaceComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutWorkspaceApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutCaptureFlowComponent", "getLayoutCaptureFlowComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutCaptureFlowApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutToolbarComponentLazy", "getLayoutToolbarComponentLazy()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutToolbarApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutGridComponent", "getLayoutGridComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutGridApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutCompatibilityComponent", "getLayoutCompatibilityComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutCompatibilityApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutNLEComponent", "getLayoutNLEComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutNLEApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutExitComponent", "getLayoutExitComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutExitApiComponent;", 0), new C2217381BqS(C577030Mk9.class, "layoutMobComponent", "getLayoutMobComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutMobApiComponent;", 0)};
        LLJJJIL = new Object() { // from class: X.0MkO
        };
        LLJJJJJIL = 8;
        C1446930nkx.LJ(new C539470LDt());
        C1446930nkx.LIZJ(AFwS239S0000000_8.get$arr$(213));
        C1446930nkx.LIZLLL(AFwS239S0000000_8.get$arr$(214));
    }

    private final InterfaceC1632360sa2 E3() {
        return (InterfaceC1632360sa2) this.LLILZIL.getValue(this, LLJJJJ[2]);
    }

    private final C0MFK H3() {
        return (C0MFK) this.LLILZ.getValue(this, LLJJJJ[1]);
    }

    private final C1654680tA2 O3() {
        return (C1654680tA2) this.LLJJIJIL.getValue();
    }

    private final void W1() {
        CreativeModel creativeModel = this.LLILLJJLI.creativeModel;
        CameraLayoutModel cameraLayoutModel = creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            creativeModel.cameraLayoutModel = new CameraLayoutModel(cameraLayoutModel.layoutEnabled, cameraLayoutModel.layoutMode, cameraLayoutModel.layoutApplyFrom, null, null, null, null, null, null, cameraLayoutModel.layoutPlayerType, null);
        }
    }

    private final e0 iq() {
        return (e0) this.LLILZLL.getValue(this, LLJJJJ[3]);
    }

    private final void o4() {
        AbstractC577050MkB abstractC577050MkBLIZ;
        CameraLayoutModel cameraLayoutModel = this.LLILLJJLI.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel == null || !cameraLayoutModel.layoutEnabled || (abstractC577050MkBLIZ = C577040MkA.LIZ(cameraLayoutModel)) == null) {
            return;
        }
        AbstractC577050MkB abstractC577050MkB = C577110MkH.LJFF;
        if (C1697810uHb.LJIIJJI(C577090MkF.LJFF, C577130MkJ.LJFF, C577160MkM.LJFF, abstractC577050MkB, C577080MkE.LJFF).contains(abstractC577050MkBLIZ)) {
            abstractC577050MkB = abstractC577050MkBLIZ;
        } else if (abstractC577050MkB == null) {
            return;
        }
        i3().XX();
        InterfaceC576770Mjj interfaceC576770MjjI3 = i3();
        LayoutApplyFrom layoutApplyFrom = cameraLayoutModel.layoutApplyFrom;
        if (layoutApplyFrom == null) {
            layoutApplyFrom = LayoutApplyFrom.ANCHOR;
        }
        interfaceC576770MjjI3.go0(abstractC577050MkB, layoutApplyFrom);
        m3().eK0(abstractC577050MkB);
    }

    private final InterfaceC577060MkC q3() {
        return (InterfaceC577060MkC) this.LLJIJIL.getValue(this, LLJJJJ[8]);
    }

    public final InterfaceC1632360sa2 B3() {
        return (InterfaceC1632360sa2) this.LLIZ.getValue(this, LLJJJJ[4]);
    }

    public final InterfaceC577190MkP G2() {
        return (InterfaceC577190MkP) this.LLJILJILJ.getValue(this, LLJJJJ[10]);
    }

    public final InterfaceC576870Mjt H2() {
        return (InterfaceC576870Mjt) this.LLJJ.getValue(this, LLJJJJ[12]);
    }

    public final InterfaceC576680Mja T2() {
        return (InterfaceC576680Mja) this.LLJILJIL.getValue(this, LLJJJJ[9]);
    }

    public final InterfaceC576910Mjx W2() {
        return (InterfaceC576910Mjx) this.LLJJI.getValue(this, LLJJJJ[13]);
    }

    public final InterfaceC576620MjU c3() {
        return (InterfaceC576620MjU) this.LLJILLL.getValue(this, LLJJJJ[11]);
    }

    public final InterfaceC1651080t4E getToolbarApi() {
        return (InterfaceC1651080t4E) this.LLILLL.getValue(this, LLJJJJ[0]);
    }

    public final InterfaceC576770Mjj i3() {
        return (InterfaceC576770Mjj) this.LLIZLLLIL.getValue(this, LLJJJJ[5]);
    }

    public final ICrashReportService o2() {
        return (ICrashReportService) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC576780Mjk v3() {
        return (InterfaceC576780Mjk) this.LLJ.getValue(this, LLJJJJ[6]);
    }

    public final InterfaceC576630MjV w2() {
        return (InterfaceC576630MjV) this.LLJI.getValue(this, LLJJJJ[7]);
    }

    private final void Q3() {
        C385670FAf<Boolean> c385670FAfRK0;
        InterfaceC1632360sa2 interfaceC1632360sa2E3 = E3();
        if (interfaceC1632360sa2E3 != null && (c385670FAfRK0 = interfaceC1632360sa2E3.rK0()) != null) {
            c385670FAfRK0.LIZ(this, new AObjectS241S0100000_8(this, 66));
        }
        iq().ec().LIZ(this, new AObjectS241S0100000_8(this, 67));
    }

    private final void e4() {
        C371780Ehs.LIZ(this.LLJJIII, C576730Mjf.LJIILIIL(r6(), this).LJJIL(new InterfaceC19483011Ki() { // from class: X.0Mjg
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (!(obj instanceof C579270Mnl) && !(obj instanceof C579290Mnn)) {
                    return false;
                }
                return true;
            }
        }).LJJLJLI(new AfS177S0100000_8(this, 47)));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C576730Mjf.LJIIIZ("CameraLayoutRootComponent", "onCreate");
        C0MFK c0mfkH3 = H3();
        if (c0mfkH3 != null) {
            c0mfkH3.ig(O3());
        }
        C0MFK c0mfkH32 = H3();
        if (c0mfkH32 != null) {
            c0mfkH32.ig(new C1654690tA3(C1664590tQ1.LJIIIZ(this), this.LLILLJJLI, new AwS552S0100000_8(this, 714), new AwS552S0100000_8(this, 715)));
        }
        C371780Ehs.LIZ(this.LLJJIII, new C11IE(C576730Mjf.LJIILIIL(r6(), this).LJJIL(new InterfaceC19483011Ki() { // from class: X.0Mk3
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C579250Mnj;
            }
        })).LJIILLIIL(new AfS177S0100000_8(this, 48)));
        C371780Ehs.LIZ(this.LLJJIII, C576730Mjf.LJIILIIL(r6(), this).LJJJJZI(new AkS472S0100000_8(this, 9)).LJJIFFI().LJJLJLI(new AfS177S0100000_8(this, 49)));
        e4();
        W1();
        o4();
        Q3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIII.dispose();
    }

    @Override // X.InterfaceC577380Mki
    public LiveData<AbstractC579260Mnk> r6() {
        return i3().r6();
    }

    public InterfaceC577380Mki Z1() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C577030Mk9(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC577380Mki
    public void In(View view) {
        C576730Mjf.LJIIIZ("CameraLayoutRootComponent", "onToolbarClicked");
        O3().z0();
        G2().b2();
        i3().XX();
        m3().In(view);
    }

    @Override // X.InterfaceC577380Mki
    public void fv(View view) {
        m3().fv(view);
    }

    @Override // X.InterfaceC577380Mki
    public boolean yD(boolean z) {
        if (!(r6().getValue() instanceof C579290Mnn)) {
            return false;
        }
        w2().tf2(false, z);
        C576730Mjf.LJIIIZ("CameraLayoutRootComponent", "intercepted record dock bar album click event");
        return true;
    }

    @Override // X.InterfaceC577380Mki
    public void JN1(boolean z, EnumC577200MkQ enumC577200MkQ) {
        if (z) {
            m3().kK(enumC577200MkQ);
        } else {
            if (!this.LLJJJ) {
                return;
            }
            m3().Jm2(enumC577200MkQ);
        }
    }

    public final void X1(boolean z, EnumC577200MkQ enumC577200MkQ) {
        if (z) {
            m3().kK(enumC577200MkQ);
        } else {
            m3().Jm2(enumC577200MkQ);
        }
    }
}
