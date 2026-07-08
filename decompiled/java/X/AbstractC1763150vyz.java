package X;

import Y.ARunnableS95S0200000_26;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0vyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1763150vyz<T extends RecyclerView.ViewHolder> extends AbstractC21673619ry<T> {
    public boolean LL;
    public Rect LLILLJJLI;
    public InterfaceC21650419oE LLILLL;
    public RecyclerView.ViewHolder LLILZ;
    public boolean LLILZIL = true;
    public final float LLILZLL = 0.7f;

    public abstract void onDestroy();

    public final void LLLFZ() {
        C21649519o5 c21649519o5;
        RecyclerView.ViewHolder viewHolder = this.LLILZ;
        View view = viewHolder != null ? viewHolder.itemView : null;
        if (!(view instanceof C21649519o5) || (c21649519o5 = (C21649519o5) view) == null) {
            return;
        }
        c21649519o5.setDragTransitionEnabled(this.LLILZIL);
        c21649519o5.setMaxDragTransitionFactor(this.LLILZLL);
    }

    @Override // X.AbstractC21673619ry
    public void onViewAttachedToWindow(T t) {
        super.onViewAttachedToWindow(t);
        this.LLILZ = t;
        LLLFZ();
        if (this.LL) {
            this.LL = false;
            Rect rect = this.LLILLJJLI;
            if (rect != null) {
                C21649519o5 c21649519o5 = (C21649519o5) t.itemView;
                if (!c21649519o5.LLJI.isRunning()) {
                    HandlerHook.viewPost(c21649519o5, new ARunnableS95S0200000_26(c21649519o5, rect, 51));
                }
            }
        }
        InterfaceC21650419oE interfaceC21650419oE = this.LLILLL;
        if (interfaceC21650419oE != null) {
            ((C21649519o5) t.itemView).LIZIZ(interfaceC21650419oE);
        }
    }

    @Override // X.AbstractC21673619ry
    public void onViewDetachedFromWindow(T t) {
        super.onViewDetachedFromWindow(t);
        InterfaceC21650419oE interfaceC21650419oE = this.LLILLL;
        if (interfaceC21650419oE != null) {
            ((C21649519o5) t.itemView).LJ(interfaceC21650419oE);
        }
    }
}
