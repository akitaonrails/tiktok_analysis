package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.footer.SeaFooterItemVO;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764330w0t extends AbstractC1764630w1N<C1068904Fz> {
    public SeaFooterItemVO LL;
    public final InterfaceC665370Q7z LLILLJJLI;
    public final C01GW LLILLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1764330w0t(C1764150w0b c1764150w0b) {
        final Context context = c1764150w0b.getContext();
        super(new FrameLayout(context) { // from class: X.03Do
            {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(layoutParams);
                Context context2 = getContext();
                C1755600vmo.LIZ.getClass();
                addView(C1755600vmo.LIZ(R.layout.arz, context2, this, false, false), 0);
            }
        });
        this.LLILLJJLI = C1764650w1P.LIZ(c1764150w0b);
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1219));
    }
}
