package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;
import mf.a;

/* JADX INFO: renamed from: X.0Inq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477400Inq extends ConstraintLayout {
    public final C01GW LL;

    public final View getAlertDot() {
        return (View) this.LL.getValue();
    }

    public C477400Inq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C477400Inq(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 366));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dfa, this, true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0Inr
            /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instruction units count: 215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC477410Inr.onClick(android.view.View):void");
            }
        };
        a aVar = new a(C1848410yCV.LIZ ? new f(onClickListener) : onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
