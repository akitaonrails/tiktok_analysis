package X;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09FP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09FP extends C09AY implements Function1<Class<?>, Boolean> {
    public C09FP() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Class<?> cls) {
        return Boolean.valueOf(Serializable.class.isAssignableFrom(cls));
    }
}
