package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908270zl3 extends C09AY implements Function1<C1908260zl2, Unit> {
    public final /* synthetic */ EnumC1908280zl4 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908270zl3(EnumC1908280zl4 enumC1908280zl4, int i, String str) {
        super(1);
        this.LL = enumC1908280zl4;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1908260zl2 c1908260zl2) {
        C1908260zl2 c1908260zl22 = c1908260zl2;
        c1908260zl22.LIZ = this.LL.getTypeName();
        int i = C1908290zl5.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1908260zl22.LIZJ = this.LLILLJJLI;
            }
        } else {
            c1908260zl22.LIZIZ = this.LLILLJJLI;
        }
        c1908260zl22.LIZLLL = this.LLILLL;
        c1908260zl22.LJFF = SystemClock.uptimeMillis();
        return Unit.LIZ;
    }
}
