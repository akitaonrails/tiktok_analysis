package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043150dFh extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ C1043130dFf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043150dFh(C1043130dFf c1043130dFf) {
        super(0);
        this.LL = c1043130dFf;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        String string = this.LL.LIZ().getString("generalDomains", null);
        if (string != null) {
            ?? FromJson = GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), string, new TypeToken<Map<String, String>>() { // from class: X.04Yu
            }.getType());
            if (FromJson != 0) {
                return FromJson;
            }
        }
        return new LinkedHashMap();
    }
}
