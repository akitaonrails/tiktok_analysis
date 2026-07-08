package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TBH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TBH {
    public final List<String> LIZ;
    public String LIZIZ;

    public final String LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : (ArrayList) this.LIZ) {
            sb.append('/');
            sb.append(str2);
        }
        String string = sb.toString();
        this.LIZIZ = string;
        return string;
    }

    public C0TBH() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add("");
    }
}
