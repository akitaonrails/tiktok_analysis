package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.DarkCoverImageUrl;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.LightCoverImageUrl;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.OnBoardingConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ya0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862980ya0 {
    public static final C1862980ya0 LIZ = new C1862980ya0();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(258));

    public static List LIZ(Context context, EnumC1863020ya4 enumC1863020ya4) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        OnBoardingConfig onBoardingConfigLIZ = C1863120yaE.LIZ();
        if (onBoardingConfigLIZ == null) {
            return C13BV.INSTANCE;
        }
        boolean zLIZ = C467860IWi.LIZ(context);
        ArrayList arrayList = new ArrayList();
        int i = C1863030ya5.LIZ[enumC1863020ya4.ordinal()];
        String str13 = null;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new C1954807lC();
                }
            } else if (zLIZ) {
                String[] strArr = new String[4];
                DarkCoverImageUrl darkCoverImageUrl = onBoardingConfigLIZ.darkCoverUrl;
                if (darkCoverImageUrl != null) {
                    str10 = darkCoverImageUrl.horizontalDarkAfterFeedUrl;
                } else {
                    str10 = null;
                }
                strArr[0] = str10;
                if (darkCoverImageUrl != null) {
                    str11 = darkCoverImageUrl.horizontalDarkTravelUrl;
                } else {
                    str11 = null;
                }
                strArr[1] = str11;
                if (darkCoverImageUrl != null) {
                    str12 = darkCoverImageUrl.horizontalDarkMenuUrl;
                } else {
                    str12 = null;
                }
                strArr[2] = str12;
                if (darkCoverImageUrl != null) {
                    str13 = darkCoverImageUrl.horizontalDarkImageGenerationUrl;
                }
                strArr[3] = str13;
                arrayList.addAll(C13LQ.LJIJI(strArr));
            } else {
                String[] strArr2 = new String[4];
                LightCoverImageUrl lightCoverImageUrl = onBoardingConfigLIZ.lightCoverUrl;
                if (lightCoverImageUrl != null) {
                    str7 = lightCoverImageUrl.horizontalLightAfterFeedUrl;
                } else {
                    str7 = null;
                }
                strArr2[0] = str7;
                if (lightCoverImageUrl != null) {
                    str8 = lightCoverImageUrl.horizontalLightTravelUrl;
                } else {
                    str8 = null;
                }
                strArr2[1] = str8;
                if (lightCoverImageUrl != null) {
                    str9 = lightCoverImageUrl.horizontalLightMenuUrl;
                } else {
                    str9 = null;
                }
                strArr2[2] = str9;
                if (lightCoverImageUrl != null) {
                    str13 = lightCoverImageUrl.horizontalLightImageGenerationUrl;
                }
                strArr2[3] = str13;
                arrayList.addAll(C13LQ.LJIJI(strArr2));
            }
        } else if (zLIZ) {
            String[] strArr3 = new String[4];
            DarkCoverImageUrl darkCoverImageUrl2 = onBoardingConfigLIZ.darkCoverUrl;
            if (darkCoverImageUrl2 != null) {
                str4 = darkCoverImageUrl2.verticalDarkAfterFeedUrl;
            } else {
                str4 = null;
            }
            strArr3[0] = str4;
            if (darkCoverImageUrl2 != null) {
                str5 = darkCoverImageUrl2.verticalDarkTravelUrl;
            } else {
                str5 = null;
            }
            strArr3[1] = str5;
            if (darkCoverImageUrl2 != null) {
                str6 = darkCoverImageUrl2.verticalDarkMenuUrl;
            } else {
                str6 = null;
            }
            strArr3[2] = str6;
            if (darkCoverImageUrl2 != null) {
                str13 = darkCoverImageUrl2.verticalDarkImageGenerationUrl;
            }
            strArr3[3] = str13;
            arrayList.addAll(C13LQ.LJIJI(strArr3));
        } else {
            String[] strArr4 = new String[4];
            LightCoverImageUrl lightCoverImageUrl2 = onBoardingConfigLIZ.lightCoverUrl;
            if (lightCoverImageUrl2 != null) {
                str = lightCoverImageUrl2.verticalLightAfterFeedUrl;
            } else {
                str = null;
            }
            strArr4[0] = str;
            if (lightCoverImageUrl2 != null) {
                str2 = lightCoverImageUrl2.verticalLightTravelUrl;
            } else {
                str2 = null;
            }
            strArr4[1] = str2;
            if (lightCoverImageUrl2 != null) {
                str3 = lightCoverImageUrl2.verticalLightMenuUrl;
            } else {
                str3 = null;
            }
            strArr4[2] = str3;
            if (lightCoverImageUrl2 != null) {
                str13 = lightCoverImageUrl2.verticalLightImageGenerationUrl;
            }
            strArr4[3] = str13;
            arrayList.addAll(C13LQ.LJIJI(strArr4));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        return C13LP.LL(C13LP.LJJJJI(arrayList3), 6);
    }

    public static void LIZIZ(Context context, EnumC1863020ya4 enumC1863020ya4) {
        try {
            List listLIZ = LIZ(context, enumC1863020ya4);
            if (listLIZ.isEmpty()) {
                return;
            }
            C0I99.LIZ(listLIZ, 1, false, AFwS216S0000000_27.get$arr$(259));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
