package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRenderLayerResortFix;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182041AaY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2181481AZe LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182041AaY(C2181481AZe c2181481AZe, boolean z) {
        super(0);
        this.LL = c2181481AZe;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJIFFI();
        this.LL.LJIIL();
        this.LL.LJIILJJIL();
        if (LinkMicRenderLayerResortFix.INSTANCE.isEnable()) {
            this.LL.LJJIIJ(this.LLILLJJLI ? "enableRenderLayer" : "disableRenderLayer");
        }
        return Unit.LIZ;
    }
}
