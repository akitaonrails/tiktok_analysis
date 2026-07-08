package X;

import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0I9X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9X {
    public static final C835410Wpv LIZ(PreshownStickerSceneConfig preshownStickerSceneConfig) {
        String value;
        C835410Wpv c835410Wpv = new C835410Wpv(0);
        List<PreshownStickerItem> list = preshownStickerSceneConfig.preshownStickerItem;
        if (list != null) {
            for (PreshownStickerItem preshownStickerItem : list) {
                if (C453560HqU.LIZJ(preshownStickerItem.stickerType)) {
                    value = EnumC1653006dc.TENOR.getValue();
                } else {
                    Integer num = preshownStickerItem.stickerType;
                    int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
                    if (num != null && num.intValue() == type) {
                        value = EnumC1653006dc.AIMOJI.getValue();
                    } else {
                        Integer num2 = preshownStickerItem.stickerType;
                        int type2 = EnumC451180Hme.AISELF_STICKER.getType();
                        if (num2 != null && num2.intValue() == type2) {
                            value = EnumC1653006dc.AISELF.getValue();
                        } else {
                            value = EnumC1653006dc.STICKER.getValue();
                        }
                    }
                }
                c835410Wpv.add(value);
            }
        }
        return c835410Wpv;
    }
}
