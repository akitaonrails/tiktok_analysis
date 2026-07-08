package X;

import com.bytedance.android.livesdk.api.revenue.strategy.channel.TaskErrorEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134270fcf extends C09AY implements Function2<Boolean, Throwable, Unit> {
    public final /* synthetic */ C1134410fct LL;
    public final /* synthetic */ int LLILLJJLI = 11;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC1134290fch LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134270fcf(C1134410fct c1134410fct, long j, C1131670fYT c1131670fYT) {
        super(2);
        this.LL = c1134410fct;
        this.LLILLL = j;
        this.LLILZ = c1131670fYT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Throwable th) {
        Throwable th2 = th;
        if (bool.booleanValue()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1134280fcg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LL, null), 3);
        } else {
            DataChannelGlobal.LLILZ.FQ2(TaskErrorEvent.class, new C1134260fce(this.LL, 0));
            if (th2 != null) {
                this.LLILZ.LIZJ(th2);
            }
        }
        return Unit.LIZ;
    }
}
