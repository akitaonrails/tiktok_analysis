package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.012G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012G extends C09AY implements Function2<String, List<? extends Integer>, Unit> {
    public final /* synthetic */ C012H LL;
    public final /* synthetic */ Map<Long, C012D> LLILLJJLI;
    public final /* synthetic */ List<Integer> LLILLL;
    public final /* synthetic */ List<Long> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C012G(C012H c012h, Map<Long, C012D> map, List<Integer> list, List<Long> list2) {
        super(2);
        this.LL = c012h;
        this.LLILLJJLI = map;
        this.LLILLL = list;
        this.LLILZ = list2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, List<? extends Integer> list) {
        boolean z;
        String str2 = str;
        List<? extends Integer> list2 = list;
        C012H c012h = this.LL;
        if (c012h.LIZIZ != null) {
            Map<Long, C012D> map = this.LLILLJJLI;
            List<Integer> list3 = this.LLILLL;
            List<Long> list4 = this.LLILZ;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Insert ErrorInfo = ");
                sbLIZ.append(str2);
                C20441214yg.LJ("RecommendGiftWrapper", C2188811AlT.LIZIZ(sbLIZ));
                c012h.LJII.LIZ = null;
            } else {
                C20441214yg.LJ("RecommendGiftWrapper", "insertCallback succeed");
                for (C012D c012d : map.values()) {
                    if (c012d != null) {
                        long j = c012d.LIZ;
                        if (j > 0) {
                            list4.add(Long.valueOf(j));
                        }
                    }
                }
                list3.addAll(list2);
            }
        }
        return Unit.LIZ;
    }
}
