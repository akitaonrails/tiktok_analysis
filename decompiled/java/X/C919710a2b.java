package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkGuestZoomEvent;
import com.bytedance.android.live.liveinteract.api.LinkGuestZoomRestoreEvent;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGIftSelectLogicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSameAsIosZoomSetting;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C919710a2b extends AbstractC919790a2j {
    public boolean LJIJJ;

    @Override // X.AbstractC919790a2j
    public final void LJIJ() {
        String str = this.LJ;
        if (str != null) {
            C919310a1x.LIZ("ZoomModel", "ZoomGuestModel restore, sZoomedLinkMicId = null");
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(LinkGuestZoomRestoreEvent.class, new C919720a2c(C914970Zux.LIZIZ(str)));
            }
        }
        LIZJ();
    }

    @Override // X.AbstractC919790a2j
    public final void LJIILJJIL() {
        if (C01HE.LJ() != C01FV.GUEST) {
            return;
        }
        Layout layoutLIZLLL = LIZLLL();
        if (C500260Jjc.LJJIIZ(layoutLIZLLL != null ? layoutLIZLLL.anchorZoomLayoutId : null)) {
            if (C500260Jjc.LJJIIZ(layoutLIZLLL != null ? layoutLIZLLL.zoomLayoutId : null)) {
                this.LIZIZ = layoutLIZLLL;
                this.LIZLLL = layoutLIZLLL;
            }
        }
        if (this.LJIJJ) {
            return;
        }
        this.LJIJJ = true;
        LJIL(new InterfaceC919760a2g() { // from class: X.0a2d
            @Override // X.InterfaceC919760a2g
            public final void onFail() {
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[PHI: r1
              0x001a: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC919760a2g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C470590Icr<com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse.ResponseData> r5) {
                /*
                    r4 = this;
                    X.0aJy r0 = X.C930480aJy.LIZ
                    r0.getClass()
                    int r0 = r5.statusCode
                    if (r0 != 0) goto L22
                    X.0a2b r3 = r4.LIZ
                    T r0 = r5.data
                    com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse$ResponseData r0 = (com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse.ResponseData) r0
                    java.lang.String r2 = ""
                    if (r0 == 0) goto L17
                    java.lang.String r1 = r0.enlargeLinkmicId
                    if (r1 != 0) goto L1a
                L17:
                    r1 = r2
                    if (r0 == 0) goto L1f
                L1a:
                    java.lang.String r0 = r0.enlargePosition
                    if (r0 == 0) goto L1f
                    r2 = r0
                L1f:
                    r3.LJJIJLIJ(r1, r2)
                L22:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C919730a2d.LIZ(X.0Icr):void");
            }
        });
    }

    public C919710a2b(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.AbstractC919790a2j
    public void LJIILL(int i) {
        if (i >= 3) {
            if (C01HE.LJ() != C01FV.ANCHOR && LJII() != null && !this.LJIJJ) {
                this.LJIJJ = true;
                LJIL(new InterfaceC919760a2g() { // from class: X.0a2e
                    @Override // X.InterfaceC919760a2g
                    public final void onFail() {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[PHI: r1
                      0x001a: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC919760a2g
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.C470590Icr<com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse.ResponseData> r5) {
                        /*
                            r4 = this;
                            X.0aJy r0 = X.C930480aJy.LIZ
                            r0.getClass()
                            int r0 = r5.statusCode
                            if (r0 != 0) goto L22
                            X.0a2b r3 = r4.LIZ
                            T r0 = r5.data
                            com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse$ResponseData r0 = (com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse.ResponseData) r0
                            java.lang.String r2 = ""
                            if (r0 == 0) goto L17
                            java.lang.String r1 = r0.enlargeLinkmicId
                            if (r1 != 0) goto L1a
                        L17:
                            r1 = r2
                            if (r0 == 0) goto L1f
                        L1a:
                            java.lang.String r0 = r0.enlargePosition
                            if (r0 == 0) goto L1f
                            r2 = r0
                        L1f:
                            r3.LJJIJLIJ(r1, r2)
                        L22:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C919740a2e.LIZ(X.0Icr):void");
                    }
                });
                return;
            }
            return;
        }
        this.LJIJJ = false;
        LIZJ();
    }

    @Override // X.AbstractC919790a2j
    public final void LJJ(List<PosIdentity> list) {
        PosIdentity next;
        boolean z;
        if (!Intrinsics.LJFF(list, LJIIIIZZ())) {
            Iterator<PosIdentity> it2 = list.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (!next.LIZJ(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ())));
            boolean z2 = false;
            if (next != null) {
                z = true;
            } else {
                z = false;
            }
            Iterator<PosIdentity> it3 = LJIIIIZZ().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                PosIdentity next2 = it3.next();
                if (next2.LIZJ(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
                    if (next2 != null) {
                        z2 = true;
                    }
                }
            }
            if (list.size() == 2 && LJIIIIZZ().size() <= 1) {
                if (z) {
                    C915850ZwN.LJII();
                }
            } else if (list.size() == 2 && LJIIIIZZ().size() == 2) {
                if (z2) {
                    if (!z) {
                        C915850ZwN.LJIIIIZZ();
                    }
                } else if (z && !z2) {
                    C915850ZwN.LJII();
                }
            } else if (LJIIIIZZ().size() == 2 && list.size() <= 1 && z2) {
                C915850ZwN.LJIIIIZZ();
            }
        }
        super.LJJ(list);
    }

    @Override // X.AbstractC919790a2j
    public final void LJJI(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
        InterfaceC937900aVw interfaceC937900aVwLIZ;
        Layout layoutLIZLLL;
        if (C01HE.LJ() != C01FV.GUEST) {
            return;
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        AbstractC919790a2j.LJIIJJI.getClass();
        c1143300frELJIIJJI.LJII(AbstractC919790a2j.LJIJI, C2097608Jq.LJIIJ(new Pair("action", "zoomFromLinkScreenChangeMessage"), new Pair("enlargePositionStatusSynContent", enlargePositionStatusSynContent.toString())));
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(zLIZJ)) {
            LJJ(enlargePositionStatusSynContent.enlargedPositions);
            return;
        }
        int i = enlargePositionStatusSynContent.scene;
        if (i == 7) {
            InterfaceC937900aVw interfaceC937900aVwLIZ2 = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ2 == null) {
                return;
            }
            LJJII(CastIntegerProtector.parseInt(enlargePositionStatusSynContent.targetPosition), interfaceC937900aVwLIZ2);
            return;
        }
        if (i != 8 || (interfaceC937900aVwLIZ = C920280a3W.LIZ()) == null || (layoutLIZLLL = LIZLLL()) == null) {
            return;
        }
        AbstractC919790a2j.LJJIJIIJIL(this, 0, interfaceC937900aVwLIZ, 4);
        InterfaceC937900aVw interfaceC937900aVwLIZ3 = C920280a3W.LIZ();
        if (interfaceC937900aVwLIZ3 == null) {
            return;
        }
        interfaceC937900aVwLIZ3.LJJJJIZL(layoutLIZLLL.layoutId, false, false, true, false, new C916150Zwr());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC919790a2j
    public final void LJJIFFI(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        boolean zLJFF;
        int i;
        boolean z;
        boolean z2;
        DataChannel dataChannel;
        int i2;
        long j;
        int i3;
        long j2;
        boolean z3;
        String layoutId;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        int i4;
        int i5;
        long j3;
        Long lValueOf;
        User owner;
        FollowInfo followInfo;
        if (C01HE.LJ() != C01FV.GUEST) {
            return;
        }
        super.LJJIFFI(linkerEnlargeStatusSynContent);
        String str = linkerEnlargeStatusSynContent.enlargeLinkmicId;
        int i6 = linkerEnlargeStatusSynContent.scene;
        if (Intrinsics.LJFF(str, AbstractC919790a2j.LJIILIIL()) && i6 == 2) {
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            HashMap map = new HashMap();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            map.put("guest_id", strValueOf);
            if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                lValueOf = Long.valueOf(followInfo.getFollowStatus());
            } else {
                lValueOf = null;
            }
            map.put("anchor_relationship", String.valueOf(lValueOf));
            map.put("connected_guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
            C917520Zz4.LIZ(map);
            C01Z4.LIZ(null, map);
            C0KX4.LIZ("livesdk_guest_screen_enlarged", map, null, true);
        }
        LinkerMediaChangeOperator linkerMediaChangeOperator = linkerEnlargeStatusSynContent.operatorInfo;
        this.LJII = i6;
        LinkMicGIftSelectLogicSetting linkMicGIftSelectLogicSetting = LinkMicGIftSelectLogicSetting.INSTANCE;
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            zLJFF = Intrinsics.LJFF(dataChannel2.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        boolean z4 = true;
        if (!linkMicGIftSelectLogicSetting.isV0(zLJFF, C923330a8R.LJFF()) && ((i4 = this.LJII) == 1 || i4 == 2)) {
            DataChannel dataChannel3 = this.LIZ;
            if (dataChannel3 != null) {
                String str2 = this.LJ;
                EnumC1990907r1 enumC1990907r1 = EnumC1990907r1.ZOOM_MAX;
                C00IS c00is = C00IS.SOURCE_IM;
                if (linkerMediaChangeOperator != null) {
                    i5 = linkerMediaChangeOperator.operatorType;
                    j3 = linkerMediaChangeOperator.userId;
                } else {
                    i5 = 2;
                    j3 = 0;
                }
                i = 1;
                dataChannel3.LC0(LinkGuestZoomEvent.class, new C922840a7e(str, str2, enumC1990907r1, c00is, i5, j3));
            } else {
                i = 1;
            }
        } else {
            i = 1;
            if (Intrinsics.LJFF(str, AbstractC919790a2j.LJIILIIL()) && this.LJII == 2) {
                DataChannel dataChannel4 = this.LIZ;
                if (dataChannel4 != null) {
                    String str3 = this.LJ;
                    EnumC1990907r1 enumC1990907r12 = EnumC1990907r1.ZOOM_MAX;
                    C00IS c00is2 = C00IS.SOURCE_IM;
                    if (linkerMediaChangeOperator != null) {
                        i3 = linkerMediaChangeOperator.operatorType;
                        j2 = linkerMediaChangeOperator.userId;
                    } else {
                        i3 = 2;
                        j2 = 0;
                    }
                    dataChannel4.LC0(LinkGuestZoomEvent.class, new C922840a7e(str, str3, enumC1990907r12, c00is2, i3, j2));
                }
            } else {
                if (this.LJII != 2 || !Intrinsics.LJFF(this.LJ, AbstractC919790a2j.LJIILIIL())) {
                    z4 = false;
                }
                if (this.LJII == 1 && Intrinsics.LJFF(this.LJ, AbstractC919790a2j.LJIILIIL())) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.LJII == 3 && Intrinsics.LJFF(this.LJ, AbstractC919790a2j.LJIILIIL())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((z4 || z || z2) && (dataChannel = this.LIZ) != null) {
                    String str4 = this.LJ;
                    EnumC1990907r1 enumC1990907r13 = EnumC1990907r1.ZOOM_MIN;
                    C00IS c00is3 = C00IS.SOURCE_IM;
                    if (linkerMediaChangeOperator != null) {
                        i2 = linkerMediaChangeOperator.operatorType;
                        j = linkerMediaChangeOperator.userId;
                    } else {
                        i2 = 2;
                        j = 0;
                    }
                    dataChannel.LC0(LinkGuestZoomEvent.class, new C922840a7e(str, str4, enumC1990907r13, c00is3, i2, j));
                }
            }
        }
        if (i6 != i && i6 != 2) {
            if (i6 == 3 || i6 == 4 || i6 == 5) {
                C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                boolean zLIZJ = C930540aK4.LIZJ();
                c918060Zzw.getClass();
                if (!C918060Zzw.LIZ(zLIZJ)) {
                    Layout layoutLJII = LJII();
                    if (layoutLJII != null) {
                        layoutId = layoutLJII.layoutId;
                    } else {
                        layoutId = null;
                    }
                    if (MultiGuestSameAsIosZoomSetting.INSTANCE.isEnable()) {
                        InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
                        if (interfaceC937900aVwLIZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLIZ.LJJJJZ()) != null) {
                            layoutId = interfaceC937820aVoLJJJJZ.getLayoutId();
                        } else {
                            layoutId = null;
                        }
                    }
                    AbstractC919790a2j.LJJIJIIJIL(this, i6, null, 6);
                    InterfaceC937900aVw interfaceC937900aVwLIZ2 = C920280a3W.LIZ();
                    if (interfaceC937900aVwLIZ2 != null) {
                        interfaceC937900aVwLIZ2.LJJJJIZL(layoutId, false, false, i, false, new C916150Zwr());
                    }
                }
                C917290Zyh.LIZ.LJIIJ(false);
            }
        } else {
            String str5 = null;
            C918060Zzw c918060Zzw2 = C918060Zzw.LIZ;
            boolean zLIZJ2 = C930540aK4.LIZJ();
            c918060Zzw2.getClass();
            if (!C918060Zzw.LIZ(zLIZJ2)) {
                Layout layoutLJII2 = LJII();
                if (layoutLJII2 != null) {
                    str5 = layoutLJII2.layoutId;
                }
                AbstractC919790a2j.LJJIIZI(this, str, LJII(), LJIILLIIL(C920280a3W.LIZ(), str), i6, null, null, 48);
                InterfaceC937900aVw interfaceC937900aVwLIZ3 = C920280a3W.LIZ();
                if (interfaceC937900aVwLIZ3 != null) {
                    z3 = true;
                    interfaceC937900aVwLIZ3.LJJJJIZL(str5, false, false, true, false, new C916150Zwr());
                } else {
                    z3 = true;
                }
            } else {
                z3 = true;
            }
            C917290Zyh.LIZ.LJIIJ(z3);
        }
        DataChannel dataChannel5 = this.LIZ;
        if (dataChannel5 != null) {
            dataChannel5.LC0(LinkReceiveEnlargeMessageEvent.class, linkerEnlargeStatusSynContent);
        }
    }

    @Override // X.AbstractC919790a2j
    public void LJJII(int i, InterfaceC937900aVw interfaceC937900aVw) {
        if (C01HE.LJ() != C01FV.GUEST) {
            return;
        }
        LJJIIJ(i, interfaceC937900aVw);
    }

    @Override // X.AbstractC919790a2j
    public final AbstractC19486711Lt LJJIIJZLJL(int i, boolean z) {
        return C11QJ.LL;
    }

    public final void LJJIJLIJ(String str, String str2) {
        boolean z;
        String str3;
        if (C01HE.LJ() != C01FV.GUEST) {
            return;
        }
        C918060Zzw.LIZ.getClass();
        if (C918060Zzw.LIZ(false)) {
            return;
        }
        AbstractC919790a2j.LJIIJJI.getClass();
        String str4 = AbstractC919790a2j.LJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadZoomDataFromRoomRTCMessage zoomLinkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" zoomPosition=");
        sbLIZ.append(str2);
        C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str5 = null;
        if (!z) {
            Layout layoutLJII = LJII();
            if (layoutLJII != null) {
                str5 = layoutLJII.layoutId;
            }
            AbstractC919790a2j.LJJIIZI(this, str, LJII(), LJIILLIIL(C920280a3W.LIZ(), str), 0, null, null, 48);
            InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ != null) {
                interfaceC937900aVwLIZ.LJJJJIZL(str5, false, false, true, false, new C916150Zwr());
            }
            C917290Zyh.LIZ.LJIIJ(true);
            return;
        }
        if (str2.length() == 0) {
            Layout layoutLJII2 = LJII();
            if (layoutLJII2 != null) {
                str3 = layoutLJII2.layoutId;
            } else {
                str3 = null;
            }
            AbstractC919790a2j.LJJIJIIJIL(this, 0, null, 6);
            InterfaceC937900aVw interfaceC937900aVwLIZ2 = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ2 != null) {
                interfaceC937900aVwLIZ2.LJJJJIZL(str3, false, false, true, false, new C916150Zwr());
            }
            C917290Zyh.LIZ.LJIIJ(false);
            return;
        }
        InterfaceC937900aVw interfaceC937900aVwLIZ3 = C920280a3W.LIZ();
        if (interfaceC937900aVwLIZ3 == null) {
            return;
        }
        LJJII(CastIntegerProtector.parseInt(str2), interfaceC937900aVwLIZ3);
    }

    @Override // X.AbstractC919790a2j
    public final void LJJIJ(String str, int i, InterfaceC937900aVw interfaceC937900aVw, Boolean bool) {
        int i2;
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (!C918060Zzw.LIZ(zLIZJ) && C01HE.LJ() == C01FV.GUEST && interfaceC937900aVw != null) {
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
