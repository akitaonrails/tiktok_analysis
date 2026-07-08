package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0wpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1795810wpf {
    public Integer LIZ;
    public C1792740wki LIZIZ;
    public String LIZJ;

    public final C1795900wpo LIZ() {
        C19863812nk.LIZJ(this.LIZIZ, "ProductDetails is required for constructing ProductDetailsParams.");
        return new C1795900wpo(this);
    }

    public final void LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZJ = str;
            return;
        }
        throw new IllegalArgumentException("offerToken can not be empty");
    }

    public final void LIZJ(C1792740wki c1792740wki) {
        this.LIZIZ = c1792740wki;
        if (c1792740wki.LIZ() != null) {
            c1792740wki.LIZ().getClass();
            String str = c1792740wki.LIZ().LIZLLL;
            if (str != null) {
                this.LIZJ = str;
            }
        }
    }
}
