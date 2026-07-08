package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class GroupSettingMap_OptTypeAdapter extends TypeAdapter<GroupSettingMap> {
    public final Gson LIZ;

    public GroupSettingMap_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GroupSettingMap read(C09CU c09cu) {
        GroupSettingMap groupSettingMap = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            groupSettingMap = new GroupSettingMap(C1697810uHb.LJIIJJI("MultiGuest", "Cohost", "Enhance", "Interact", "ServicePlus"), C2097608Jq.LJ());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "groups")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        groupSettingMap.groups = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "setting_map")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        groupSettingMap.map = C473040Igo.LIZIZ(this.LIZ, c09cu, GroupSetting.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return groupSettingMap;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GroupSettingMap groupSettingMap) {
        GroupSettingMap groupSettingMap2 = groupSettingMap;
        if (groupSettingMap2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("groups");
        C473040Igo.LIZLLL(this.LIZ, c09dl, groupSettingMap2.groups, String.class);
        c09dl.LJIILLIIL("setting_map");
        C473040Igo.LJ(this.LIZ, c09dl, groupSettingMap2.map, GroupSetting.class);
        c09dl.LJII();
    }
}
