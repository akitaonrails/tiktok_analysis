package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1BqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217201BqA extends AbstractC2255721DQs<InterfaceC1454740nxY> implements InterfaceC379610EuV, InterfaceC1454740nxY {
    public static final C2217211BqB LLIZ = new Object() { // from class: X.1BqB
    };
    public static final int LLIZLLLIL = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1454740nxY LLILZ = this;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 173));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(273));

    private final Keva X1() {
        return (Keva) this.LLILZLL.getValue();
    }

    private final C0LGB Z1() {
        return (C0LGB) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (X1().getBoolean(curUserId, false)) {
            return;
        }
        this.LLILLJJLI.add(this.LLILLL, Z1(), "GroupShotHintScene");
        X1().storeBoolean(curUserId, true);
    }

    public InterfaceC1454740nxY W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C2217201BqA(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
