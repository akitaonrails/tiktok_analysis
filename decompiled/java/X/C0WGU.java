package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WGU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGU extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Cert LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WGU(Map map, C20144713rx c20144713rx) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = c20144713rx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = this.LL;
        if (map != null) {
            linkedHashMap.putAll(C0DQV.LIZLLL(map, "customData"));
        }
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "AppsFlyer";
        c820360WGc.LIZIZ = "setAdditionalData";
        c820360WGc.LIZJ = linkedHashMap;
        c820360WGc.LIZ(C825920Wac.LIZ(this.LLILLJJLI));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new C817190W3x(this.LL));
    }
}
