package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ViewGroupOnHierarchyChangeListenerC21541619Sc implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener LL;
    public final /* synthetic */ C21541519Sb LLILLJJLI;

    public ViewGroupOnHierarchyChangeListenerC21541619Sc(C21541519Sb c21541519Sb) {
        this.LLILLJJLI = c21541519Sb;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        C21541519Sb c21541519Sb;
        int id;
        int i;
        if (view == this.LLILLJJLI && (view2 instanceof C19SE)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            C19SE c19se = (C19SE) view2;
            if (c19se.isChecked() && (id = c19se.getId()) != (i = (c21541519Sb = (C21541519Sb) view).LLJIJIL)) {
                if (i != -1 && c21541519Sb.LLIZ) {
                    c21541519Sb.LIZIZ(i, false);
                }
                if (id != -1) {
                    c21541519Sb.LIZIZ(id, true);
                }
                c21541519Sb.setCheckedId(id);
            }
            c19se.setOnCheckedChangeListenerInternal(this.LLILLJJLI.LLJ);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.LL;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.LLILLJJLI && (view2 instanceof C19SE)) {
            ((C19SE) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.LL;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
