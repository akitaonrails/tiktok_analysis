package X;

import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Yvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889990Yvl extends FrameLayout {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public Function0<Unit> LL;

    public final Function0<Unit> getOnDismiss$im_chatlist_impl_release() {
        return this.LL;
    }

    public C889990Yvl(Context context) {
        super(context, null, 0);
        C786410Ut5.LJLLJ(context, R.layout.dmd, this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.jc8);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS149S0100000_14(this, 3));
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.jc9);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS149S0100000_14(this, 4));
        }
        setBackground(null);
        C890000Yvm.LIZ().storeInt("guide_banner_shown_time", C890000Yvm.LIZ().getInt("guide_banner_shown_time", 0) + 1);
        C890000Yvm.LIZ().storeLong("guide_banner_last_show_timestamp", System.currentTimeMillis());
    }

    public final void setOnDismiss$im_chatlist_impl_release(Function0<Unit> function0) {
        this.LL = function0;
    }
}
