package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS252S0300000_8;

/* JADX INFO: renamed from: X.0MF8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MF8 extends AbstractC2255721DQs<C0MF0> implements InterfaceC379610EuV, C0MF0 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1631620sYq<Boolean, Boolean, Function0<Unit>, Unit> LLILLJJLI;
    public final C0MF0 LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC578430MmP.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MF8.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    public final InterfaceC578430MmP X1() {
        return (InterfaceC578430MmP) this.LLILZ.getValue(this, LLILZIL[0]);
    }

    public C0MF0 W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0MF8(C1DRG c1drg, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super Function0<Unit>, Unit> interfaceC1631620sYq) {
        this.LL = c1drg;
        this.LLILLJJLI = interfaceC1631620sYq;
    }

    @Override // X.C0MF0
    public void z50(SwitchModePayload switchModePayload, Bundle bundle) {
        this.LLILLJJLI.invoke(Boolean.FALSE, Boolean.TRUE, new AwS252S0300000_8(this, switchModePayload, bundle, 5));
    }
}
