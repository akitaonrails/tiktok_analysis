package com.bytedance.android.live.base.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes18.dex */
public final class _ImageModel_Content_ProtoEncoder implements InterfaceC1132110fZB<ImageModel.Content> {
    public static int LIZIZ(ImageModel.Content content) {
        return C1142340fpg.LJIILL(1, content.name) + C1142340fpg.LJIILL(2, content.fontColor) + C1142340fpg.LJIIL(3, content.level);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ImageModel.Content content) {
        ImageModel.Content content2 = content;
        C1142340fpg.LJFF(c1142350fph, 1, content2.name);
        C1142340fpg.LJFF(c1142350fph, 2, content2.fontColor);
        long j = content2.level;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
    }
}
