package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sK7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1622490sK7 implements C0LH1 {
    public final InterfaceC1685430txd<Long, Long, String, Effect, Boolean, Boolean, Integer> LIZ;
    public Effect LIZIZ;

    @Override // X.C0LH1
    public final int LIZ() {
        return ((Boolean) C0BJ1.LIZ.getValue()).booleanValue() ? LIZJ(this, null, false, true, 2) : LIZJ(this, null, false, false, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1622490sK7(InterfaceC1685430txd<? super Long, ? super Long, ? super String, ? super Effect, ? super Boolean, ? super Boolean, Integer> interfaceC1685430txd) {
        this.LIZ = interfaceC1685430txd;
    }

    @Override // X.C0LH1
    public int LIZIZ(Effect effect, boolean z) {
        return LIZJ(this, effect, z, false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[PHI: r2
      0x004d: PHI (r2v3 long) = (r2v1 long), (r2v4 long) binds: [B:33:0x008e, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(X.C1622490sK7 r11, com.ss.android.ugc.effectmanager.effect.model.Effect r12, boolean r13, boolean r14, int r15) {
        /*
            r0 = r15 & 2
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r0 = r15 & 4
            if (r0 == 0) goto La
            r14 = 0
        La:
            r11.getClass()
            X.0oCT r2 = X.C2219091BtD.LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "EffectStickerLoader#setSticker:effectId:"
            r1.append(r0)
            r10 = r12
            if (r10 == 0) goto L91
            java.lang.String r0 = r10.getEffectId()
        L21:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.i(r0)
            r11.LIZIZ = r10
            r4 = 0
            if (r10 == 0) goto L8c
            java.lang.String r0 = r10.getEffectId()
            if (r0 == 0) goto L8c
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L8c
            long r2 = r0.longValue()
        L41:
            boolean r0 = X.C1624600sNW.LIZ(r10)
            if (r0 == 0) goto L87
            java.lang.String r9 = X.C1624600sNW.LIZIZ(r10)
            if (r9 != 0) goto L4f
        L4d:
            java.lang.String r9 = ""
        L4f:
            if (r10 == 0) goto L61
            java.lang.String r0 = r10.getEffectId()
            if (r0 == 0) goto L61
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L61
            long r4 = r0.longValue()
        L61:
            X.0oCT r1 = X.C2219091BtD.LIZLLL()
            java.lang.String r0 = "EffectCoreLine: This class is used to set up props for VE after loading props successfully"
            r1.d(r0)
            X.0txd<java.lang.Long, java.lang.Long, java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean, java.lang.Boolean, java.lang.Integer> r6 = r11.LIZ
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r13)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r14)
            java.lang.Object r0 = r6.invoke(r7, r8, r9, r10, r11, r12)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L87:
            java.lang.String r9 = r10.getUnzipPath()
            goto L4f
        L8c:
            r2 = 0
            if (r10 != 0) goto L41
            goto L4d
        L91:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1622490sK7.LIZJ(X.0sK7, com.ss.android.ugc.effectmanager.effect.model.Effect, boolean, boolean, int):int");
    }
}
