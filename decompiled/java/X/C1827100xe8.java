package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardBlankCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xe8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1827100xe8 extends C09AY implements Function0<C197039127h> {
    public final /* synthetic */ LiveBoardBlankCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1827100xe8(LiveBoardBlankCell liveBoardBlankCell) {
        super(0);
        this.LL = liveBoardBlankCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.127h, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C197039127h invoke() {
        return this.LL.itemView.findViewById(R.id.c6z);
    }
}
