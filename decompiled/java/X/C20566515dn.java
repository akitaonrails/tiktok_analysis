package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20566515dn extends AbstractC20561415cy {
    public final Function0<C1869440ykQ> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1499));
    public final String LLILZLL = "search_detail";

    @Override // X.AbstractC20561415cy
    public final InterfaceC1869460ykS LIZ() {
        return (C1869440ykQ) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    public C20566515dn(AwS432S0200000_31 awS432S0200000_31) {
        this.LLILZ = awS432S0200000_31;
    }

    @Override // X.AbstractC20561415cy
    public final boolean LIZJ(VideoAdaptionParams videoAdaptionParams) {
        return C652090Phv.LJ(((C1869440ykQ) this.LLILZIL.getValue()).getManagerContext().getEventType(), null);
    }
}
