package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0dZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055720dZy extends RecyclerView implements InterfaceC1055730dZz {
    public C1055710dZx LL;

    @Override // X.InterfaceC1055730dZz
    public final boolean x0() {
        return this.LL.LIZ;
    }

    public final C1055710dZx getEnterTabManager() {
        return this.LL;
    }

    public final void setEnterTabManager(C1055710dZx c1055710dZx) {
        this.LL = c1055710dZx;
    }

    public C1055720dZy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1055720dZy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C1055710dZx();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
