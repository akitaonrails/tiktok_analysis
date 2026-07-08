package Y;

import X.AbstractC1126560fQE;
import X.AbstractC1126600fQI;
import X.AbstractC1127100fR6;
import X.AbstractC1150480g2o;
import X.AbstractC1150490g2p;
import X.AnonymousClass0054;
import X.C09JN;
import X.C1113800f5e;
import X.C1120780fGu;
import X.C1121100fHQ;
import X.C1126770fQZ;
import X.C1127090fR5;
import X.C1127110fR7;
import X.C1127120fR8;
import X.C1127310fRR;
import X.C1128240fSw;
import X.C1128250fSx;
import X.C1131270fXp;
import X.C1133170fat;
import X.C1133180fau;
import X.C1150390g2f;
import X.C1150440g2k;
import X.C1150500g2q;
import X.C1150510g2r;
import X.C1150540g2u;
import X.C1150590g2z;
import X.C1150690g39;
import X.C1150700g3A;
import X.C1324720kZq;
import X.C13LP;
import X.C158B;
import X.C1954807lC;
import X.C1AF0;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C238400w2;
import X.C501470JlZ;
import X.C785240UrC;
import X.C785310UrJ;
import X.C786410Ut5;
import X.C842240X2g;
import X.EnumC1151140g3s;
import X.EnumC1805420x5A;
import X.EnumC1805800x5m;
import X.InterfaceC1126580fQG;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.livesdk.gift.model.CreateMagicResultResponse;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionMagicGiftResponse;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionResult;
import com.bytedance.android.livesdk.gift.model.MagicResult;
import com.bytedance.android.livesdk.livesetting.wallet.LiveUgBalanceRequestOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AfS110S0300000_17 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS110S0300000_17 afS110S0300000_17, Object obj) {
        InterfaceC1126580fQG interfaceC1126580fQG;
        Integer numValueOf;
        long jLJI;
        long jLJI2;
        InterfaceC1126580fQG interfaceC1126580fQG2;
        Integer numValueOf2;
        long jLJI3;
        C1324720kZq c1324720kZq;
        C1C7U.LIZ("LiveGiftAbsViewHolderV2@b208.loadBigGiftIcon$previewDisposable$1");
        AbstractC1127100fR6 abstractC1127100fR6 = (AbstractC1127100fR6) obj;
        long jLJI4 = 0;
        if (Intrinsics.LJFF(abstractC1127100fR6, C1127110fR7.LIZ)) {
            C238400w2 c238400w2 = (C238400w2) afS110S0300000_17.l0;
            AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) afS110S0300000_17.l1;
            abstractC1126560fQE.getClass();
            C1128240fSw c1128240fSw = C1128250fSx.LIZ;
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI != null) {
                jLJI4 = abstractC1126600fQI.LJI();
            }
            c1128240fSw.LJFF(jLJI4);
            c238400w2.element = SystemClock.elapsedRealtime();
        } else {
            String str = "";
            String message = null;
            if (abstractC1127100fR6 instanceof C1127310fRR) {
                AbstractC1126560fQE abstractC1126560fQE2 = (AbstractC1126560fQE) afS110S0300000_17.l1;
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126560fQE2.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZJ && (c1324720kZq = abstractC1126560fQE2.LLJILLL) != null) {
                    C786410Ut5.LLJJIII(c1324720kZq, 8);
                }
                AbstractC1126560fQE abstractC1126560fQE3 = (AbstractC1126560fQE) afS110S0300000_17.l1;
                String str2 = ((C1127310fRR) abstractC1127100fR6).LIZ;
                long j = ((C238400w2) afS110S0300000_17.l0).element;
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI3 != null && (numValueOf2 = Integer.valueOf(abstractC1126600fQI3.LIZ)) != null && numValueOf2.intValue() == 1) {
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                    if (abstractC1126600fQI4 != null) {
                        jLJI3 = abstractC1126600fQI4.LJI();
                    } else {
                        jLJI3 = 0;
                    }
                    C1131270fXp.LJ(jLJI3, str2);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI5 != null) {
                    jLJI2 = abstractC1126600fQI5.LJI();
                } else {
                    jLJI2 = 0;
                }
                if (str2 != null) {
                    str = str2;
                }
                C1126770fQZ.LIZ(jElapsedRealtime, jLJI2, str);
                try {
                    C1128240fSw c1128240fSw2 = C1128250fSx.LIZ;
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI6 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                    if (abstractC1126600fQI6 != null) {
                        jLJI4 = abstractC1126600fQI6.LJI();
                    }
                    c1128240fSw2.LIZLLL(jLJI4);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI7 = abstractC1126560fQE3.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI7 != null && (interfaceC1126580fQG2 = abstractC1126560fQE3.LLJL) != null) {
                    interfaceC1126580fQG2.LJJI(abstractC1126600fQI7);
                }
                ((AbstractC1126560fQE) afS110S0300000_17.l1).LLJZIJLIL = (ImageModel) afS110S0300000_17.l2;
            } else if (abstractC1127100fR6 instanceof C1127090fR5) {
                AbstractC1126560fQE abstractC1126560fQE4 = (AbstractC1126560fQE) afS110S0300000_17.l1;
                C1127090fR5 c1127090fR5 = (C1127090fR5) abstractC1127100fR6;
                String str3 = c1127090fR5.LIZ;
                Exception exc = c1127090fR5.LIZIZ;
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI8 = abstractC1126560fQE4.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI8 != null && (numValueOf = Integer.valueOf(abstractC1126600fQI8.LIZ)) != null && numValueOf.intValue() == 1) {
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI9 = abstractC1126560fQE4.LLJJLIIIJLLLLLLLZ;
                    if (abstractC1126600fQI9 != null) {
                        jLJI = abstractC1126600fQI9.LJI();
                    } else {
                        jLJI = 0;
                    }
                    if (str3 != null) {
                        str = str3;
                    }
                    if (exc != null) {
                        message = exc.getMessage();
                    }
                    C1131270fXp.LIZLLL(jLJI, str, message);
                }
                try {
                    C1128240fSw c1128240fSw3 = C1128250fSx.LIZ;
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI10 = abstractC1126560fQE4.LLJJLIIIJLLLLLLLZ;
                    if (abstractC1126600fQI10 != null) {
                        jLJI4 = abstractC1126600fQI10.LJI();
                    }
                    c1128240fSw3.LJ(jLJI4);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI11 = abstractC1126560fQE4.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI11 != null && (interfaceC1126580fQG = abstractC1126560fQE4.LLJL) != null) {
                    interfaceC1126580fQG.LJJIIJZLJL(abstractC1126600fQI11);
                }
            } else if (!(abstractC1127100fR6 instanceof C1127120fR8)) {
                throw new C1954807lC();
            }
        }
        C1C7U.LIZIZ("LiveGiftAbsViewHolderV2@b208.loadBigGiftIcon$previewDisposable$1");
    }

    public static final void accept$1(AfS110S0300000_17 afS110S0300000_17, Object obj) {
        C1C7U.LIZ("LiveGiftMagicHelper@2278.getApiErrorHandler$errorHandler$1");
        Throwable th = (Throwable) obj;
        C158B.LIZ();
        if (th instanceof C501470JlZ) {
            ((C501470JlZ) th).getPrompt();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getApiErrorHandler error: ");
        sbLIZ.append(th);
        C20441214yg.LJ("LiveGiftMagicHelper", C2188811AlT.LIZIZ(sbLIZ));
        C1150390g2f c1150390g2f = (C1150390g2f) afS110S0300000_17.l0;
        LiveCoinConsumptionInput liveCoinConsumptionInput = (LiveCoinConsumptionInput) afS110S0300000_17.l1;
        C1150690g39 c1150690g39 = new C1150690g39();
        C1150700g3A c1150700g3A = (C1150700g3A) afS110S0300000_17.l2;
        if (c1150700g3A != null) {
            c1150690g39.LIZ = c1150700g3A.LIZ;
            c1150690g39.LIZIZ = c1150700g3A.LIZIZ;
            c1150690g39.LIZJ = c1150700g3A.LIZLLL;
        }
        C1150540g2u c1150540g2u = new C1150540g2u(th);
        c1150390g2f.getClass();
        c1150390g2f.LIZ();
        C1150440g2k c1150440g2k = new C1150440g2k(new C1150500g2q(liveCoinConsumptionInput, c1150690g39, c1150540g2u));
        Iterator it2 = ((List) c1150390g2f.LJ.getValue()).iterator();
        while (it2.hasNext()) {
            try {
                ((AbstractC1150480g2o) it2.next()).LIZ(c1150440g2k);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
            }
        }
        C1133180fau c1133180fauLIZ = C1133170fat.LIZ(th);
        C1150590g2z c1150590g2z = ((LiveCoinConsumptionInput) afS110S0300000_17.l1).LIZ;
        if (c1150590g2z != null) {
            LiveCoinConsumptionResult liveCoinConsumptionResult = new LiveCoinConsumptionResult();
            LiveCoinConsumptionInput liveCoinConsumptionInput2 = (LiveCoinConsumptionInput) afS110S0300000_17.l1;
            liveCoinConsumptionResult.sceneType = liveCoinConsumptionInput2.sceneType;
            liveCoinConsumptionResult.isFromJSB = liveCoinConsumptionInput2.isFromJSB;
            liveCoinConsumptionResult.statusCode = c1133180fauLIZ.LIZ;
            liveCoinConsumptionResult.magicGiftResult = null;
            c1150590g2z.LIZ(liveCoinConsumptionResult, th);
        }
        C1C7U.LIZIZ("LiveGiftMagicHelper@2278.getApiErrorHandler$errorHandler$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS110S0300000_17 afS110S0300000_17, Object obj) {
        Long lValueOf;
        String str;
        long j;
        MagicResult magicResult;
        MagicResult magicResult2;
        String str2;
        MagicResult magicResult3;
        MagicResult magicResult4;
        ImageModel imageModel;
        List<String> listLIZ;
        MagicResult magicResult5;
        MagicResult magicResult6;
        C1C7U.LIZ("LiveGiftMagicHelper@2278.getApiSuccessHandler$successHandler$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C158B.LIZ();
        Long lValueOf2 = null;
        if (baseResponse.data == 0) {
            C20441214yg.LJ("LiveGiftMagicHelper", "getApiSuccessHandler error: apiResponse.data is null");
            C1150590g2z c1150590g2z = ((LiveCoinConsumptionInput) afS110S0300000_17.l0).LIZ;
            if (c1150590g2z != null) {
                LiveCoinConsumptionResult liveCoinConsumptionResult = new LiveCoinConsumptionResult();
                LiveCoinConsumptionInput liveCoinConsumptionInput = (LiveCoinConsumptionInput) afS110S0300000_17.l0;
                liveCoinConsumptionResult.sceneType = liveCoinConsumptionInput.sceneType;
                liveCoinConsumptionResult.isFromJSB = liveCoinConsumptionInput.isFromJSB;
                liveCoinConsumptionResult.statusCode = 19991;
                liveCoinConsumptionResult.magicGiftResult = null;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("coin consume fail, apiResponse.data == null, isFromJSB=");
                sbLIZ.append(((LiveCoinConsumptionInput) afS110S0300000_17.l0).isFromJSB);
                sbLIZ.append(", sceneType: ");
                sbLIZ.append(((LiveCoinConsumptionInput) afS110S0300000_17.l0).sceneType.getType());
                sbLIZ.append(", statusCode=");
                sbLIZ.append(19991);
                c1150590g2z.LIZ(liveCoinConsumptionResult, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            }
        } else {
            C1150390g2f c1150390g2f = (C1150390g2f) afS110S0300000_17.l1;
            LiveCoinConsumptionInput liveCoinConsumptionInput2 = (LiveCoinConsumptionInput) afS110S0300000_17.l0;
            C1150690g39 c1150690g39 = new C1150690g39();
            C1150700g3A c1150700g3A = (C1150700g3A) afS110S0300000_17.l2;
            if (c1150700g3A != null) {
                c1150690g39.LIZ = c1150700g3A.LIZ;
                c1150690g39.LIZIZ = c1150700g3A.LIZIZ;
                c1150690g39.LIZJ = c1150700g3A.LIZLLL;
            }
            c1150390g2f.getClass();
            c1150390g2f.LIZ();
            C1150440g2k c1150440g2k = new C1150440g2k(new C1150500g2q(liveCoinConsumptionInput2, c1150690g39, new C1150510g2r(baseResponse)));
            Iterator it2 = ((List) c1150390g2f.LIZLLL.getValue()).iterator();
            while (it2.hasNext()) {
                try {
                    ((AbstractC1150490g2p) it2.next()).LIZ(c1150440g2k);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }
            C1150590g2z c1150590g2z2 = ((LiveCoinConsumptionInput) afS110S0300000_17.l0).LIZ;
            if (c1150590g2z2 != null) {
                LiveCoinConsumptionResult liveCoinConsumptionResult2 = new LiveCoinConsumptionResult();
                LiveCoinConsumptionInput liveCoinConsumptionInput3 = (LiveCoinConsumptionInput) afS110S0300000_17.l0;
                liveCoinConsumptionResult2.sceneType = liveCoinConsumptionInput3.sceneType;
                liveCoinConsumptionResult2.isFromJSB = liveCoinConsumptionInput3.isFromJSB;
                boolean z = false;
                liveCoinConsumptionResult2.statusCode = 0;
                LiveCoinConsumptionMagicGiftResponse liveCoinConsumptionMagicGiftResponse = new LiveCoinConsumptionMagicGiftResponse();
                CreateMagicResultResponse.Data data = (CreateMagicResultResponse.Data) baseResponse.data;
                if (data != null && (magicResult6 = data.magicResult) != null) {
                    lValueOf = Long.valueOf(magicResult6.magicResultId);
                } else {
                    lValueOf = null;
                }
                liveCoinConsumptionMagicGiftResponse.magicResultId = String.valueOf(lValueOf);
                CreateMagicResultResponse.Data data2 = (CreateMagicResultResponse.Data) baseResponse.data;
                if (data2 != null && (magicResult5 = data2.magicResult) != null) {
                    lValueOf2 = Long.valueOf(magicResult5.magicOptionId);
                }
                liveCoinConsumptionMagicGiftResponse.magicOptionId = String.valueOf(lValueOf2);
                CreateMagicResultResponse.Data data3 = (CreateMagicResultResponse.Data) baseResponse.data;
                String str3 = "";
                if (data3 == null || (magicResult4 = data3.magicResult) == null || (imageModel = magicResult4.image) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || (str = (String) C13LP.LJJJLZIJ(0, listLIZ)) == null) {
                    str = "";
                }
                liveCoinConsumptionMagicGiftResponse.image = str;
                CreateMagicResultResponse.Data data4 = (CreateMagicResultResponse.Data) baseResponse.data;
                long j2 = 0;
                if (data4 != null && (magicResult3 = data4.magicResult) != null) {
                    j = magicResult3.giftPrice;
                } else {
                    j = 0;
                }
                liveCoinConsumptionMagicGiftResponse.giftPrice = j;
                if (data4 != null) {
                    j2 = data4.expireTimestamp;
                }
                liveCoinConsumptionMagicGiftResponse.expireTimestamp = j2;
                if (data4 != null && (magicResult2 = data4.magicResult) != null && (str2 = magicResult2.extra) != null) {
                    str3 = str2;
                }
                liveCoinConsumptionMagicGiftResponse.responseExtra = str3;
                if (data4 != null && (magicResult = data4.magicResult) != null) {
                    z = magicResult.isContrast;
                }
                liveCoinConsumptionMagicGiftResponse.isContrast = z;
                liveCoinConsumptionResult2.magicGiftResult = liveCoinConsumptionMagicGiftResponse;
                c1150590g2z2.LIZIZ(liveCoinConsumptionResult2);
            }
        }
        C1C7U.LIZIZ("LiveGiftMagicHelper@2278.getApiSuccessHandler$successHandler$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS110S0300000_17 afS110S0300000_17, Object obj) {
        UserBalance userBalance;
        WalletCenter walletCenter = (WalletCenter) afS110S0300000_17.l0;
        EnumC1805800x5m enumC1805800x5m = (EnumC1805800x5m) afS110S0300000_17.l1;
        EnumC1805420x5A enumC1805420x5A = (EnumC1805420x5A) afS110S0300000_17.l2;
        walletCenter.getClass();
        C1C7U.LIZ("WalletCenter@6213.syncUGBalance$1L");
        BalanceStruct balanceStruct = (BalanceStruct) ((BaseResponse) obj).data;
        BalanceStructExtra balanceStructExtra = null;
        if (LiveUgBalanceRequestOptSetting.INSTANCE.getValue()) {
            if (balanceStruct != null) {
                BalanceStruct balanceStruct2 = walletCenter.LLILZIL;
                if (balanceStruct2 != null) {
                    balanceStructExtra = balanceStruct2.exchangeInfo;
                }
                walletCenter.LLILZIL = balanceStruct;
                balanceStruct.setExchangeInfo(balanceStructExtra);
                if (balanceStruct.validUser && (userBalance = balanceStruct.userBalance) != null) {
                    walletCenter.LLIZ.onNext(Long.valueOf(userBalance.balance));
                    WalletExchange walletExchange = WalletExchange.LL;
                    UserBalance userBalance2 = balanceStruct.userBalance;
                    walletExchange.getClass();
                    WalletExchange.LJJIJIIJI(enumC1805800x5m, enumC1805420x5A, userBalance2);
                } else {
                    walletCenter.LLIZ.onNext(0L);
                }
            } else {
                walletCenter.LLIZ.onNext(0L);
            }
        } else if (balanceStruct != null && balanceStruct.validUser && balanceStruct.userBalance != null) {
            BalanceStruct balanceStruct3 = walletCenter.LLILZIL;
            if (balanceStruct3 != null) {
                balanceStructExtra = balanceStruct3.exchangeInfo;
            }
            walletCenter.LLILZIL = balanceStruct;
            balanceStruct.setExchangeInfo(balanceStructExtra);
            walletCenter.LLIZ.onNext(Long.valueOf(balanceStruct.userBalance.balance));
            WalletExchange walletExchange2 = WalletExchange.LL;
            UserBalance userBalance3 = balanceStruct.userBalance;
            walletExchange2.getClass();
            WalletExchange.LJJIJIIJI(enumC1805800x5m, enumC1805420x5A, userBalance3);
        } else {
            walletCenter.LLIZ.onNext(0L);
        }
        walletCenter.LLJILJIL = EnumC1151140g3s.SUCCESS;
        C1C7U.LIZIZ("WalletCenter@6213.syncUGBalance$1L");
    }

    public static final void accept$4(AfS110S0300000_17 afS110S0300000_17, Object obj) {
        C1C7U.LIZ("ToolbarGiftBehavior@a3b.mGiftUnlockConsumer$1$2");
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C785240UrC c785240UrC = (C785240UrC) afS110S0300000_17.l0;
        c785240UrC.getClass();
        c1113800f5e.LJ(new C785310UrJ(c785240UrC), ((C1121100fHQ) afS110S0300000_17.l1).LIZLLL, ((C1120780fGu) afS110S0300000_17.l2).LL);
        C1C7U.LIZIZ("ToolbarGiftBehavior@a3b.mGiftUnlockConsumer$1$2");
    }

    public AfS110S0300000_17(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS110S0300000_17(long r2, X.C1150390g2f r4, X.C1150700g3A r5, com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput r6, java.lang.String r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            int r8 = 1 - r8
            if (r8 == 0) goto L11
            r0 = r1
            r0.l0 = r6
            r0.l1 = r4
            r0.l2 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r6
            r0.l2 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS110S0300000_17.<init>(long, X.0g2f, X.0g3A, com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput, java.lang.String, int):void");
    }
}
