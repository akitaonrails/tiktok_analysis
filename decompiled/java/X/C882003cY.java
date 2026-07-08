package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C882003cY extends ConstraintLayout {
    public final int LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;

    public final C197039127h getServiceFeeButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uto);
            this.LLILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxTextView getServiceFeeContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.utq);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final int getScene() {
        return this.LL;
    }

    public /* synthetic */ C882003cY(Context context) {
        this(context, null, 0, 0);
    }

    public final void setServiceFeeButtonFromXml(C197039127h c197039127h) {
        this.LLILLL = c197039127h;
    }

    public final void setServiceFeeContentFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void e0(String str, String str2, boolean z) {
        Context context;
        getServiceFeeContentFromXml().setText(str);
        getServiceFeeButtonFromXml().setText(str2);
        if (z && (context = getContext()) != null) {
            getServiceFeeButtonFromXml().LJJJJL(new AwS580S0100000_1(context, 47));
        }
    }

    public C882003cY(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.LL = i2;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aqx, this, true).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
    }
}
