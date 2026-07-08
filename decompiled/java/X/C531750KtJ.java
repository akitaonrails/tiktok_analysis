package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS116S1100000_2;
import kotlin.jvm.internal.AwS185S1100000_2;

/* JADX INFO: renamed from: X.0KtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531750KtJ {
    public static final C531740KtI LIZ = C0FQL.LIZ("fetchDetail", new C531690KtD(null));

    public static final EnumC1412640mre LIZJ(C532330KuF c532330KuF, EnumC1412640mre enumC1412640mre, String str) {
        EnumC1412640mre enumC1412640mreLIZLLL;
        AssetType assetType;
        Long l = c532330KuF.LIZJ;
        if (l == null || (assetType = AssetPanelModelKt.toAssetType((int) l.longValue())) == null || (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) == null) {
            enumC1412640mreLIZLLL = enumC1412640mre;
            if (enumC1412640mre == null) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FetchDetailNode cannot resolve type, id=");
                sbLIZ.append(str);
                C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        if (enumC1412640mre != null && enumC1412640mre != enumC1412640mreLIZLLL) {
            C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FetchDetailNode type mismatch, use server: caller=");
            sbLIZ2.append(enumC1412640mre.getValue());
            sbLIZ2.append(", resolved=");
            sbLIZ2.append(enumC1412640mreLIZLLL.getValue());
            sbLIZ2.append(", id=");
            sbLIZ2.append(str);
            C201955140j.LJIJI(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        return enumC1412640mreLIZLLL;
    }

    public static final Object LIZ(String str, String str2, String str3, InterfaceC1364105Vn<? super C532330KuF> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) PluggableExtentionKt.pluggableSpi$default(ITemplateResourceService.class, false, false, false, 14, null);
        if (iTemplateResourceService == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FetchDetailNode ITemplateResourceService not found, id=");
            sbLIZ.append(str);
            IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            String message = illegalStateException.getMessage();
            if (message == null) {
                message = "ITemplateResourceService not found";
            }
            C201955140j.LJII(c1398350mUb, message);
            if (c2252611DEt.isActive()) {
                C098200Yq c098200Yq = new C098200Yq(illegalStateException);
                C189200o6.m2constructorimpl(c098200Yq);
                c2252611DEt.resumeWith(c098200Yq);
            }
        } else {
            C1429050nI7.LIZ.getClass();
            iTemplateResourceService.LJI(str, C1429050nI7.LIZ(), 2, "", new AwS116S1100000_2(str, c2252611DEt, 6), new AwS185S1100000_2(str, c2252611DEt, 2), null, str2, str3);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LIZIZ(TemplateConsumeCoreParam templateConsumeCoreParam, long j, boolean z, String str, int i, String str2, String str3, String str4, int i2) {
        C531550Ksz c531550KszLIZ;
        C532330KuF c532330KuF;
        String str5 = str2;
        int i3 = i;
        String str6 = str3;
        String str7 = str;
        String str8 = null;
        if ((i2 & 8) != 0) {
            str7 = null;
        }
        if ((i2 & 16) != 0) {
            i3 = 0;
        }
        if ((i2 & 32) != 0) {
            str5 = null;
        }
        if ((i2 & 64) != 0) {
            str6 = null;
        }
        if ((i2 & 128) == 0) {
            str8 = str4;
        }
        if (str7 == null && ((c531550KszLIZ = C0FQK.LIZ(templateConsumeCoreParam.templateId)) == null || (c532330KuF = c531550KszLIZ.LIZJ) == null || (str7 = c532330KuF.LIZ) == null)) {
            str7 = "";
        }
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            iTemplateMobService.LJ(templateConsumeCoreParam.templateId, Integer.valueOf(templateConsumeCoreParam.templateType.getValue()), str7, templateConsumeCoreParam.dispatchType.LIZ, "fetch_template_detail", j, z, i3, false, str5, null, null, str6, str8, true, new LinkedHashMap());
        }
    }
}
