package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;

/* JADX INFO: renamed from: X.0wFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773630wFt extends RecyclerView {
    public InterfaceC1773310wFN LL;
    public final C1773380wFU<AbstractC1773210wFD> LLILLJJLI;
    public ECHybridAdapter LLILLL;

    public C1773630wFt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1773630wFt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = new C1773380wFU<>(0);
        setItemAnimator(null);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
