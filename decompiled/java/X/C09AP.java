package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09AP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09AP extends C09AY implements Function2<Object, CoroutineContext.Element, Object> {
    public C09AP() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, CoroutineContext.Element element) {
        int iIntValue;
        Integer num;
        if (element instanceof C09AT) {
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                iIntValue = num.intValue();
                if (iIntValue == 0) {
                    return element;
                }
            } else {
                iIntValue = 1;
            }
            return Integer.valueOf(iIntValue + 1);
        }
        return obj;
    }
}
