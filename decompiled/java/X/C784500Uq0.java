package X;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Uq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784500Uq0 {
    public static ColorStateList LIZ(Context context) {
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        int iIntValue2 = 0;
        int[][] iArr = {new int[]{R.attr.state_enabled}, new int[0]};
        int[] iArr2 = new int[2];
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a04, context)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        iArr2[0] = iIntValue;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a1p, context)) != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        iArr2[1] = iIntValue2;
        return new ColorStateList(iArr, iArr2);
    }

    public static boolean LIZIZ(Intent intent) {
        int intExtra = intent.getIntExtra("progress", -1);
        if (intExtra >= 0 && intExtra < 100) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C19EG c19eg) {
        int iIntValue = 0;
        if (c19eg == null) {
            return false;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a04, c19eg);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        c1397580mTM.LJIIIZ = new C340190DVh(c19eg, com.zhiliaoapp.musically.R.raw.icon_3pt_exclamation_mark_circle, Integer.valueOf(iIntValue), 8);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = com.zhiliaoapp.musically.R.raw.icon_3pt_exclamation_mark_circle;
        c419910GdJ.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a04);
        C1235760iGM.LIZIZ(c1397580mTM, c419910GdJ.LIZ(c19eg));
        c1397580mTM.LJI(c19eg.getString(2131857331));
        c1397580mTM.LIZIZ(c19eg.getString(2131857329));
        C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(c19eg, 596));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return true;
    }
}
