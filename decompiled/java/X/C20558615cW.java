package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15cW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20558615cW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20558615cW(CellAdaptionComponentV2 cellAdaptionComponentV2) {
        super(0);
        this.LL = cellAdaptionComponentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LL.LLJLIL.getValue();
        if (cellStickerComponentAbility != null) {
            cellStickerComponentAbility.BT();
        }
        return Unit.LIZ;
    }
}
