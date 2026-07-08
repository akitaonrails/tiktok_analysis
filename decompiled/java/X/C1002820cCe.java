package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail.SearchAdDetailModule$openLandPageWithVideoShrink$1", f = "SearchAdDetailModule.kt", l = {312}, m = "invokeSuspend")
public final class C1002820cCe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C1002850cCh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002820cCe(int i, Function0<Unit> function0, C1002850cCh c1002850cCh, InterfaceC1364105Vn<? super C1002820cCe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = function0;
        this.LLILZ = c1002850cCh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002820cCe(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1004580cFU shareInfo;
        Function1<? super Boolean, Unit> function1;
        C1004580cFU shareInfo2;
        C1004580cFU shareInfo3;
        InterfaceC660150Puv interfaceC660150PuvLIZ;
        C1004580cFU shareInfo4;
        C1004580cFU shareInfo5;
        Function1<? super Boolean, Unit> function12;
        C1C7U.LIZ("SearchAdDetailModule@2dda.openLandPageWithVideoShrink$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(600L, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdDetailModule@2dda.openLandPageWithVideoShrink$1");
                return objLJFF;
            }
        }
        int i2 = this.LLILLJJLI;
        if (i2 != 53 && i2 != 54) {
            if (i2 == 80) {
                if (((IFeedVideoShrinkService) ServiceManager.get().getService(IFeedVideoShrinkService.class)).I3()) {
                    this.LLILLL.invoke();
                    InterfaceC660150Puv interfaceC660150PuvLIZ2 = this.LLILZ.LIZ();
                    if (interfaceC660150PuvLIZ2 != null && (shareInfo5 = interfaceC660150PuvLIZ2.getShareInfo()) != null && (function12 = shareInfo5.LJII) != null) {
                        function12.invoke(true);
                    }
                    Aweme aweme = this.LLILZ.LLILZ;
                    if ((aweme == null || !C1010120cOQ.LJJIFFI(aweme)) && (interfaceC660150PuvLIZ = this.LLILZ.LIZ()) != null && (shareInfo4 = interfaceC660150PuvLIZ.getShareInfo()) != null && shareInfo4.LJIIIIZZ) {
                        SearchAdEventLogger searchAdEventLogger = this.LLILZ.LLILZIL;
                        C1009980cOC.LIZ.getClass();
                        C989080bqU.LIZ(searchAdEventLogger, C1009980cOC.LJIIIZ, this.LLILZ.LL.getAweme(), "click");
                    }
                    int i3 = C2510609se.LIZ;
                } else {
                    InterfaceC660150Puv interfaceC660150PuvLIZ3 = this.LLILZ.LIZ();
                    if (interfaceC660150PuvLIZ3 != null && (shareInfo = interfaceC660150PuvLIZ3.getShareInfo()) != null && (function1 = shareInfo.LJII) != null) {
                        function1.invoke(false);
                    }
                    Aweme aweme2 = this.LLILZ.LLILZ;
                    if (aweme2 == null || !C1010120cOQ.LJJIFFI(aweme2)) {
                        SearchAdEventLogger searchAdEventLogger2 = this.LLILZ.LLILZIL;
                        C1009980cOC.LIZ.getClass();
                        searchAdEventLogger2.logAd(C1009980cOC.LJII);
                    }
                    int i4 = C2510609se.LIZ;
                }
                InterfaceC660150Puv interfaceC660150PuvLIZ4 = this.LLILZ.LIZ();
                if (interfaceC660150PuvLIZ4 != null && (shareInfo3 = interfaceC660150PuvLIZ4.getShareInfo()) != null) {
                    shareInfo3.LJII = null;
                }
                InterfaceC660150Puv interfaceC660150PuvLIZ5 = this.LLILZ.LIZ();
                if (interfaceC660150PuvLIZ5 != null && (shareInfo2 = interfaceC660150PuvLIZ5.getShareInfo()) != null) {
                    shareInfo2.LJIIIIZZ = true;
                }
            }
        } else {
            this.LLILLL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdDetailModule@2dda.openLandPageWithVideoShrink$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
