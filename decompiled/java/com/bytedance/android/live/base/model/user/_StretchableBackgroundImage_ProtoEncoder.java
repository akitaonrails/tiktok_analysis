package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _StretchableBackgroundImage_ProtoEncoder implements InterfaceC1132110fZB<StretchableBackgroundImage> {
    public static int LIZJ(StretchableBackgroundImage stretchableBackgroundImage) {
        int iLJ = _ImageModel_ProtoEncoder.LJ(1, stretchableBackgroundImage.image);
        List<Long> list = stretchableBackgroundImage.flexSettings;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < stretchableBackgroundImage.flexSettings.size(); i++) {
                iLJ += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(stretchableBackgroundImage.flexSettings, i));
            }
        }
        return iLJ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, StretchableBackgroundImage stretchableBackgroundImage) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, stretchableBackgroundImage.image);
        List<Long> list = stretchableBackgroundImage.flexSettings;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < stretchableBackgroundImage.flexSettings.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(stretchableBackgroundImage.flexSettings, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, StretchableBackgroundImage stretchableBackgroundImage) {
        LIZIZ(c1142350fph, stretchableBackgroundImage);
    }
}
