package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS371S0200000_5;
import njp.a;

/* JADX INFO: renamed from: X.0F1N, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.TemplateMagicProcessComponent$saveBmpAndCreateRenderProxy$2", f = "TemplateMagicProcessComponent.kt", l = {}, m = "invokeSuspend")
public final class C0F1N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public final /* synthetic */ C0F1S LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ C0F1M LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F1N(C0F1S c0f1s, NLETrackSlot nLETrackSlot, C0F1M c0f1m, InterfaceC1364105Vn<? super C0F1N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0f1s;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = c0f1m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F1N(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMagicProcessComponent@2539.saveBmpAndCreateRenderProxy$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2486309oj c2486309oj = C2486309oj.LIZ;
        C0F1S c0f1s = this.LL;
        c0f1s.getClass();
        CreativeInfo creativeInfo = new CreativeInfo(c0f1s.LIZ, c0f1s.LIZIZ, c0f1s.LIZJ);
        NLETrackSlot nLETrackSlot = this.LLILLJJLI;
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this.LLILLL, nLETrackSlot, 191);
        c2486309oj.getClass();
        Pair pairLIZLLL = C2486309oj.LIZLLL(creativeInfo, nLETrackSlot, awS371S0200000_5);
        C1C7U.LIZIZ("TemplateMagicProcessComponent@2539.saveBmpAndCreateRenderProxy$2");
        return pairLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
