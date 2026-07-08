package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xOD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817230xOD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1817010xNr LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817230xOD(C1817010xNr c1817010xNr) {
        super(0);
        this.LL = c1817010xNr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1817010xNr c1817010xNr = this.LL;
        c1817010xNr.LLJJJ = true;
        View contentView = c1817010xNr.getContentView();
        if (contentView != null) {
            AbstractC1817020xNs abstractC1817020xNs = this.LL;
            if (contentView.getHeight() > 0 && contentView.getWidth() > 0) {
                abstractC1817020xNs.getOnViewUpdated().invoke(abstractC1817020xNs);
            }
        }
        return Unit.LIZ;
    }
}
