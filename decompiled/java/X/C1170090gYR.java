package X;

import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.social.DMPlaygroundTopTabScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gYR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170090gYR extends AbstractC2255721DQs<InterfaceC1170130gYV> implements InterfaceC1170130gYV, InterfaceC379610EuV {
    public static final C1170100gYS LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1168770gWJ.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2267));

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0gYS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1170090gYR.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1170090gYR.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C1170090gYR.class, "playgroundViewPagerComponent", "getPlaygroundViewPagerComponent()Lcom/ss/android/ugc/aweme/social/DMPlaygroundViewPagerApiComponent;", 0)};
        LLIZ = new Object() { // from class: X.0gYS
        };
        LLJ = 8;
    }

    public C1170090gYR X1() {
        return this;
    }

    private final DMPlaygroundTopTabScene G2() {
        return (DMPlaygroundTopTabScene) this.LLILZLL.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    @Override // X.InterfaceC1170130gYV
    public void hide() {
        this.LL.hide(G2());
    }

    public final InterfaceC1168770gWJ w2() {
        return (InterfaceC1168770gWJ) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    private final InterfaceC1648870t0f Z1() {
        return getRecordAdapterApi().ir2().LIZJ();
    }

    private final C0MGL o2() {
        return getRecordAdapterApi().Vt2().LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LL.add(R.id.qu1, G2(), "DMPlaygroundTopTabComponent");
        InterfaceC1648870t0f interfaceC1648870t0fZ1 = Z1();
        if (interfaceC1648870t0fZ1 != null) {
            interfaceC1648870t0fZ1.setUploadVisibility(8);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1170130gYV
    public void NU(String str) {
        C20600815jK<InterfaceC1891350zJl> state;
        DMPlaygroundTopTabScene dMPlaygroundTopTabSceneG2 = G2();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = dMPlaygroundTopTabSceneG2.LLJILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            C20600815jK.LIZJ(state, new C540890LJf(str, dMPlaygroundTopTabSceneG2.LLJILJIL, dMPlaygroundTopTabSceneG2.LLJIJIL));
        }
    }

    public C1170090gYR(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    public final void yp0(String str, long j) {
        C0MGL c0mglO2 = o2();
        if (c0mglO2 != null) {
            c0mglO2.Xp1(str, j);
        }
    }
}
