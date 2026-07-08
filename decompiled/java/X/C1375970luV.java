package X;

import Y.ACallableS249S0200000_21;
import Y.AfS113S0300000_21;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* JADX INFO: renamed from: X.0luV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375970luV extends C1377850lxX {
    public final Aweme LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final Cert LLIZLLLIL;

    @Override // X.C1377850lxX, X.InterfaceC1370310llN
    public final boolean enable() {
        return this.LLILLL.getAwemeControl().canShare();
    }

    @Override // X.C1377850lxX, X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        Aweme aweme;
        if (!C630030OnR.LIZ(context, this.LLILLL, this.LLILZ) || !this.LLILLL.getAwemeControl().canShare()) {
            return;
        }
        if ((this.LLILLL.getAwemeType() != 13 || C1387490mD5.LIZ(context, this.LLILLL)) && (aweme = this.LLILLL) != null && aweme.getShareInfo() != null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLJ(2131832484);
            C0FNV.LIZJ(dialogC1389620mGW);
            C11NN.LJFF(new ACallableS249S0200000_21(baseSharePackage, this, 5)).LJIIZILJ(C11S5.LIZ()).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS113S0300000_21(dialogC1389620mGW, this, context, 5));
        }
    }

    public C1375970luV(Aweme aweme, String str, Cert cert) {
        super("", false);
        this.LLILLL = aweme;
        this.LLILZ = "";
        this.LLILZIL = str;
        this.LLILZLL = true;
        this.LLIZ = 2131829543;
        this.LLIZLLLIL = cert;
    }
}
