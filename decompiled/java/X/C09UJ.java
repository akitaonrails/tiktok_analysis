package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09UJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.unlocktts.UnlockReadTextVoiceComponent$realFetchVoiceEffect$1$1", f = "UnlockReadTextVoiceComponent.kt", l = {}, m = "invokeSuspend")
public final class C09UJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<List<ReadTextEffectBean>> LL;
    public final /* synthetic */ C19522411Zm LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09UJ(List<List<ReadTextEffectBean>> list, C19522411Zm c19522411Zm, Map<String, String> map, InterfaceC1364105Vn<? super C09UJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c19522411Zm;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09UJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = null;
        if (this.LL.isEmpty()) {
            C0FWT c0fwtW2 = this.LLILLJJLI.W2();
            if (c0fwtW2 != null) {
                c0fwtW2.I10(null);
                unit = Unit.LIZ;
            }
        } else {
            this.LLILLJJLI.LLJ.clear();
            C19522411Zm c19522411Zm = this.LLILLJJLI;
            List<ReadTextEffectBean> list = c19522411Zm.LLJ;
            C2377309Tf.LIZ(c19522411Zm.H2());
            list.addAll(C2247008rE.LIZ(this.LL));
            C0FWT c0fwtW22 = this.LLILLJJLI.W2();
            if (c0fwtW22 != null) {
                c0fwtW22.mq0(this.LL);
            }
            C0FWT c0fwtW23 = this.LLILLJJLI.W2();
            if (c0fwtW23 != null) {
                c0fwtW23.ay(new ArrayList(this.LLILLJJLI.LLJ), this.LLILLL);
            }
            C0FWT c0fwtW24 = this.LLILLJJLI.W2();
            if (c0fwtW24 != null) {
                c0fwtW24.I10(null);
            }
            if (!this.LLILLJJLI.LLJ.isEmpty()) {
                C19522411Zm c19522411Zm2 = this.LLILLJJLI;
                c19522411Zm2.H3(c19522411Zm2.LLJ);
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
