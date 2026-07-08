package X;

import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690230R5p extends C09AY implements Function0<CellStickerComponentAbility> {
    public final /* synthetic */ CellStickerManagerTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C690230R5p(CellStickerManagerTemp cellStickerManagerTemp) {
        super(0);
        this.LL = cellStickerManagerTemp;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final CellStickerComponentAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LLILLJJLI;
        if (interfaceC665370Q7z != null) {
            return C1558520qew.LIZ(interfaceC665370Q7z, CellStickerComponentAbility.class, null);
        }
        return null;
    }
}
