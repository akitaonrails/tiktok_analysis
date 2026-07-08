package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC20062313ef extends AbstractC20055413dY implements InterfaceC20057413ds, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View LLJJ;
    public ViewTreeObserver LLJJI;
    public final AwS609S0100000_30 LLJJIII = new AwS609S0100000_30(this, 266);
    public final AwS609S0100000_30 LLJJIJI = new AwS609S0100000_30(this, 267);

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        ViewTreeObserver viewTreeObserver = this.LLJJI;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.LLJJI = null;
        C20051613cw.LIZ(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.LLJJ = null;
    }

    public final FocusTargetNode LLJJ() {
        if (!this.LL.LLJILLL) {
            C1696250uF5.LIZIZ("visitLocalDescendants called on an unattached node");
        }
        AbstractC20055413dY abstractC20055413dY = this.LL;
        if ((abstractC20055413dY.LLILZ & 1024) != 0) {
            boolean z = false;
            for (AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LLILZLL; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
                if ((abstractC20055413dY2.LLILLL & 1024) != 0) {
                    AbstractC20055413dY abstractC20055413dYLIZIZ = abstractC20055413dY2;
                    C19968013Aw c19968013Aw = null;
                    do {
                        if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) abstractC20055413dYLIZIZ;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                            int i = 0;
                            for (AbstractC20055413dY abstractC20055413dY3 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY3 != null; abstractC20055413dY3 = abstractC20055413dY3.LLILZLL) {
                                if ((abstractC20055413dY3.LLILLL & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC20055413dYLIZIZ = abstractC20055413dY3;
                                    } else {
                                        if (c19968013Aw == null) {
                                            c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                                        }
                                        if (abstractC20055413dYLIZIZ != null) {
                                            c19968013Aw.LIZLLL(abstractC20055413dYLIZIZ);
                                            abstractC20055413dYLIZIZ = null;
                                        }
                                        c19968013Aw.LIZLLL(abstractC20055413dY3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw);
                    } while (abstractC20055413dYLIZIZ != null);
                }
            }
        }
        "Could not find focus target of embedded view wrapper".toString();
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        ViewTreeObserver viewTreeObserver = C20051613cw.LIZ(this).getViewTreeObserver();
        this.LLJJI = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // X.InterfaceC20057413ds
    public final void LJZL(InterfaceC20062213ee interfaceC20062213ee) {
        interfaceC20062213ee.LIZJ(false);
        interfaceC20062213ee.LIZLLL(this.LLJJIII);
        interfaceC20062213ee.LIZIZ(this.LLJJIJI);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (C20052513d5.LJFF(this).LLJILLL == null) {
            return;
        }
        View viewLIZJ = C20064413f0.LIZJ(this);
        InterfaceC20060313eL focusOwner = C20052513d5.LJI(this).getFocusOwner();
        InterfaceC20055013dU interfaceC20055013dULJI = C20052513d5.LJI(this);
        boolean z2 = true;
        if (view != null && !Intrinsics.LJFF(view, interfaceC20055013dULJI) && C20064413f0.LIZ(viewLIZJ, view)) {
            z = true;
        } else {
            z = false;
        }
        if (view2 == null || Intrinsics.LJFF(view2, interfaceC20055013dULJI) || !C20064413f0.LIZ(viewLIZJ, view2)) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                this.LLJJ = view2;
                return;
            }
        } else if (z2) {
            this.LLJJ = view2;
            FocusTargetNode focusTargetNodeLLJJ = LLJJ();
            if (focusTargetNodeLLJJ.LJJJ().getHasFocus()) {
                return;
            }
            C20060113eJ.LJI(focusTargetNodeLLJJ);
            return;
        }
        if (z) {
            this.LLJJ = null;
            if (!LLJJ().LJJJ().isFocused()) {
                return;
            }
            focusOwner.LJI(8, false, false);
            return;
        }
        this.LLJJ = null;
    }
}
