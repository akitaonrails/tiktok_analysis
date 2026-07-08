package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0PIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642600PIk {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC641090PCp LIZ(View view) {
        ViewParent parent;
        ViewGroup viewGroup;
        if (view instanceof InterfaceC642610PIl) {
            return ((InterfaceC642610PIl) view).getContainerProvider();
        }
        if (view != 0) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == 0) {
            return null;
        }
        if (viewGroup instanceof InterfaceC642610PIl) {
            return ((InterfaceC642610PIl) viewGroup).getContainerProvider();
        }
        return LIZ(viewGroup);
    }
}
