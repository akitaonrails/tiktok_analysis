package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262880iy6 extends C09AY implements Function1<View, Boolean> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1262850iy3 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1262880iy6(int i, int i2, View view, C1262850iy3 c1262850iy3, Function0 function0) {
        super(1);
        this.LL = view;
        this.LLILLJJLI = i;
        this.LLILLL = c1262850iy3;
        this.LLILZ = i2;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View view) {
        View view2 = this.LL;
        return Boolean.valueOf(RunnableC1262860iy4.LIZIZ(this.LLILLJJLI, this.LLILZ, view2, this.LLILLL, this.LLILZIL));
    }
}
