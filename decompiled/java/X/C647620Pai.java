package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxPreLayoutWhenChunkReadyStruct;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Pai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647620Pai {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1833));

    public static boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        String strLJJLJLI = a0.LJJLJLI(str, "_", str);
        if (((Number) LIZ.getValue()).intValue() != 1) {
            return false;
        }
        C645760PUo.LIZ.getClass();
        if (!C645760PUo.LIZ().predictPreLayoutWhenDataReadyList.contains(strLJJLJLI)) {
            C647630Paj.LIZ.getClass();
            if (!C647630Paj.LJII().enableWhiteList.contains(strLJJLJLI) && !C0BQ5.LIZ()) {
                C647650Pal.LIZ.getClass();
                if (!((LynxPreLayoutWhenChunkReadyStruct) C647650Pal.LIZJ.getValue()).enableWhiteList.contains(strLJJLJLI)) {
                    return false;
                }
            }
        }
        return true;
    }
}
