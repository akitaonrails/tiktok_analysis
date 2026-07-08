package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import java.util.List;

/* JADX INFO: renamed from: X.0vYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746520vYA {
    public static final /* synthetic */ int LJIIL = 0;
    public final InputItemData LIZ;
    public final Address LIZIZ;
    public final List<Region> LIZJ;
    public final Region LIZLLL;
    public final List<String> LJ;
    public final boolean LJFF;
    public final Address LJI;
    public final Address LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;

    public final C1745680vWo LIZ(InputItemDTO inputItemDTO) {
        boolean z;
        inputItemDTO.LIZIZ();
        List<Rule> list = inputItemDTO.rules;
        boolean zLJJJJ = true;
        if (list != null) {
            for (Rule rule : list) {
                if (rule.error != null && rule.regex == null) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        List<String> list2 = this.LJ;
        if (list2 != null) {
            zLJJJJ = C13LP.LJJJJ(inputItemDTO.key, list2);
        }
        return new C1745680vWo(inputItemDTO, null, null, zLJJJJ, z, null, null, 16286);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1745680vWo LIZIZ(X.C1745680vWo r18) {
        /*
            r17 = this;
            r3 = r18
            r1 = r17
            boolean r0 = r1.LJFF
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r1.LJI
            if (r0 == 0) goto L11
            X.0vWo r3 = LJFF(r0, r3)
        L10:
            return r3
        L11:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r1.LIZIZ
            if (r0 == 0) goto L1a
            X.0vWo r3 = LJFF(r0, r3)
            return r3
        L1a:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r5 = r1.LIZJ
            java.lang.Object r1 = r3.LIZIZ
            boolean r0 = r1 instanceof java.util.List
            r8 = 0
            if (r0 == 0) goto L10
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r1.iterator()
        L30:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r9 = r7.next()
            X.0vWo r9 = (X.C1745680vWo) r9
            if (r5 == 0) goto L72
            java.util.Iterator r6 = r5.iterator()
        L42:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r4 = r6.next()
            r0 = r4
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region) r0
            java.lang.String r1 = r0.districtKey
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r9.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L42
        L5b:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r4 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region) r4
            if (r4 == 0) goto L72
            java.lang.String r10 = r4.name
        L61:
            r11 = 0
            r12 = 0
            r16 = 16381(0x3ffd, float:2.2955E-41)
            r13 = r11
            r14 = r11
            r15 = r11
            X.0vWo r0 = X.C1745680vWo.LIZ(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.add(r0)
            goto L30
        L70:
            r4 = r8
            goto L5b
        L72:
            r10 = r8
            goto L61
        L74:
            r5 = 0
            r6 = 0
            r10 = 16381(0x3ffd, float:2.2955E-41)
            r7 = r5
            r8 = r5
            r9 = r5
            r4 = r2
            r3 = r3
            X.0vWo r3 = X.C1745680vWo.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746520vYA.LIZIZ(X.0vWo):X.0vWo");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1745680vWo LJFF(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r20, X.C1745680vWo r21) {
        /*
            r14 = r21
            java.lang.Object r1 = r14.LIZIZ
            boolean r0 = r1 instanceof java.util.List
            r5 = 0
            if (r0 == 0) goto L86
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L86
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r4 = r1.iterator()
        L16:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r6 = r4.next()
            X.0vWo r6 = (X.C1745680vWo) r6
            r0 = r20
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r0.items
            if (r0 == 0) goto L73
            java.util.Iterator r3 = r0.iterator()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r1 = r0.key
            if (r6 == 0) goto L6f
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r6.LIZ
            if (r0 == 0) goto L6f
            java.lang.String r0 = r0.key
        L43:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2c
        L49:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r2
            if (r2 == 0) goto L73
            java.lang.String r7 = r2.value
        L4f:
            if (r6 == 0) goto L6d
            java.lang.Object r0 = r6.LIZIZ
        L53:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L6b
            if (r6 == 0) goto L6b
            X.0vWG r8 = r6.LIZJ
        L5d:
            r9 = 0
            r10 = 0
            r13 = 16377(0x3ff9, float:2.2949E-41)
            r11 = r10
            r12 = r10
            X.0vWo r0 = X.C1745680vWo.LIZ(r6, r7, r8, r9, r10, r11, r12, r13)
            r15.add(r0)
            goto L16
        L6b:
            r8 = r5
            goto L5d
        L6d:
            r0 = r5
            goto L53
        L6f:
            r0 = r5
            goto L43
        L71:
            r2 = r5
            goto L49
        L73:
            r7 = r5
            goto L4f
        L75:
            r16 = 0
            r17 = 0
            r21 = 16381(0x3ffd, float:2.2955E-41)
            r18 = r16
            r19 = r16
            r20 = r16
            X.0vWo r0 = X.C1745680vWo.LIZ(r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L86:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746520vYA.LJFF(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, X.0vWo):X.0vWo");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r4 = "name"
            r3 = 0
            if (r6 == 0) goto L40
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r6.items
            if (r0 == 0) goto L40
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto Ld
        L22:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r1
            if (r1 == 0) goto L40
            java.lang.String r2 = r1.value
        L28:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = r5.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r0.config
            if (r0 == 0) goto L42
            java.util.List r0 = r0.LIZ()
            if (r0 == 0) goto L42
            boolean r1 = r0.contains(r4)
            r0 = 1
            if (r1 != r0) goto L42
            if (r7 == 0) goto L42
            return r3
        L3e:
            r1 = r3
            goto L22
        L40:
            r2 = r3
            goto L28
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746520vYA.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r4 = "first_name"
            r3 = 0
            if (r6 == 0) goto L40
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r6.items
            if (r0 == 0) goto L40
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto Ld
        L22:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r1
            if (r1 == 0) goto L40
            java.lang.String r2 = r1.value
        L28:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = r5.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r0.config
            if (r0 == 0) goto L42
            java.util.List r0 = r0.LIZ()
            if (r0 == 0) goto L42
            boolean r1 = r0.contains(r4)
            r0 = 1
            if (r1 != r0) goto L42
            if (r7 == 0) goto L42
            return r3
        L3e:
            r1 = r3
            goto L22
        L40:
            r2 = r3
            goto L28
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746520vYA.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r4 = "last_name"
            r3 = 0
            if (r6 == 0) goto L40
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r6.items
            if (r0 == 0) goto L40
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto Ld
        L22:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r1
            if (r1 == 0) goto L40
            java.lang.String r2 = r1.value
        L28:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = r5.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r0.config
            if (r0 == 0) goto L42
            java.util.List r0 = r0.LIZ()
            if (r0 == 0) goto L42
            boolean r1 = r0.contains(r4)
            r0 = 1
            if (r1 != r0) goto L42
            if (r7 == 0) goto L42
            return r3
        L3e:
            r1 = r3
            goto L22
        L40:
            r2 = r3
            goto L28
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746520vYA.LJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, boolean):java.lang.Object");
    }

    public C1746520vYA(InputItemData inputItemData, Address address, List<Region> list, Region region, List<String> list2, boolean z, Address address2, Address address3, boolean z2, boolean z3, String str, Integer num) {
        this.LIZ = inputItemData;
        this.LIZIZ = address;
        this.LIZJ = list;
        this.LIZLLL = region;
        this.LJ = list2;
        this.LJFF = z;
        this.LJI = address2;
        this.LJII = address3;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = str;
        this.LJIIJJI = num;
    }
}
