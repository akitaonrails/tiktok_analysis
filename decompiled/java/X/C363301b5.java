package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C363301b5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(430));
    public static final Map<String, String> LIZIZ = new ConcurrentHashMap();

    public static String LIZJ(BulletinGeckoResourceModel bulletinGeckoResourceModel) {
        String str;
        String str2;
        String str3;
        if (bulletinGeckoResourceModel == null || (str = bulletinGeckoResourceModel.packageChannelId) == null || str.length() <= 0 || (str2 = bulletinGeckoResourceModel.imagePath) == null || str2.length() <= 0 || (str3 = (String) ((ConcurrentHashMap) LIZIZ).get(str)) == null || !C1533950q1J.LJ(str3)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(InterfaceC497601wk interfaceC497601wk, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1631620sYq<? super Boolean, ? super String, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object>[] interfaceC1631620sYqArr, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinImageGeckoManagerV2getBulletinStyleResource: failAll: ");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(interfaceC497601wk, abstractC2252651DEx, null, new C361101aj(interfaceC1631620sYqArr, str, null), 2);
    }

    public static void LIZ(BulletinGeckoResourceModel bulletinGeckoResourceModel, InterfaceC497601wk interfaceC497601wk, List list, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1631620sYq... interfaceC1631620sYqArr) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinImageGeckoManagerV2getBulletinStyleResourcesIndividually: resourceTypes:");
        sbLIZ.append(list);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (bulletinGeckoResourceModel == null) {
            LIZIZ(interfaceC497601wk, abstractC2252651DEx, interfaceC1631620sYqArr, "BulletinGeckoResourceModel is null");
            return;
        }
        String str2 = bulletinGeckoResourceModel.packageChannelId;
        int i = 1;
        if (str2 != null && str2.length() != 0) {
            if (list.size() != interfaceC1631620sYqArr.length) {
                LIZIZ(interfaceC497601wk, abstractC2252651DEx, interfaceC1631620sYqArr, "Callback count does not match resource type count");
                return;
            }
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    EnumC368901bz enumC368901bz = (EnumC368901bz) obj;
                    int i4 = C368801by.LIZ[enumC368901bz.ordinal()];
                    if (i4 != i) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                str = bulletinGeckoResourceModel.initImagePath;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            str = bulletinGeckoResourceModel.imagePath;
                        }
                    } else {
                        str = bulletinGeckoResourceModel.lottiePath;
                    }
                    InterfaceC1631620sYq interfaceC1631620sYq = interfaceC1631620sYqArr[i2];
                    if (str != null && str.length() != 0) {
                        String str3 = (String) ((ConcurrentHashMap) LIZIZ).get(str2);
                        if (str3 != null && C1533950q1J.LJ(str3)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("BulletinImageGeckoManagerV2getGeckoImageResPathWithFetch: success: true cache res:");
                            sbLIZ2.append(str);
                            sbLIZ2.append(" path:");
                            sbLIZ2.append(str3);
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                            C23250099c.LIZLLL(interfaceC497601wk, abstractC2252651DEx, null, new C322101Mt(str3, str, null, interfaceC1631620sYq), 2);
                        } else {
                            C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C363701b9(abstractC2252651DEx, "", str2, str, new C363401b6(str, str2, null, interfaceC1631620sYq), null), 2);
                        }
                    } else {
                        C23250099c.LIZLLL(interfaceC497601wk, abstractC2252651DEx, null, new C363201b4(interfaceC1631620sYq, enumC368901bz, null), 2);
                    }
                    i2 = i3;
                    i = 1;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        LIZIZ(interfaceC497601wk, abstractC2252651DEx, interfaceC1631620sYqArr, "packageChannelId is null or empty");
    }
}
