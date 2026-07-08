package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler;

/* JADX INFO: renamed from: X.0d8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038480d8A extends AbsAdExternalGuideHandler implements InterfaceC1037440d6U {
    @Override // com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler
    public final boolean LJ() {
        SparkContext sparkContext;
        InterfaceC1038540d8G interfaceC1038540d8G;
        AbstractC1038360d7y abstractC1038360d7y = this.LIZIZ;
        if (abstractC1038360d7y instanceof C1038290d7r) {
            sparkContext = ((C1038290d7r) abstractC1038360d7y).LIZ;
        } else {
            if (!(abstractC1038360d7y instanceof C1038300d7s)) {
                return false;
            }
            sparkContext = ((C1038300d7s) abstractC1038360d7y).LIZIZ;
        }
        if (sparkContext == null || (interfaceC1038540d8G = (InterfaceC1038540d8G) sparkContext.LJFF(InterfaceC1038540d8G.class)) == null) {
            return false;
        }
        interfaceC1038540d8G.LIZLLL(this);
        if (interfaceC1038540d8G.isVisible()) {
            return true;
        }
        interfaceC1038540d8G.setVisibility(true);
        LJIIIZ(1L);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler, X.InterfaceC1038370d7z
    public final void LIZIZ() {
        SparkContext sparkContext;
        InterfaceC1038540d8G interfaceC1038540d8G;
        super.LIZIZ();
        AbstractC1038360d7y abstractC1038360d7y = this.LIZIZ;
        if (abstractC1038360d7y instanceof C1038290d7r) {
            sparkContext = ((C1038290d7r) abstractC1038360d7y).LIZ;
        } else if (!(abstractC1038360d7y instanceof C1038300d7s)) {
            return;
        } else {
            sparkContext = ((C1038300d7s) abstractC1038360d7y).LIZIZ;
        }
        if (sparkContext == null || (interfaceC1038540d8G = (InterfaceC1038540d8G) sparkContext.LJFF(InterfaceC1038540d8G.class)) == null) {
            return;
        }
        interfaceC1038540d8G.LIZ(this);
    }

    @Override // X.InterfaceC1037440d6U
    public final void LIZJ(boolean z) {
        if (LJI() != null) {
            C1038270d7p.LIZJ = z;
        }
        if (z) {
            LJIIIIZZ(1L, 2L);
        }
    }

    @Override // X.InterfaceC1037440d6U
    public final void LIZLLL(boolean z) {
        if (LJI() != null) {
            C1038270d7p.LIZIZ = z;
        }
        if (z) {
            LJIIIIZZ(1L, 1L);
        }
    }

    public C1038480d8A(AdExternalGuideTriggerCondition adExternalGuideTriggerCondition, AbstractC1038360d7y abstractC1038360d7y) {
        super(adExternalGuideTriggerCondition, abstractC1038360d7y);
    }
}
