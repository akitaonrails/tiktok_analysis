package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20566715dp extends AbstractC20561415cy {
    public final Function0<C1869360ykI> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1869400ykM(this));
    public final String LLILZLL = "multi_threshold";

    @Override // X.AbstractC20561415cy
    public final InterfaceC1869460ykS LIZ() {
        return (C1869360ykI) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    public C20566715dp(C1869340ykG c1869340ykG) {
        this.LLILZ = c1869340ykG;
    }

    @Override // X.AbstractC20561415cy
    public final boolean LIZJ(VideoAdaptionParams videoAdaptionParams) {
        InterfaceC20568315e5 interfaceC20568315e5;
        InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
        if (paramsOperator instanceof InterfaceC20568315e5) {
            interfaceC20568315e5 = (InterfaceC20568315e5) paramsOperator;
            if (interfaceC20568315e5 != null && interfaceC20568315e5.getEnableMultiContainer()) {
                if (!C20039813b2.LIZIZ) {
                    zb(null, null, null, AFwS221S0000000_31.get$arr$(524));
                    return true;
                }
                return true;
            }
        } else {
            interfaceC20568315e5 = null;
        }
        if (!C20039813b2.LIZIZ) {
            C20569715eJ.LJI(this, null, videoAdaptionParams, null, new AwS575S0100000_31(interfaceC20568315e5, 1542));
            return false;
        }
        return false;
    }
}
