package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iP8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241200iP8 extends ConstraintLayout {
    public C0I7D LL;
    public TuxIconView LLILLJJLI;
    public Function0<Unit> LLILLL;

    public final TuxIconView getClearBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e05);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C0I7D getSearchEditTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u9v);
            this.LL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final EditText getEditText() {
        return getSearchEditTextFromXml();
    }

    public final Function0<Unit> getOnClearClick() {
        return this.LLILLL;
    }

    public final void setBackBtnListener(Function0<Unit> function0) {
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.bn2);
        if (tuxIconView != null) {
            C12ES.LJIILL(0, tuxIconView);
            C786410Ut5.a9(tuxIconView, new ACListenerS154S0100000_19(function0, 111));
        }
    }

    public final void setClearBtnFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setOnClearClick(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setSearchEditTextFromXml(C0I7D c0i7d) {
        this.LL = c0i7d;
    }

    public C1241200iP8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.inflate(context, R.layout.cjw, this);
        getSearchEditTextFromXml().setHint(context.getString(2131832154));
        getSearchEditTextFromXml().addTextChangedListener(new C1266020j3A(this, 3));
        C786410Ut5.a9(getClearBtnFromXml(), new ACListenerS154S0100000_19(this, 110));
    }
}
