package X;

import com.ss.ugc.android.davinciresource.jni.MapStringString;
import java.util.Map;

/* JADX INFO: renamed from: X.1ECG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ECG implements Map.Entry<String, String> {
    public MapStringString.Iterator LL;
    public final /* synthetic */ MapStringString LLILLJJLI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.LL.getKey();
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.LL.getValue();
    }

    public C1ECG(MapStringString mapStringString) {
        this.LLILLJJLI = mapStringString;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String value = this.LL.getValue();
        this.LL.setValue(str);
        return value;
    }
}
