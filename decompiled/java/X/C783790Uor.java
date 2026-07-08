package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Uor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783790Uor extends FrameLayout {
    public final TuxTextView LL;
    public View.OnClickListener LLILLJJLI;

    public final View.OnClickListener getClickListener() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783790Uor(Context context) {
        final TuxIconView tuxIconView;
        super(context, null, 0);
        TuxTextView tuxTextView = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dgh, this, true);
        if (viewTd != null) {
            View viewFindViewById = viewTd.findViewById(R.id.d9o);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(context, 403), viewFindViewById);
            }
            tuxTextView = (TuxTextView) viewTd.findViewById(R.id.tb7);
        }
        this.LL = tuxTextView;
        if (viewTd != null && (tuxIconView = (TuxIconView) viewTd.findViewById(R.id.q98)) != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0Uos
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view) {
                    View.OnClickListener clickListener = this.LLILZ.getClickListener();
                    if (clickListener != null) {
                        clickListener.onClick(tuxIconView);
                    }
                }
            }, tuxIconView);
        }
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.LLILLJJLI = onClickListener;
    }
}
