package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;

/* JADX INFO: renamed from: X.14NR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14NR extends AbstractC20254814Ne<C14NS> {
    @Override // X.C14NT
    public final C14O8 LJJII() {
        return C20256914Nz.LIZ(this, false);
    }

    public C14NR(NimbleTemplateContext nimbleTemplateContext) {
        super(nimbleTemplateContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20254814Ne, X.C14NT, X.C14NX
    public final void LJII(TemplateData templateData) {
        super.LJII(templateData);
        ((C14O7) getView()).LL = this.LIZIZ;
    }

    @Override // X.C14NT
    public final View LJJIII(final Context context) {
        return new C14O7(context) { // from class: X.14NS
        };
    }
}
