package X;

import com.ss.ugc.live.sdk.message.data.PayloadItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221891Bxj {
    public static final /* synthetic */ int LIZ = 0;

    public static final long LIZ(PayloadItem payloadItem) {
        List<C2221941Bxo> headers;
        C2221941Bxo next;
        String str;
        Long lLJIILIIL;
        if (payloadItem != null && (headers = payloadItem.getHeaders()) != null) {
            Iterator<C2221941Bxo> it2 = headers.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, "enter_uniq_id")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C2221941Bxo c2221941Bxo = next;
            if (c2221941Bxo != null && (str = c2221941Bxo.LIZIZ) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                return lLJIILIIL.longValue();
            }
            return 0L;
        }
        return 0L;
    }

    public static final String LIZIZ(PayloadItem payloadItem) {
        List<C2221941Bxo> headers;
        C2221941Bxo next;
        if (payloadItem == null || (headers = payloadItem.getHeaders()) == null) {
            return null;
        }
        Iterator<C2221941Bxo> it2 = headers.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, "im_cursor")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C2221941Bxo c2221941Bxo = next;
        if (c2221941Bxo == null) {
            return null;
        }
        return c2221941Bxo.LIZIZ;
    }

    public static final long LIZJ(PayloadItem payloadItem) {
        List<C2221941Bxo> headers;
        C2221941Bxo next;
        String str;
        Long lLJIILIIL;
        if (payloadItem != null && (headers = payloadItem.getHeaders()) != null) {
            Iterator<C2221941Bxo> it2 = headers.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, "room_id")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C2221941Bxo c2221941Bxo = next;
            if (c2221941Bxo != null && (str = c2221941Bxo.LIZIZ) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                return lLJIILIIL.longValue();
            }
            return 0L;
        }
        return 0L;
    }
}
