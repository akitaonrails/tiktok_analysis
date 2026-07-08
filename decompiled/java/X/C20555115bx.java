package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20555115bx extends C09AY implements Function0<IScreenComponentAbility> {
    public final /* synthetic */ CellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20555115bx(CellAdaptionComponentV2 cellAdaptionComponentV2) {
        super(0);
        this.LL = cellAdaptionComponentV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IScreenComponentAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IScreenComponentAbility.class, null);
    }
}
