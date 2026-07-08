package X;

import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850970yGd extends FrameLayout {
    public final C1850960yGc LL;

    public C1850970yGd(Context context) {
        super(context, null, 0);
        this.LL = new C1850960yGc(null);
        C786410Ut5.Sd(R.layout.fpw, C786410Ut5.ne(context), this);
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 207), findViewById(R.id.xb0));
        View viewFindViewById = findViewById(R.id.xb4);
        if (C960203pA.LIZIZ(context)) {
            viewFindViewById.setBackgroundResource(R.drawable.def);
        } else {
            viewFindViewById.setBackgroundResource(R.drawable.dee);
        }
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 208), findViewById(R.id.xaz));
    }

    public final void setClickListener(Function1<? super C1850960yGc, Unit> function1) {
        function1.invoke(this.LL);
    }
}
