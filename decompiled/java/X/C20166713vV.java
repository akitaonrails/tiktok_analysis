package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookEmail;
import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.13vV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20166713vV {
    public static boolean LIZ(List list, C20166313vR c20166313vR) {
        int size;
        if (((Number) c20166313vR.LIZ.getValue()).intValue() < 2) {
            c20166313vR.LJFF("psiLowDevice", null);
            return false;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ContactBookUploadItem contactBookUploadItem = (ContactBookUploadItem) it2.next();
            int size2 = contactBookUploadItem.contactBookPhoneList.size();
            List<ContactBookEmail> list2 = contactBookUploadItem.contactBookEmailList;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            i += size2 + size;
        }
        if (i > 200) {
            c20166313vR.LJFF("psiSizeLimit", null);
            return false;
        }
        if (i == 0) {
            c20166313vR.LJFF("psiSizeZero", null);
            return false;
        }
        Throwable th = C07CM.LIZIZ;
        if (th != null) {
            c20166313vR.LJFF("expClosedByThrowable", th);
            return false;
        }
        String string = C1071650dzf.LIZ().getString("contact_syncing_by_psi", null);
        if (C703302op.LIZ(string)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error session id: ");
            sbLIZ.append(string);
            c20166313vR.LJFF("psiSyncUnclear", new Error(C2188811AlT.LIZIZ(sbLIZ)));
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: Exception -> 0x00bf, all -> 0x011a, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bf, blocks: (B:43:0x00b8, B:45:0x00bc), top: B:88:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0126  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0e53, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1074950e4z r15, X.C2218501BsG r16, java.util.List r17, X.C1074990e53 r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20166713vV.LIZIZ(X.0e4z, X.1BsG, java.util.List, X.0e53, X.05Vn):java.lang.Object");
    }
}
