package X;

import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0DOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338440DOo {
    public C1749280vcc LIZ;

    public final void LIZIZ() {
        C1749280vcc c1749280vcc = this.LIZ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    public final void LIZJ() {
        C1749280vcc c1749280vcc = this.LIZ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
    }

    public final void LIZLLL() {
        C1749280vcc c1749280vcc = this.LIZ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
    }

    public C338440DOo() {
        new C0DV5<C338450DOp>() { // from class: X.0DOp
            public int LL;
            public String LLILLJJLI;

            @Override // X.C0DV5
            public C338450DOp build() {
                return this;
            }

            @Override // X.C0DV5
            public /* bridge */ /* synthetic */ C0DV5 build() {
                build();
                return this;
            }

            public final int getEmptyIcon() {
                return this.LL;
            }

            public final String getLoadingText() {
                return this.LLILLJJLI;
            }

            public final void setEmptyIcon(int i) {
                this.LL = i;
            }

            public final void setLoadingText(String str) {
                this.LLILLJJLI = str;
            }
        };
    }

    public final void LIZ(ViewGroup viewGroup) {
        C1749280vcc c1749280vcc = (C1749280vcc) viewGroup.findViewWithTag("unposted_status_view");
        if (c1749280vcc == null) {
            c1749280vcc = new C1749280vcc(viewGroup.getContext(), null, 6);
            c1749280vcc.setTag("unposted_status_view");
            C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(c1749280vcc);
        }
        this.LIZ = c1749280vcc;
    }
}
