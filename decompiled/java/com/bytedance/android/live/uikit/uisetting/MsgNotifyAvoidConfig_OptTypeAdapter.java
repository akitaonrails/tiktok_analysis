package com.bytedance.android.live.uikit.uisetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyAvoidConfig_OptTypeAdapter extends TypeAdapter<MsgNotifyAvoidConfig> {
    public final Gson LIZ;

    public MsgNotifyAvoidConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MsgNotifyAvoidConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MsgNotifyAvoidConfig msgNotifyAvoidConfig = new MsgNotifyAvoidConfig(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "component_rule_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    msgNotifyAvoidConfig.setComponentRuleList(C473040Igo.LIZ(this.LIZ, c09cu, MsgNotifyComponentAvoidRule.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "component_rule_list_v2")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    msgNotifyAvoidConfig.setComponentRuleListV2(C473040Igo.LIZ(this.LIZ, c09cu, MsgNotifyComponentAvoidRuleV2.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return msgNotifyAvoidConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MsgNotifyAvoidConfig msgNotifyAvoidConfig) {
        MsgNotifyAvoidConfig msgNotifyAvoidConfig2 = msgNotifyAvoidConfig;
        if (msgNotifyAvoidConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("component_rule_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, msgNotifyAvoidConfig2.getComponentRuleList(), MsgNotifyComponentAvoidRule.class);
        c09dl.LJIILLIIL("component_rule_list_v2");
        C473040Igo.LIZLLL(this.LIZ, c09dl, msgNotifyAvoidConfig2.getComponentRuleListV2(), MsgNotifyComponentAvoidRuleV2.class);
        c09dl.LJII();
    }
}
