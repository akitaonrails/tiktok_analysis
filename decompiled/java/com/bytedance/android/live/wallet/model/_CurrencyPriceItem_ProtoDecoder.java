package com.bytedance.android.live.wallet.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _CurrencyPriceItem_ProtoDecoder implements C0IMD<CurrencyPriceItem> {
    public static CurrencyPriceItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CurrencyPriceItem currencyPriceItem = new CurrencyPriceItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        currencyPriceItem.currency = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        currencyPriceItem.priceShowForm = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        currencyPriceItem.price = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 4:
                        currencyPriceItem.originalPrice = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 5:
                        currencyPriceItem.priceDot = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 6:
                        currencyPriceItem.keepDot = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return currencyPriceItem;
            }
        }
    }

    @Override // X.C0IMD
    public final CurrencyPriceItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CurrencyPriceItem currencyPriceItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CurrencyPriceItem currencyPriceItem, List list) {
    }
}
