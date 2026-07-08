package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821630xVJ extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C1781590wSj LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821630xVJ(C1821880xVi c1821880xVi, C1781590wSj c1781590wSj) {
        super(2);
        this.LL = c1821880xVi;
        this.LLILLJJLI = c1781590wSj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        C1821500xV6.LIZLLL("click", "got_it", this.LLILLJJLI);
        return Unit.LIZ;
    }
}
