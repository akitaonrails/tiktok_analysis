package X;

import com.bytedance.poplayer.BasePopupTask;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20659915sr extends C09AY implements Function0<Class<?>> {
    public final /* synthetic */ BasePopupTask<Popup> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20659915sr(BasePopupTask<Popup> basePopupTask) {
        super(0);
        this.LL = basePopupTask;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Class<?>, java.lang.reflect.Type] */
    @Override // kotlin.jvm.functions.Function0
    public final Class<?> invoke() {
        ParameterizedType parameterizedType;
        Type[] actualTypeArguments;
        Type genericSuperclass = this.LL.getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType) || (parameterizedType = (ParameterizedType) genericSuperclass) == null || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null) {
            return null;
        }
        return (Type) C13LQ.LJJIFFI(actualTypeArguments);
    }
}
