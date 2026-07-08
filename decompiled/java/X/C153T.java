package X;

import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.153T, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C153T extends ConstraintLayout {
    public final View LL;

    public final void setOnClickListener(Function0<Unit> function0) {
        View view = this.LL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(function0, 22), view);
        }
    }

    public C153T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h7m, this, true);
        this.LL = findViewById(R.id.xz_);
    }
}
