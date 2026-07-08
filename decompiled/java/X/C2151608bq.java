package X;

import android.os.Looper;
import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08bq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2151608bq extends C09AY implements Function0<CoroutineContext> {
    public C2151608bq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ CoroutineContext invoke() {
        Choreographer choreographerV2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographerV2 = C786410Ut5.v2();
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            choreographerV2 = (Choreographer) C23250099c.LJ(C2107308Nj.LIZ, new C2128908Vr(null));
        }
        C1838750xwv c1838750xwv = new C1838750xwv(choreographerV2, C08D5.LIZ(Looper.getMainLooper()));
        return c1838750xwv.plus(c1838750xwv.LLJI);
    }
}
