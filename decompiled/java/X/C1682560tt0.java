package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682560tt0 extends C09AY implements Function1<Object, C1378605aS> {
    public C1682560tt0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1378605aS invoke(Object obj) {
        Float f;
        if (Intrinsics.LJFF(obj, Boolean.FALSE)) {
            return new C1378605aS(9205357640488583168L);
        }
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        Float f2 = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        float fFloatValue = f.floatValue();
        Object obj3 = ListProtector.get(list, 1);
        if (obj3 != null) {
            f2 = (Float) obj3;
        }
        return new C1378605aS((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L));
    }
}
