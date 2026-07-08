package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import njp.a;

/* JADX INFO: renamed from: X.14yI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videoadaption.adaptionstrategy.AbstractAdaptionStrategy$processHandlersInBackground$1", f = "AbstractAdaptionStrategy.kt", l = {}, m = "invokeSuspend")
public final class C20438814yI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC20561415cy LL;
    public final /* synthetic */ List<AbstractC20562115d5> LLILLJJLI;
    public final /* synthetic */ VideoAdaptionParams LLILLL;
    public final /* synthetic */ VideoAdaptionResult LLILZ;
    public final /* synthetic */ InterfaceC20438714yH LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20438814yI(AbstractC20561415cy abstractC20561415cy, List<? extends AbstractC20562115d5> list, VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult, InterfaceC20438714yH interfaceC20438714yH, InterfaceC1364105Vn<? super C20438814yI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC20561415cy;
        this.LLILLJJLI = list;
        this.LLILLL = videoAdaptionParams;
        this.LLILZ = videoAdaptionResult;
        this.LLILZIL = interfaceC20438714yH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20438814yI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractAdaptionStrategy@7458.processHandlersInBackground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoAdaptionResult videoAdaptionResultLIZLLL = this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        if (!C20039813b2.LIZIZ) {
            this.LL.em(AFwS221S0000000_31.get$arr$(400), null, videoAdaptionResultLIZLLL);
        }
        C23250099c.LIZLLL(this.LL.LLILLL, null, null, new C20438614yG(this.LLILZIL, videoAdaptionResultLIZLLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbstractAdaptionStrategy@7458.processHandlersInBackground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
