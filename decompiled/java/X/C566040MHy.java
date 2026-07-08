package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566040MHy {
    public static final C566040MHy LIZ = new C566040MHy();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(385));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(384));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(386));

    public static C0VSJ LIZ(String str) {
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        C0MLE.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("celebration_");
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2298208zU.LJ(pathService, new CreativeInfo(C2188811AlT.LIZIZ(sbLIZ), 0, null, 6, null), C0MI0.CELEBRATION, null, 12));
        LIZ.getClass();
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj;
    }

    public static C0VSJ LIZIZ(CreativeInfo creativeInfo) {
        C0VSJ c0vsj = new C0VSJ(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CELEBRATION, null, false, 12));
        LIZ.getClass();
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj;
    }
}
