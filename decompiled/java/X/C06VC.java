package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06VC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06VC extends FrameLayout {
    public Function0<Unit> LL;

    public C06VC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.afl, this, false);
        addView(viewTd);
        int i = R.id.cuf;
        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.cuf, viewTd);
        if (c197039127h != null) {
            i = R.id.lpv;
            if (C1616006Uk.LIZ(R.id.lpv, viewTd) != null) {
                i = R.id.tv_tip_second;
                TextView textView = (TextView) C1616006Uk.LIZ(R.id.tv_tip_second, viewTd);
                if (textView != null) {
                    i = R.id.tv_tip_title;
                    TextView textView2 = (TextView) C1616006Uk.LIZ(R.id.tv_tip_title, viewTd);
                    if (textView2 != null) {
                        C786410Ut5.U8(c197039127h, new ACListenerS137S0100000_2(this, 75));
                        textView2.setText(getContext().getString(R.string.effect_tool_noconnection1));
                        textView.setText(getContext().getString(R.string.effect_tool_noconnection2));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
