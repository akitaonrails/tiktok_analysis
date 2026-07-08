package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveDecorationCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1828180xfs extends C09AY implements Function0<View> {
    public final /* synthetic */ LiveDecorationCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1828180xfs(LiveDecorationCell liveDecorationCell) {
        super(0);
        this.LL = liveDecorationCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.itemView.findViewById(R.id.c7p);
    }
}
