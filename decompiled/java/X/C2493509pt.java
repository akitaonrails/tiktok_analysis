package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.09pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2493509pt extends ConstraintLayout {
    public final View LL;

    public void setOnClickCloseListener(InterfaceC2493609pu interfaceC2493609pu) {
    }

    public C2493509pt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2493509pt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (((Boolean) C1789006zY.LIZ.getValue()).booleanValue() && (context instanceof Activity)) {
            this.LL = C20673215v0.LIZLLL(R.layout.b_g, C1388190mED.LIZ(context), this, true);
        } else {
            this.LL = C786410Ut5.Sd(R.layout.b_g, C786410Ut5.ne(context), this);
        }
        this.LL.findViewById(R.id.od0);
        this.LL.findViewById(R.id.ocy);
        this.LL.findViewById(R.id.ocz);
        this.LL.findViewById(R.id.od1);
        this.LL.findViewById(R.id.ocx);
    }
}
