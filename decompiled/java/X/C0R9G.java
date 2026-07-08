package X;

import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R9G, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9G extends C09AY implements Function0<C705920RmY> {
    public final /* synthetic */ CellStickerManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R9G(CellStickerManagerComponent cellStickerManagerComponent) {
        super(0);
        this.LL = cellStickerManagerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C705920RmY invoke() {
        return new C705920RmY(this.LL);
    }
}
