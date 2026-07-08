package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardChunkTitleCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03HD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HD extends C09AY implements Function0<C16F5> {
    public final /* synthetic */ LiveBoardChunkTitleCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03HD(LiveBoardChunkTitleCell liveBoardChunkTitleCell) {
        super(0);
        this.LL = liveBoardChunkTitleCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.16F5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C16F5 invoke() {
        return this.LL.itemView.findViewById(R.id.c69);
    }
}
