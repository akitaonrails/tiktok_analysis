package X;

import Y.AObjectS370S0100000_27;
import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.WalletRechargeService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeV2PanelSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeV3ChargeSourceExclusiveSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803430x1x implements InterfaceC1803310x1l {
    public InterfaceC1806230x6T LIZIZ;
    public Function1<? super C262100zr, Unit> LIZJ;
    public final C11RK LIZ = new C11RK();
    public final C1864820ycy LIZLLL = new C1864820ycy(this, 6);

    @Override // X.InterfaceC1803310x1l
    public final C11O8 LIZJ() {
        return this.LIZ.LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    @Override // X.InterfaceC1803310x1l
    public final void LIZLLL(InterfaceC1806230x6T interfaceC1806230x6T) {
        this.LIZIZ = interfaceC1806230x6T;
    }

    @Override // X.InterfaceC1803310x1l
    public final void LJFF(AObjectS370S0100000_27 aObjectS370S0100000_27) {
        C1548820qPI.LIZLLL("DiamondsRefreshed", this.LIZLLL);
        this.LIZJ = aObjectS370S0100000_27;
    }

    @Override // X.InterfaceC1803310x1l
    public final void LIZIZ(Context context, C499950Jj7 c499950Jj7) {
        if (C497740JfY.LJIL()) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c499950Jj7.LIZ());
            return;
        }
        C784440Upu.LIZ().LIZIZ(new C0IF2(1));
        this.LIZ.onNext("");
        C786410Ut5.LJLIIL(500L, C820670WHh.LIZ, new ARunnableS76S0200000_7(context, c499950Jj7, 84));
    }

    @Override // X.InterfaceC1803310x1l
    public final boolean LJ(Context context, Bundle bundle) {
        IapListResult.ListResultExtra listResultExtraLJII;
        String str;
        IapListResult.IapCustomData iapCustomData;
        IapListResult.IapCustomData iapCustomData2;
        if (!LiveRechargeV2PanelSetting.INSTANCE.getValue() || context == null || bundle == null) {
            return false;
        }
        String str2 = null;
        C1804840x4E c1804840x4ELJIILIIL = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LJIILIIL(C07LT.LIZ(0), null, null);
        if (c1804840x4ELJIILIIL != null && (listResultExtraLJII = c1804840x4ELJIILIIL.LJII()) != null && listResultExtraLJII.iapCustomData != null) {
            IapListResult.ListResultExtra listResultExtraLJII2 = c1804840x4ELJIILIIL.LJII();
            if (listResultExtraLJII2 != null && (iapCustomData2 = listResultExtraLJII2.iapCustomData) != null) {
                str = iapCustomData2.rechargeV2PanelUrl;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                long j = bundle.getLong("key_bundle_total_coins");
                long jLIZ = C1078150eA9.LIZ(bundle.getLong("key_bundle_need_coins"), j);
                C1803800x2Y.LIZ.getClass();
                Map mapLJIIIZ = C1803800x2Y.LJIIIZ();
                IapListResult.ListResultExtra listResultExtraLJII3 = c1804840x4ELJIILIIL.LJII();
                if (listResultExtraLJII3 != null && (iapCustomData = listResultExtraLJII3.iapCustomData) != null) {
                    str2 = iapCustomData.rechargeV2PanelUrl;
                }
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                C499950Jj7 c499950Jj7 = new C499950Jj7(str2);
                c499950Jj7.LIZJ = 0.9f;
                c499950Jj7.LIZ.LIZ(1, "keyboard_compat");
                c499950Jj7.LIZ.LIZ(1, "keyboard_adjust");
                c499950Jj7.LIZ.LIZJ("type", "popup");
                c499950Jj7.LIZIZ.LIZJ("enter_source", "inapp_${requestPage}");
                String string = bundle.getString("key_charge_reason");
                if (string == null) {
                    string = "";
                }
                c499950Jj7.LIZIZ.LIZJ("charge_reason", string);
                w.LIZ.getClass();
                c499950Jj7.LIZIZ.LIZJ("anchor_id", String.valueOf(w.LJ()));
                c499950Jj7.LIZIZ.LIZJ("room_id", String.valueOf(w.LJIJJ()));
                c499950Jj7.LIZIZ.LIZIZ(jLIZ, "lack_diamond_count");
                c499950Jj7.LIZIZ.LIZIZ(j, "gift_total_coins");
                c499950Jj7.LIZIZ.LIZIZ(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0(), "balance");
                String str4 = (String) ((LinkedHashMap) mapLJIIIZ).get(Scene.SCENE_SERVICE);
                if (str4 == null) {
                    str4 = "";
                }
                c499950Jj7.LIZIZ.LIZJ(Scene.SCENE_SERVICE, str4);
                c499950Jj7.LIZIZ.LIZJ("gift_ids", String.valueOf(bundle.getLong("key_bundle_gift_id")));
                c499950Jj7.LIZIZ.LIZJ("enter_from_merge", w.LJIIIZ());
                c499950Jj7.LIZIZ.LIZJ("enter_method", w.LJIIL());
                c499950Jj7.LIZIZ.LIZJ("action_type", w.LIZLLL());
                String string2 = bundle.getString("key_bundle_gift_from");
                if (string2 != null) {
                    str3 = string2;
                }
                c499950Jj7.LIZIZ.LIZJ("gift_enter_from", str3);
                LIZIZ(context, c499950Jj7);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0fsS] */
    @Override // X.InterfaceC1803310x1l
    public final boolean LIZ(Context context, Bundle bundle, InterfaceC1806230x6T interfaceC1806230x6T) {
        String str;
        final String hash;
        String requestPage;
        if (bundle == null || context == null) {
            return false;
        }
        int i = bundle.getInt("key_bundle_charge_source");
        C1804110x33 c1804110x33 = EnumC1804100x32.Companion;
        Integer numValueOf = Integer.valueOf(i);
        boolean zIsV3Phase2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isV3Phase2(i);
        c1804110x33.getClass();
        EnumC1804100x32 enumC1804100x32LIZ = C1804110x33.LIZ(true, numValueOf, zIsV3Phase2);
        if (LiveRechargeV3ChargeSourceExclusiveSetting.INSTANCE.getValue().skipChargeSources.contains(Integer.valueOf(i))) {
            return false;
        }
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).updateReferrerHostFromKeva(context);
        boolean zIsValidForRechargeV3 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isValidForRechargeV3();
        String rechargeV3Cache = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeV3Cache(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        String requestPage2 = null;
        if (!C500260Jjc.LJJIIZ(rechargeV3Cache)) {
            rechargeV3Cache = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_open_recharge_v3");
        c474500IjALIZ.LJIL();
        if (zIsValidForRechargeV3) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_v3_valid");
        if (enumC1804100x32LIZ != null) {
            requestPage2 = enumC1804100x32LIZ.getRequestPage();
        }
        final String str2 = "";
        if (requestPage2 == null) {
            requestPage2 = "";
        }
        c474500IjALIZ.LJJII(requestPage2, "request_page");
        c474500IjALIZ.LJJII(Boolean.valueOf(C500260Jjc.LJJIIZ(rechargeV3Cache)), "is_url_valid");
        c474500IjALIZ.LIZ();
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
        if (!zIsValidForRechargeV3 || rechargeV3Cache == null) {
            return false;
        }
        final long j = bundle.getLong("key_bundle_total_coins");
        final long jLIZ = C1078150eA9.LIZ(bundle.getLong("key_bundle_need_coins"), j);
        Map mapLJIIIZ = C1803800x2Y.LJIIIZ();
        final String string = bundle.getString("key_charge_reason");
        if (string == null) {
            string = "";
        }
        w.LIZ.getClass();
        final String strValueOf = String.valueOf(w.LJ());
        final String strValueOf2 = String.valueOf(w.LJIJJ());
        final long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        String str3 = (String) ((LinkedHashMap) mapLJIIIZ).get(Scene.SCENE_SERVICE);
        if (str3 == null) {
            str3 = "";
        }
        final String strValueOf3 = String.valueOf(bundle.getLong("key_bundle_gift_id"));
        final String strLJIIIZ = w.LJIIIZ();
        final String strLJIIL = w.LJIIL();
        final String strLIZLLL = w.LIZLLL();
        final String string2 = bundle.getString("key_bundle_gift_from");
        if (string2 == null) {
            string2 = "";
        }
        if (enumC1804100x32LIZ == null || (hash = enumC1804100x32LIZ.getHash()) == null) {
            hash = "";
        }
        if (enumC1804100x32LIZ != null && (requestPage = enumC1804100x32LIZ.getRequestPage()) != null) {
            str2 = requestPage;
        }
        final int iLIZJ = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ();
        final String str4 = str3;
        C20441214yg.LIZIZ("RechargeV2ServiceImpl", new Object(strValueOf, strValueOf2, jNo0, j, jLIZ, string, hash, str2, str4, strValueOf3, strLJIIIZ, strLJIIL, strLIZLLL, string2, iLIZJ) { // from class: X.0fsS
            public final String LIZ;
            public final String LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;
            public final long LJ;
            public final String LJFF;
            public final String LJI;
            public final String LJII;
            public final String LJIIIIZZ;
            public final String LJIIIZ;
            public final String LJIIJ;
            public final String LJIIJJI;
            public final String LJIIL;
            public final String LJIILIIL;
            public final int LJIILJJIL;
            public final boolean LJIILL = true;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1144060fsS)) {
                    return false;
                }
                C1144060fsS c1144060fsS = (C1144060fsS) obj;
                return Intrinsics.LJFF(this.LIZ, c1144060fsS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1144060fsS.LIZIZ) && this.LIZJ == c1144060fsS.LIZJ && this.LIZLLL == c1144060fsS.LIZLLL && this.LJ == c1144060fsS.LJ && Intrinsics.LJFF(this.LJFF, c1144060fsS.LJFF) && Intrinsics.LJFF(this.LJI, c1144060fsS.LJI) && Intrinsics.LJFF(this.LJII, c1144060fsS.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1144060fsS.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1144060fsS.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1144060fsS.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1144060fsS.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1144060fsS.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1144060fsS.LJIILIIL) && this.LJIILJJIL == c1144060fsS.LJIILJJIL && this.LJIILL == c1144060fsS.LJIILL;
            }

            public final int hashCode() {
                return (((((((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL) * 31) + C786410Ut5.Z2(this.LJIILL);
            }

            public final String toString() {
                return "WalletGetCoinsPageData(anchorId=" + this.LIZ + ", roomId=" + this.LIZIZ + ", balance=" + this.LIZJ + ", totalCoins=" + this.LIZLLL + ", needCoins=" + this.LJ + ", chargeReason=" + this.LJFF + ", chargeSourceHash=" + this.LJI + ", requestPage=" + this.LJII + ", scene=" + this.LJIIIIZZ + ", giftIds=" + this.LJIIIZ + ", enterFromMerge=" + this.LJIIJ + ", enterMethod=" + this.LJIIJJI + ", actionType=" + this.LJIIL + ", giftEnterFrom=" + this.LJIILIIL + ", rechargeV3Version=" + this.LJIILJJIL + ", shouldDismissCoinPageAfterPay=" + this.LJIILL + ')';
            }

            {
                this.LIZ = strValueOf;
                this.LIZIZ = strValueOf2;
                this.LIZJ = jNo0;
                this.LIZLLL = j;
                this.LJ = jLIZ;
                this.LJFF = string;
                this.LJI = hash;
                this.LJII = str2;
                this.LJIIIIZZ = str4;
                this.LJIIIZ = strValueOf3;
                this.LJIIJ = strLJIIIZ;
                this.LJIIJJI = strLJIIL;
                this.LJIIL = strLIZLLL;
                this.LJIILIIL = string2;
                this.LJIILJJIL = iLIZJ;
            }
        }.toString());
        this.LIZIZ = interfaceC1806230x6T;
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).LJ();
        return false;
    }
}
