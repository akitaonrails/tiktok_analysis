package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchResultPictureSrExperiment;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657900PrI {
    public static final C657900PrI LIZ = new C657900PrI();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, C644290POx> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicBoolean> LIZLLL = new ConcurrentHashMap<>();
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public static volatile Field LJFF;
    public static volatile Field LJI;
    public static volatile boolean LJII;
    public static volatile boolean LJIIIIZZ;

    public static void LIZIZ(Object obj) {
        C1331670kl3 c1331670kl3;
        C658730Psd c658730Psd;
        if (LIZIZ.get() && (obj instanceof C1331670kl3) && (c1331670kl3 = (C1331670kl3) obj) != null) {
            if (C2030807xS.LIZ()) {
                InterfaceC658750Psf interfaceC658750Psf = c1331670kl3.LJJJIL;
                if (interfaceC658750Psf == null) {
                    c1331670kl3.LJJJIL = new C658730Psd(-1, null, -1, "", false, SearchResultPictureSrExperiment.LIZ(), 0, null, false, 960);
                } else if (!(interfaceC658750Psf instanceof C658730Psd)) {
                    c1331670kl3.LJJJIL = new C658730Psd(-1, null, -1, "", false, SearchResultPictureSrExperiment.LIZ(), 2, interfaceC658750Psf, false, 768);
                }
                InterfaceC658750Psf interfaceC658750Psf2 = c1331670kl3.LJJJIL;
                if ((interfaceC658750Psf2 instanceof C658730Psd) && (c658730Psd = (C658730Psd) interfaceC658750Psf2) != null) {
                    c658730Psd.LLJIJIL = c1331670kl3.LJJIIJ;
                    if (c1331670kl3.LJIIIIZZ > 0 && c1331670kl3.LJIIIZ > 0) {
                        c658730Psd.LLJILJILJ = true;
                    }
                }
            }
            C302920Bu6 c302920Bu6 = C302920Bu6.LIZ;
            Integer num = C302920Bu6.LIZIZ;
            if (num != null) {
                if (num.intValue() == 1) {
                    c1331670kl3.LJJIL = true;
                }
            } else if (!C302920Bu6.LIZJ) {
                synchronized (c302920Bu6) {
                    try {
                        if (!C302920Bu6.LIZJ) {
                            C302920Bu6.LIZJ = true;
                            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Bu5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("SearchEnableResizedImageDiskCache@13d6.loadValueAsync$2");
                                    int iLJIJ = 0;
                                    try {
                                        try {
                                            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_enable_resized_image_disk_cache", true);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        C302920Bu6.LIZIZ = Integer.valueOf(iLJIJ);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("SearchEnableResizedImageDiskCache@13d6.loadValueAsync$2");
                                }
                            });
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            if (C2040307yz.LIZ.LIZ()) {
                c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3.LJJJJJ = "search_cache";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C1331510kkn r12) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C657900PrI.LIZJ(X.0kkn):void");
    }

    public final void LIZ(C1331510kkn c1331510kkn, int i, int i2) {
        Object obj;
        Object obj2;
        Pair pair;
        Object c098200Yq;
        if (i > 0 && i2 > 0) {
            if (LJII) {
                Field field = LJFF;
                Field field2 = LJI;
                if (field != null && field2 != null) {
                    pair = new Pair(field, field2);
                } else {
                    return;
                }
            } else {
                synchronized (this) {
                    try {
                        if (LJII) {
                            Field field3 = LJFF;
                            Field field4 = LJI;
                            if (field3 != null && field4 != null) {
                                pair = new Pair(field3, field4);
                            } else {
                                return;
                            }
                        } else {
                            try {
                                Field declaredField = C1331510kkn.class.getDeclaredField("LJIIIZ");
                                declaredField.setAccessible(true);
                                C189200o6.m2constructorimpl(declaredField);
                                obj = declaredField;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C098200Yq c098200Yq2 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq2);
                                obj = c098200Yq2;
                            }
                            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                            Object obj3 = obj;
                            if (zM7isFailureimpl) {
                                obj3 = null;
                            }
                            Field field5 = (Field) obj3;
                            try {
                                Field declaredField2 = C1331510kkn.class.getDeclaredField("LJIIJ");
                                declaredField2.setAccessible(true);
                                C189200o6.m2constructorimpl(declaredField2);
                                obj2 = declaredField2;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C098200Yq c098200Yq3 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq3);
                                obj2 = c098200Yq3;
                            }
                            boolean zM7isFailureimpl2 = C189200o6.m7isFailureimpl(obj2);
                            Object obj4 = obj2;
                            if (zM7isFailureimpl2) {
                                obj4 = null;
                            }
                            Field field6 = (Field) obj4;
                            if (field5 != null && field6 != null) {
                                LJFF = field5;
                                LJI = field6;
                                LJII = true;
                                pair = new Pair(field5, field6);
                            } else {
                                if (!LJIIIIZZ) {
                                    LJIIIIZZ = true;
                                }
                                LJFF = null;
                                LJI = null;
                                LJII = true;
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        throw th3;
                    }
                }
            }
            try {
                ((Field) pair.getFirst()).setInt(c1331510kkn, i);
                ((Field) pair.getSecond()).setInt(c1331510kkn, i2);
                c098200Yq = Boolean.TRUE;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            ((Boolean) c098200Yq).booleanValue();
        }
    }
}
