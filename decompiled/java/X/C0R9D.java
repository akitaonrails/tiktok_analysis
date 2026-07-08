package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R9D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9D extends C09AY implements Function2<CellStickerManagerComponent, C291001Au<? extends C0R9E>, Unit> {
    public C0R9D() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CellStickerManagerComponent cellStickerManagerComponent, C291001Au<? extends C0R9E> c291001Au) {
        C0R9E c0r9e;
        CellStickerManagerComponent cellStickerManagerComponent2 = cellStickerManagerComponent;
        C291001Au<? extends C0R9E> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c0r9e = (C0R9E) c291001Au2.LIZ) != null && Intrinsics.LJFF(c0r9e.LIZ, ((VideoItemParams) C631370Opb.LIZ(cellStickerManagerComponent2)).getAweme().getAid())) {
            cellStickerManagerComponent2.LLLI.setValue(Boolean.FALSE);
        }
        return Unit.LIZ;
    }
}
