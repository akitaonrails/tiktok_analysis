package com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue;

import X.C001A;
import X.C002P;
import X.C09JN;
import X.C11S5;
import X.C1338270kvh;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C19487311Lz;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C480460Ism;
import X.C776250Uch;
import X.C917750ZzR;
import X.C917760ZzS;
import X.C917930Zzj;
import X.C945320ahu;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.InterfaceC938950aXd;
import Y.AfS184S0100000_15;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multilive.model.GetShareRevenueInfoParams;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS8S0101100_15;
import org.json.JSONObject;
import webcast.data.MultiGuestShareRevenueSettingInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestGuestShareRevenueViewModel extends AssemViewModel<C917930Zzj> implements InterfaceC938950aXd {
    public static final /* synthetic */ int LLILZ = 0;
    public DataChannel LL;
    public boolean LLILLJJLI = true;
    public final C002P LLILLL = new OnIMMessageListener() { // from class: X.002P
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "share-revenue-message-channel";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r7) {
            /*
                r6 = this;
                if (r7 != 0) goto L3
                return
            L3:
                boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.UpdateShareRevenueNoticeMessage
                if (r0 == 0) goto L55
                com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel r0 = r6.LL
                boolean r0 = r0.LLILLJJLI
                if (r0 != 0) goto Le
                return
            Le:
                com.bytedance.android.livesdk.model.message.UpdateShareRevenueNoticeMessage r7 = (com.bytedance.android.livesdk.model.message.UpdateShareRevenueNoticeMessage) r7
                com.bytedance.android.livesdk.model.message.UpdateShareRevenueStructContent r2 = r7.updateShareRevenueStructContent
                if (r2 == 0) goto L62
                long r0 = r2.shareRevenueValue
            L16:
                int r4 = (int) r0
            L17:
                if (r2 == 0) goto L60
                long r1 = r2.shareRevenueRatio
                int r0 = (int) r1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            L20:
                com.bytedance.android.livesdk.model.message.UpdateShareRevenueStructContent r0 = r7.updateShareRevenueStructContent
                if (r0 == 0) goto L56
                long r2 = r0.version
            L26:
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "MultiGuestGuestShareRevenueViewModel"
                r1.append(r0)
                java.lang.String r0 = "#onReceiveShareRevenueSettingIm :"
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = ", revenueShareRatioForApply:"
                r1.append(r0)
                r1.append(r5)
                java.lang.String r0 = ", settingVersion: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                X.C917750ZzR.LJII(r0)
                com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel r0 = r6.LL
                java.lang.String r1 = "im"
                r0.yQ2(r1, r2, r4, r5)
            L55:
                return
            L56:
                com.bytedance.android.livesdk.model.message.UpdateShareRevenueContent r0 = r7.updateShanreRevenueContent
                if (r0 == 0) goto L5d
                long r2 = r0.version
                goto L26
            L5d:
                r2 = 0
                goto L26
            L60:
                r5 = 0
                goto L20
            L62:
                com.bytedance.android.livesdk.model.message.UpdateShareRevenueContent r0 = r7.updateShanreRevenueContent
                if (r0 == 0) goto L69
                long r0 = r0.value
                goto L16
            L69:
                r4 = 0
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C002P.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C917930Zzj(0);
    }

    public final void vQ2() {
        if (!this.LLILLJJLI) {
            C917750ZzR.LJII("checkAndUpdateApplyData ignore, anchor disable share revenue version");
        } else if (getState().LL == 0) {
            C917750ZzR.LJII("checkAndUpdateApplyData start");
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(((IShareRevenueApi) C480460Ism.LIZLLL(IShareRevenueApi.class)).getShareRevenueInfo(new GetShareRevenueInfoParams()).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()), null, new AfS184S0100000_15(this, 66), new C09JN() { // from class: X.00K0
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MultiGuestGuestShareRevenueViewModel@6205.checkAndUpdateApplyData$3");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkAndUpdateApplyData failed:");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("MultiGuestGuestShareRevenueViewModel@6205.checkAndUpdateApplyData$3");
                }
            }, 24);
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        IMessageManager iMessageManager;
        C917750ZzR.LJII("MultiGuestGuestShareRevenueViewModel#onDestroy");
        try {
            DataChannel dataChannel = this.LL;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) this.LLILLL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeMessageListener failed:");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("revenue_share", C2188811AlT.LIZIZ(sbLIZ));
        }
        C917750ZzR.LJII("MultiGuestRevenueShareSettingHelper#clearSnapshotData");
        C917750ZzR.LIZIZ = null;
        C917750ZzR.LIZ = null;
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        Room room;
        Long lValueOf;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiGuestShareRevenueSettingInfo multiGuestShareRevenueSettingInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings3;
        IMessageManager iMessageManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestGuestShareRevenueViewModel");
        sbLIZ.append("#onCreate");
        C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.UPDATE_SHARE_REVENUE_NOTICE_MESSAGE.getIntType(), (OnIMMessageListener) this.LLILLL);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiGuestGuestShareRevenueViewModel");
            sbLIZ2.append("#onCreate on RoomChannel changed: multiGuestEnableRevenueRatio = ");
            MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
            if (multiLiveUserSettings != null && (multiLiveUserApplySettings3 = multiLiveUserSettings.multiLiveUserApplySettings) != null) {
                lValueOf = Long.valueOf(multiLiveUserApplySettings3.multiGuestEnableRevenueRatio);
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
            if (multiLiveUserSettings2 != null && (multiLiveUserApplySettings = multiLiveUserSettings2.multiLiveUserApplySettings) != null && ((int) multiLiveUserApplySettings.multiGuestEnableRevenueRatio) == 1 && (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (multiGuestShareRevenueSettingInfo = multiLiveUserApplySettings2.multiGuestShareRevenueSettingInfo) != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MultiGuestGuestShareRevenueViewModel");
                sbLIZ3.append("#onCreate apply roomEnter data:");
                sbLIZ3.append(multiGuestShareRevenueSettingInfo.revenueSetting);
                sbLIZ3.append(", shareRevenueRatio:");
                sbLIZ3.append(multiGuestShareRevenueSettingInfo);
                sbLIZ3.append(".revenueSettingRatio");
                C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ3));
                AQ2(Integer.valueOf((int) multiGuestShareRevenueSettingInfo.revenueSetting), Integer.valueOf((int) multiGuestShareRevenueSettingInfo.revenueSettingRatio), "roomEnter");
                yQ2("roomEnter", multiGuestShareRevenueSettingInfo.version, (int) multiGuestShareRevenueSettingInfo.revenueSetting, Integer.valueOf((int) multiGuestShareRevenueSettingInfo.revenueSettingRatio));
            }
        }
    }

    public final void wQ2(C945320ahu c945320ahu) {
        String str;
        if (c945320ahu != null && (str = c945320ahu.LIZIZ) != null) {
            try {
                int i = 1;
                if (JSONObjectProtectorUtils.getInt(new JSONObject(str), "revenueOn") != 1) {
                    i = 2;
                }
                yQ2("none_sei", getState().LLILLL, i, getState().LLILLJJLI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onNoneParsed failed:");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("onNoneParsed", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void zQ2(Map<String, ? extends Map<String, String>> map) {
        Map<String, String> map2;
        Integer numLJIIJJI;
        long jLongValue;
        boolean z;
        int i;
        long jLongValue2;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        if (map != null && (map2 = map.get("revenueOn")) != null) {
            String str = map2.get("on");
            Integer numLJIIJJI2 = null;
            if (str != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str);
            } else {
                numLJIIJJI = null;
            }
            String str2 = map2.get("ratio");
            if (str2 != null) {
                numLJIIJJI2 = C2095008Iq.LJIIJJI(str2);
            }
            String str3 = map2.get("v");
            if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
                jLongValue = lLJIILIIL2.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLJJLI = z;
            if (numLJIIJJI != null && numLJIIJJI.intValue() == 1) {
                i = 1;
            } else {
                i = 2;
            }
            if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
                jLongValue2 = lLJIILIIL.longValue();
            } else {
                jLongValue2 = 0;
            }
            yQ2("sei", jLongValue2, i, numLJIIJJI2);
        }
    }

    public final void xQ2(Integer num, Integer num2) {
        if (num == null && num2 == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveInviteIm shareRevenueSetting :");
        sbLIZ.append(num);
        sbLIZ.append(", shareRevenueRatio:");
        sbLIZ.append(num2);
        C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
        AQ2(num, num2, "IM");
    }

    public final void AQ2(Integer num, Integer num2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateShareRevenueForGuestLinkmic, revenueShare:");
        sbLIZ.append(num);
        sbLIZ.append(" shareRevenueRatio:");
        sbLIZ.append(num2);
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
        int iIntValue = 0;
        if (C917750ZzR.LJI(false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiGuestRevenueShareSettingHelper#updateShareRevenueSnapshotForGuestLinkmic, shareRevenueSwitch = ");
            sbLIZ2.append(num);
            sbLIZ2.append(" shareRevenueRatio = ");
            sbLIZ2.append(num2);
            sbLIZ2.append(" source=");
            sbLIZ2.append(str);
            sbLIZ2.append('}');
            C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            if (num != null) {
                iIntValue = num.intValue();
            }
            C917750ZzR.LIZIZ = new C917760ZzS(iIntValue, num2);
        }
        setState(new AwS381S0200000_15(num, num2, 46));
    }

    public final void yQ2(String str, long j, int i, Integer num) {
        if (j != 0 && getState().LLILLL != 0 && j <= getState().LLILLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateNewestShareRevenue, revenueShare:");
        sbLIZ.append(i);
        sbLIZ.append(" shareRevenueRatio:");
        sbLIZ.append(num);
        sbLIZ.append(" settingVersion:");
        sbLIZ.append(j);
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C917750ZzR.LJIIIIZZ(Integer.valueOf(i), num, str);
        setState(new AwS8S0101100_15(i, num, j, 2));
    }

    public static void BQ2(MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel, C2217371BqR c2217371BqR, LifecycleOwner lifecycleOwner, Function1 function1, int i) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if ((i & 4) != 0) {
            lifecycleOwner2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select state Subscribe [");
        sbLIZ.append(c2217371BqR);
        sbLIZ.append("] ");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(false);
        c1770850wBP.LIZ = false;
        AssemViewModel.selectSubscribe$default(multiGuestGuestShareRevenueViewModel, c2217371BqR, c1770850wBP, lifecycleOwner2, null, function1, 8, null);
    }
}
