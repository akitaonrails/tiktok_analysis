package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.view.TakoAIVoiceInputKt$StreamingSubtitleChunk$1$1", f = "TakoAIVoiceInput.kt", l = {176}, m = "invokeSuspend")
public final class C1355305Sd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355305Sd(C1677480tko<Float, C1677280tkU> c1677480tko, C1677480tko<Float, C1677280tkU> c1677480tko2, InterfaceC1364105Vn<? super C1355305Sd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1677480tko;
        this.LLILZ = c1677480tko2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1355305Sd c1355305Sd = new C1355305Sd(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1355305Sd.LLILLJJLI = obj;
        return c1355305Sd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitleChunk$1$1");
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
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI, null, null, new C1355205Sc(this.LLILZ, null), 3);
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
            Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, null, 6);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitleChunk$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitleChunk$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
