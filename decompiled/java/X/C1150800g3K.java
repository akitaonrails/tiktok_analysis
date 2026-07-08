package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150800g3K implements InterfaceC1141530foN {
    public static final C1150800g3K LL = new C1150800g3K();
    public static boolean LLILLJJLI;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        boolean z;
        int i;
        long j;
        boolean z2;
        int i2;
        String string2;
        String string3;
        if (Intrinsics.LJFF(c262100zr.LIZ, "exchange_dialog_event")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String str = "";
            if (interfaceC1107590evd == null || (string = interfaceC1107590evd.getString("biz_exchange_id")) == null) {
                string = "";
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            int i3 = 0;
            if (interfaceC1107590evd2 != null) {
                z = interfaceC1107590evd2.getBoolean(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            } else {
                z = false;
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                i = interfaceC1107590evd3.getInt("income_type");
            } else {
                i = 0;
            }
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null) {
                j = interfaceC1107590evd4.getInt("short_coin_num");
            } else {
                j = 0;
            }
            InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
            if (interfaceC1107590evd5 != null) {
                z2 = interfaceC1107590evd5.getBoolean("is_auto_exchange_enable");
            } else {
                z2 = false;
            }
            InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
            if (interfaceC1107590evd6 != null) {
                i2 = interfaceC1107590evd6.getInt("action_detail");
            } else {
                i2 = 0;
            }
            InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
            if (interfaceC1107590evd7 != null) {
                i3 = interfaceC1107590evd7.getInt("sub_source");
            }
            InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
            if (interfaceC1107590evd8 == null || (string2 = interfaceC1107590evd8.getString("exchange_mode")) == null) {
                string2 = "exchange";
            }
            InterfaceC1107590evd interfaceC1107590evd9 = c262100zr.LIZIZ;
            if (interfaceC1107590evd9 != null && (string3 = interfaceC1107590evd9.getString("gift_source")) != null) {
                str = string3;
            }
            if (z) {
                if (i2 != 1) {
                    if (i2 == 5) {
                        C1150830g3N.LIZLLL(i, i3, string, string2, str, z2, j);
                        C1149680g1W.LJIJI();
                        HashMap map = new HashMap();
                        map.put("exchange_mode", string2);
                        map.put("is_auto_exchange_enable", Boolean.valueOf(z2));
                        map.put("income_type", Integer.valueOf(i));
                        map.put("sub_source", Integer.valueOf(i3));
                        map.put("gift_source", str);
                        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_lynx_auto_send_gift_confirm", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
                        return;
                    }
                    return;
                }
                C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) j, true, true, 0L, false, false, null, 0, 1008));
                C784440Upu.LIZ().LIZIZ(new C1149590g1N());
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Ri2(EnumC1805420x5A.EXCHANGE_SUCCESS);
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                Map<String, InterfaceC1149850g1n> map2 = C1150830g3N.LIZ;
                if (!map2.containsKey(string)) {
                    return;
                }
                InterfaceC1149850g1n interfaceC1149850g1n = (InterfaceC1149850g1n) ((LinkedHashMap) map2).get(string);
                InterfaceC1094160eZy.M0.LJFF(Boolean.FALSE);
                if (interfaceC1149850g1n == null) {
                    return;
                }
                interfaceC1149850g1n.LIZJ();
                return;
            }
            C1150830g3N.LIZ(i, string, string2, true);
        }
    }
}
