package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardTrackParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729120v66 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r38, java.lang.String r39, boolean r40, X.C1729110v65 r41, java.util.List r42, java.lang.String r43) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729120v66.LIZIZ(java.lang.String, java.lang.String, boolean, X.0v65, java.util.List, java.lang.String):void");
    }

    public static void LIZ(String str, String str2, boolean z, String str3, String str4, boolean z2, Boolean bool, List list, String str5, String str6, String str7, boolean z3, String str8, boolean z4) {
        boolean z5;
        boolean zLJJIZ;
        boolean zFR;
        boolean z6;
        String str9;
        if (z2) {
            if (list != null) {
                if (list.size() > 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        TemplateItem templateItem = (TemplateItem) it2.next();
                        if (str5 != null && Intrinsics.LJFF(str5, templateItem.getTemplateId())) {
                            if (bool != null) {
                                zLJJIZ = bool.booleanValue();
                            } else {
                                zLJJIZ = false;
                            }
                        } else {
                            zLJJIZ = templateItem.LJJIZ();
                        }
                        if (str.length() > 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                            zFR = templateItem.fR();
                        } else {
                            zFR = false;
                        }
                        BillboardTrackParams trackParams = templateItem.getTrackParams();
                        if (trackParams != null) {
                            z6 = trackParams.isAutoDisplay;
                        } else {
                            z6 = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(zLJJIZ);
                        Integer numValueOf = Integer.valueOf(templateItem.getType());
                        C1730290v7z.LIZ.getClass();
                        Boolean boolValueOf2 = Boolean.valueOf(C1730290v7z.LJIILJJIL(templateItem));
                        Boolean boolValueOf3 = Boolean.valueOf(z5);
                        String templateId = templateItem.getTemplateId();
                        String strLJFF = C1730290v7z.LJFF(templateItem);
                        BillboardTrackParams trackParams2 = templateItem.getTrackParams();
                        if (trackParams2 != null) {
                            str9 = trackParams2.operatedFrom;
                        } else {
                            str9 = null;
                        }
                        C1729250v6J.LJIIIIZZ(str, str2, z, zFR, str3, str4, true, z6, boolValueOf, numValueOf, boolValueOf2, boolValueOf3, templateId, null, strLJFF, str7, str9, 16384);
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (C123100dR.LIZ(str6)) {
            C1729250v6J.LJIIIIZZ(str, str2, z, z3, str3, str4, false, z4, null, null, null, null, null, str6, null, null, str8, 118272);
        }
    }
}
