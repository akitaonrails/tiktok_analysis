package X;

import com.ss.android.ugc.feed.platform.cell.CellConfig;
import com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RB2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RB2 extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ CellConfig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RB2(CellConfig cellConfig) {
        super(1);
        this.LL = cellConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.view_rootview;
        this.LL.getClass();
        c0rta2.LLILLL = C13LE.LIZ(CellPlayerViewComponent.class);
        return Unit.LIZ;
    }
}
