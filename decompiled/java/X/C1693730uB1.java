package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693730uB1 extends C09AY implements Function1<Object, C1693560uAk> {
    public C1693730uB1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1693560uAk invoke(Object obj) {
        List list = (List) obj;
        return new C1693560uAk(((Number) ListProtector.get(list, 0)).floatValue(), ((Number) ListProtector.get(list, 1)).floatValue());
    }
}
