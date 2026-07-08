package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.08fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2175508fh {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final List<C080U> LIZLLL;
    public final TypedInput LJ;
    public Object LJFF;
    public String LJI;

    public final boolean LIZJ() {
        int i = this.LIZIZ;
        return i >= 200 && i < 300;
    }

    public final C080U LIZ(String str) {
        List<C080U> list = this.LIZLLL;
        if (list != null) {
            for (C080U c080u : list) {
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    return c080u;
                }
            }
            return null;
        }
        return null;
    }

    public final List<C080U> LIZIZ(String str) {
        List<C080U> list;
        ArrayList arrayList = null;
        if (str != null && (list = this.LIZLLL) != null) {
            for (C080U c080u : list) {
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c080u);
                }
            }
        }
        return arrayList;
    }

    public C2175508fh(String str, int i, String str2, List<C080U> list, TypedInput typedInput) {
        if (str != null) {
            if (i >= 200) {
                if (str2 != null) {
                    if (list != null) {
                        this.LIZ = str;
                        this.LIZIZ = i;
                        this.LIZJ = str2;
                        this.LIZLLL = Collections.unmodifiableList(new ArrayList(list));
                        this.LJ = typedInput;
                        return;
                    }
                    throw new IllegalArgumentException("headers == null");
                }
                throw new IllegalArgumentException("reason == null");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid status code: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("url == null");
    }
}
