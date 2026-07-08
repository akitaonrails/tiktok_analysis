package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707950Rpp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(454));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(453));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(452));
    public static final ArrayBlockingQueue<RunnableC707970Rpr> LIZLLL = new ArrayBlockingQueue<>(16);

    public static String LIZ(Map map) {
        Map mapLIZJ;
        final Map mapLJIIIIZZ;
        String str;
        Map mapLJIIIIZZ2;
        Map mapLJIIIIZZ3;
        Map mapLJIIIIZZ4;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            C707900Rpk c707900Rpk = (C707900Rpk) entry.getKey();
            List<C707890Rpj> list = (List) entry.getValue();
            final String str5 = c707900Rpk.LIZ;
            final String strName = c707900Rpk.LIZIZ.name();
            final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C707890Rpj c707890Rpj : list) {
                final long j = c707890Rpj.LIZ;
                final String strName2 = c707890Rpj.LIZIZ.LIZ().name();
                AbstractC707990Rpt abstractC707990Rpt = c707890Rpj.LIZIZ;
                Object objLJIIIIZZ = null;
                if (abstractC707990Rpt instanceof C708030Rpx) {
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("type", "prep");
                    C708030Rpx c708030Rpx = (C708030Rpx) abstractC707990Rpt;
                    C707920Rpm c707920Rpm = c708030Rpx.LIZ.LIZ;
                    if (c707920Rpm != null) {
                        Pair[] pairArr2 = new Pair[2];
                        pairArr2[0] = new Pair("value", c707920Rpm.LIZ);
                        C707980Rps c707980Rps = c707920Rpm.LIZIZ;
                        if (c707980Rps != null) {
                            str4 = c707980Rps.LIZ;
                        } else {
                            str4 = null;
                        }
                        pairArr2[1] = new Pair("reason", str4);
                        mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(pairArr2);
                    } else {
                        mapLJIIIIZZ2 = null;
                    }
                    pairArr[1] = new Pair("active", mapLJIIIIZZ2);
                    C707920Rpm c707920Rpm2 = c708030Rpx.LIZ.LIZIZ;
                    if (c707920Rpm2 != null) {
                        Pair[] pairArr3 = new Pair[2];
                        pairArr3[0] = new Pair("value", c707920Rpm2.LIZ);
                        C707980Rps c707980Rps2 = c707920Rpm2.LIZIZ;
                        if (c707980Rps2 != null) {
                            str3 = c707980Rps2.LIZ;
                        } else {
                            str3 = null;
                        }
                        pairArr3[1] = new Pair("reason", str3);
                        mapLJIIIIZZ3 = C2097608Jq.LJIIIIZZ(pairArr3);
                    } else {
                        mapLJIIIIZZ3 = null;
                    }
                    pairArr[2] = new Pair("signal", mapLJIIIIZZ3);
                    C707920Rpm c707920Rpm3 = c708030Rpx.LIZ.LIZJ;
                    if (c707920Rpm3 != null) {
                        Pair[] pairArr4 = new Pair[2];
                        pairArr4[0] = new Pair("value", c707920Rpm3.LIZ);
                        C707980Rps c707980Rps3 = c707920Rpm3.LIZIZ;
                        if (c707980Rps3 != null) {
                            str2 = c707980Rps3.LIZ;
                        } else {
                            str2 = null;
                        }
                        pairArr4[1] = new Pair("reason", str2);
                        mapLJIIIIZZ4 = C2097608Jq.LJIIIIZZ(pairArr4);
                    } else {
                        mapLJIIIIZZ4 = null;
                    }
                    pairArr[3] = new Pair("density", mapLJIIIIZZ4);
                    C707920Rpm c707920Rpm4 = c708030Rpx.LIZ.LIZLLL;
                    if (c707920Rpm4 != null) {
                        Pair[] pairArr5 = new Pair[2];
                        pairArr5[0] = new Pair("value", c707920Rpm4.LIZ);
                        C707980Rps c707980Rps4 = c707920Rpm4.LIZIZ;
                        if (c707980Rps4 != null) {
                            objLJIIIIZZ = c707980Rps4.LIZ;
                        }
                        pairArr5[1] = new Pair("reason", objLJIIIIZZ);
                        objLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr5);
                    }
                    pairArr[4] = new Pair("enable", objLJIIIIZZ);
                    mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                } else if (abstractC707990Rpt instanceof C708000Rpu) {
                    Pair[] pairArr6 = new Pair[2];
                    pairArr6[0] = new Pair("type", "decision");
                    C707920Rpm c707920Rpm5 = ((C708000Rpu) abstractC707990Rpt).LIZ.LIZ;
                    if (c707920Rpm5 != null) {
                        Pair[] pairArr7 = new Pair[3];
                        pairArr7[0] = new Pair("value", c707920Rpm5.LIZ);
                        C707980Rps c707980Rps5 = c707920Rpm5.LIZIZ;
                        if (c707980Rps5 != null) {
                            str = c707980Rps5.LIZ;
                        } else {
                            str = null;
                        }
                        pairArr7[1] = new Pair("reason", str);
                        C707980Rps c707980Rps6 = c707920Rpm5.LIZIZ;
                        if (c707980Rps6 != null) {
                            objLJIIIIZZ = c707980Rps6.LIZIZ;
                        }
                        pairArr7[2] = new Pair("info", objLJIIIIZZ);
                        objLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr7);
                    }
                    pairArr6[1] = new Pair("decision", objLJIIIIZZ);
                    mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr6);
                } else if (abstractC707990Rpt instanceof C708020Rpw) {
                    Pair[] pairArr8 = new Pair[3];
                    pairArr8[0] = new Pair("type", "display");
                    C708020Rpw c708020Rpw = (C708020Rpw) abstractC707990Rpt;
                    C707920Rpm c707920Rpm6 = c708020Rpw.LIZ.LIZ;
                    if (c707920Rpm6 != null) {
                        mapLIZJ = C2097908Jt.LIZJ(new Pair("value", c707920Rpm6.LIZ));
                    } else {
                        mapLIZJ = null;
                    }
                    pairArr8[1] = new Pair("occupied", mapLIZJ);
                    C707920Rpm c707920Rpm7 = c708020Rpw.LIZ.LIZIZ;
                    if (c707920Rpm7 != null) {
                        Pair[] pairArr9 = new Pair[2];
                        pairArr9[0] = new Pair("value", c707920Rpm7.LIZ);
                        C707980Rps c707980Rps7 = c707920Rpm7.LIZIZ;
                        if (c707980Rps7 != null) {
                            objLJIIIIZZ = c707980Rps7.LIZIZ;
                        }
                        pairArr9[1] = new Pair("info", objLJIIIIZZ);
                        objLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr9);
                    }
                    pairArr8[2] = new Pair("show", objLJIIIIZZ);
                    mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr8);
                } else {
                    throw new C1954807lC();
                }
                arrayList2.add(new Object(j, strName2, mapLJIIIIZZ) { // from class: X.002w
                    public final long LIZ;
                    public final String LIZIZ;
                    public final Map<String, Object> LIZJ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0156002w)) {
                            return false;
                        }
                        C0156002w c0156002w = (C0156002w) obj;
                        return this.LIZ == c0156002w.LIZ && Intrinsics.LJFF(this.LIZIZ, c0156002w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0156002w.LIZJ);
                    }

                    public final int hashCode() {
                        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ALogTraceRecordData(timestamp=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", stage=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(", stageState=");
                        sbLIZ.append(this.LIZJ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = j;
                        this.LIZIZ = strName2;
                        this.LIZJ = mapLJIIIIZZ;
                    }
                });
            }
            arrayList.add(new Object(str5, strName, arrayList2) { // from class: X.004V
                public final String LIZ;
                public final String LIZIZ;
                public final List<C0156002w> LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C004V)) {
                        return false;
                    }
                    C004V c004v = (C004V) obj;
                    return Intrinsics.LJFF(this.LIZ, c004v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c004v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c004v.LIZJ);
                }

                public final int hashCode() {
                    return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ALogTraceNodeData(identifier=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", nodeType=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", records=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str5;
                    this.LIZIZ = strName;
                    this.LIZJ = arrayList2;
                }
            });
        }
        return GsonProtectorUtils.toJson(C08JS.LIZIZ(), arrayList);
    }
}
