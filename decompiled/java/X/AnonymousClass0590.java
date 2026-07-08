package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IPlaylistPlayNextService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0590, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.commonfeed.component.playnext.PlaylistAutoPlayNextProtocolImpl$loadData$1", f = "PlaylistAutoPlayNextProtocolImpl.kt", l = {41}, m = "invokeSuspend")
public final class AnonymousClass0590 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0591 LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0590(AnonymousClass0591 anonymousClass0591, Aweme aweme, Function0<Unit> function0, InterfaceC1364105Vn<? super AnonymousClass0590> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0591;
        this.LLILLL = aweme;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0590(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistAutoPlayNextProtocolImpl@57d6.loadData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IPlaylistPlayNextService iPlaylistPlayNextService = (IPlaylistPlayNextService) this.LLILLJJLI.LIZJ.getValue();
            if (iPlaylistPlayNextService != null) {
                Aweme aweme = this.LLILLL;
                this.LL = 1;
                if (iPlaylistPlayNextService.LIZIZ(aweme, this) == objLJFF) {
                    C1C7U.LIZIZ("PlaylistAutoPlayNextProtocolImpl@57d6.loadData$1");
                    return objLJFF;
                }
            }
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlaylistAutoPlayNextProtocolImpl@57d6.loadData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
