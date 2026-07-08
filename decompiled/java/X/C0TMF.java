package X;

import android.text.TextUtils;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;

/* JADX INFO: renamed from: X.0TMF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TMF implements InterfaceC594300NSq<String> {
    public final /* synthetic */ AdSettingsActivity LL;
    public final /* synthetic */ boolean LLILLJJLI;

    public C0TMF(AdSettingsActivity adSettingsActivity, boolean z) {
        this.LL = adSettingsActivity;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIJ("Request Failed");
        c1389890mGx.LJIIJJI();
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<String> c0x9s, C0X52<String> c0x52) {
        String str;
        String strLJIL;
        int iLJIIJJI;
        boolean z;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        if (c0x52 != null && c0x52.LIZJ() && (str = c0x52.LIZIZ) != null) {
            n nVarLLLZIL = this.LL.LLLZIL(str);
            if (nVarLLLZIL != null && (kVarLJJIIZ2 = nVarLLLZIL.LJJIIZ("status_msg")) != null) {
                strLJIL = kVarLJJIIZ2.LJIL();
            } else {
                strLJIL = null;
            }
            if (!TextUtils.isEmpty(strLJIL)) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
                c1389890mGx.LJIIJ(strLJIL);
                c1389890mGx.LJIIJJI();
            }
            if (nVarLLLZIL != null && (kVarLJJIIZ = nVarLLLZIL.LJJIIZ("status_code")) != null) {
                iLJIIJJI = kVarLJJIIZ.LJIIJJI();
            } else {
                iLJIIJJI = -1;
            }
            C11GO c11go = (C11GO) this.LL.LLLLZI().getAccessory();
            if (iLJIIJJI == 0) {
                if (!this.LLILLJJLI) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = this.LLILLJJLI;
            }
            c11go.LJIILJJIL(z);
            this.LL.LLLLZIL().setEnabled(!z);
            if (z) {
                C786410Ut5.LJZL(0, this.LL.LLLLZLL());
                String str2 = this.LL.LLJILJIL;
                if (str2 != null && str2.length() != 0) {
                    C786410Ut5.LLLLZLL(this.LL.LLLLZLLLI(), 8);
                    C786410Ut5.LJZL(0, this.LL.LLLLZLLIL());
                } else {
                    C786410Ut5.LLLLZLL(this.LL.LLLLZLLLI(), 0);
                    C786410Ut5.LJZL(8, this.LL.LLLLZLLIL());
                }
            } else {
                C786410Ut5.LJZL(8, this.LL.LLLLZLL());
                C786410Ut5.LLLLZLL(this.LL.LLLLZLLLI(), 8);
                C786410Ut5.LJZL(8, this.LL.LLLLZLLIL());
            }
            this.LL.LLLZZIL(z);
        }
    }
}
