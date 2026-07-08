package X;

import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530460pvg extends C09AY implements Function0<Unit> {
    public C1530460pvg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Forest forest;
        Map<String, C1533750q0z<C2027907wz>> map = C1533720q0w.LIZLLL;
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                C1533720q0w c1533720q0w = C1533720q0w.LIZ;
                String str = (String) entry.getKey();
                c1533720q0w.getClass();
                if (a0.LJJIIZI(str, "&", false)) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6);
                    Pair pair = new Pair(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                    String str2 = (String) pair.getFirst();
                    String str3 = (String) pair.getSecond();
                    IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                    if (iResourceServiceXLIZIZ == null || (forest = iResourceServiceXLIZIZ.getForest()) == null) {
                        break;
                    }
                    C1533720q0w.LJFF(str2, str3, forest);
                }
            }
        }
        return Unit.LIZ;
    }
}
