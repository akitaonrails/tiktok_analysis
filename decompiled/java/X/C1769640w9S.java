package X;

import Y.ARunnableS95S0200000_26;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcShopTabBytesyncExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0w9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769640w9S implements InterfaceC596980NbE {
    public volatile EnumC1769650w9T LL;
    public volatile boolean LLILLJJLI;

    public C1769640w9S() {
        C1776060wJo c1776060wJo = new C1776060wJo(this, 3);
        this.LL = EnumC1769650w9T.HANDLE_BYTESYNC_DELAYED;
        this.LLILLJJLI = true;
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(c1776060wJo);
    }

    @Override // X.InterfaceC596980NbE
    public final void LJ(C1525630pnt c1525630pnt) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("ShopByteSync BytesyncPush===== onDataUpdate");
        int i = C1769660w9U.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ShopByteSync BytesyncPush===== handleDataUpdate ");
                    sbLIZ.append(this.LL);
                    C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    LIZ(EnumC1769650w9T.HANDLE_BYTESYNC_IMMEDIATELY, c1525630pnt);
                    return;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ShopByteSync BytesyncPush===== handleDataUpdate ");
            sbLIZ2.append(this.LL);
            C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LL = EnumC1769650w9T.HANDLE_BYTESYNC_DISABLED;
            C823050WQl.LJ().schedule(new ARunnableS95S0200000_26(this, c1525630pnt, 63), ((EcShopTabBytesyncExperiment.ShopTabBytesyncModel) EcShopTabBytesyncExperiment.LIZIZ.getValue()).backlogProcessingIntervalSec, TimeUnit.SECONDS);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ShopByteSync BytesyncPush===== handleDataUpdate ");
        sbLIZ3.append(this.LL);
        C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        C1768560w7i c1768560w7i = C1768560w7i.LIZ;
        EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.TRIGGER_REQUEST;
        EnumC1768960w8M enumC1768960w8M = EnumC1768960w8M.BYTESYNC_PUSH;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("reason", EnumC1768980w8O.PUSH_IGNORED.getValue()), new Pair("duration", Long.valueOf(c1525630pnt.LIZJ - c1525630pnt.LIZIZ)), new Pair("coldboot_duration", Long.valueOf(System.currentTimeMillis() - C1150504el.LIZ().LJJII)));
        c1768560w7i.getClass();
        C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8M, false, mapLJIIIIZZ);
    }

    public final void LIZ(EnumC1769650w9T enumC1769650w9T, C1525630pnt c1525630pnt) {
        long j;
        long j2;
        int i = C1769660w9U.LIZ[enumC1769650w9T.ordinal()];
        String str = "1";
        if (i != 2) {
            if (i == 3) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShopByteSync BytesyncPush===== requestTabReachCfg ");
                sbLIZ.append(enumC1769650w9T);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                IShopIconService iShopIconServiceLIZ = MallServiceManager.LIZIZ().LIZ();
                if (iShopIconServiceLIZ != null) {
                    EnumC1768950w8L enumC1768950w8L = EnumC1768950w8L.BYTESYNC_PUSH;
                    Pair[] pairArr = new Pair[3];
                    if (c1525630pnt != null) {
                        j2 = c1525630pnt.LIZJ - c1525630pnt.LIZIZ;
                    } else {
                        j2 = 0;
                    }
                    pairArr[0] = new Pair("duration", Long.valueOf(j2));
                    pairArr[1] = new Pair("coldboot_duration", Long.valueOf(System.currentTimeMillis() - C1150504el.LIZ().LJJII));
                    if (!this.LLILLJJLI) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    pairArr[2] = new Pair("is_cold_launch", str);
                    iShopIconServiceLIZ.Pv(enumC1768950w8L, null, C2097608Jq.LJIIJ(pairArr));
                }
                if (this.LLILLJJLI) {
                    this.LLILLJJLI = false;
                    return;
                }
                return;
            }
            return;
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ShopByteSync BytesyncPush===== requestTabReachCfg ");
        sbLIZ2.append(enumC1769650w9T);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ2);
        this.LL = EnumC1769650w9T.HANDLE_BYTESYNC_IMMEDIATELY;
        IShopIconService iShopIconServiceLIZ2 = MallServiceManager.LIZIZ().LIZ();
        if (iShopIconServiceLIZ2 != null) {
            EnumC1768950w8L enumC1768950w8L2 = EnumC1768950w8L.BYTESYNC_PUSH;
            Pair[] pairArr2 = new Pair[3];
            if (c1525630pnt != null) {
                j = c1525630pnt.LIZJ - c1525630pnt.LIZIZ;
            } else {
                j = 0;
            }
            pairArr2[0] = new Pair("duration", Long.valueOf(j));
            pairArr2[1] = new Pair("coldboot_duration", Long.valueOf(System.currentTimeMillis() - C1150504el.LIZ().LJJII));
            if (!this.LLILLJJLI) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr2[2] = new Pair("is_cold_launch", str);
            iShopIconServiceLIZ2.Pv(enumC1768950w8L2, null, C2097608Jq.LJIIJ(pairArr2));
        }
        if (!this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = false;
    }
}
