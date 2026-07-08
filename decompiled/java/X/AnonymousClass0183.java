package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0183, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0183 extends C09AY implements Function1<Map<String, Object>, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0183(String str, String str2, Map map, boolean z) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, Object> map) {
        HashMap<String, Object> mapLJIIJ;
        Map<String, Object> map2 = map;
        map2.putAll(this.LL);
        if (this.LLILLJJLI) {
            String str = this.LLILLL;
            if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
                map2.putAll(mapLJIIJ);
            }
        } else {
            String str2 = this.LLILLL;
            if (str2 != null) {
                map2.put(this.LLILZ, str2);
            }
        }
        return Unit.LIZ;
    }
}
