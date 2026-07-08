package Y;

import X.C09JN;
import X.C19748512Ol;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C919690a2Z;
import X.C925050aBD;
import X.C925070aBF;
import X.C925080aBG;
import X.C925090aBH;
import X.C925130aBL;
import X.C925150aBN;
import X.C925250aBX;
import X.C944240agA;
import X.InterfaceC923600a8s;
import X.InterfaceC923620a8u;
import X.InterfaceC923660a8y;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AfS1S0501000_15 implements C09JN {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0501000_15 afS1S0501000_15, Object obj) {
        Long lValueOf;
        String str;
        Long lValueOf2;
        String str2;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo2;
        MultiGuestPermissionInfo multiGuestPermissionInfo3;
        MultiGuestPermissionInfo multiGuestPermissionInfo4;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData;
        long jLongValue;
        Long l;
        Long l2;
        C1C7U.LIZ("GameLinkPermissionManager@2602.checkPermission$3");
        BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkIn_Guest_Permission, response:");
        sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, baseResponse));
        C20441214yg.LJIIIZ("GameLinkPermissionManager", C2188811AlT.LIZIZ(sbLIZ));
        C925070aBF.LIZ = false;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = baseResponse.data;
        Long l3 = null;
        if (audienceMultiGuestPermissionResponseData2 != null && audienceMultiGuestPermissionResponseData2.LIZ()) {
            MultiGuestPermissionInfo multiGuestPermissionInfo5 = baseResponse.data.permissionInfo;
            if (multiGuestPermissionInfo5 != null) {
                l2 = multiGuestPermissionInfo5.linkPermissionType;
            } else {
                l2 = null;
            }
            C925070aBF.LIZLLL(l2);
        } else {
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData3 = baseResponse.data;
            if (audienceMultiGuestPermissionResponseData3 != null && (multiGuestPermissionInfo4 = audienceMultiGuestPermissionResponseData3.permissionInfo) != null) {
                lValueOf = Long.valueOf(multiGuestPermissionInfo4.errCode);
            } else {
                lValueOf = null;
            }
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData4 = baseResponse.data;
            if (audienceMultiGuestPermissionResponseData4 != null && (multiGuestPermissionInfo3 = audienceMultiGuestPermissionResponseData4.permissionInfo) != null) {
                str = multiGuestPermissionInfo3.noPermissionPrompt;
            } else {
                str = null;
            }
            C925070aBF.LJ(lValueOf, str);
            InterfaceC923620a8u interfaceC923620a8u = (InterfaceC923620a8u) afS1S0501000_15.l1;
            if (interfaceC923620a8u != null) {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData5 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData5 != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData5.permissionInfo) != null) {
                    lValueOf2 = Long.valueOf(multiGuestPermissionInfo2.errCode);
                } else {
                    lValueOf2 = null;
                }
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData6 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData6 != null && (multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData6.permissionInfo) != null) {
                    str2 = multiGuestPermissionInfo.noPermissionPrompt;
                } else {
                    str2 = null;
                }
                interfaceC923620a8u.MD(new C925130aBL(afS1S0501000_15.i5, lValueOf2, str2));
            }
        }
        int i = afS1S0501000_15.i5;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (audienceMultiGuestPermissionResponseData = baseResponse.data) != null && audienceMultiGuestPermissionResponseData.LIZ()) {
                    C925070aBF.LIZJ = baseResponse;
                    C925070aBF.LIZIZ = true;
                    Function1 function1 = (Function1) afS1S0501000_15.l2;
                    if (function1 != null) {
                        MultiGuestPermissionInfo multiGuestPermissionInfo6 = baseResponse.data.permissionInfo;
                        if (multiGuestPermissionInfo6 != null && (l = multiGuestPermissionInfo6.linkPermissionType) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        function1.invoke(Long.valueOf(jLongValue));
                    }
                    DataChannel dataChannel = (DataChannel) afS1S0501000_15.l0;
                    if (dataChannel != null) {
                        dataChannel.FQ2(CheckPermissionSucc.class);
                    }
                }
            } else {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData7 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData7 != null && audienceMultiGuestPermissionResponseData7.LIZ()) {
                    Function2 function2 = (Function2) afS1S0501000_15.l4;
                    if (function2 != null) {
                        MultiGuestPermissionInfo multiGuestPermissionInfo7 = baseResponse.data.permissionInfo;
                        if (multiGuestPermissionInfo7 != null) {
                            l3 = multiGuestPermissionInfo7.linkPermissionType;
                        }
                        function2.invoke(l3, Integer.valueOf(afS1S0501000_15.i5));
                    }
                    DataChannel dataChannel2 = (DataChannel) afS1S0501000_15.l0;
                    if (dataChannel2 != null) {
                        dataChannel2.FQ2(CheckPermissionSucc.class);
                    }
                }
            }
        } else {
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData8 = baseResponse.data;
            if (audienceMultiGuestPermissionResponseData8 != null && audienceMultiGuestPermissionResponseData8.LIZ()) {
                Function2 function22 = (Function2) afS1S0501000_15.l3;
                if (function22 != null) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo8 = baseResponse.data.permissionInfo;
                    if (multiGuestPermissionInfo8 != null) {
                        l3 = multiGuestPermissionInfo8.linkPermissionType;
                    }
                    function22.invoke(l3, Integer.valueOf(afS1S0501000_15.i5));
                }
                C925050aBD.LIZLLL((DataChannel) afS1S0501000_15.l0);
                DataChannel dataChannel3 = (DataChannel) afS1S0501000_15.l0;
                if (dataChannel3 != null) {
                    dataChannel3.FQ2(CheckPermissionSucc.class);
                }
            }
        }
        C1C7U.LIZIZ("GameLinkPermissionManager@2602.checkPermission$3");
    }

    public static final void accept$1(AfS1S0501000_15 afS1S0501000_15, Object obj) {
        Long lValueOf;
        String str;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo2;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData;
        long jLongValue;
        Long l;
        Long l2;
        C1C7U.LIZ("MultiGuestPermissionManager@6f0.checkPermission$2");
        BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response:");
        sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, baseResponse));
        C944240agA.LJFF("LinkIn_Guest_Permission_Success", C2188811AlT.LIZIZ(sbLIZ));
        C925080aBG.LIZ = false;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = baseResponse.data;
        Long l3 = null;
        if (audienceMultiGuestPermissionResponseData2 != null && audienceMultiGuestPermissionResponseData2.LIZ()) {
            boolean z = C925080aBG.LIZ;
            MultiGuestPermissionInfo multiGuestPermissionInfo3 = baseResponse.data.permissionInfo;
            if (multiGuestPermissionInfo3 != null) {
                l2 = multiGuestPermissionInfo3.linkPermissionType;
            } else {
                l2 = null;
            }
            C925080aBG.LJIIIIZZ(l2);
        } else {
            boolean z2 = C925080aBG.LIZ;
            C925080aBG.LJIIIZ(baseResponse.data);
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) afS1S0501000_15.l1;
            if (interfaceC923600a8s != null) {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData3 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData3 != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData3.permissionInfo) != null) {
                    lValueOf = Long.valueOf(multiGuestPermissionInfo2.errCode);
                } else {
                    lValueOf = null;
                }
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData4 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData4 != null && (multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData4.permissionInfo) != null) {
                    str = multiGuestPermissionInfo.noPermissionPrompt;
                } else {
                    str = null;
                }
                interfaceC923600a8s.tF2(new C919690a2Z(afS1S0501000_15.i5, lValueOf, str));
            }
        }
        int i = afS1S0501000_15.i5;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (audienceMultiGuestPermissionResponseData = baseResponse.data) != null && audienceMultiGuestPermissionResponseData.LIZ()) {
                    C925080aBG.LIZJ = baseResponse;
                    C925080aBG.LIZIZ = true;
                    Function1 function1 = (Function1) afS1S0501000_15.l2;
                    if (function1 != null) {
                        MultiGuestPermissionInfo multiGuestPermissionInfo4 = baseResponse.data.permissionInfo;
                        if (multiGuestPermissionInfo4 != null && (l = multiGuestPermissionInfo4.linkPermissionType) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        function1.invoke(Long.valueOf(jLongValue));
                    }
                    DataChannel dataChannel = (DataChannel) afS1S0501000_15.l0;
                    if (dataChannel != null) {
                        dataChannel.FQ2(CheckPermissionSucc.class);
                    }
                }
            } else {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData5 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData5 != null && audienceMultiGuestPermissionResponseData5.LIZ()) {
                    Function2 function2 = (Function2) afS1S0501000_15.l4;
                    if (function2 != null) {
                        MultiGuestPermissionInfo multiGuestPermissionInfo5 = baseResponse.data.permissionInfo;
                        if (multiGuestPermissionInfo5 != null) {
                            l3 = multiGuestPermissionInfo5.linkPermissionType;
                        }
                        function2.invoke(l3, Integer.valueOf(afS1S0501000_15.i5));
                    }
                    DataChannel dataChannel2 = (DataChannel) afS1S0501000_15.l0;
                    if (dataChannel2 != null) {
                        dataChannel2.FQ2(CheckPermissionSucc.class);
                    }
                }
            }
        } else {
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData6 = baseResponse.data;
            if (audienceMultiGuestPermissionResponseData6 != null && audienceMultiGuestPermissionResponseData6.LIZ()) {
                Function2 function22 = (Function2) afS1S0501000_15.l3;
                if (function22 != null) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo6 = baseResponse.data.permissionInfo;
                    if (multiGuestPermissionInfo6 != null) {
                        l3 = multiGuestPermissionInfo6.linkPermissionType;
                    }
                    function22.invoke(l3, Integer.valueOf(afS1S0501000_15.i5));
                }
                C925150aBN.LIZIZ((DataChannel) afS1S0501000_15.l0);
                DataChannel dataChannel3 = (DataChannel) afS1S0501000_15.l0;
                if (dataChannel3 != null) {
                    dataChannel3.FQ2(CheckPermissionSucc.class);
                }
            }
        }
        C1C7U.LIZIZ("MultiGuestPermissionManager@6f0.checkPermission$2");
    }

    public static final void accept$2(AfS1S0501000_15 afS1S0501000_15, Object obj) {
        Long lValueOf;
        String str;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo2;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData;
        long jLongValue;
        Long l;
        Long l2;
        C1C7U.LIZ("VoiceChatPermissionManager@120.checkPermission$2");
        BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response:");
        sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, baseResponse));
        C944240agA.LJFF("LinkIn_Guest_Permission_Success", C2188811AlT.LIZIZ(sbLIZ));
        C925090aBH.LIZ = false;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = baseResponse.data;
        Long l3 = null;
        if (audienceMultiGuestPermissionResponseData2 != null && audienceMultiGuestPermissionResponseData2.LIZ()) {
            MultiGuestPermissionInfo multiGuestPermissionInfo3 = baseResponse.data.permissionInfo;
            if (multiGuestPermissionInfo3 != null) {
                l2 = multiGuestPermissionInfo3.linkPermissionType;
            } else {
                l2 = null;
            }
            C925090aBH.LIZLLL(l2);
        } else {
            C925090aBH.LJ(baseResponse.data);
            InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) afS1S0501000_15.l1;
            if (interfaceC923660a8y != null) {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData3 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData3 != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData3.permissionInfo) != null) {
                    lValueOf = Long.valueOf(multiGuestPermissionInfo2.errCode);
                } else {
                    lValueOf = null;
                }
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData4 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData4 != null && (multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData4.permissionInfo) != null) {
                    str = multiGuestPermissionInfo.noPermissionPrompt;
                } else {
                    str = null;
                }
                interfaceC923660a8y.St0(new C925250aBX(afS1S0501000_15.i5, lValueOf, str));
            }
        }
        int i = afS1S0501000_15.i5;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (audienceMultiGuestPermissionResponseData = baseResponse.data) != null && audienceMultiGuestPermissionResponseData.LIZ()) {
                    C925090aBH.LIZJ = baseResponse;
                    C925090aBH.LIZIZ = true;
                    Function1 function1 = (Function1) afS1S0501000_15.l2;
                    if (function1 != null) {
                        MultiGuestPermissionInfo multiGuestPermissionInfo4 = baseResponse.data.permissionInfo;
                        if (multiGuestPermissionInfo4 != null && (l = multiGuestPermissionInfo4.linkPermissionType) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        function1.invoke(Long.valueOf(jLongValue));
                    }
                    DataChannel dataChannel = (DataChannel) afS1S0501000_15.l0;
                    if (dataChannel != null) {
                        dataChannel.FQ2(CheckPermissionSucc.class);
                    }
                }
            } else {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData5 = baseResponse.data;
                if (audienceMultiGuestPermissionResponseData5 != null && audienceMultiGuestPermissionResponseData5.LIZ()) {
                    Function2 function2 = (Function2) afS1S0501000_15.l4;
                    if (function2 != null) {
                        MultiGuestPermissionInfo multiGuestPermissionInfo5 = baseResponse.data.permissionInfo;
                        if (multiGuestPermissionInfo5 != null) {
                            l3 = multiGuestPermissionInfo5.linkPermissionType;
                        }
                        function2.invoke(l3, Integer.valueOf(afS1S0501000_15.i5));
                    }
                    DataChannel dataChannel2 = (DataChannel) afS1S0501000_15.l0;
                    if (dataChannel2 != null) {
                        dataChannel2.FQ2(CheckPermissionSucc.class);
                    }
                }
            }
        } else {
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData6 = baseResponse.data;
            if (audienceMultiGuestPermissionResponseData6 != null && audienceMultiGuestPermissionResponseData6.LIZ()) {
                Function2 function22 = (Function2) afS1S0501000_15.l3;
                if (function22 != null) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo6 = baseResponse.data.permissionInfo;
                    if (multiGuestPermissionInfo6 != null) {
                        l3 = multiGuestPermissionInfo6.linkPermissionType;
                    }
                    function22.invoke(l3, Integer.valueOf(afS1S0501000_15.i5));
                }
                C925150aBN.LIZIZ((DataChannel) afS1S0501000_15.l0);
                DataChannel dataChannel3 = (DataChannel) afS1S0501000_15.l0;
                if (dataChannel3 != null) {
                    dataChannel3.FQ2(CheckPermissionSucc.class);
                }
            }
        }
        C1C7U.LIZIZ("VoiceChatPermissionManager@120.checkPermission$2");
    }

    public AfS1S0501000_15(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i5 = i;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
