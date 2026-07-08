package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.186q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212310186q extends LinearLayout {
    public final C212295186b<ViewGroup> LL;
    public final AnonymousClass1873 LLILLJJLI;
    public final FrameLayout LLILLL;

    public final C212295186b<ViewGroup> getProductPriceController() {
        return this.LL;
    }

    public C212310186q(Context context) {
        super(context, null, 0);
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(R.layout.bwq, layoutInflaterCloneInContext, this);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.user_info_container);
        this.LLILLL = frameLayout;
        this.LL = new C212295186b<>(this, new C212299186f(R.id.rta), 2, 2);
        this.LLILLJJLI = new AnonymousClass1873(frameLayout, 1, 2);
    }

    public final void LIZ(AnonymousClass1872 anonymousClass1872) {
        if (anonymousClass1872.LJII != null) {
            this.LL.LJIIJJI(anonymousClass1872.LJII);
        }
        this.LLILLJJLI.LJIIL(anonymousClass1872);
    }
}
