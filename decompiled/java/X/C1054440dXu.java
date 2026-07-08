package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054440dXu extends RelativeLayout {
    public C0HZQ LL;

    public final C0HZQ getShopifyDisclaimerCheckBoxFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v8j);
            this.LL = (C0HZQ) callbackFindViewById;
        }
        return (C0HZQ) callbackFindViewById;
    }

    public C1054440dXu(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f8t, this, true);
    }

    public final void setShopifyDisclaimerCheckBoxFromXml(C0HZQ c0hzq) {
        this.LL = c0hzq;
    }
}
