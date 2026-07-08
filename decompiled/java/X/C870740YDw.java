package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870740YDw {
    public static final String LIZ = C870740YDw.class.getSimpleName();

    public static String LJI(int i) {
        if (i == 0) {
            return "init";
        }
        if (i == 6) {
            return "token";
        }
        if (i == 2) {
            return "cursor";
        }
        if (i == 3) {
            return "net";
        }
        if (i == 4) {
            return "manual";
        }
        switch (i) {
            case 8:
                return "polling";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "migrate";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "switch_to_foreground";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "no_ws";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "stranger";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "missing_entity";
            default:
                return "other";
        }
    }

    public static ByteString LIZIZ(byte[] bArr) {
        if (bArr == null) {
            return ByteString.EMPTY;
        }
        return ByteString.of(bArr);
    }

    public static InterfaceC865750Xxl LIZLLL(C0YEM c0yem) {
        if (c0yem.LJIIIZ().LJJLIIIIJ.LJIIIZ.enableConvKvCache) {
            return c0yem.LJIIZILJ().LIZLLL().LJ();
        }
        return c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIILJJIL();
    }

    public static int[] LJ(C870830YEf c870830YEf) {
        int[] iArr = c870830YEf.LJIIJJI;
        if (iArr == null) {
            return c870830YEf.LJIIJ;
        }
        return iArr;
    }

    public static boolean LIZJ(C0YEM c0yem, Integer num) {
        if (num == null) {
            return false;
        }
        if (C0YMR.REPORT_CLIENT_METRICS.getValue() == num.intValue() || C0YMR.BROADCAST_RECV_MESSAGE.getValue() == num.intValue()) {
            return true;
        }
        InterfaceC870760YDy interfaceC870760YDyLIZ = c0yem.LJ().getLog().LIZ();
        if (interfaceC870760YDyLIZ == null || !interfaceC870760YDyLIZ.LIZ(num)) {
            return false;
        }
        return true;
    }

    public static long LJFF(C868780Y6i c868780Y6i, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return CastLongProtector.parseLong(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c868780Y6i.LJIIIZ(LIZ, e);
            return 0L;
        }
    }

    public static boolean LJII(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String strValueOf = String.valueOf(str);
        for (String str3 : str2.split(",")) {
            if (str3 != null && (str3.equals(strValueOf) || str3.equals(CardStruct.IStatusCode.DEFAULT))) {
                return true;
            }
        }
        return false;
    }

    public static String LJIIIIZZ(String str, List list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(ListProtector.get(list, i));
                if (i < list.size() - 1) {
                    sb.append(str);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static Request LIZ(C0YEM c0yem, int i, int i2, RequestBody requestBody, String str) {
        return C0YLX.LIZ(i, i2, requestBody, c0yem.LJ(), c0yem.LJIIIZ(), str);
    }
}
