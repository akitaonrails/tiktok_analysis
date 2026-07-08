package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.DarkCoverImageUrl;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.LightCoverImageUrl;
import com.ss.android.ugc.aweme.tako.startup.onboarding.config.OnBoardingConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C07QN("tako_onboarding_component")
public final class C1862970yZz {
    public static final C1862970yZz LIZ = new C1862970yZz();

    @C09DK(isDefault = true)
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("after_feed", "experience_decision_travel", "experience_decision_menu", "image_generation_guide");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(684));

    public static C1863190yaL LIZIZ(String str, boolean z) {
        String str2;
        LightCoverImageUrl lightCoverImageUrl;
        DarkCoverImageUrl darkCoverImageUrl;
        String str3;
        LightCoverImageUrl lightCoverImageUrl2;
        DarkCoverImageUrl darkCoverImageUrl2;
        String str4;
        LightCoverImageUrl lightCoverImageUrl3;
        DarkCoverImageUrl darkCoverImageUrl3;
        String str5;
        LightCoverImageUrl lightCoverImageUrl4;
        DarkCoverImageUrl darkCoverImageUrl4;
        String str6;
        LightCoverImageUrl lightCoverImageUrl5;
        DarkCoverImageUrl darkCoverImageUrl5;
        String str7;
        LightCoverImageUrl lightCoverImageUrl6;
        DarkCoverImageUrl darkCoverImageUrl6;
        String str8;
        LightCoverImageUrl lightCoverImageUrl7;
        DarkCoverImageUrl darkCoverImageUrl7;
        String str9;
        LightCoverImageUrl lightCoverImageUrl8;
        DarkCoverImageUrl darkCoverImageUrl8;
        String str10 = null;
        if (z) {
            if (Intrinsics.LJFF(str, EnumC1862960yZy.ASK_VIDEO.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ != null && (darkCoverImageUrl8 = onBoardingConfigLIZ.darkCoverUrl) != null) {
                    str9 = darkCoverImageUrl8.verticalDarkAfterFeedUrl;
                } else {
                    str9 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ2 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ2 != null && (lightCoverImageUrl8 = onBoardingConfigLIZ2.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl8.verticalLightAfterFeedUrl;
                }
                return new C1863190yaL(str9, str10);
            }
            if (Intrinsics.LJFF(str, EnumC1862960yZy.TRIP.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ3 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ3 != null && (darkCoverImageUrl7 = onBoardingConfigLIZ3.darkCoverUrl) != null) {
                    str8 = darkCoverImageUrl7.verticalDarkTravelUrl;
                } else {
                    str8 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ4 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ4 != null && (lightCoverImageUrl7 = onBoardingConfigLIZ4.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl7.verticalLightTravelUrl;
                }
                return new C1863190yaL(str8, str10);
            }
            if (Intrinsics.LJFF(str, EnumC1862960yZy.RECIPE.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ5 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ5 != null && (darkCoverImageUrl6 = onBoardingConfigLIZ5.darkCoverUrl) != null) {
                    str7 = darkCoverImageUrl6.verticalDarkMenuUrl;
                } else {
                    str7 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ6 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ6 != null && (lightCoverImageUrl6 = onBoardingConfigLIZ6.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl6.verticalLightMenuUrl;
                }
                return new C1863190yaL(str7, str10);
            }
            if (Intrinsics.LJFF(str, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ7 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ7 != null && (darkCoverImageUrl5 = onBoardingConfigLIZ7.darkCoverUrl) != null) {
                    str6 = darkCoverImageUrl5.verticalDarkImageGenerationUrl;
                } else {
                    str6 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ8 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ8 != null && (lightCoverImageUrl5 = onBoardingConfigLIZ8.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl5.verticalLightImageGenerationUrl;
                }
                return new C1863190yaL(str6, str10);
            }
        } else {
            if (Intrinsics.LJFF(str, EnumC1862960yZy.ASK_VIDEO.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ9 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ9 != null && (darkCoverImageUrl4 = onBoardingConfigLIZ9.darkCoverUrl) != null) {
                    str5 = darkCoverImageUrl4.horizontalDarkAfterFeedUrl;
                } else {
                    str5 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ10 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ10 != null && (lightCoverImageUrl4 = onBoardingConfigLIZ10.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl4.horizontalLightAfterFeedUrl;
                }
                return new C1863190yaL(str5, str10);
            }
            if (Intrinsics.LJFF(str, EnumC1862960yZy.TRIP.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ11 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ11 != null && (darkCoverImageUrl3 = onBoardingConfigLIZ11.darkCoverUrl) != null) {
                    str4 = darkCoverImageUrl3.horizontalDarkTravelUrl;
                } else {
                    str4 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ12 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ12 != null && (lightCoverImageUrl3 = onBoardingConfigLIZ12.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl3.horizontalLightTravelUrl;
                }
                return new C1863190yaL(str4, str10);
            }
            if (Intrinsics.LJFF(str, EnumC1862960yZy.RECIPE.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ13 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ13 != null && (darkCoverImageUrl2 = onBoardingConfigLIZ13.darkCoverUrl) != null) {
                    str3 = darkCoverImageUrl2.horizontalDarkMenuUrl;
                } else {
                    str3 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ14 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ14 != null && (lightCoverImageUrl2 = onBoardingConfigLIZ14.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl2.horizontalLightMenuUrl;
                }
                return new C1863190yaL(str3, str10);
            }
            if (Intrinsics.LJFF(str, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
                OnBoardingConfig onBoardingConfigLIZ15 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ15 != null && (darkCoverImageUrl = onBoardingConfigLIZ15.darkCoverUrl) != null) {
                    str2 = darkCoverImageUrl.horizontalDarkImageGenerationUrl;
                } else {
                    str2 = null;
                }
                OnBoardingConfig onBoardingConfigLIZ16 = C1863120yaE.LIZ();
                if (onBoardingConfigLIZ16 != null && (lightCoverImageUrl = onBoardingConfigLIZ16.lightCoverUrl) != null) {
                    str10 = lightCoverImageUrl.horizontalLightImageGenerationUrl;
                }
                return new C1863190yaL(str2, str10);
            }
        }
        return null;
    }

    public static Pair LIZ(Context context, String str, boolean z) {
        String string;
        String string2;
        String string3;
        if (Intrinsics.LJFF(str, EnumC1862960yZy.ASK_VIDEO.getTypeName())) {
            String string4 = context.getResources().getString(2131822502);
            if (z) {
                string3 = context.getResources().getString(2131822501);
            } else {
                string3 = context.getResources().getString(2131822491);
            }
            return new Pair(C786410Ut5.j4(string3, Arrays.copyOf(new Object[]{string4}, 1)), string4);
        }
        if (Intrinsics.LJFF(str, EnumC1862960yZy.TRIP.getTypeName())) {
            String string5 = context.getResources().getString(2131822504);
            if (z) {
                string2 = context.getResources().getString(2131822505);
            } else {
                string2 = context.getResources().getString(2131822498);
            }
            return new Pair(C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{string5}, 1)), string5);
        }
        if (Intrinsics.LJFF(str, EnumC1862960yZy.RECIPE.getTypeName())) {
            String string6 = context.getResources().getString(2131822499);
            return new Pair(C786410Ut5.j4(context.getResources().getString(2131822500), Arrays.copyOf(new Object[]{string6}, 1)), string6);
        }
        if (Intrinsics.LJFF(str, EnumC1862960yZy.TEMPLATE_CREATE.getTypeName())) {
            String string7 = context.getResources().getString(2131822503);
            if (z) {
                string = context.getResources().getString(2131822495);
            } else {
                string = context.getResources().getString(2131822492);
            }
            return new Pair(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string7}, 1)), string7);
        }
        return null;
    }
}
