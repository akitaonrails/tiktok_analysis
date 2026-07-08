package X;

import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01uK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C482601uK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C482301uH LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482601uK(C482301uH c482301uH, String str) {
        super(0);
        this.LL = c482301uH;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((IBillboardService) this.LL.LJI.getValue()).rN2(this.LLILLJJLI, C011V.BROADCAST, 0L);
        C482301uH c482301uH = this.LL;
        c482301uH.LJIIIZ = null;
        DataChannel dataChannel = c482301uH.LIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C1083460eIi.class, null);
        }
        this.LL.LJFF = null;
        return Unit.LIZ;
    }
}
