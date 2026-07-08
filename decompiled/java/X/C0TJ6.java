package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJ6 extends FrameLayout {
    public C21411818qq LL;
    public TuxTextView LLILLJJLI;

    public final TuxTextView getProfileFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s08);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C21411818qq getViewerAuthSwitchFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.viewer_auth_switch);
            this.LL = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public C0TJ6(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.ejn, this);
        getViewerAuthSwitchFromXml().setChecked(true);
    }

    public final void setProfileFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setSwitchDescription(String str) {
        getProfileFromXml().setText(str);
    }

    public final void setViewerAuthSwitchFromXml(C21411818qq c21411818qq) {
        this.LL = c21411818qq;
    }
}
