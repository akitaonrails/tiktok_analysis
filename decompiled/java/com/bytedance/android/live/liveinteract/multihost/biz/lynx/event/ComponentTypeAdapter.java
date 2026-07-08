package com.bytedance.android.live.liveinteract.multihost.biz.lynx.event;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.EnumC125100dl;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ComponentTypeAdapter extends TypeAdapter<EnumC125100dl> {
    @Override // com.google.gson.TypeAdapter
    public final EnumC125100dl read(C09CU c09cu) throws IOException {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            c09cu.LJJJJJL();
        } else {
            int iLJJIZ = c09cu.LJJIZ();
            for (EnumC125100dl enumC125100dl : EnumC125100dl.values()) {
                if (enumC125100dl.getValue() == iLJJIZ) {
                    return enumC125100dl;
                }
            }
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnumC125100dl enumC125100dl) {
        EnumC125100dl enumC125100dl2 = enumC125100dl;
        if (enumC125100dl2 == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LJJJJ(Integer.valueOf(enumC125100dl2.getValue()));
        }
    }
}
