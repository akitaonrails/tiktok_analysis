package com.bytedance.android.live.wallet.common;

import X.C01GW;
import X.C1161920gLG;
import X.C1802410x0J;
import X.C1807550x8b;
import X.C1807560x8c;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.InterfaceC1796910wrR;
import X.InterfaceC1797160wrq;
import X.InterfaceC1807610x8h;
import X.InterfaceC1807640x8k;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.common.IapViewModelImpl;
import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import com.bytedance.android.live.wallet.model.IapProductGetParam;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public class IapViewModelImpl extends ViewModel implements InterfaceC1807610x8h {
    public InterfaceC1807640x8k LL;
    public final C01GW LLILLJJLI;
    public final C1807550x8b LLILLL;
    public IapProductBuyParam LLILZ;
    public Context LLILZIL;

    @Override // X.InterfaceC1807610x8h
    public final void onDestroy() {
        this.LL = null;
        this.LLILZIL = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0x8b] */
    public IapViewModelImpl(InterfaceC1807640x8k interfaceC1807640x8k) {
        this.LL = interfaceC1807640x8k;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(67));
        this.LLILLJJLI = c01gwLIZIZ;
        this.LLILLL = new InterfaceC1796910wrR() { // from class: X.0x8b
            @Override // X.InterfaceC1796910wrR
            public final void LIZIZ(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LIZJ(int i, C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LIZLLL(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJFF(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJI(int i, C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIIZ(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIJ(boolean z) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIJJI(C1777440wM2 c1777440wM2) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIL(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILIIL(C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILJJIL(int i, C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILL(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final String getPayload() {
                return "";
            }

            @Override // X.InterfaceC1796910wrR
            public final InterfaceC1797050wrf LIZ() {
                this.LIZ.getClass();
                return null;
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJII(C1796960wrW c1796960wrW) {
                C1796950wrV.LIZ(this, c1796960wrW);
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJ(int i, C1797200wru c1797200wru) {
                IapViewModelImpl iapViewModelImpl = this.LIZ;
                InterfaceC1807640x8k interfaceC1807640x8k2 = iapViewModelImpl.LL;
                if (interfaceC1807640x8k2 != null) {
                    interfaceC1807640x8k2.L0();
                }
                iapViewModelImpl.wQ2(i, c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getException(), c1797200wru.getInternalCode());
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIIIZZ(int i, C1797010wrb c1797010wrb) {
                IapViewModelImpl iapViewModelImpl = this.LIZ;
                InterfaceC1807640x8k interfaceC1807640x8k2 = iapViewModelImpl.LL;
                if (interfaceC1807640x8k2 != null) {
                    interfaceC1807640x8k2.L0();
                }
                C1796560wqs c1796560wqs = c1797010wrb.LIZJ;
                String str = c1796560wqs.LIZIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = c1796560wqs.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                if (str.length() > 0 && str3.length() > 0) {
                    InterfaceC1807640x8k interfaceC1807640x8k3 = iapViewModelImpl.LL;
                    if (interfaceC1807640x8k3 != null) {
                        C1796560wqs c1796560wqs2 = c1797010wrb.LIZJ;
                        IapProductBuyResult iapProductBuyResult = new IapProductBuyResult();
                        iapProductBuyResult.code = 1;
                        IapProductBuyResult.Item item = new IapProductBuyResult.Item();
                        String str4 = c1796560wqs2.LIZ;
                        if (str4 == null) {
                            str4 = "";
                        }
                        item.productId = str4;
                        String str5 = c1796560wqs2.LIZIZ;
                        if (str5 != null) {
                            str2 = str5;
                        }
                        item.orderId = str2;
                        iapProductBuyResult.data = item;
                        interfaceC1807640x8k3.LIZLLL(iapProductBuyResult);
                        return;
                    }
                    return;
                }
                iapViewModelImpl.wQ2(c1797010wrb.LIZ, -1, -1, new Exception(C497740JfY.LJIJI(2131844613)), -1);
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILLIIL(int i, C1797010wrb c1797010wrb) {
                String str;
                IapViewModelImpl iapViewModelImpl = this.LIZ;
                iapViewModelImpl.getClass();
                Diamond diamond = (Diamond) C13LP.LJJJLZIJ(0, c1797010wrb.LIZIZ);
                if (diamond == null || (str = diamond.LIZIZ) == null) {
                    str = "";
                }
                if (!C2093608Ic.LIZJ(C1807560x8c.LIZJ, str) || !C1807560x8c.LIZIZ()) {
                    ConcurrentHashMap<String, Diamond> concurrentHashMap = C1807560x8c.LIZLLL;
                    concurrentHashMap.clear();
                    C1807560x8c.LIZJ = str;
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    if (C1807560x8c.LIZIZ != currentUserId) {
                        C1807560x8c.LIZIZ = currentUserId;
                        concurrentHashMap.clear();
                    }
                }
                List<? extends Diamond> list = c1797010wrb.LIZIZ;
                long currentUserId2 = UserService.getInstance().user().getCurrentUserId();
                if (C1807560x8c.LIZIZ != currentUserId2) {
                    C1807560x8c.LIZIZ = currentUserId2;
                    C1807560x8c.LIZLLL.clear();
                }
                C1807560x8c.LIZ = System.currentTimeMillis();
                for (Diamond diamond2 : list) {
                    C1807560x8c.LIZLLL.put(diamond2.iapId, diamond2);
                }
                IapProductBuyParam iapProductBuyParam = iapViewModelImpl.LLILZ;
                if (iapProductBuyParam == null) {
                    if (!c1797010wrb.LIZIZ.isEmpty()) {
                        InterfaceC1807640x8k interfaceC1807640x8k2 = iapViewModelImpl.LL;
                        if (interfaceC1807640x8k2 != null) {
                            interfaceC1807640x8k2.LJIIL();
                        }
                        InterfaceC1807640x8k interfaceC1807640x8k3 = iapViewModelImpl.LL;
                        if (interfaceC1807640x8k3 != null) {
                            List<? extends Diamond> list2 = c1797010wrb.LIZIZ;
                            IapProductGetResult iapProductGetResult = new IapProductGetResult();
                            iapProductGetResult.code = 1;
                            for (Diamond diamond3 : list2) {
                                IapProductGetResult.Item item = new IapProductGetResult.Item();
                                String str2 = diamond3.iapId;
                                item.productId = str2;
                                item.skuName = diamond3.LIZLLL;
                                item.currency = diamond3.LIZIZ;
                                item.price = diamond3.price;
                                item.priceAmountMicros = diamond3.LIZJ;
                                HashMap<String, IapProductGetResult.Item> map = iapProductGetResult.data;
                                if (map != null) {
                                    map.put(str2, item);
                                }
                            }
                            interfaceC1807640x8k3.LIZJ(iapProductGetResult);
                            return;
                        }
                        return;
                    }
                    InterfaceC1807640x8k interfaceC1807640x8k4 = iapViewModelImpl.LL;
                    if (interfaceC1807640x8k4 != null) {
                        interfaceC1807640x8k4.LJIIL();
                    }
                    InterfaceC1807640x8k interfaceC1807640x8k5 = iapViewModelImpl.LL;
                    if (interfaceC1807640x8k5 != null) {
                        interfaceC1807640x8k5.LJFF(IapViewModelImpl.vQ2(-1, -1, new Exception(C497740JfY.LJIJI(2131844613))));
                        return;
                    }
                    return;
                }
                Diamond diamondLIZ = C1807560x8c.LIZ(iapProductBuyParam.productId);
                if (diamondLIZ != null) {
                    diamondLIZ.id = iapProductBuyParam.diamondId;
                    ((InterfaceC1797160wrq) iapViewModelImpl.LLILLJJLI.getValue()).LIZIZ(iapProductBuyParam.way, iapProductBuyParam.source, iapProductBuyParam.tradeType, iapProductBuyParam.businessType, C500260Jjc.LJ(iapViewModelImpl.LLILZIL), iapViewModelImpl.LLILLL, diamondLIZ, iapProductBuyParam.orderId);
                } else {
                    InterfaceC1807640x8k interfaceC1807640x8k6 = iapViewModelImpl.LL;
                    if (interfaceC1807640x8k6 != null) {
                        interfaceC1807640x8k6.LJIIL();
                    }
                    iapViewModelImpl.wQ2(c1797010wrb.LIZ, -1, -1, new Exception(C497740JfY.LJIJI(2131844613)), -1);
                }
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIZILJ(int i, C1797200wru c1797200wru) {
                IapViewModelImpl iapViewModelImpl = this.LIZ;
                IapProductBuyParam iapProductBuyParam = iapViewModelImpl.LLILZ;
                InterfaceC1807640x8k interfaceC1807640x8k2 = iapViewModelImpl.LL;
                if (interfaceC1807640x8k2 != null) {
                    interfaceC1807640x8k2.LJIIL();
                }
                if (iapProductBuyParam == null) {
                    InterfaceC1807640x8k interfaceC1807640x8k3 = iapViewModelImpl.LL;
                    if (interfaceC1807640x8k3 != null) {
                        interfaceC1807640x8k3.LJFF(IapViewModelImpl.vQ2(c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getException()));
                        return;
                    }
                    return;
                }
                iapViewModelImpl.wQ2(i, 203, c1797200wru.getDetailCode(), c1797200wru.getException(), -1);
            }
        };
        ((InterfaceC1797160wrq) c01gwLIZIZ.getValue()).init();
    }

    @Override // X.InterfaceC1807610x8h
    public final void GL1(Context context, IapProductGetParam iapProductGetParam) {
        this.LLILZIL = context;
        this.LLILZ = null;
        InterfaceC1807640x8k interfaceC1807640x8k = this.LL;
        if (interfaceC1807640x8k != null) {
            interfaceC1807640x8k.LJ();
        }
        ((InterfaceC1797160wrq) this.LLILLJJLI.getValue()).LJ(iapProductGetParam.productIdList, this.LLILLL);
    }

    @Override // X.InterfaceC1807610x8h
    public final void Q72(Context context, IapProductBuyParam iapProductBuyParam) {
        this.LLILZIL = context;
        this.LLILZ = iapProductBuyParam;
        InterfaceC1807640x8k interfaceC1807640x8k = this.LL;
        if (interfaceC1807640x8k != null) {
            interfaceC1807640x8k.LIZIZ();
        }
        Diamond diamondLIZ = C1807560x8c.LIZ(iapProductBuyParam.productId);
        if (diamondLIZ != null) {
            diamondLIZ.id = iapProductBuyParam.diamondId;
            ((InterfaceC1797160wrq) this.LLILLJJLI.getValue()).LIZIZ(iapProductBuyParam.way, iapProductBuyParam.source, iapProductBuyParam.tradeType, iapProductBuyParam.businessType, C500260Jjc.LJ(this.LLILZIL), this.LLILLL, diamondLIZ, iapProductBuyParam.orderId);
            return;
        }
        ((InterfaceC1797160wrq) this.LLILLJJLI.getValue()).LJ(Collections.singletonList(iapProductBuyParam.productId), this.LLILLL);
    }

    public static IapProductGetResult vQ2(int i, int i2, Exception exc) {
        String message;
        if (exc instanceof C501470JlZ) {
            message = ((C501470JlZ) exc).getPrompt();
            if (message == null) {
                message = C497740JfY.LJIJI(2131844613);
            }
        } else {
            message = exc.getMessage();
            if (message == null) {
                message = C497740JfY.LJIJI(2131844613);
            }
        }
        IapProductGetResult iapProductGetResult = new IapProductGetResult();
        iapProductGetResult.code = 0;
        iapProductGetResult.errorCode = i;
        iapProductGetResult.detailCode = i2;
        iapProductGetResult.errorMsg = message;
        return iapProductGetResult;
    }

    public final void wQ2(int i, int i2, int i3, Exception exc, int i4) {
        String message;
        int i5;
        String message2;
        InterfaceC1807640x8k interfaceC1807640x8k = this.LL;
        if (interfaceC1807640x8k != null) {
            C497740JfY.LJIJI(2131844613);
            boolean z = exc instanceof C501470JlZ;
            if (z) {
                message = ((C501470JlZ) exc).getPrompt();
            } else {
                message = exc.getMessage();
            }
            C1802410x0J c1802410x0J = new C1802410x0J(i, i2, i3, exc, message, 0, i4);
            IapProductBuyParam iapProductBuyParam = this.LLILZ;
            if (iapProductBuyParam != null) {
                i5 = iapProductBuyParam.tradeType;
            } else {
                i5 = 1;
            }
            c1802410x0J.LJIIIIZZ = i5;
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().Tu2(C500260Jjc.LJ(this.LLILZIL), c1802410x0J);
            if (z) {
                message2 = ((C501470JlZ) exc).getPrompt();
                if (message2 == null) {
                    message2 = C497740JfY.LJIJI(2131844613);
                }
            } else {
                message2 = exc.getMessage();
                if (message2 == null) {
                    message2 = C497740JfY.LJIJI(2131844613);
                }
            }
            IapProductBuyResult iapProductBuyResult = new IapProductBuyResult();
            iapProductBuyResult.code = 0;
            iapProductBuyResult.errorCode = i2;
            iapProductBuyResult.detailCode = i3;
            iapProductBuyResult.errorMsg = message2;
            interfaceC1807640x8k.LIZ(iapProductBuyResult);
        }
    }
}
