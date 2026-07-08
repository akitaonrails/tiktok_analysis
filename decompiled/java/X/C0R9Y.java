package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0R9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9Y extends C09AY implements Function2<RootCellComponent, C291001Au<? extends Integer>, Unit> {
    public C0R9Y() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(RootCellComponent rootCellComponent, C291001Au<? extends Integer> c291001Au) {
        Object obj;
        RootCellComponent rootCellComponent2 = rootCellComponent;
        if (c291001Au != null) {
            C698980RbM c698980RbM = (C698980RbM) rootCellComponent2.LLJZ.getValue();
            C724270Sb3 c724270Sb3 = rootCellComponent2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            c698980RbM.LIZ(new C699000RbO(1, ((VideoItemParams) obj).getAweme().getAid()));
        }
        return Unit.LIZ;
    }
}
