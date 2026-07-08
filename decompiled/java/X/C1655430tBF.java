package X;

import Y.AObjectS242S0100000_9;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tBF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655430tBF extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C1453870nw9.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1655430tBF.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1655430tBF.class, "recordStateDispatch", "getRecordStateDispatch()Lcom/ss/android/ugc/aweme/shortvideo/util/performance/ScreenStateDispatch;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZLL = 8;
    }

    private final C1453870nw9<EnumC1641390sob> W1() {
        return (C1453870nw9) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C2471909mP.LIZ.getClass();
        C2471909mP.LJJIJIL(true);
        int i = C2187451AjH.LIZ;
        if (C2408409cA.LIZJ && C08DT.LIZIZ) {
            C2408409cA.LIZLLL = false;
        }
        if (!((Boolean) C0AUN.LIZ.getValue()).booleanValue()) {
            C14LN.LIZ(getActivity(), this, C1655670tBd.LIZ);
            return;
        }
        C1453870nw9<EnumC1641390sob> c1453870nw9W1 = W1();
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        EnumC1641390sob enumC1641390sob = EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END;
        if (!((Boolean) C0BNR.LIZ.getValue()).booleanValue() || c1453870nw9W1 == null) {
            awS569S0100000_25.invoke();
        } else {
            c1453870nw9W1.LIZJ(enumC1641390sob.getValue()).LIZ(this, new AObjectS242S0100000_9(awS569S0100000_25, 0));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (!((Boolean) C0AUN.LIZ.getValue()).booleanValue()) {
            C01GW c01gw = BrightnessManager.LIZ;
            BrightnessManager.LIZ(getActivity(), this, C1655670tBd.LIZ);
            return;
        }
        C1453870nw9<EnumC1641390sob> c1453870nw9W1 = W1();
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 301);
        EnumC1641390sob enumC1641390sob = EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END;
        if (!((Boolean) C0BNR.LIZ.getValue()).booleanValue() || c1453870nw9W1 == null) {
            awS569S0100000_25.invoke();
        } else {
            c1453870nw9W1.LIZJ(enumC1641390sob.getValue()).LIZ(this, new AObjectS242S0100000_9(awS569S0100000_25, 0));
        }
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1655430tBF(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
