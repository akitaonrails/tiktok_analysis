package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1422250n79 extends C2217421BqW implements Function1<View, Unit> {
    public C1422250n79(C1422980n8K c1422980n8K) {
        super(1, c1422980n8K, C1422980n8K.class, "onTitleBarCreateFinish", "onTitleBarCreateFinish(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        ((C1422980n8K) this.receiver).LLLI = view;
        return Unit.LIZ;
    }
}
