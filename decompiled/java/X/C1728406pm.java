package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1728406pm {
    public static final C1728406pm LIZ = new C1728406pm();
    public static String LIZIZ = C0XQ7.LJFF().getCurUserId();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1417));

    public static long LIZ() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static ConcurrentMap LIZIZ() {
        return (ConcurrentMap) LIZJ.getValue();
    }

    public static Pair LIZJ(int i, Context context, Long l, String str, String str2) {
        C20171713wJ c20171713wJLIZLLL;
        if (!Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), LIZIZ)) {
            LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            for (Map.Entry entry : LIZIZ().entrySet()) {
                entry.getKey();
                ((InterfaceC1728106pj) entry.getValue()).cancel(false);
            }
            LIZIZ().clear();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(l);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Object obj = LIZIZ().get(strLIZIZ);
        if (obj != null) {
            return new Pair(Boolean.FALSE, obj);
        }
        IStorySocialEventStickerService iStorySocialEventStickerService = (IStorySocialEventStickerService) PluggableExtentionKt.pluggableSpi$default(IStorySocialEventStickerService.class, false, false, false, 14, null);
        if (iStorySocialEventStickerService != null) {
            c20171713wJLIZLLL = iStorySocialEventStickerService.LIZLLL(i, context);
        } else {
            c20171713wJLIZLLL = null;
        }
        LIZIZ().put(strLIZIZ, c20171713wJLIZLLL);
        return new Pair(Boolean.TRUE, c20171713wJLIZLLL);
    }
}
