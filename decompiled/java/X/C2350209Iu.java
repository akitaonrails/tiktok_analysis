package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.09Iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2350209Iu {
    public static final DraftFileSaveException LIZ(String str, String str2) {
        int length = str2.getBytes(Charsets.UTF_8).length;
        C0VSJ c0vsj = new C0VSJ(C1449640npK.LIZJ);
        C570490MZb.LJFF(c0vsj);
        long jLJI = C2260008tK.LJI(c0vsj.getAbsolutePath());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filePath: ");
        sbLIZ.append(str);
        sbLIZ.append(", availableBytes: ");
        sbLIZ.append(jLJI);
        sbLIZ.append(", contentLength: ");
        sbLIZ.append(length);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (jLJI < length) {
            return new DraftFileSaveException(-553, new C2089308Gl(strLIZIZ));
        }
        C2354709Kn.LJJ(str, str2);
        return new DraftFileSaveException(0, null);
    }
}
