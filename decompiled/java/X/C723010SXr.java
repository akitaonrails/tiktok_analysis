package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mix.services.PlaylistRouterService;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem$onViewFinishInflate$1$2$1$1$1", f = "PlayListBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C723010SXr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InteractPlayListBottomBarAssem LL;
    public final /* synthetic */ C197039127h LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723010SXr(InteractPlayListBottomBarAssem interactPlayListBottomBarAssem, C197039127h c197039127h, InterfaceC1364105Vn<? super C723010SXr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interactPlayListBottomBarAssem;
        this.LLILLJJLI = c197039127h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C723010SXr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLLIL && this.LLILLJJLI.getContext() != null) {
            PlaylistRouterService.LIZIZ().LIZ(this.LLILLJJLI.getContext(), ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme(), ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType, true, false);
            this.LLILLJJLI.setLoading(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
