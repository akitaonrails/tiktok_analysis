package com.bytedance.android.live.wallet.viewmodel.recharge.component.banner;

import X.C095G;
import X.C09IC;
import X.C1803650x2J;
import X.C1DEK;
import X.C495520Jby;
import X.InterfaceC346201Wa;
import androidx.lifecycle.ViewModel;
import java.util.HashMap;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* JADX INFO: loaded from: classes28.dex */
public final class VaultRechargeUnlockGiftViewModel extends ViewModel {
    public static final /* synthetic */ int LLIZ = 0;
    public Integer LL;
    public String LLILLJJLI;
    public final C1DEK LLILLL;
    public final InterfaceC346201Wa<String> LLILZ;
    public boolean LLILZIL;
    public final HashMap<String, QueryOrderResult.VaultGiftInfo> LLILZLL;

    public VaultRechargeUnlockGiftViewModel() {
        C1DEK c1dekLIZ = C095G.LIZ(-2, null, 6);
        this.LLILLL = c1dekLIZ;
        this.LLILZ = C09IC.LJJIIJ(c1dekLIZ);
        this.LLILZLL = new HashMap<>();
    }

    public final void vQ2(String str, C495520Jby c495520Jby) {
        QueryOrderResult.VaultGiftInfo vaultGiftInfo;
        if (str == null || (vaultGiftInfo = this.LLILZLL.get(str)) == null) {
            return;
        }
        C1803650x2J.LIZ(c495520Jby, vaultGiftInfo);
    }
}
