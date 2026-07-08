package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0oDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.AiLiveStoryToolbarHandler$showAILiveTuxTip$1", f = "AiLiveStoryToolbarHandler.kt", l = {375}, m = "invokeSuspend")
public final class C1464670oDZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1464660oDY LLILLJJLI;
    public final /* synthetic */ C1464760oDi LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464670oDZ(C1464660oDY c1464660oDY, C1464760oDi c1464760oDi, InterfaceC1364105Vn<? super C1464670oDZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1464660oDY;
        this.LLILLL = c1464760oDi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1464670oDZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiLiveStoryToolbarHandler@db9d.showAILiveTuxTip$1");
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
            C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(250, this) == objLJFF) {
                C1C7U.LIZIZ("AiLiveStoryToolbarHandler@db9d.showAILiveTuxTip$1");
                return objLJFF;
            }
        }
        C1464660oDY c1464660oDY = this.LLILLJJLI;
        C1464760oDi c1464760oDi = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1464660oDY.LLJILJIL;
        c1464660oDY.LJIIIZ(new C1662100tM0(EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS, c1464660oDY.LIZJ(c1464760oDi.LIZLLL), "", false, -1L, null, EnumC862650Xsl.BELOW_ICON, new AwS566S0100000_22(c1464660oDY, 1116), new AwS566S0100000_22(c1464660oDY, 1117), EnumC1662090tLz.TUX_TIP, null, null, null, 7200));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiLiveStoryToolbarHandler@db9d.showAILiveTuxTip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
