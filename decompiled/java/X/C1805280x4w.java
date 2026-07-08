package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805280x4w implements InterfaceC1141530foN {
    public static final C1805280x4w LL = new C1805280x4w();
    public static boolean LLILLJJLI;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Boolean boolValueOf;
        int i;
        Boolean boolValueOf2;
        boolean zBooleanValue;
        Integer numValueOf;
        String string;
        EnumC1805430x5B enumC1805430x5B;
        if (Intrinsics.LJFF(c262100zr.LIZ, "wallet_exchange_status")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String string2 = null;
            if (interfaceC1107590evd != null) {
                boolValueOf = Boolean.valueOf(interfaceC1107590evd.getBoolean("complete"));
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                boolean z = false;
                if (interfaceC1107590evd2 != null) {
                    i = interfaceC1107590evd2.getInt("coins_count");
                } else {
                    i = 0;
                }
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null) {
                    boolValueOf2 = Boolean.valueOf(interfaceC1107590evd3.getBoolean("is_from_insufficient"));
                } else {
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    zBooleanValue = boolValueOf2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                C1124340fMe c1124340fMe = new C1124340fMe(i, true, zBooleanValue, 0L, false, false, null, 0, 1008);
                InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                if (interfaceC1107590evd4 != null) {
                    numValueOf = Integer.valueOf(interfaceC1107590evd4.getInt("way"));
                } else {
                    numValueOf = null;
                }
                InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                if (interfaceC1107590evd5 != null) {
                    string = interfaceC1107590evd5.getString("request_page");
                } else {
                    string = null;
                }
                InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                if (interfaceC1107590evd6 != null) {
                    string2 = interfaceC1107590evd6.getString("request_scenario");
                }
                C784440Upu.LIZ().LIZIZ(c1124340fMe);
                C784440Upu.LIZ().LIZIZ(new C1149590g1N());
                IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
                EnumC1805800x5m.Companion.getClass();
                EnumC1805800x5m enumC1805800x5mLIZ = C1805790x5l.LIZ(string);
                EnumC1805420x5A.Companion.getClass();
                iWalletCenterWalletCenter.JJ0(enumC1805800x5mLIZ, C1805890x5v.LIZ(string2));
                EnumC1805800x5m enumC1805800x5mLIZ2 = C1805790x5l.LIZ(string);
                EnumC1805430x5B.Companion.getClass();
                EnumC1805430x5B[] enumC1805430x5BArrValues = EnumC1805430x5B.values();
                int length = enumC1805430x5BArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        enumC1805430x5B = enumC1805430x5BArrValues[i2];
                        if (Intrinsics.LJFF(enumC1805430x5B.getValue(), string2)) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        enumC1805430x5B = EnumC1805430x5B.OTHERS;
                        break;
                    }
                }
                EnumC1805420x5A.Companion.getClass();
                EnumC1805420x5A enumC1805420x5ALIZ = C1805890x5v.LIZ(string2);
                if (numValueOf == null || numValueOf.intValue() == 0) {
                    z = true;
                }
                iWalletCenterWalletCenter.yM0(enumC1805800x5mLIZ2, enumC1805430x5B, enumC1805420x5ALIZ, false, false, z);
                iWalletCenterWalletCenter.X41(EnumC1805570x5P.EXCHANGE_SUCCESS);
            }
        }
    }
}
