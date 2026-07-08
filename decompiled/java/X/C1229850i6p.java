package X;

import Y.ARunnableS119S0100000_19;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.publicgroup.view.GroupAssemCell;
import com.ss.android.ugc.aweme.publicgroup.view.GroupCell;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0i6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229850i6p extends AbstractC21688119uJ {
    public final GroupListViewModel LIZJ;
    public final C21578619ce LIZLLL;

    @Override // X.AbstractC21688119uJ
    public final boolean LJII() {
        return false;
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILL() {
    }

    public C1229850i6p(GroupListViewModel groupListViewModel, C21578619ce c21578619ce) {
        this.LIZJ = groupListViewModel;
        this.LIZLLL = c21578619ce;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21688119uJ
    public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.LIZJ(recyclerView, viewHolder);
        if (viewHolder instanceof GroupCell) {
            ((GroupAssemCell) ((AssemPowerCell) viewHolder).NG1()).LLLFF = false;
            if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                List<InterfaceC1891350zJl> listItems = ((ViewOnAttachStateChangeListenerC20604515jv) recyclerView).getListItems();
                GroupListViewModel groupListViewModel = this.LIZJ;
                List<C1229760i6g> list = ((C1229630i6T) groupListViewModel.getState()).LLILLJJLI.LIZ;
                boolean z = ((C1229630i6T) groupListViewModel.getState()).LLILZIL;
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : listItems) {
                    if (interfaceC1891350zJl instanceof C1229760i6g) {
                        arrayList.add(interfaceC1891350zJl);
                    }
                }
                groupListViewModel.GQ2(arrayList, list, z, null);
            }
        }
    }

    @Override // X.AbstractC21688119uJ
    public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof GroupCell) || !((GroupAssemCell) ((AssemPowerCell) viewHolder).NG1()).LLLFF) {
            return 0;
        }
        return AbstractC21688119uJ.LJIIIZ(3, 0);
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition2 >= 0) {
            if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView;
                Collections.swap(viewOnAttachStateChangeListenerC20604515jv.getListItems(), bindingAdapterPosition, bindingAdapterPosition2);
                AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, z);
        if (i == 2 && z) {
            View view = viewHolder.itemView;
            Rect rect = new Rect();
            recyclerView.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect2);
            if (!rect.isEmpty() && !rect2.isEmpty()) {
                int iHeight = (int) (((double) rect.height()) * 0.1d);
                if (rect2.top < rect.top + iHeight) {
                    HandlerHook.viewPost(this.LIZLLL, new ARunnableS119S0100000_19(this, 227));
                } else {
                    if (rect2.bottom <= rect.bottom - iHeight) {
                        return;
                    }
                    HandlerHook.viewPost(this.LIZLLL, new ARunnableS119S0100000_19(this, 228));
                }
            }
        }
    }
}
