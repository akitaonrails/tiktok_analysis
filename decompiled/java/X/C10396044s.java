package X;

import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.044s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10396044s {
    public static final GodaV2RequestParams LIZ(Function1<? super C10395044r, Unit> function1) {
        Map mapLIZJ;
        C10395044r c10395044r = new C10395044r();
        function1.invoke(c10395044r);
        Map<String, ? extends Object> map = c10395044r.LIZLLL;
        if (map != null) {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("pages", map));
        } else {
            mapLIZJ = null;
        }
        return new GodaV2RequestParams(c10395044r.LIZ, c10395044r.LIZIZ, c10395044r.LIZJ, mapLIZJ);
    }
}
