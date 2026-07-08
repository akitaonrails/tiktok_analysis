package X;

import android.content.res.Resources;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplate;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20159213uI implements InterfaceC20159613uM {
    public static final C20159213uI LJII = new C20159213uI(null, null, null, null, null);
    public static final C01GW<EnumC20159313uJ> LJIIIIZZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(355));
    public final String LIZ;
    public final List<Integer> LIZIZ;
    public final List<Integer> LIZJ;
    public final Map<String, EcomImageXConfigAdaptTemplate> LIZLLL;
    public final Integer LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS574S0100000_30(this, 462));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 463));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20159213uI)) {
            return false;
        }
        C20159213uI c20159213uI = (C20159213uI) obj;
        return Intrinsics.LJFF(this.LIZ, c20159213uI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20159213uI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20159213uI.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20159213uI.LIZLLL) && Intrinsics.LJFF(this.LJ, c20159213uI.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, EcomImageXConfigAdaptTemplate> map = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.LJ;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomSizeAdaptTemplateQuery(screenAdaptType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", screenWidthStages=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", configScreenWidthStages=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", adaptTemplates=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", screenWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // X.InterfaceC20159613uM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplateResult> LIZ() {
        /*
            r10 = this;
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplate> r1 = r10.LIZLLL
            r5 = 0
            if (r1 == 0) goto Laa
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r1.size()
            r4.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L16:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplate r0 = (com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplate) r0
            java.lang.String r6 = r0.template
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplate r0 = (com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplate) r0
            java.util.List<java.lang.String> r7 = r0.qualityStages
            if (r7 == 0) goto La4
            java.util.List<java.lang.Integer> r8 = r10.LIZJ
            if (r8 != 0) goto L69
            com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeGlobalBean r0 = X.C20156813tu.LIZ
            java.util.List<java.lang.Integer> r8 = r0.configScreenWidthStages
            if (r8 != 0) goto L69
            int r1 = r10.LIZIZ()
        L46:
            if (r1 < 0) goto L62
            int r0 = r7.size()
            if (r1 >= r0) goto L62
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r1)
        L52:
            java.lang.String r0 = (java.lang.String) r0
        L54:
            com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplateResult r1 = new com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageXConfigAdaptTemplateResult
            r1.<init>(r6, r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            r4.add(r0)
            goto L16
        L62:
            java.lang.Object r0 = X.C13LP.LJJLIIIJJI(r7)
            java.lang.String r0 = (java.lang.String) r0
            goto L52
        L69:
            java.lang.String r1 = r10.LIZ
            if (r1 == 0) goto L78
            X.13uL r0 = X.EnumC20159313uJ.Companion
            r0.getClass()
            X.13uJ r2 = X.C20159513uL.LIZ(r1)
            if (r2 != 0) goto L80
        L78:
            X.01GW<X.13uJ> r0 = X.C20159213uI.LJIIIIZZ
            java.lang.Object r2 = r0.getValue()
            X.13uJ r2 = (X.EnumC20159313uJ) r2
        L80:
            java.lang.Integer r0 = r10.LJ
            if (r0 == 0) goto L9f
            int r1 = r0.intValue()
        L88:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L96
            int r1 = X.C20158713uD.LIZ(r2, r1, r8, r5, r5)
        L96:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r1 = r8.indexOf(r0)
            goto L46
        L9f:
            int r1 = X.C1743690vTb.LIZIZ()
            goto L88
        La4:
            r0 = r5
            goto L54
        La6:
            java.util.Map r5 = X.C2097608Jq.LJIILLIIL(r4)
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20159213uI.LIZ():java.util.Map");
    }

    @Override // X.InterfaceC20159613uM
    public final int LIZIZ() {
        return ((Number) this.LJI.getValue()).intValue();
    }

    public final Integer LIZJ(EnumC20158813uE enumC20158813uE, Float f, boolean z) {
        if (f != null && !z) {
            int i = C20158913uF.LIZ[enumC20158813uE.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Integer.valueOf((int) f.floatValue());
                }
                return Integer.valueOf(C814420VxA.LIZIZ((f.floatValue() * ((Number) this.LJFF.getValue()).intValue()) / 750));
            }
            return Integer.valueOf((C0H9I.LIZ(f.floatValue()) * ((Number) this.LJFF.getValue()).intValue()) / C1743690vTb.LIZIZ());
        }
        int i2 = C20158913uF.LIZ[enumC20158813uE.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (f != null) {
                    return Integer.valueOf((int) f.floatValue());
                }
                return null;
            }
            if (f != null) {
                return Integer.valueOf(C814420VxA.LIZIZ((f.floatValue() * Resources.getSystem().getDisplayMetrics().widthPixels) / 750));
            }
            return null;
        }
        if (f != null) {
            return Integer.valueOf(C0H9I.LIZ(f.floatValue()));
        }
        return null;
    }

    public C20159213uI(Integer num, String str, List list, Map map, List list2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = map;
        this.LJ = num;
    }
}
