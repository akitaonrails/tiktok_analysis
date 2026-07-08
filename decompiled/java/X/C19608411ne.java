package X;

import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;

/* JADX INFO: renamed from: X.11ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19608411ne extends AbstractC19589811ke<LocationStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19608311nd.LIZ[LJ().LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new C19594011lK(LJ().LIZLLL, LJ());
            }
            throw new C1954807lC();
        }
        C19623411q4 c19623411q4 = new C19623411q4(LJ().LIZLLL, null);
        C1866270yfJ c1866270yfJ = LJ().LJ;
        if (c1866270yfJ != null && c1866270yfJ.LJFF) {
            return c19623411q4;
        }
        c19623411q4.LJJJJJ(LJ().LJIIIZ);
        return c19623411q4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        r43 = X.EnumC1466210oG3.DEFAULT;
     */
    @Override // X.AbstractC19589811ke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.tools.sticker.core.StickerModel LJII(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r50) {
        /*
            r49 = this;
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r5 = new com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel
            r6 = 0
            X.0oFx r8 = X.EnumC1466150oFx.LOCATION
            r4 = 0
            r11 = 0
            r45 = 0
            r22 = 0
            r42 = -5
            r43 = 15
            r7 = r6
            r9 = r6
            r10 = r6
            r12 = r11
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r23 = r11
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r11
            r28 = r11
            r29 = r11
            r30 = r11
            r31 = r11
            r32 = r11
            r33 = r6
            r34 = r11
            r35 = r11
            r36 = r6
            r37 = r11
            r38 = r22
            r39 = r22
            r40 = r22
            r41 = r6
            r44 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct r0 = r50.getPoiStickerStruct()
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.poi.PoiData r44 = r0.getPoiData()
        L57:
            X.0oG3[] r3 = X.EnumC1466210oG3.values()
            int r2 = r3.length
        L5c:
            if (r4 >= r2) goto L72
            r43 = r3[r4]
            com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct r0 = r50.getPoiStickerStruct()
            if (r0 == 0) goto L8e
            int r1 = r43.getType()
            int r0 = r0.getStickerTheme()
            if (r1 != r0) goto L8e
            if (r43 != 0) goto L74
        L72:
            X.0oG3 r43 = X.EnumC1466210oG3.DEFAULT
        L74:
            X.11ks r0 = r49.LJ()
            X.0yfJ r0 = r0.LJ
            if (r0 == 0) goto L8c
            boolean r0 = r0.LJFF
        L7e:
            com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel r41 = new com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel
            r46 = 1106247680(0x41f00000, float:30.0)
            r42 = r5
            r47 = r22
            r48 = r0
            r41.<init>(r42, r43, r44, r45, r46, r47, r48)
            return r41
        L8c:
            r0 = 0
            goto L7e
        L8e:
            int r4 = r4 + 1
            goto L5c
        L91:
            r44 = r22
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19608411ne.LJII(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):com.ss.android.ugc.aweme.tools.sticker.core.StickerModel");
    }
}
