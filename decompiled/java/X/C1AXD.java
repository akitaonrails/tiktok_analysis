package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AXD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2180891AWx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AXD(C2180891AWx c2180891AWx) {
        super(0);
        this.LL = c2180891AWx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Layout layoutLIZ = this.LL.LLIZ.LIZ(true);
        if (layoutLIZ != null) {
            C2180891AWx c2180891AWx = this.LL;
            c2180891AWx.LLJIJIL.LLLIIIIL(c2180891AWx, c2180891AWx.LLIZ.LIZIZ(layoutLIZ));
        }
        return Unit.LIZ;
    }
}
