package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* JADX INFO: renamed from: X.0NES, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NES {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        String portrait;
        Integer numValueOf;
        if (!((Boolean) C1856707Oz.LIZJ.getValue()).booleanValue()) {
            return false;
        }
        int iIntValue = ((Number) C261860AOa.LIZ.getValue()).intValue();
        return C1ES5.LIZ() || iIntValue < 0 || (portrait = C0NEL.LIZ.LIZ.getPortrait("livesdk_live_play_label")) == null || (numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(portrait))) == null || numValueOf.intValue() <= iIntValue;
    }
}
