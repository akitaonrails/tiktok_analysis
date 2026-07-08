package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vtm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759920vtm extends FrameLayout {
    public LinearLayout LL;
    public final LinearLayout LLILLJJLI;

    public final LinearLayout getThumbnailContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xut);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public C1759920vtm(Context context) {
        super(context, null, 0);
        C954703oH.LIZ(context, R.layout.arj, this, true);
        this.LLILLJJLI = getThumbnailContainerFromXml();
    }

    public final void setThumbnailContainerFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }
}
