package X;

import com.ss.android.ugc.feed.platform.cell.component.progress.VideoPlayProgressCellComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RE1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RE1 extends C09AY implements Function1<C0RTA, Unit> {
    public C0RE1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.view_rootview;
        c0rta2.LLILLL = C13LE.LIZ(VideoPlayProgressCellComponent.class);
        return Unit.LIZ;
    }
}
