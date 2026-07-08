package X;

import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1065380dpY extends MemoryFeatureInfo {
    public boolean LIZ;
    public final ArrayList<String> LIZIZ;
    public final ArrayList<String> LIZJ;
    public final ArrayList<String> LIZLLL;
    public final ArrayList<String> LJ;

    public ArrayList<String> LIZIZ() {
        throw null;
    }

    public String LIZJ() {
        throw null;
    }

    public C1065380dpY() {
        new ArrayList();
        this.LIZIZ = new ArrayList<>();
        this.LIZJ = new ArrayList<>();
        this.LIZLLL = new ArrayList<>();
        this.LJ = new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveGameSession(featureMap=");
        sbLIZ.append(getFeatureMap());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ArrayList<String> LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final Object getFeature(String str) {
        if (this.LIZ && LIZIZ().contains(str)) {
            return super.getFeature(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final boolean hasFeature(String str) {
        if (this.LIZ && LIZIZ().contains(str)) {
            return super.hasFeature(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final void setFeature(String str, Object obj) {
        String next;
        long jLongValue;
        Long l;
        int iIntValue;
        Integer num;
        float fFloatValue;
        Float f;
        double dDoubleValue;
        Double d;
        if (this.LIZ && LIZIZ().contains(str)) {
            if (obj instanceof List) {
                Iterator<String> it2 = LIZ().iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!Intrinsics.LJFF(next, str));
                if (next != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                    for (Object obj2 : iterable) {
                        if ((obj2 instanceof Double) && (d = (Double) obj2) != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = Double.NaN;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(Double.valueOf(dDoubleValue))));
                    }
                    super.setFeature(str, C13LP.LLFZ(arrayList));
                    return;
                }
                Iterator<String> it3 = this.LJ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String next2 = it3.next();
                    if (Intrinsics.LJFF(next2, str)) {
                        if (next2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterable iterable2 = (Iterable) obj;
                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(iterable2, 10));
                            for (Object obj3 : iterable2) {
                                if ((obj3 instanceof Float) && (f = (Float) obj3) != null) {
                                    fFloatValue = f.floatValue();
                                } else {
                                    fFloatValue = Float.NaN;
                                }
                                arrayList4.add(Boolean.valueOf(arrayList3.add(Float.valueOf(fFloatValue))));
                            }
                            super.setFeature(str, C13LP.LLI(arrayList3));
                            return;
                        }
                    }
                }
                Iterator<String> it4 = this.LIZJ.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    String next3 = it4.next();
                    if (Intrinsics.LJFF(next3, str)) {
                        if (next3 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            Iterable iterable3 = (Iterable) obj;
                            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(iterable3, 10));
                            for (Object obj4 : iterable3) {
                                if ((obj4 instanceof Integer) && (num = (Integer) obj4) != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                arrayList6.add(Boolean.valueOf(arrayList5.add(Integer.valueOf(iIntValue))));
                            }
                            super.setFeature(str, C13LP.LLII(arrayList5));
                            return;
                        }
                    }
                }
                Iterator<String> it5 = this.LIZLLL.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    String next4 = it5.next();
                    if (Intrinsics.LJFF(next4, str)) {
                        if (next4 != null) {
                            ArrayList arrayList7 = new ArrayList();
                            Iterable iterable4 = (Iterable) obj;
                            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(iterable4, 10));
                            for (Object obj5 : iterable4) {
                                if ((obj5 instanceof Long) && (l = (Long) obj5) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = Long.MIN_VALUE;
                                }
                                arrayList8.add(Boolean.valueOf(arrayList7.add(Long.valueOf(jLongValue))));
                            }
                            super.setFeature(str, C13LP.LLIIIILZ(arrayList7));
                            return;
                        }
                    }
                }
                super.setFeature(str, obj);
                return;
            }
            super.setFeature(str, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo, X.C087U
    public final Number addFeature(String str, Number number, boolean z) {
        if (this.LIZ) {
            return super.addFeature(str, number, z);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo, X.C087U
    public final void setFeature(String str, Number number, boolean z) {
        if (this.LIZ && LIZIZ().contains(str)) {
            super.setFeature(str, number, z);
        }
    }
}
