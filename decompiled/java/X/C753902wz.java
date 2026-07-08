package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.02wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C753902wz extends C09AY implements Function1<C700640Re2, C700640Re2> {
    public C753902wz() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[PHI: r8
      0x007f: PHI (r8v4 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:24:0x007d, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[PHI: r8
      0x0085: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:24:0x007d, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[PHI: r8 r9
      0x0097: PHI (r8v1 java.lang.String) = (r8v3 java.lang.String), (r8v4 java.lang.String) binds: [B:28:0x0086, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r9v0 java.lang.String) = (r9v2 java.lang.String), (r9v3 java.lang.String) binds: [B:28:0x0086, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C700640Re2 invoke(X.C700640Re2 r19) {
        /*
            r18 = this;
            r12 = r19
            X.0Re2 r12 = (X.C700640Re2) r12
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.feed.model.GlobalComponentData> r13 = r12.LIZLLL
            com.ss.android.ugc.aweme.feed.model.RealtimeFcpConfig r0 = r12.LJFF
            com.ss.android.ugc.aweme.feed.model.RealtimeComponentConfig r0 = r0.realtimeComponentConfig
            if (r0 == 0) goto L10
            java.util.List<com.ss.android.ugc.aweme.feed.model.GlobalComponentData> r2 = r0.componentDataList
            if (r2 != 0) goto L12
        L10:
            X.13BV r2 = X.C13BV.INSTANCE
        L12:
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L22
            r1 = 16
        L22:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.GlobalComponentData r0 = (com.ss.android.ugc.aweme.feed.model.GlobalComponentData) r0
            java.lang.String r0 = r0.getComponentKey()
            r3.put(r0, r1)
            goto L2b
        L40:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L48:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            boolean r0 = r13.containsKey(r0)
            if (r0 == 0) goto L48
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r2 = r13.get(r0)
            com.ss.android.ugc.aweme.feed.model.GlobalComponentData r2 = (com.ss.android.ugc.aweme.feed.model.GlobalComponentData) r2
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r5 = r3.getValue()
            com.ss.android.ugc.aweme.feed.model.GlobalComponentData r5 = (com.ss.android.ugc.aweme.feed.model.GlobalComponentData) r5
            java.lang.String r0 = ""
            if (r2 == 0) goto L7c
            java.lang.String r8 = r2.getMatchedContainerKey()
            if (r8 != 0) goto L7f
        L7c:
            r8 = r0
            if (r2 == 0) goto L85
        L7f:
            java.lang.String r9 = r2.getParentContainerKey()
            if (r9 != 0) goto L97
        L85:
            r9 = r0
            if (r2 != 0) goto L97
            r10 = 0
        L89:
            java.lang.String r6 = r5.componentKey
            int r7 = r5.showStrategy
            java.lang.Integer r11 = r5.priorityIndex
            com.ss.android.ugc.aweme.feed.model.GlobalComponentData r0 = r5.copy(r6, r7, r8, r9, r10, r11)
            r13.put(r1, r0)
            goto L48
        L97:
            int r10 = r2.getCustomShowLimit()
            goto L89
        L9c:
            r14 = 0
            r17 = 247(0xf7, float:3.46E-43)
            r15 = r14
            r16 = r14
            X.0Re2 r0 = X.C700640Re2.LIZ(r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C753902wz.invoke(java.lang.Object):java.lang.Object");
    }
}
