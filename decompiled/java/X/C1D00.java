package X;

import android.view.View;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1D00, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D00 extends C09AY implements Function2<Integer, View, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D00(C2248671Czp c2248671Czp) {
        super(2);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, View view) {
        C09MI c09mi;
        int iIntValue = num.intValue();
        if ((view instanceof ImageView) && (c09mi = this.LL.LLLI) != null) {
            c09mi.LJI(iIntValue);
        }
        return Unit.LIZ;
    }
}
