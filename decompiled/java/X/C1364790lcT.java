package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0lcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364790lcT extends FrameLayout {
    public final TextView LL;
    public final FrameLayout LLILLJJLI;
    public final C427660Gpo LLILLL;
    public final C421640Gg6 LLILZ;

    public C1364790lcT(Context context) {
        super(context, null, 0);
        View viewInflate = FrameLayout.inflate(context, R.layout.cmo, this);
        this.LL = (TextView) viewInflate.findViewById(R.id.k_z);
        this.LLILLJJLI = (FrameLayout) viewInflate.findViewById(R.id.kc4);
        this.LLILLL = (C427660Gpo) viewInflate.findViewById(R.id.k_y);
        this.LLILZ = (C421640Gg6) viewInflate.findViewById(R.id.av1);
    }

    public final void setAvatar$internal_share_release(UrlModel urlModel) {
        C427660Gpo.LJIIJJI(this.LLILLL, C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, AFwS259S0000000_21.get$arr$(423), 510);
    }

    public final void setIcon$internal_share_release(Drawable drawable) {
        this.LLILLL.setImageDrawable(drawable);
    }

    public final void setRepostIcon$internal_share_release(Function2<? super View, ? super Boolean, Unit> function2) {
        C786410Ut5.LLLLLJIL(this.LLILLL, 8);
        C421640Gg6 c421640Gg6 = this.LLILZ;
        int visibility = c421640Gg6.getVisibility();
        c421640Gg6.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c421640Gg6);
        function2.invoke(this.LLILLJJLI, Boolean.FALSE);
    }

    public final void setUsername$internal_share_release(String str) {
        this.LL.setText(str);
    }
}
