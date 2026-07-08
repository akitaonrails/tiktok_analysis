package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2371109Qv extends C2217421BqW implements Function1<Class<?>, Class<?>> {
    public static final C2371109Qv LL = new C2371109Qv();

    public C2371109Qv() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Class<?> invoke(Class<?> cls) {
        return cls.getComponentType();
    }
}
