package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$onlyFetchLokiVoiceEffectList$1", f = "TTSPanelUIComponent.kt", l = {3178}, m = "invokeSuspend")
public final class C08WW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ Function1<List<? extends List<? extends ReadTextEffectBean>>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C08WW(C11Y7 c11y7, Map<String, String> map, Function1<? super List<? extends List<? extends ReadTextEffectBean>>, Unit> function1, InterfaceC1364105Vn<? super C08WW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11y7;
        this.LLILLL = map;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.onlyFetchLokiVoiceEffectList$1");
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
            Map<String, String> map = this.LLILLL;
            this.LL = 1;
            if (c11y7.R5(map, this) == objLJFF) {
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.onlyFetchLokiVoiceEffectList$1");
                return objLJFF;
            }
        }
        ArrayList arrayList = new ArrayList();
        C11Y7 c11y72 = this.LLILLJJLI;
        Iterator<? extends List<? extends ReadTextEffectBean>> it2 = c11y72.LLJZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(c11y72.FY1(new ArrayList(it2.next())));
        }
        this.LLILZ.invoke(arrayList);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.onlyFetchLokiVoiceEffectList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
