package X;

import Y.AfS144S0200000_8;
import Y.AkS472S0100000_8;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import com.ss.android.vesdk.runtime.VEMem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Moj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579870Moj extends AbstractC2255721DQs<InterfaceC1655300tB2> implements InterfaceC379610EuV, InterfaceC1655300tB2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public C09AE LLIZLLLIL;
    public final C579870Moj LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650190t2n.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648590t0D.class, null);
    public AtomicLong LLJ = new AtomicLong(-1);
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 371));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 370));
    public final InterfaceC332260D0u<EnumC579880Mok> LLJILJIL = C1BNE.LIZ(EnumC579880Mok.INIT);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C579870Moj.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C579870Moj.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C579870Moj.class, "recordComponent", "getRecordComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C579870Moj.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C579870Moj.class, "conflictsManagementApi", "getConflictsManagementApi()Lcom/ss/android/ugc/aweme/shortvideo/conflicts/RecordConflictsManagementApi;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILLL = 8;
    }

    @Override // X.InterfaceC1655300tB2
    public void aJ() {
        C580120Mp8 c580120Mp8Ak;
        if (T2(1)) {
            return;
        }
        this.LLJILJIL.LIZJ(EnumC579880Mok.ON_UP);
        C09AE c09ae = this.LLIZLLLIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        if (this.LLJ.get() != -1) {
            InterfaceC1648570t0B interfaceC1648570t0BG2 = G2();
            if (interfaceC1648570t0BG2 != null && (c580120Mp8Ak = interfaceC1648570t0BG2.Ak()) != null) {
                c580120Mp8Ak.LIZIZ();
            }
            InterfaceC1648570t0B interfaceC1648570t0BG22 = G2();
            C1644050sst c1644050sst = new C1644050sst("record end");
            c1644050sst.LIZ = 5;
            interfaceC1648570t0BG22.h81(c1644050sst);
        } else {
            x71();
        }
        this.LLJ.set(-1L);
        X1().j8();
    }

    private final InterfaceC1648570t0B G2() {
        return (InterfaceC1648570t0B) this.LLILZIL.getValue(this, LLJILJILJ[2]);
    }

    private final InterfaceC1650190t2n X1() {
        return (InterfaceC1650190t2n) this.LLILZLL.getValue(this, LLJILJILJ[3]);
    }

    private final InterfaceC1648590t0D Z1() {
        return (InterfaceC1648590t0D) this.LLIZ.getValue(this, LLJILJILJ[4]);
    }

    private final C578810Mn1 w2() {
        return (C578810Mn1) this.LLJIJIL.getValue();
    }

    public final C578890Mn9 H2() {
        return (C578890Mn9) this.LLJI.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJILJILJ[1]);
    }

    @Override // X.InterfaceC1655300tB2
    public void iS() {
        this.LLJILJIL.LIZJ(EnumC579880Mok.ON_DOWN);
        this.LLIZLLLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C579860Moi(this, null), 3);
    }

    public final C19EG o2() {
        return (C19EG) this.LLILLL.getValue(this, LLJILJILJ[0]);
    }

    @Override // X.InterfaceC1655300tB2
    public void xa2() {
        InterfaceC579890Mol interfaceC579890MolFO2;
        this.LLJILJIL.LIZJ(EnumC579880Mok.INIT);
        H2().LIZLLL();
        InterfaceC1648590t0D interfaceC1648590t0DZ1 = Z1();
        if (interfaceC1648590t0DZ1 == null || (interfaceC579890MolFO2 = interfaceC1648590t0DZ1.FO2()) == null) {
            return;
        }
        interfaceC579890MolFO2.reset();
    }

    @Override // X.InterfaceC1655300tB2
    public long Oa0() {
        return C1458070o2v.LIZIZ() ? Math.min(X1().pw0().mMaxDuration, C1665860tS4.LIZIZ) : C1665860tS4.LIZIZ;
    }

    public final boolean W2() {
        InterfaceC579890Mol interfaceC579890MolFO2;
        InterfaceC1648590t0D interfaceC1648590t0DZ1 = Z1();
        if (interfaceC1648590t0DZ1 == null || (interfaceC579890MolFO2 = interfaceC1648590t0DZ1.FO2()) == null) {
            return false;
        }
        return interfaceC579890MolFO2.LIZIZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        G2().KA0(C579900Mom.class, new InterfaceC1650140t2i() { // from class: X.0MoE
            public final List<InterfaceC579700MoS> LIZ = new ArrayList();

            @Override // X.InterfaceC1650140t2i
            public final void LIZ(InterfaceC579700MoS interfaceC579700MoS) {
                ((ArrayList) this.LIZ).add(interfaceC579700MoS);
            }

            @Override // X.InterfaceC1650140t2i
            public final void LIZIZ(C0LZD c0lzd) {
                List<EmbaddedWindowInfo> list;
                List<InterfaceC579700MoS> list2 = this.LIZ;
                if (!(list2 instanceof Collection) || !((ArrayList) list2).isEmpty()) {
                    Iterator it2 = ((ArrayList) list2).iterator();
                    while (it2.hasNext()) {
                        if (((InterfaceC579700MoS) it2.next()).LIZ(c0lzd)) {
                            return;
                        }
                    }
                }
                if (this.LIZIZ.getShortVideoContext().cameraComponentModel.mTotalRecordingTime < 1000) {
                    this.LIZIZ.x71();
                    return;
                }
                final C578890Mn9 c578890Mn9H2 = this.LIZIZ.H2();
                if (MusicBeanUtilKt.extractAVMusic(c578890Mn9H2.LIZJ().creativeModel.musicBuzModel) == null && c578890Mn9H2.LIZJ().mIsFromDraft && c578890Mn9H2.LIZJ().creativeModel.musicBuzModel.isDraftMusicIllegal) {
                    c578890Mn9H2.LIZ().St2().E4(true);
                }
                C1655760tBm c1655760tBmQd1 = c578890Mn9H2.LIZ().qd1();
                c1655760tBmQd1.LIZ = c578890Mn9H2.LIZJ().cameraComponentModel.mWorkspace.LIZIZ().getPath();
                c1655760tBmQd1.LIZIZ = c578890Mn9H2.LIZJ().cameraComponentModel.mWorkspace.LIZ().getPath();
                c1655760tBmQd1.LJ = c578890Mn9H2.LIZ().St2().getMediaController();
                c1655760tBmQd1.LIZLLL = c578890Mn9H2.LIZJ().enableSingleSegmentConcatUseCopy;
                c1655760tBmQd1.LJI = !c578890Mn9H2.LIZJ().LJJJJLL();
                c1655760tBmQd1.LJII = VEMem.getInstance().inLowMemMode();
                SettingsManager.LIZLLL().getClass();
                c1655760tBmQd1.LJFF = SettingsManager.LIZ("pre_release_gpu_resource", false);
                String path = c578890Mn9H2.LIZJ().cameraComponentModel.mWorkspace.LIZIZ().getPath();
                Integer numValueOf = Integer.valueOf((int) c578890Mn9H2.LIZJ().cameraComponentModel.mTotalRecordingTime);
                Integer numValueOf2 = Integer.valueOf(c578890Mn9H2.LIZJ().cameraComponentModel.mVideoWidth);
                Integer numValueOf3 = Integer.valueOf(c578890Mn9H2.LIZJ().cameraComponentModel.mVideoHeight);
                if (c578890Mn9H2.LIZJ().LJJLL()) {
                    list = c578890Mn9H2.LIZJ().cameraComponentModel.duetContext.windowInfoList;
                } else {
                    list = null;
                }
                c1655760tBmQd1.LIZJ = C580200MpG.LIZIZ(path, numValueOf, numValueOf2, numValueOf3, list);
                c1655760tBmQd1.LIZ(new InterfaceC1656000tCA() { // from class: X.0MoH
                    @Override // X.InterfaceC1656000tCA
                    public final void LIZ(int i, String str, String str2, String str3) {
                        C579650MoN c579650MoN = new C579650MoN(str, str2, str3, i);
                        final C578890Mn9 c578890Mn9 = c578890Mn9H2;
                        c578890Mn9.LIZIZ().Ak().LIZ();
                        C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new C2325391G0r(c578890Mn9.LIZJ(), 1));
                        C11O8 c11o8LJJJLZIJ = C11NZ.LJIJJLI(new C581240Mqw(c578890Mn9.LIZJ(), c578890Mn9, str3, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                        C1701890uOB.LIZIZ(16, "initialCapacity");
                        C19501211Ri c19501211Ri = new C19501211Ri(c11o8LJJJLZIJ, 16);
                        C11NZ.LJLLJ(new C950560aqM(new InterfaceC941150abB() { // from class: X.0MoL
                            @Override // X.InterfaceC941150abB
                            public final Object LIZ(Object obj, Object obj2, Object obj3, Object obj4) {
                                IStoryCanvasVideoHelper iStoryCanvasVideoHelper;
                                AbstractC19852312lt abstractC19852312lt = (AbstractC19852312lt) obj;
                                AbstractC19852312lt abstractC19852312lt2 = (AbstractC19852312lt) obj2;
                                AbstractC19852312lt abstractC19852312lt3 = (AbstractC19852312lt) obj4;
                                if (abstractC19852312lt3.isPresent() && (iStoryCanvasVideoHelper = (IStoryCanvasVideoHelper) PluggableExtentionKt.pluggableSpi$default(IStoryCanvasVideoHelper.class, false, false, false, 14, null)) != null) {
                                    iStoryCanvasVideoHelper.LIZIZ(c578890Mn9.LIZJ(), (CanvasVideoData) abstractC19852312lt3.get());
                                }
                                return new C579660MoO(abstractC19852312lt, abstractC19852312lt2, obj3);
                            }
                        }), C11NN.LL, c19482711KfLJIJJLI, c19501211Ri, C11NZ.LJIJJLI(new C581220Mqu(c579650MoN, c578890Mn9, 6)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), c19501211Ri.LJJJ(new AkS472S0100000_8(c578890Mn9, 16), false).LJJJLZIJ(C1701940uOG.LIZIZ())).LJJLL(new AfS144S0200000_8(c578890Mn9, c579650MoN, 7), C2356409Le.LL);
                    }
                });
            }
        });
        G2().va0(C579900Mom.class);
    }

    @Override // X.InterfaceC1655300tB2
    public void x71() {
        C578810Mn1 c578810Mn1W2 = w2();
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(199);
        AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(200);
        c578810Mn1W2.getClass();
        aFwS194S0000000_8.getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C578710Mmr(c578810Mn1W2, aFwS194S0000000_82, null), 3);
        G2().oa0(new C1448290nn9(EnumC1448830no1.CLICK, 0, 0L, 14), false);
    }

    public C579870Moj W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1655300tB2
    public InterfaceC346201Wa<EnumC579880Mok> hY1() {
        return this.LLJILJIL;
    }

    public C579870Moj(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final boolean T2(int i) {
        InterfaceC579890Mol interfaceC579890MolFO2;
        InterfaceC1648590t0D interfaceC1648590t0DZ1 = Z1();
        if (interfaceC1648590t0DZ1 != null && (interfaceC579890MolFO2 = interfaceC1648590t0DZ1.FO2()) != null) {
            return interfaceC579890MolFO2.LIZ(i);
        }
        return false;
    }

    @Override // X.InterfaceC1655300tB2
    public void a12(long j, C1683130ttv c1683130ttv) {
        if (T2(2)) {
            return;
        }
        X1().Kg1(-Float.intBitsToFloat((int) (j & 4294967295L)), c1683130ttv.LIZIZ);
    }

    @Override // X.InterfaceC1655300tB2
    public void aa0(float f, long j) {
        if (T2(2)) {
            return;
        }
        X1().K3(C1378605aS.LIZLLL(j), f);
    }
}
