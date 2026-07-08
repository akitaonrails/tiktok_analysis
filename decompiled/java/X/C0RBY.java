package X;

import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RBY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RBY extends C09AY implements Function1<C0RTA, Unit> {
    public C0RBY() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.view_rootview;
        c0rta2.LLILLL = C13LE.LIZ(CellStickerManagerComponent.class);
        return Unit.LIZ;
    }
}
