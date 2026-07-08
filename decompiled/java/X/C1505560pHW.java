package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505560pHW extends C09AY implements Function0<C1505540pHU> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1505560pHW(int i) {
        super(0);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1505540pHU invoke() {
        C1505540pHU c1505540pHU = new C1505540pHU(30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1505570pHX("assem-serial-t", this.LL));
        c1505540pHU.allowCoreThreadTimeOut(true);
        return c1505540pHU;
    }
}
