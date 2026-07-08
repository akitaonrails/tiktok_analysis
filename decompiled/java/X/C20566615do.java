package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20566615do extends AbstractC20561415cy {
    public final Function0<C1869440ykQ> LLILZ;
    public final C01GW LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;

    @Override // X.AbstractC20561415cy
    public final InterfaceC1869460ykS LIZ() {
        return (C1869440ykQ) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC20561415cy
    public final boolean LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    public C20566615do(C20565315db c20565315db) {
        this.LLILZ = c20565315db;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C20568115e3(this));
        this.LLILZIL = c01gwLIZIZ;
        this.LLILZLL = "feed_video_adaption_scene";
        this.LLIZ = ((C1869440ykQ) c01gwLIZIZ.getValue()).getEnableAsyncAdaption();
    }

    @Override // X.AbstractC20561415cy
    public final boolean LIZJ(VideoAdaptionParams videoAdaptionParams) {
        InterfaceC20568315e5 interfaceC20568315e5;
        InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
        if (!(paramsOperator instanceof InterfaceC20559915cj)) {
            paramsOperator = null;
        }
        if (paramsOperator == null) {
            if (!C20039813b2.LIZIZ) {
                C20569715eJ.LJI(this, null, videoAdaptionParams, null, AFwS221S0000000_31.get$arr$(525));
            }
            return false;
        }
        InterfaceC589490NAd paramsOperator2 = videoAdaptionParams.getParamsOperator();
        if (paramsOperator2 instanceof InterfaceC20568315e5) {
            interfaceC20568315e5 = (InterfaceC20568315e5) paramsOperator2;
            if (interfaceC20568315e5 != null && interfaceC20568315e5.getEnableSmartCrop()) {
                if (!C20039813b2.LIZIZ) {
                    zb((C1869440ykQ) this.LLILZIL.getValue(), null, null, new C20567715dz());
                    return true;
                }
                return true;
            }
        } else {
            interfaceC20568315e5 = null;
        }
        if (!C20039813b2.LIZIZ) {
            C20569715eJ.LJI(this, null, videoAdaptionParams, null, new AwS575S0100000_31(interfaceC20568315e5, 1543));
        }
        return false;
    }
}
