package X;

import com.bytedance.als.h0;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203030hPZ extends AbstractC2255721DQs<InterfaceC1203040hPa> implements InterfaceC1203040hPa, InterfaceC379610EuV {
    public static final int LLILZ = 8;
    public final C1DRG LL;
    public final InterfaceC1203040hPa LLILLJJLI = this;
    public final C385670FAf<Pair<String, String>> LLILLL = new h0(null);

    @Override // X.InterfaceC1203040hPa
    public C385670FAf<Pair<String, String>> FJ2() {
        return this.LLILLL;
    }

    public InterfaceC1203040hPa W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1203030hPZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1203040hPa
    public void fC0(String str, String str2) {
        FJ2().LJFF(new Pair<>(str, str2));
    }
}
