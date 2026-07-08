package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0hC5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194670hC5 extends AbstractC1194680hC6 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int bindingAdapterPosition;
        View view2;
        List<AbstractC21686119tz> list;
        AbstractC21686119tz abstractC21686119tz;
        View view3;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        int iLJIIIIZZ = 0;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                Object parent2 = viewGroup;
                while (parent2 != null) {
                    if (parent2 instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                        viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) parent2;
                        break;
                    } else if (!(parent2 instanceof View) || (view3 = (View) parent2) == null) {
                        break;
                    } else {
                        parent2 = view3.getParent();
                    }
                }
                viewOnAttachStateChangeListenerC20604515jv = null;
                if (viewGroup != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                }
                if (viewOnAttachStateChangeListenerC20604515jv != null && viewGroup != null && (viewHolderFindContainingViewHolder = viewOnAttachStateChangeListenerC20604515jv.findContainingViewHolder(viewGroup)) != null && (bindingAdapterPosition = viewHolderFindContainingViewHolder.getBindingAdapterPosition()) != -1) {
                    C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                    if (state != null) {
                        C20600815jK.LJIILIIL(state, bindingAdapterPosition);
                    }
                    C1160490gIx layoutHandlerRegistry = viewOnAttachStateChangeListenerC20604515jv.getLayoutHandlerRegistry();
                    if (layoutHandlerRegistry != null && (list = layoutHandlerRegistry.LIZJ) != null && (abstractC21686119tz = (AbstractC21686119tz) C13LP.LJJJLL(list)) != null) {
                        C20600815jK<InterfaceC1891350zJl> state2 = viewOnAttachStateChangeListenerC20604515jv.getState();
                        if (state2 != null) {
                            iLJIIIIZZ = state2.LJIIIIZZ();
                        }
                        C1160490gIx layoutHandlerRegistry2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutHandlerRegistry();
                        if (layoutHandlerRegistry2 != null) {
                            layoutHandlerRegistry2.LIZIZ(abstractC21686119tz, iLJIIIIZZ);
                        }
                    }
                    viewOnAttachStateChangeListenerC20604515jv.requestLayout();
                    Object parent3 = viewOnAttachStateChangeListenerC20604515jv.getParent();
                    if ((parent3 instanceof View) && (view2 = (View) parent3) != null) {
                        view2.requestLayout();
                    }
                }
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1194700hC8.class, containerID), "execute successfully");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "view is null", null, 4);
    }
}
