package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1814860xKO extends C2217421BqW implements InterfaceC1631630sYr<Float, Boolean, Long, C1814980xKa, Unit> {
    public C1814860xKO(BoardsDisplayViewModel boardsDisplayViewModel) {
        super(4, boardsDisplayViewModel, BoardsDisplayViewModel.class, "onBoardItemScaleChanged", "onBoardItemScaleChanged(FZJLcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/base/BoardLogInfo;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0093 A[PHI: r9
      0x0093: PHI (r9v6 java.lang.String) = (r9v0 java.lang.String), (r9v7 java.lang.String) binds: [B:46:0x0091, B:44:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[PHI: r9
      0x0097: PHI (r9v5 java.lang.String) = (r9v0 java.lang.String), (r9v6 java.lang.String) binds: [B:46:0x0091, B:48:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a A[PHI: r9 r10
      0x009a: PHI (r9v1 java.lang.String) = (r9v5 java.lang.String), (r9v6 java.lang.String) binds: [B:50:0x0098, B:48:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r10v1 java.lang.String) = (r10v5 java.lang.String), (r10v6 java.lang.String) binds: [B:50:0x0098, B:48:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[PHI: r9 r10
      0x009e: PHI (r9v4 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:52:0x009c, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r10v4 java.lang.String) = (r10v1 java.lang.String), (r10v5 java.lang.String) binds: [B:52:0x009c, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1 A[PHI: r9 r10 r11
      0x00a1: PHI (r9v3 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:52:0x009c, B:54:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r10v3 java.lang.String) = (r10v1 java.lang.String), (r10v4 java.lang.String) binds: [B:52:0x009c, B:54:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r11v3 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:52:0x009c, B:54:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4 A[PHI: r8
      0x00b4: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:39:0x0082, B:37:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    @Override // X.InterfaceC1631630sYr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Float r14, java.lang.Boolean r15, java.lang.Long r16, X.C1814980xKa r17) {
        /*
            r13 = this;
            r0 = r16
            r2 = r17
            java.lang.Number r14 = (java.lang.Number) r14
            float r8 = r14.floatValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r11 = r15.booleanValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.0xKa r2 = (X.C1814980xKa) r2
            java.lang.Object r7 = r13.receiver
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel r7 = (com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel) r7
            X.0xJr r3 = r7.LLILLJJLI
            r10 = 0
            if (r3 == 0) goto Lbf
            X.0951 r3 = r3.LJIIL()
            if (r3 == 0) goto Lbf
            java.lang.Object r4 = r3.getValue()
            X.0uMb r4 = (X.AbstractC1700910uMb) r4
        L2d:
            boolean r3 = r4 instanceof X.InterfaceC490060JJs
            if (r3 == 0) goto Lbc
            X.0JJs r4 = (X.InterfaceC490060JJs) r4
        L33:
            if (r4 == 0) goto Lba
            com.bytedance.android.livesdk.model.Board r3 = r4.LIZIZ()
            if (r3 == 0) goto Lba
            java.util.List<com.bytedance.android.livesdk.model.BoardItem> r3 = r3.boardItemList
            if (r3 == 0) goto Lba
            java.util.Iterator r9 = r3.iterator()
        L43:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r6 = r9.next()
            r3 = r6
            com.bytedance.android.livesdk.model.BoardItem r3 = (com.bytedance.android.livesdk.model.BoardItem) r3
            long r4 = r3.id
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L43
            r10 = r6
        L57:
            com.bytedance.android.livesdk.model.BoardItem r10 = (com.bytedance.android.livesdk.model.BoardItem) r10
            if (r10 == 0) goto Lba
            com.bytedance.android.livesdk.model.BoardItemTransform r3 = r10.transform
            if (r3 == 0) goto Lba
            float r5 = r3.scale
        L61:
            X.0xJr r4 = r7.LLILLJJLI
            if (r4 == 0) goto L6d
            X.0wL9 r3 = new X.0wL9
            r3.<init>(r0)
            r4.LIZJ(r3, r8)
        L6d:
            if (r11 != 0) goto Lb1
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto Lb1
            if (r3 >= 0) goto Lb7
            java.lang.String r3 = "zoom_in"
        L77:
            java.lang.String r4 = r7.LLILZIL
            java.lang.String r12 = ""
            if (r2 == 0) goto L81
            java.lang.String r8 = r2.LJ
            if (r8 != 0) goto Lb4
        L81:
            r8 = r12
            if (r2 != 0) goto Lb4
            r5 = 0
        L86:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            if (r2 == 0) goto L90
            java.lang.String r9 = r2.LJFF
            if (r9 != 0) goto L93
        L90:
            r9 = r12
            if (r2 == 0) goto L97
        L93:
            java.lang.String r10 = r2.LJII
            if (r10 != 0) goto L9a
        L97:
            r10 = r12
            if (r2 == 0) goto L9e
        L9a:
            java.lang.String r11 = r2.LJIIIIZZ
            if (r11 != 0) goto La1
        L9e:
            r11 = r12
            if (r2 == 0) goto Lae
        La1:
            com.bytedance.android.livesdk.model.RecommendBoardInfo r0 = r2.LJI
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdk.model.SourcePB r0 = r0.sourcePb
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.generateVersion
            if (r0 == 0) goto Lae
            r12 = r0
        Lae:
            X.C01DX.LIZ(r3, r4, r5, r7, r8, r9, r10, r11, r12)
        Lb1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb4:
            long r5 = r2.LIZ
            goto L86
        Lb7:
            java.lang.String r3 = "zoom_out"
            goto L77
        Lba:
            r5 = 0
            goto L61
        Lbc:
            r4 = r10
            goto L33
        Lbf:
            r4 = r10
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1814860xKO.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
