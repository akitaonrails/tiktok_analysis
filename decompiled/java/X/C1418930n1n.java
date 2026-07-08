package X;

import Y.ACListenerS156S0100000_22;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0n1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418930n1n extends FrameLayout {
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;

    public final Function0<Unit> getQuickPublishClickCallBack() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getSaveLocalClickCallBack() {
        return this.LL;
    }

    public C1418930n1n(Context context) {
        super(context, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.byh, this, true);
        RelativeLayout relativeLayout = (RelativeLayout) viewTd.findViewById(R.id.tzw);
        LinearLayout linearLayout = (LinearLayout) viewTd.findViewById(R.id.snn);
        C786410Ut5.S7(relativeLayout, new ACListenerS156S0100000_22(this, 34));
        C786410Ut5.R7(linearLayout, new ACListenerS156S0100000_22(this, 35));
    }

    public final void setQuickPublishClickCallBack(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setSaveLocalClickCallBack(Function0<Unit> function0) {
        this.LL = function0;
    }
}
