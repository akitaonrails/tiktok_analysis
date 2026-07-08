package X;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: X.0T9U, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0T9U extends AbstractC1383500m6e {
    public final List<String> LIZJ;

    @Override // X.AbstractC1383500m6e
    public final String LIZ() {
        List<String> list = this.LIZJ;
        return list != null ? TextUtils.join(", ", list) : "";
    }

    public C0T9U(List<String> list, String str) {
        super(str);
        this.LIZJ = list;
    }
}
