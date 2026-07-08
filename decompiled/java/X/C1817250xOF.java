package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817250xOF extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ AbstractC1817030xNt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817250xOF(AbstractC1817030xNt abstractC1817030xNt) {
        super(1);
        this.LL = abstractC1817030xNt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        if (view2 != null) {
            this.LL.setFontSelectView(view2);
        }
        this.LL.LJIILIIL();
        return Unit.LIZ;
    }
}
