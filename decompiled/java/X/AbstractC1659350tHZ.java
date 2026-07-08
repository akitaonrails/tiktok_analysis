package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0tHZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1659350tHZ implements LifecycleOwner, InterfaceC1657880tFC {
    public final List<View> LL;
    public final LifecycleRegistry LLILLJJLI;
    public final LifecycleRegistry LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public ViewOnAttachStateChangeListenerC1659360tHa LLILZLL;

    public boolean LJII() {
        return true;
    }

    public abstract int LJIIIIZZ();

    public abstract List<View> LJIIIZ();

    public abstract void LJIIJJI(View view);

    public void LJ() {
        ViewGroup viewGroup;
        View view = this.LLILZ;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.LLILZLL);
            if (!LJII() || LJIIIZ() == null) {
                C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewRecycle: not reused for ");
                sbLIZ.append(this);
                C201955140j.LIZJ(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                List<View> listLJIIIZ = LJIIIZ();
                if (listLJIIIZ != null) {
                    listLJIIIZ.add(view);
                }
            }
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        this.LLILZ = null;
        this.LLILLJJLI.setCurrentState(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC1657880tFC
    public final View getItemView() {
        return this.LLILZ;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    public AbstractC1659350tHZ(LifecycleOwner lifecycleOwner, List<View> list) {
        this.LL = list;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(lifecycleOwner);
        this.LLILLJJLI = lifecycleRegistry;
        this.LLILLL = lifecycleRegistry;
    }

    public View LIZIZ(int i, ViewGroup viewGroup) {
        boolean z;
        ViewGroup viewGroup2;
        View view = this.LLILZ;
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateView,position:");
        sbLIZ.append(i);
        sbLIZ.append(",is view created before:");
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZJ(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ));
        List<View> listLJIIIZ = LJIIIZ();
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
            }
            return view;
        }
        if (listLJIIIZ != null && !listLJIIIZ.isEmpty()) {
            View view2 = (View) C19719612Di.LJJIJ(listLJIIIZ);
            C0FJM c0fjm = (C0FJM) view2.findViewById(R.id.tzs);
            if (c0fjm != null) {
                C786410Ut5.w0(c0fjm, 8);
            }
            LJIIJ(view2, this, i);
            return view2;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), LJIIIIZZ(), viewGroup, false);
        LJIIJ(viewTd, this, i);
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tHa, android.view.View$OnAttachStateChangeListener] */
    public static final void LJIIJ(View view, final AbstractC1659350tHZ abstractC1659350tHZ, final int i) {
        abstractC1659350tHZ.LLILZ = view;
        ?? r0 = new View.OnAttachStateChangeListener() { // from class: X.0tHa
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewAttachedToWindow,");
                sbLIZ.append(i);
                C201955140j.LIZLLL(c1459900o5s, "ToolbarItemHolder", C2188811AlT.LIZIZ(sbLIZ));
                AbstractC1659350tHZ abstractC1659350tHZ2 = abstractC1659350tHZ;
                abstractC1659350tHZ2.LLILZIL = true;
                abstractC1659350tHZ2.LLILLJJLI.setCurrentState(Lifecycle.State.RESUMED);
                abstractC1659350tHZ.LLILZIL = false;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewDetachedFromWindow,");
                sbLIZ.append(i);
                C201955140j.LIZLLL(c1459900o5s, "ToolbarItemHolder", C2188811AlT.LIZIZ(sbLIZ));
                abstractC1659350tHZ.LLILLJJLI.setCurrentState(Lifecycle.State.CREATED);
            }
        };
        abstractC1659350tHZ.LLILZLL = r0;
        view.addOnAttachStateChangeListener(r0);
        if (view.isAttachedToWindow()) {
            C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("view already attached,fast dispatch life state,");
            sbLIZ.append(i);
            C201955140j.LIZLLL(c1459900o5s, "ToolbarItemHolder", C2188811AlT.LIZIZ(sbLIZ));
            abstractC1659350tHZ.LLILLJJLI.setCurrentState(Lifecycle.State.RESUMED);
        }
        abstractC1659350tHZ.LJIIJJI(view);
    }
}
