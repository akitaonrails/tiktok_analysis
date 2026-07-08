package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFirstFrameDropAfterEnd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279780jPM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SurfaceView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279780jPM(C1276910jKj c1276910jKj, String str, SurfaceView surfaceView) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = str;
        this.LLILLL = surfaceView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO;
        if ((!LinkMicFirstFrameDropAfterEnd.INSTANCE.enable() || !this.LL.LLJJIJIL) && (interfaceC1279800jPO = this.LL.LLJJJ) != null) {
            interfaceC1279800jPO.LIZIZ(this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
