package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xKC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814740xKC extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814740xKC(C1814710xK9 c1814710xK9) {
        super(2);
        this.LL = c1814710xK9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        c1391990mKL.LIZIZ = true;
        this.LL.invoke();
        C1813080xHW.LJFF("allow");
        return Unit.LIZ;
    }
}
