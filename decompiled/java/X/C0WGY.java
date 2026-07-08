package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WGY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGY extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ String LL = "allow_personalized_ads";
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Cert LLILLL;
    public final /* synthetic */ C0WG5 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WGY(String str, C20144713rx c20144713rx, C0WG5 c0wg5) {
        super(0);
        this.LLILLJJLI = str;
        this.LLILLL = c20144713rx;
        this.LLILZ = c0wg5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "Firebase";
        c820360WGc.LIZIZ = "setUserProperty";
        c820360WGc.LIZJ = C2097608Jq.LJIIIIZZ(new Pair("name", this.LL), new Pair("value", this.LLILLJJLI));
        c820360WGc.LIZ(C825920Wac.LIZ(this.LLILLL));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new C820280WFu(this.LLILZ, this.LL, this.LLILLJJLI));
    }
}
