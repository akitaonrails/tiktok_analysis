package X;

import Y.ARunnableS117S0100000_17;
import android.view.View;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0f7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnFocusChangeListenerC1115160f7q implements View.OnFocusChangeListener {
    public final /* synthetic */ SubEmojiInputDialogFragment LL;

    public ViewOnFocusChangeListenerC1115160f7q(SubEmojiInputDialogFragment subEmojiInputDialogFragment) {
        this.LL = subEmojiInputDialogFragment;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        HandlerHook.viewPostDelay(view, new ARunnableS117S0100000_17(this, 119), 100L);
        this.LL.LLJJLIIIJLLLLLLLZ.setOnFocusChangeListener(null);
        this.LL.LLLILZLLLI = true;
    }
}
