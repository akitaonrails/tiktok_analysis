package X;

import com.bytedance.bpea.basics.Cert;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS43S0102000_13;

/* JADX INFO: renamed from: X.0WGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820340WGa extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Cert LLILLJJLI;
    public final /* synthetic */ String[] LLILLL;
    public final /* synthetic */ int LLILZ = 0;
    public final /* synthetic */ int LLILZIL = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C820340WGa(Map map, C20144713rx c20144713rx, String[] strArr) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = c20144713rx;
        this.LLILLL = strArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() {
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "Facebook";
        c820360WGc.LIZIZ = "setDataProcessingOptions";
        c820360WGc.LIZJ = this.LL;
        c820360WGc.LIZ(C825920Wac.LIZ(this.LLILLJJLI));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new AwS43S0102000_13(this.LLILZ, this.LLILZIL, this.LLILLL, 0));
    }
}
