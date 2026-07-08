package X;

import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0WLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821870WLx extends C09AY implements Function2<String, Map<String, ? extends String>, Unit> {
    public C821870WLx() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Map<String, ? extends String> map) {
        Integer numValueOf;
        String str2 = str;
        Map<String, ? extends String> map2 = map;
        String str3 = map2.get("code");
        if (str3 != null) {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str3));
        } else {
            numValueOf = null;
        }
        String str4 = map2.get("errMsg");
        if (numValueOf != null && str4 != null) {
            SparkSecurityServiceCenter sparkSecurityServiceCenter = SparkSecurityServiceCenter.INSTANCE;
            C821850WLv c821850WLv = new C821850WLv(true, C2097608Jq.LJIIJ(new Pair("error", new C821880WLy(numValueOf.intValue(), str4))));
            c821850WLv.LIZJ = str2;
            sparkSecurityServiceCenter.handleSparkSecurityAsyncResult(c821850WLv);
        }
        return Unit.LIZ;
    }
}
