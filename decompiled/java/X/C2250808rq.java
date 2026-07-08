package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.preload.PreEmbTaskManager$doLocalContentUnderstanding$1", f = "PreEmbTaskManager.kt", l = {}, m = "invokeSuspend")
public final class C2250808rq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ContentUnderstandingRequest LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250808rq(ContentUnderstandingRequest contentUnderstandingRequest, InterfaceC1364105Vn<? super C2250808rq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = contentUnderstandingRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2250808rq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreEmbTaskManager@6b6b.doLocalContentUnderstanding$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
        if (iContentUnderstandingService != null) {
            iContentUnderstandingService.LJ(C2250708rp.LIZ, this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreEmbTaskManager@6b6b.doLocalContentUnderstanding$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
