package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392020mKO extends RelativeLayout {
    public final TuxTextView LL;
    public Function0<Unit> LLILLJJLI;

    public final Function0<Unit> getOnCloseCallback() {
        return this.LLILLJJLI;
    }

    public C1392020mKO(Context context) {
        super(context, null, 0);
        RelativeLayout.inflate(context, R.layout.dna, this);
        findViewById(R.id.k4o);
        this.LL = (TuxTextView) findViewById(R.id.zit);
        C786410Ut5.a9((TuxIconView) findViewById(R.id.jzi), new ACListenerS155S0100000_21(this, 247));
    }

    public final void LIZ(String str) {
        if (str == null) {
            return;
        }
        this.LL.setText(C786410Ut5.j4(getContext().getString(2131857210), Arrays.copyOf(new Object[]{str}, 1)));
    }

    public final void setOnCloseCallback(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        CharSequence text = this.LL.getText();
        if ((text == null || text.length() == 0) && i == 0) {
            C337180DJs.LIZ(this);
        } else {
            super.setVisibility(i);
        }
    }
}
