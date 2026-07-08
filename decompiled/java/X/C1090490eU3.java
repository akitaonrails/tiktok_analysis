package X;

import android.view.View;
import com.bytedance.android.livesdkapi.host.IHostConfig;

/* JADX INFO: renamed from: X.0eU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090490eU3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(float f, float f2, View view) {
        float fLIZIZ;
        IHostConfig iHostConfig;
        float f3 = 1;
        if (C011Z.LIZ.LJFF() != null && (iHostConfig = (IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)) != null) {
            fLIZIZ = iHostConfig.i32().LIZIZ();
        } else {
            fLIZIZ = 1.0f;
        }
        float f4 = f3 / fLIZIZ;
        C786410Ut5.Ob(view, f4);
        C786410Ut5.pc(view, f4);
        float f5 = f4 - f3;
        float f6 = 2;
        float f7 = (f * f5) / f6;
        C500260Jjc.LJLI((int) C497740JfY.LIZIZ(f7), view);
        C500260Jjc.LJLJJI((int) C497740JfY.LIZIZ(f7), view);
        float f8 = (f2 * f5) / f6;
        C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(f8), view);
        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(f8), view);
    }
}
