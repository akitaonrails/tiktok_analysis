package X;

import Y.AObjectS246S0100000_25;
import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658120tFa extends AbstractC2255721DQs<InterfaceC1646140swG> implements InterfaceC1646140swG, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final Integer LLILZIL;
    public boolean LLIZLLLIL;
    public final InterfaceC1646140swG LLILZLL = this;
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 667));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1658120tFa.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = 8;
    }

    @Override // X.InterfaceC1646140swG
    public void hide() {
        Z1(false);
    }

    private final C1658130tFb X1() {
        return (C1658130tFb) this.LLJ.getValue();
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLIZ.getValue(this, LLJI[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LL.add(R.id.sz5, X1(), "TnSNoticeScene");
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 609));
    }

    public InterfaceC1646140swG W1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    public final void Z1(boolean z) {
        C19A3 c19a3 = this.LL;
        if (z) {
            C1658150tFd.LJ(c19a3, "TnSNoticeScene");
        } else {
            C1658150tFd.LIZIZ(c19a3, "TnSNoticeScene");
        }
    }

    @Override // X.InterfaceC1646140swG
    public void Sn1(int i, long j) {
        String string;
        C1658130tFb c1658130tFbX1 = X1();
        TuxTextView tuxTextView = c1658130tFbX1.LLJILLL;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            if (context != null) {
                string = context.getString(i);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        TuxTextView tuxTextView2 = c1658130tFbX1.LLJILLL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            HandlerHook.viewRemoveCallbacks(tuxTextView2, c1658130tFbX1.LLJJ);
            if (j != -1) {
                HandlerHook.viewPostDelay(tuxTextView2, c1658130tFbX1.LLJJ, j);
            }
        }
    }

    public C1658120tFa(C19A3 c19a3, C1DRG c1drg, int i, boolean z, Integer num) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = num;
    }
}
