package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690340u5Y extends C09AY implements Function1<List<? extends Integer>, C1690080u58> {
    public C1690340u5Y() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1690080u58 invoke(List<? extends Integer> list) {
        List<? extends Integer> list2 = list;
        return new C1690080u58(((Number) ListProtector.get(list2, 0)).intValue(), ((Number) ListProtector.get(list2, 1)).intValue());
    }
}
