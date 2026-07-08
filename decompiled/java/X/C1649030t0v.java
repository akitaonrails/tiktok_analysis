package X;

import android.widget.FrameLayout;
import com.bytedance.als.h0;
import nv7.c0;

/* JADX INFO: renamed from: X.0t0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649030t0v extends AbstractC2255721DQs<C0MGB> implements C0MGB {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final h0<Boolean> LLILLJJLI = new h0<>(Boolean.FALSE);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1649070t0z.class, null);
    public final C1649040t0w LLILZ = new InterfaceC1888407aU() { // from class: X.0t0w
        @Override // X.InterfaceC1888407aU
        public final void LIZJ(boolean z) {
        }

        @Override // X.InterfaceC1888407aU
        public final void LIZLLL() {
        }

        @Override // X.InterfaceC1888407aU
        public final InterfaceC1939907in LIZ() {
            return new C1939807im();
        }

        @Override // X.InterfaceC1888407aU
        public final void LIZIZ(boolean z) {
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                c1660590tJZ.LIZJ = new FrameLayout.LayoutParams(0, 0);
            }
            this.LIZ.LLILLJJLI.LJII(Boolean.valueOf(z));
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649030t0v.class, "screenAdaptRegistry", "getScreenAdaptRegistry()Lcom/ss/android/ugc/aweme/saa/CreationScreenAdaptRegistry;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    public C1649030t0v W1() {
        return this;
    }

    private final InterfaceC1649070t0z X1() {
        return (InterfaceC1649070t0z) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().LJJLIL(this.LLILZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        X1().LLJJ(this.LLILZ);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.C0MGB, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0MGB
    public C385670FAf<Boolean> va() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0t0w] */
    public C1649030t0v(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
