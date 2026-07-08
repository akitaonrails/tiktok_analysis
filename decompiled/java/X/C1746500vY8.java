package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;

/* JADX INFO: renamed from: X.0vY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746500vY8 {
    public final InputItemData LIZ;
    public final Address LIZIZ;
    public final List<Region> LIZJ;
    public final Region LIZLLL;
    public final List<String> LJ;
    public final boolean LJFF;
    public final Address LJI;
    public final Address LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021f A[PHI: r4
      0x021f: PHI (r4v7 java.lang.String) = (r4v6 java.lang.String), (r4v9 java.lang.String), (r4v9 java.lang.String) binds: [B:124:0x021c, B:107:0x01d8, B:114:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0341 A[PHI: r3
      0x0341: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v6 java.lang.String), (r3v6 java.lang.String) binds: [B:197:0x033e, B:181:0x02fc, B:188:0x0319] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1745680vWo LIZ(X.C1745680vWo r24) {
        /*
            Method dump skipped, instruction units count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746500vY8.LIZ(X.0vWo):X.0vWo");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1745680vWo LJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r20, X.C1745680vWo r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1746500vY8.LJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, X.0vWo):X.0vWo");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r6, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1746500vY8.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r6, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1746500vY8.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r6, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1746500vY8.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, boolean):java.lang.Object");
    }

    public C1746500vY8(InputItemData inputItemData, Address address, List<Region> list, Region region, List<String> list2, boolean z, Address address2, Address address3, String str, boolean z2) {
        this.LIZ = inputItemData;
        this.LIZIZ = address;
        this.LIZJ = list;
        this.LIZLLL = region;
        this.LJ = list2;
        this.LJFF = z;
        this.LJI = address2;
        this.LJII = address3;
        this.LJIIIIZZ = str;
        this.LJIIIZ = z2;
    }
}
