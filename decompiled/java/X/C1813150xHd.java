package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813150xHd extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C1813140xHc LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813150xHd(Function0<Unit> function0, C1813140xHc c1813140xHc, boolean z) {
        super(2);
        this.LL = function0;
        this.LLILLJJLI = c1813140xHc;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        String str;
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        C1813140xHc c1813140xHc = this.LLILLJJLI;
        if (this.LLILLL) {
            str = "setting_page";
        } else {
            str = "live_recording";
        }
        c1813140xHc.getClass();
        C1813140xHc.LIZ(str, "click", "confirm");
        return Unit.LIZ;
    }
}
