package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxPreLayoutWithCardTypeStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Paj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647630Paj {
    public static final C647630Paj LIZ = new C647630Paj();
    public static final LynxPreLayoutWithCardTypeStruct LIZIZ = new LynxPreLayoutWithCardTypeStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(218));

    public static LynxPreLayoutWithCardTypeStruct LJII() {
        return (LynxPreLayoutWithCardTypeStruct) LIZJ.getValue();
    }

    public static boolean LIZ() {
        return LJII().asyncPreLayout;
    }

    public static boolean LIZIZ() {
        return LJII().asyncProcessRenderWhenCallback;
    }

    public static boolean LIZJ() {
        return LJII().enableDoSuccessCallbackWhenLoadFinished;
    }

    public static boolean LIZLLL() {
        return LJII().enableIgnorePredictCards;
    }

    public static boolean LJ() {
        return LJII().enableJSONAweme;
    }

    public static boolean LJFF() {
        return LJII().enablePreSetSessionId;
    }

    public static boolean LJI() {
        return LJII().updateDataWhenPredictChunkReady;
    }

    public static boolean LJIIIZ() {
        return LJII().reusePreTemplateData;
    }

    public static boolean LJIIJ() {
        return LJII().updateDataPreFlush;
    }

    public static boolean LJIIL() {
        return LJII().updateDataWhenChunkReadyInBgThread;
    }

    public static boolean LJIILIIL() {
        return LJII().useCacheData;
    }

    public static final boolean LJIIIIZZ(String str) {
        LIZ.getClass();
        List<String> list = LJII().enableWhiteList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("/template.js");
                if (a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIIJJI(String str) {
        List<String> list = LJII().updateDataWhenChunkReadyBlackList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("/template.js");
                if (a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    return false;
                }
            }
        }
        return LJII().updateDataWhenChunkReady;
    }
}
