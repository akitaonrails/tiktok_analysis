package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardErrorCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1827480xek extends C09AY implements Function0<C16FS> {
    public final /* synthetic */ LiveBoardErrorCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1827480xek(LiveBoardErrorCell liveBoardErrorCell) {
        super(0);
        this.LL = liveBoardErrorCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.16FS, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C16FS invoke() {
        return this.LL.itemView.findViewById(R.id.c7o);
    }
}
