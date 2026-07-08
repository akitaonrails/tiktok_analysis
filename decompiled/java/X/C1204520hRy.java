package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.nearby.container.model.NearbyNoticeModel;
import com.ss.android.ugc.nearby.container.model.NearbyPlaceHolderModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204520hRy {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NearbyNoticeModel nearbyNoticeModel, long j, boolean z) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        C1203740hQi c1203740hQi = C1203740hQi.LIZ;
        Keva keva = C1203740hQi.LIZIZ;
        c1203740hQi.getClass();
        if (!keva.getBoolean(C1203740hQi.LIZ("nearby_intro_show"), false) && j == 0) {
            if (C288440BSg.LIZ) {
                String value = EnumC1204690hSF.FIRST_ENTER_INTRO.getValue();
                C844470XAv.LIZ.getClass();
                return C1697810uHb.LJIIJJI(new NearbyNoticeModel(value, C844470XAv.LIZ().getString(2131846245), C844470XAv.LIZ().getString(2131837948), C844470XAv.LIZ().getString(2131837947)), new NearbyPlaceHolderModel(0));
            }
            String value2 = EnumC1204690hSF.FIRST_ENTER_INTRO.getValue();
            C844470XAv.LIZ.getClass();
            return C1697810uHb.LJIIJJI(new NearbyNoticeModel(value2, C844470XAv.LIZ().getString(2131837949), C844470XAv.LIZ().getString(2131837948), C844470XAv.LIZ().getString(2131837947)), new NearbyPlaceHolderModel(0));
        }
        C1204980hSi c1204980hSi = EnumC1204690hSF.Companion;
        if (nearbyNoticeModel != null) {
            str = nearbyNoticeModel.type;
        } else {
            str = null;
        }
        c1204980hSi.getClass();
        if (C1204980hSi.LIZ(str) == EnumC1204690hSF.CONTENT_INSUFFICIENT && C288440BSg.LIZ) {
            return C13BV.INSTANCE;
        }
        if (nearbyNoticeModel != null) {
            str2 = nearbyNoticeModel.type;
        } else {
            str2 = null;
        }
        if (C1204980hSi.LIZ(str2) == EnumC1204690hSF.NON_GPS_SUPPORTED_REGIONS && C288440BSg.LIZ) {
            return C13BV.INSTANCE;
        }
        if (!z && ((i = C2551709zH.LIZ) == 2 || i == 1)) {
            if (nearbyNoticeModel != null) {
                str4 = nearbyNoticeModel.type;
            } else {
                str4 = null;
            }
            if (Intrinsics.LJFF(str4, EnumC1204690hSF.GPS_SUPPORTED_REGIONS.getValue())) {
                return C13BV.INSTANCE;
            }
        }
        if (C1205040hSo.LIZ().expGroup != null && C1205040hSo.LIZ().cardIndex != null) {
            if (nearbyNoticeModel != null) {
                str3 = nearbyNoticeModel.type;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, EnumC1204690hSF.GPS_SUPPORTED_REGIONS.getValue())) {
                return C13BV.INSTANCE;
            }
        }
        if (nearbyNoticeModel == null) {
            return null;
        }
        return C1697810uHb.LJIIJJI(nearbyNoticeModel, new NearbyPlaceHolderModel(0));
    }
}
