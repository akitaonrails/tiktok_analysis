package X;

import com.bytedance.retrofit2.ParameterHandler;
import com.bytedance.retrofit2.RequestBuilder;

/* JADX INFO: renamed from: X.0p9O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500520p9O<T> extends ParameterHandler<T> {
    public final Class<T> LIZ;

    public C1500520p9O(Class<T> cls) {
        this.LIZ = cls;
    }

    @Override // com.bytedance.retrofit2.ParameterHandler
    public final void apply(RequestBuilder requestBuilder, T t) {
        Class<T> cls = this.LIZ;
        requestBuilder.LJJ.put(cls, cls.cast(t));
    }
}
