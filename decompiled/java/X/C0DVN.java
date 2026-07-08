package X;

import X.AbstractC339560DSw;
import X.InterfaceC339570DSx;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0DVN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0DVN<ITEM extends InterfaceC339570DSx, VH extends AbstractC339560DSw<ITEM>> {
    public abstract VH LIZ(View view);

    public abstract int LIZIZ();

    public VH LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (VH) LIZ(C786410Ut5.Td(layoutInflater, LIZIZ(), viewGroup, false));
    }
}
