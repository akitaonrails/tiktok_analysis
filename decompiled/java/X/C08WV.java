package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceEffectList$1$voiceListResult$1", f = "TTSPanelUIComponent.kt", l = {1894}, m = "invokeSuspend")
public final class C08WV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends ReadTextEffectBean>>, Object> {
    public int LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WV(C11Y7 c11y7, InterfaceC1364105Vn<? super C08WV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11y7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$voiceListResult$1");
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
            C11Y7 c11y7 = this.LLILLJJLI;
            Map<String, String> map = c11y7.LLJZIJLIL;
            this.LL = 1;
            obj = c11y7.R5(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$voiceListResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$voiceListResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends ReadTextEffectBean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
