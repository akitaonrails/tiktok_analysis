package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UPY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UPY extends LinearLayout {
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public LiveIconView LLILLL;

    public final C16F5 getBannerSubtitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bs_);
            this.LLILLJJLI = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getBannerTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bsc);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final LiveIconView getRightIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tld);
            this.LLILLL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public C0UPY(Context context) {
        super(context, null, 0);
        C500260Jjc.LJIILL(R.layout.hi0, this, true);
    }

    public final void setBannerSubtitleFromXml(C16F5 c16f5) {
        this.LLILLJJLI = c16f5;
    }

    public final void setBannerTitleFromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    public final void setRightIcon(boolean z) {
        if (z) {
            C786410Ut5.LLJJIJIL(getRightIconFromXml(), 0);
        } else {
            C786410Ut5.LLJJIJIL(getRightIconFromXml(), 8);
        }
    }

    public final void setRightIconFromXml(LiveIconView liveIconView) {
        this.LLILLL = liveIconView;
    }

    public final void setSubTitle(CharSequence charSequence) {
        Boolean boolValueOf;
        boolean z;
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            getBannerSubtitleFromXml().setText(charSequence);
        } else {
            C786410Ut5.LLJJJJ(getBannerSubtitleFromXml(), 8);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        Boolean boolValueOf;
        boolean z;
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            getBannerTitleFromXml().setText(charSequence);
        } else {
            C786410Ut5.LLJJJJ(getBannerTitleFromXml(), 8);
        }
    }
}
