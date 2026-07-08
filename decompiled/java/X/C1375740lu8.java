package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375740lu8 {
    public static final C1375740lu8 LIZ = new C1375740lu8();

    public static boolean LIZ(Context context, Aweme aweme, String str) {
        String string;
        if (C1376270luz.LIZIZ()) {
            if (aweme == null) {
                return false;
            }
            if (C294850Bh5.LIZ()) {
                string = context.getString(2131825049);
            } else if (C1375730lu7.LIZIZ.LIZJ()) {
                string = context.getString(2131858047);
            } else {
                C1376270luz.LIZ.getClass();
                if (C1376270luz.LIZ() && !Intrinsics.LJFF(str, "download_to_share")) {
                    string = context.getString(2131834560);
                } else {
                    string = context.getString(2131834559);
                }
            }
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
            return false;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!C2354709Kn.LJIIZILJ()) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZIZ(2131847054);
                    c1233040iBy.LIZLLL();
                } else {
                    if (C2354709Kn.LJIILL() >= 20971520) {
                        return true;
                    }
                    C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                    c1233040iBy2.LIZIZ(2131847055);
                    c1233040iBy2.LIZLLL();
                }
                C1382530m55.LIZIZ(EnumC1381780m3s.SDCARD, aweme);
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C299060Bns.LIZ()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                c1389880mGw.LJIIIIZZ(2131837962);
                c1389880mGw.LJIIJ();
            }
        } else {
            C1233040iBy c1233040iBy3 = new C1233040iBy(context);
            c1233040iBy3.LIZIZ(2131837962);
            c1233040iBy3.LIZLLL();
        }
        C1382530m55.LIZIZ(EnumC1381780m3s.NETWORK, aweme);
        return false;
    }
}
