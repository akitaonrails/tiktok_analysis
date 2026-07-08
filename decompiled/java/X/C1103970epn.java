package X;

import Y.AObserverS221S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0epn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103970epn extends AbstractC1103960epm {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final InterfaceC1103990epp LL;
    public final C1103890epf LLILLJJLI;
    public AnonymousClass0151 LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final AObserverS221S0100000_17 LLILZLL;
    public final AObserverS221S0100000_17 LLIZ;

    @Override // X.AbstractC1103960epm
    public final void LJJJJLI() {
        AnonymousClass0151 anonymousClass0151 = this.LLILLL;
        if (anonymousClass0151 != null) {
            anonymousClass0151.LJJJJLI();
        }
    }

    @Override // X.AbstractC1103960epm
    public final void onAttach() {
        this.LLILLJJLI.LIZJ.observeForever(this.LLILZLL);
        this.LLILLJJLI.LIZIZ.observeForever(this.LLIZ);
        AnonymousClass0151 anonymousClass0151 = this.LLILLL;
        if (anonymousClass0151 != null) {
            anonymousClass0151.onAttach();
        }
    }

    @Override // X.AbstractC1103960epm
    public final void onDetach() {
        this.LLILLJJLI.LIZJ.removeObserver(this.LLILZLL);
        this.LLILLJJLI.LIZIZ.removeObserver(this.LLIZ);
        if (this.LLILZIL) {
            AnonymousClass0151 anonymousClass0151 = this.LLILLL;
            if (anonymousClass0151 != null) {
                anonymousClass0151.onHide();
            }
            this.LLILZIL = false;
        }
        AnonymousClass0151 anonymousClass01512 = this.LLILLL;
        if (anonymousClass01512 != null) {
            anonymousClass01512.onDetach();
        }
    }

    public C1103970epn(ViewGroup viewGroup, InterfaceC1103990epp interfaceC1103990epp) {
        super(viewGroup);
        this.LL = interfaceC1103990epp;
        this.LLILLJJLI = ((C1103880epe) interfaceC1103990epp).getViewState();
        this.LLILZ = -1;
        this.LLILZLL = new AObserverS221S0100000_17(this, 0);
        this.LLIZ = new AObserverS221S0100000_17(this, 1);
    }

    @Override // X.AbstractC1103960epm
    public final void I5(C2757014x c2757014x, int i) {
        boolean zBooleanValue;
        ViewGroup viewGroup;
        this.LLILZ = i;
        ViewGroup viewGroup2 = (ViewGroup) this.itemView;
        AnonymousClass0151 anonymousClass0151 = c2757014x.LIZIZ;
        if (anonymousClass0151 != null) {
            this.LLILLL = anonymousClass0151;
            C786410Ut5.LJJJJI(viewGroup2);
            View viewLIZ = anonymousClass0151.LIZ(viewGroup2.getContext());
            ViewParent parent = viewLIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewLIZ, viewGroup);
            }
            viewGroup2.addView(viewLIZ);
            Boolean value = this.LLILLJJLI.LIZIZ.getValue();
            if (value != null) {
                zBooleanValue = value.booleanValue();
            } else {
                zBooleanValue = false;
            }
            anonymousClass0151.LIZIZ(zBooleanValue);
            Integer value2 = this.LLILLJJLI.LIZJ.getValue();
            if (value2 != null && value2.intValue() == i) {
                this.LLILZIL = true;
                anonymousClass0151.onShow();
            }
            viewLIZ.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151590g4b(this, i, anonymousClass0151, 0));
        }
    }
}
