package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFirstFrameDropAfterEnd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279870jPV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SurfaceView LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279870jPV(C1276910jKj c1276910jKj, String str, SurfaceView surfaceView, int i, int i2) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = str;
        this.LLILLL = surfaceView;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO;
        if ((!LinkMicFirstFrameDropAfterEnd.INSTANCE.enable() || !this.LL.LLJJIJIL) && (interfaceC1279800jPO = this.LL.LLJJJ) != null) {
            interfaceC1279800jPO.LJIL(this.LLILZ, this.LLILZIL, this.LLILLL, this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
