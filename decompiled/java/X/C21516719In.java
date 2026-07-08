package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

/* JADX INFO: renamed from: X.19In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21516719In extends AbstractC21516619Im implements Observer<C0RD4> {
    public RemoteImageView LLILZLL;
    public FrameLayout LLIZ;
    public TextView LLIZLLLIL;
    public boolean LLJ;

    public C21516719In(View view) {
        super(view);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        C0RD4 c0rd42 = c0rd4;
        if (c0rd42 != null && TextUtils.equals(c0rd42.LIZ, "live_has_end")) {
            Object obj = c0rd42.LIZIZ;
            if (obj == null) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.LLJ = true;
            }
        }
    }
}
