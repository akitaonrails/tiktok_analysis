package X;

import Y.ARunnableS86S0000000_7;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ItY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480940ItY {
    public static final C480940ItY LIZ = new C480940ItY();
    public static final ConcurrentHashMap<Long, C480490Isp> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Long> LIZJ = new ConcurrentHashMap<>();
    public static final BPEAHandler LIZLLL;

    static {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        LIZLLL = bPEAHandler;
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, bPEAHandler, new ARunnableS86S0000000_7(0));
    }

    public static Long LIZ(Long l) {
        if (l != null) {
            Long l2 = LIZJ.get(Long.valueOf(l.longValue()));
            if (l2 != null) {
                return Long.valueOf(System.currentTimeMillis() - l2.longValue());
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ItA, java.lang.Object] */
    public static void LIZIZ(Long l, C480930ItX c480930ItX) {
        long jLongValue;
        if (l != null) {
            C480490Isp c480490Isp = LIZIZ.get(Long.valueOf(l.longValue()));
            if (c480490Isp != null) {
                int i = C480950ItZ.LIZ[c480930ItX.LJIIJJI.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (c480490Isp.LLILZ.compareAndSet(false, true)) {
                                    c480490Isp.LL.LJIILIIL(true);
                                    String str = c480930ItX.LIZ;
                                    if (str != null) {
                                        c480490Isp.LL.LJJIJIL(c480930ItX.LJIILIIL, str);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw new C1954807lC();
                        }
                        final String str2 = c480930ItX.LIZ;
                        final String str3 = c480930ItX.LIZIZ;
                        final boolean z = c480930ItX.LJI;
                        final Long l2 = c480930ItX.LJ;
                        final String str4 = c480930ItX.LJFF;
                        final String str5 = c480930ItX.LJIIZILJ;
                        ?? r5 = new Object(l2, str2, str3, str4, str5, z) { // from class: X.0ItA
                            public final String LIZ;
                            public final String LIZIZ;
                            public final boolean LIZJ;
                            public final Long LIZLLL;
                            public final String LJ;
                            public final String LJFF;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C480700ItA)) {
                                    return false;
                                }
                                C480700ItA c480700ItA = (C480700ItA) obj;
                                return Intrinsics.LJFF(this.LIZ, c480700ItA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c480700ItA.LIZIZ) && this.LIZJ == c480700ItA.LIZJ && Intrinsics.LJFF(this.LIZLLL, c480700ItA.LIZLLL) && Intrinsics.LJFF(this.LJ, c480700ItA.LJ) && Intrinsics.LJFF(this.LJFF, c480700ItA.LJFF);
                            }

                            public final int hashCode() {
                                String str6 = this.LIZ;
                                int iHashCode = (str6 == null ? 0 : str6.hashCode()) * 31;
                                String str7 = this.LIZIZ;
                                int iHashCode2 = (((iHashCode + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
                                Long l3 = this.LIZLLL;
                                int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
                                String str8 = this.LJ;
                                int iHashCode4 = (iHashCode3 + (str8 == null ? 0 : str8.hashCode())) * 31;
                                String str9 = this.LJFF;
                                return iHashCode4 + (str9 != null ? str9.hashCode() : 0);
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("PrepareKey(streamData=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(", defaultResolution=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", canPlayWithSoftDecoder=");
                                sbLIZ.append(this.LIZJ);
                                sbLIZ.append(", roomId=");
                                sbLIZ.append(this.LIZLLL);
                                sbLIZ.append(", sessionId=");
                                sbLIZ.append(this.LJ);
                                sbLIZ.append(", logId=");
                                sbLIZ.append(this.LJFF);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            {
                                this.LIZ = str2;
                                this.LIZIZ = str3;
                                this.LIZJ = z;
                                this.LIZLLL = l2;
                                this.LJ = str4;
                                this.LJFF = str5;
                            }
                        };
                        if (Intrinsics.LJFF(r5, c480490Isp.LLILZIL)) {
                            return;
                        }
                        c480490Isp.LLILZIL = r5;
                        c480490Isp.LL.LJIILIIL(true);
                        InterfaceC480510Isr interfaceC480510Isr = c480490Isp.LL;
                        String str6 = c480930ItX.LIZ;
                        String str7 = c480930ItX.LIZIZ;
                        boolean z2 = c480930ItX.LJI;
                        String str8 = c480930ItX.LJFF;
                        String str9 = "";
                        if (str8 == null) {
                            str8 = "";
                        }
                        Long l3 = c480930ItX.LJ;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Long lValueOf = Long.valueOf(jLongValue);
                        String str10 = c480930ItX.LJIIZILJ;
                        if (str10 != null) {
                            str9 = str10;
                        }
                        interfaceC480510Isr.LJIJJ(str6, str7, z2, new C0IMA(str8, lValueOf, false, str9));
                        return;
                    }
                    return;
                }
                if (!c480490Isp.LLILLJJLI.compareAndSet(false, true)) {
                    return;
                }
                Long l4 = c480930ItX.LJ;
                if (l4 != null) {
                    c480490Isp.LL.LJJIJIIJIL(String.valueOf(l4.longValue()), c480930ItX.LJIJ);
                }
                c480490Isp.LL.LJIILIIL(true);
                if (!c480930ItX.LJIIL) {
                    return;
                }
                String playerTag = c480930ItX.LJIIJ;
                if (playerTag == null) {
                    playerTag = c480490Isp.getPlayerTag();
                }
                c480490Isp.LL.t0(playerTag, "prewarm_precreate", true);
            }
        }
    }

    public static void LIZJ(Long l, String str) {
        Long lLIZ = LIZ(l);
        if (l != null) {
            long jLongValue = l.longValue();
            LIZJ.remove(Long.valueOf(jLongValue));
            ConcurrentHashMap<Long, C480490Isp> concurrentHashMap = LIZIZ;
            C480490Isp c480490IspRemove = concurrentHashMap.remove(Long.valueOf(jLongValue));
            if (c480490IspRemove != null) {
                C1AC7 c1ac7 = C1AC7.LIZ;
                Pair[] pairArr = {new Pair("roomId", l), new Pair("reason", str), new Pair("ageMs", lLIZ), new Pair("cacheSize", Integer.valueOf(concurrentHashMap.size())), new Pair("maxAgeMs", Long.valueOf(C1AD3.LIZIZ()))};
                c1ac7.getClass();
                C1AC7.LJIILL("eta_cache_release", pairArr);
                c480490IspRemove.LLILLJJLI.set(false);
                c480490IspRemove.LLILLL.set(false);
                c480490IspRemove.LLILZ.set(false);
                c480490IspRemove.LLILZIL = null;
                String playerTag = c480490IspRemove.getPlayerTag();
                try {
                    c480490IspRemove.t0(playerTag, str, true);
                    c480490IspRemove.stop(playerTag);
                    c480490IspRemove.LJIJ(playerTag);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }
}
