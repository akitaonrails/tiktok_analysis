package X;

import X.InterfaceC1891350zJl;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C473001sm<T extends InterfaceC1891350zJl> {
    public final ViewOnAttachStateChangeListenerC20604515jv LIZ;
    public final Function0<List<InterfaceC1891350zJl>> LIZIZ;
    public final Function1<T, Boolean> LIZJ;
    public final Function1<T, Integer> LIZLLL;
    public final Function1<T, Unit> LJ;
    public final float LJFF = 0.5f;
    public final Set<Integer> LJI = new LinkedHashSet();

    public final void LIZ() {
        List<InterfaceC1891350zJl> listInvoke;
        RecyclerView.ViewHolder childViewHolder;
        int bindingAdapterPosition;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (listInvoke = this.LIZIZ.invoke()) == null) {
            return;
        }
        int childCount = viewOnAttachStateChangeListenerC20604515jv.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewOnAttachStateChangeListenerC20604515jv.getChildAt(i);
            if (childAt != null && (childViewHolder = viewOnAttachStateChangeListenerC20604515jv.getChildViewHolder(childAt)) != null && (bindingAdapterPosition = childViewHolder.getBindingAdapterPosition()) >= 0 && bindingAdapterPosition < listInvoke.size()) {
                Object obj = ListProtector.get(listInvoke, bindingAdapterPosition);
                if ((obj instanceof InterfaceC1891350zJl) && obj != null && this.LIZJ.invoke((T) obj).booleanValue()) {
                    if (childAt.getGlobalVisibleRect(new Rect())) {
                        if (r2.width() * r2.height() >= childAt.getWidth() * childAt.getHeight() * this.LJFF) {
                            int iIntValue = this.LIZLLL.invoke((T) obj).intValue();
                            if (!this.LJI.contains(Integer.valueOf(iIntValue))) {
                                this.LJI.add(Integer.valueOf(iIntValue));
                                this.LJ.invoke((T) obj);
                            }
                        }
                    }
                }
            }
        }
    }

    public C473001sm(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ = function0;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function13;
    }
}
