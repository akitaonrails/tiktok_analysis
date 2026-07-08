package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172270gbx extends AbstractC2255721DQs<InterfaceC1172280gby> implements InterfaceC1172280gby, InterfaceC379610EuV {
    public static final int LLILZ = 8;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2265));

    public C1172270gbx W1() {
        return this;
    }

    private final C1166940gTM X1() {
        return (C1166940gTM) this.LLILLL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LL.add(R.id.ye4, X1(), "TopNotificationScene");
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

    public C1172270gbx(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
