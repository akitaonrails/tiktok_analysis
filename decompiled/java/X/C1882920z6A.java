package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882920z6A extends C09AY implements Function0<Type> {
    public final /* synthetic */ AbstractC1882890z67<M> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882920z6A(AbstractC1882890z67<M> abstractC1882890z67) {
        super(0);
        this.LL = abstractC1882890z67;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Type invoke() {
        Type typePutIfAbsent;
        Class<?> cls = this.LL.getClass();
        ConcurrentHashMap<Class<?>, Type> concurrentHashMap = AbstractC1882890z67.LLJJIII;
        Type type = concurrentHashMap.get(cls);
        return (type != null || (typePutIfAbsent = concurrentHashMap.putIfAbsent(cls, (type = ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0]))) == null) ? type : typePutIfAbsent;
    }
}
