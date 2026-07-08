package X;

import X.C0DV4;
import java.util.Map;

/* JADX INFO: renamed from: X.0DV4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0DV4<T extends C0DV4<T>> extends C650460PfI<T> {
    public C0DV4(String str, Map<String, String> map) {
        super(str);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            LJ(entry.getKey(), entry.getValue());
        }
    }
}
