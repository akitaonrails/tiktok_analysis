package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1237690iJT extends LinearLayout {
    public C1237400iJ0 LL;
    public final C1748440vbG LLILLJJLI;
    public final C1748330vb5 LLILLL;

    public C1237690iJT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final C1237400iJ0 getFormViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iia);
            this.LL = (C1237400iJ0) callbackFindViewById;
        }
        return (C1237400iJ0) callbackFindViewById;
    }

    public final void LIZ() {
        getFormViewFromXml().setFooter(null);
        this.LLILLJJLI.setValidationStatus(0);
    }

    public final C1748440vbG getInputBox() {
        return this.LLILLJJLI;
    }

    public final void LIZIZ(String str) {
        if (str != null) {
            this.LLILLL.setMessage(str);
            getFormViewFromXml().setFooter(this.LLILLL);
        }
        this.LLILLJJLI.setEnabled(true);
        this.LLILLJJLI.setValidationStatus(3);
    }

    public final void setFormViewFromXml(C1237400iJ0 c1237400iJ0) {
        this.LL = c1237400iJ0;
    }

    public C1237690iJT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1748440vbG c1748440vbG = new C1748440vbG(context, null, 6);
        this.LLILLJJLI = c1748440vbG;
        this.LLILLL = new C1748330vb5(context, null, 6);
        LinearLayout.inflate(context, R.layout.a04, this);
        C786410Ut5.L6(this.LLILLJJLI, new LinearLayout.LayoutParams(-1, -2));
        C1748330vb5 c1748330vb5 = this.LLILLL;
        C786410Ut5.K6(c1748330vb5, new LinearLayout.LayoutParams(-1, -2));
        c1748330vb5.setMessageIcon(C958703ov.LIZ);
        getFormViewFromXml().setContent(c1748440vbG);
    }

    public /* synthetic */ C1237690iJT(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
