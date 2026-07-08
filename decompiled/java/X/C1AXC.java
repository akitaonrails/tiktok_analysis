package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AXC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2180901AWy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AXC(C2180901AWy c2180901AWy) {
        super(0);
        this.LL = c2180901AWy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Layout layoutLIZ = this.LL.LLJLIL.LIZ(true);
        if (layoutLIZ != null) {
            C2180901AWy c2180901AWy = this.LL;
            c2180901AWy.LLJLL.LLLIIIIL(c2180901AWy, c2180901AWy.LLJLIL.LIZIZ(layoutLIZ));
        }
        return Unit.LIZ;
    }
}
