package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveTrimStreamDataExp;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.IMessageService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463900IHc implements InterfaceC469600IbG {
    public static final C01GW<C463900IHc> LJIIJJI = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS193S0000000_7.get$arr$(273));
    public EnterRoomConfig LIZJ;
    public C464960ILe LIZLLL;
    public C463980IHk LJ;
    public InterfaceC463960IHi LJFF;
    public InterfaceC463940IHg LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public final int LIZ = 1;
    public final int LIZIZ = 2;
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(274));

    public final void LIZIZ() {
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = false;
        C463980IHk c463980IHk = this.LJ;
        if (c463980IHk != null) {
            c463980IHk.LIZLLL = false;
            C11JF c11jf = c463980IHk.LIZ;
            if (c11jf != null && !c11jf.isDisposed()) {
                c463980IHk.LIZ.dispose();
            }
        }
        C464960ILe c464960ILe = this.LIZLLL;
        if (c464960ILe != null) {
            c464960ILe.LIZJ();
        }
        this.LJ = null;
        this.LIZLLL = null;
        this.LJI = null;
        this.LJFF = null;
    }

    public final void LIZLLL(C0IE9 c0ie9) {
        Integer num;
        String str;
        Pair<Integer, String> pair;
        C463980IHk c463980IHk = this.LJ;
        if (c463980IHk != null) {
            if (this.LJII == this.LIZ) {
                c0ie9.LIZIZ(c463980IHk.LJ);
                this.LJII = 0;
                return;
            }
            if (this.LJII == this.LIZIZ) {
                Pair<Integer, String> pair2 = c463980IHk.LIZIZ;
                if (pair2 != null && (num = (Integer) pair2.first) != null) {
                    int iIntValue = num.intValue();
                    C463980IHk c463980IHk2 = this.LJ;
                    if (c463980IHk2 != null && (pair = c463980IHk2.LIZIZ) != null) {
                        str = (String) pair.second;
                    } else {
                        str = null;
                    }
                    c0ie9.LIZ(iIntValue, str);
                }
                this.LJII = 0;
                return;
            }
        }
        this.LJFF = c0ie9;
    }

    public final void LJ(InterfaceC463940IHg interfaceC463940IHg) {
        C463950IHh c463950IHh;
        C463990IHl c463990IHl;
        int i = this.LJIIIIZZ;
        C463950IHh c463950IHh2 = null;
        if (i == this.LIZ) {
            C464960ILe c464960ILe = this.LIZLLL;
            if (c464960ILe != null) {
                c463950IHh2 = c464960ILe.LLJLL;
            }
            interfaceC463940IHg.LIZJ(c463950IHh2);
            this.LJIIIIZZ = 0;
            if (this.LJIIIZ && this.LJI == null) {
                this.LJI = interfaceC463940IHg;
                return;
            }
            return;
        }
        if (i == this.LIZIZ) {
            C464960ILe c464960ILe2 = this.LIZLLL;
            if (c464960ILe2 != null && (c463990IHl = c464960ILe2.LLILZLL) != null) {
                interfaceC463940IHg.LIZLLL(c463990IHl.LIZ, c463990IHl.LIZIZ, c463990IHl.LIZJ, null);
            }
            this.LJIIIIZZ = 0;
            return;
        }
        if (i == 3) {
            C464960ILe c464960ILe3 = this.LIZLLL;
            if (c464960ILe3 != null) {
                c463950IHh2 = c464960ILe3.LLJLL;
            }
            interfaceC463940IHg.LIZIZ(c463950IHh2);
            this.LJI = interfaceC463940IHg;
            return;
        }
        if (i == 4) {
            C464960ILe c464960ILe4 = this.LIZLLL;
            if (c464960ILe4 != null) {
                c463950IHh = c464960ILe4.LLJLL;
            } else {
                c463950IHh = null;
            }
            interfaceC463940IHg.LIZIZ(c463950IHh);
            C464960ILe c464960ILe5 = this.LIZLLL;
            if (c464960ILe5 != null) {
                c463950IHh2 = c464960ILe5.LLJLL;
            }
            interfaceC463940IHg.LIZ(c463950IHh2);
            this.LJIIIIZZ = 0;
            return;
        }
        this.LJI = interfaceC463940IHg;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    @Override // X.InterfaceC469600IbG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r7, com.bytedance.android.livesdkapi.session.EnterRoomConfig r8) {
        /*
            r6 = this;
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r0 = r8.mStreamData
            boolean r0 = r0.isWithPush
            r2 = 1
            if (r0 != 0) goto Lb5
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r0 = (com.bytedance.android.livesdkapi.host.IHostAction) r0
            r0.getLivePreloadService()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r1 = r0.enterFromMerge
            java.lang.String r0 = "push"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto Lb5
            com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomWithoutStreamFix r0 = com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomWithoutStreamFix.INSTANCE
            boolean r0 = r0.enable()
            if (r0 != 0) goto L3a
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r0 = r8.mStreamData
            java.lang.String r0 = r0.pullStreamData
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3a
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r0 = r8.mStreamData
            java.lang.String r0 = r0.pullStreamUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb5
        L3a:
            r0 = 1
        L3b:
            r3 = 0
            r4 = 0
            if (r0 != 0) goto La2
            r6.LIZIZ()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r0 = r0.userId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L92
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r1 = r0.userId
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L92
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            r0.isPreFetchUserRoom = r2
            r6.LIZJ = r8
            java.lang.String r0 = r0.userId
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r5 = r0.secUid
            r0 = 137923(0x21ac3, float:1.93271E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            X.01GW r0 = r6.LJIIJ
            java.lang.Object r1 = r0.getValue()
            X.0IIE r1 = (X.C0IIE) r1
            java.lang.String r0 = "before_request_info_by_user"
            r1.LIZIZ(r0)
            X.0IHk r1 = new X.0IHk
            X.0IHf r0 = new X.0IHf
            r0.<init>()
            r1.<init>(r0, r2, r5)
            r6.LJ = r1
            r1.LIZIZ()
            if (r4 == 0) goto L91
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L91:
            return
        L92:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            long r1 = r0.roomId
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L91
            java.lang.String r0 = X.C0IX5.LJ(r1)
            r6.LIZJ(r7, r8, r0, r3)
            return
        La2:
            r6.LIZIZ()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            long r1 = r0.roomId
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L91
            java.lang.String r0 = X.C0IX5.LJ(r1)
            r6.LIZJ(r7, r8, r0, r3)
            return
        Lb5:
            r0 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C463900IHc.LIZ(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public final void LIZJ(Context context, EnterRoomConfig enterRoomConfig, String str, String str2) {
        String strLIZIZ;
        boolean z;
        EnterRoomConfig.RoomsData roomsData;
        ((C0IIE) this.LJIIJ.getValue()).LIZIZ("before_request_room_enter");
        this.LIZJ = enterRoomConfig;
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.enterFromMergeRecommend)) {
            strLIZIZ = enterRoomConfig.mRoomsData.enterFromMergeRecommend;
        } else if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.enterFromMerge)) {
            if (TextUtils.isEmpty(enterRoomConfig.mRoomsData.enterMethod)) {
                strLIZIZ = enterRoomConfig.mRoomsData.enterFromMerge;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
                sbLIZ.append('-');
                sbLIZ.append(enterRoomConfig.mRoomsData.enterMethod);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            strLIZIZ = "";
        }
        HashMap<String, String> mapLJI = C0IXW.LJI(C0IXW.LJIIIIZZ(enterRoomConfig));
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        if (C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(enterRoomConfig.mRoomsData.roomId), false, 2) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("commerce_flow_banner-");
            sbLIZ2.append(C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(enterRoomConfig.mRoomsData.roomId), false, 2));
            mapLJI.put("enter_method", C2188811AlT.LIZIZ(sbLIZ2));
        }
        HashMap map = new HashMap();
        map.put("ecommerce_use_async_load", String.valueOf(enterRoomConfig.mECData.isPrefetchPinEnabled));
        String str3 = enterRoomConfig.mRoomsData.shareFromUserId;
        EnterRoomConfig enterRoomConfig2 = this.LIZJ;
        if (enterRoomConfig2 != null && (roomsData = enterRoomConfig2.mRoomsData) != null && roomsData.fromShareDeepLink && ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Lc1()) {
            str3 = enterRoomConfig.mLogData.shareFromUserId;
            z = true;
        } else {
            z = false;
        }
        InterfaceC463940IHg interfaceC463940IHg = new InterfaceC463940IHg() { // from class: X.0IHd
            @Override // X.InterfaceC463940IHg
            public final void LIZ(C463950IHh c463950IHh) {
                C463900IHc c463900IHc = this.LIZ;
                c463900IHc.LJIIIIZZ = 4;
                InterfaceC463940IHg interfaceC463940IHg2 = c463900IHc.LJI;
                if (interfaceC463940IHg2 != null) {
                    interfaceC463940IHg2.LIZ(c463950IHh);
                }
                this.LIZ.LJI = null;
            }

            @Override // X.InterfaceC463940IHg
            public final void LIZIZ(C463950IHh c463950IHh) {
                C463900IHc c463900IHc = this.LIZ;
                c463900IHc.LJIIIIZZ = 3;
                InterfaceC463940IHg interfaceC463940IHg2 = c463900IHc.LJI;
                if (interfaceC463940IHg2 != null) {
                    interfaceC463940IHg2.LIZIZ(c463950IHh);
                }
            }

            @Override // X.InterfaceC463940IHg
            public final void LIZJ(C463950IHh c463950IHh) {
                boolean zLJI = MethodIDManager.LJI(72018);
                C463900IHc c463900IHc = this.LIZ;
                c463900IHc.LJIIIIZZ = c463900IHc.LIZ;
                InterfaceC463940IHg interfaceC463940IHg2 = c463900IHc.LJI;
                if (interfaceC463940IHg2 != null) {
                    interfaceC463940IHg2.LIZJ(c463950IHh);
                }
                if (c463950IHh.LIZJ != 3) {
                    C463900IHc c463900IHc2 = this.LIZ;
                    c463900IHc2.LJI = null;
                    c463900IHc2.LJIIIZ = false;
                } else {
                    this.LIZ.LJIIIZ = true;
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }

            @Override // X.InterfaceC463940IHg
            public final void LIZLLL(int i, String str4, String str5, String str6) {
                C463900IHc c463900IHc = this.LIZ;
                c463900IHc.LJIIIIZZ = c463900IHc.LIZIZ;
                InterfaceC463940IHg interfaceC463940IHg2 = c463900IHc.LJI;
                if (interfaceC463940IHg2 != null) {
                    interfaceC463940IHg2.LIZLLL(i, str4, str5, str6);
                }
                C463900IHc c463900IHc2 = this.LIZ;
                c463900IHc2.LJI = null;
                c463900IHc2.LJIIIZ = false;
            }
        };
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        long j = roomsData2.roomId;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str4 = logData.requestId;
        String str5 = roomsData2.enterType;
        String str6 = roomsData2.roomLabels;
        String str7 = logData.liveReason;
        String str8 = roomsData2.enterFromMerge;
        String str9 = roomsData2.enterMethod;
        String strLJIIIIZZ = C0IVR.LJIIIIZZ(enterRoomConfig);
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        C464960ILe c464960ILe = new C464960ILe(interfaceC463940IHg, j, str4, str5, str6, strLIZIZ, str7, str3, mapLJI, str8, str9, map, strLJIIIIZZ, roomsData3.isFresh, roomsData3.actionType, roomsData3.wbcTag, roomsData3.streamType, z, roomsData3.enterTag, roomsData3.mentionMsgId, roomsData3.mgEnterType, roomsData3.mgFromSourceUserId);
        this.LIZLLL = c464960ILe;
        long j2 = enterRoomConfig.mLogData.fromPortalId;
        if (j2 > 0) {
            c464960ILe.LLJJIJIIJIL = j2;
        }
        boolean zIsEnableTrim = LiveTrimStreamDataExp.isEnableTrim(enterRoomConfig);
        C464960ILe c464960ILe2 = this.LIZLLL;
        if (c464960ILe2 != null) {
            c464960ILe2.LIZIZ(str, str2, zIsEnableTrim, false);
        }
        if (!LiveWatchPreloadSettings.INSTANCE.messageManagerDisable() && context != null && ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).getReuse() == null) {
            ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).messageManagerProvider(enterRoomConfig.mRoomsData.roomId, false, context, true);
        }
    }
}
