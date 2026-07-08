package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03K9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03K9 extends ConstraintLayout {
    public SmartImageView LL;
    public SmartImageView LLILLJJLI;
    public C03EF LLILLL;

    public final C03EF getComTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e97);
            this.LLILLL = (C03EF) callbackFindViewById;
        }
        return (C03EF) callbackFindViewById;
    }

    public final SmartImageView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getPrefixIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ro9);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public /* synthetic */ C03K9(Context context) {
        this(context, null, 0);
    }

    public final void setComTextFromXml(C03EF c03ef) {
        this.LLILLL = c03ef;
    }

    public final void setDefaultClickListener(Function0<Unit> function0) {
        getComTextFromXml().setDefaultClickListener(new AwS545S0100000_1(function0, (Function0<Unit>) 1651));
        getComTextFromXml().setClickable(true);
        C786410Ut5.I7(new AjS60S0100000_1((Function0) function0, 100), getIconFromXml());
    }

    public final void setIconFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setPrefixIconFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public C03K9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C954703oH.LIZ(context, R.layout.bod, this, true);
    }
}
