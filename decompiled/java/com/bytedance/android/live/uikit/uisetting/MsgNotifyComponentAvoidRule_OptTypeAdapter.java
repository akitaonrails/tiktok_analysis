package com.bytedance.android.live.uikit.uisetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyComponentAvoidRule_OptTypeAdapter extends TypeAdapter<MsgNotifyComponentAvoidRule> {
    public final Gson LIZ;

    public MsgNotifyComponentAvoidRule_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MsgNotifyComponentAvoidRule read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MsgNotifyComponentAvoidRule msgNotifyComponentAvoidRule = new MsgNotifyComponentAvoidRule(0, null, null, -1L, -1L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -773501904:
                        if (strLJJJJ.equals("exclusive_queue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRule.setExclusiveQueue(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -119418635:
                        if (strLJJJJ.equals("recover_threshold_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRule.setRecoverThresholdMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 924172579:
                        if (strLJJJJ.equals("max_recover_remain_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRule.setMaxRecoverRemainMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 977951635:
                        if (strLJJJJ.equals("timeline_queue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRule.setTimelineQueue(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1370341692:
                        if (strLJJJJ.equals("component_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRule.setComponentType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return msgNotifyComponentAvoidRule;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MsgNotifyComponentAvoidRule msgNotifyComponentAvoidRule) throws IOException {
        MsgNotifyComponentAvoidRule msgNotifyComponentAvoidRule2 = msgNotifyComponentAvoidRule;
        if (msgNotifyComponentAvoidRule2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("component_type");
        c09dl.LJJJJ(Integer.valueOf(msgNotifyComponentAvoidRule2.getComponentType()));
        c09dl.LJIILLIIL("exclusive_queue");
        C473040Igo.LIZLLL(this.LIZ, c09dl, msgNotifyComponentAvoidRule2.getExclusiveQueue(), String.class);
        c09dl.LJIILLIIL("timeline_queue");
        C473040Igo.LIZLLL(this.LIZ, c09dl, msgNotifyComponentAvoidRule2.getTimelineQueue(), String.class);
        c09dl.LJIILLIIL("recover_threshold_ms");
        c09dl.LJJIZ(msgNotifyComponentAvoidRule2.getRecoverThresholdMs());
        c09dl.LJIILLIIL("max_recover_remain_ms");
        c09dl.LJJIZ(msgNotifyComponentAvoidRule2.getMaxRecoverRemainMs());
        c09dl.LJII();
    }
}
