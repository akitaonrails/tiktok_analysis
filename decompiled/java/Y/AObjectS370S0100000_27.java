package Y;

import X.C1124340fMe;
import X.C1805310x4z;
import X.C262100zr;
import X.C784440Upu;
import X.EnumC1151140g3s;
import X.EnumC1805420x5A;
import X.EnumC1805800x5m;
import X.InterfaceC1107590evd;
import X.InterfaceC1803980x2q;
import android.os.SystemClock;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class AObjectS370S0100000_27 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public AObjectS370S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        return ((DownloadLiveReplayMethod) aObjectS370S0100000_27.l0).LJIILIIL((JSONObject) obj);
    }

    public static final Object invoke$1(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        return ((DownloadLiveReplayMethod) aObjectS370S0100000_27.l0).LJIILIIL((JSONObject) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(Y.AObjectS370S0100000_27 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS370S0100000_27.invoke$2(Y.AObjectS370S0100000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        int i;
        VEConfig vEConfig = (VEConfig) aObjectS370S0100000_27.l0;
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                i = vEConfig.defaultBps;
            } else {
                i = vEConfig.bpsConfig.bpsFor1080p;
            }
        } else {
            i = vEConfig.bpsConfig.bpsFor720p;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$4(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        WalletCenter walletCenter = (WalletCenter) aObjectS370S0100000_27.l0;
        walletCenter.getClass();
        walletCenter.LLJIJIL = EnumC1151140g3s.FAILED;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        int i;
        long j;
        String string;
        final String str;
        final WalletCenter walletCenter = (WalletCenter) aObjectS370S0100000_27.l0;
        C262100zr c262100zr = (C262100zr) obj;
        walletCenter.getClass();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        WalletStruct walletStruct = walletCenter.LL;
        int i2 = 0;
        if (walletStruct == null) {
            i = 0;
        } else {
            i = (int) walletStruct.diamond;
        }
        WalletStruct walletStruct2 = walletCenter.LL;
        if (walletStruct2 == null) {
            j = 0;
        } else {
            j = walletStruct2.coinsBalanceVersionV2;
        }
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null) {
            string = "recharge";
        } else {
            string = interfaceC1107590evd.getString("scenario");
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 != null) {
            i2 = interfaceC1107590evd2.getInt("diamonds");
        }
        if (string.equals("exchange")) {
            str = "exchange_v2";
        } else {
            str = "recharge_v2";
        }
        C784440Upu.LIZ().LIZIZ(new C1124340fMe(i2, string.equals("exchange"), false, 0L, false, false, null, 0, 1008));
        final int i3 = i2;
        final int i4 = i;
        final long j2 = j;
        walletCenter.aF2(EnumC1805800x5m.LIVE_DETAIL, EnumC1805420x5A.DIAMOND_REFRESH, new InterfaceC1803980x2q() { // from class: X.0x1R
            @Override // X.InterfaceC1803980x2q
            public final void LIZ(long j3) {
                long j4;
                long j5;
                HashMap map = new HashMap();
                int i5 = i3;
                int i6 = i4;
                if (i5 + i6 == j3) {
                    C1796590wqv.LIZ("ttlive_update_wallet_info_order", map);
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    long j6 = i4;
                    long j7 = j2;
                    WalletStruct walletStruct3 = walletCenter.LL;
                    if (walletStruct3 == null) {
                        j5 = 0;
                    } else {
                        j5 = walletStruct3.coinsBalanceVersionV2;
                    }
                    C1796530wqp.LJIIJJI(jUptimeMillis2, j6, j3, j7, j5, null, str, true);
                    return;
                }
                map.put("originCoins", Integer.toString(i6));
                map.put("preCoins", Integer.toString(i3));
                map.put("error_msg", "UPDATE_WALLET_INFO_NOT_MATCH_CODE");
                C1796590wqv.LIZJ("ttlive_update_wallet_info_order", 62, -1, "update wallet info fail", map);
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                long j8 = i4;
                long j9 = j2;
                WalletStruct walletStruct4 = walletCenter.LL;
                if (walletStruct4 == null) {
                    j4 = 0;
                } else {
                    j4 = walletStruct4.coinsBalanceVersionV2;
                }
                C1796530wqp.LJIIJJI(jUptimeMillis3, j8, j3, j9, j4, null, str, false);
            }

            @Override // X.InterfaceC1803980x2q
            public final void LIZIZ(Throwable th) {
                int errorCode;
                if (th instanceof C501520Jle) {
                    errorCode = ((C501520Jle) th).getErrorCode();
                } else {
                    errorCode = 61;
                }
                C1796590wqv.LIZIZ(errorCode, "ttlive_update_wallet_info_order", "update wallet info fail");
                C1796530wqp.LJIIJJI(SystemClock.uptimeMillis() - jUptimeMillis, 0L, 0L, j2, 0L, th.toString(), str, false);
            }
        });
        return null;
    }

    public static final Object invoke$6(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        WalletCenter walletCenter = (WalletCenter) aObjectS370S0100000_27.l0;
        walletCenter.getClass();
        walletCenter.LLJIJIL = EnumC1151140g3s.SUCCESS;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        ((C1805310x4z) aObjectS370S0100000_27.l0).LLIZ.LLJIJIL = EnumC1151140g3s.SUCCESS;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS370S0100000_27 aObjectS370S0100000_27, Object obj) {
        ((C1805310x4z) aObjectS370S0100000_27.l0).LLIZ.LLJIJIL = EnumC1151140g3s.FAILED;
        return Unit.LIZ;
    }
}
