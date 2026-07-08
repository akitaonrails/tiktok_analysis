package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;

/* JADX INFO: renamed from: X.0mdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403820mdQ {
    public static final C1403810mdP LIZ = new C1403810mdP(0);
    public static final int[] LIZIZ = {7, 8, 9, 18, 19, 24, 26};

    public static boolean LIZ(StickerItemModel stickerItemModel) {
        int i;
        int i2;
        if (!LIZ.LIZ.invoke(stickerItemModel).booleanValue() || (i = stickerItemModel.type) == 2 || i == 13 || i == 1000 || C13LQ.LJIILJJIL(i, LIZIZ) || (i2 = stickerItemModel.type) == 4 || i2 == 22 || i2 == 21) {
            return false;
        }
        return true;
    }
}
