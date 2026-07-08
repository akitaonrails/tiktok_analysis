package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ESq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364980ESq extends C09AY implements Function1<C1DRG, C0EVO> {
    public final /* synthetic */ C559610Lx9 LL;
    public final /* synthetic */ C372480Ej0 LLILLJJLI;
    public final /* synthetic */ C372830EjZ LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C364980ESq(C0ET4 c0et4, C559610Lx9 c559610Lx9, C372480Ej0 c372480Ej0, C372830EjZ c372830EjZ, int i, int i2) {
        super(1);
        this.LL = c559610Lx9;
        this.LLILLJJLI = c372480Ej0;
        this.LLILLL = c372830EjZ;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C0EVO invoke(C1DRG c1drg) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C0EVO c0evo = new C0EVO(c1drg, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        this.LL.getClass();
        C559610Lx9.LIZ(c0evo);
        c0evo.afterInit$als_release(jUptimeMillis);
        return c0evo;
    }
}
