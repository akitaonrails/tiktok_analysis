package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS412S0200000_11;
import njp.a;

/* JADX INFO: renamed from: X.0SjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.publish.ClassicStoryPublishManager$restoreStoryPublishSchedule$1", f = "ClassicStoryPublishManager.kt", l = {}, m = "invokeSuspend")
public final class C729350SjF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C729440SjO LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729350SjF(C729440SjO c729440SjO, Context context, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C729350SjF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c729440SjO;
        this.LLILLJJLI = context;
        this.LLILLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C729350SjF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ClassicStoryPublishManager@844a.restoreStoryPublishSchedule$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C729370SjH.LIZIZ();
        C729440SjO c729440SjO = this.LL;
        AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11(this.LLILLL, c729440SjO, 73);
        c729440SjO.getClass();
        c729440SjO.LLIZLLLIL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        ((IStoryDraftService) c729440SjO.LLJILJIL.getValue()).getStoryDraftList(new C729340SjE(c729440SjO, awS412S0200000_11));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ClassicStoryPublishManager@844a.restoreStoryPublishSchedule$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
