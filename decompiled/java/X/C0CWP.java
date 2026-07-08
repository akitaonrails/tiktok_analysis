package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.IStoryService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.stage.VideoPublishStage$action$1", f = "VideoPublishStage.kt", l = {}, m = "invokeSuspend")
public final class C0CWP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWP(String str, InterfaceC1364105Vn<? super C0CWP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1593650rZb interfaceC1593650rZbLJJIFFI;
        C1C7U.LIZ("VideoPublishStage@f245.action$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
        if (iStoryService != null && (interfaceC1593650rZbLJJIFFI = iStoryService.LJJIFFI()) != null) {
            interfaceC1593650rZbLJJIFFI.LJI(this.LL, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoPublishStage@f245.action$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
