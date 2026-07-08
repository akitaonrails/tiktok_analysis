package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C0UO0;
import X.C1144350fsv;
import X.C1149170g0h;
import X.C1149180g0i;
import X.C1149680g1W;
import X.C1149890g1r;
import X.C1149970g1z;
import X.C1150170g2J;
import X.C1161920gLG;
import X.C19GO;
import X.C497740JfY;
import X.C786410Ut5;
import X.DialogInterfaceOnClickListenerC1151600g4c;
import X.InterfaceC1149850g1n;
import X.InterfaceC1149940g1w;
import X.InterfaceC1149950g1x;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeTaxDialogVM;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxSchemaSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ExchangeTaxDialogVM extends BillingAddressVM {
    public final int LLJJIJI;
    public final long LLJJIJIIJIL;
    public final boolean LLJJIJIL;

    public final String WQ2() {
        int i = this.LLJJIJI;
        return i != 1 ? i != 2 ? "" : "anchor_income" : "ug_exchange";
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0g1u, java.lang.Object] */
    public final void ZQ2() {
        RevenueExchange revenueExchange;
        final Context context = this.LLJILJIL;
        if (context != null) {
            IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            String taxUrlForClient = LiveExchangeTaxSchemaSetting.INSTANCE.getTaxUrlForClient();
            WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            final TaxDialogParams taxDialogParams = new TaxDialogParams();
            taxDialogParams.isAutoExchange = DQ2() ? 1 : 0;
            taxDialogParams.taxSchema = taxUrlForClient;
            taxDialogParams.exchangeSource = "11";
            int i = this.LLJJIJI;
            taxDialogParams.exchangeWay = i != 1 ? i != 2 ? "NONE" : "LIVE" : "UG";
            taxDialogParams.hasShortVideoGift = (walletStructTF1 == null || (revenueExchange = walletStructTF1.revenue) == null) ? false : revenueExchange.isRevenue();
            taxDialogParams.isPeriodicPayout = walletStructTF1 != null ? walletStructTF1.isPeriodicPayout : false;
            final ?? r5 = new InterfaceC1149950g1x() { // from class: X.0g1u
                @Override // X.InterfaceC1149950g1x
                public final void LJJJJ() {
                }

                @Override // X.InterfaceC1149950g1x
                public final void onCancel() {
                    ExchangeTaxDialogVM exchangeTaxDialogVM = this.LIZ;
                    InterfaceC1149850g1n interfaceC1149850g1n = exchangeTaxDialogVM.LLJILLL;
                    if (interfaceC1149850g1n != null) {
                        exchangeTaxDialogVM.UQ2();
                        interfaceC1149850g1n.LJFF();
                    }
                }
            };
            iWalletExchangeWalletExchange.getClass();
            String strLJIJJ = taxDialogParams.exchangeWay.equals("LIVE") ? taxDialogParams.hasShortVideoGift ? taxDialogParams.isPeriodicPayout ? C497740JfY.LJIJJ(2131841621, "6") : C497740JfY.LJIJJ(2131841623, "6") : taxDialogParams.isPeriodicPayout ? C497740JfY.LJIJJ(2131841620, "6") : C497740JfY.LJIJJ(2131841622, "6") : "";
            C19GO c19go = new C19GO(context);
            c19go.LJJIIJ = false;
            c19go.LIZLLL = C497740JfY.LJIJI(2131841624);
            c19go.LJII = strLJIJJ;
            c19go.LIZIZ = taxDialogParams.ignoreSuppress;
            c19go.LJFF(new DialogInterface.OnClickListener() { // from class: X.0g1s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    User owner;
                    InterfaceC1149950g1x interfaceC1149950g1x = r5;
                    if (interfaceC1149950g1x != null) {
                        interfaceC1149950g1x.LJJJJ();
                    }
                    C1149970g1z.LIZJ(taxDialogParams, "continue");
                    Context context2 = context;
                    TaxDialogParams taxDialogParams2 = taxDialogParams;
                    if (C1388190mED.LIZ(context2) != null) {
                        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                        C495520Jby c495520Jby = new C495520Jby(taxDialogParams2.taxSchema);
                        if (room != null) {
                            owner = room.getOwner();
                        } else {
                            owner = null;
                        }
                        c495520Jby.LIZJ("display_id", C0KVU.LJ(owner));
                        c495520Jby.LIZJ("exchange_source", taxDialogParams2.exchangeSource);
                        c495520Jby.LIZJ("exchange_way", taxDialogParams2.exchangeWay);
                        c495520Jby.LIZ(taxDialogParams2.isAutoExchange, "is_auto");
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C1388190mED.LIZ(context2), c495520Jby.LIZLLL());
                    }
                }
            }, C497740JfY.LJIJI(2131841618), false);
            c19go.LIZLLL(new DialogInterfaceOnClickListenerC1151600g4c(r5, taxDialogParams, 2), C497740JfY.LJIJI(2131841619), false);
            C786410Ut5.M4(c19go.LIZ());
            C1149970g1z.LIZJ(taxDialogParams, "show");
            XQ2(1, null);
        }
    }

    public final void VQ2() {
        boolean zLJI = MethodIDManager.LJI(202465);
        int i = this.LLJJIJI;
        int i2 = i != 1 ? i != 2 ? -1 : 1 : 0;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        this.LLJJI.LIZ(C1149970g1z.LIZIZ(WQ2(), xQ2(), zQ2().LJ, i2, zQ2().LIZIZ, DQ2(), walletStructTF1 != null && walletStructTF1.autoExchangeSupported).LJFF(new C0UO0()).LJJIIZ(new AfS186S0100000_17(this, 21), new AfS186S0100000_17(this, 22)));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public boolean yQ2() {
        return this.LLJJIJIL;
    }

    public final void YQ2(DefaultLocationData defaultLocationData) {
        wQ2("loading_duration");
        this.LLJIJIL.LJIIL();
        C1149890g1r c1149890g1r = new C1149890g1r();
        if (defaultLocationData != null) {
            C1150170g2J c1150170g2J = new C1150170g2J(defaultLocationData.country, defaultLocationData.state, defaultLocationData.county, defaultLocationData.city, null, 16);
            c1150170g2J.LJFF = defaultLocationData.LIZ;
            c1150170g2J.LJI = defaultLocationData.LIZIZ;
            c1149890g1r.LIZ = c1150170g2J;
        }
        this.LLJJIII = c1149890g1r;
        this.LLJIJIL.LIZ(c1149890g1r);
        XQ2(0, null);
    }

    public final void XQ2(int i, Throwable th) {
        String strWQ2 = WQ2();
        Boolean bool = this.LLILZLL;
        String strValueOf = null;
        if (i == 0) {
            JQ2(strWQ2, ExchangeDialogVM.EQ2(null), Boolean.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE)));
        }
        if (th != null) {
            C1149180g0i.Companion.getClass();
            strValueOf = String.valueOf(C1149170g0h.LIZ(th).getErrorCode());
        }
        long jNo0 = ((long) zQ2().LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        C1149680g1W.LJIIL(i, this.LLILZIL, strWQ2, xQ2(), zQ2().LJ, strValueOf, zQ2().LIZLLL, jNo0);
    }

    public ExchangeTaxDialogVM(int i, Context context, InterfaceC1149850g1n interfaceC1149850g1n, C1144350fsv c1144350fsv, InterfaceC1149940g1w interfaceC1149940g1w) {
        boolean z;
        super(context, interfaceC1149850g1n, c1144350fsv, interfaceC1149940g1w);
        this.LLJJIJI = i;
        long jNo0 = ((long) c1144350fsv.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        this.LLJJIJIIJIL = jNo0;
        if (jNo0 > LiveExchangeConfirmThreshold.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
    }
}
