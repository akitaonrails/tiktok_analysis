package X;

import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiSlashContextAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0h0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187660h0m implements InterfaceC1187750h0v {
    public final PoiDetailSlashFragment LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    @Override // X.InterfaceC1187750h0v
    public final Map<String, Object> LIZ() {
        C1185600gxS c1185600gxS;
        C1173300gdc<C1185600gxS> c1173300gdcQr0 = this.LIZ.qr0();
        C1185410gx9 c1185410gx9 = (c1173300gdcQr0 == null || (c1185600gxS = c1173300gdcQr0.LIZ) == null) ? null : c1185600gxS.LJFF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJIJI(linkedHashMap, "enter_from", c1185410gx9 != null ? c1185410gx9.getEnterFrom() : null);
        C1189060h32.LJIJI(linkedHashMap, "enter_method", c1185410gx9 != null ? c1185410gx9.getEnterMethod() : null);
        C1189060h32.LJIJI(linkedHashMap, "initial_poi_enter_from", c1185410gx9 != null ? c1185410gx9.getInitialEnterFrom() : null);
        C1189060h32.LJIJI(linkedHashMap, "initial_poi_enter_method", c1185410gx9 != null ? c1185410gx9.getInitialEnterMethod() : null);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // X.InterfaceC1187750h0v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJFF() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment r0 = r7.LIZ
            X.0gdc r0 = r0.qr0()
            if (r0 == 0) goto L74
            CONTEXT r0 = r0.LIZ
            X.0gxS r0 = (X.C1185600gxS) r0
            if (r0 == 0) goto L74
            X.0gx9 r6 = r0.LJFF
        L10:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            X.01GW r0 = r7.LIZJ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "session_id"
            X.C1189060h32.LJIJI(r4, r0, r1)
            if (r6 == 0) goto L72
            java.lang.Boolean r1 = r6.getHasEnterPoi()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L2c:
            java.lang.String r3 = "1"
            java.lang.String r5 = ""
            java.lang.String r2 = "0"
            if (r0 == 0) goto L60
            r1 = r2
        L35:
            java.lang.String r0 = "is_first_enter_page"
            X.C1189060h32.LJIJI(r4, r0, r1)
            if (r6 == 0) goto L5e
            java.lang.Boolean r1 = r6.getHasEnterSamePoi()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4f
            r3 = r2
        L49:
            java.lang.String r0 = "is_first_enter_same_poi_page"
            X.C1189060h32.LJIJI(r4, r0, r3)
            return r4
        L4f:
            if (r6 == 0) goto L5e
            java.lang.Boolean r1 = r6.getHasEnterSamePoi()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5e
            goto L49
        L5e:
            r3 = r5
            goto L49
        L60:
            if (r6 == 0) goto L70
            java.lang.Boolean r1 = r6.getHasEnterPoi()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L70
            r1 = r3
            goto L35
        L70:
            r1 = r5
            goto L35
        L72:
            r0 = 0
            goto L2c
        L74:
            r6 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187660h0m.LJFF():java.util.Map");
    }

    public final boolean LJI() {
        IPoiSlashContextAbility iPoiSlashContextAbility = (IPoiSlashContextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IPoiSlashContextAbility.class, null);
        if (iPoiSlashContextAbility != null) {
            return iPoiSlashContextAbility.FU();
        }
        return false;
    }

    public C1187660h0m(PoiDetailSlashFragment poiDetailSlashFragment) {
        this.LIZ = poiDetailSlashFragment;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZIZ = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1110));
        this.LIZJ = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1109));
    }

    @Override // X.InterfaceC1187750h0v
    public final Map<String, Object> LIZJ(String str, C1187790h0z c1187790h0z) {
        C1187650h0l c1187650h0l = C1187650h0l.LIZ;
        PoiDetailSlashFragment poiDetailSlashFragment = this.LIZ;
        c1187650h0l.getClass();
        return C1187650h0l.LIZIZ(poiDetailSlashFragment, str, c1187790h0z);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e A[PHI: r21
      0x009e: PHI (r21v1 java.lang.String) = (r21v0 java.lang.String), (r21v10 java.lang.String) binds: [B:40:0x009b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3 A[PHI: r21 r22
      0x00a3: PHI (r21v2 java.lang.String) = (r21v1 java.lang.String), (r21v9 java.lang.String) binds: [B:43:0x00a0, B:26:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r22v1 java.lang.String) = (r22v0 java.lang.String), (r22v8 java.lang.String) binds: [B:43:0x00a0, B:26:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[PHI: r21 r22 r23
      0x00a8: PHI (r21v3 java.lang.String) = (r21v2 java.lang.String), (r21v8 java.lang.String) binds: [B:46:0x00a5, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r22v2 java.lang.String) = (r22v1 java.lang.String), (r22v7 java.lang.String) binds: [B:46:0x00a5, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r23v1 java.lang.String) = (r23v0 java.lang.String), (r23v6 java.lang.String) binds: [B:46:0x00a5, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[PHI: r21 r22 r23 r24
      0x00ad: PHI (r21v4 java.lang.String) = (r21v3 java.lang.String), (r21v7 java.lang.String) binds: [B:49:0x00aa, B:32:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v6 java.lang.String) binds: [B:49:0x00aa, B:32:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r23v2 java.lang.String) = (r23v1 java.lang.String), (r23v5 java.lang.String) binds: [B:49:0x00aa, B:32:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r24v1 java.lang.String) = (r24v0 java.lang.String), (r24v4 java.lang.String) binds: [B:49:0x00aa, B:32:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1187750h0v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r28, com.ss.android.ugc.aweme.slash.component.BaseComponentData r29) {
        /*
            r27 = this;
            X.0gye r2 = X.C1186340gye.LIZ
            r3 = r27
            com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment r5 = r3.LIZ
            X.01GW r0 = r3.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            X.01GW r0 = r3.LIZJ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r6 = r3.LJI()
            r2.getClass()
            X.0gdc r0 = r5.qr0()
            r26 = 0
            if (r0 == 0) goto Lbf
            CONTEXT r0 = r0.LIZ
            X.0gxS r0 = (X.C1185600gxS) r0
        L2d:
            X.0h0n r4 = X.C1187670h0n.LIZ
            X.0grX r2 = r5.Pu2()
            java.lang.String r10 = r2.LIZJ
            r7 = r29
            if (r7 == 0) goto Lbb
            java.lang.String r11 = r7.instanceId
        L3b:
            if (r0 == 0) goto Lb8
            java.lang.String r13 = r0.LIZ
        L3f:
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r8
            if (r0 == 0) goto Lb5
            X.0gx9 r2 = r0.LJFF
            if (r2 == 0) goto Lb5
            java.lang.String r16 = r2.getEnterFrom()
        L4e:
            if (r7 == 0) goto Lb2
            java.lang.String r3 = r7.updateType
        L52:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r6)
            java.lang.String r20 = X.C1186340gye.LIZ(r7, r5)
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r2 = r0.LJIIIZ
            if (r2 == 0) goto L99
            java.lang.String r21 = r2.getCollectInfo()
        L64:
            X.0gx9 r2 = r0.LJFF
            if (r2 == 0) goto L9e
            java.lang.String r22 = r2.getEnterMethod()
        L6c:
            X.0gx9 r2 = r0.LJFF
            if (r2 == 0) goto La3
            java.lang.String r23 = r2.getInitialEnterFrom()
        L74:
            X.0gx9 r2 = r0.LJFF
            if (r2 == 0) goto La8
            java.lang.String r24 = r2.getInitialEnterMethod()
        L7c:
            X.0gx9 r2 = r0.LJFF
            if (r2 == 0) goto Lad
            java.lang.Boolean r25 = r2.getHasEnterPoi()
        L84:
            X.0gx9 r0 = r0.LJFF
            if (r0 == 0) goto L8c
            java.lang.Boolean r26 = r0.getHasEnterSamePoi()
        L8c:
            r4.getClass()
            r12 = r28
            r18 = r3
            r17 = r1
            X.C1187670h0n.LIZ(r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L99:
            r21 = r26
            if (r0 == 0) goto L9e
            goto L64
        L9e:
            r22 = r26
            if (r0 == 0) goto La3
            goto L6c
        La3:
            r23 = r26
            if (r0 == 0) goto La8
            goto L74
        La8:
            r24 = r26
            if (r0 == 0) goto Lad
            goto L7c
        Lad:
            r25 = r26
            if (r0 == 0) goto L8c
            goto L84
        Lb2:
            r3 = r26
            goto L52
        Lb5:
            r16 = r26
            goto L4e
        Lb8:
            r13 = r26
            goto L3f
        Lbb:
            r11 = r26
            goto L3b
        Lbf:
            r0 = r26
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187660h0m.LIZLLL(java.lang.String, com.ss.android.ugc.aweme.slash.component.BaseComponentData):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[PHI: r30
      0x00c5: PHI (r30v1 java.lang.Boolean) = (r30v0 java.lang.Boolean), (r30v3 java.lang.Boolean) binds: [B:47:0x00c2, B:42:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd A[PHI: r23
      0x00cd: PHI (r23v1 java.lang.String) = (r23v0 java.lang.String), (r23v7 java.lang.String) binds: [B:51:0x00ca, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2 A[PHI: r23 r24
      0x00d2: PHI (r23v2 java.lang.String) = (r23v1 java.lang.String), (r23v6 java.lang.String) binds: [B:54:0x00cf, B:31:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r24v1 java.lang.String) = (r24v0 java.lang.String), (r24v5 java.lang.String) binds: [B:54:0x00cf, B:31:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7 A[PHI: r23 r24 r25
      0x00d7: PHI (r23v3 java.lang.String) = (r23v2 java.lang.String), (r23v5 java.lang.String) binds: [B:57:0x00d4, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r24v2 java.lang.String) = (r24v1 java.lang.String), (r24v4 java.lang.String) binds: [B:57:0x00d4, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r25v1 java.lang.String) = (r25v0 java.lang.String), (r25v3 java.lang.String) binds: [B:57:0x00d4, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1187750h0v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.slash.component.BaseComponentData r34, X.C1187790h0z r35) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187660h0m.LJ(com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.0h0z):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[PHI: r33
      0x00d7: PHI (r33v1 java.lang.Boolean) = (r33v0 java.lang.Boolean), (r33v3 java.lang.Boolean) binds: [B:49:0x00d4, B:44:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df A[PHI: r26
      0x00df: PHI (r26v1 java.lang.String) = (r26v0 java.lang.String), (r26v7 java.lang.String) binds: [B:53:0x00dc, B:30:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4 A[PHI: r26 r27
      0x00e4: PHI (r26v2 java.lang.String) = (r26v1 java.lang.String), (r26v6 java.lang.String) binds: [B:56:0x00e1, B:33:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r27v1 java.lang.String) = (r27v0 java.lang.String), (r27v5 java.lang.String) binds: [B:56:0x00e1, B:33:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9 A[PHI: r26 r27 r28
      0x00e9: PHI (r26v3 java.lang.String) = (r26v2 java.lang.String), (r26v5 java.lang.String) binds: [B:59:0x00e6, B:36:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r27v2 java.lang.String) = (r27v1 java.lang.String), (r27v4 java.lang.String) binds: [B:59:0x00e6, B:36:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r28v1 java.lang.String) = (r28v0 java.lang.String), (r28v3 java.lang.String) binds: [B:59:0x00e6, B:36:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1187750h0v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC1541990qEH r37, boolean r38, java.lang.String r39, com.ss.android.ugc.aweme.slash.component.BaseComponentData r40, X.C1187790h0z r41) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187660h0m.LIZIZ(X.0qEH, boolean, java.lang.String, com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.0h0z):void");
    }
}
