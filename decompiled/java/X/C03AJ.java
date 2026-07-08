package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03AJ extends ConstraintLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;

    public C03AJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
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

    public final void setUsLabelContentFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUsLabelIconFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public C03AJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b19, this, true);
    }

    public /* synthetic */ C03AJ(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
