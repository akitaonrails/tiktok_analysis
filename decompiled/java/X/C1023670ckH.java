package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ckH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023670ckH implements InterfaceC1023650ckF<Map<String, ? extends Object>, JSONObject> {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC1023650ckF<?, ?>[] LIZ;

    @Override // X.InterfaceC1023650ckF
    public final Function1<C1196804mE, Map<String, ? extends Object>> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1023650ckF
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1023650ckF
    public final String getName() {
        return "ad_extra_data";
    }

    public C1023670ckH(InterfaceC1023650ckF<?, ?>... interfaceC1023650ckFArr) {
        this.LIZ = interfaceC1023650ckFArr;
    }

    @Override // X.InterfaceC1023650ckF
    public final JSONObject LIZ(Map<String, ? extends Object> map) {
        return new JSONObject(map);
    }
}
