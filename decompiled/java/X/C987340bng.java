package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0bng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987340bng implements InterfaceC988120bow {
    public final /* synthetic */ CommerceVideoDelegateKt LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public final boolean LIZ() {
        C1576740r8K c1576740r8KLIZ;
        if (!(this.LIZ.context instanceof InterfaceC1603190roz) || (c1576740r8KLIZ = C690440R6k.LIZ()) == null || !c1576740r8KLIZ.LIZ) {
            return false;
        }
        C786410Ut5.LLIIL(this.LIZ.widgetContainer, 4);
        return true;
    }

    @Override // X.InterfaceC988120bow
    public final void LJIILLIIL() {
        this.LIZ.p();
        if (this.LIZ.LLLILZLLLI() == null || !this.LIZIZ) {
            return;
        }
        this.LIZ.LLLILZLLLI().LIZIZ();
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LIZ;
        Aweme aweme = commerceVideoDelegateKt.aweme;
        C1022290ci3.LJIJJLI(2, commerceVideoDelegateKt.adPlayTimes + 1, commerceVideoDelegateKt.context, aweme);
    }

    public C987340bng(CommerceVideoDelegateKt commerceVideoDelegateKt, boolean z) {
        this.LIZ = commerceVideoDelegateKt;
        this.LIZIZ = z;
    }
}
