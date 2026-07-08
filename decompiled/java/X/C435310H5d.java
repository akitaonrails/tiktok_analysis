package X;

import android.view.ContextThemeWrapper;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveDecorationCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0H5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435310H5d extends C09AY implements Function1<C197039127h, Unit> {
    public final /* synthetic */ LiveDecorationCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435310H5d(LiveDecorationCell liveDecorationCell) {
        super(1);
        this.LL = liveDecorationCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C197039127h c197039127h) {
        C197039127h c197039127h2 = c197039127h;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.LL.U5().getContext(), C011Z.LIZ.LJIIIZ());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.c9b, contextThemeWrapper));
        c197039127h2.setBackground(c384050F3z.LIZ(contextThemeWrapper));
        c197039127h2.LJJLI(true);
        return Unit.LIZ;
    }
}
