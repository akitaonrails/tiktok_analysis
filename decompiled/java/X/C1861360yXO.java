package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNovelChoiceSelect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS676S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yXO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861360yXO {
    public static final C1861360yXO LIZ = new C1861360yXO();

    public static int LIZIZ(Integer num) {
        if (num != null && num.intValue() == 1016) {
            return 100;
        }
        return 200;
    }

    public static C1861350yXN LIZ(Message message, boolean z) {
        Integer numValueOf;
        TakoMixFeed takoMixFeedLJIIIZ;
        if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null) {
            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
        } else {
            numValueOf = null;
        }
        return new C1861350yXN(EnumC1861380yXQ.LOCATE_CUSTOM, new C1860330yVj(z, numValueOf), new AwS676S0100000_27(numValueOf, 6), 0.0d, 0, 120);
    }

    public static boolean LIZJ(TakoNovelChoiceSelect takoNovelChoiceSelect, Message message) {
        Object obj;
        C1861640yXq c1861640yXq = C1861640yXq.LIZ;
        String strValueOf = String.valueOf(message.botId);
        c1861640yXq.getClass();
        Map map = (Map) ((LinkedHashMap) C1861640yXq.LIZIZ).get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String str = null;
        if (map != null) {
            obj = map.get(strValueOf);
        } else {
            obj = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(message.uuid);
        if (takoNovelChoiceSelect != null) {
            str = takoNovelChoiceSelect.id;
        }
        sbLIZ.append(str);
        if (Intrinsics.LJFF(obj, C2188811AlT.LIZIZ(sbLIZ)) || (takoNovelChoiceSelect != null && takoNovelChoiceSelect.isSelected == 1)) {
            return true;
        }
        return false;
    }
}
