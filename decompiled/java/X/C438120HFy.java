package X;

import Y.ARunnableS106S0100000_6;
import Y.AsS33S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0HFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438120HFy extends RecyclerView {
    public final C20635915oz LL;

    public final View getSnappedView() {
        return this.LL.LJFF(getLayoutManager());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC21673619ry<?> abstractC21673619ry) {
        super.setAdapter(abstractC21673619ry);
        if (abstractC21673619ry != null) {
            HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) this, 179));
        }
    }

    public C438120HFy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new C20635915oz();
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        addOnScrollListener(new AsS33S0100000_6(this, 1));
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160))), 0, 16);
    }
}
