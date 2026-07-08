package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextBadge_ProtoEncoder implements InterfaceC1132110fZB<TextBadge> {
    public static int LIZJ(TextBadge textBadge) {
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, textBadge.badgeDisplayType) + C1142340fpg.LJIILL(2, textBadge.key) + C1142340fpg.LJIILL(3, textBadge.defaultPattern);
        List<String> list = textBadge.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < textBadge.pieces.size(); i++) {
                iLJIIIZ += C1142340fpg.LJIILL(4, (String) ListProtector.get(textBadge.pieces, i));
            }
        }
        return iLJIIIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, TextBadge textBadge) {
        int i = textBadge.badgeDisplayType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, textBadge.key);
        C1142340fpg.LJFF(c1142350fph, 3, textBadge.defaultPattern);
        List<String> list = textBadge.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < textBadge.pieces.size(); i2++) {
                C1142340fpg.LJFF(c1142350fph, 4, (String) ListProtector.get(textBadge.pieces, i2));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextBadge textBadge) {
        LIZIZ(c1142350fph, textBadge);
    }
}
