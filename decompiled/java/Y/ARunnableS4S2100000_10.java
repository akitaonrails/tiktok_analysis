package Y;

import X.C098200Yq;
import X.C0QB7;
import X.C1110304Vx;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C647350PaH;
import X.C647420PaO;
import X.C647500PaW;
import android.text.Layout;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ICommonLogger;
import com.ss.android.ugc.aweme.search.lynx.core.config.LynxCardsCacheConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS4S2100000_10 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            Keva keva = C647350PaH.LIZ;
            int iCount = keva.count();
            C647420PaO.LIZ.getClass();
            if (iCount >= ((LynxCardsCacheConfig) C647420PaO.LIZJ.getValue()).maxCacheSize) {
                keva.clear();
            }
            C647500PaW c647500PaW = C647500PaW.LIZ;
            String str = this.s0;
            Map map = (Map) ((Function0) this.l2).invoke();
            c647500PaW.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C647500PaW.LIZLLL(str, map));
            C647350PaH.LIZLLL(C1697810uHb.LJIIJJI("hitPreload", "lynxRealLoadUpdateTime", "isPreload", "isReload", "lynxBindTime", "logPb", "isRealRender"), linkedHashMap);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.s1);
            sbLIZ.append("__search_lynx_jsonstring_separator__");
            sbLIZ.append(C1741890vQh.LJIIIIZZ(linkedHashMap));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str2 = this.s0;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("search_lynx_cards_rawdata_commondata");
            c647500PaW.getClass();
            sbLIZ2.append(C647500PaW.LJIIJ(str2, false));
            keva.storeStringJustDisk(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$1() {
        Object c098200Yq;
        C0QB7 c0qb7 = (C0QB7) this.l2;
        String strLIZIZ = this.s0;
        String str = this.s1;
        try {
            int lineCount = c0qb7.getTvDesc().getLineCount();
            ICommonLogger iCommonLoggerLIZ = C1110304Vx.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lineCount = ");
            sbLIZ.append(lineCount);
            C2188811AlT.LIZIZ(sbLIZ);
            iCommonLoggerLIZ.d();
            if (lineCount <= 0) {
                return;
            }
            Layout layout = c0qb7.getTvDesc().getLayout();
            int ellipsisCount = layout != null ? layout.getEllipsisCount(lineCount - 1) : 0;
            ICommonLogger iCommonLoggerLIZ2 = C1110304Vx.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ellipsizeCount = ");
            sbLIZ2.append(ellipsisCount);
            C2188811AlT.LIZIZ(sbLIZ2);
            iCommonLoggerLIZ2.d();
            if (ellipsisCount <= 0) {
                return;
            }
            int length = strLIZIZ.length();
            int length2 = str.length();
            ICommonLogger iCommonLoggerLIZ3 = C1110304Vx.LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("firstNameLength = ");
            sbLIZ3.append(length);
            sbLIZ3.append(" and secondNameLength = ");
            sbLIZ3.append(length2);
            C2188811AlT.LIZIZ(sbLIZ3);
            iCommonLoggerLIZ3.d();
            if (ellipsisCount >= length + length2 + 6) {
                return;
            }
            int i = ellipsisCount + 3;
            String strLIZIZ2 = "...";
            if (length2 > i) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str.substring(0, (length2 - ellipsisCount) - 3));
                sbLIZ4.append("...");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                if ((length2 == i ? 0 : (ellipsisCount - length2) + 3) > 0) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ.substring(0, (length - ellipsisCount) - 3));
                    sbLIZ5.append("...");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                }
            }
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(c0qb7.LLIZ, "{0}", strLIZIZ, false), "{1}", strLIZIZ2, false);
            ICommonLogger iCommonLoggerLIZ4 = C1110304Vx.LIZ();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("summary:\n replaceNickNameA    = ");
            sbLIZ6.append(strLIZIZ);
            sbLIZ6.append("\n replaceNickNameB    = ");
            sbLIZ6.append(strLIZIZ2);
            sbLIZ6.append("\n resultReason2       = ");
            sbLIZ6.append(strLJJIFFI);
            C2188811AlT.LIZIZ(sbLIZ6);
            iCommonLoggerLIZ4.d();
            c0qb7.getTvDesc().setText(strLJJIFFI);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1110304Vx.LIZ().e("TTRecUserMutual", "ellipsize fail", thM5exceptionOrNullimpl);
        }
    }

    public static final void run$0(ARunnableS4S2100000_10 aRunnableS4S2100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchLynxCardsCacheHelper@5f37.updateCardCacheRawDataWithCommonParams$1");
        try {
            aRunnableS4S2100000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchLynxCardsCacheHelper@5f37.updateCardCacheRawDataWithCommonParams$1");
    }

    public static final void run$1(ARunnableS4S2100000_10 aRunnableS4S2100000_10) {
        boolean zLIZ;
        C1C7U.LIZ("MutualRelationView@df00.handleMultiNameEllipsis$1");
        try {
            aRunnableS4S2100000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MutualRelationView@df00.handleMultiNameEllipsis$1");
    }

    public ARunnableS4S2100000_10(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
