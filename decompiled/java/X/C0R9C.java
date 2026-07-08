package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0R9C, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9C extends C09AY implements Function2<CellStickerManagerComponent, C291001Au<? extends Integer>, Unit> {
    public C0R9C() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CellStickerManagerComponent cellStickerManagerComponent, C291001Au<? extends Integer> c291001Au) {
        CellStickerManagerComponent cellStickerManagerComponent2 = cellStickerManagerComponent;
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        if (c291001Au2 != null && ((Number) c291001Au2.LIZ).intValue() == ((VideoItemParams) C631370Opb.LIZ(cellStickerManagerComponent2)).currentPosition) {
            cellStickerManagerComponent2.LLLI.setValue(Boolean.TRUE);
        }
        return Unit.LIZ;
    }
}
