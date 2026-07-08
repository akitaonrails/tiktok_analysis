package X;

import Y.ARunnableS129S0100000_29;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment;

/* JADX INFO: renamed from: X.11Uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class ViewOnFocusChangeListenerC19509211Uk implements View.OnFocusChangeListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ View.OnFocusChangeListener LLILLJJLI;
    public final /* synthetic */ AbsTimeLockFragment LLILLL;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        HandlerHook.viewPost(view, new ARunnableS129S0100000_29(this, 139));
        View.OnFocusChangeListener onFocusChangeListener = this.LLILLJJLI;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    public ViewOnFocusChangeListenerC19509211Uk(AbsTimeLockFragment absTimeLockFragment, C0I7D c0i7d, View.OnFocusChangeListener onFocusChangeListener) {
        this.LLILLL = absTimeLockFragment;
        this.LL = c0i7d;
        this.LLILLJJLI = onFocusChangeListener;
    }
}
