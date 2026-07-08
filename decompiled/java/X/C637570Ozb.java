package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Ozb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637570Ozb extends FrameLayout {
    public C424560Gko LL;
    public final C424560Gko LLILLJJLI;
    public final C424560Gko LLILLL;

    public final C424560Gko getNotificationStickerCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pf7);
            this.LL = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    public final void setNotificationStickerCoverFromXml(C424560Gko c424560Gko) {
        this.LL = c424560Gko;
    }

    public C637570Ozb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewSd = C786410Ut5.Sd(R.layout.aaq, C786410Ut5.ne(context), this);
        this.LLILLJJLI = (C424560Gko) viewSd.findViewById(R.id.pf7);
        this.LLILLL = (C424560Gko) viewSd.findViewById(R.id.pf8);
    }

    public final void LIZ(C424560Gko c424560Gko, UrlModel urlModel) {
        List<String> urlList;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(500));
            c1331670kl3LJIIIIZZ.LIZLLL(EnumC1906770zid.ACTIVITY.getCoverSceneTag());
            c1331670kl3LJIIIIZZ.LJJ(c424560Gko);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            return;
        }
        c424560Gko.setImageDrawable(C1308910kAL.LJ(R.attr.br, getContext()));
    }
}
