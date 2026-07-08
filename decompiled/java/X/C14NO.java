package X;

import Y.ARunnableS25S1100000_20;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14NO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14NO extends C14NT<C417490GYp> {
    public volatile C1DX7 LJIIL;
    public String LJIILIIL;

    public C14NO(NimbleTemplateContext nimbleTemplateContext) {
        super(nimbleTemplateContext);
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        this.LJIIL = new C1DX7(fLIZIZ, fLIZIZ);
    }

    @Override // X.C14NT
    public final View LJJIII(Context context) {
        return new C417490GYp(context);
    }

    @Override // X.C14NT, X.C14NX
    public final void LJIILJJIL(Map<String, ? extends Object> map, C14NF c14nf) {
        NimbleViewProps nimbleViewProps;
        String str;
        TemplateData templateData = this.LJIIIZ;
        if (templateData != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.content) != null && str.length() != 0) {
            if (!Intrinsics.LJFF(str, this.LJIILIIL)) {
                this.LJIILIIL = str;
                C14NH.LIZ.getClass();
                ((ExecutorService) C14NH.LIZLLL.getValue()).execute(new ARunnableS25S1100000_20(this, str, 3));
                return;
            }
            return;
        }
        getView().setImageDrawable(null);
        this.LJIILIIL = null;
    }
}
