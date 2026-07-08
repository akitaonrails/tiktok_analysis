package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: X.0zr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911980zr2 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public int LIZLLL;

    public final String LIZIZ() throws Exception {
        if (this.LIZLLL < this.LIZIZ.size()) {
            return (String) ListProtector.get(this.LIZIZ, this.LIZLLL);
        }
        throw new Exception("Array out of bound");
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ2.append(C2354709Kn.LJIIIZ(C844470XAv.LIZ()).getPath());
        String str = File.separator;
        sbLIZ2.append(str);
        sbLIZ2.append("newpendant");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(str);
        sbLIZ.append(!TextUtils.isEmpty(this.LIZ) ? this.LIZ : "default_activity");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZLLL() throws Exception {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ());
        sbLIZ.append(File.separator);
        LIZIZ();
        sbLIZ.append(LIZJ(false));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LJ() throws Exception {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ());
        sbLIZ.append(File.separator);
        LIZIZ();
        sbLIZ.append(LIZJ(true));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZJ(boolean z) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        if (z) {
            str = ".zip";
        } else {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1911980zr2(String str, List list, String str2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
    }
}
