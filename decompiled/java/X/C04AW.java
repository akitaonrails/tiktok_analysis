package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04AW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04AW {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1053604Ac interfaceC1053604Ac = (InterfaceC1053604Ac) obj;
                    List<SalePropValue> listLIZJ = interfaceC1053604Ac.LIZJ();
                    boolean z2 = true;
                    if (listLIZJ != null && listLIZJ.size() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!Intrinsics.LJFF(interfaceC1053604Ac.LIZIZ(), Boolean.TRUE)) {
                        Integer numLIZ = interfaceC1053604Ac.LIZ();
                        int value = EnumC1012703xd.COLOR.getValue();
                        if (numLIZ == null || numLIZ.intValue() != value) {
                            z2 = false;
                        }
                    }
                    if (!z && !z2) {
                        arrayList.add(interfaceC1053604Ac);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0008, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] LIZIZ(java.lang.String r7, java.util.List r8) {
        /*
            r0 = 0
            r3 = 0
            if (r8 == 0) goto L7e
            java.util.Iterator r6 = r8.iterator()
        L8:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r5 = r6.next()
            r4 = r5
            X.04Ab r4 = (X.InterfaceC1053504Ab) r4
            java.util.List r2 = r4.LIZ()
            if (r2 == 0) goto L8
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L8
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L8
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp r1 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp) r1
            java.lang.String r1 = r1.propValueId
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r7)
            if (r1 == 0) goto L25
            java.lang.Integer r1 = r4.LIZIZ()
            if (r1 == 0) goto L8
            int r1 = r1.intValue()
            if (r1 <= 0) goto L8
        L45:
            X.04Ab r5 = (X.InterfaceC1053504Ab) r5
            if (r5 == 0) goto L7e
            java.util.List r1 = r5.LIZ()
            if (r1 == 0) goto L7e
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp) r0
            java.lang.String r0 = r0.propValueId
            if (r0 != 0) goto L70
            java.lang.String r0 = ""
        L70:
            r2.add(r0)
            goto L5e
        L74:
            r5 = r0
            goto L45
        L76:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04AW.LIZIZ(java.lang.String, java.util.List):java.lang.String[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(java.util.List r7, java.lang.String[] r8) {
        /*
            r1 = 0
            if (r7 == 0) goto L87
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L87
            int r6 = r8.length
            r5 = 0
        Lb:
            if (r5 >= r6) goto L59
            r4 = r8[r5]
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L56
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r7 = r7.iterator()
        L20:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r2 = r7.next()
            r0 = r2
            X.04Ab r0 = (X.InterfaceC1053504Ab) r0
            java.util.List r1 = r0.LIZ()
            if (r1 == 0) goto L20
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L20
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp) r0
            java.lang.String r0 = r0.propValueId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L3d
            r3.add(r2)
            goto L20
        L55:
            r7 = r3
        L56:
            int r5 = r5 + 1
            goto Lb
        L59:
            java.util.Iterator r4 = r7.iterator()
            r3 = 0
        L5e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r2 = r4.next()
            X.04Ab r2 = (X.InterfaceC1053504Ab) r2
            java.lang.Integer r0 = r2.LIZIZ()
            if (r0 == 0) goto L84
            int r1 = r0.intValue()
            java.lang.Integer r0 = r2.LIZLLL()
            if (r0 == 0) goto L82
            int r0 = r0.intValue()
        L7e:
            if (r1 < r0) goto L84
        L80:
            int r3 = r3 + r1
            goto L5e
        L82:
            r0 = 0
            goto L7e
        L84:
            r1 = 0
            goto L80
        L86:
            return r3
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04AW.LIZJ(java.util.List, java.lang.String[]):int");
    }

    public static Skc LIZLLL(String str, SkcInfo skcInfo) {
        boolean z;
        List<Skc> list;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Skc skc = null;
        if (z || skcInfo == null || (list = skcInfo.skcList) == null) {
            return null;
        }
        Iterator<Skc> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Skc next = it2.next();
            if (Intrinsics.LJFF(next.skcId, str)) {
                skc = next;
                break;
            }
        }
        return skc;
    }

    public static InterfaceC1053504Ab LJ(String str, List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((InterfaceC1053504Ab) next).LIZJ(), str)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC1053504Ab) obj;
    }
}
