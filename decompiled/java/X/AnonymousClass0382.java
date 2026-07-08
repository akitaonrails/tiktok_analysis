package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0382, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0382 extends ConstraintLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;

    public final TuxIconView getInfoIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kmg);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getUsLabelContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_label_content);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getUsLabelIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_label_icon);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public /* synthetic */ AnonymousClass0382(Context context) {
        this(context, null, 0);
    }

    public final void setInfoIconFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setUsLabelContentFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUsLabelIconFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public AnonymousClass0382(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b17, this, true);
    }
}
