package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20565615de extends AbstractC20561415cy {
    public final Function0<C1869440ykQ> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C20567915e1(this));
    public final String LLILZLL = "default_adaption_strategy";

    @Override // X.AbstractC20561415cy
    public final boolean LIZJ(VideoAdaptionParams videoAdaptionParams) {
        return true;
    }

    @Override // X.AbstractC20561415cy
    public final InterfaceC1869460ykS LIZ() {
        return (C1869440ykQ) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    public C20565615de(C20562315d7 c20562315d7) {
        this.LLILZ = c20562315d7;
    }
}
