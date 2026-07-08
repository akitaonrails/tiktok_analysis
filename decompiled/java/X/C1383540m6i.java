package X;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: X.0m6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1383540m6i extends AbstractC1383520m6g {
    public final List<String> LIZJ;

    @Override // X.AbstractC1383520m6g
    public final String LIZ() {
        List<String> list = this.LIZJ;
        return list != null ? TextUtils.join(", ", list) : "";
    }

    public C1383540m6i(List<String> list, String str) {
        super(str);
        this.LIZJ = list;
    }
}
