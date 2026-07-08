package X;

import java.util.Map;

/* JADX INFO: renamed from: X.08Iy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2095808Iy implements Map.Entry<String, Object>, C08J0 {
    public final String LL;
    public Object LLILLJJLI;

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LLILLJJLI;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.LLILLJJLI;
        this.LLILLJJLI = obj;
        return obj2;
    }

    public C2095808Iy(String str, Object obj) {
        this.LL = str;
        this.LLILLJJLI = obj;
    }
}
