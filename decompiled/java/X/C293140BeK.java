package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293140BeK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, Function0 function0) {
        int i;
        switch (((Number) C0AG7.LIZ.getValue()).intValue()) {
            case 1:
                i = 2131829921;
                break;
            case 2:
                i = 2131829923;
                break;
            case 3:
                i = 2131829924;
                break;
            case 4:
                i = 2131829920;
                break;
            case 5:
                i = 2131829925;
                break;
            case 6:
                i = 2131829926;
                break;
            case 7:
                i = 2131829927;
                break;
            case 8:
                i = 2131829928;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                i = 2131829929;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                i = 2131829922;
                break;
            default:
                return (String) function0.invoke();
        }
        return context.getString(i);
    }
}
