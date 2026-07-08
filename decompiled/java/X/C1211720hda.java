package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0hda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211720hda extends C19981113Fx {
    public final List<String> LL;

    public final List<String> getMissingFields() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1211720hda(String str) {
        List listSingletonList = Collections.singletonList(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Field '");
        sbLIZ.append(str);
        sbLIZ.append("' is required, but it was missing");
        this(listSingletonList, C2188811AlT.LIZIZ(sbLIZ), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1211720hda(List<String> list, String str) {
        String strLIZIZ;
        if (list.size() == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Field '");
            sbLIZ.append((String) ListProtector.get(list, 0));
            sbLIZ.append("' is required for type with serial name '");
            sbLIZ.append(str);
            sbLIZ.append("', but it was missing");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Fields ");
            sbLIZ2.append(list);
            sbLIZ2.append(" are required for type with serial name '");
            sbLIZ2.append(str);
            sbLIZ2.append("', but they were missing");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this(list, strLIZIZ, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1211720hda(String str, String str2) {
        List listSingletonList = Collections.singletonList(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Field '");
        sbLIZ.append(str);
        sbLIZ.append("' is required for type with serial name '");
        sbLIZ.append(str2);
        sbLIZ.append("', but it was missing");
        this(listSingletonList, C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public C1211720hda(List<String> list, String str, Throwable th) {
        super(str, th);
        this.LL = list;
    }
}
