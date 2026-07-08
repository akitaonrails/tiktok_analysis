package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1965007mq extends C09AY implements Function1<Class<?>, Boolean> {
    public C1965007mq() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Class<?> cls) {
        Class<?> cls2 = cls;
        Class<? extends Object>[] clsArr = C1964907mp.LIZ;
        boolean z = false;
        int i = 0;
        while (true) {
            if (clsArr[i].isAssignableFrom(cls2)) {
                z = true;
                break;
            }
            i++;
            if (i >= 11) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
