package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS131S0110000_13;

/* JADX INFO: renamed from: X.0WGT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGT extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Cert LLILLJJLI;
    public final /* synthetic */ C0WG5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WGT(boolean z, C20144713rx c20144713rx, C0WG5 c0wg5) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c20144713rx;
        this.LLILLL = c0wg5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "Firebase";
        c820360WGc.LIZIZ = "setAnalyticsCollectionEnabled";
        c820360WGc.LIZJ = C2097908Jt.LIZJ(new Pair("enabled", Boolean.valueOf(this.LL)));
        c820360WGc.LIZ(C825920Wac.LIZ(this.LLILLJJLI));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new AwS131S0110000_13(this.LLILLL, this.LL, 2));
    }
}
