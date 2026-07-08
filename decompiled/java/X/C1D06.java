package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D06, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D06 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D06(C2248671Czp c2248671Czp) {
        super(1);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        if (view2 instanceof TuxTextView) {
            C426750GoL.LJIIIZ(view2, null, null, null, Integer.valueOf(this.LL.LJIL()), false, 23);
            if (this.LL.LJIJJ()) {
                TuxTextView tuxTextView = (TuxTextView) view2;
                tuxTextView.LJJJJI(16.0f);
                tuxTextView.setTuxFont(102);
                tuxTextView.setTextColor(ColorProtector.parseColor("#F6F6F6"));
            } else {
                ((TuxTextView) view2).LJJJJI(32.0f);
            }
            if (C1867340yh2.LIZ()) {
                ((TextView) view2).setFontFeatureSettings("tnum");
            }
            ((TextView) view2).setText(C0QBT.LIZ(0, false));
        }
        return Unit.LIZ;
    }
}
