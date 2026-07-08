package X;

import X.InterfaceC1648570t0B;
import Y.AObjectS185S0300000_25;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS125S0100000_25;
import Y.ARunnableS36S0101000_25;
import Y.ARunnableS94S0200000_25;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.RxLiveEvent;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordFilterModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import pyl.s;

/* JADX INFO: renamed from: X.0tCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1656050tCF<T extends InterfaceC1648570t0B> extends AbstractC2255721DQs<T> implements InterfaceC379610EuV, InterfaceC1648570t0B {
    public static final C1656290tCd LLZZLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLZZZIL;
    public final C1DRG LL;
    public final C1656110tCL LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL;
    public final InterfaceC1731706qJ LLILZ;
    public final CameraComponentModel LLILZIL;
    public final SafeHandler LLILZLL;
    public final C560530Lyd<Unit> LLIZ;
    public final C560530Lyd<Unit> LLIZLLLIL;
    public final C560530Lyd<Unit> LLJ;
    public final C560530Lyd<C1656120tCM> LLJI;
    public final C560530Lyd<C1656120tCM> LLJIJIL;
    public final C560530Lyd<C579810Mod> LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C560530Lyd<Long> LLJILLL;
    public final C560530Lyd<Unit> LLJJ;
    public final C560530Lyd<C1656320tCg> LLJJI;
    public final C560530Lyd<Unit> LLJJIII;
    public final C560530Lyd<Unit> LLJJIJI;
    public final C560530Lyd<Unit> LLJJIJIIJIL;
    public final C560530Lyd<C579910Mon> LLJJIJIL;
    public final h0<C1649650t1v> LLJJJ;
    public final h0<C1649650t1v> LLJJJIL;
    public final C560530Lyd<C1644050sst> LLJJJJ;
    public final C560530Lyd<C1644050sst> LLJJJJJIL;
    public final C560530Lyd<C1644050sst> LLJJJJLIIL;
    public final C560530Lyd<C1644050sst> LLJJL;
    public final C560530Lyd<Unit> LLJJLIIIJLLLLLLLZ;
    public final C560530Lyd<TimeSpeedModelExtension> LLJL;
    public final C560530Lyd<Unit> LLJLIL;
    public final C560530Lyd<Unit> LLJLILLLLZIIL;
    public final C560530Lyd<C531060KsC> LLJLL;
    public final C560530Lyd<Long> LLJLLIL;
    public final C560530Lyd<C1448290nn9> LLJLLL;
    public final h0<Boolean> LLJZ;
    public final h0<Boolean> LLJZIJLIL;
    public final h0<Boolean> LLL;
    public final h0<Boolean> LLLF;
    public final h0<Boolean> LLLFF;
    public final h0<Boolean> LLLFFI;
    public final List<h0<Boolean>> LLLFZ;
    public final h0<Boolean> LLLI;
    public final h0<Long> LLLII;
    public final h0<Boolean> LLLIIII;
    public final Map<Class<Object>, InterfaceC1650140t2i> LLLIIIIL;
    public Class<Object> LLLIIIL;
    public InterfaceC579090MnT LLLIIL;
    public String LLLIILIL;
    public boolean LLLIL;
    public final boolean LLLILZ;
    public String LLLILZJ;
    public final C580120Mp8 LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public C1448290nn9 LLLLIIIILLL;
    public boolean LLLLIIL;
    public int LLLLIILL;
    public boolean LLLLIILLL;
    public final T LLLLIL;
    public Function0<Boolean> LLLLILI;
    public final C11RK<AbstractC1448530nnX> LLLLJ;
    public final LiveEvent<Unit> LLLLJI;
    public final LiveEvent<Unit> LLLLL;
    public final LiveEvent<Unit> LLLLLIL;
    public final LiveEvent<C1656120tCM> LLLLLILLIL;
    public final LiveEvent<C1656120tCM> LLLLLJIL;
    public final C385670FAf<Boolean> LLLLLJLJLL;
    public final C385670FAf<Boolean> LLLLLL;
    public final h0<Boolean> LLLLLLIL;
    public final C385670FAf<Boolean> LLLLLLJ;
    public final C385670FAf<Boolean> LLLLLLL;
    public final C385670FAf<Boolean> LLLLLLLLL;
    public final C385670FAf<Boolean> LLLLLLLLLL;
    public final C385670FAf<Boolean> LLLLLLLZIL;
    public final C560530Lyd<Boolean> LLLLLLZ;
    public final C560530Lyd<String> LLLLLLZZ;
    public final C560530Lyd<List<Pair<String, String>>> LLLLLZ;
    public InterfaceC1648680t0M LLLLLZIL;
    public final C01GW LLLLLZL;
    public final LiveEvent<Long> LLLLZ;
    public final LiveEvent<Unit> LLLLZI;
    public final LiveEvent<C1656320tCg> LLLLZIL;
    public final LiveEvent<Unit> LLLLZLL;
    public final LiveEvent<Unit> LLLLZLLIL;
    public final C11RK<AbstractC1656240tCY> LLLLZLLLI;
    public final LiveEvent<C579910Mon> LLLZ;
    public final C560530Lyd<Boolean> LLLZI;
    public final LiveEvent<Unit> LLLZIIL;
    public final LiveEvent<C531060KsC> LLLZIL;
    public final LiveEvent<Long> LLLZL;
    public final LiveEvent<C1644050sst> LLLZLL;
    public final LiveEvent<C1448290nn9> LLLZLZ;
    public final LiveEvent<C1644050sst> LLLZZ;
    public final LiveEvent<C1644050sst> LLLZZIL;
    public final LiveEvent<C1644050sst> LLZ;
    public final LiveEvent<Unit> LLZIL;
    public final C385670FAf<C1649650t1v> LLZILL;
    public final C385670FAf<C1649650t1v> LLZL;
    public final LiveEvent<TimeSpeedModelExtension> LLZLI;
    public final LiveEvent<C579810Mod> LLZLL;
    public final LiveEvent<Unit> LLZLLIL;
    public long LLZLLLL;
    public long LLZZ;
    public C1656050tCF<T>.d LLZZJLIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0tCd] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1656050tCF.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        C13LE.LIZ.getClass();
        LLZZZIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1656050tCF.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
        LLZZLLIL = new Object() { // from class: X.0tCd
        };
    }

    private final void c3() {
        V2(false);
    }

    @Override // X.InterfaceC1648570t0B
    public void DW1(InterfaceC1648680t0M interfaceC1648680t0M) {
    }

    @Override // X.InterfaceC1648570t0B
    public void Ek2() {
        ko0(false);
    }

    @Override // X.InterfaceC1648570t0B
    public void M00() {
        this.LLZZJLIL = null;
        this.LLZLLLL = 0L;
        this.LLZZ = 0L;
    }

    public void U5() {
    }

    @Override // X.InterfaceC1648570t0B
    public InterfaceC1648680t0M eM() {
        return null;
    }

    public NewGreenScreenEffectModel n5() {
        return null;
    }

    private final C1656080tCI C5() {
        return (C1656080tCI) this.LLLJL.getValue();
    }

    private final C1623740sM8 K4() {
        return (C1623740sM8) this.LLLLII.getValue();
    }

    private final C1656150tCP P4() {
        return (C1656150tCP) this.LLLJ.getValue();
    }

    private final boolean S6() {
        return !this.LLLFZ.isEmpty();
    }

    private final C1656060tCG Z4() {
        return (C1656060tCG) this.LLLL.getValue();
    }

    @Override // X.InterfaceC1648570t0B
    public void GB0() {
        this.LLJJIJIIJIL.LJIIJ(Unit.LIZ);
    }

    public final void H3() {
        this.LLILZLL.post(new ARunnableS125S0100000_25(this, 37));
    }

    public final C19GS H4() {
        return (C19GS) this.LLILLL.getValue(this, LLZZZIL[0]);
    }

    @Override // X.InterfaceC1648570t0B
    public void I82() {
        this.LLJ.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1648570t0B
    public long Ju() {
        return this.LLLII.LIZJ().longValue();
    }

    @Override // X.InterfaceC1648570t0B
    public void KQ() {
        this.LLJLIL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1648570t0B
    public void Ll0() {
        this.LLJJIII.LJIIJ(Unit.LIZ);
    }

    public final void W2() {
        this.LLIZLLLIL.LJIIJ(Unit.LIZ);
    }

    public final InterfaceC1650230t2r getCameraApi() {
        return (InterfaceC1650230t2r) this.LLILZ.getValue(this, LLZZZIL[1]);
    }

    public final h0<Boolean> k5() {
        return (h0) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> nZ() {
        return (C385670FAf) this.LLLLLZL.getValue();
    }

    public final void q3() {
        if (this.LLILZIL.isRetakeMode) {
            return;
        }
        this.LLLLLLIL.LJII(Boolean.FALSE);
    }

    @Override // X.InterfaceC1648570t0B
    public void rW0() {
        this.LLJILJIL.LJIIJ(new C579810Mod(true));
    }

    public final C1656050tCF<T>.c t5() {
        return (c) this.LLLIZZ.getValue();
    }

    @Override // X.InterfaceC1648570t0B
    public C11NZ<AbstractC1656240tCY> uM2() {
        C11RK<AbstractC1656240tCY> c11rk = this.LLLLZLLLI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final C1656070tCH x5() {
        return (C1656070tCH) this.LLLJIL.getValue();
    }

    @Override // X.InterfaceC1648570t0B
    public void xs2() {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C571740Mbc(this, null), 2);
    }

    @Override // X.InterfaceC1648570t0B
    public C11NZ<AbstractC1448530nnX> yu0() {
        C11RK<AbstractC1448530nnX> c11rk = this.LLLLJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    private final int LJLJJLL() {
        return getCameraApi().LJLJJLL();
    }

    private final String Th2() {
        return getCameraApi().Th2();
    }

    private final InterfaceC2254081DKk Z1() {
        return getCameraApi().St2();
    }

    private final s o2() {
        return getCameraApi().getSpeed();
    }

    private final InterfaceC2254081DKk u6() {
        return getCameraApi().St2();
    }

    public final void F4() {
        C2219091BtD.LIZLLL().d("forceStopRecord() called");
        if (!Jv2().LIZJ().booleanValue() || Un1().LIZJ().booleanValue()) {
            C2219091BtD.LIZLLL().d("real forceStopRecord() called");
            C1644050sst c1644050sst = new C1644050sst("forceStopRecord");
            c1644050sst.LIZIZ = true;
            h81(c1644050sst);
            C1623740sM8 c1623740sM8K4 = K4();
            C0TBG c0tbg = C0TBG.LIZ;
            c1623740sM8K4.getClass();
            C1623740sM8.LIZ(c0tbg);
        }
    }

    public final void O3() {
        BackgroundVideo backgroundVideo;
        BackgroundVideo backgroundVideo2;
        C1656150tCP c1656150tCPP4 = P4();
        BackgroundVideo backgroundVideo3 = c1656150tCPP4.LIZIZ.curBackgroundVideo;
        if ((backgroundVideo3 == null || !backgroundVideo3.isDefaultBgVideo()) && (backgroundVideo = c1656150tCPP4.LIZIZ.curBackgroundVideo) != null) {
            long maxDuration = backgroundVideo.getMaxDuration();
            if (maxDuration <= 0 || (backgroundVideo2 = c1656150tCPP4.LIZIZ.curBackgroundVideo) == null || backgroundVideo2.isMultiBgVideo()) {
                return;
            }
            long jMin = c1656150tCPP4.LIZIZ.mTotalRecordingTime + Math.min(c1656150tCPP4.LIZJ.LIZ(c1656150tCPP4.LIZIZ), maxDuration);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeShootDuration maxDuration=");
            sbLIZ.append(jMin);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            c1656150tCPP4.LIZIZ.mMaxDuration = jMin;
            c1656150tCPP4.LIZ.ht1(new C531060KsC(jMin));
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void b32() {
        Z1().ih(t5());
    }

    public final void m3() {
        InterfaceC1656350tCj interfaceC1656350tCj;
        if (!ue2().invoke().booleanValue() || (interfaceC1656350tCj = this.LLILLJJLI.LJII) == null) {
            return;
        }
        interfaceC1656350tCj.run();
    }

    public final InterfaceC576950Mk1 o7() {
        return getCameraApi().yP();
    }

    @Override // X.InterfaceC1648570t0B
    public void oB0() {
        InterfaceC576950Mk1 interfaceC576950Mk1O7 = o7();
        C2216191BoX.LIZ.getClass();
        ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ().LIZ(Log.getStackTraceString(new Throwable()));
        int size = this.LLILZIL.LIZIZ().size();
        for (int i = 0; i < size; i++) {
            Z1().S4(null, AFwS266S0000000_25.get$arr$(149));
        }
        C0VSJ c0vsj = new C0VSJ(this.LLILZIL.mWorkspace.LJ().getPath());
        C01GW c01gw = C272470Am5.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue()) {
            C2286708xd.LJIILLIIL(c0vsj);
        }
        CameraComponentModel cameraComponentModel = this.LLILZIL;
        if (cameraComponentModel.mRestoreType != 1 && !cameraComponentModel.isRetakeMode) {
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                ((C1656090tCJ) interfaceC576950Mk1O7).LJIIJJI.resetData();
            } else {
                ((C1656090tCJ) interfaceC576950Mk1O7).LJIIJJI.removeFileAndResetData();
            }
        }
        C1656090tCJ c1656090tCJ = (C1656090tCJ) interfaceC576950Mk1O7;
        c1656090tCJ.LJIIL = false;
        c1656090tCJ.LJIIJJI = new ExtractFramesModel(c1656090tCJ.LIZIZ);
        c1656090tCJ.LJIILIIL = UUID.randomUUID().toString();
        ScheduledExecutorService scheduledExecutorService = c1656090tCJ.LJIIZILJ;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getCameraApi().HE2().LIZ(this, new AObjectS246S0100000_25(this, 173));
        this.LLLIIII.LIZ(this, new AObjectS246S0100000_25(this, 174));
        getCameraApi().Wt0().LIZ(this, new AObjectS246S0100000_25(this, 175));
        getCameraApi().DS1().LIZ(this, new AObjectS246S0100000_25(this, 176));
        Z1().gh(new AwS604S0100000_25(this, 169));
        ko0(false);
        this.LLLIL = true;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        F4();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        ko0(false);
        this.LLLIL = true;
    }

    @Override // X.InterfaceC1648570t0B
    public void qK() {
        Z1().lh(t5());
    }

    @Override // X.InterfaceC1648570t0B
    public C580120Mp8 Ak() {
        return this.LLLILZLLLI;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C579910Mon> Ba0() {
        return this.LLLZ;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C531060KsC> Bp2() {
        return this.LLLZIL;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> Cv0() {
        return this.LLLLLLLZIL;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> Dn2() {
        return this.LLLLLLLLL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1448290nn9> EP() {
        return this.LLLZLZ;
    }

    @Override // X.InterfaceC1648570t0B
    public C560530Lyd<List<Pair<String, String>>> Hu2() {
        return this.LLLLLZ;
    }

    @Override // X.InterfaceC1648570t0B
    public Class<Object> IV() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> Ia0() {
        return this.LLLLZI;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> Jv2() {
        return this.LLLLLJLJLL;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> Ka2() {
        return this.LLLLLLL;
    }

    @Override // X.InterfaceC1648570t0B
    public C560530Lyd<String> LH0() {
        return this.LLLLLLZZ;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Long> NT() {
        return this.LLLLZ;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<C1649650t1v> Nw0() {
        return this.LLZL;
    }

    @Override // X.AbstractC2255721DQs
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public T getApiComponent() {
        return this.LLLLIL;
    }

    public C560530Lyd<Boolean> R5() {
        return this.LLLLLLZ;
    }

    @Override // X.InterfaceC1648570t0B
    public /* bridge */ /* synthetic */ LiveEvent Rm() {
        return this.LLLLLLZ;
    }

    public final C1656110tCL T4() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> Un1() {
        return this.LLLLLLLLLL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> Vt0() {
        return this.LLZIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Long> Xs1() {
        return this.LLLZL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> Y91() {
        return this.LLLZIIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1656120tCM> cJ0() {
        return this.LLLLLILLIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1644050sst> ca2() {
        return this.LLLZZIL;
    }

    public h0<Boolean> d5() {
        return this.LLLLLLIL;
    }

    @Override // X.InterfaceC1648570t0B
    public /* bridge */ /* synthetic */ C385670FAf ec() {
        return this.LLLLLLIL;
    }

    @Override // X.InterfaceC1648570t0B
    public /* bridge */ /* synthetic */ LiveEvent fx() {
        return this.LLLZI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> isLoading() {
        return this.LLLLLLJ;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<Boolean> isRecording() {
        return this.LLLLLL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1644050sst> kT0() {
        return this.LLLZZ;
    }

    @Override // X.InterfaceC1648570t0B
    public String lB() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1656120tCM> lC2() {
        return this.LLLLLJIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> me2() {
        return this.LLLLJI;
    }

    @Override // X.InterfaceC1648570t0B
    public boolean pF1() {
        return this.LLLILZ;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> pT() {
        return this.LLLLZLLIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1644050sst> pU1() {
        return this.LLZ;
    }

    public final CameraComponentModel pw0() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1656320tCg> qK0() {
        return this.LLLLZIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> rr0() {
        return this.LLLLLIL;
    }

    @Override // X.InterfaceC1648570t0B
    public String sQ0() {
        return this.LLLILZJ;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> sb0() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> tQ0() {
        return this.LLZLLIL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> tl1() {
        return this.LLLLL;
    }

    @Override // X.InterfaceC1648570t0B
    public Function0<Boolean> ue2() {
        return this.LLLLILI;
    }

    public C560530Lyd<Boolean> v5() {
        return this.LLLZI;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C1644050sst> xM2() {
        return this.LLLZLL;
    }

    @Override // X.InterfaceC1648570t0B
    public C385670FAf<C1649650t1v> xk1() {
        return this.LLZILL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<C579810Mod> yK0() {
        return this.LLZLL;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<TimeSpeedModelExtension> yM2() {
        return this.LLZLI;
    }

    @Override // X.InterfaceC1648570t0B
    public LiveEvent<Unit> zx2() {
        return this.LLLLZLL;
    }

    @Override // X.InterfaceC1648570t0B
    /* JADX INFO: renamed from: Ju */
    public C385670FAf<Long> mo60Ju() {
        return this.LLLII;
    }

    /* JADX INFO: renamed from: X.0tCF$c */
    public final class c implements InterfaceC1652830t73 {
        public long LL = -100;

        public c() {
        }

        @Override // X.InterfaceC1464200oCo
        public final void onCallback(int i, int i2, float f, String str) {
            if (i != VEInfo.TE_RECORD_INFO_RECORDING_CLIP_TIMESTAMP) {
                return;
            }
            final long j = (long) (f / LSPassThroughRecordSizeConfig.DEFAULT);
            if (j != this.LL && j != 0) {
                this.LL = j;
                final C1656050tCF<T> c1656050tCF = C1656050tCF.this;
                c1656050tCF.LLILZLL.post(new Runnable() { // from class: X.0tCQ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("RecordControlCoreComponent$OnRecordInfoListener@22a1.onCallback$1");
                        try {
                            c1656050tCF.k7(j);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("RecordControlCoreComponent$OnRecordInfoListener@22a1.onCallback$1");
                    }
                });
            }
        }
    }

    private final void K6(String str) {
        int flashMode;
        if (getCameraApi().NS0()) {
            flashMode = getCameraApi().re1();
        } else {
            flashMode = getCameraApi().getFlashMode();
        }
        if (LJLJJLL() == 1) {
            if (flashMode != 0) {
                if (flashMode != 1) {
                    if (flashMode == 2) {
                        this.LLJJI.LJIIJ(new C1656320tCg());
                        return;
                    }
                    return;
                }
                this.LLJJI.LJIIJ(new C1656320tCg());
                return;
            }
            this.LLJJI.LJIIJ(new C1656320tCg());
            return;
        }
        if (flashMode != 0) {
            if (flashMode != 1) {
                if (flashMode != 2) {
                    return;
                }
                C560530Lyd<C1656320tCg> c560530Lyd = this.LLJJI;
                getCameraApi().fp1();
                c560530Lyd.LJIIJ(new C1656320tCg());
                return;
            }
            C560530Lyd<C1656320tCg> c560530Lyd2 = this.LLJJI;
            getCameraApi().fp1();
            c560530Lyd2.LJIIJ(new C1656320tCg());
            return;
        }
        this.LLJJI.LJIIJ(new C1656320tCg());
    }

    private final boolean P6(long j) {
        long jJu = Ju();
        if (jJu > 0 && jJu < this.LLILZIL.LIZLLL() && j > jJu) {
            return true;
        }
        return false;
    }

    private final long X1(long j) {
        long jCalculateRealTime;
        long jLIZJ;
        if (this.LLILZIL.recordMode == 1) {
            jCalculateRealTime = TimeSpeedModelExtension.calculateRealTime(j, s.NORMAL.value());
            jLIZJ = this.LLILZIL.LIZJ();
        } else {
            jCalculateRealTime = TimeSpeedModelExtension.calculateRealTime(j, o2().value());
            jLIZJ = this.LLILZIL.LIZJ();
        }
        return jCalculateRealTime + jLIZJ;
    }

    @Override // X.InterfaceC1648570t0B
    public void Ax(C1644050sst c1644050sst) {
        Z4().onEvent(c1644050sst);
    }

    public final void B3(C1656120tCM c1656120tCM) {
        if (!this.LLILLJJLI.LJIIL.invoke().booleanValue()) {
            qK();
        }
        getCameraApi().Zi1();
        c1656120tCM.LJI.putInt("cameraId", LJLJJLL());
        C786410Ut5.LJJJI("cameraLensInfo", Th2(), c1656120tCM.LJI);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set hasStopped to false, cur Speed: ");
        sbLIZ.append(c1656120tCM.LIZ);
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJI.LJIIJ(c1656120tCM);
        C1441190nbh c1441190nbhLIZIZ = c1656120tCM.LIZLLL;
        if (c1441190nbhLIZIZ == null) {
            c1441190nbhLIZIZ = this.LLILZIL.LIZIZ();
        }
        c1441190nbhLIZIZ.begin(c1656120tCM.LIZ, c1656120tCM.LJI, c1656120tCM.LJII);
    }

    @Override // X.InterfaceC1648570t0B
    public void Db2(String str) {
        if (Jv2().LIZJ().booleanValue() && !this.LLJZIJLIL.LIZJ().booleanValue()) {
            Sf0(new C0LZD("click_next"));
            return;
        }
        if (Jv2().LIZJ().booleanValue()) {
            return;
        }
        if (str == null) {
            str = "handleGoNext";
        }
        C1644050sst c1644050sst = new C1644050sst(str);
        c1644050sst.LIZ = 4;
        h81(c1644050sst);
    }

    public final void E3(C1644050sst c1644050sst) {
        RecordFilterModel recordFilterModel;
        List<String> list;
        C1441200nbi c1441200nbi;
        SavePhotoStickerInfo savePhotoStickerInfo;
        AIGCInfo aIGCInfoCopy;
        C385670FAf<FilterBean> c385670FAfI70;
        FilterBean filterBeanLIZJ;
        Object objValueOf;
        InterfaceC1452660nuC interfaceC1452660nuC;
        if (getCameraApi().fp1()) {
            getCameraApi().qh(0);
        }
        getCameraApi().X8(true);
        this.LLJJJJJIL.LJIIJ(c1644050sst);
        long endFrameTimeUS = Z1().getEndFrameTimeUS() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long jEnd = 0;
        List<String> list2 = null;
        if (endFrameTimeUS >= 0) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "fix_record_filter_model_value_incorrect", true) == 1) {
                InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) getDiContainer().LJIIL(null, InterfaceC1644770su3.class);
                if (interfaceC1644770su3 != null && (c385670FAfI70 = interfaceC1644770su3.i70()) != null && (filterBeanLIZJ = c385670FAfI70.LIZJ()) != null) {
                    String enName = filterBeanLIZJ.getEnName();
                    C1643870ssb value = interfaceC1644770su3.RT().getValue();
                    if (value != null && (interfaceC1452660nuC = value.LIZJ) != null) {
                        objValueOf = Float.valueOf(C1453230nv7.LJIIIIZZ(filterBeanLIZJ, interfaceC1452660nuC));
                    } else {
                        objValueOf = 0;
                    }
                    String id = filterBeanLIZJ.getId();
                    id.toString();
                    recordFilterModel = new RecordFilterModel(id, enName, objValueOf.toString(), filterBeanLIZJ.getCategoryKey());
                } else {
                    recordFilterModel = null;
                }
            } else {
                recordFilterModel = new RecordFilterModel(this.LLILZIL.recordContext.filterIds.getLastOrNull(), this.LLILZIL.recordContext.filterLabels.getLastOrNull(), this.LLILZIL.recordContext.filterValues.getLastOrNull(), this.LLILZIL.recordContext.filterCategoryKeys.getLastOrNull());
            }
            C1441190nbh c1441190nbhLIZIZ = c1644050sst.LJII;
            if (c1441190nbhLIZIZ == null) {
                c1441190nbhLIZIZ = this.LLILZIL.LIZIZ();
            }
            C1623010sKx c1623010sKx = c1644050sst.LIZJ;
            if (c1623010sKx != null) {
                list2 = c1623010sKx.LIZ;
                list = c1623010sKx.LIZIZ;
                c1441200nbi = c1623010sKx.LIZLLL;
                savePhotoStickerInfo = c1623010sKx.LIZJ;
            } else {
                list = null;
                c1441200nbi = null;
                savePhotoStickerInfo = null;
            }
            CameraComponentModel cameraComponentModel = this.LLILZIL;
            BackgroundVideo backgroundVideo = cameraComponentModel.curBackgroundVideo;
            DiyPropVideo diyPropVideo = cameraComponentModel.curDiyPropVideo;
            String str = ((C1656090tCJ) getCameraApi().yP()).LJIILLIIL;
            Bundle bundle = c1644050sst.LIZLLL;
            List<AIGCInfo> listLLIIII = C13LP.LLIIII(this.LLILZIL.greenScreenSourceInfos);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
            for (AIGCInfo aIGCInfo : listLLIIII) {
                if (aIGCInfo != null) {
                    aIGCInfoCopy = aIGCInfo.copy(aIGCInfo.type, aIGCInfo.c2paPath, aIGCInfo.resultJson, aIGCInfo.mediaSystemId, aIGCInfo.imageWatermarkPath, aIGCInfo.isImageResource, aIGCInfo.errorCode, aIGCInfo.etMap, aIGCInfo.bucketTaskId, aIGCInfo.isAudioResource, aIGCInfo.extraElementC2pas, aIGCInfo.containFormatList, aIGCInfo.aiGeneratedSource, aIGCInfo.isFullyAIGC, aIGCInfo.isMinorEdit, aIGCInfo.albumAigc, aIGCInfo.isV2Format);
                } else {
                    aIGCInfoCopy = null;
                }
                arrayList.add(aIGCInfoCopy);
            }
            jEnd = c1441190nbhLIZIZ.end(endFrameTimeUS, null, list2, list, c1441200nbi, savePhotoStickerInfo, backgroundVideo, diyPropVideo, str, bundle, arrayList, n5(), recordFilterModel);
            this.LLJJJJLIIL.LJIIJ(c1644050sst);
            Float value2 = getCameraApi().Tz1().getValue();
            if (value2 != null && value2.floatValue() != -1.0f) {
                this.LLILZIL.latestUsedZoomValue = value2.floatValue();
            }
            C2219091BtD.LIZLLL().i("stopRecord: video: duration of this segment: " + jEnd);
            if (c1644050sst.LJII == null) {
                CameraComponentModel cameraComponentModel2 = this.LLILZIL;
                long jLIZJ = cameraComponentModel2.LIZJ() + jEnd;
                if (cameraComponentModel2.isRetakeMode) {
                    cameraComponentModel2.mRetakeTime = jLIZJ;
                } else {
                    cameraComponentModel2.mTotalRecordingTime = jLIZJ;
                }
            }
            C2219091BtD.LIZLLL().i("stopRecord: video: curShootingTotalTime: " + this.LLILZIL.LIZJ());
            if (jEnd == -1) {
                try {
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("deleteLastFrag for VE without changing segments for client.reason:");
                    sbLIZ.append(c1644050sst.LJFF);
                    sbLIZ.append(",recordState:");
                    sbLIZ.append(c1644050sst.LIZ);
                    sbLIZ.append(", segments: ");
                    sbLIZ.append(this.LLILZIL.LIZIZ());
                    interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
                    Z1().S4(null, AFwS266S0000000_25.get$arr$(150));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            H2(new C1448490nnT(endFrameTimeUS));
        }
        N5(c1644050sst, jEnd);
        this.LLJJL.LJIIJ(c1644050sst);
        tu0(c1644050sst);
    }

    public final void E5(C0LZD c0lzd) {
        this.LLILZLL.post(new ARunnableS94S0200000_25(this, c0lzd, 8));
    }

    public final void G2(TimeSpeedModelExtension timeSpeedModelExtension) {
        this.LLJL.LJIIJ(timeSpeedModelExtension);
    }

    public final void H2(AbstractC1448530nnX abstractC1448530nnX) {
        this.LLLLJ.onNext(abstractC1448530nnX);
        if (abstractC1448530nnX instanceof C1448550nnZ) {
            getCameraApi().yj1().LIZ(this, new AObjectS306S0200000_25((Object) this, (Object) abstractC1448530nnX, (InterfaceC1648570t0B) 5));
        }
    }

    public final void H5(C0LZD c0lzd) {
        if (S6()) {
            return;
        }
        this.LLLI.LJII(Boolean.FALSE);
        if (this.LLLIIIIL.get(this.LLLIIIL) != null) {
            this.LLLIIIIL.get(this.LLLIIIL).LIZIZ(c0lzd);
        } else {
            C2219091BtD.LIZLLL().i("RecordControl goNext nextActionMap curActionType is null");
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void IB2(boolean z) {
        this.LLLI.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void Iv2(InterfaceC579090MnT interfaceC579090MnT) {
        this.LLLIIL = interfaceC579090MnT;
    }

    public final void J6(int i) {
        H2(new C1448510nnV(i));
        if (this.LLILLJJLI.LIZJ) {
            this.LLILZLL.post(new ARunnableS36S0101000_25(i, this, 0));
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void JJ(String str) {
        m6(this, true, false, 2, null);
        K6(str);
    }

    public final void L6(boolean z) {
        this.LLJZ.LJII(Boolean.valueOf(z));
    }

    public final void M5(Function1<? super InterfaceC1650140t2i, Unit> function1) {
        if (S6()) {
            return;
        }
        this.LLLI.LJII(Boolean.FALSE);
        function1.invoke(this.LLLIIIIL.get(this.LLLIIIL));
    }

    public final void N6(boolean z) {
        this.LLJZIJLIL.LJII(Boolean.valueOf(!z));
    }

    @Override // X.InterfaceC1648570t0B
    public void PN1(boolean z) {
        this.LLLFF.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void QK2(boolean z) {
        this.LLLLIILLL = z;
    }

    public boolean S5(long j) {
        if (j >= this.LLILZIL.LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1648570t0B
    public void Sf0(C0LZD c0lzd) {
        Workspace workspace;
        File[] fileArrYm;
        String path;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_recorder_editor_first_frame_optimization", true, false) && (workspace = this.LLILZIL.mWorkspace) != null && (fileArrYm = workspace.LL.Ym()) != null) {
            C2219091BtD.LIZLLL().i("RecordControl goNext: notifyWillEnterEditor");
            if (fileArrYm.length != 0 && (path = fileArrYm[0].getPath()) != null && path.length() != 0) {
                VERuntime.getInstance().notifyWillEnterEditor(fileArrYm[0].getPath());
            }
        }
        Boolean boolLIZJ = this.LLL.LIZJ();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolLIZJ, bool)) {
            return;
        }
        U5();
        System.currentTimeMillis();
        c0lzd.getClass();
        C580120Mp8 c580120Mp8Ak = Ak();
        c580120Mp8Ak.LIZ = C580140MpA.LIZ(c580120Mp8Ak.LIZ, 0L, 0L, c0lzd.LIZ, 3);
        this.LLLIL = false;
        this.LLL.LJII(bool);
        if (this.LLLF.LIZJ().booleanValue() && this.LLLFF.LIZJ().booleanValue() && this.LLLFFI.LIZJ().booleanValue()) {
            if (this.LLILZIL.LJFF()) {
                Z1().setMusicPath(this.LLILZIL.getMusicPath());
            }
            InterfaceC1650140t2i interfaceC1650140t2i = this.LLLIIIIL.get(this.LLLIIIL);
            if (interfaceC1650140t2i != null) {
                interfaceC1650140t2i.LIZIZ(c0lzd);
                return;
            }
            return;
        }
        this.LLLFZ.clear();
        e4(this, this.LLLF, c0lzd, false, 4, null);
        Q3(this.LLLFF, c0lzd, true);
        Q3(this.LLLFFI, c0lzd, true);
    }

    public final void T2(C1649650t1v c1649650t1v) {
        C1656120tCM c1656120tCMLJI;
        this.LLJJJIL.LJII(c1649650t1v);
        if (c1649650t1v != null) {
            if ((c1649650t1v.LIZIZ > 0 || this.LLILZIL.isRetakeMode) && ((c1656120tCMLJI = this.LLJIJIL.LJI()) == null || c1656120tCMLJI.LIZLLL == null)) {
                this.LLLLLLIL.LJII(Boolean.TRUE);
            }
            C1649650t1v.LJ.LIZ(c1649650t1v);
        }
    }

    public final void T6(C1656120tCM c1656120tCM) {
        C2219091BtD.LIZLLL().i("startRecordingAfterPrePlayStopped");
        x5().onEvent(c1656120tCM);
        l72(this.LLILZIL.mCurrentDurationMode, true);
        getCameraApi().w61(new C1648160szW(4));
        this.LLJIJIL.LJIIJ(c1656120tCM);
        if (c1656120tCM.LIZLLL == null) {
            this.LLLLLLIL.LJII(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void Um(boolean z) {
        this.LLLLLLZ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void V2(boolean z) {
        k5().LJII(Boolean.valueOf(z));
    }

    public final void W1(C1448290nn9 c1448290nn9) {
        InterfaceC1656370tCl interfaceC1656370tCl = this.LLILLJJLI.LIZLLL;
        if (interfaceC1656370tCl != null) {
            Z1();
            new AwS426S0200000_25((C1656050tCF) this, c1448290nn9, (C1448290nn9) 56);
            interfaceC1656370tCl.LIZ();
        }
        W6(c1448290nn9);
    }

    public final void W6(C1448290nn9 c1448290nn9) {
        C1656120tCM c1656120tCM = new C1656120tCM(o2());
        if (c1448290nn9 != null) {
            c1656120tCM.LIZIZ = c1448290nn9.LIZIZ;
            c1656120tCM.LIZJ = c1448290nn9.LIZJ;
        }
        mE1(c1656120tCM);
    }

    @Override // X.InterfaceC1648570t0B
    public void bw0(Function0<Boolean> function0) {
        this.LLLLILI = function0;
    }

    @Override // X.InterfaceC1648570t0B
    public void bz(boolean z) {
        this.LLLIIII.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void cV0(boolean z) {
        InterfaceC383290F1b interfaceC383290F1b = this.LLILZIL.retakeVideoContext;
        boolean z2 = false;
        if (interfaceC383290F1b != null && ((RetakeVideoContext) interfaceC383290F1b).isAddClips) {
            z2 = true;
        }
        jJ1(!z2);
        this.LLJILJIL.LJIIJ(new C579810Mod(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void h81(C1644050sst c1644050sst) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordControl stopRecord, isRecordModeConfirmed=");
        sbLIZ.append(this.LLLLIIL);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLLLIIL && !Intrinsics.LJFF(c1644050sst.LJFF, "AIGC reset record")) {
            C1448290nn9 c1448290nn9 = this.LLLLIIIILLL;
            if (c1448290nn9 == null) {
                c1448290nn9 = new C1448290nn9(EnumC1448830no1.PRESS, 0, 0L, 14);
            }
            oa0(c1448290nn9, false);
        }
        long j = this.LLZZ;
        if (j > 0) {
            this.LLZZJLIL = new d(j, this.LLZLLLL);
        }
        this.LLZLLLL = 0L;
        this.LLZZ = 0L;
        C5().onEvent(c1644050sst);
    }

    @Override // X.InterfaceC1648570t0B
    public void ht1(C531060KsC c531060KsC) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMaxRecordDuration ");
        sbLIZ.append(c531060KsC.LIZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLL.LJIIJ(c531060KsC);
    }

    public final void i3(C1649650t1v c1649650t1v) {
        C1656120tCM c1656120tCMLJI;
        this.LLJJJ.LJII(c1649650t1v);
        if (c1649650t1v != null) {
            if ((c1649650t1v.LIZIZ > 0 || this.LLILZIL.isRetakeMode) && ((c1656120tCMLJI = this.LLJIJIL.LJI()) == null || c1656120tCMLJI.LIZLLL == null)) {
                this.LLLLLLIL.LJII(Boolean.TRUE);
            }
            C1649650t1v.LJ.LIZ(c1649650t1v);
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void it0(String str) {
        this.LLLILZJ = str;
    }

    @Override // X.InterfaceC1648570t0B
    public void jJ1(boolean z) {
        v3(C1656250tCZ.LIZ);
        this.LLILZIL.mWorkspace.LL.eb();
        if (z) {
            oB0();
        }
        this.LLILZIL.LIZIZ().clear();
        CameraComponentModel cameraComponentModel = this.LLILZIL;
        if (cameraComponentModel.isRetakeMode) {
            cameraComponentModel.mRetakeTime = 0L;
        } else {
            cameraComponentModel.mTotalRecordingTime = 0L;
        }
        M00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k7(long r11) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1656050tCF.k7(long):boolean");
    }

    @Override // X.InterfaceC1648570t0B
    public void ko0(boolean z) {
        this.LLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void l60(C1448290nn9 c1448290nn9) {
        C2219091BtD.LIZLLL().i("RecordControl dispatchStartRecording");
        this.LLLLIIIILLL = c1448290nn9;
        InterfaceC579090MnT interfaceC579090MnT = this.LLLIIL;
        if (interfaceC579090MnT != null) {
            interfaceC579090MnT.LIZ(new AwS426S0200000_25((C1656050tCF) this, c1448290nn9, (C1448290nn9) 58));
        } else {
            W1(c1448290nn9);
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void ld1(C1649650t1v c1649650t1v) {
        T2(c1649650t1v);
    }

    @Override // X.InterfaceC1648570t0B
    public void mE1(C1656120tCM c1656120tCM) {
        C2219091BtD.LIZLLL().i("RecordControl startRecording");
        this.LLLLIIL = false;
        m6(this, false, false, 3, null);
        this.LLIZ.LJIIJ(null);
        if (getCameraApi().St2().getMediaController().m5()) {
            C2219091BtD.LIZLLL().i("startRecording but is pre playing wait for preplay stop");
            getCameraApi().St2().getMediaController().F5().observe(this, new AObjectS306S0200000_25((Object) this, (Object) c1656120tCM, (InterfaceC1648570t0B) 4));
        } else {
            T6(c1656120tCM);
        }
    }

    public final void n7(long j) {
        long jCalculateRealTime;
        C1656050tCF<T>.d dVar = this.LLZZJLIL;
        if (dVar != null) {
            jCalculateRealTime = (C1656050tCF.this.LLILZIL.LIZJ() + dVar.LIZ) - dVar.LIZIZ;
        } else {
            CameraComponentModel cameraComponentModel = this.LLILZIL;
            if (cameraComponentModel.isRetakeMode) {
                jCalculateRealTime = cameraComponentModel.mRetakeTime;
            } else {
                jCalculateRealTime = cameraComponentModel.mTotalRecordingTime;
            }
        }
        if (getCameraApi().wD() != null) {
            d7(j, jCalculateRealTime);
            return;
        }
        if (j > 0) {
            jCalculateRealTime += TimeSpeedModelExtension.calculateRealTime(j, o2().value());
        }
        i3(C1649650t1v.LIZ(jCalculateRealTime, this.LLILZIL.LIZIZ(), false));
    }

    @Override // X.InterfaceC1648570t0B
    public void q41(boolean z) {
        this.LLLIL = z;
    }

    @Override // X.InterfaceC1648570t0B
    public void rU0(boolean z) {
        this.LLLFFI.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void tu0(C1644050sst c1644050sst) {
        if (!C1697810uHb.LJIIJJI(5, 4, 6).contains(Integer.valueOf(c1644050sst.LIZ))) {
            this.LLJJJJ.LJIIJ(c1644050sst);
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void uI(boolean z) {
        this.LLLF.LJII(Boolean.valueOf(z));
    }

    public final void v3(AbstractC1656240tCY abstractC1656240tCY) {
        this.LLLLZLLLI.onNext(abstractC1656240tCY);
    }

    @Override // X.InterfaceC1648570t0B
    public void vF0(String str) {
        this.LLLIILIL = str;
    }

    @Override // X.InterfaceC1648570t0B
    public void va0(Class<Object> cls) {
        this.LLLIIIL = cls;
    }

    @Override // X.InterfaceC1648570t0B
    public void vs2(long j) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setProgressCapDuration ");
        sbLIZ.append(j);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL.LJIIJ(Long.valueOf(j));
    }

    public final void w2(C1644050sst c1644050sst) {
        Z1().S4(new AwS426S0200000_25(c1644050sst, (C1644050sst) this, 57), new AwS391S0200000_25(c1644050sst, (C1644050sst) this, 62));
        C2216191BoX.LIZ.getClass();
        InterfaceC2216251Bod interfaceC2216251BodLIZIZ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StopRecordingCommandEvent, recordState=");
        sbLIZ.append(c1644050sst.LIZ);
        interfaceC2216251BodLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ().LIZ(Log.getStackTraceString(new Throwable()));
    }

    @Override // X.InterfaceC1648570t0B
    public void yF2(boolean z) {
        this.LLLZI.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648570t0B
    public void yI2(C1649650t1v c1649650t1v) {
        i3(c1649650t1v);
    }

    @Override // X.InterfaceC1648570t0B
    public void z80(long j) {
        this.LLLII.LJII(Long.valueOf(j));
    }

    public C1656050tCF(C1DRG c1drg, Function1<? super C1656110tCL, Unit> function1) {
        this.LL = c1drg;
        C1656110tCL c1656110tCL = new C1656110tCL(null);
        this.LLILLJJLI = c1656110tCL;
        if (function1 != null) {
            function1.invoke(c1656110tCL);
        }
        this.LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19GS.class, null);
        this.LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLILZIL = getCameraApi().pw0();
        this.LLILZLL = new SafeHandler(this);
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLIZ = c560530Lyd;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLIZLLLIL = c560530Lyd2;
        C560530Lyd<Unit> c560530Lyd3 = new C560530Lyd<>();
        this.LLJ = c560530Lyd3;
        C560530Lyd<C1656120tCM> c560530Lyd4 = new C560530Lyd<>();
        this.LLJI = c560530Lyd4;
        C560530Lyd<C1656120tCM> c560530Lyd5 = new C560530Lyd<>();
        this.LLJIJIL = c560530Lyd5;
        C560530Lyd<C579810Mod> c560530Lyd6 = new C560530Lyd<>();
        this.LLJILJIL = c560530Lyd6;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 311));
        C560530Lyd<Long> c560530Lyd7 = new C560530Lyd<>();
        this.LLJILLL = c560530Lyd7;
        C560530Lyd<Unit> c560530Lyd8 = new C560530Lyd<>();
        this.LLJJ = c560530Lyd8;
        C560530Lyd<C1656320tCg> c560530Lyd9 = new C560530Lyd<>();
        this.LLJJI = c560530Lyd9;
        C560530Lyd<Unit> c560530Lyd10 = new C560530Lyd<>();
        this.LLJJIII = c560530Lyd10;
        this.LLJJIJI = new C560530Lyd<>();
        C560530Lyd<Unit> c560530Lyd11 = new C560530Lyd<>();
        this.LLJJIJIIJIL = c560530Lyd11;
        C560530Lyd<C579910Mon> c560530Lyd12 = new C560530Lyd<>();
        this.LLJJIJIL = c560530Lyd12;
        h0<C1649650t1v> h0Var = new h0<>(null);
        this.LLJJJ = h0Var;
        h0<C1649650t1v> h0Var2 = new h0<>(null);
        this.LLJJJIL = h0Var2;
        C560530Lyd<C1644050sst> c560530Lyd13 = new C560530Lyd<>();
        this.LLJJJJ = c560530Lyd13;
        RxLiveEvent rxLiveEvent = new RxLiveEvent();
        this.LLJJJJJIL = rxLiveEvent;
        C560530Lyd<C1644050sst> c560530Lyd14 = new C560530Lyd<>();
        this.LLJJJJLIIL = c560530Lyd14;
        C560530Lyd<C1644050sst> c560530Lyd15 = new C560530Lyd<>();
        this.LLJJL = c560530Lyd15;
        C560530Lyd<Unit> c560530Lyd16 = new C560530Lyd<>();
        this.LLJJLIIIJLLLLLLLZ = c560530Lyd16;
        C560530Lyd<TimeSpeedModelExtension> c560530Lyd17 = new C560530Lyd<>();
        this.LLJL = c560530Lyd17;
        C560530Lyd<Unit> c560530Lyd18 = new C560530Lyd<>();
        this.LLJLIL = c560530Lyd18;
        C560530Lyd<Unit> c560530Lyd19 = new C560530Lyd<>();
        this.LLJLILLLLZIIL = c560530Lyd19;
        RxLiveEvent rxLiveEvent2 = new RxLiveEvent();
        this.LLJLL = rxLiveEvent2;
        RxLiveEvent rxLiveEvent3 = new RxLiveEvent();
        this.LLJLLIL = rxLiveEvent3;
        C560530Lyd<C1448290nn9> c560530Lyd20 = new C560530Lyd<>();
        this.LLJLLL = c560530Lyd20;
        Boolean bool = Boolean.TRUE;
        h0<Boolean> h0Var3 = new h0<>(bool);
        this.LLJZ = h0Var3;
        Boolean bool2 = Boolean.FALSE;
        h0<Boolean> h0Var4 = new h0<>(bool2);
        this.LLJZIJLIL = h0Var4;
        h0<Boolean> h0Var5 = new h0<>(bool2);
        this.LLL = h0Var5;
        this.LLLF = new h0<>(bool);
        h0<Boolean> h0Var6 = new h0<>(bool);
        this.LLLFF = h0Var6;
        h0<Boolean> h0Var7 = new h0<>(bool);
        this.LLLFFI = h0Var7;
        this.LLLFZ = new ArrayList();
        h0<Boolean> h0Var8 = new h0<>(bool2);
        this.LLLI = h0Var8;
        this.LLLII = new h0<>(0L);
        h0<Boolean> h0Var9 = new h0<>(bool2);
        this.LLLIIII = h0Var9;
        this.LLLIIIIL = new HashMap();
        this.LLLIIIL = C579080MnS.class;
        this.LLLIILIL = "general";
        this.LLLIL = true;
        this.LLLILZ = true;
        this.LLLILZLLLI = new C580120Mp8();
        this.LLLIZZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 312));
        this.LLLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 309));
        this.LLLJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 307));
        this.LLLJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 308));
        this.LLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 310));
        this.LLLLII = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(153));
        this.LLLLIILLL = true;
        this.LLLLIL = this;
        this.LLLLILI = AFwS214S0000000_25.get$arr$(154);
        this.LLLLJ = new C11RK<>();
        this.LLLLJI = c560530Lyd;
        this.LLLLL = c560530Lyd2;
        this.LLLLLIL = c560530Lyd3;
        this.LLLLLILLIL = c560530Lyd5;
        this.LLLLLJIL = c560530Lyd4;
        this.LLLLLJLJLL = h0Var3;
        this.LLLLLL = h0Var4;
        this.LLLLLLIL = new h0<>(bool2);
        this.LLLLLLJ = h0Var8;
        this.LLLLLLL = h0Var6;
        this.LLLLLLLLL = h0Var7;
        this.LLLLLLLLLL = h0Var9;
        this.LLLLLLLZIL = h0Var5;
        this.LLLLLLZ = new C560530Lyd<>();
        this.LLLLLLZZ = new C560530Lyd<>();
        this.LLLLLZ = new C560530Lyd<>();
        this.LLLLLZL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 306));
        this.LLLLZ = c560530Lyd7;
        this.LLLLZI = c560530Lyd8;
        this.LLLLZIL = c560530Lyd9;
        this.LLLLZLL = c560530Lyd10;
        this.LLLLZLLIL = c560530Lyd11;
        this.LLLLZLLLI = new C11RK<>();
        this.LLLZ = c560530Lyd12;
        this.LLLZI = new C560530Lyd<>();
        this.LLLZIIL = c560530Lyd19;
        this.LLLZIL = rxLiveEvent2;
        this.LLLZL = rxLiveEvent3;
        this.LLLZLL = c560530Lyd13;
        this.LLLZLZ = c560530Lyd20;
        this.LLLZZ = rxLiveEvent;
        this.LLLZZIL = c560530Lyd14;
        this.LLZ = c560530Lyd15;
        this.LLZIL = c560530Lyd16;
        this.LLZILL = h0Var;
        this.LLZL = h0Var2;
        this.LLZLI = c560530Lyd17;
        this.LLZLL = c560530Lyd6;
        this.LLZLLIL = c560530Lyd18;
    }

    private final void N5(C1644050sst c1644050sst, long j) {
        long jLIZJ;
        TimeSpeedModelExtension timeSpeedModelExtension;
        long endFrameTimeUS = Z1().getEndFrameTimeUS() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleEventRecordState,durationSDK:");
        sbLIZ.append(endFrameTimeUS);
        sbLIZ.append(",eventState:");
        sbLIZ.append(c1644050sst.LIZ);
        sbLIZ.append(",reason:");
        sbLIZ.append(c1644050sst.LJFF);
        sbLIZ.append(",lastRecordFrameNum:");
        sbLIZ.append(Z1().getLastRecordFrameNum());
        sbLIZ.append(",enableNoLastRecordFrame:");
        sbLIZ.append(this.LLILLJJLI.LJIIJ.invoke().booleanValue());
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = true;
        if (c1644050sst.LIZ == 1 && j != -1) {
            Ax(c1644050sst);
            CameraComponentModel cameraComponentModel = this.LLILZIL;
            cameraComponentModel.mHardEncode = this.LLILLJJLI.LJ.invoke(cameraComponentModel).intValue();
            return;
        }
        if (0 > endFrameTimeUS || endFrameTimeUS >= 11) {
            z = false;
        }
        if (z || (Z1().getLastRecordFrameNum() <= 0 && !this.LLILLJJLI.LJIIJ.invoke().booleanValue())) {
            if (c1644050sst.LIZ == 5) {
                E5(new C0LZD("stop_record"));
                return;
            } else {
                if (j == -1) {
                    return;
                }
                Ax(c1644050sst);
                return;
            }
        }
        C1441190nbh c1441190nbhLIZIZ = this.LLILZIL.LIZIZ();
        C1656050tCF<T>.d dVar = this.LLZZJLIL;
        if (dVar != null && (timeSpeedModelExtension = (TimeSpeedModelExtension) C13LP.LJJJLL(c1441190nbhLIZIZ)) != null) {
            timeSpeedModelExtension.setDuration((int) dVar.LIZ);
        }
        C1656050tCF<T>.d dVar2 = this.LLZZJLIL;
        if (dVar2 != null) {
            jLIZJ = (C1656050tCF.this.LLILZIL.LIZJ() + dVar2.LIZ) - dVar2.LIZIZ;
        } else {
            jLIZJ = this.LLILZIL.LIZJ();
        }
        i3(C1649650t1v.LIZ(jLIZJ, this.LLILZIL.LIZIZ(), false));
        int i = c1644050sst.LIZ;
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                E5(new C0LZD("stop_record"));
                return;
            }
            E5(new C0LZD("click_next"));
            return;
        }
        E5(new C0LZD("record_full"));
    }

    private final void d6(boolean z, boolean z2) {
        int flashMode;
        if (getCameraApi().NS0()) {
            flashMode = getCameraApi().re1();
        } else {
            flashMode = getCameraApi().getFlashMode();
        }
        if (LJLJJLL() != 1 && getCameraApi().fp1()) {
            if (flashMode == 3) {
                getCameraApi().H31(z, this.LLJJI);
                return;
            } else {
                getCameraApi().qh(flashMode);
                return;
            }
        }
        if (LJLJJLL() == 1 && getCameraApi().xs1() && !z2) {
            if (flashMode != 1) {
                if (flashMode != 2) {
                    if (flashMode != 3) {
                        return;
                    }
                    getCameraApi().H31(z, this.LLJJI);
                    return;
                }
                getCameraApi().zo(true);
                return;
            }
            getCameraApi().zo(true);
            return;
        }
        if (LJLJJLL() == 1 || getCameraApi().fp1() || flashMode != 3) {
            return;
        }
        getCameraApi().H31(z, this.LLJJI);
    }

    private final void d7(long j, long j2) {
        s sVarWD = getCameraApi().wD();
        if (sVarWD == null) {
            sVarWD = getCameraApi().getSpeed();
        }
        if (j > 0) {
            long jCalculateRealTime = this.LLZZ + TimeSpeedModelExtension.calculateRealTime(j - this.LLZLLLL, sVarWD.value());
            this.LLZZ = jCalculateRealTime;
            j2 += jCalculateRealTime;
        }
        this.LLZLLLL = j;
        i3(C1649650t1v.LIZ(j2, this.LLILZIL.LIZIZ(), false));
    }

    public final void D5(C0LZD c0lzd, Function1<? super InterfaceC1650140t2i, Unit> function1) {
        if (Intrinsics.LJFF(this.LLL.LIZJ(), Boolean.TRUE)) {
            c0lzd.getClass();
            return;
        }
        U5();
        System.currentTimeMillis();
        c0lzd.getClass();
        C580120Mp8 c580120Mp8Ak = Ak();
        c580120Mp8Ak.LIZ = C580140MpA.LIZ(c580120Mp8Ak.LIZ, 0L, 0L, c0lzd.LIZ, 3);
        this.LLLIL = false;
        ko0(true);
        if (this.LLLF.LIZJ().booleanValue() && this.LLLFF.LIZJ().booleanValue() && this.LLLFFI.LIZJ().booleanValue()) {
            if (this.LLILZIL.LJFF()) {
                Z1().setMusicPath(this.LLILZIL.getMusicPath());
            }
            function1.invoke(this.LLLIIIIL.get(this.LLLIIIL));
        } else {
            this.LLLFZ.clear();
            o4(this.LLLF, false, function1);
            o4(this.LLLFF, true, function1);
            o4(this.LLLFFI, true, function1);
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void KA0(Class<Object> cls, InterfaceC1650140t2i interfaceC1650140t2i) {
        this.LLLIIIIL.put(cls, interfaceC1650140t2i);
    }

    @Override // X.InterfaceC1648570t0B
    public void eI0(EnumC1993707rT enumC1993707rT, boolean z) {
        boolean z2;
        C560530Lyd<C579910Mon> c560530Lyd = this.LLJJIJIL;
        if (enumC1993707rT == EnumC1993707rT.FORM_60S) {
            z2 = true;
        } else {
            z2 = false;
        }
        c560530Lyd.LJIIJ((C579910Mon) new AbstractC579710MoT(z2, z) { // from class: X.0Mon
            public final boolean LIZ;
            public final boolean LIZIZ;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SwitchDurationDisableEvent{mCurrentMode=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append("mToDisable=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZIZ = z2;
                this.LIZ = z;
            }
        });
    }

    @Override // X.InterfaceC1648570t0B
    public void kZ1(Class<Object> cls, InterfaceC579700MoS interfaceC579700MoS) {
        InterfaceC1650140t2i interfaceC1650140t2i;
        if (this.LLLIIIIL.containsKey(cls) && (interfaceC1650140t2i = this.LLLIIIIL.get(cls)) != null) {
            interfaceC1650140t2i.LIZ(interfaceC579700MoS);
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void l72(boolean z, boolean z2) {
        EnumC1993707rT enumC1993707rT;
        if (z) {
            enumC1993707rT = EnumC1993707rT.FORM_60S;
        } else {
            enumC1993707rT = EnumC1993707rT.FORM_15S;
        }
        eI0(enumC1993707rT, z2);
        this.LLILZIL.mDurationSwitchable = !z2;
    }

    @Override // X.InterfaceC1648570t0B
    public void oa0(C1448290nn9 c1448290nn9, boolean z) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordControl onRecordModeConfirmed: ");
        sbLIZ.append(c1448290nn9.LIZ);
        sbLIZ.append(" isRecordModeConfirmed=");
        sbLIZ.append(this.LLLLIIL);
        sbLIZ.append(" justToNotifyEvent=");
        sbLIZ.append(z);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LLJLLL.LJIIJ(c1448290nn9);
            return;
        }
        if (this.LLLLIIL) {
            return;
        }
        this.LLLLIIL = true;
        C560530Lyd<C1448290nn9> c560530Lyd = this.LLJLLL;
        C1448290nn9 c1448290nn92 = this.LLLLIIIILLL;
        if (c1448290nn92 != null) {
            c1448290nn9 = c1448290nn92;
        }
        c560530Lyd.LJIIJ(c1448290nn9);
    }

    @Override // X.InterfaceC1648570t0B
    public void xB(C1448290nn9 c1448290nn9, boolean z) {
        this.LLJJIJI.LJIIJ(Unit.LIZ);
        if (z) {
            this.LLILZLL.postDelayed(new ARunnableS94S0200000_25(this, c1448290nn9, 7), 750L);
        } else {
            this.LLJLLL.LJIIJ(c1448290nn9);
        }
        Sf0(new C0LZD("take photo"));
    }

    /* JADX INFO: renamed from: X.0tCF$d */
    public final class d {
        public final long LIZ;
        public final long LIZIZ;

        public d(long j, long j2) {
            this.LIZ = j;
            this.LIZIZ = j2;
        }
    }

    private final void Q3(h0<Boolean> h0Var, C0LZD c0lzd, boolean z) {
        if (!h0Var.LIZJ().booleanValue()) {
            if (z) {
                this.LLLI.LJII(Boolean.TRUE);
            }
            h0Var.LJI(this);
            this.LLLFZ.add(h0Var);
            h0Var.LIZ(this, new AObjectS185S0300000_25(c0lzd, this, h0Var, 2));
        }
    }

    private final void o4(h0<Boolean> h0Var, boolean z, Function1<? super InterfaceC1650140t2i, Unit> function1) {
        if (!h0Var.LIZJ().booleanValue()) {
            if (z) {
                this.LLLI.LJII(Boolean.TRUE);
            }
            h0Var.LJI(this);
            this.LLLFZ.add(h0Var);
            h0Var.LIZ(this, new AObjectS185S0300000_25(function1, this, h0Var, 3));
        }
    }

    @Override // X.InterfaceC1648570t0B
    public void xP1(boolean z, boolean z2, boolean z3) {
        jJ1(z);
        if (this.LLILLJJLI.LJIIIIZZ.invoke(this.LLILZIL).booleanValue()) {
            getCameraApi().w61(new C1648160szW(3));
        }
        if (!z2) {
            O3();
        }
        i3(C1649650t1v.LIZ(0L, C13BV.INSTANCE, z3));
        l72(this.LLILZIL.mCurrentDurationMode, false);
        h0<Boolean> h0Var = this.LLL;
        Boolean bool = Boolean.FALSE;
        h0Var.LJII(bool);
        this.LLJJ.LJIIJ(Unit.LIZ);
        if (!this.LLILZIL.isRetakeMode) {
            this.LLLLLLIL.LJII(bool);
        }
    }

    @Override // X.InterfaceC1648570t0B
    public int n4(String str, int i, int i2, Function1<? super Integer, Unit> function1) {
        return getCameraApi().St2().n4(str, i, i2, function1);
    }

    public static /* synthetic */ void m6(C1656050tCF c1656050tCF, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            c1656050tCF.d6(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFlashByChecking");
    }

    public static /* synthetic */ void e4(C1656050tCF c1656050tCF, h0 h0Var, C0LZD c0lzd, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            c1656050tCF.Q3(h0Var, c0lzd, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execWaitAsync");
    }

    @Override // X.InterfaceC1648570t0B
    public void F0(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, Function1<? super Integer, Unit> function1, boolean z2) {
        m6(this, false, false, 3, null);
        getCameraApi().St2().F0(str, i, i2, z, compressFormat, function1, z2);
    }
}
