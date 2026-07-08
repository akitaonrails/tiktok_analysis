package X;

import com.bytedance.applog.priority.PriorityCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191701Aq8 implements InterfaceC2191781AqG {
    public final C2191741AqC LIZ;
    public final C2191711Aq9 LIZIZ;
    public final InterfaceC2190561AoI LIZJ;
    public final PriorityCallback LIZLLL;
    public final C2191171ApH LJ;
    public final InterfaceC2191651Aq3 LJFF;
    public long LJII;
    public final AtomicBoolean LJI = new AtomicBoolean(true);
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    @Override // X.InterfaceC2191781AqG
    public final int C2() {
        return this.LIZIZ.LIZ;
    }

    @Override // X.InterfaceC2191781AqG
    public final int LIZJ() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.InterfaceC2191781AqG
    public final void destroy() {
        this.LJI.set(false);
    }

    @Override // X.InterfaceC2191781AqG
    public final void flush() {
        this.LJII = 0L;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Group-");
        sbLIZ.append(this.LIZIZ.LJ.LIZJ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ.LIZJ);
        sbLIZ.append('s');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2191781AqG
    public final boolean LIZIZ(long j) {
        if (!this.LJI.get()) {
            return false;
        }
        if (this.LIZIZ.LIZJ > 0 && this.LJII > j) {
            return false;
        }
        return true;
    }

    public static boolean LJ(HashMap map, JSONObject jSONObject) {
        String string;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!Intrinsics.LJFF(jSONObject.optString(str), value)) {
                Object objOpt = jSONObject.opt(str);
                if (objOpt != null) {
                    string = objOpt.toString();
                } else {
                    string = null;
                }
                if (!Intrinsics.LJFF(string, value)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.bytedance.applog.priority.PriorityHttpResponse r11, java.util.Map<X.C2191641Aq2, ? extends org.json.JSONObject> r12) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191701Aq8.LIZLLL(com.bytedance.applog.priority.PriorityHttpResponse, java.util.Map):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // X.InterfaceC2191781AqG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C2190751Aob r17, long r18, X.InterfaceC1364105Vn r20) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191701Aq8.LIZ(X.1Aob, long, X.05Vn):java.lang.Object");
    }

    public final boolean LJFF(EnumC2191921AqU enumC2191921AqU, String str, JSONObject jSONObject) {
        if (!this.LIZIZ.LJI.contains(enumC2191921AqU.getAlias())) {
            return false;
        }
        if (this.LIZIZ.LJFF == null) {
            return true;
        }
        switch (C2191881AqQ.LIZ[enumC2191921AqU.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 7:
                return false;
            default:
                if ((!this.LIZIZ.LJFF.LIZ.isEmpty()) && this.LIZIZ.LJFF.LIZ.contains(str)) {
                    return true;
                }
                if (jSONObject == null) {
                    return false;
                }
                if (!this.LIZIZ.LJFF.LIZIZ.isEmpty()) {
                    List<List<String>> list = this.LIZIZ.LJFF.LIZIZ.get(str);
                    if (list != null && !list.isEmpty()) {
                        Iterator<List<String>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            Iterator<String> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                if (!jSONObject.has(it3.next())) {
                                }
                                break;
                            }
                            return true;
                        }
                    }
                    List<List<String>> list2 = this.LIZIZ.LJFF.LIZIZ.get("*");
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator<List<String>> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            Iterator<String> it5 = it4.next().iterator();
                            while (it5.hasNext()) {
                                if (!jSONObject.has(it5.next())) {
                                }
                                break;
                            }
                            return true;
                        }
                    }
                }
                if (!this.LIZIZ.LJFF.LIZJ.isEmpty()) {
                    List<HashMap<String, String>> list3 = this.LIZIZ.LJFF.LIZJ.get(str);
                    if (list3 != null && !list3.isEmpty()) {
                        Iterator<HashMap<String, String>> it6 = list3.iterator();
                        while (it6.hasNext()) {
                            if (LJ(it6.next(), jSONObject)) {
                                return true;
                            }
                        }
                    }
                    List<HashMap<String, String>> list4 = this.LIZIZ.LJFF.LIZJ.get("*");
                    if (list4 != null && !list4.isEmpty()) {
                        Iterator<HashMap<String, String>> it7 = list4.iterator();
                        while (it7.hasNext()) {
                            if (LJ(it7.next(), jSONObject)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    public C2191701Aq8(C2191741AqC c2191741AqC, C2191711Aq9 c2191711Aq9, InterfaceC2190561AoI interfaceC2190561AoI, PriorityCallback priorityCallback, C2191171ApH c2191171ApH) {
        this.LIZ = c2191741AqC;
        this.LIZIZ = c2191711Aq9;
        this.LIZJ = interfaceC2190561AoI;
        this.LIZLLL = priorityCallback;
        this.LJ = c2191171ApH;
        this.LJFF = c2191741AqC.LIZ.LIZ(c2191711Aq9.LJ.LIZJ);
    }
}
