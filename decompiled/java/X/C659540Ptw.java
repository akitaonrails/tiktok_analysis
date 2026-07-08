package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;

/* JADX INFO: renamed from: X.0Ptw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659540Ptw implements C0Q5K {
    public final /* synthetic */ SearchVideoHolder LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ C659640Pu6 LIZJ;
    public final /* synthetic */ C259800zU<Product> LIZLLL;

    @Override // X.C0Q5K
    public final void onFailed() {
        this.LIZ.O7(this.LIZIZ, this.LIZJ, this.LIZLLL.element, null);
    }

    @Override // X.C0Q5K
    public final void LIZ(C0Q5N c0q5n) {
        this.LIZ.O7(this.LIZIZ, this.LIZJ, this.LIZLLL.element, c0q5n);
    }

    public C659540Ptw(SearchVideoHolder searchVideoHolder, View view, C659640Pu6 c659640Pu6, C259800zU<Product> c259800zU) {
        this.LIZ = searchVideoHolder;
        this.LIZIZ = view;
        this.LIZJ = c659640Pu6;
        this.LIZLLL = c259800zU;
    }
}
