package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxCSCardStruct;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PU8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PU8 {
    public static final C0PU8 LIZ = new C0PU8();
    public static final LynxCSCardStruct LIZIZ = new LynxCSCardStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(221));

    public static final boolean LIZ() {
        LIZ.getClass();
        return LIZLLL().enable && LIZLLL().enableLynxCSPreLayout;
    }

    public static LynxCSCardStruct LIZLLL() {
        return (LynxCSCardStruct) LIZJ.getValue();
    }

    public static final boolean LJFF() {
        LIZ.getClass();
        return LIZLLL().enable;
    }

    public static final boolean LIZIZ(String str) {
        LIZ.getClass();
        if (LIZLLL().enable && LIZLLL().enableLynxCSPreLayout) {
            if (Intrinsics.LJFF(str, LIZLLL().schemaNormal) || Intrinsics.LJFF(str, LIZLLL().schemaAutoPlay)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final String LIZJ(String str) {
        boolean zLIZ;
        EnumC1999307sN enumC1999307sN = EnumC1999307sN.CLICK;
        if (!Intrinsics.LJFF(str, enumC1999307sN.getValue()) ? !Intrinsics.LJFF(str, EnumC1999307sN.AUTO_PLAY.getValue()) || !C1822907Bz.LIZ() : !C1822907Bz.LIZIZ()) {
            LIZ.getClass();
            return LIZLLL().schemaNormal;
        }
        if (Intrinsics.LJFF(str, enumC1999307sN.getValue())) {
            zLIZ = C1822907Bz.LIZIZ();
        } else {
            if (Intrinsics.LJFF(str, EnumC1999307sN.AUTO_PLAY.getValue())) {
                zLIZ = C1822907Bz.LIZ();
            }
            LIZ.getClass();
            return LIZLLL().schemaNormal;
        }
        if (zLIZ) {
            LIZ.getClass();
            return LIZLLL().schemaAutoPlay;
        }
        LIZ.getClass();
        return LIZLLL().schemaNormal;
    }

    public static final boolean LJ(String str) {
        LIZ.getClass();
        if (LIZLLL().enable && LIZLLL().lynxCSPreLayoutOnce) {
            if (Intrinsics.LJFF(str, LIZLLL().schemaNormal) || Intrinsics.LJFF(str, LIZLLL().schemaAutoPlay)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
