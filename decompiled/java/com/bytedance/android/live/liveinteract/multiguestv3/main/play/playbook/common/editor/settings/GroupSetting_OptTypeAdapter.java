package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupSetting_OptTypeAdapter extends TypeAdapter<GroupSetting> {
    public final Gson LIZ;

    public GroupSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GroupSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GroupSetting groupSetting = new GroupSetting(null, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1538390714) {
                    if (iHashCode != 1658381128) {
                        if (iHashCode == 1936968447 && strLJJJJ.equals("end_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                groupSetting.endColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("abilities")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            groupSetting.list = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("start_color")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        groupSetting.startColor = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return groupSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GroupSetting groupSetting) {
        GroupSetting groupSetting2 = groupSetting;
        if (groupSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("abilities");
        C473040Igo.LIZLLL(this.LIZ, c09dl, groupSetting2.list, String.class);
        c09dl.LJIILLIIL("start_color");
        c09dl.LJJJJJ(groupSetting2.startColor);
        c09dl.LJIILLIIL("end_color");
        c09dl.LJJJJJ(groupSetting2.endColor);
        c09dl.LJII();
    }
}
