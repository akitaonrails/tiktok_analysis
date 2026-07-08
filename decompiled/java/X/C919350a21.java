package X;

import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSameAsIosZoomSetting;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: renamed from: X.0a21, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C919350a21 extends AbstractC919790a2j {
    @Override // X.AbstractC919790a2j
    public final void LJIILJJIL() {
    }

    @Override // X.AbstractC919790a2j
    public final void LJIILL(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ() {
        /*
            r8 = this;
            X.0aAp r0 = X.C924810aAp.LJ()
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LJJIII
            r3 = 0
            if (r0 == 0) goto L3f
            int r1 = r0.LIZLLL
            r0 = 3
            if (r1 != r0) goto L3f
            r0 = 1
        Lf:
            r1 = 0
            if (r0 == 0) goto L34
            X.0aAp r0 = X.C924810aAp.LJ()
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LJJIII
            if (r0 == 0) goto L3d
            java.lang.String r2 = X.C916490ZxP.LIZ(r0)
        L1e:
            r0 = 6
            X.AbstractC919790a2j.LJJIJIIJIL(r8, r3, r1, r0)
            X.0aVw r1 = X.C920280a3W.LIZ()
            if (r1 == 0) goto L33
            r5 = 1
            X.0Zwr r7 = new X.0Zwr
            r7.<init>()
            r4 = r3
            r6 = r3
            r1.LJJJJIZL(r2, r3, r4, r5, r6, r7)
        L33:
            return
        L34:
            com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r0 = r8.LJII()
            if (r0 == 0) goto L3d
            java.lang.String r2 = r0.layoutId
            goto L1e
        L3d:
            r2 = r1
            goto L1e
        L3f:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C919350a21.LJJIJLIJ():void");
    }

    @Override // X.AbstractC919790a2j
    public final void LJIJ() {
        LIZJ();
    }

    public C919350a21(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.AbstractC919790a2j
    public void LJJI(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
        InterfaceC937900aVw interfaceC937900aVwLIZ;
        String str;
        if (C01HE.LJ() != C01FV.ANCHOR) {
            return;
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        AbstractC919790a2j.LJIIJJI.getClass();
        c1143300frELJIIJJI.LJII(AbstractC919790a2j.LJIJI, C2097608Jq.LJIIJ(new Pair("action", "zoomFromLinkScreenChangeMessage"), new Pair("enlargePositionStatusSynContent", enlargePositionStatusSynContent.toString())));
        int i = enlargePositionStatusSynContent.scene;
        if (i == 7) {
            InterfaceC937900aVw interfaceC937900aVwLIZ2 = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ2 != null) {
                LJJII(CastIntegerProtector.parseInt(enlargePositionStatusSynContent.targetPosition), interfaceC937900aVwLIZ2);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC937900aVwLIZ = C920280a3W.LIZ()) == null) {
            return;
        }
        Layout layoutLJII = LJII();
        if (layoutLJII != null) {
            str = layoutLJII.layoutId;
        } else {
            str = null;
        }
        AbstractC919790a2j.LJJIJIIJIL(this, 0, interfaceC937900aVwLIZ, 4);
        InterfaceC937900aVw interfaceC937900aVwLIZ3 = C920280a3W.LIZ();
        if (interfaceC937900aVwLIZ3 == null) {
            return;
        }
        interfaceC937900aVwLIZ3.LJJJJIZL(str, false, false, true, false, new C916150Zwr());
    }

    @Override // X.AbstractC919790a2j
    public void LJJIFFI(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        String str;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        Layout layoutLJFF;
        int iLIZIZ;
        int i;
        if (C01HE.LJ() != C01FV.ANCHOR) {
            return;
        }
        super.LJJIFFI(linkerEnlargeStatusSynContent);
        String str2 = linkerEnlargeStatusSynContent.enlargeLinkmicId;
        int i2 = linkerEnlargeStatusSynContent.scene;
        int i3 = 1;
        String str3 = null;
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                LJJIJLIJ();
                if (!MultiGuestSameAsIosZoomSetting.INSTANCE.isEnable()) {
                    Layout layoutLJII = LJII();
                    if (layoutLJII != null) {
                        str = layoutLJII.layoutId;
                    } else {
                        str = null;
                    }
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (layoutLJFF = interfaceC937900aVwLLIIJLIL.LJFF()) != null && layoutLJFF.isFloatType()) {
                        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL2 != null) {
                            iLIZIZ = interfaceC954180awCLLJLL2.LIZIZ();
                        } else {
                            iLIZIZ = 0;
                        }
                        InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL3 != null) {
                            Layout layoutLJFF2 = interfaceC937900aVwLLIIJLIL.LJFF();
                            if (layoutLJFF2 != null) {
                                i = layoutLJFF2.micCount;
                            } else {
                                i = 0;
                            }
                            if (str == null) {
                                str = "";
                            }
                            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                            if (iLIZIZ > 1) {
                                i3 = 3;
                            }
                            bizChangeLayoutParams.displayId = i3;
                            interfaceC954180awCLLJLL3.LLFF(new C920450a3n(i, str, bizChangeLayoutParams), null);
                        }
                    }
                }
                C917290Zyh.LIZ.LJIIJ(false);
            }
        } else {
            Layout layoutLJII2 = LJII();
            if (layoutLJII2 != null) {
                str3 = layoutLJII2.layoutId;
            }
            AbstractC919790a2j.LJJIIZI(this, str2, LJII(), LJIILLIIL(C920280a3W.LIZ(), str2), i2, null, null, 48);
            InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ != null) {
                interfaceC937900aVwLIZ.LJJJJIZL(str3, false, false, true, false, new C916150Zwr());
            }
            C917290Zyh.LIZ.LJIIJ(true);
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(LinkReceiveEnlargeMessageEvent.class, linkerEnlargeStatusSynContent);
        }
    }

    @Override // X.AbstractC919790a2j
    public void LJJII(int i, InterfaceC937900aVw interfaceC937900aVw) {
        if (C01HE.LJ() != C01FV.ANCHOR) {
            return;
        }
        LJJIIJ(i, interfaceC937900aVw);
    }

    @Override // X.AbstractC919790a2j
    public final AbstractC19486711Lt LJJIIJZLJL(final int i, final boolean z) {
        String string;
        Long lValueOf;
        String str;
        HashMap map = new HashMap();
        Room roomLJIJI = AbstractC919790a2j.LJIJI();
        if (roomLJIJI == null || (string = Long.valueOf(roomLJIJI.getOwnerUserId()).toString()) == null) {
            string = "";
        }
        map.put("anchor_id", string);
        Room roomLJIJI2 = AbstractC919790a2j.LJIJI();
        if (roomLJIJI2 != null) {
            lValueOf = Long.valueOf(roomLJIJI2.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        if (z) {
            str = "7";
        } else {
            str = "8";
        }
        map.put(Scene.SCENE_SERVICE, str);
        map.put("channel_id", C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ()));
        map.put("target_position", String.valueOf(i));
        C480460Ism.LIZ().getClass();
        return new C11IW(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ())).LJII(new InterfaceC781210Ukh() { // from class: X.0Zz2
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C20441214yg.LJIIIZ("ZoomAnchorModel", "zoomRemote success");
                if (!z) {
                    this.LJJIJLIJ();
                    return;
                }
                InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
                if (interfaceC937900aVwLIZ != null) {
                    this.LJJII(i, interfaceC937900aVwLIZ);
                }
            }
        }).LJIIIIZZ(new C09JN() { // from class: X.0Zwf
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ZoomAnchorModel@a229.zoomRemote$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("zoomRemote error throwable=");
                sbLIZ.append(obj);
                C20441214yg.LJIIIZ("ZoomAnchorModel", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("ZoomAnchorModel@a229.zoomRemote$2");
            }
        });
    }

    @Override // X.AbstractC919790a2j
    public final void LJJIJ(String str, int i, InterfaceC937900aVw interfaceC937900aVw, Boolean bool) {
        int i2;
        if (interfaceC937900aVw != null) {
            Map<String, OnLineMicInfo> mapLIZ = interfaceC937900aVw.LIZ();
            Layout layoutLJII = LJII();
            if (layoutLJII != null) {
                i2 = layoutLJII.micCount;
            } else {
                i2 = 0;
            }
            Map mapLJJIJIIJI = LJJIJIIJI(i2, bool, str, mapLIZ);
            String strLJJIIZ = LJJIIZ(bool, str);
            interfaceC937900aVw.LJJLJLI();
            interfaceC937900aVw.LLD(strLJJIIZ, mapLJJIJIIJI);
        }
    }
}
