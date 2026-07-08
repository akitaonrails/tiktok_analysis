package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerCacheSortSetting;
import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0NF1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0NF1 extends AbstractC590750NEz {
    public final List<? extends C0NFD> LIZLLL;
    public final List<Double> LJ;
    public final List<Double> LJFF;
    public final List<Double> LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public final C01GW LJIIIZ;

    public C0NF1(PlayerCacheSortSetting playerCacheSortSetting) {
        super(playerCacheSortSetting);
        this.LIZLLL = Collections.singletonList(C0NFD.NO_FEATURE);
        this.LJ = Collections.singletonList(Double.valueOf(0.0d));
        C13BV c13bv = C13BV.INSTANCE;
        this.LJFF = c13bv;
        this.LJI = c13bv;
        this.LJIIIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(674));
        this.LIZLLL = (List) playerCacheSortSetting.LIZ.getValue();
        this.LJ = playerCacheSortSetting.coefficients;
        this.LJFF = playerCacheSortSetting.minValues;
        this.LJI = playerCacheSortSetting.maxValues;
        this.LJII = playerCacheSortSetting.lowerNonVideoRank;
        this.LJIIIIZZ = playerCacheSortSetting.onlySortNoScore;
    }

    public static boolean LJ(C590350NDl c590350NDl) {
        Long l;
        if (((Number) C2268981DrU.LJIIZILJ.getValue()).intValue() <= 0 || c590350NDl == null || (l = c590350NDl.LJII) == null) {
            return false;
        }
        long jLongValue = l.longValue();
        if (jLongValue <= 0 || System.currentTimeMillis() - jLongValue >= ((long) (((Number) C2268981DrU.LJIJ.getValue()).intValue() * 60 * 60)) * 1000 || c590350NDl.LJIIJ == EnumC590300NDg.NOT_COMPLETE) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC590750NEz
    public final void LIZLLL(C590710NEv c590710NEv, Function1<? super C0HAW, Unit> function1) {
        if (c590710NEv != null && !c590710NEv.LIZ.isEmpty()) {
            C19719612Di.LJJIIJ(c590710NEv.LIZIZ, AFwS240S0000000_9.get$arr$(976), false);
            if (!c590710NEv.LIZIZ.isEmpty()) {
                super.LIZLLL(c590710NEv, function1);
                return;
            }
        }
        C13BV c13bv = C13BV.INSTANCE;
        function1.invoke(new C0HAW(false, c13bv, c13bv));
    }

    @Override // X.AbstractC590750NEz
    public final double LIZJ(int i, C590350NDl c590350NDl, List<HistoryVideoInfoStruct> list) {
        Object obj;
        double dDoubleValue;
        double dDoubleValue2;
        String str = c590350NDl.LIZJ;
        boolean z = this.LJII;
        double dExp = 0.0d;
        Double dValueOf = Double.valueOf(0.0d);
        if (!z || c590350NDl.LIZLLL()) {
            if (this.LJIIIIZZ && !C593360NPa.LIZLLL(Float.valueOf(c590350NDl.LJI), dValueOf)) {
                dExp = c590350NDl.LJI;
            } else {
                C0NF3 c0nf3 = new C0NF3(i, c590350NDl, list);
                double dLIZJ = this.LIZJ.LIZJ(c0nf3);
                double dLIZLLL = this.LIZJ.LIZLLL(c0nf3);
                List<? extends C0NFD> list2 = this.LIZLLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                int i2 = 0;
                for (C0NFD c0nfd : list2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C0NFD c0nfd2 = c0nfd;
                        C0NFB c0nfb = this.LIZJ;
                        Double d = (Double) C13LP.LJJJLZIJ(i2, this.LJFF);
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        Double d2 = (Double) C13LP.LJJJLZIJ(i2, this.LJI);
                        if (d2 != null) {
                            dDoubleValue2 = d2.doubleValue();
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        arrayList.add(Double.valueOf(c0nfb.LJFF(c0nf3, c0nfd2, dDoubleValue, dDoubleValue2)));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                EnumC590300NDg enumC590300NDg = c590350NDl.LJIIJ;
                EnumC590300NDg enumC590300NDg2 = EnumC590300NDg.NOT_COMPLETE;
                if (enumC590300NDg == enumC590300NDg2 && C0BTV.LIZ()) {
                    C0NE3.LIZ.add(str);
                }
                if (i == 0 && LJ(c590350NDl)) {
                    dExp = 1.0d;
                } else if (c590350NDl.LJIIJ == enumC590300NDg2) {
                    dExp = 0.0d;
                } else {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    int i4 = 0;
                    for (Object obj2 : arrayList) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            double dDoubleValue3 = ((Number) obj2).doubleValue();
                            List<Double> list3 = this.LJ;
                            if (i4 < list3.size()) {
                                obj = ListProtector.get(list3, i4);
                            } else {
                                obj = dValueOf;
                            }
                            arrayList2.add(Double.valueOf(((Number) obj).doubleValue() * dDoubleValue3));
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    double d3 = 1;
                    dExp = d3 / (Math.exp(-((C13LP.LJLZ(arrayList2) * dLIZJ) * dLIZLLL)) + d3);
                }
            }
        }
        LIZIZ(c590350NDl.LIZJ, this.LIZJ.LJI, false);
        return dExp;
    }
}
