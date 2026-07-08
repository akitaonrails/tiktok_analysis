package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01A5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01A5 extends C09AY implements Function1<View, Boolean> {
    public final /* synthetic */ Function1<Float, View> LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01A5(int i, View view, Function1 function1) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = view;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View view) {
        this.LL.invoke(Float.valueOf(this.LLILLJJLI.getWidth() / this.LLILLL));
        return Boolean.TRUE;
    }
}
