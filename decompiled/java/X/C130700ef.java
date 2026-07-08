package X;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.00ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C130700ef extends C09AY implements Function2<Map<?, ?>, String, String> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130700ef(String str) {
        super(2);
        this.LL = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Map<?, ?> map, String str) {
        ?? r2 = map.get(this.LL);
        if (r2 == 0 || !(r2 instanceof String)) {
            return null;
        }
        return r2;
    }
}
