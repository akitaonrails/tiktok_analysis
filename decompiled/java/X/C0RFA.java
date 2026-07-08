package X;

import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RFA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RFA extends C09AY implements Function0<InterfaceC19632811ra> {
    public final /* synthetic */ CellStickerManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RFA(CellStickerManagerComponent cellStickerManagerComponent) {
        super(0);
        this.LL = cellStickerManagerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC19632811ra invoke() {
        return this.LL.mp().producePollDetailSaveData();
    }
}
