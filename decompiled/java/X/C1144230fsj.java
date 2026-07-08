package X;

import Y.AfS186S0100000_17;
import android.app.Activity;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveStrategyTaskFinishCashRechargePopupEnableCoinAppSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveStrategyTaskFinishCashRechargePopupEnableSetting;

/* JADX INFO: renamed from: X.0fsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144230fsj {
    public static boolean LIZ;

    public static final boolean LIZIZ() {
        return LiveStrategyTaskFinishCashRechargePopupEnableSetting.INSTANCE.isEnable() || LiveStrategyTaskFinishCashRechargePopupEnableCoinAppSetting.INSTANCE.isEnable();
    }

    public static final IWalletCenter LIZLLL() {
        return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
    }

    public static final C1134410fct LIZJ(C1134410fct c1134410fct) {
        C1134410fct c1134410fct2 = c1134410fct;
        while (true) {
            if (c1134410fct2 == null) {
                break;
            }
            if (c1134410fct2.LJFF != null) {
                Object obj = c1134410fct2.LJFF;
                if (!(obj instanceof C1134410fct)) {
                    break;
                }
                c1134410fct2 = (C1134410fct) obj;
            } else if (c1134410fct2 != null) {
                return c1134410fct2;
            }
        }
        return c1134410fct;
    }

    public static final void LJ(boolean z) {
        int i;
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
        if (c1134860fdc.LIZ() == 0) {
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try preload，entrance is ");
        sbLIZ.append(i);
        sbLIZ.append("，campaignType is ");
        sbLIZ.append(c1134860fdc.LIZ());
        C20441214yg.LIZIZ("TaskPostProcess", C2188811AlT.LIZIZ(sbLIZ));
        if (C1148670fzt.LIZ().getRechargeService().LJIILIIL(i, EnumC587980N4i.STRATEGY_TASK, String.valueOf(c1134860fdc.LIZ())) != null) {
            C20441214yg.LIZIZ("TaskPostProcess", "has cache, no need to preload");
        } else {
            InterfaceC1804390x3V interfaceC1804390x3VInitializeRechargeApiStateTracking = C1148670fzt.LIZ().initializeRechargeApiStateTracking();
            C1148670fzt.LIZ().getRechargeService().LJ(i, 0L, 0L, null, EnumC1803160x1W.USE, c1134860fdc.LIZ(), interfaceC1804390x3VInitializeRechargeApiStateTracking, true).LJIILIIL(new C0UO0()).LJJIJIL(new AfS186S0100000_17(interfaceC1804390x3VInitializeRechargeApiStateTracking, 88)).LJJIIZI(new AfS186S0100000_17(interfaceC1804390x3VInitializeRechargeApiStateTracking, 89)).LJJLL(new C09JN() { // from class: X.0T7T
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("IncentivePreRewardUtilsKt@772.handleIapPreload$3");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("strategy preload success, is cache: ");
                    sbLIZ2.append(((C1804840x4E) obj).LJ);
                    C20441214yg.LIZIZ("TaskPostProcess", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleIapPreload$3");
                }
            }, new C09JN() { // from class: X.0T7S
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("IncentivePreRewardUtilsKt@772.handleIapPreload$4");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("strategy preload failed, exception is ");
                    sbLIZ2.append(((Throwable) obj).getMessage());
                    C20441214yg.LIZIZ("TaskPostProcess", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleIapPreload$4");
                }
            });
        }
    }

    public static final void LJFF(Activity activity, C1134410fct c1134410fct) {
        long j;
        if (LIZ) {
            LIZ = false;
            j = c1134410fct.LJIIIZ().LIZ - c1134410fct.LJIIIZ().LIZLLL;
        } else {
            j = c1134410fct.LJIIIZ().LIZ;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1134250fcd(activity, c1134410fct, j, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(int r6, long r7, int r9, java.lang.String r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C1144240fsk
            if (r0 == 0) goto L9d
            r5 = r11
            X.0fsk r5 = (X.C1144240fsk) r5
            int r2 = r5.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r5.LLIZLLLIL = r2
        L12:
            java.lang.Object r2 = r5.LLIZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLIZLLLIL
            r1 = 1
            if (r0 == 0) goto L74
            if (r0 != r1) goto La4
            int r9 = r5.LLILLJJLI
            long r7 = r5.LLILLL
            int r6 = r5.LL
            X.0Jby r3 = r5.LLILZLL
            X.0Jby r4 = r5.LLILZIL
            java.lang.Object r10 = r5.LLILZ
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r2)
        L30:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0 = 4
            if (r6 == r0) goto L71
            r0 = 11
            if (r6 == r0) goto L6e
            r0 = 13
            if (r6 == r0) goto L6b
            r0 = 14
            if (r6 == r0) goto L68
            java.lang.String r1 = ""
        L47:
            java.lang.String r0 = "gift_enter_from"
            r3.LIZJ(r0, r1)
            java.lang.String r0 = "ug_points"
            r3.LIZIZ(r7, r0)
            java.lang.String r0 = "bonus_gift_name"
            r3.LIZJ(r0, r10)
            java.lang.String r0 = "bonus_gift_num"
            r3.LIZ(r9, r0)
            java.lang.String r0 = "max_bonus_coins"
            r3.LIZ(r2, r0)
            java.lang.String r0 = r4.LIZLLL()
            r0.toString()
            return r0
        L68:
            java.lang.String r1 = "ug_heart_me_task"
            goto L47
        L6b:
            java.lang.String r1 = "ug_first_consume_task"
            goto L47
        L6e:
            java.lang.String r1 = "first_consumption_task_with_creator_income"
            goto L47
        L71:
            java.lang.String r1 = "daily_ug_consume_task"
            goto L47
        L74:
            X.C155000ia.LIZIZ(r2)
            X.0Jby r3 = new X.0Jby
            java.lang.String r0 = "aweme://roma_redirect/?spark_page=task_finish_popup"
            r3.<init>(r0)
            r5.LLILZ = r10
            r5.LLILZIL = r3
            r5.LLILZLL = r3
            r5.LL = r6
            r5.LLILLL = r7
            r5.LLILLJJLI = r9
            r5.LLIZLLLIL = r1
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0fdh r1 = new X.0fdh
            r0 = 0
            r1.<init>(r0)
            java.lang.Object r2 = X.C23250099c.LJI(r5, r2, r1)
            if (r2 != r4) goto L9b
            return r4
        L9b:
            r4 = r3
            goto L30
        L9d:
            X.0fsk r5 = new X.0fsk
            r5.<init>(r11)
            goto L12
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144230fsj.LIZ(int, long, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJI(android.app.Activity r9, int r10, long r11, java.lang.String r13, int r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r3 = r15
            boolean r0 = r3 instanceof X.C1144250fsl
            if (r0 == 0) goto L49
            r8 = r3
            X.0fsl r8 = (X.C1144250fsl) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r8.LLILLL = r2
        L13:
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L4f
            java.lang.Object r9 = r8.LL
            android.content.Context r9 = (android.content.Context) r9
            X.C155000ia.LIZIZ(r3)
        L27:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r9, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            X.C155000ia.LIZIZ(r3)
            r8.LL = r9
            r8.LLILLL = r0
            r6 = r14
            r7 = r13
            r4 = r11
            r3 = r10
            java.lang.Object r3 = LIZ(r3, r4, r6, r7, r8)
            if (r3 != r2) goto L27
            return r2
        L49:
            X.0fsl r8 = new X.0fsl
            r8.<init>(r3)
            goto L13
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144230fsj.LJI(android.app.Activity, int, long, java.lang.String, int, X.05Vn):java.lang.Object");
    }
}
