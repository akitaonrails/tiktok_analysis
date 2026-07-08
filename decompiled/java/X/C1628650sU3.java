package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0sU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1628650sU3 extends C2217421BqW implements Function0<Unit> {
    public C1628650sU3(C1628610sTz c1628610sTz) {
        super(0, c1628610sTz, C1628610sTz.class, "continueProcess", "continueProcess()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1628610sTz c1628610sTz = (C1628610sTz) this.receiver;
        AwS426S0200000_25 awS426S0200000_25 = c1628610sTz.LLIZ;
        if (awS426S0200000_25 != null) {
            awS426S0200000_25.invoke();
        }
        c1628610sTz.LLIZ = null;
        return Unit.LIZ;
    }
}
