package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C01OF;
import X.C01ZA;
import X.C13BV;
import X.C1697810uHb;
import X.C20355114kn;
import X.C20355614ks;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C334801Rq;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5182020e;
import X.C758560TpG;
import X.C930480aJy;
import X.C931810aM7;
import X.C937280aUw;
import X.EnumC19367810pw;
import X.EnumC952890au7;
import X.InterfaceC20354714kj;
import X.InterfaceC20423114vl;
import X.InterfaceC953350aur;
import X.InterfaceC971790bOb;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TextHeaderConfig;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TextHeaderEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ApplyingTextHeaderFromServerSideChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEntitiesIterationEnabledSetting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import webcast.data.multi_guest_play.TextHeaderMaterialInfo;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class TextHeaderEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("header", 0, 44500000, 0, C1697810uHb.LJIIJJI("header_finish_setting", "header_ongoing", "header_finished", "never"), "header_finish_setting", 12272);
    public final HashMap<String, String> LLJJJJLIIL = new HashMap<>();
    public TextHeaderConfig LLJJL;

    @Override // X.AbstractC20356314kz
    public final void LJJIJLIJ() {
        this.LLJJL = null;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIJ() {
        C01ZA c01za;
        String str;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null || (c01za = (C01ZA) dataChannel.gg0(ApplyingTextHeaderFromServerSideChannel.class)) == null || (str = c01za.LIZJ) == null || str.length() == 0) {
            this.LLJJL = null;
            return;
        }
        TextHeaderConfig textHeaderConfig = new TextHeaderConfig();
        textHeaderConfig.nodeId = str;
        this.LLJJL = textHeaderConfig;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        super.destroy();
        this.LLJJJJLIIL.clear();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJI(final Function2 function2) {
        String str;
        TextHeaderConfig textHeaderConfig = this.LLJJL;
        if (textHeaderConfig != null && C500260Jjc.LJJIIZ(textHeaderConfig.nodeId)) {
            InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
            if (interfaceC971790bObLIZIZ != null) {
                EnumC19367810pw enumC19367810pw = EnumC19367810pw.AUTO_START_TYPE;
                boolean z = C758560TpG.LIZ;
                TextHeaderConfig textHeaderConfig2 = this.LLJJL;
                if (textHeaderConfig2 == null || (str = textHeaderConfig2.nodeId) == null) {
                    str = "";
                }
                interfaceC971790bObLIZIZ.LJ(new C20355614ks(enumC19367810pw, z, str, EnumC952890au7.PLAYBOOK, new InterfaceC20423114vl() { // from class: X.0yln
                    @Override // X.InterfaceC20423114vl
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC20423114vl
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC20423114vl
                    public final void LJ() {
                        function2.invoke(Boolean.FALSE, "");
                    }

                    @Override // X.InterfaceC20423114vl
                    public final void LIZLLL(TextHeaderRecordInfo textHeaderRecordInfo) {
                        function2.invoke(Boolean.TRUE, "");
                    }
                }));
                return;
            }
            function2.invoke(Boolean.FALSE, "AnchorTextHeaderService is null");
            return;
        }
        InterfaceC971790bOb interfaceC971790bObLIZIZ2 = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ2 != null) {
            interfaceC971790bObLIZIZ2.LIZLLL(new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 207), new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 208));
        } else {
            function2.invoke(Boolean.FALSE, "AnchorTextHeaderService is null");
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILLIIL(String str) {
        TextHeaderConfig textHeaderConfig;
        if (isRunning() && LJJJ()) {
            if (str != null) {
                textHeaderConfig = (TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, str, new TextHeaderConfig());
            } else {
                textHeaderConfig = null;
            }
            C20355114kn.LIZ(textHeaderConfig, this.LLJ, false, new AwS610S0100000_31(this, 63));
        }
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJJL(String str) {
        boolean z;
        if (!PlaybookEntitiesIterationEnabledSetting.INSTANCE.getValue()) {
            return false;
        }
        C930480aJy.LIZ.getClass();
        if (!C930480aJy.LJIJ() && !C500260Jjc.LJJIL()) {
            z = false;
        } else {
            z = true;
        }
        if (!C931810aM7.LIZJ(z)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        TextHeaderConfig textHeaderConfig;
        DataChannel dataChannel;
        String str = c20361214lm.LJI;
        if (str != null) {
            textHeaderConfig = (TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, str, new TextHeaderConfig());
        } else {
            textHeaderConfig = null;
        }
        if (!C20355114kn.LIZ(textHeaderConfig, this.LLJ, false, new AwS610S0100000_31(this, 64)) && (dataChannel = this.LLJ) != null) {
            dataChannel.BQ2(LJJJJ(), ApplyingTextHeaderFromServerSideChannel.class, new AwS397S0200000_31(textHeaderConfig, this, 18));
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        return C500260Jjc.LJJIIZ(((TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, c20361214lm.LJI, new TextHeaderConfig())).nodeId);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        List listSingletonList;
        boolean z;
        String str;
        InterfaceC971790bOb interfaceC971790bObLIZIZ;
        TextHeaderConfig textHeaderConfig = (TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, c20424814w2.LJII, new TextHeaderConfig());
        if (C500260Jjc.LJJIIZ(textHeaderConfig.nodeId) && (((str = this.LLJJJJLIIL.get(textHeaderConfig.nodeId)) == null || str.length() == 0) && (interfaceC971790bObLIZIZ = C01OF.LIZIZ()) != null)) {
            interfaceC971790bObLIZIZ.LJIIJ(textHeaderConfig.nodeId, new AwS112S0201000_31(i, this, textHeaderConfig, 15), null);
        }
        String strLJIJI = C497740JfY.LJIJI(2131854674);
        String strLJIJI2 = C497740JfY.LJIJI(2131854674);
        String str2 = this.LLJJJJLIIL.get(textHeaderConfig.nodeId);
        if (str2 != null && str2.length() != 0) {
            String str3 = this.LLJJJJLIIL.get(textHeaderConfig.nodeId);
            if (str3 == null) {
                str3 = "";
            }
            listSingletonList = Collections.singletonList(str3);
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        if (!C500260Jjc.LJIL() && !C500260Jjc.LJJIL()) {
            z = false;
        } else {
            z = true;
        }
        return new C20361314ln(strLJIJI, strLJIJI2, R.attr.e6s, R.attr.e6s, listSingletonList, null, i, null, z, null, 3712);
    }

    public final void LJJLIIIJ(final C20361214lm c20361214lm, final InterfaceC20354714kj interfaceC20354714kj) {
        EnumC952890au7 enumC952890au7;
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            EnumC19367810pw enumC19367810pw = EnumC19367810pw.NORMAL_TYPE;
            boolean z = C758560TpG.LIZ;
            String str = ((TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, c20361214lm.LJI, new TextHeaderConfig())).nodeId;
            if (C500260Jjc.LJIL()) {
                enumC952890au7 = EnumC952890au7.PLAYBOOK;
            } else {
                enumC952890au7 = EnumC952890au7.PREVIEW_PLAYBOOK;
            }
            interfaceC971790bObLIZIZ.LJ(new C20355614ks(enumC19367810pw, z, str, enumC952890au7, new InterfaceC20423114vl() { // from class: X.14kp
                public boolean LIZ;

                @Override // X.InterfaceC20423114vl
                public final void LJ() {
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZIZ() {
                    if (this.LIZ) {
                        return;
                    }
                    PlayEntityUtilKt.LJ(this.LIZIZ, 2, c20361214lm, interfaceC20354714kj);
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZJ() {
                    PlayEntityUtilKt.LJII(this.LIZIZ, 2, c20361214lm, interfaceC20354714kj, true);
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZLLL(TextHeaderRecordInfo textHeaderRecordInfo) {
                    String str2;
                    String str3;
                    String str4;
                    String str5 = "";
                    if (textHeaderRecordInfo != null && (str3 = textHeaderRecordInfo.mediaNodeId) != null) {
                        HashMap<String, String> map = this.LIZIZ.LLJJJJLIIL;
                        TextHeaderMaterialInfo textHeaderMaterialInfo = textHeaderRecordInfo.textHeaderMaterialInfo;
                        if (textHeaderMaterialInfo == null || (str4 = textHeaderMaterialInfo.text) == null) {
                            str4 = "";
                        }
                        map.put(str3, str4);
                    }
                    TextHeaderEntity textHeaderEntity = this.LIZIZ;
                    TextHeaderConfig textHeaderConfig = new TextHeaderConfig();
                    if (textHeaderRecordInfo != null && (str2 = textHeaderRecordInfo.mediaNodeId) != null) {
                        str5 = str2;
                    }
                    textHeaderConfig.nodeId = str5;
                    PlayEntityUtilKt.LIZJ(textHeaderEntity, textHeaderConfig, c20361214lm, interfaceC20354714kj, true);
                    this.LIZ = true;
                }
            }));
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        EnumC952890au7 enumC952890au7;
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            EnumC19367810pw enumC19367810pw = EnumC19367810pw.JUST_EDIT_TYPE;
            boolean z = C758560TpG.LIZ;
            String str = ((TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, c20361214lm.LJI, new TextHeaderConfig())).nodeId;
            if (C500260Jjc.LJIL()) {
                enumC952890au7 = EnumC952890au7.PLAYBOOK;
            } else {
                enumC952890au7 = EnumC952890au7.PREVIEW_PLAYBOOK;
            }
            interfaceC971790bObLIZIZ.LJ(new C20355614ks(enumC19367810pw, z, str, enumC952890au7, new InterfaceC20423114vl() { // from class: X.14ko
                @Override // X.InterfaceC20423114vl
                public final void LJ() {
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZIZ() {
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LIZ(false);
                    }
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZJ() {
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LIZ(false);
                    }
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZLLL(TextHeaderRecordInfo textHeaderRecordInfo) {
                    String str2;
                    String str3;
                    String str4;
                    String str5 = "";
                    if (textHeaderRecordInfo != null && (str3 = textHeaderRecordInfo.mediaNodeId) != null) {
                        HashMap<String, String> map = this.LLJJJJLIIL;
                        TextHeaderMaterialInfo textHeaderMaterialInfo = textHeaderRecordInfo.textHeaderMaterialInfo;
                        if (textHeaderMaterialInfo == null || (str4 = textHeaderMaterialInfo.text) == null) {
                            str4 = "";
                        }
                        map.put(str3, str4);
                    }
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        TextHeaderConfig textHeaderConfig = new TextHeaderConfig();
                        if (textHeaderRecordInfo != null && (str2 = textHeaderRecordInfo.mediaNodeId) != null) {
                            str5 = str2;
                        }
                        textHeaderConfig.nodeId = str5;
                        interfaceC979390bar2.LJI(this.LJJJIL().LIZLLL, C1516000pYM.LIZJ(textHeaderConfig), true);
                    }
                }
            }));
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, final InterfaceC953350aur interfaceC953350aur, Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("directlyStartInAnchorSceneInner, name=");
        sbLIZ.append(this.LLJJJJJIL.LIZ);
        C20441214yg.LJ("xuliwenTest", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            interfaceC971790bObLIZIZ.LJ(new C20355614ks(EnumC19367810pw.AUTO_START_TYPE, C758560TpG.LIZ, ((TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, c20361214lm.LJI, new TextHeaderConfig())).nodeId, EnumC952890au7.PLAYBOOK, new InterfaceC20423114vl() { // from class: X.14kq
                @Override // X.InterfaceC20423114vl
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZJ() {
                }

                @Override // X.InterfaceC20423114vl
                public final void LJ() {
                    interfaceC953350aur.LIZ(false, true);
                }

                @Override // X.InterfaceC20423114vl
                public final void LIZLLL(TextHeaderRecordInfo textHeaderRecordInfo) {
                    interfaceC953350aur.LIZIZ();
                }
            }));
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj);
    }
}
