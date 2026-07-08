package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213630hgf extends FrameLayout {
    public TextView LL;
    public C19P3 LLILLJJLI;

    public final C19P3 getAdjustBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ahu);
            this.LLILLJJLI = (C19P3) callbackFindViewById;
        }
        return (C19P3) callbackFindViewById;
    }

    public final TextView getCommonTextAdjustBarTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.emy);
            this.LL = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final void setAdjustBarFromXml(C19P3 c19p3) {
        this.LLILLJJLI = c19p3;
    }

    public final void setCommonTextAdjustBarTvFromXml(TextView textView) {
        this.LL = textView;
    }

    public final void setDefaultValue(int i) {
        getAdjustBarFromXml().setDefaultValue(i);
    }

    public final void setLevel(int i) {
        getAdjustBarFromXml().setLevel(i);
    }

    public final void setOnLevelChangeListener(InterfaceC1213640hgg interfaceC1213640hgg) {
        getAdjustBarFromXml().setOnLevelChangeListener(interfaceC1213640hgg);
    }

    public final void setText(String str) {
        getCommonTextAdjustBarTvFromXml().setText(str);
    }

    public C1213630hgf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Sd(R.layout.afj, C786410Ut5.ne(context), this);
    }
}
