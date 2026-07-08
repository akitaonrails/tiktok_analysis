package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.zhiliaoapp.musically.R;
import t2b.c;

/* JADX INFO: renamed from: X.0vhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752430vhh extends FrameLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public c LLILLL;

    public final Feed getData() {
        return null;
    }

    public final SmartImageView getProductImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rxu);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getProductPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rza);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final c getStyle() {
        return this.LLILLL;
    }

    public C1752430vhh(Context context) {
        super(context, null, 0);
        C954703oH.LIZ(context, R.layout.ayi, this, true);
    }

    public final void setProductImageFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setProductPriceFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setStyle(c cVar) {
        this.LLILLL = cVar;
    }
}
