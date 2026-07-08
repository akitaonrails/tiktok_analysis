package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0syL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647430syL extends AbstractC2255721DQs<InterfaceC1648250szf> implements InterfaceC1648250szf, InterfaceC379610EuV {
    public static final C1647440syM LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 565));

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0syM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647430syL.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1647430syL.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C1647430syL.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0)};
        LLIZ = new Object() { // from class: X.0syM
        };
        LLJ = 8;
    }

    public InterfaceC1648250szf W1() {
        return this;
    }

    private final C0ES2 X1() {
        return (C0ES2) this.LLILZLL.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        if (recordAdapterApi != null) {
            recordAdapterApi.TK0(this);
        }
        this.LL.add(R.id.sz5, X1(), "DMRecordTitleComponent");
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1648250szf
    public void nT0(boolean z) {
        int i;
        View view = X1().mView;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public C1647430syL(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
