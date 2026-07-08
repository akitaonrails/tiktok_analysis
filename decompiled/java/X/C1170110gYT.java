package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170110gYT extends AbstractC2255721DQs<InterfaceC1170140gYW> implements InterfaceC1170140gYW, InterfaceC379610EuV {
    public static final C1170120gYU LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1170130gYV.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1168770gWJ.class, null);
    public final C1167120gTe LLIZLLLIL;
    public final DMCameraModel LLJ;
    public final C01GW LLJI;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0gYU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1170110gYT.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1170110gYT.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1170110gYT.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C1170110gYT.class, "playgroundTopTabApi", "getPlaygroundTopTabApi()Lcom/ss/android/ugc/aweme/social/DMPlaygroundTopTabApiComponent;", 0), new C2217381BqS(C1170110gYT.class, "playgroundViewPagerApi", "getPlaygroundViewPagerApi()Lcom/ss/android/ugc/aweme/social/DMPlaygroundViewPagerApiComponent;", 0)};
        LLJIJIL = new Object() { // from class: X.0gYU
        };
        LLJILJILJ = 8;
    }

    public C1170110gYT Z1() {
        return this;
    }

    private final InterfaceC1170130gYV G2() {
        return (InterfaceC1170130gYV) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC1168770gWJ H2() {
        return (InterfaceC1168770gWJ) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    public final C1167100gTc T2() {
        return (C1167100gTc) this.LLJI.getValue();
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    private final InterfaceC1648870t0f o2() {
        return getRecordAdapterApi().ir2().LIZJ();
    }

    private final C0MGL w2() {
        return getRecordAdapterApi().Vt2().LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LL.add(R.id.iqh, T2(), "DMGameEffectTemplateComponent");
        X1(this.LL.requireSceneContext());
        InterfaceC1648870t0f interfaceC1648870t0fO2 = o2();
        if (interfaceC1648870t0fO2 != null) {
            interfaceC1648870t0fO2.setUploadVisibility(8);
        }
        InterfaceC1170130gYV interfaceC1170130gYVG2 = G2();
        if (interfaceC1170130gYVG2 != null) {
            interfaceC1170130gYVG2.NU(this.LL.requireSceneContext().getString(2131831814));
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final void X1(Context context) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1167240gTq(context, this, null), 3);
    }

    public C1170110gYT(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        DMCameraModel dMCameraModel = getShortVideoContext().creativeModel.initialModel.dmCameraModel;
        this.LLJ = dMCameraModel;
        String str = dMCameraModel.sessionID;
        String str2 = dMCameraModel.toUserId;
        int i = dMCameraModel.chatType;
        String str3 = dMCameraModel.enterDM;
        this.LLIZLLLIL = new C1167120gTe(str, str2, i, str3 == null ? "" : str3, "click_tab");
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2263));
    }

    public final void yp0(String str, long j) {
        C0MGL c0mglW2 = w2();
        if (c0mglW2 != null) {
            c0mglW2.Xp1(str, j);
        }
    }
}
