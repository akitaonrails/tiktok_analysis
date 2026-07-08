package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WGX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGX extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ boolean LL = false;
    public final /* synthetic */ Cert LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WGX(C20144713rx c20144713rx) {
        super(0);
        this.LLILLJJLI = c20144713rx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "AppsFlyer";
        c820360WGc.LIZIZ = "setCollectOaid";
        c820360WGc.LIZJ = C2097908Jt.LIZJ(new Pair("collected", Boolean.valueOf(this.LL)));
        c820360WGc.LIZ(C825920Wac.LIZ(this.LLILLJJLI));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new C817180W3w(this.LL));
    }
}
