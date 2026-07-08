package X;

import com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RIA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIA extends C09AY implements Function0<Long> {
    public final /* synthetic */ BaseDowngradeCellTriggerComponent<C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RIA(BaseDowngradeCellTriggerComponent<C03H5> baseDowngradeCellTriggerComponent) {
        super(0);
        this.LL = baseDowngradeCellTriggerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = (C0BX9.LIZ() || (C305550ByL.LIZLLL() && C104100aN.LIZ().LJIILIIL())) ? false : true;
        BaseDowngradeCellTriggerComponent<C03H5> baseDowngradeCellTriggerComponent = this.LL;
        C723830SaL.LIZJ(baseDowngradeCellTriggerComponent, baseDowngradeCellTriggerComponent.getType(), z);
        if (z) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
    }
}
