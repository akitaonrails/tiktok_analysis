package X;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2370909Qt extends C2217421BqW implements Function1<Type, String> {
    public static final C2370909Qt LL = new C2370909Qt();

    public C2370909Qt() {
        super(1, C2371409Qy.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Type type) {
        return C2371409Qy.LJ(type);
    }
}
