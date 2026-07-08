package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestSupportExpandDefaultLayoutSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestSupportExpandDefaultLayoutSetting_ExpandLayoutInfo_OptTypeAdapter extends TypeAdapter<MultiGuestSupportExpandDefaultLayoutSetting.ExpandLayoutInfo> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestSupportExpandDefaultLayoutSetting.ExpandLayoutInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestSupportExpandDefaultLayoutSetting.ExpandLayoutInfo expandLayoutInfo = new MultiGuestSupportExpandDefaultLayoutSetting.ExpandLayoutInfo();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "layout_style")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    expandLayoutInfo.layoutStyle = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "max_position")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    expandLayoutInfo.maxPosition = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return expandLayoutInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestSupportExpandDefaultLayoutSetting.ExpandLayoutInfo expandLayoutInfo) {
        MultiGuestSupportExpandDefaultLayoutSetting.ExpandLayoutInfo expandLayoutInfo2 = expandLayoutInfo;
        if (expandLayoutInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("layout_style");
        c09dl.LJJJJ(Integer.valueOf(expandLayoutInfo2.layoutStyle));
        c09dl.LJIILLIIL("max_position");
        c09dl.LJJJJ(Integer.valueOf(expandLayoutInfo2.maxPosition));
        c09dl.LJII();
    }
}
