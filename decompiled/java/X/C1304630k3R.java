package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAssertSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustMonitorConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0k3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304630k3R {
    public static final String LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;

    public static void LJFF() {
        if (Intrinsics.LJFF(C969310bKb.LIZLLL.LIZIZ, Looper.myLooper())) {
            return;
        }
        LIZ(100002, "", "");
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.RUST.getValue());
        sbLIZ.append('_');
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
        LIZJ = LinkMicAssertSetting.INSTANCE.enable();
    }

    public static final void LIZIZ(Throwable th) {
        String str = "";
        if (th != null) {
            String strLJI = LJI("CrossLinker");
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            C1AZW.LJFF(strLJI, str, null, null);
            throw new AssertionError(th);
        }
        if (LinkMicRustMonitorConfigSetting.INSTANCE.canReport()) {
            C1304660k3U.LIZ.LIZIZ(100003, "", new Throwable(), null);
        }
    }

    public static final String LJI(String str) {
        if ((!a0.LJJJIL(str)) && !Intrinsics.LJFF(str, "-")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ);
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return LIZ;
    }

    public static void LJ(String str, String str2) {
        C1AZW.LJFF(LJI(str2), str, null, null);
    }

    public static final void LIZ(int i, String str, String str2) {
        C1AZW.LJFF(LJI(str2), str, null, null);
        if (LIZIZ && LIZJ) {
            throw new AssertionError(new Throwable(str));
        }
        if (LinkMicRustMonitorConfigSetting.INSTANCE.canReport()) {
            C1304660k3U.LIZ.LIZIZ(i, str, new Throwable(), null);
        }
    }

    public static void LIZLLL(int i, String str, String str2) {
        if ((i & 1) != 0) {
            str2 = "Linker[Biz]";
        }
        C1AZW c1azw = C1AZW.LIZ;
        String strLJI = LJI(str2);
        c1azw.getClass();
        C1AZW.LIZ(strLJI, str, null, null);
    }

    public static void LJII(int i, String str, String str2) {
        if ((i & 1) != 0) {
            str2 = "Linker[Biz]";
        }
        C1AZW.LJIILL(LJI(str2), str, null, null);
    }
}
