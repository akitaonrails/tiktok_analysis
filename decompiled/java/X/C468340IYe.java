package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0IYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468340IYe extends C468350IYf {
    public final ViewGroup LLJI;
    public final AtomicBoolean LLJIJIL;
    public final View LLJILJIL;

    @Override // X.C468350IYf
    public final void T5() {
        TextView textView = this.LLIZ;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 != null) {
            textView2.setText(2131841774);
        }
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            c16f5.setText(2131841773);
        }
    }

    @Override // X.C468350IYf, X.AbstractC468490IYt
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        I5(i, (FeedItem) obj);
    }

    @Override // X.C468350IYf
    /* JADX INFO: renamed from: P5 */
    public final void I5(int i, FeedItem feedItem) {
        int iIntValue;
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        Object tag = this.LLJI.getTag(R.id.ga0);
        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        AtomicBoolean atomicBoolean = this.LLJIJIL;
        if ((atomicBoolean != null && atomicBoolean.get()) || iIntValue <= i) {
            View view = this.LLJILJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLJILJIL;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.height = 0;
            }
            HandlerHook.viewPost(this.LLJI, new ARunnableS106S0100000_6(this, 274));
        }
        AtomicBoolean atomicBoolean2 = this.LLJIJIL;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(false);
        }
        super.I5(i, feedItem);
    }

    public C468340IYe(ViewGroup viewGroup, View view, C11RK<Boolean> c11rk, AtomicBoolean atomicBoolean, C469770IbX c469770IbX) {
        super(view, c11rk, c469770IbX);
        this.LLJI = viewGroup;
        this.LLJIJIL = atomicBoolean;
        this.LLJILJIL = view.findViewById(R.id.ga0);
    }
}
