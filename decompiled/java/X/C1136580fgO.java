package X;

/* JADX INFO: renamed from: X.0fgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136580fgO {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073 A[EDGE_INSN: B:45:0x0073->B:26:0x0073 BREAK  A[LOOP:0: B:8:0x0017->B:14:0x0052], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.util.List r8, X.C1136560fgM r9) {
        /*
            r1 = 0
            if (r8 == 0) goto Lac
            if (r9 == 0) goto Lac
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting.INSTANCE
            boolean r0 = r0.shouldInsertByPriority()
            if (r0 == 0) goto L9b
            X.0fg4 r0 = X.C1136380fg4.LIZ
            r0.getClass()
            java.util.Iterator r7 = r8.iterator()
            r6 = 0
        L17:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r5 = r7.next()
            X.0fgM r5 = (X.C1136560fgM) r5
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "incoming queue message; role: "
            r2.append(r0)
            long r0 = r9.LJJIIJZLJL
            r2.append(r0)
            java.lang.String r0 = "; price: "
            r2.append(r0)
            int r0 = r9.LJI
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "CROSS_SEI"
            X.C1138230fj3.LIZJ(r0, r1)
            long r1 = r5.LJJIIJZLJL
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L57
            long r1 = r9.LJJIIJZLJL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L94
        L52:
            int r6 = r6 + 1
            goto L17
        L55:
            r6 = -1
            goto L73
        L57:
            long r1 = r9.LJJIIJZLJL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L94
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$StickerSDKExtra r0 = r9.LJJII
            if (r0 == 0) goto L8d
            boolean r0 = r0.enableReplay
            if (r0 == 0) goto L8d
            int r1 = r9.LJI
            int r0 = r5.LJI
            if (r1 != r0) goto L8d
            long r3 = r9.LJFF
            long r1 = r5.LJFF
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
        L73:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            int r0 = r1.intValue()
            if (r0 < 0) goto L85
            int r1 = r1.intValue()
        L81:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r8, r1, r9)
            return r1
        L85:
            r0 = r8
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r1 = r0.size()
            goto L81
        L8d:
            int r1 = r9.LJI
            int r0 = r5.LJI
            if (r1 <= r0) goto L52
            goto L73
        L94:
            long r1 = r9.LJJIIJZLJL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L52
            goto L73
        L9b:
            boolean r0 = r9.LJIIIIZZ
            if (r0 == 0) goto La3
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r8, r1, r9)
            return r1
        La3:
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            int r1 = r8.size()
            r8.add(r9)
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136580fgO.LIZ(java.util.List, X.0fgM):int");
    }
}
