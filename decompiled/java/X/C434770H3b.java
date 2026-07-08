package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C434770H3b extends FrameLayout {
    public C434760H3a LL;
    public ImageView LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public final void setClickCenter(C434790H3d c434790H3d) {
    }

    public final ImageView getCreatorPanelHeaderCancelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f8j);
            this.LLILLJJLI = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C434760H3a getTabCreatorPanelHeaderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wxf);
            this.LL = (C434760H3a) callbackFindViewById;
        }
        return (C434760H3a) callbackFindViewById;
    }

    public View getCancelView() {
        return getCreatorPanelHeaderCancelFromXml();
    }

    public C434760H3a getRecyclerView() {
        return getTabCreatorPanelHeaderFromXml();
    }

    public int getTitleLayoutRes() {
        return this.LLILLL;
    }

    public int getViewHolderLayoutRes() {
        return this.LLILZ;
    }

    public final void setCreatorPanelHeaderCancelFromXml(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public final void setTabCreatorPanelHeaderFromXml(C434760H3a c434760H3a) {
        this.LL = c434760H3a;
    }

    public C434770H3b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = R.layout.ag1;
        this.LLILZ = R.layout.bij;
    }
}
