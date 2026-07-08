package X;

import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.AfS177S0100000_8;
import Y.AkS472S0100000_8;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS157S1100000_8;
import kotlin.jvm.internal.AwS1S2102000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0Mji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576760Mji extends i<InterfaceC576660MjY, C0L2V, C0L2Y, C536460L2e> implements InterfaceC576660MjY, InterfaceC379610EuV {
    public static final C576880Mju LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final ShortVideoContext LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final C11RK<Float> LLJJL;
    public final C11RK<AbstractC576850Mjr> LLJJLIIIJLLLLLLLZ;
    public final C11RK<Unit> LLJL;
    public final C11NZ<Unit> LLJLIL;
    public final C11NJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C0LAB LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0Mju] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C576760Mji.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C576760Mji.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C576760Mji.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C576760Mji.class, "lighteningControlProgressComponent", "getLighteningControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C576760Mji.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C576760Mji.class, "reuseSurfaceApiComponent", "getReuseSurfaceApiComponent()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0), new C2217381BqS(C576760Mji.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0), new C2217381BqS(C576760Mji.class, "layoutWorkspaceComponent", "getLayoutWorkspaceComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutWorkspaceApiComponent;", 0), new C2217381BqS(C576760Mji.class, "layoutCaptureFlowComponent", "getLayoutCaptureFlowComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutCaptureFlowApiComponent;", 0), new C2217381BqS(C576760Mji.class, "cameraNLEComponent", "getCameraNLEComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutNLEApiComponent;", 0), new C2217381BqS(C576760Mji.class, "cameraLayoutExitComponent", "getCameraLayoutExitComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutExitApiComponent;", 0)};
        LLJLLL = new Object() { // from class: X.0Mju
        };
        LLJZIJLIL = 8;
    }

    @Override // X.InterfaceC576660MjY
    public void Em0() {
        C576730Mjf.LJIIIZ("CameraLayoutGoNextComponent", "onFinalMediaRendered");
        if (P4().r6().getValue() instanceof C579310Mnp) {
            C576730Mjf.LJIIIZ("CameraLayoutGoNextComponent", "compiling, avoid duplicated onFinalMediaRendered()");
            return;
        }
        n5();
        List<LayoutItemMedia> listKG2 = T4().KG2();
        ArrayList arrayList = new ArrayList();
        for (LayoutItemMedia layoutItemMedia : listKG2) {
            if (layoutItemMedia.mediaSource == LayoutMediaSource.UPLOAD) {
                arrayList.add(layoutItemMedia);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LayoutItemMedia) it2.next()).filePath);
        }
        boolean zLIZJ = C576730Mjf.LIZJ(arrayList2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start compile, containHdrSource=");
        sbLIZ.append(zLIZJ);
        C576730Mjf.LJIIIZ("CameraLayoutGoNextComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (K4().kn2() > 1000) {
            List<LayoutItemMedia> listKG22 = T4().KG2();
            if (!(listKG22 instanceof Collection) || !listKG22.isEmpty()) {
                Iterator<LayoutItemMedia> it3 = listKG22.iterator();
                while (it3.hasNext()) {
                    if (it3.next().mediaType != LayoutMediaType.PHOTO) {
                        Pair<String, String> pairVv1 = T4().Vv1();
                        String first = pairVv1.getFirst();
                        String second = pairVv1.getSecond();
                        AbstractC577050MkB abstractC577050MkBG8 = P4().G8();
                        Pair pairLIZJ = C540010LFv.LIZJ(abstractC577050MkBG8 != null ? abstractC577050MkBG8.LIZJ : 0);
                        int iIntValue = ((Number) pairLIZJ.getFirst()).intValue();
                        int iIntValue2 = ((Number) pairLIZJ.getSecond()).intValue();
                        C0LDJ c0ldj = C0LDJ.LIZ;
                        ShortVideoContext shortVideoContext = this.LLJJ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(iIntValue);
                        sbLIZ2.append('x');
                        sbLIZ2.append(iIntValue2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c0ldj.getClass();
                        this.LLJLLIL = C0LDJ.LJFF(strLIZIZ, shortVideoContext, false);
                        H4().QJ1(first, second, iIntValue, iIntValue2, (String) C2507609sA.LIZ.getValue(), zLIZJ, new AwS1S2102000_8(this, first, second, iIntValue, iIntValue2, 1), new AwS587S0100000_8(this, 463), new AwS622S0100000_8(this, 30));
                        return;
                    }
                }
            }
        }
        String strPF = T4().PF(true);
        Pair pairLIZ = C540010LFv.LIZ();
        int iIntValue3 = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue4 = ((Number) pairLIZ.getSecond()).intValue();
        C0LDJ c0ldj2 = C0LDJ.LIZ;
        ShortVideoContext shortVideoContext2 = this.LLJJ;
        StringBuilder sb = new StringBuilder();
        sb.append(iIntValue3);
        sb.append('x');
        sb.append(iIntValue4);
        String string = sb.toString();
        c0ldj2.getClass();
        this.LLJLLIL = C0LDJ.LJFF(string, shortVideoContext2, true);
        H4().zi2(strPF, iIntValue3, iIntValue4, (String) C2507609sA.LIZ.getValue(), zLIZJ, new AwS157S1100000_8(this, strPF, 6), new AwS587S0100000_8(this, 462), new AwS622S0100000_8(this, 29));
    }

    public final InterfaceC576870Mjt F4() {
        return (InterfaceC576870Mjt) this.LLJJJJLIIL.getValue(this, LLJZ[10]);
    }

    public final InterfaceC576620MjU H4() {
        return (InterfaceC576620MjU) this.LLJJJJJIL.getValue(this, LLJZ[9]);
    }

    public final InterfaceC576630MjV K4() {
        return (InterfaceC576630MjV) this.LLJJJJ.getValue(this, LLJZ[8]);
    }

    public final C576940Mk0 O4() {
        return (C576940Mk0) this.LLJLL.getValue();
    }

    public final InterfaceC576770Mjj P4() {
        return (InterfaceC576770Mjj) this.LLJJJ.getValue(this, LLJZ[6]);
    }

    public final InterfaceC576780Mjk T4() {
        return (InterfaceC576780Mjk) this.LLJJJIL.getValue(this, LLJZ[7]);
    }

    public final InterfaceC1630630sXF Z4() {
        return (InterfaceC1630630sXF) this.LLJJIJI.getValue(this, LLJZ[3]);
    }

    public final InterfaceC1452360nti d5() {
        return (InterfaceC1452360nti) this.LLJJIJIL.getValue(this, LLJZ[5]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLJJIII.getValue(this, LLJZ[2]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJJI.getValue(this, LLJZ[1]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJILLL.getValue(this, LLJZ[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJJIJIIJIL.getValue(this, LLJZ[4]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0L2Y> o2() {
        return AFwS194S0000000_8.get$arr$(310);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C536460L2e> w2() {
        return new AwS552S0100000_8(this, 728);
    }

    private final void n5() {
        P4().ZN0();
        getPlanCUIApiComponent().m10(false);
        Z4().W9(false);
        this.LLJJL.onNext(Float.valueOf(0.0f));
        getRecordControlApi().Ak().LIZIZ();
    }

    public final void k5() {
        if (!(P4().r6().getValue() instanceof C579310Mnp)) {
            C576730Mjf.LJIIJ("CameraLayoutGoNextComponent", "skip handleCancelCompile() as the current status isn't compiling");
            return;
        }
        P4().iz1();
        P4().Ho1(new ARunnableS108S0100000_8(this, 93));
        H4().h61();
        this.LLJL.onNext(Unit.LIZ);
        getPlanCUIApiComponent().m10(true);
        Z4().W9(true);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJLILLLLZIIL.LIZ(this.LLJJLIIIJLLLLLLLZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0Mjp
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C576800Mjm;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0Mjn
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return (AbstractC576850Mjr) obj;
            }
        }).LJJJLZIJ(C11S5.LIZIZ).LJJJJZI(new AkS472S0100000_8(this, 10)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 60)));
        this.LLJLILLLLZIIL.LIZ(this.LLJJLIIIJLLLLLLLZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0Mjq
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C576790Mjl;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0Mjo
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return (AbstractC576850Mjr) obj;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 61)));
        this.LLJLILLLLZIIL.LIZ(this.LLJJLIIIJLLLLLLLZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 62)));
        this.LLJLILLLLZIIL.LIZ(this.LLJJL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 63)));
        P4().r6().observe(this, new AObserverS212S0100000_8(this, 71));
        getPlanCUIApiComponent().LLZIL().LIZ(this, new AObjectS241S0100000_8(this, 68));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJLILLLLZIIL.dispose();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (P4().r6().getValue() instanceof C579320Mnq) {
            H4().aC0(false);
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC576660MjY
    public C11NZ<Unit> u01() {
        return this.LLJLIL;
    }

    public C576760Mji(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJ = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576780Mjk.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576630MjV.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576620MjU.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576870Mjt.class, null);
        this.LLJJL = new C11RK<>();
        this.LLJJLIIIJLLLLLLLZ = new C11RK<>();
        C11RK<Unit> c11rk = new C11RK<>();
        this.LLJL = c11rk;
        this.LLJLIL = new C19475711Hn(c11rk);
        this.LLJLILLLLZIIL = new C11NJ();
        this.LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 727));
    }
}
