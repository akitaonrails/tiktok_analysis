package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0t31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650330t31 extends i<InterfaceC1646990sxd, C1650400t38, C1650350t33, C1650390t37> implements InterfaceC1646990sxd, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final C11NJ LLJJIJIL;
    public final C11PQ<Boolean> LLJJJ;
    public final C11PQ<Boolean> LLJJJIL;
    public final C11PQ<Boolean> LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650330t31.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650330t31.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1650330t31.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1650330t31.class, "stickerComponent", "getStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1650330t31.class, "bottomTabApi", "getBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1650330t31.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJJJLIIL = 8;
    }

    private final InterfaceC1648020szI F4() {
        return (InterfaceC1648020szI) this.LLJJIJI.getValue(this, LLJJJJJIL[4]);
    }

    private final C1631190sY9 H4() {
        return (C1631190sY9) this.LLJJIJIIJIL.getValue(this, LLJJJJJIL[5]);
    }

    private final void Z4() {
        this.LLJJIJIL.LIZ(C11NZ.LJIIJJI(this.LLJJJ, this.LLJJJIL, this.LLJJJJ, new InterfaceC953020auK<T1, T2, T3, R>() { // from class: X.0auL
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC953020auK
            public final R LIZ(T1 t1, T2 t2, T3 t3) {
                boolean z;
                Boolean bool = (Boolean) t3;
                Boolean bool2 = (Boolean) t2;
                if (((Boolean) t1).booleanValue() && bool2.booleanValue() && !bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                return (R) Boolean.valueOf(z);
            }
        }).LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 21)));
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJJ.getValue(this, LLJJJJJIL[1]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJILLL.getValue(this, LLJJJJJIL[0]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJI.getValue(this, LLJJJJJIL[2]);
    }

    private final q yq() {
        return (q) this.LLJJIII.getValue(this, LLJJJJJIL[3]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1650350t33> o2() {
        return AFwS214S0000000_25.get$arr$(157);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1650390t37> w2() {
        return new AwS569S0100000_25(this, 314);
    }

    private final void O4() {
        getDiContainer();
        if (C343070Dcf.LIZIZ() && C1631200sYA.LIZ(H4())) {
            getPlanCUIApiComponent().Ap1().LIZ(this, new AObjectS246S0100000_25(this, 184));
        } else {
            getPlanCUIApiComponent().va().LIZ(this, new AObjectS246S0100000_25(this, 185));
        }
    }

    private final void P4() {
        C385670FAf<Integer> c385670FAfCx2;
        C385670FAf<String> c385670FAfJP0;
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null && (c385670FAfJP0 = interfaceC1638550sk1Gq.jP0()) != null) {
            c385670FAfJP0.LIZ(this, new AObjectS246S0100000_25(this, 186));
        }
        InterfaceC1638550sk1 interfaceC1638550sk1Gq2 = gq();
        if (interfaceC1638550sk1Gq2 == null || (c385670FAfCx2 = interfaceC1638550sk1Gq2.Cx2()) == null) {
            return;
        }
        c385670FAfCx2.LIZ(this, new AObjectS246S0100000_25(this, 187));
    }

    private final void T4() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        q qVarYq = yq();
        if (qVarYq == null || (interfaceC1624480sNKC0 = qVarYq.C0()) == null || (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) == null || (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) == null) {
            return;
        }
        mutableLiveDataLJIJJLI.observe(this, new AObserverS227S0100000_25(this, 16));
    }

    private final void d5() {
        ((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LIZJ();
    }

    public final void K4() {
        IOpenTextToImageService iOpenTextToImageServiceOpenTextToImageService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openTextToImageService();
        a6n.a aVarProvideRecordEnv = F4().provideRecordEnv();
        Bundle bundle = new Bundle();
        bundle.putInt("origin", 1);
        C786410Ut5.LJJJI("entrance", "shoot_page_add_button", bundle);
        IOpenTextToImageService.DefaultImpls.openTextToImageFromRecord$default(iOpenTextToImageServiceOpenTextToImageService, aVarProvideRecordEnv, 0, bundle, null, 8, null);
        C0L52 c0l52 = C0L52.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c0l52.getClass();
        C20684815ws.LJIILLIIL("click_add_text_image", C0L52.LIZ(shortVideoContext).LIZ);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        d5();
        O4();
        P4();
        this.LLJJJJ.onNext(Boolean.FALSE);
        T4();
        Z4();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIJIL.LJ();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        C0L52 c0l52 = C0L52.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c0l52.getClass();
        C20684815ws.LJIILLIIL("show_add_text_image", C0L52.LIZ(shortVideoContext).LIZ);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    public C1650330t31(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
        this.LLJJIJIL = new C11NJ();
        this.LLJJJ = new C11PQ<>();
        this.LLJJJIL = new C11PQ<>();
        this.LLJJJJ = new C11PQ<>();
    }
}
