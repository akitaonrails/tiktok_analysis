package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Layout;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import kotlin.Pair;

/* JADX INFO: renamed from: X.14NW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14NW extends C14NT<View> {
    public final View LJIIL;
    public final TemplateData LJIILIIL;

    @Override // X.C14NT, X.C14NX
    public final TemplateData getElement() {
        return this.LJIILIIL;
    }

    @Override // X.C14NT
    public final View LJJIII(Context context) {
        return this.LJIIL;
    }

    public C14NW(NimbleTemplateContext nimbleTemplateContext, View view) {
        super(nimbleTemplateContext);
        this.LJIIL = view;
        this.LJIILIIL = new TemplateData("view", String.valueOf(view.getId()), new Layout(null, null, null, null, null, null, null, null, null, "auto", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, null, null, null, null, null, null);
    }

    @Override // X.C14NT, X.C14NX
    public final Pair LJIILLIIL(float f, float f2, int i, int i2) {
        return super.LJIILLIIL(f, 1.0f, i, 1073741824);
    }
}
