package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashSet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1524205xw {
    public static final C1524205xw LIZ = new C1524205xw();
    public static final HashSet<String> LIZIZ = new HashSet<>();

    public static final void LIZ(boolean z, int i, int i2, boolean z2, boolean z3, InterfaceC1493105sv interfaceC1493105sv) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C1212690hf9.LIZ.getClass();
        if (!((Boolean) C1212690hf9.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        Pair[] pairArr = new Pair[8];
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("is_expired", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_expiry_time_valid", obj2);
        if (z3) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("hit_times_limit", obj3);
        pairArr[3] = new Pair("ntp_ts", String.valueOf(i2));
        pairArr[4] = new Pair("local_ts", String.valueOf(i));
        long j = i2;
        if (1672502400 <= j && j < 10000000000L) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("ntp_invalid", obj4);
        long j2 = i;
        if (1672502400 > j2 || j2 >= 10000000000L) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("local_invalid", str);
        pairArr[7] = new Pair("npt_local_diff", String.valueOf(Math.abs(i - i2)));
        interfaceC1493105sv.sendEvent("im_avatar_expiry", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LIZIZ(C1524205xw c1524205xw, boolean z, String str, String str2, int i, boolean z2, boolean z3, boolean z4) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1524205xw.getClass();
        C1212690hf9.LIZ.getClass();
        if (((Boolean) C1212690hf9.LIZLLL.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1524105xv(str, str2, interfaceC1493505szLIZIZ, i, z2, z, z3, z4, null), 3);
        }
    }
}
