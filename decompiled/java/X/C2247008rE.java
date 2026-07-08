package X;

import java.util.Map;

/* JADX INFO: renamed from: X.08rE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2247008rE {
    public final /* synthetic */ Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC1635390sev LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean> LIZ(java.util.List<java.util.List<com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>> r7) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r7.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto Le
        L1e:
            java.util.Iterator r5 = r2.iterator()
        L22:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r4 = r5.next()
            X.11UL r4 = (X.C11UL) r4
            java.util.Iterator r3 = r6.iterator()
        L32:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.11UL r0 = (X.C11UL) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.effect
            java.lang.String r1 = r0.getEffectId()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4.effect
            java.lang.String r0 = r0.getEffectId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L32
            if (r2 != 0) goto L22
        L53:
            r6.add(r4)
            goto L22
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2247008rE.LIZ(java.util.List):java.util.List");
    }

    public C2247008rE(InterfaceC1635390sev interfaceC1635390sev, Map map) {
        this.LIZ = map;
        this.LIZIZ = interfaceC1635390sev;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r12, kotlin.jvm.functions.Function1 r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C2246908rD
            r6 = r11
            if (r0 == 0) goto L42
            r4 = r12
            X.08rD r4 = (X.C2246908rD) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILZ = r2
        L13:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 != r0) goto L48
            java.lang.Object r9 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L25:
            return r9
        L26:
            X.C155000ia.LIZIZ(r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.08qj r5 = new X.08qj
            java.util.Map<java.lang.String, java.lang.String> r8 = r6.LIZ
            r10 = 0
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LL = r9
            r4.LLILZ = r0
            java.lang.Object r0 = X.C2296808zG.LJ(r5, r4)
            if (r0 != r2) goto L25
            return r2
        L42:
            X.08rD r4 = new X.08rD
            r4.<init>(r6, r12)
            goto L13
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2247008rE.LIZIZ(X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
