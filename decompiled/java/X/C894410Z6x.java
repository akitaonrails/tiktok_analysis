package X;

import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894410Z6x extends FrameLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0Z4E.LIZ.getClass();
        C0Z4E.LIZIZ = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0Z4E.LIZ.getClass();
        C0Z4E.LIZIZ = false;
    }

    public final Function0<Unit> getOnAction() {
        return this.LL;
    }

    public final Function0<Unit> getOnDismiss() {
        return this.LLILLJJLI;
    }

    public C894410Z6x(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.dme, this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.o9w);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS149S0100000_14(this, 81));
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.o9y);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS149S0100000_14(this, 82));
        }
    }

    public final void setOnAction(Function0<Unit> function0) {
        this.LL = function0;
    }

    public final void setOnDismiss(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }
}
