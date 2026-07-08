package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.053K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053K implements InterfaceC12997056t {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final EnumC12995056r LIZIZ;
    public final List<C053W> LIZJ;
    public final Gson LIZLLL = C051M.LIZ;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1107));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1106));

    public final C053I<FrequencyMarkRecord> LJII() {
        return (C053I) this.LJFF.getValue();
    }

    @Override // X.InterfaceC12997056t
    public final List<String> LIZ() {
        return LJII().LJ();
    }

    @Override // X.InterfaceC12997056t
    public final void LJI() {
        for (String str : LJII().LJ()) {
            FrequencyMarkRecord second = LJII().getData(str).getSecond();
            if (Intrinsics.LJFF(second.pendingClientOverride, Boolean.TRUE)) {
                FrequencyMarkRecord frequencyMarkRecordLIZ = FrequencyMarkRecord.LIZ(second, Boolean.FALSE);
                if (LJII().LJII(frequencyMarkRecordLIZ)) {
                    LJII().LJFF(frequencyMarkRecordLIZ, str);
                } else {
                    LJII().LJI(str);
                }
            }
        }
    }

    @Override // X.InterfaceC12997056t
    public final void LIZJ(String str) {
        LJII().LJFF(FrequencyMarkRecord.LIZ(FrequencyMarkRecord.LIZ, Boolean.TRUE), str);
    }

    @Override // X.InterfaceC12997056t
    public final FrequencyMarkRecord LJ(String str) {
        Pair<Boolean, FrequencyMarkRecord> data = LJII().getData(str);
        boolean zBooleanValue = data.getFirst().booleanValue();
        FrequencyMarkRecord second = data.getSecond();
        if (!zBooleanValue) {
            return null;
        }
        return second;
    }

    @Override // X.InterfaceC12997056t
    public final boolean LIZIZ(long j, String str) {
        C053S c053n;
        EnumC12927054b enumC12927054b;
        List<C053W> list = this.LIZJ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C053W c053w : list) {
                final AnonymousClass0531 anonymousClass0531 = (AnonymousClass0531) this.LJ.getValue();
                C053Z c053z = c053w.LIZJ;
                long timeInMs = 0;
                if (c053z instanceof C12912053m) {
                    final C12912053m c12912053m = (C12912053m) c053z;
                    c053n = new C053H<C12912053m, InterfaceC12901053b, FrequencyMarkRecord>(c12912053m, anonymousClass0531) { // from class: X.053E
                        public static final Gson LJFF = new Gson();
                        public final C01GW LIZLLL;
                        public final C01GW LJ;

                        @Override // X.C053S
                        public final C053I<FrequencyMarkRecord> LJ() {
                            return (C053I) this.LIZLLL.getValue();
                        }

                        @Override // X.C053H, X.C053S
                        public final void LIZLLL(String str2) {
                            LJ().LJFF(FrequencyMarkRecord.LIZ(FrequencyMarkRecord.LIZ, Boolean.TRUE), str2);
                            ((C053H) this.LJ.getValue()).LIZLLL(str2);
                        }

                        @Override // X.C053S
                        public final void LJFF(String str2) {
                            String strLJIIIZ = LJIIIZ(str2);
                            Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str2);
                            boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                            FrequencyMarkRecord second = pairLJII.getSecond();
                            if (!zBooleanValue) {
                                return;
                            }
                            LJIIIIZZ().LJFF(GsonProtectorUtils.toJson(LJFF, second), strLJIIIZ);
                        }

                        {
                            super(c12912053m, anonymousClass0531);
                            this.LIZLLL = C452501pT.LIZIZ(new AwS403S0200000_2(anonymousClass0531, (C053I) null, 60));
                            this.LJ = C452501pT.LIZIZ(new AwS403S0200000_2(c12912053m, anonymousClass0531, 61));
                        }

                        @Override // X.C053H, X.C053S
                        public final Pair LIZJ(long j2, String str2) {
                            long jLongValue;
                            Long l;
                            boolean zLJI = LJI(j2, str2);
                            Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str2);
                            pairLJII.getFirst().booleanValue();
                            FrequencyMarkRecord second = pairLJII.getSecond();
                            Boolean boolValueOf = Boolean.valueOf(zLJI);
                            if (zLJI && (l = second.lastShowTimeMs) != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            return new Pair(boolValueOf, Long.valueOf(jLongValue));
                        }

                        @Override // X.C053H, X.C053S
                        public final boolean LJI(long j2, String str2) {
                            int iIntValue;
                            Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str2);
                            boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                            FrequencyMarkRecord second = pairLJII.getSecond();
                            if (!zBooleanValue) {
                                return false;
                            }
                            Integer num = second.count;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue < this.LIZ.LIZ) {
                                return false;
                            }
                            return true;
                        }

                        @Override // X.C053S
                        public final void LIZIZ(long j2, long j3, String str2) {
                            int iIntValue;
                            Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str2);
                            boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                            FrequencyMarkRecord second = pairLJII.getSecond();
                            int i = 1;
                            if (zBooleanValue) {
                                Integer num = second.count;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                i = 1 + iIntValue;
                            }
                            int i2 = this.LIZ.LIZ;
                            if (i > i2) {
                                i = i2;
                            }
                            LJ().LJFF(new FrequencyMarkRecord(Integer.valueOf(i), Long.valueOf(j2), null, null, 12, null), str2);
                            ((C053F) this.LJ.getValue()).LIZIZ(j2, j3, str2);
                        }
                    };
                } else if (c053z instanceof C12908053i) {
                    c053n = new C053L((C12908053i) c053z, anonymousClass0531);
                } else if (c053z instanceof C12910053k) {
                    final C12910053k c12910053k = (C12910053k) c053z;
                    c053n = new C053H<C12910053k, InterfaceC12901053b, FrequencyMarkRecord>(c12910053k, anonymousClass0531) { // from class: X.053C
                        public final C01GW LIZLLL;
                        public final C01GW LJ;

                        @Override // X.C053S
                        public final C053I<FrequencyMarkRecord> LJ() {
                            return (C053I) this.LIZLLL.getValue();
                        }

                        @Override // X.C053H, X.C053S
                        public final void LIZLLL(String str2) {
                            LJ().LJFF(FrequencyMarkRecord.LIZ(FrequencyMarkRecord.LIZ, Boolean.TRUE), str2);
                            ((C053H) this.LJ.getValue()).LIZLLL(str2);
                        }

                        @Override // X.C053S
                        public final void LJFF(String str2) {
                            String strLJIIIZ = LJIIIZ(str2);
                            Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str2);
                            boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                            FrequencyMarkRecord second = pairLJII.getSecond();
                            if (!zBooleanValue) {
                                return;
                            }
                            LJIIIIZZ().LJFF(C051M.LJ(second, false), strLJIIIZ);
                        }

                        {
                            super(c12910053k, anonymousClass0531);
                            this.LIZLLL = C452501pT.LIZIZ(new AwS403S0200000_2(anonymousClass0531, (C053I) null, 57));
                            this.LJ = C452501pT.LIZIZ(new AwS403S0200000_2(c12910053k, anonymousClass0531, 58));
                        }

                        @Override // X.C053H, X.C053S
                        public final Pair LIZJ(long j2, String str2) {
                            long jLongValue;
                            Long l;
                            boolean zLJI = LJI(j2, str2);
                            FrequencyMarkRecord second = LJII(str2).getSecond();
                            Boolean boolValueOf = Boolean.valueOf(zLJI);
                            if (zLJI && (l = second.lastShowTimeMs) != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            return new Pair(boolValueOf, Long.valueOf(jLongValue));
                        }

                        @Override // X.C053H, X.C053S
                        public final boolean LJI(long j2, String str2) {
                            int iIntValue;
                            Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str2);
                            boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                            FrequencyMarkRecord second = pairLJII.getSecond();
                            if (!zBooleanValue) {
                                return false;
                            }
                            int i = this.LIZ.LIZ;
                            Integer num = second.count;
                            if (num == null || (iIntValue = num.intValue()) <= 0 || i <= 0 || iIntValue % i != 0) {
                                return false;
                            }
                            return true;
                        }

                        @Override // X.C053S
                        public final void LIZIZ(long j2, long j3, String str2) {
                            int iIntValue;
                            Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str2);
                            boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                            FrequencyMarkRecord second = pairLJII.getSecond();
                            int i = 1;
                            if (zBooleanValue) {
                                Integer num = second.count;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                i = 1 + iIntValue;
                            }
                            LJ().LJFF(new FrequencyMarkRecord(Integer.valueOf(i), Long.valueOf(j2), null, null, 12, null), str2);
                            ((C053D) this.LJ.getValue()).LIZIZ(j2, j3, str2);
                        }
                    };
                } else if (c053z instanceof C12907053h) {
                    c053n = new C053B((C12907053h) c053z, anonymousClass0531);
                } else if (c053z instanceof C12900053a) {
                    c053z.getClass();
                    c053n = new C053B(new C12907053h(0, 0L, null), anonymousClass0531);
                } else if (c053z instanceof C12909053j) {
                    c053n = new C053N((C12909053j) c053z, anonymousClass0531);
                } else if (c053z instanceof C12911053l) {
                    c053n = C053A.LIZLLL;
                } else {
                    throw new C1954807lC();
                }
                Pair pairLIZJ = c053n.LIZJ(j, str);
                boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
                long jLongValue = ((Number) pairLIZJ.getSecond()).longValue();
                if (zBooleanValue) {
                    InterfaceC12901053b interfaceC12901053b = c053w.LIZLLL;
                    if (interfaceC12901053b instanceof C12914053o) {
                        C12914053o c12914053o = (C12914053o) interfaceC12901053b;
                        if (c12914053o != null && (enumC12927054b = c12914053o.LIZIZ) != null) {
                            timeInMs = enumC12927054b.getTimeInMs(c12914053o.LIZ);
                        }
                        long j2 = timeInMs + jLongValue;
                        if (j > j2 && (c053n instanceof C053B)) {
                            c053n.LIZLLL(str);
                        }
                        if (jLongValue <= j && j <= j2) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC12997056t
    public final boolean LJFF(String str, String str2) {
        Object c098200Yq;
        try {
            c098200Yq = (FrequencyMarkRecord) this.LIZLLL.LJII(str2, FrequencyMarkRecord.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        FrequencyMarkRecord frequencyMarkRecord = (FrequencyMarkRecord) c098200Yq;
        if (frequencyMarkRecord == null) {
            return false;
        }
        LJII().LJFF(FrequencyMarkRecord.LIZ(frequencyMarkRecord, Boolean.FALSE), str);
        return true;
    }

    public C053K(String str, EnumC12995056r enumC12995056r, List<C053W> list) {
        this.LIZ = str;
        this.LIZIZ = enumC12995056r;
        this.LIZJ = list;
    }

    @Override // X.InterfaceC12997056t
    public final void LIZLLL(long j, long j2, String str) {
        int iIntValue;
        if (LIZIZ(j2, str)) {
            return;
        }
        FrequencyMarkRecord second = LJII().getData(str).getSecond();
        Integer num = second.count;
        boolean zBooleanValue = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i = iIntValue + 1;
        if (i < 0) {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        Long lValueOf = Long.valueOf(j);
        Collection collection = second.hitTimestamps;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        List listLJLILLLLZI = C13LP.LJLILLLLZI(Long.valueOf(j), collection);
        Boolean bool = second.pendingClientOverride;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        LJII().LJFF(new FrequencyMarkRecord(numValueOf, lValueOf, listLJLILLLLZI, Boolean.valueOf(zBooleanValue)), str);
    }
}
