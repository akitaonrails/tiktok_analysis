package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R7F, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R7F extends C09AY implements Function1<MotionEvent, Boolean> {
    public final /* synthetic */ CellGradualComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R7F(CellGradualComponent cellGradualComponent) {
        super(1);
        this.LL = cellGradualComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        String str;
        MotionEvent motionEvent2 = motionEvent;
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        if (c1ee1.LJJIZ()) {
            C0RF0 c0rf0 = this.LL.jm().LIZLLL;
            if (c0rf0 != null) {
                str = c0rf0.LJIIIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "offline_mode_page")) {
                c1ee1.LJJJJZI(C724240Sb0.LIZ(this.LL));
                return Boolean.TRUE;
            }
        }
        EdgeSpeedupAbility edgeSpeedupAbility = (EdgeSpeedupAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), EdgeSpeedupAbility.class, null);
        if (edgeSpeedupAbility != null && motionEvent2 != null && edgeSpeedupAbility.cS1(motionEvent2.getX(), motionEvent2.getY())) {
            return Boolean.TRUE;
        }
        if (!C0R68.LIZIZ(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme(), null, null)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
