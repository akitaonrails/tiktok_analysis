package Y;

import X.C09JN;

/* JADX INFO: loaded from: classes26.dex */
public class AfS87S0101000_25 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS87S0101000_25 r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "AbstractStickerView@dd31.observerStickerPageSelectedForSearchSticker$1$1"
            X.C1C7U.LIZ(r5)
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r1 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r1
            java.lang.Object r0 = r7.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.LLJJL = r0
            java.lang.Object r0 = r7.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r6.i1
            r4 = 1
            r3 = 0
            r2 = 0
            if (r1 != r0) goto L68
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r1 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r1
            com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer r0 = r1.LLJJJJJIL
            if (r0 == 0) goto L41
            X.0sgy r0 = r0.LLJJIJI
            if (r0 != 0) goto L35
            r0 = r3
        L35:
            boolean r0 = r0.LLJJIJIL
            if (r0 != 0) goto L41
            X.0sff r0 = r1.LLJJJJLIIL
            if (r0 != 0) goto L3e
            r0 = r3
        L3e:
            r0.Zf(r2)
        L41:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r0 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r0
            X.0sfK r0 = r0.LJI()
            if (r0 == 0) goto L55
            androidx.lifecycle.LiveData r0 = r0.LJJIJ()
            if (r0 == 0) goto L55
            java.lang.Object r3 = r0.getValue()
        L55:
            X.0soj r0 = X.EnumC1641470soj.ERROR
            if (r3 != r0) goto L64
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r0 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r0
            X.0Gl0 r0 = r0.LLJJJIL
            if (r0 == 0) goto L64
            r0.LJJ(r4)
        L64:
            X.C1C7U.LIZIZ(r5)
            return
        L68:
            java.lang.Object r0 = r7.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r6.i1
            if (r1 != r0) goto L64
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r0 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r0
            com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer r1 = r0.LLJJJJJIL
            if (r1 == 0) goto Lbb
            X.0sgy r0 = r1.LLJJIJI
            if (r0 != 0) goto L83
            r0 = r3
        L83:
            r0.LLJJIJIL = r2
            boolean r0 = r1.LIZJ(r3)
            if (r0 != 0) goto Lbb
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r0 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r0
            X.0sff r0 = r0.LLJJJJLIIL
            if (r0 != 0) goto L94
            r0 = r3
        L94:
            r0.Zf(r4)
        L97:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r0 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r0
            X.0sfK r0 = r0.LJI()
            if (r0 == 0) goto Lab
            androidx.lifecycle.LiveData r0 = r0.LJJIJ()
            if (r0 == 0) goto Lab
            java.lang.Object r3 = r0.getValue()
        Lab:
            X.0soj r0 = X.EnumC1641470soj.ERROR
            if (r3 != r0) goto L64
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r0 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r0
            X.0Gl0 r0 = r0.LLJJJIL
            if (r0 == 0) goto L64
            r0.LJJ(r2)
            goto L64
        Lbb:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView r0 = (com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView) r0
            X.0sff r0 = r0.LLJJJJLIIL
            if (r0 != 0) goto Lc4
            r0 = r3
        Lc4:
            r0.Zf(r2)
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS87S0101000_25.accept$0(Y.AfS87S0101000_25, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[PHI: r5
      0x0027: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v2 java.lang.String) binds: [B:14:0x0025, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS87S0101000_25 r9, java.lang.Object r10) {
        /*
            java.lang.String r8 = "DefaultStickerRepository@bad7.legacyFetchPanelInfo$4"
            X.C1C7U.LIZ(r8)
            X.091S r10 = (X.C091S) r10
            boolean r0 = r10 instanceof X.C23061091v
            if (r0 == 0) goto L89
            T r2 = r10.LIZ
            boolean r1 = r2 instanceof com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel
            r0 = 0
            if (r1 == 0) goto L6b
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r2 = (com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel) r2
        L14:
            java.lang.String r7 = ""
            if (r2 == 0) goto L89
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r2.getCategoryEffectModel()
            if (r0 == 0) goto L24
            java.lang.String r5 = r0.getCategoryKey()
            if (r5 != 0) goto L27
        L24:
            r5 = r7
            if (r2 == 0) goto L89
        L27:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel$Extra r0 = r2.getExtra()
            if (r0 == 0) goto L89
            java.util.List r1 = r0.getFiltered_effects()
            if (r1 == 0) goto L89
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L42:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r3 = r6.next()
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel$FilterEffect r3 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel.FilterEffect) r3
            X.0nou r2 = new X.0nou
            java.lang.Long r0 = r3.getId()
            if (r0 == 0) goto L5c
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L5d
        L5c:
            r1 = r7
        L5d:
            r3.getReasonCode()
            java.lang.String r0 = r3.getReasonMsg()
            r2.<init>(r1, r0)
            r4.add(r2)
            goto L42
        L6b:
            r2 = r0
            goto L14
        L6d:
            int r0 = r5.length()
            if (r0 <= 0) goto L89
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L89
            java.lang.Object r0 = r9.l0
            wuk.f r0 = (wuk.f) r0
            X.11PQ<kotlin.Pair<java.lang.String, java.util.List<X.0nou>>> r1 = r0.LJJIII
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r4)
            r1.onNext(r0)
        L89:
            java.lang.Object r0 = r9.l0
            wuk.f r0 = (wuk.f) r0
            X.11PR<kotlin.Pair<java.lang.Integer, X.091S<?>>> r2 = r0.LJJI
            kotlin.Pair r1 = new kotlin.Pair
            int r0 = r9.i1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r10)
            r2.onNext(r1)
            X.C1C7U.LIZIZ(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS87S0101000_25.accept$1(Y.AfS87S0101000_25, java.lang.Object):void");
    }

    public AfS87S0101000_25(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
