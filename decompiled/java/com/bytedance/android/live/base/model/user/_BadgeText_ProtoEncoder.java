package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _BadgeText_ProtoEncoder implements InterfaceC1132110fZB<BadgeText> {
    public static int LIZJ(BadgeText badgeText) {
        int iLJIILL = C1142340fpg.LJIILL(1, badgeText.key) + C1142340fpg.LJIILL(2, badgeText.defaultPattern);
        List<String> list = badgeText.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < badgeText.pieces.size(); i++) {
                iLJIILL += C1142340fpg.LJIILL(3, (String) ListProtector.get(badgeText.pieces, i));
            }
        }
        return iLJIILL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, BadgeText badgeText) {
        C1142340fpg.LJFF(c1142350fph, 1, badgeText.key);
        C1142340fpg.LJFF(c1142350fph, 2, badgeText.defaultPattern);
        List<String> list = badgeText.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < badgeText.pieces.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 3, (String) ListProtector.get(badgeText.pieces, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, BadgeText badgeText) {
        LIZIZ(c1142350fph, badgeText);
    }
}
