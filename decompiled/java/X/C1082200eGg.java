package X;

import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0eGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1082200eGg {
    public final InterfaceC1082220eGi LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public final int LJFF;
    public final int LJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public C1082210eGh LJII;
    public C1082210eGh LJIIIIZZ;

    /* JADX WARN: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b A[PHI: r11
      0x012b: PHI (r11v8 boolean) = (r11v6 boolean), (r11v9 boolean) binds: [B:80:0x0120, B:82:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LIZ(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1082200eGg.LIZ(android.view.MotionEvent):boolean");
    }

    public C1082200eGg(Context context, InterfaceC1082220eGi interfaceC1082220eGi) {
        this.LIZ = interfaceC1082220eGi;
        this.LJFF = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
    }
}
