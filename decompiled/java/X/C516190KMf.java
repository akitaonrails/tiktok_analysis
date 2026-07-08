package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import com.bytedance.android.livesdk.chatroom.api.LevelBadge;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.model.message.PushContractStatusResult;
import com.bytedance.android.livesdk.model.message.SubContractStatusMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516190KMf implements OnMessageListener, C0KO8 {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C0KJK LL;
    public IMessageManager LLILLJJLI;
    public final List<String> LLILLL = new ArrayList();
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0KO3());
    public final C0KNA LLILZIL = new C0KNA(this);

    public C516190KMf(C0KJK c0kjk) {
        this.LL = c0kjk;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[PHI: r9
      0x0041: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:19:0x003f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[PHI: r9
      0x0045: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:19:0x003f, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0KO8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.model.message.PushContractStatusResult r16) {
        /*
            r15 = this;
            X.0KJK r0 = r15.LL
            if (r0 != 0) goto L5
            return
        L5:
            java.util.List<java.lang.String> r2 = r15.LLILLL
            r1 = r16
            java.lang.String r0 = r1.contractid
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L14
            return
        L14:
            java.lang.String r2 = r1.contractid
            X.0KJK r0 = r15.LL
            java.lang.String r0 = r0.LJJIII
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L21
            return
        L21:
            X.0KJK r0 = r15.LL
            r15.LIZIZ(r1, r0)
            X.0KLn r3 = X.C516010KLn.LIZ
            r3.getClass()
            long r6 = X.C516010KLn.LIZIZ()
            X.0KJK r0 = r15.LL
            if (r0 == 0) goto L84
            boolean r4 = r0.LJIIIIZZ
        L35:
            java.lang.String r5 = r1.contractid
            if (r0 == 0) goto L3d
            java.lang.String r9 = r0.LIZLLL
            if (r9 != 0) goto L41
        L3d:
            java.lang.String r9 = "normal_sub"
            if (r0 == 0) goto L45
        L41:
            java.lang.String r10 = r0.LIZIZ
            if (r10 != 0) goto L47
        L45:
            java.lang.String r10 = ""
        L47:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r0.LIZJ
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            X.0KM7 r11 = X.C0W0R.LIZ(r0)
            X.01GW r0 = r15.LLILZ
            java.lang.Object r2 = r0.getValue()
            java.lang.String r1 = r1.contractid
            X.0KJK r0 = r15.LL
            int r0 = r0.LJIILL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.getClass()
            X.0KML r0 = X.C0KMK.LIZIZ(r0, r1)
            if (r0 == 0) goto L81
            java.lang.String r12 = r0.LIZ()
        L70:
            X.0KJK r14 = r15.LL
            java.util.Map r13 = X.C2097608Jq.LJ()
            r8 = -3
            r3.LJIJ(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
            long r0 = java.lang.System.currentTimeMillis()
            X.C516010KLn.LIZLLL = r0
            return
        L81:
            java.lang.String r12 = "unknown"
            goto L70
        L84:
            r4 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516190KMf.LIZ(com.bytedance.android.livesdk.model.message.PushContractStatusResult):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        SubContractStatusMessage subContractStatusMessage;
        PushContractStatusResult pushContractStatusResult;
        String strLIZ;
        Map<String, String> map;
        C0KJK c0kjk = this.LL;
        if ((iMessage instanceof SubContractStatusMessage) && c0kjk != null && (pushContractStatusResult = (subContractStatusMessage = (SubContractStatusMessage) iMessage).data) != null && pushContractStatusResult.status == 1) {
            String str = pushContractStatusResult.contractid;
            if (str == null) {
                str = "";
            }
            if (!((ArrayList) this.LLILLL).contains(str)) {
                LIZIZ(subContractStatusMessage.data, this.LL);
                C0KJK c0kjk2 = this.LL;
                if (c0kjk2 != null && (map = c0kjk2.LJFF) != null) {
                    map.put("trigger_from", "normal_iap_finish");
                }
                PushContractStatusResult pushContractStatusResult2 = subContractStatusMessage.data;
                if (pushContractStatusResult2 != null) {
                    C516010KLn.LIZ.getClass();
                    long jLIZIZ = C516010KLn.LIZIZ();
                    C0KJK c0kjk3 = this.LL;
                    String str2 = pushContractStatusResult2.contractid;
                    Object value = this.LLILZ.getValue();
                    Integer numValueOf = Integer.valueOf(this.LL.LJIILL);
                    value.getClass();
                    C0KML c0kmlLIZIZ = C0KMK.LIZIZ(numValueOf, str);
                    if (c0kmlLIZIZ != null) {
                        strLIZ = c0kmlLIZIZ.LIZ();
                    } else {
                        strLIZ = "unknown";
                    }
                    this.LLILZIL.LIZJ(LIZJ(this, c0kjk3, str2, jLIZIZ, -1, strLIZ, null, false, 224));
                    C516010KLn.LIZLLL = System.currentTimeMillis();
                }
            }
        }
    }

    public final void LIZIZ(Object obj, C0KJK c0kjk) {
        String str;
        Integer numValueOf;
        SubscribeBadge subscribeBadge;
        SubLevel subLevel;
        LevelBadge levelBadge;
        Map<String, String> map;
        String str2;
        Map<String, String> map2;
        String str3;
        C0KMQ c0kmq;
        String str4;
        Integer numValueOf2;
        SubscribeBadge subscribeBadge2;
        CheckSubOrderResultStruct.SubLevel subLevel2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishSubscribe package id = ");
        C0KJK c0kjk2 = this.LL;
        String str5 = null;
        if (c0kjk2 != null) {
            str = c0kjk2.LJI;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTier", C2188811AlT.LIZIZ(sbLIZ));
        C515420KJg c515420KJg = new C515420KJg();
        if (obj instanceof CheckSubOrderResultStruct) {
            CheckSubOrderResultStruct checkSubOrderResultStruct = (CheckSubOrderResultStruct) obj;
            if (((ArrayList) this.LLILLL).contains(checkSubOrderResultStruct.orderID)) {
                return;
            }
            C516010KLn c516010KLn = C516010KLn.LIZ;
            long jUptimeMillis = SystemClock.uptimeMillis();
            c516010KLn.getClass();
            C516010KLn.LIZJ = jUptimeMillis;
            Object value = this.LLILZ.getValue();
            String str6 = checkSubOrderResultStruct.orderID;
            if (c0kjk != null) {
                numValueOf2 = Integer.valueOf(c0kjk.LJIILL);
            } else {
                numValueOf2 = null;
            }
            C0KMJ c0kmj = C0KMJ.QUERY_ORDER_SUCCEED;
            value.getClass();
            C0KMK.LIZJ(str6, numValueOf2, c0kmj);
            ((ArrayList) this.LLILLL).add(checkSubOrderResultStruct.orderID);
            CheckSubOrderResultStruct.SubChargeInfo subChargeInfo = checkSubOrderResultStruct.subChargeInfo;
            if (subChargeInfo != null && (subLevel2 = subChargeInfo.subLevel) != null) {
                subscribeBadge2 = subLevel2.subscribeBadge;
            } else {
                subscribeBadge2 = null;
            }
            c515420KJg.LIZ = subscribeBadge2;
            c515420KJg.LIZIZ = checkSubOrderResultStruct.toast;
        } else if (obj instanceof PushContractStatusResult) {
            PushContractStatusResult pushContractStatusResult = (PushContractStatusResult) obj;
            if (((ArrayList) this.LLILLL).contains(pushContractStatusResult.contractid)) {
                return;
            }
            Object value2 = this.LLILZ.getValue();
            String str7 = pushContractStatusResult.contractid;
            if (c0kjk != null) {
                numValueOf = Integer.valueOf(c0kjk.LJIILL);
            } else {
                numValueOf = null;
            }
            C0KMJ c0kmj2 = C0KMJ.QUERY_ORDER_SUCCEED;
            value2.getClass();
            C0KMK.LIZJ(str7, numValueOf, c0kmj2);
            ((ArrayList) this.LLILLL).add(pushContractStatusResult.contractid);
            SubInfo subInfo = pushContractStatusResult.subInfo;
            if (subInfo != null && (subLevel = subInfo.subLevel) != null && (levelBadge = subLevel.badge) != null) {
                subscribeBadge = new SubscribeBadge();
                subscribeBadge.setOriginImage(levelBadge.originImg);
                subscribeBadge.setPreviewImage(levelBadge.previewImg);
            } else {
                subscribeBadge = null;
            }
            c515420KJg.LIZ = subscribeBadge;
            c515420KJg.LIZIZ = pushContractStatusResult.toast;
        }
        if (c0kjk == null || !c0kjk.LJJIFFI) {
            if (c0kjk != null) {
                map = c0kjk.LJ;
                str2 = c0kjk.LJIIJJI;
                map2 = c0kjk.LJFF;
                str3 = c0kjk.LIZIZ;
            } else {
                map = null;
                str2 = null;
                map2 = null;
                str3 = null;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_purchase_successfully");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str2, "subscribe_type");
            c474500IjALIZ.LJJII("IAP", "payment_method");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJJIIZI(map2);
            c474500IjALIZ.LJJII(0, "is_shorten_version");
            c474500IjALIZ.LJJII(str3, "show_entrance");
            C0KDR.LIZ(c474500IjALIZ);
            c474500IjALIZ.LIZ();
        }
        if (c515420KJg.LIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("1.send subscribe success event package id = ");
            if (c0kjk != null) {
                str4 = c0kjk.LJI;
            } else {
                str4 = null;
            }
            sbLIZ2.append(str4);
            C20441214yg.LIZIZ("MultiTier", C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("1.send subscribe success event package id = ");
        if (c0kjk != null) {
            str5 = c0kjk.LJI;
        }
        sbLIZ3.append(str5);
        C20441214yg.LIZIZ("MultiTier", C2188811AlT.LIZIZ(sbLIZ3));
        C0KJK c0kjk3 = this.LL;
        if (c0kjk3 != null && (c0kmq = c0kjk3.LJJI) != null) {
            c0kmq.LIZ(c0kjk3, "success", "success", c515420KJg);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r29, X.C0KJK r30, boolean r31, java.lang.String r32, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Throwable, kotlin.Unit> r33, X.InterfaceC1364105Vn<? super X.C0KO2> r34) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516190KMf.LIZLLL(java.lang.String, X.0KJK, boolean, java.lang.String, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public static C516470KNh LIZJ(C516190KMf c516190KMf, C0KJK c0kjk, String str, long j, int i, String str2, String str3, boolean z, int i2) {
        boolean z2 = z;
        String str4 = str2;
        int i3 = i;
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        String str5 = "";
        if ((i2 & 16) != 0) {
            str4 = "";
        }
        if ((i2 & 32) == 0) {
            str5 = str3;
        }
        if ((i2 & 128) != 0) {
            z2 = false;
        }
        c516190KMf.getClass();
        return new C516470KNh(c0kjk, j, str, i3, str4, str5, null, z2, "");
    }
}
