package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ujg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780580Ujg extends FrameLayout {
    public C16F5 LL;
    public LinearLayout LLILLJJLI;
    public DataChannel LLILLL;

    public final LinearLayout getCancelActionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.day);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C16F5 getTvTipTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_tip_text);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final DataChannel getDataChannel() {
        return this.LLILLL;
    }

    public final void setCancelActionFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLILLL = dataChannel;
    }

    public final void setTipText(String str) {
        C16F5 tvTipTextFromXml = getTvTipTextFromXml();
        if (tvTipTextFromXml != null) {
            tvTipTextFromXml.setText(str);
        }
    }

    public final void setTvTipTextFromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    public C780580Ujg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
