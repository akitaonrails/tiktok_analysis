package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751760TeI extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C843920X8s LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C843930X8t LLILLL;
    public final /* synthetic */ C0T7K LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751760TeI(Context context, C843930X8t c843930X8t, C1882170z4x c1882170z4x, C843920X8s c843920X8s) {
        super(1);
        this.LL = c843920X8s;
        this.LLILLJJLI = context;
        this.LLILLL = c843930X8t;
        this.LLILZ = c1882170z4x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        if (C843920X8s.LJII(this.LLILLJJLI, this.LLILLL.LJIIIIZZ, str)) {
            C843920X8s c843920X8s = this.LL;
            EnumC751770TeJ enumC751770TeJ = EnumC751770TeJ.LL;
            C843930X8t c843930X8t = this.LLILLL;
            c843920X8s.getClass();
            C843920X8s.LJIIJJI(enumC751770TeJ, c843930X8t);
        } else {
            C843920X8s c843920X8s2 = this.LL;
            EnumC751770TeJ enumC751770TeJ2 = EnumC751770TeJ.LLILZ;
            C843930X8t c843930X8t2 = this.LLILLL;
            c843920X8s2.getClass();
            C843920X8s.LJIIJJI(enumC751770TeJ2, c843930X8t2);
        }
        C0T7K c0t7k = this.LLILZ;
        if (c0t7k != null) {
            c0t7k.LIZ(0, "", true);
        }
        return Unit.LIZ;
    }
}
