package com.bytedance.android.live.wallet;

import X.C006A;
import X.C1149150g0f;
import X.C11O8;
import X.C1805390x57;
import X.C1805440x5C;
import X.C1805490x5H;
import X.EnumC1805420x5A;
import X.EnumC1805430x5B;
import X.EnumC1805570x5P;
import X.EnumC1805710x5d;
import X.EnumC1805800x5m;
import X.InterfaceC1253830ijV;
import X.InterfaceC1803980x2q;
import X.InterfaceC1806200x6Q;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.WalletStruct;
import java.util.HashMap;
import java.util.Map;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes18.dex */
public interface IWalletCenter extends C006A, InterfaceC1253830ijV {
    boolean Aj1();

    C11O8 EU();

    boolean JE1();

    void JG(String str, String str2, boolean z);

    void JJ0(EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A);

    void JW1(Map<String, String> map);

    long No0();

    void Ri2(EnumC1805420x5A enumC1805420x5A);

    WalletStruct TF1();

    void X41(EnumC1805570x5P enumC1805570x5P);

    C11O8 XF();

    void Yb1(long j);

    void a11(int i, long j, long j2);

    void aF2(EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A, InterfaceC1803980x2q interfaceC1803980x2q);

    InterfaceC1806200x6Q ao2(int i);

    BalanceStruct g52();

    void gi0(long j, long j2, boolean z, String str);

    void iA1(long j, long j2);

    boolean isFirstRecharge();

    C1149150g0f iz2();

    ExchangeDisplayInfo kL2();

    boolean kb();

    C11O8 l22();

    void lj0(EnumC1805710x5d enumC1805710x5d, EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A, HashMap<String, String> map, boolean z);

    C1805490x5H oN1();

    C1805440x5C pj0();

    void pv1(EnumC1805570x5P enumC1805570x5P);

    void sa();

    void setIapResultExtra(IapListResult.ListResultExtra listResultExtra);

    void tA2();

    String tT1(int i, boolean z);

    C1805390x57 uC0();

    IapListResult.ListResultExtra vx1();

    void xM0(EnumC1805800x5m enumC1805800x5m, EnumC1805430x5B enumC1805430x5B, EnumC1805420x5A enumC1805420x5A, boolean z);

    void yM0(EnumC1805800x5m enumC1805800x5m, EnumC1805430x5B enumC1805430x5B, EnumC1805420x5A enumC1805420x5A, boolean z, boolean z2, boolean z3);
}
