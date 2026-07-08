package X;

import android.R;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import u4.q0;

/* JADX INFO: renamed from: X.15oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20632815oU extends AbstractC20633315oZ {
    public final C20632915oV LIZ = new InterfaceC20092813ja() { // from class: X.15oV
        @Override // X.InterfaceC20092813ja
        public final boolean LIZ(View view) {
            C20632815oU c20632815oU = this.LIZ;
            int currentItem = ((C20632315oP) view).getCurrentItem() + 1;
            C20632315oP c20632315oP = c20632815oU.LIZLLL;
            if (c20632315oP.LLJJIJI) {
                c20632315oP.LJFF(currentItem, true);
            }
            return true;
        }
    };
    public final C20633015oW LIZIZ = new InterfaceC20092813ja() { // from class: X.15oW
        @Override // X.InterfaceC20092813ja
        public final boolean LIZ(View view) {
            C20632815oU c20632815oU = this.LIZ;
            int currentItem = ((C20632315oP) view).getCurrentItem() - 1;
            C20632315oP c20632315oP = c20632815oU.LIZLLL;
            if (c20632315oP.LLJJIJI) {
                c20632315oP.LJFF(currentItem, true);
            }
            return true;
        }
    };
    public C20632715oT LIZJ;
    public final /* synthetic */ C20632315oP LIZLLL;

    public final void LIZIZ() {
        int itemCount;
        int i;
        C20632315oP c20632315oP = this.LIZLLL;
        int i2 = R.id.accessibilityActionPageLeft;
        q0.LJIILJJIL(R.id.accessibilityActionPageLeft, c20632315oP);
        q0.LJIIJJI(0, c20632315oP);
        q0.LJIILJJIL(R.id.accessibilityActionPageRight, c20632315oP);
        q0.LJIIJJI(0, c20632315oP);
        q0.LJIILJJIL(R.id.accessibilityActionPageUp, c20632315oP);
        q0.LJIIJJI(0, c20632315oP);
        q0.LJIILJJIL(R.id.accessibilityActionPageDown, c20632315oP);
        q0.LJIIJJI(0, c20632315oP);
        if (this.LIZLLL.getAdapter() == null || (itemCount = this.LIZLLL.getAdapter().getItemCount()) == 0) {
            return;
        }
        C20632315oP c20632315oP2 = this.LIZLLL;
        if (c20632315oP2.LLJJIJI) {
            if (c20632315oP2.getOrientation() != 0) {
                if (this.LIZLLL.LLILZ < itemCount - 1) {
                    q0.LJIILL(c20632315oP, new C20092413jW(R.id.accessibilityActionPageDown, (CharSequence) null), null, this.LIZ);
                }
                if (this.LIZLLL.LLILZ > 0) {
                    q0.LJIILL(c20632315oP, new C20092413jW(R.id.accessibilityActionPageUp, (CharSequence) null), null, this.LIZIZ);
                    return;
                }
                return;
            }
            if (getLayoutDirection() == 1) {
                i = R.id.accessibilityActionPageLeft;
                i2 = R.id.accessibilityActionPageRight;
            } else {
                i = R.id.accessibilityActionPageRight;
            }
            if (this.LIZLLL.LLILZ < itemCount - 1) {
                q0.LJIILL(c20632315oP, new C20092413jW(i, (CharSequence) null), null, this.LIZ);
            }
            if (this.LIZLLL.LLILZ > 0) {
                q0.LJIILL(c20632315oP, new C20092413jW(i2, (CharSequence) null), null, this.LIZIZ);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15oV] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.15oW] */
    public C20632815oU(C20632315oP c20632315oP) {
        this.LIZLLL = c20632315oP;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.15oT] */
    public final void LIZ(RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.LIZJ = new AbstractC20632615oS() { // from class: X.15oT
            @Override // X.AbstractC20632615oS, X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.LIZIZ();
            }

            {
                super(0);
            }
        };
        if (this.LIZLLL.getImportantForAccessibility() == 0) {
            this.LIZLLL.setImportantForAccessibility(1);
        }
    }
}
