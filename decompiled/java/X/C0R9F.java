package X;

import com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewAbility;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R9F, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9F extends C09AY implements Function0<CellPlayerViewAbility> {
    public final /* synthetic */ CellStickerManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R9F(CellStickerManagerComponent cellStickerManagerComponent) {
        super(0);
        this.LL = cellStickerManagerComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final CellPlayerViewAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), CellPlayerViewAbility.class, null);
    }
}
