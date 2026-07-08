package X;

import com.bytedance.i18n.region.RegionManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS297S0000000_13;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0wtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798060wtI {
    public static RegionManager LIZJ;
    public static C1798100wtM LIZLLL;
    public static C818120W7m LJII;
    public static final C1798060wtI LIZ = new C1798060wtI();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final List<C0XLF> LJ = Collections.synchronizedList(new ArrayList());
    public static final List<InterfaceC1798270wtd> LJFF = Collections.synchronizedList(new ArrayList());
    public static final List<InterfaceC1798070wtJ> LJI = Collections.synchronizedList(new ArrayList());
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    public static C847070XKv LIZ() {
        RegionManager regionManager = LIZJ;
        if (!LIZIZ() || regionManager == null) {
            return C847070XKv.LIZJ;
        }
        C847070XKv c847070XKv = (C847070XKv) ((LinkedHashMap) regionManager.LJI).get("store_region");
        if (c847070XKv == null || c847070XKv.LIZ.length() <= 0) {
            C185100nR c185100nR = C185100nR.LIZ;
            C185100nR.LJI(-2, "None");
            return c847070XKv;
        }
        C185100nR c185100nR2 = C185100nR.LIZ;
        C185100nR.LJI(0, "Success");
        return c847070XKv;
    }

    public static boolean LIZIZ() {
        return LIZIZ.get();
    }

    public static void LIZJ() {
        LJIIIIZZ.set(true);
        if (LIZIZ()) {
            LJFF(EnumC1798030wtF.FOREGROUND, null);
            C1797880wt0 c1797880wt0 = C1797750wsn.LIZJ;
            if (c1797880wt0 != null) {
                C421590Gg1.LIZ(new AwS571S0100000_27(c1797880wt0, 1406));
            }
        }
    }

    public static void LIZLLL() {
        RegionManager regionManager = LIZJ;
        if (regionManager == null) {
            return;
        }
        List<C0XLF> list = LJ;
        if (!list.isEmpty()) {
            synchronized (list) {
                try {
                    Iterator<C0XLF> it2 = list.iterator();
                    while (it2.hasNext()) {
                        regionManager.LIZIZ.add(it2.next());
                    }
                    LJ.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        List<InterfaceC1798270wtd> list2 = LJFF;
        if (!list2.isEmpty()) {
            synchronized (list2) {
                try {
                    Iterator<InterfaceC1798270wtd> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        regionManager.LIZJ.add(it3.next());
                    }
                    LJFF.clear();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        List<InterfaceC1798070wtJ> list3 = LJI;
        if (!list3.isEmpty()) {
            synchronized (list3) {
                try {
                    Iterator<InterfaceC1798070wtJ> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        regionManager.LJIIIIZZ(it4.next());
                    }
                    LJI.clear();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
    }

    public static void LJ(C0XLF c0xlf) {
        RegionManager regionManager = LIZJ;
        if (LIZIZ() && regionManager != null) {
            regionManager.LIZIZ.add(c0xlf);
        } else {
            LJ.add(c0xlf);
        }
    }

    public static void LJFF(final EnumC1798030wtF enumC1798030wtF, final AFwS297S0000000_13 aFwS297S0000000_13) {
        C786410Ut5.LJLIIL(0L, C404501hj.LIZ, new Runnable() { // from class: X.0W7f
            /* JADX WARN: Removed duplicated region for block: B:133:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x020f  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x023f A[Catch: all -> 0x0263, TryCatch #1 {all -> 0x0263, blocks: (B:137:0x021a, B:139:0x0224, B:141:0x0228, B:143:0x022e, B:153:0x0258, B:154:0x025c, B:149:0x023f, B:151:0x0246, B:152:0x0249, B:144:0x0233, B:155:0x0260), top: B:209:0x021a }] */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0260 A[Catch: all -> 0x0263, TRY_LEAVE, TryCatch #1 {all -> 0x0263, blocks: (B:137:0x021a, B:139:0x0224, B:141:0x0228, B:143:0x022e, B:153:0x0258, B:154:0x025c, B:149:0x023f, B:151:0x0246, B:152:0x0249, B:144:0x0233, B:155:0x0260), top: B:209:0x021a }] */
            /* JADX WARN: Removed duplicated region for block: B:160:0x0275  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x028e A[LOOP:2: B:163:0x0288->B:165:0x028e, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:168:0x02b2  */
            /* JADX WARN: Removed duplicated region for block: B:171:0x02d8  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x02fe  */
            /* JADX WARN: Removed duplicated region for block: B:181:0x0308  */
            /* JADX WARN: Removed duplicated region for block: B:184:0x0311  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x031a  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x0343  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 876
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC818050W7f.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RegionClient@ca6e.uploadRegionInfoAsyncDelayed$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RegionClient@ca6e.uploadRegionInfoAsyncDelayed$1");
            }
        });
    }
}
