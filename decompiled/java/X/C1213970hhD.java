package X;

import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213970hhD extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213970hhD(C2248671Czp c2248671Czp) {
        super(1);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        if (view2 instanceof TuxTextView) {
            if (this.LL.LJIJJ()) {
                int iLIZJ = (int) C12ES.LIZJ(8.0f, this.LL.LL.getContext());
                C426750GoL.LJIIIZ(view2, Integer.valueOf(iLIZJ), 0, Integer.valueOf(iLIZJ), 0, false, 16);
                TuxTextView tuxTextView = (TuxTextView) view2;
                tuxTextView.setTextColor(ColorProtector.parseColor("#99FFFFFF"));
                tuxTextView.setTuxFont(91);
            } else {
                int iLIZJ2 = (int) C12ES.LIZJ(19.0f, this.LL.LL.getContext());
                C426750GoL.LJIIIZ(view2, Integer.valueOf(iLIZJ2), 0, Integer.valueOf(iLIZJ2), 0, false, 16);
            }
        }
        return Unit.LIZ;
    }
}
