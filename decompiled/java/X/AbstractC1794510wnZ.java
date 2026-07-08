package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.manager.UploadTokenManager;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0wnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1794510wnZ {
    public AtomicBoolean mInitEd = new AtomicBoolean(false);
    public WeakReference<Activity> mActivity = new WeakReference<>(null);
    public List<C1794480wnW> mPayingRequests = Collections.synchronizedList(new ArrayList());
    public Set<String> mUnSuccessEdProductIds = Collections.synchronizedSet(new HashSet());

    public abstract InterfaceC1794400wnO getIapInternalService();

    private void extraUploadToken(C1794480wnW c1794480wnW) {
        C1794370wnL c1794370wnL = c1794480wnW.LJIIL;
        if (c1794370wnL != null) {
            c1794370wnL.LJ();
        }
        InterfaceC1792440wkE interfaceC1792440wkELIZJ = C1794180wn2.LIZJ();
        if (C1794180wn2.LIZIZ == null) {
            synchronized (interfaceC1792440wkELIZJ) {
                try {
                    if (C1794180wn2.LIZIZ == null) {
                        C1794180wn2.LIZIZ = new C1794420wnQ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            interfaceC1792440wkELIZJ.getClass();
        }
        C1794180wn2.LIZIZ.getClass();
        ((C1796060wq4) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZIZ()).onEventV3("pipo_pay_start", C1794470wnV.LIZLLL(c1794480wnW));
        final InterfaceC1794400wnO iapInternalService = getIapInternalService();
        new AbstractC1794360wnK(iapInternalService) { // from class: X.0wnY
            @Override // X.AbstractC1794360wnK
            public final EnumC1794620wnk LIZJ() {
                return EnumC1794620wnk.ExtraUploadToken;
            }

            @Override // X.AbstractC1794360wnK
            public final void LIZ(C1794480wnW c1794480wnW2) {
                this.LIZ = c1794480wnW2;
                c1794480wnW2.getClass();
                if (c1794480wnW2.LJIJJ) {
                    return;
                }
                String str = c1794480wnW2.LJFF;
                if (TextUtils.isEmpty(str)) {
                    str = "https://webcast.tiktokv.com";
                }
                c1794480wnW2.LJIJI = true;
                C1792170wjn c1792170wjn = c1794480wnW2.LIZ;
                TokenInfo tokenInfo = new TokenInfo();
                tokenInfo.setOrderId(c1794480wnW2.LIZLLL());
                tokenInfo.setProductId(c1794480wnW2.LIZJ);
                tokenInfo.setUserId(c1794480wnW2.LIZLLL);
                tokenInfo.setSubscription(c1792170wjn.LJII);
                tokenInfo.setChannelUserId(c1794480wnW2.LJJI);
                tokenInfo.setPaymentMethod(c1794480wnW2.LJJ.channelName);
                AbstractC1794600wni abstractC1794600wni = c1794480wnW2.LJIIJ;
                if (abstractC1794600wni != null) {
                    tokenInfo.setToken(abstractC1794600wni.LJII());
                    tokenInfo.setChannelOrderId(abstractC1794600wni.LJFF);
                }
                AbstractC1791620wiu abstractC1791620wiu = c1794480wnW2.LJIIJJI;
                if (abstractC1791620wiu != null) {
                    tokenInfo.setAmountValue(String.valueOf(abstractC1791620wiu.LIZIZ() / 1000000.0d));
                    tokenInfo.setCurrency(abstractC1791620wiu.LIZJ());
                }
                C1794010wml c1794010wml = new C1794010wml(c1794480wnW2, c1794480wnW2.LJIILIIL, c1794480wnW2.LIZJ, c1794480wnW2.LIZLLL(), tokenInfo.isSubscription());
                c1794010wml.LIZLLL();
                UploadTokenManager uploadTokenManager = new UploadTokenManager(c1792170wjn.LIZIZ, str, tokenInfo, c1794480wnW2.LJ(), c1794480wnW2.LJIILIIL, c1792170wjn.LJIILIIL, C1794580wng.LIZIZ(c1794480wnW2));
                uploadTokenManager.LJIIJJI = new InterfaceC1793900wma<ResponseEntity>(c1794010wml) { // from class: X.0wmo
                    public final C1794010wml LIZ;

                    @Override // X.InterfaceC1793900wma
                    public final void LIZ(C1792220wjs c1792220wjs) {
                        this.LIZ.LJ(false, C1792840wks.LIZJ(c1792220wjs), true, null, -1);
                        LIZIZ(C1792840wks.LIZJ(c1792220wjs));
                    }

                    @Override // X.InterfaceC1793900wma
                    public final void onSuccess(ResponseEntity responseEntity) {
                        String string;
                        OrderStateResponseEntity.Data data;
                        String str2;
                        boolean z;
                        ResponseEntity responseEntity2 = responseEntity;
                        if (TextUtils.isEmpty(this.LIZIZ.LIZ.LIZLLL()) && responseEntity2 != null) {
                            this.LIZIZ.LIZ.LJ = responseEntity2.getOrderIdByUploadToken();
                            C1794370wnL c1794370wnL2 = this.LIZIZ.LIZ.LJIIL;
                            if (c1794370wnL2 != null) {
                                c1794370wnL2.LIZJ = responseEntity2.getOrderIdByUploadToken();
                            }
                        }
                        int retryCount = 0;
                        if ((responseEntity2 instanceof OrderStateResponseEntity) && (data = ((OrderStateResponseEntity) responseEntity2).data) != null && (str2 = data.status) != null) {
                            EnumC1794120wmw enumC1794120wmwFrom = EnumC1794120wmw.from(str2);
                            string = enumC1794120wmwFrom.toString();
                            C1794480wnW c1794480wnW3 = this.LIZIZ.LIZ;
                            if (enumC1794120wmwFrom == EnumC1794120wmw.Success) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c1794480wnW3.LJIL = z;
                        } else {
                            string = null;
                        }
                        if (responseEntity2 != null) {
                            retryCount = responseEntity2.getRetryCount();
                        }
                        this.LIZ.LJ(true, null, true, string, retryCount);
                        C1794500wnY c1794500wnY = this.LIZIZ;
                        c1794500wnY.getClass();
                        AbstractC1794360wnK nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c1794500wnY);
                        if (nextState != null) {
                            nextState.LIZ(c1794500wnY.LIZ);
                        }
                    }

                    {
                        this.LIZ = c1794010wml;
                    }
                };
                uploadTokenManager.LIZ();
            }
        }.LIZ(c1794480wnW);
        this.mPayingRequests.add(c1794480wnW);
    }

    public void executeNewPayInternal(final C1794480wnW c1794480wnW, final InterfaceC1794730wnv interfaceC1794730wnv) {
        InterfaceC1792450wkF interfaceC1792450wkFLIZ = ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        EnumC1791830wjF enumC1791830wjF = c1794480wnW.LJJ;
        InterfaceC1795220woi interfaceC1795220woi = new InterfaceC1795220woi(this, c1794480wnW, interfaceC1794730wnv) { // from class: X.0woC
            public final /* synthetic */ InterfaceC1794730wnv LIZ;

            {
                this.LIZ = interfaceC1794730wnv;
            }
        };
        interfaceC1792450wkFLIZ.getClass();
        if (enumC1791830wjF == EnumC1791830wjF.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().getAmazonUserId(interfaceC1795220woi);
        } else {
            c1794480wnW.LJJI = "";
            payInternal(c1794480wnW, interfaceC1794730wnv);
        }
    }

    public void payInternal(C1794480wnW c1794480wnW, InterfaceC1794730wnv interfaceC1794730wnv) {
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII();
        if (C1794250wn9.LIZIZ().LIZJ() && c1794480wnW.LIZ.LJIIJJI) {
            c1794480wnW.LJIJI = true;
            ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
            AbstractC1794360wnK abstractC1794360wnKLIZIZ = C1794520wna.LIZIZ(c1794480wnW.LJJ, getIapInternalService(), this.mActivity.get());
            abstractC1794360wnKLIZIZ.LIZJ = interfaceC1794730wnv;
            abstractC1794360wnKLIZIZ.LIZ(c1794480wnW);
        } else {
            C1793860wmW c1793860wmW = new C1793860wmW(getIapInternalService());
            c1793860wmW.LIZJ = interfaceC1794730wnv;
            c1793860wmW.LIZ(c1794480wnW);
        }
        this.mPayingRequests.add(c1794480wnW);
        String str = c1794480wnW.LJJIII;
        if (str != null && !str.isEmpty()) {
            InterfaceC1787390wc5 interfaceC1787390wc5 = C1787430wc9.LIZ;
            C1787430wc9.LIZJ.add(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void restoreOrderByUploadToken(X.EnumC1791830wjF r18, X.AbstractC1794600wni r19, X.AbstractC1791620wiu r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1794510wnZ.restoreOrderByUploadToken(X.0wjF, X.0wni, X.0wiu, boolean, java.lang.String):void");
    }
}
