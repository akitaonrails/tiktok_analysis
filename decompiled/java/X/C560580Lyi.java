package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.aigc.aiplayground.navigate.AIPlaygroundBaseScene;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Lyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560580Lyi extends i<InterfaceC560800Lz4, C560820Lz6, C560660Lyq, C560840Lz8> implements InterfaceC379610EuV, InterfaceC560800Lz4 {
    public static final C560650Lyp LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final AIPlaygroundBaseScene LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C19EG LLJJ;
    public final EnumC371580EhY LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public C09AE LLJJIJIL;
    public boolean LLJJJ;
    public final MutableLiveData<Boolean> LLJJJIL;
    public final Function0<C560660Lyq> LLJJJJ;
    public final Function0<C560840Lz8> LLJJJJJIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Lyp] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C560580Lyi.class, "aiPlaygroundLogicApi", "getAiPlaygroundLogicApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/logic/AIPlaygroundLogicApi;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C560580Lyi.class, "aiPlaygroundToolsApi", "getAiPlaygroundToolsApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundToolsApi;", 0), new C2217381BqS(C560580Lyi.class, "reuseSurfaceApiComponent", "getReuseSurfaceApiComponent()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0)};
        LLJJJJLIIL = new Object() { // from class: X.0Lyp
        };
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final void O4() {
        t5(true);
        x5();
        this.LLJILJILJ.finish();
    }

    private final InterfaceC381730Exv T4() {
        return (InterfaceC381730Exv) this.LLJJIJI.getValue(this, LLJJL[1]);
    }

    public final void F4() {
        C201955140j.LJIILL(C559380Lwm.LIZIZ, "AIPlaygroundLoadingComponent", "cancelObserveTaskStatus");
        C09AE c09ae = this.LLJJIJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJJIJIL = null;
    }

    public final void K4() {
        C354270Duj.LIZJ(0L, new AwS552S0100000_8(this, 21));
    }

    public final InterfaceC560620Lym P4() {
        return (InterfaceC560620Lym) this.LLJJIII.getValue(this, LLJJL[0]);
    }

    public final InterfaceC1452360nti Z4() {
        return (InterfaceC1452360nti) this.LLJJIJIIJIL.getValue(this, LLJJL[2]);
    }

    private final boolean d5() {
        return P4().c52().draftInfoModel.isDraft;
    }

    private final void k5() {
        F4();
        CreativeModel creativeModelC52 = P4().c52();
        String creationId = creativeModelC52.creativeInfo.getCreationId();
        if (creationId.length() == 0) {
            return;
        }
        this.LLJJIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C560550Lyf(creationId, this, creativeModelC52, null), 2);
    }

    private final void x5() {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJI("AIPlaygroundLoadingComponent", new AwS552S0100000_8(this, 26), false);
        }
    }

    public final void H4() {
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ != null) {
            iAIPlaygroundMobServiceLIZ.LJFF("click_generate_in_drafts", P4().c52());
        }
        if (this.LLJJJ) {
            O4();
            return;
        }
        T4().LLLIL();
        t5(false);
        if (d5()) {
            C560380LyO.LIZ.getClass();
            C560380LyO.LJI("ai_playground");
        }
        x5();
        P4().h11(true);
        P4().yv1(true);
        AW0(true);
    }

    @Override // X.InterfaceC560800Lz4
    public boolean getVisibility() {
        return T2().LIZ == EnumC371580EhY.SHOW;
    }

    @Override // X.InterfaceC560800Lz4
    public boolean onBackPressed() {
        if (T2().LIZ == EnumC371580EhY.HIDE) {
            return false;
        }
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ != null) {
            iAIPlaygroundMobServiceLIZ.LJFF("click_back", P4().c52());
        }
        if (this.LLJJJ) {
            O4();
            return true;
        }
        t5(false);
        if (d5()) {
            C560380LyO.LIZ.getClass();
            C560380LyO.LJI("ai_playground");
        }
        x5();
        P4().h11(true);
        P4().yv1(true);
        AW0(true);
        return true;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "init AIPlaygroundLoadingComponent");
        C560380LyO c560380LyO = C560380LyO.LIZ;
        Lifecycle lifecycle = this.LLJJ.getLifecycle();
        c560380LyO.getClass();
        C560380LyO.LIZIZ(lifecycle, false);
        CreativeModel creativeModelC52 = P4().c52();
        C560380LyO.LJIILJJIL(creativeModelC52.creativeInfo.getCreationId(), creativeModelC52.editorProAIGCInfoModel.aiPlaygroundCameraModel.shootWay, creativeModelC52.draftInfoModel.isDraft);
        C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.OTHERS, System.currentTimeMillis()));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        F4();
    }

    @Override // X.InterfaceC560800Lz4
    public MutableLiveData<Boolean> dX0() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C560660Lyq> o2() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C560840Lz8> w2() {
        return this.LLJJJJJIL;
    }

    private final void t5(boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C560600Lyk(this, z, null), 3);
    }

    @Override // X.InterfaceC560800Lz4
    public void AW0(boolean z) {
        F4();
        i3(new AwS23S0010000_8(z, 0));
        C354270Duj.LIZJ(0L, new AwS552S0100000_8(this, 22));
    }

    public final void C5(float f) {
        if (0.0f <= f && f <= 0.3f) {
            i3(AFwS239S0000000_8.get$arr$(22));
        } else if (0.3f <= f && f <= 0.7f) {
            i3(AFwS239S0000000_8.get$arr$(23));
        } else {
            i3(AFwS239S0000000_8.get$arr$(24));
        }
    }

    public final void n5(String str, C0LSZ c0lsz) {
        if (C123100dR.LIZ(c0lsz.LJIJ)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C560540Lye(this, c0lsz, null), 3);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C560590Lyj(this, new C377760ErW(c0lsz.LJIILL, str, 0, c0lsz.LJIILLIIL, null, 24), null), 3);
        }
    }

    public C560580Lyi(AIPlaygroundBaseScene aIPlaygroundBaseScene, C1DRG c1drg, C19EG c19eg, EnumC371580EhY enumC371580EhY) {
        boolean z;
        super(aIPlaygroundBaseScene);
        this.LLJILJILJ = aIPlaygroundBaseScene;
        this.LLJILLL = c1drg;
        this.LLJJ = c19eg;
        this.LLJJI = enumC371580EhY;
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC560620Lym.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC381730Exv.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        if (enumC371580EhY == EnumC371580EhY.SHOW) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJ = z;
        this.LLJJJIL = new MutableLiveData<>();
        this.LLJJJJ = AFwS194S0000000_8.get$arr$(47);
        this.LLJJJJJIL = new AwS552S0100000_8(this, 24);
    }

    @Override // X.InterfaceC560800Lz4
    public void cs1(boolean z, String str, boolean z2, boolean z3) {
        i3(new C560610Lyl(z, str, z2, z3));
        k5();
        if (this.LLJJI != EnumC371580EhY.SHOW) {
            show();
        }
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ != null) {
            iAIPlaygroundMobServiceLIZ.LJII(P4().c52());
        }
        C354270Duj.LIZJ(0L, new AwS552S0100000_8(this, 25));
    }
}
