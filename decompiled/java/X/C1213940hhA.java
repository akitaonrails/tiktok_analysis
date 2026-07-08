package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213940hhA extends C09AY implements Function2<Integer, View, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213940hhA(C2248671Czp c2248671Czp) {
        super(2);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, View view) {
        TextView textView;
        int iIntValue = num.intValue();
        View view2 = view;
        if ((view2 instanceof TuxTextView) && (textView = (TextView) view2) != null) {
            textView.setText(C0QBT.LIZLLL(iIntValue / 100.0f, this.LL.LLJJIJIIJIL));
        }
        return Unit.LIZ;
    }
}
