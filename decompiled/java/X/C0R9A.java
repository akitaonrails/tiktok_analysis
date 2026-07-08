package X;

import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0R9A, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9A extends C09AY implements Function2<CellStickerManagerComponent, C291001Au<? extends Long>, Unit> {
    public C0R9A() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CellStickerManagerComponent cellStickerManagerComponent, C291001Au<? extends Long> c291001Au) {
        CellStickerManagerComponent cellStickerManagerComponent2 = cellStickerManagerComponent;
        C291001Au<? extends Long> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            cellStickerManagerComponent2.LLLIIIIL = ((Number) c291001Au2.LIZ).longValue();
            C705920RmY c705920RmYLp = cellStickerManagerComponent2.lp();
            ((Number) c291001Au2.LIZ).longValue();
            AbsInteractStickerWidget absInteractStickerWidget = c705920RmYLp.LJIIJJI;
            if (absInteractStickerWidget != null) {
                absInteractStickerWidget.LIZIZ();
            }
        }
        return Unit.LIZ;
    }
}
