package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0bp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988250bp9 implements InterfaceC1002840cCg {
    public final Aweme LIZ;
    public final Context LIZIZ;
    public final /* synthetic */ CommerceVideoDelegateKt LIZJ;
    public final /* synthetic */ Aweme LIZLLL;

    @Override // X.InterfaceC1002840cCg
    public final VideoPlayTaskManager LIZIZ() {
        return this.LIZJ.playTaskManager;
    }

    @Override // X.InterfaceC1002840cCg
    public final void LIZJ() {
        C1045340dJE c1045340dJELJIJI = C1045340dJE.LJIJI();
        Aweme aweme = this.LIZLLL;
        c1045340dJELJIJI.LJJII(this.LIZJ.playTaskManager.getCurrentPosition(), this.LIZIZ, aweme);
        InterfaceC988260bpA interfaceC988260bpA = this.LIZJ.searchAdDetailModule;
        if (interfaceC988260bpA != null) {
            interfaceC988260bpA.zO(EnumC1010840cPa.MIDPOINT);
        }
    }

    @Override // X.InterfaceC1002840cCg
    public final void LIZLLL() {
        C1045340dJE c1045340dJELJIJI = C1045340dJE.LJIJI();
        Aweme aweme = this.LIZLLL;
        c1045340dJELJIJI.LJJIFFI(this.LIZJ.playTaskManager.getCurrentPosition(), this.LIZIZ, aweme);
        InterfaceC988260bpA interfaceC988260bpA = this.LIZJ.searchAdDetailModule;
        if (interfaceC988260bpA != null) {
            interfaceC988260bpA.zO(EnumC1010840cPa.FIRST_QUARTILE);
        }
    }

    @Override // X.InterfaceC1002840cCg
    public final void LJ() {
        C1045340dJE c1045340dJELJIJI = C1045340dJE.LJIJI();
        Aweme aweme = this.LIZLLL;
        c1045340dJELJIJI.LJJIII(this.LIZJ.playTaskManager.getCurrentPosition(), this.LIZIZ, aweme);
        InterfaceC988260bpA interfaceC988260bpA = this.LIZJ.searchAdDetailModule;
        if (interfaceC988260bpA != null) {
            interfaceC988260bpA.zO(EnumC1010840cPa.THIRD_QUARTILE);
        }
    }

    @Override // X.InterfaceC1002840cCg
    public final Context getContext() {
        return this.LIZIZ;
    }

    public C988250bp9(CommerceVideoDelegateKt commerceVideoDelegateKt, Aweme aweme) {
        this.LIZJ = commerceVideoDelegateKt;
        this.LIZLLL = aweme;
        this.LIZ = commerceVideoDelegateKt.aweme;
        this.LIZIZ = commerceVideoDelegateKt.context;
    }

    @Override // X.InterfaceC1002840cCg
    public final boolean LIZ(Context context, Aweme aweme, int i) {
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LIZJ;
        C988380bpM c988380bpM = ((C988370bpL) commerceVideoDelegateKt.depend).LIZJ;
        InterfaceC1021920chS interfaceC1021920chSLLIIIJ = commerceVideoDelegateKt.LLIIIJ();
        c988380bpM.getClass();
        return C1021860chM.LJJJI(context, aweme, i, interfaceC1021920chSLLIIIJ);
    }
}
