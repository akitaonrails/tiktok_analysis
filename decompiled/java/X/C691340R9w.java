package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0R9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691340R9w extends C09AY implements Function2<InteractAreaComponent, C291001Au<? extends C693070RGn>, Unit> {
    public C691340R9w() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InteractAreaComponent interactAreaComponent, C291001Au<? extends C693070RGn> c291001Au) {
        C693070RGn c693070RGn;
        InteractAreaComponent interactAreaComponent2 = interactAreaComponent;
        C291001Au<? extends C693070RGn> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c693070RGn = (C693070RGn) c291001Au2.LIZ) != null && c693070RGn.LJ) {
            interactAreaComponent2.J1(((VideoItemParams) C631370Opb.LIZ(interactAreaComponent2)).currentPosition, ((VideoItemParams) C631370Opb.LIZ(interactAreaComponent2)).getAweme());
            interactAreaComponent2.up();
        }
        return Unit.LIZ;
    }
}
