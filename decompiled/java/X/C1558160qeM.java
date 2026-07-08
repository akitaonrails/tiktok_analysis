package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.spi.IMainContainerAssemProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558160qeM extends C09AY implements Function1<C696590RUb, Unit> {
    public C1558160qeM() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C19719912Dl c19719912DlLIZIZ;
        C696590RUb c696590RUb2 = c696590RUb;
        IMainContainerAssemProvider iMainContainerAssemProvider = (IMainContainerAssemProvider) PluggableExtentionKt.pluggableSpi$default(IMainContainerAssemProvider.class, false, false, false, 14, null);
        if (iMainContainerAssemProvider != null) {
            c19719912DlLIZIZ = iMainContainerAssemProvider.LIZIZ();
        } else {
            c19719912DlLIZIZ = null;
        }
        c696590RUb2.LL = c19719912DlLIZIZ;
        c696590RUb2.LLIZLLLIL = R.id.i9v;
        return Unit.LIZ;
    }
}
