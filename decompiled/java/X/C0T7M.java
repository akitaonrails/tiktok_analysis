package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T7M, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T7M extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C843920X8s LL;
    public final /* synthetic */ C843930X8t LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C0T7K LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T7M(Context context, C843930X8t c843930X8t, C1882170z4x c1882170z4x, C843920X8s c843920X8s) {
        super(1);
        this.LL = c843920X8s;
        this.LLILLJJLI = c843930X8t;
        this.LLILLL = context;
        this.LLILZ = c1882170z4x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.LJIILIIL(this.LLILLJJLI, this.LLILLL, str);
        C0T7K c0t7k = this.LLILZ;
        if (c0t7k != null) {
            c0t7k.LIZ(0, "", true);
        }
        return Unit.LIZ;
    }
}
