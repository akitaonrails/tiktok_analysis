package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10vA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class ViewOnClickListenerC19400210vA extends FrameLayout implements View.OnClickListener {
    public TextView LL;
    public TuxIconView LLILLJJLI;
    public InterfaceC19400310vB LLILLL;

    public ViewOnClickListenerC19400210vA() {
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LLILLL == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.tv_search) {
            this.LLILLL.LJIILJJIL();
        } else {
            if (id != R.id.u0q) {
                return;
            }
            this.LLILLL.LJIILL();
        }
    }

    public void setOnInternalClickListener(InterfaceC19400310vB interfaceC19400310vB) {
        this.LLILLL = interfaceC19400310vB;
    }

    public ViewOnClickListenerC19400210vA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f1w, this, true);
        this.LL = (TextView) viewTd.findViewById(R.id.tv_search);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.u0q);
        this.LLILLJJLI = tuxIconView;
        C10VP.LIZIZ(tuxIconView);
        C786410Ut5.a9(this.LLILLJJLI, this);
        C786410Ut5.T7(this.LL, this);
    }
}
