package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.experiment.BigCardUIFixConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.10Ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19228210Ki {
    public static final BigCardUIFixConfig LIZ = new BigCardUIFixConfig(0, C1697810uHb.LJIIJJI("6692683186809359108", "7114694728502740994"), 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3123));

    public static boolean LIZJ() {
        return ((BigCardUIFixConfig) LIZIZ.getValue()).enable != 0;
    }

    public static EnumC19227710Kd LIZ(Context context) {
        int iLIZIZ = C1389340mG4.LIZJ(context, null).LIZIZ();
        C1389340mG4.LIZJ(context, null).LIZ();
        if (iLIZIZ <= 365) {
            return EnumC19227710Kd.NARROW;
        }
        if (iLIZIZ <= 700) {
            return EnumC19227710Kd.NORMAL;
        }
        return EnumC19227710Kd.WIDE;
    }

    public static int LIZIZ(Context context) {
        int i = C19227810Ke.LIZ[LIZ(context).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(478));
                }
                throw new C1954807lC();
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(421));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(398.5f)));
    }
}
