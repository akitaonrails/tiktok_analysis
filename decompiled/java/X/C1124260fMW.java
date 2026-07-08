package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractivePanelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124260fMW {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(185));
    public static String LIZIZ;

    public static Keva LJFF() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clicked_before_first_threshold_");
        sbLIZ.append(LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clicked_before_second_threshold_");
        sbLIZ.append(LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ() {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static int LIZLLL() {
        return LJFF().getInt(LJ(), 0);
    }

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exposure_count_");
        sbLIZ.append(LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJI() {
        LJFF().storeInt(LJ(), 0);
        LJFF().storeBoolean(LIZ(), false);
        LJFF().storeBoolean(LIZIZ(), false);
        LIZIZ = null;
    }

    public static List LJII(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            GiftPage giftPage = (GiftPage) obj;
            if (giftPage.display && (i = giftPage.pageType) != 5 && (i != 17 || LiveGiftInteractivePanelSetting.INSTANCE.isEnable())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
