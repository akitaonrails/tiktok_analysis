package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadConfigModel;
import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ksd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336370ksd {
    public static final C1336370ksd LIZ = new C1336370ksd();
    public static final ExecutorService LIZIZ;

    static {
        new ConcurrentLinkedQueue();
        LIZIZ = C786410Ut5.h4();
    }

    public static Pair LIZJ(String str) {
        MatchResult matchResultMatchEntire;
        if (str != null && (matchResultMatchEntire = new Regex("^(\\d+)~(\\d+)$").matchEntire(str)) != null) {
            try {
                return new Pair(Integer.valueOf(CastIntegerProtector.parseInt(matchResultMatchEntire.LIZ().get(1))), Integer.valueOf(CastIntegerProtector.parseInt(matchResultMatchEntire.LIZ().get(2))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public final void LJFF(C1202730hP5 c1202730hP5) {
        List<String> list = c1202730hP5.LIZ;
        if (list != null && !list.isEmpty()) {
            LIZ(this, c1202730hP5.LIZ, new C1336380kse(1), "", 0, new LsResourcePreloadItemModel(null, c1202730hP5.LIZIZ, c1202730hP5.LIZJ), null, 48);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.image.exp.LsResourcePreloadConfigModel LIZIZ(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1336370ksd.LIZIZ(java.lang.String, java.lang.String):com.ss.android.ugc.aweme.image.exp.LsResourcePreloadConfigModel");
    }

    public static void LIZLLL(LsResourcePreloadConfigModel lsResourcePreloadConfigModel, Map map, String str, String str2) {
        List<LsResourcePreloadItemModel> list = lsResourcePreloadConfigModel.images;
        if (list != null) {
            for (LsResourcePreloadItemModel lsResourcePreloadItemModel : list) {
                ArrayList arrayList = new ArrayList();
                String str3 = lsResourcePreloadItemModel.path;
                if (str3 == null) {
                    str3 = "";
                }
                ArrayList arrayList2 = new ArrayList(a0.LJJLIIIJILLIZJL(str3, new String[]{"/"}, 0, 6));
                C1336370ksd c1336370ksd = LIZ;
                ArrayList arrayList3 = new ArrayList();
                LJ(map, 0, arrayList2, arrayList3);
                if (!arrayList3.isEmpty()) {
                    C1186030gy9.LIZ(new AwS421S0200000_20(lsResourcePreloadItemModel, (LsResourcePreloadItemModel) arrayList3, (List<String>) 7));
                    arrayList.addAll(arrayList3);
                }
                if (!arrayList.isEmpty()) {
                    LIZ(c1336370ksd, arrayList, new C1336380kse(lsResourcePreloadConfigModel.concurrentNum), str, C1175120ggY.LIZJ(lsResourcePreloadConfigModel.strategy), lsResourcePreloadItemModel, str2, 32);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.Object r8, int r9, java.util.List r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1336370ksd.LJ(java.lang.Object, int, java.util.List, java.util.List):void");
    }

    public static void LIZ(C1336370ksd c1336370ksd, List list, C1336380kse c1336380kse, String str, int i, LsResourcePreloadItemModel lsResourcePreloadItemModel, String str2, int i2) {
        EnumC1331380kka enumC1331380kka;
        String str3 = str2;
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            enumC1331380kka = EnumC1331380kka.LOW;
        } else {
            enumC1331380kka = null;
        }
        c1336370ksd.getClass();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            Uri uri = UriProtector.parse(str4);
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL.LJIIL = enumC1331380kka;
            C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            if (c1325540kbALIZ.LIZLLL.get(c1325540kbALIZ.LJIIJJI.LIZIZ(c1325710kbRLIZ, null)) != null) {
                C1186030gy9.LIZ(new AwS550S0100000_6(uri, 1124));
            } else {
                c1336380kse.LIZ.add(new C1336350ksb(i, c1325710kbRLIZ, str4, str, lsResourcePreloadItemModel, str3));
                c1336380kse.LIZ();
            }
        }
    }
}
