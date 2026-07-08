package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;

/* JADX INFO: renamed from: X.19Wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21551919Wb implements C19V7, AdapterView.OnItemClickListener {
    public Context LL;
    public LayoutInflater LLILLJJLI;
    public C19V6 LLILLL;
    public C19WI LLILZ;
    public InterfaceC21549519Vd LLILZIL;
    public C21550019Vi LLILZLL;

    @Override // X.C19V7
    public final boolean LIZJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C19V7
    public final int getId() {
        return 0;
    }

    @Override // X.C19V7
    public final Parcelable LIZIZ() {
        if (this.LLILZ == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        C19WI c19wi = this.LLILZ;
        if (c19wi != null) {
            c19wi.saveHierarchyState(sparseArray);
        }
        C786410Ut5.LJJJ(bundle, "android:menu:list", sparseArray);
        return bundle;
    }

    public C21551919Wb(Context context) {
        this.LL = context;
        this.LLILLJJLI = C786410Ut5.ne(context);
    }

    @Override // X.C19V7
    public final boolean LIZLLL(SubMenuC21548419Us subMenuC21548419Us) {
        if (!subMenuC21548419Us.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC21552019Wc dialogInterfaceOnKeyListenerC21552019Wc = new DialogInterfaceOnKeyListenerC21552019Wc(subMenuC21548419Us);
        C21560119Zf c21560119Zf = new C21560119Zf(subMenuC21548419Us.LIZ);
        C21551919Wb c21551919Wb = new C21551919Wb(c21560119Zf.LIZ.LIZ);
        dialogInterfaceOnKeyListenerC21552019Wc.LLILLL = c21551919Wb;
        c21551919Wb.LLILZIL = dialogInterfaceOnKeyListenerC21552019Wc;
        C19V6 c19v6 = dialogInterfaceOnKeyListenerC21552019Wc.LL;
        c19v6.LIZIZ(dialogInterfaceOnKeyListenerC21552019Wc.LLILLL, c19v6.LIZ);
        C21551919Wb c21551919Wb2 = dialogInterfaceOnKeyListenerC21552019Wc.LLILLL;
        if (c21551919Wb2.LLILZLL == null) {
            c21551919Wb2.LLILZLL = new C21550019Vi(c21551919Wb2);
        }
        C21550019Vi c21550019Vi = c21551919Wb2.LLILZLL;
        C21560219Zg c21560219Zg = c21560119Zf.LIZ;
        c21560219Zg.LJIIZILJ = c21550019Vi;
        c21560219Zg.LJIJ = dialogInterfaceOnKeyListenerC21552019Wc;
        View view = subMenuC21548419Us.LJIILJJIL;
        if (view != null) {
            c21560219Zg.LJ = view;
        } else {
            c21560219Zg.LIZJ = subMenuC21548419Us.LJIILIIL;
            c21560219Zg.LIZLLL = subMenuC21548419Us.LJIIL;
        }
        c21560219Zg.LJIILL = dialogInterfaceOnKeyListenerC21552019Wc;
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
        dialogInterfaceOnKeyListenerC21552019Wc.LLILLJJLI = dialogInterfaceC21560019ZeLIZ;
        dialogInterfaceC21560019ZeLIZ.setOnDismissListener(dialogInterfaceOnKeyListenerC21552019Wc);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC21552019Wc.LLILLJJLI.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        C786410Ut5.D4(dialogInterfaceOnKeyListenerC21552019Wc.LLILLJJLI);
        InterfaceC21549519Vd interfaceC21549519Vd = this.LLILZIL;
        if (interfaceC21549519Vd != null) {
            interfaceC21549519Vd.LIZIZ(subMenuC21548419Us);
            return true;
        }
        return true;
    }

    @Override // X.C19V7
    public final void LJI(InterfaceC21549519Vd interfaceC21549519Vd) {
        this.LLILZIL = interfaceC21549519Vd;
    }

    @Override // X.C19V7
    public final void LJII(boolean z) {
        C21550019Vi c21550019Vi = this.LLILZLL;
        if (c21550019Vi != null) {
            c21550019Vi.notifyDataSetChanged();
        }
    }

    @Override // X.C19V7
    public final void LJIIIZ(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.LLILZ.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // X.C19V7
    public final void LIZ(C19V6 c19v6, boolean z) {
        InterfaceC21549519Vd interfaceC21549519Vd = this.LLILZIL;
        if (interfaceC21549519Vd != null) {
            interfaceC21549519Vd.LIZ(c19v6, z);
        }
    }

    @Override // X.C19V7
    public final void LJIIIIZZ(Context context, C19V6 c19v6) {
        if (this.LL != null) {
            this.LL = context;
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = C786410Ut5.ne(context);
            }
        }
        this.LLILLL = c19v6;
        C21550019Vi c21550019Vi = this.LLILZLL;
        if (c21550019Vi != null) {
            c21550019Vi.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.LLILLL.LJIILLIIL(this.LLILZLL.getItem(i), this, 0);
    }
}
