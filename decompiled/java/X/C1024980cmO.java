package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IRewardAdapterDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: renamed from: X.0cmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024980cmO extends AbstractC1024960cmM implements InterfaceC1031720cxG {
    @Override // X.InterfaceC1031720cxG
    public final void LIZLLL() {
        InterfaceC1025010cmR interfaceC1025010cmRLIZJ;
        this.LIZ = "non_clicked";
        this.LIZIZ = "close";
        this.LJ = 0;
        InterfaceC1024990cmP interfaceC1024990cmP = this.LIZJ;
        if (interfaceC1024990cmP != null && (interfaceC1025010cmRLIZJ = interfaceC1024990cmP.LIZJ()) != null) {
            interfaceC1025010cmRLIZJ.reset();
        }
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1031720cxG
    public final void LIZIZ() {
        LJIIIZ();
    }

    @Override // X.InterfaceC1031720cxG
    public final void LIZ(boolean z) {
        LJIIJ(z);
    }

    @Override // X.InterfaceC1031720cxG
    public final void LJFF(Context context, C1031750cxJ c1031750cxJ) {
        LJIIIIZZ(context, new C1031780cxM(c1031750cxJ));
    }

    @Override // X.InterfaceC1031720cxG
    public final void LIZJ(Aweme aweme, String str, Map map) {
        IRewardAdapterDepend iRewardAdapterDepend = (IRewardAdapterDepend) PluggableExtentionKt.pluggableSpi$default(IRewardAdapterDepend.class, false, false, false, 14, null);
        if (iRewardAdapterDepend != null) {
            iRewardAdapterDepend.LIZJ(aweme, str, map);
        }
    }

    @Override // X.AbstractC1024960cmM
    public final boolean LJIIJJI(Context context, AwemeRawAd awemeRawAd, String str) {
        IRewardAdapterDepend iRewardAdapterDepend = (IRewardAdapterDepend) PluggableExtentionKt.pluggableSpi$default(IRewardAdapterDepend.class, false, false, false, 14, null);
        if (iRewardAdapterDepend != null) {
            return iRewardAdapterDepend.LIZ(context, awemeRawAd, str);
        }
        return false;
    }
}
