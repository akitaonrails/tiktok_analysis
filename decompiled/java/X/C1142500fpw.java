package X;

import Y.AcS497S0100000_17;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS205S0000000_17;
import njp.a;

/* JADX INFO: renamed from: X.0fpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.PopupUtilKt$openSendGiftPopup$1", f = "PopupUtil.kt", l = {47}, m = "invokeSuspend")
public final class C1142500fpw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1124770fNL LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Function0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142500fpw(C1124770fNL c1124770fNL, DataChannel dataChannel, Context context, Function0<Boolean> function0, InterfaceC1364105Vn<? super C1142500fpw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1124770fNL;
        this.LLILLL = dataChannel;
        this.LLILZ = context;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1142500fpw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        final C099F c099fLIZIZ;
        boolean z;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("PopupUtilKt@4fd8.openSendGiftPopup$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            final long j = this.LLILLJJLI.LIZ;
            DataChannel dataChannel = this.LLILLL;
            GiftService giftService = GiftService.LLILLJJLI;
            if (giftService.findGiftById(j) != null) {
                c099fLIZIZ = C090F.LIZ(Boolean.TRUE);
            } else {
                C470360IcU.LIZ(AFwS205S0000000_17.get$arr$(150));
                c099fLIZIZ = C090F.LIZIZ();
                AbstractC1132980faa abstractC1132980faa = new AbstractC1132980faa() { // from class: X.01pr
                    @Override // X.AbstractC1132980faa
                    public final void LIZIZ(List<Gift> list) {
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0008, code lost:
                    
                        continue;
                     */
                    @Override // X.AbstractC1132980faa
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZJ(java.util.List r10, com.bytedance.android.livesdk.gift.model.GiftsInfo r11, com.bytedance.android.livesdk.gift.model.GiftStrategyData r12, long r13, int r15) {
                        /*
                            r9 = this;
                            if (r10 == 0) goto L3c
                            long r3 = r1
                            java.util.Iterator r8 = r10.iterator()
                        L8:
                            boolean r0 = r8.hasNext()
                            if (r0 == 0) goto L3c
                            java.lang.Object r7 = r8.next()
                            r0 = r7
                            com.bytedance.android.livesdk.gift.model.GiftPage r0 = (com.bytedance.android.livesdk.gift.model.GiftPage) r0
                            java.util.List<com.bytedance.android.livesdk.model.Gift> r0 = r0.gifts
                            if (r0 == 0) goto L8
                            java.util.Iterator r6 = r0.iterator()
                        L1d:
                            boolean r0 = r6.hasNext()
                            if (r0 == 0) goto L8
                            java.lang.Object r5 = r6.next()
                            r0 = r5
                            com.bytedance.android.livesdk.model.Gift r0 = (com.bytedance.android.livesdk.model.Gift) r0
                            long r1 = r0.id
                            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                            if (r0 != 0) goto L1d
                            if (r5 == 0) goto L8
                            if (r7 == 0) goto L3c
                            X.05XL<java.lang.Boolean> r1 = r3
                            java.lang.Boolean r0 = java.lang.Boolean.TRUE
                            r1.LJIIZILJ(r0)
                            return
                        L3c:
                            X.05XL<java.lang.Boolean> r1 = r3
                            java.lang.Boolean r0 = java.lang.Boolean.FALSE
                            r1.LJIIZILJ(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C454901pr.LIZJ(java.util.List, com.bytedance.android.livesdk.gift.model.GiftsInfo, com.bytedance.android.livesdk.gift.model.GiftStrategyData, long, int):void");
                    }
                };
                long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
                if (roomLJJLIIIIJ != null && roomLJJLIIIIJ.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                    z = true;
                } else {
                    z = false;
                }
                giftService.syncGiftList(abstractC1132980faa, jLJJLIIIJ, 11, z);
            }
            this.LL = 1;
            objLJLIIIL = c099fLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("PopupUtilKt@4fd8.openSendGiftPopup$1");
                return objLJFF;
            }
        }
        if (!((Boolean) objLJLIIIL).booleanValue()) {
            Activity activityLIZ = C2493909px.LIZ(this.LLILZ);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131850976);
                c1389890mGx.LJIIJJI();
            }
        } else if (this.LLILZIL.invoke().booleanValue()) {
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            C1124770fNL c1124770fNL = this.LLILLJJLI;
            iGiftService.sendIncentiveGift(new C1129950fVh(false, false, c1124770fNL.LIZIZ, c1124770fNL.LIZ, null, 48), this.LLILLL);
        } else {
            Context context = this.LLILZ;
            DataChannel dataChannel2 = this.LLILLL;
            C1124770fNL c1124770fNL2 = this.LLILLJJLI;
            final C1142530fpz c1142530fpz = new C1142530fpz(context, dataChannel2, c1124770fNL2.LIZIZ, c1124770fNL2.LIZ);
            int iLIZJ = (int) C1131530fYF.LIZJ();
            String strLJIIL = C497740JfY.LJIIL(2131755774, iLIZJ, Integer.valueOf(iLIZJ));
            String strLJIIL2 = C497740JfY.LJIIL(2131755772, iLIZJ, Integer.valueOf(iLIZJ));
            C782110Um9 c782110Um9 = new C782110Um9(context);
            C753520Th8 c753520Th8 = new C753520Th8("tiktok_live_revenue_demand_5", "ttlive_ic_exchange_pre_rewards.png");
            c782110Um9.LIZIZ();
            c753520Th8.LIZJ = 1;
            c782110Um9.LJFF = c753520Th8;
            c782110Um9.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(52.0f)));
            c782110Um9.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(85.0f)));
            c782110Um9.LJIIIZ(strLJIIL2);
            c782110Um9.LJIILJJIL = false;
            c782110Um9.LIZJ = strLJIIL;
            c782110Um9.LJJIII = new InterfaceC782250UmN() { // from class: X.0fq0
                @Override // X.InterfaceC782250UmN
                public final void LIZIZ() {
                    C1142520fpy.LIZ(c1142530fpz.LIZIZ, "cancel");
                }
            };
            c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0fpx
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    String str = c1142530fpz.LIZIZ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_popup_show");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(str, "gift_enter_from");
                    c474500IjALIZ.LJJII("ug_live_first_consume_task", "task_type");
                    c474500IjALIZ.LJJII("normal", "popup_name");
                    c474500IjALIZ.LIZ();
                }
            };
            C494720Jag c494720Jag = new C494720Jag();
            C755620TkW c755620TkW = new C755620TkW();
            c755620TkW.LIZ = C497740JfY.LJIJI(2131851987);
            c755620TkW.LIZJ = new AcS497S0100000_17(c1142530fpz, 4);
            c494720Jag.LIZ(new C0TZ2(c755620TkW));
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(2131851985);
            c755630TkX.LIZJ = new AcS497S0100000_17(c1142530fpz, 5);
            c494720Jag.LIZ(new C0TZ3(c755630TkX));
            c494720Jag.LIZIZ = 1;
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            c1142530fpz.LIZLLL = liveDialogLIZ;
            C786410Ut5.E4(liveDialogLIZ);
            Boolean.valueOf(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PopupUtilKt@4fd8.openSendGiftPopup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
