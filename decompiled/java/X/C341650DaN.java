package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341650DaN extends LinearLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public SmartImageView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;

    public final SmartImageView getIvPromotionIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ls4);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getIvPromotionImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ls5);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTvPromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_promotion);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C341650DaN(Context context) {
        super(context, null, 0);
        setOrientation(0);
        setGravity(16);
        C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.z4)), R.layout.btc, this, true);
    }

    public final void setIvPromotionIconFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setIvPromotionImageFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setMaxWidth(int i) {
        int iLIZIZ;
        if (getTvPromotionFromXml().getVisibility() == 0) {
            if (getIvPromotionIconFromXml().getVisibility() == 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            } else {
                iLIZIZ = 0;
            }
            getTvPromotionFromXml().setMaxWidth(i - iLIZIZ);
            getTvPromotionFromXml().setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void setTvPromotionFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }
}
