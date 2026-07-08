package X;

import com.google.gson.k;
import java.util.Map;

/* JADX INFO: renamed from: X.07fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920807fi implements Map.Entry<String, Object>, C03W4 {
    public final /* synthetic */ Map.Entry<String, k> LL;

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.LL.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return C1931407hQ.LIZ(this.LL.getValue());
    }

    public C1920807fi(Map.Entry<String, k> entry) {
        this.LL = entry;
    }
}
