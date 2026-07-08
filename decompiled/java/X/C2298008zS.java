package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08zS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2298008zS implements C0M8K {
    public static final C2298008zS LIZ = new C2298008zS();

    @Override // X.C0M8K
    public final String LIZ(String str, CreativeInfo creativeInfo, CreativeInfo creativeInfo2) {
        String strLIZIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo);
        String strLIZIZ2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo2);
        if (u.LJJIIJZLJL(str, strLIZIZ, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ2);
            sbLIZ.append(a0.LJJJJZ(strLIZIZ, str));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C570490MZb.LIZLLL(str)) {
            return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo2, EnumC20228214Cy.EXTERNAL_RESTORE, String.valueOf(System.currentTimeMillis()), false, 8);
        }
        if (u.LJJIIJZLJL(str, strLIZIZ2, false)) {
            return str;
        }
        return C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo2, EnumC20228214Cy.EXTERNAL_RESTORE, a0.LJJJJZ(C570490MZb.LIZJ(C0CHQ.LIZ.getFilesDir().getAbsolutePath()), str), false, 8);
    }
}
