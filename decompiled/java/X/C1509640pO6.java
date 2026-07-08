package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0pO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509640pO6 implements InterfaceC1510030pOj {
    public static final C1509640pO6 LIZIZ = new C1509640pO6();
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"enter_graphic_detail", "video_play_finish", "pinch_zoom", "image_play_end"});
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(28));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(229));

    @Override // X.InterfaceC1510030pOj
    public final Set<String> events() {
        return C15442062u.LJIIIZ((Set) LJ.getValue(), LIZJ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1510030pOj
    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        String str2;
        String strLIZ;
        switch (str.hashCode()) {
            case -629905484:
                if (str.equals("image_play_end")) {
                    String strLIZ2 = C1509410pNj.LIZ(c1510130pOt);
                    if (strLIZ2 == null) {
                        return;
                    }
                    C1509630pO5 c1509630pO5 = C1509630pO5.LIZIZ;
                    AbstractC1509490pNr abstractC1509490pNrLIZ = C1509630pO5.LIZ(strLIZ2);
                    if (abstractC1509490pNrLIZ == null) {
                        return;
                    }
                    String strLIZLLL = c1510130pOt.LIZLLL("play_dur_sum");
                    if (strLIZLLL != null) {
                        abstractC1509490pNrLIZ.addFeature("fpm_playtime", Long.valueOf(CastLongProtector.parseLong(strLIZLLL)), false);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PhotoModeFeatureProducer>> aid:");
                        sbLIZ.append(strLIZ2);
                        sbLIZ.append(", FPM_PLAYTIME ");
                        sbLIZ.append(abstractC1509490pNrLIZ.getFeature("fpm_playtime"));
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    String strLIZLLL2 = c1510130pOt.LIZLLL("slides_cnt");
                    if (strLIZLLL2 != null) {
                        abstractC1509490pNrLIZ.setFeature("fpm_images", Long.valueOf(CastLongProtector.parseLong(strLIZLLL2)), false);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("PhotoModeFeatureProducer>> aid:");
                        sbLIZ2.append(strLIZ2);
                        sbLIZ2.append(", FPM_IMAGES ");
                        sbLIZ2.append(abstractC1509490pNrLIZ.getFeature("fpm_images"));
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    String strLIZLLL3 = c1510130pOt.LIZLLL("image_loaded");
                    if (strLIZLLL3 != null) {
                        abstractC1509490pNrLIZ.setFeature("fpm_image_is_preload", Long.valueOf(CastLongProtector.parseLong(strLIZLLL3)), false);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("PhotoModeFeatureProducer>> aid:");
                        sbLIZ3.append(strLIZ2);
                        sbLIZ3.append(", FPM_IMAGE_IS_PRELOAD ");
                        sbLIZ3.append(abstractC1509490pNrLIZ.getFeature("fpm_image_is_preload"));
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    String strLIZLLL4 = c1510130pOt.LIZLLL("black_screen_cnt");
                    if (strLIZLLL4 != null) {
                        abstractC1509490pNrLIZ.setFeature("fpm_image_black_screen", Long.valueOf(CastLongProtector.parseLong(strLIZLLL4)), false);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("PhotoModeFeatureProducer>> aid:");
                        sbLIZ4.append(strLIZ2);
                        sbLIZ4.append(", FPM_IMAGE_BLACK_SCREEN ");
                        sbLIZ4.append(abstractC1509490pNrLIZ.getFeature("fpm_image_black_screen"));
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    String strLIZLLL5 = c1510130pOt.LIZLLL("largest_image_load_duration");
                    if (strLIZLLL5 == null) {
                        return;
                    }
                    long j = CastLongProtector.parseLong(strLIZLLL5);
                    if (j <= 0) {
                        return;
                    }
                    abstractC1509490pNrLIZ.setFeature("fpm_image_loading_time", Long.valueOf(j), false);
                    return;
                }
                break;
            case -17674694:
                if (str.equals("video_play_finish")) {
                    String strLIZ3 = C1509410pNj.LIZ(c1510130pOt);
                    if (strLIZ3 == null) {
                        return;
                    }
                    C1509630pO5 c1509630pO52 = C1509630pO5.LIZIZ;
                    AbstractC1509490pNr abstractC1509490pNrLIZ2 = C1509630pO5.LIZ(strLIZ3);
                    if (abstractC1509490pNrLIZ2 == null) {
                        return;
                    }
                    abstractC1509490pNrLIZ2.setFeature("fpm_image_is_play_finish", 1, false);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("PhotoModeFeatureProducer>> aid:");
                    sbLIZ5.append(strLIZ3);
                    sbLIZ5.append(", FPM_IMAGE_IS_PLAY_FINISH ");
                    sbLIZ5.append(abstractC1509490pNrLIZ2.getFeature("fpm_image_is_play_finish"));
                    C2188811AlT.LIZIZ(sbLIZ5);
                    return;
                }
                break;
            case 593013199:
                if (str.equals("enter_graphic_detail")) {
                    String strLIZ4 = C1509410pNj.LIZ(c1510130pOt);
                    if (strLIZ4 == null) {
                        return;
                    }
                    C1509630pO5 c1509630pO53 = C1509630pO5.LIZIZ;
                    AbstractC1509490pNr abstractC1509490pNrLIZ3 = C1509630pO5.LIZ(strLIZ4);
                    if (abstractC1509490pNrLIZ3 == null) {
                        return;
                    }
                    abstractC1509490pNrLIZ3.addFeature("fpm_enter_detail", 1, false);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("PhotoModeFeatureProducer>> aid:");
                    sbLIZ6.append(strLIZ4);
                    sbLIZ6.append(", FPM_ENTER_DETAIL ");
                    sbLIZ6.append(abstractC1509490pNrLIZ3.getFeature("fpm_enter_detail"));
                    C2188811AlT.LIZIZ(sbLIZ6);
                    return;
                }
                break;
            case 2129204280:
                if (str.equals("pinch_zoom")) {
                    String strLIZ5 = C1509410pNj.LIZ(c1510130pOt);
                    if (strLIZ5 == null) {
                        return;
                    }
                    C1509630pO5 c1509630pO54 = C1509630pO5.LIZIZ;
                    AbstractC1509490pNr abstractC1509490pNrLIZ4 = C1509630pO5.LIZ(strLIZ5);
                    if (abstractC1509490pNrLIZ4 == null) {
                        return;
                    }
                    abstractC1509490pNrLIZ4.setFeature("fpm_image_is_pinch", 1, false);
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("PhotoModeFeatureProducer>> aid:");
                    sbLIZ7.append(strLIZ5);
                    sbLIZ7.append(", FPM_IMAGE_IS_PINCH ");
                    sbLIZ7.append(abstractC1509490pNrLIZ4.getFeature("fpm_image_is_pinch"));
                    C2188811AlT.LIZIZ(sbLIZ7);
                    return;
                }
                break;
        }
        if (((Set) LJ.getValue()).contains(str) && (str2 = (String) ((Map) LIZLLL.getValue()).get(str)) != null && (strLIZ = C1509410pNj.LIZ(c1510130pOt)) != null) {
            C1509630pO5 c1509630pO55 = C1509630pO5.LIZIZ;
            AbstractC1509490pNr abstractC1509490pNrLIZ5 = C1509630pO5.LIZ(strLIZ);
            if (abstractC1509490pNrLIZ5 != null) {
                abstractC1509490pNrLIZ5.addFeature(str2, 1, false);
            }
        }
    }
}
