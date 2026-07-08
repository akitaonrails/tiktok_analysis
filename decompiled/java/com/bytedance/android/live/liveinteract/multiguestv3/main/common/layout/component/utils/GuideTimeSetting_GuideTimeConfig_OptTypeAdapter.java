package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils.GuideTimeSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class GuideTimeSetting_GuideTimeConfig_OptTypeAdapter extends TypeAdapter<GuideTimeSetting.GuideTimeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final GuideTimeSetting.GuideTimeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GuideTimeSetting.GuideTimeConfig guideTimeConfig = new GuideTimeSetting.GuideTimeConfig(10000L, 10000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "guest_invite_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    guideTimeConfig.guestInviteTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "apply_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    guideTimeConfig.applyTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return guideTimeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GuideTimeSetting.GuideTimeConfig guideTimeConfig) throws IOException {
        GuideTimeSetting.GuideTimeConfig guideTimeConfig2 = guideTimeConfig;
        if (guideTimeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("guest_invite_time");
        c09dl.LJJIZ(guideTimeConfig2.guestInviteTime);
        c09dl.LJIILLIIL("apply_time");
        c09dl.LJJIZ(guideTimeConfig2.applyTime);
        c09dl.LJII();
    }
}
