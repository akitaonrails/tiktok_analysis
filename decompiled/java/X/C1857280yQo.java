package X;

import android.text.BidiFormatter;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;

/* JADX INFO: renamed from: X.0yQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857280yQo {
    public static final boolean LIZ(TakoCardAbility takoCardAbility) {
        if (takoCardAbility == null) {
            return C426750GoL.LIZLLL(C1857750yRZ.LIZ);
        }
        if (takoCardAbility.rA0() == null) {
            return C426750GoL.LIZLLL(C1857750yRZ.LIZ);
        }
        return LIZIZ(takoCardAbility.Yy1());
    }

    public static final boolean LIZIZ(Message message) {
        String str;
        if (message == null) {
            return C426750GoL.LIZLLL(C1857750yRZ.LIZ);
        }
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ != null && (str = takoMixFeedLJIIIZ.text) != null && str.length() != 0) {
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 52) {
                return C426750GoL.LIZLLL(C1857750yRZ.LIZ);
            }
            return BidiFormatter.getInstance().isRtl(str);
        }
        return C426750GoL.LIZLLL(C1857750yRZ.LIZ);
    }

    public static final void LIZJ(View view, boolean z) {
        if (view != null) {
            view.setLayoutDirection(z ? 1 : 0);
        }
    }
}
