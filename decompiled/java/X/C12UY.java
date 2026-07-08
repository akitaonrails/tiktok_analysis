package X;

import android.content.Context;
import android.os.Vibrator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.zhiliaoapp.musically.R;
import pyl.s;

/* JADX INFO: renamed from: X.12UY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UY {
    public static final int LIZ = (int) C12ES.LIZJ(60.0f, C2219091BtD.LIZ());
    public static final int LIZIZ = (int) C12ES.LIZJ(30.0f, C2219091BtD.LIZ());
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;

    static {
        C12ES.LIZJ(64.0f, C2219091BtD.LIZ());
        LIZJ = (int) C12ES.LIZJ(C12VA.LIZ().LJIIJ.invoke().booleanValue() ? 16 : 12, C2219091BtD.LIZ());
        LIZLLL = (int) C12ES.LIZJ(4.0f, C2219091BtD.LIZ());
        C12ES.LIZJ(5.0f, C2219091BtD.LIZ());
        LJ = C2219091BtD.LIZ().getResources().getDimensionPixelSize(R.dimen.b3l);
        LJFF = (int) C12ES.LIZJ(20.0f, C2219091BtD.LIZ());
    }

    public static s LIZIZ(float f) {
        s sVar = s.EPIC;
        if (f == sVar.value()) {
            return sVar;
        }
        s sVar2 = s.SLOW;
        if (f == sVar2.value()) {
            return sVar2;
        }
        s sVar3 = s.NORMAL;
        if (f == sVar3.value()) {
            return sVar3;
        }
        s sVar4 = s.FAST;
        if (f == sVar4.value()) {
            return sVar4;
        }
        s sVar5 = s.LAPSE;
        if (f == sVar5.value()) {
            return sVar5;
        }
        return null;
    }

    public static long LIZJ(long j) {
        if (C12VA.LIZ().LJIIIZ.invoke().booleanValue()) {
            if (j > 300000) {
                return 300000L;
            }
            return j;
        }
        if (!C12VA.LIZ().LJII.invoke().booleanValue() && !C12VA.LIZ().LJIIIZ.invoke().booleanValue()) {
            if (j > 15000) {
                return 15000L;
            }
            return j;
        }
        return Math.min(j, C12VA.LIZ().LJIIIIZZ.invoke().longValue());
    }

    public static void LJ(Context context) {
        Vibrator vibrator = (Vibrator) C786410Ut5.H2(context, "vibrator");
        if (vibrator != null) {
            try {
                vibrator.vibrate(10L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("vibrate exception: ");
                sbLIZ.append(e.getMessage());
                interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZLLL(int i, Context context) {
        Vibrator vibrator = (Vibrator) C786410Ut5.H2(context, "vibrator");
        if (vibrator != null) {
            try {
                vibrator.vibrate(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("vibrate exception: ");
                sbLIZ.append(e.getMessage());
                interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static float LIZ(Context context, C12UV c12uv, float f, VideoSegment videoSegment, int i) {
        if (videoSegment.LIZLLL() - videoSegment.LJII() == videoSegment.duration) {
            return (ScreenUtils.getScreenWidth(context) - i) - LIZJ;
        }
        return f + LIZJ + ((videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * c12uv.LJ));
    }
}
