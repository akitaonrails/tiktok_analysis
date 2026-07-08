package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: renamed from: X.0iJS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237680iJS extends LinearLayout {
    public C1237400iJ0 LL;
    public final C1754640vlG LLILLJJLI;
    public final C1748330vb5 LLILLL;

    public final C1237400iJ0 getFormViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iia);
            this.LL = (C1237400iJ0) callbackFindViewById;
        }
        return (C1237400iJ0) callbackFindViewById;
    }

    public final C1754640vlG getPinField() {
        return this.LLILLJJLI;
    }

    public final void setFormViewFromXml(C1237400iJ0 c1237400iJ0) {
        this.LL = c1237400iJ0;
    }

    public final void setInputLength(int i) {
        this.LLILLJJLI.setPattern(new C339010DQt(Collections.singletonList(Integer.valueOf(i))));
    }

    public C1237680iJS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1754640vlG c1754640vlG = new C1754640vlG(context, null, 6);
        this.LLILLJJLI = c1754640vlG;
        this.LLILLL = new C1748330vb5(context, null, 6);
        LinearLayout.inflate(context, R.layout.a04, this);
        C1754640vlG c1754640vlG2 = this.LLILLJJLI;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1754640vlG2);
        c1754640vlG2.setLayoutParams(layoutParams);
        c1754640vlG2.setPattern(new C339010DQt(Collections.singletonList(6)));
        c1754640vlG2.setAutoWidth(true);
        c1754640vlG2.setPinType(EnumC1723120uwQ.NUMERIC);
        C1748330vb5 c1748330vb5 = this.LLILLL;
        C786410Ut5.K6(c1748330vb5, new LinearLayout.LayoutParams(-1, -2));
        c1748330vb5.setMessageIcon(C958703ov.LIZ);
        getFormViewFromXml().setContent(c1754640vlG);
    }
}
