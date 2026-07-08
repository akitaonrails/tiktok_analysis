package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20564015dO extends AbstractC20561415cy {
    public final Function0<C1869440ykQ> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C20568015e2(this));
    public final String LLILZLL = "feed_logo_spotlight";

    @Override // X.AbstractC20561415cy
    public final InterfaceC1869460ykS LIZ() {
        return (C1869440ykQ) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    public C20564015dO(C20564515dT c20564515dT) {
        this.LLILZ = c20564515dT;
    }

    @Override // X.AbstractC20561415cy
    public final boolean LIZJ(VideoAdaptionParams videoAdaptionParams) {
        InterfaceC20566915dr interfaceC20566915dr;
        InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
        if ((paramsOperator instanceof InterfaceC20566915dr) && (interfaceC20566915dr = (InterfaceC20566915dr) paramsOperator) != null && interfaceC20566915dr.getForceScaleType() == EnumC20563615dK.CENTER_SPOTLIGHT && interfaceC20566915dr.getScaleInfo() != null) {
            return true;
        }
        return false;
    }
}
