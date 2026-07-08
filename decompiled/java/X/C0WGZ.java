package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGZ extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Cert LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WGZ(String str, String str2, String str3, C20144713rx c20144713rx) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c20144713rx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "AppsFlyer";
        c820360WGc.LIZIZ = "setPreinstallAttribution";
        c820360WGc.LIZJ = C2097608Jq.LJIIIIZZ(new Pair("channel", this.LL), new Pair("campaign", this.LLILLJJLI), new Pair("siteId", this.LLILLL));
        c820360WGc.LIZ(C825920Wac.LIZ(this.LLILZ));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new C820310WFx(this.LL, this.LLILLJJLI, this.LLILLL));
    }
}
