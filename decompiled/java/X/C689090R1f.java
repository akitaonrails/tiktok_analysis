package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0R1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689090R1f {
    public static final C689090R1f LIZ = new C689090R1f();
    public static final InterfaceC1493505sz LIZIZ = C0I0B.LJFF.LIZIZ();
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public static final boolean LIZLLL;
    public static long LJ;
    public static long LJFF;

    static {
        LIZLLL = System.currentTimeMillis() % ((long) 100) < 10;
    }

    public final synchronized void LIZ(int i, int i2, int i3, String str, boolean z) {
        long jAbs;
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LJ;
        if (j == 0) {
            jAbs = -1;
        } else {
            jAbs = Math.abs(jCurrentTimeMillis - j);
        }
        LJ = jCurrentTimeMillis;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("status_code", String.valueOf(i3));
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("err_msg", str);
        pairArr[2] = new Pair("size", String.valueOf(i));
        pairArr[3] = new Pair("fetch_interval", String.valueOf(jAbs));
        pairArr[4] = new Pair("retry_times", String.valueOf(i2));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("is_success", str2);
        LIZIZ.sendEvent("activity_status_fetch", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final synchronized void LIZIZ(int i, int i2, String str, String str2, boolean z) {
        long jAbs;
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LJFF;
        if (j == 0) {
            jAbs = -1;
        } else {
            jAbs = Math.abs(jCurrentTimeMillis - j);
        }
        LJFF = jCurrentTimeMillis;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("status_code", String.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("err_msg", str2);
        pairArr[2] = new Pair("report_interval", String.valueOf(jAbs));
        pairArr[3] = new Pair(Scene.SCENE_SERVICE, str);
        pairArr[4] = new Pair("retry_times", String.valueOf(i));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("is_success", str3);
        LIZIZ.sendEvent("activity_status_report", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
