package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15cV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20558515cV extends C09AY implements Function0<AbstractC20560715cr> {
    public final /* synthetic */ CellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20558515cV(CellAdaptionComponentV2 cellAdaptionComponentV2) {
        super(0);
        this.LL = cellAdaptionComponentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC20560715cr invoke() {
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LL.LLJLILLLLZIIL.getValue();
        if (iScreenComponentAbility != null) {
            return iScreenComponentAbility.HE0();
        }
        return null;
    }
}
