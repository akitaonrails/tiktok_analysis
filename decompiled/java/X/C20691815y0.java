package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15y0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20691815y0 extends RecyclerView implements InterfaceC21549819Vg {
    @Override // X.InterfaceC21549819Vg
    public final void LIZIZ(C19V6 c19v6) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public C20691815y0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20691815y0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
