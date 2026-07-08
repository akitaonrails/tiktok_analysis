package X;

import Y.AObserverS212S0100000_8;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;

/* JADX INFO: renamed from: X.0LtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557310LtR extends AbstractC2255721DQs<InterfaceC557330LtT> implements InterfaceC557330LtT, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC557330LtT LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC555210Lq3.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC555090Lpr.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C557310LtR.class, "inputBoxApi", "getInputBoxApi()Lcom/ss/android/ugc/aweme/aiuikit/impl/input/box/api/InputBoxApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C557310LtR.class, "inputMentionPanelApi", "getInputMentionPanelApi()Lcom/ss/android/ugc/aweme/aiuikit/impl/input/mentionpanel/api/InputMentionPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C557310LtR.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    private final InterfaceC555210Lq3 X1() {
        return (InterfaceC555210Lq3) this.LLILZ.getValue(this, LLIZ[0]);
    }

    public final InterfaceC555090Lpr Z1() {
        return (InterfaceC555090Lpr) this.LLILZIL.getValue(this, LLIZ[1]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILZLL.getValue(this, LLIZ[2]);
    }

    private final void nD1() {
        X1().As1().observe(this, new AObserverS212S0100000_8(this, 16));
        X1().Tu0().observe(this, new AObserverS212S0100000_8(this, 17));
        X1().UF1().observe(this, new AObserverS212S0100000_8(this, 18));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    public InterfaceC557330LtT W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC557330LtT
    public void s31(Function1<? super EnumC557320LtS, Unit> function1) {
        C1397580mTM c1397580mTM = new C1397580mTM(getActivity());
        c1397580mTM.LJI(C555520LqY.LIZIZ(2131846049));
        c1397580mTM.LIZIZ(C555520LqY.LIZIZ(2131846048));
        C985403tE.LIZ(c1397580mTM, new AwS374S0200000_8(this, function1, 13));
        new AutoDismissPermissionDialog(getActivity(), c1397580mTM).LIZ();
    }

    public C557310LtR(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
