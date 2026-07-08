package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.126d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197009126d {
    public static final /* synthetic */ C197009126d LIZ = new C197009126d();

    public static String LIZ(String str, String str2) {
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = new CreativeInfo(str, 0, null, 6, null);
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.INFO_STICKER;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(".png");
        return pathService.LIZJ(creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), true).getPath();
    }
}
