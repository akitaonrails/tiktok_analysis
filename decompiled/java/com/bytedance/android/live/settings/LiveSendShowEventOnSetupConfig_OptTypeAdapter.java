package com.bytedance.android.live.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSendShowEventOnSetupConfig_OptTypeAdapter extends TypeAdapter<LiveSendShowEventOnSetupConfig> {
    public final Gson LIZ;

    public LiveSendShowEventOnSetupConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSendShowEventOnSetupConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSendShowEventOnSetupConfig liveSendShowEventOnSetupConfig = new LiveSendShowEventOnSetupConfig(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "allowed_enter_from_merge")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveSendShowEventOnSetupConfig.allowedEnterFromMerge = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveSendShowEventOnSetupConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSendShowEventOnSetupConfig liveSendShowEventOnSetupConfig) {
        LiveSendShowEventOnSetupConfig liveSendShowEventOnSetupConfig2 = liveSendShowEventOnSetupConfig;
        if (liveSendShowEventOnSetupConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("allowed_enter_from_merge");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveSendShowEventOnSetupConfig2.allowedEnterFromMerge, String.class);
        c09dl.LJII();
    }
}
