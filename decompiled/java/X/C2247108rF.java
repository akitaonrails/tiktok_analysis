package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$processTtsCancel$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C2247108rF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C11Y7 LL;
    public final /* synthetic */ ReadTextEffectBean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247108rF(C11Y7 c11y7, ReadTextEffectBean readTextEffectBean, InterfaceC1364105Vn<? super C2247108rF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c11y7;
        this.LLILLJJLI = readTextEffectBean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2247108rF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ReadTextEffectBean next;
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.processTtsCancel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<List<ReadTextEffectBean>> list = this.LL.LLJLL;
        ReadTextEffectBean readTextEffectBean = this.LLILLJJLI;
        Iterator<List<ReadTextEffectBean>> it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator<ReadTextEffectBean> it3 = it2.next().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(next.effect.getEffectId(), readTextEffectBean.effect.getEffectId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean2 = next;
            if (readTextEffectBean2 != null) {
                readTextEffectBean2.selected = false;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsCancel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
