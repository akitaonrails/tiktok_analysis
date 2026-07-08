package com.bytedance.android.live.base.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _ImageModel_ProtoEncoder implements InterfaceC1132110fZB<ImageModel> {
    public static int LIZLLL(ImageModel imageModel) {
        int iLJIILL;
        int iLIZ = 0;
        if (imageModel == null) {
            return 0;
        }
        List<String> list = imageModel.mUrls;
        if (list != null && !list.isEmpty()) {
            iLJIILL = 0;
            for (int i = 0; i < imageModel.mUrls.size(); i++) {
                iLJIILL += C1142340fpg.LJIILL(1, (String) ListProtector.get(imageModel.mUrls, i));
            }
        } else {
            iLJIILL = 0;
        }
        int iLJIILL2 = iLJIILL + C1142340fpg.LJIILL(2, imageModel.mUri) + C1142340fpg.LJIIL(3, imageModel.height) + C1142340fpg.LJIIL(4, imageModel.width) + C1142340fpg.LJIILL(5, imageModel.avgColor) + C1142340fpg.LJIIIZ(6, imageModel.imageType) + C1142340fpg.LJIILL(7, imageModel.schema);
        ImageModel.Content content = imageModel.content;
        if (content != null) {
            int iLIZIZ = _ImageModel_Content_ProtoEncoder.LIZIZ(content);
            iLIZ = C1142350fph.LIZ(8) + iLIZIZ + C1142350fph.LIZIZ(iLIZIZ);
        }
        return iLJIILL2 + iLIZ + C1142340fpg.LJI(9);
    }

    public static void LIZIZ(C1142350fph c1142350fph, ImageModel imageModel) {
        List<String> list = imageModel.mUrls;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < imageModel.mUrls.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 1, (String) ListProtector.get(imageModel.mUrls, i));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 2, imageModel.mUri);
        long j = imageModel.height;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
        long j2 = imageModel.width;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LJFF(c1142350fph, 5, imageModel.avgColor);
        int i2 = imageModel.imageType;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i2);
        C1142340fpg.LJFF(c1142350fph, 7, imageModel.schema);
        ImageModel.Content content = imageModel.content;
        if (content != null) {
            c1142350fph.LIZLLL(8, 2);
            c1142350fph.LJ(_ImageModel_Content_ProtoEncoder.LIZIZ(content));
            C1142340fpg.LJFF(c1142350fph, 1, content.name);
            C1142340fpg.LJFF(c1142350fph, 2, content.fontColor);
            long j3 = content.level;
            c1142350fph.LIZLLL(3, 0);
            c1142350fph.LJFF(j3);
        }
        boolean z = imageModel.isAnimated;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }

    public static int LJ(int i, ImageModel imageModel) {
        if (imageModel == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(imageModel);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ImageModel imageModel) {
        LIZIZ(c1142350fph, imageModel);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, ImageModel imageModel) {
        if (imageModel == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(imageModel));
        LIZIZ(c1142350fph, imageModel);
    }
}
