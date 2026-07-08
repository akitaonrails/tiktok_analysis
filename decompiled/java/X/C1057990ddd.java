package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0ddd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057990ddd extends AbstractC1034380d1Y implements InterfaceC1058020ddg {
    @Override // X.InterfaceC1058020ddg
    public final C1058010ddf LIZ(View view) {
        C1322090kVb c1322090kVb;
        Object c098200Yq;
        View viewLIZLLL = AbstractC1034380d1Y.LIZLLL(view, R.id.dgj, new AwS560S0100000_16(view, 802));
        if (viewLIZLLL == null || !(viewLIZLLL instanceof SmartImageView) || (c1322090kVb = (C1322090kVb) viewLIZLLL) == null) {
            return null;
        }
        RectF rectF = new RectF();
        try {
            c098200Yq = (C1331070kk5) c1322090kVb.getHierarchy();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1331070kk5 c1331070kk5 = (C1331070kk5) c098200Yq;
        if (c1331070kk5 == null) {
            return null;
        }
        c1331070kk5.LJIIJ(rectF);
        Rect rectLIZ = C1034100d16.LIZ(c1322090kVb);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new C1058010ddf(rectLIZ, rect);
    }
}
