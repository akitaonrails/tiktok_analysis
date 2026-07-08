package X;

import com.bytedance.als.h0;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Kuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532750Kuv extends AbstractC2255721DQs<InterfaceC532760Kuw> implements InterfaceC532760Kuw, InterfaceC379610EuV {
    public static final int LLILZIL = 8;
    public final C1DRG LL;
    public final h0<Pair<Boolean, Boolean>> LLILLJJLI;
    public final C385670FAf<Pair<Boolean, Boolean>> LLILLL;
    public final InterfaceC532760Kuw LLILZ;

    public InterfaceC532760Kuw W1() {
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

    @Override // X.InterfaceC532760Kuw
    public C385670FAf<Pair<Boolean, Boolean>> jT() {
        return this.LLILLL;
    }

    public C532750Kuv(C1DRG c1drg) {
        this.LL = c1drg;
        h0<Pair<Boolean, Boolean>> h0Var = new h0<>(null);
        this.LLILLJJLI = h0Var;
        this.LLILLL = h0Var;
        this.LLILZ = this;
    }

    @Override // X.InterfaceC532760Kuw
    public void Fn0(boolean z, boolean z2) {
        this.LLILLJJLI.LJII(new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }
}
