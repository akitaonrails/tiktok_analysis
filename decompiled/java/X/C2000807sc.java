package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000807sc {
    public static final int[] LIZ = {12, 64};

    public static final Pair<Integer, Integer> LIZ() {
        int[] iArr = LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            int[] iArr2 = (int[]) SettingsManager.LJII("text_sticker_font_size_slider_value_range", int[].class);
            if (iArr2 != null) {
                iArr = iArr2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new Pair<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }
}
