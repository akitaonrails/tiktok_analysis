package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.android.live.effect.singleselector.SingleVoiceEffectSelectorDialog;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import njp.a;

/* JADX INFO: renamed from: X.0Tu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.singleselector.SingleVoiceEffectSelectorDialog$initData$1$1$1", f = "SingleVoiceEffectSelectorDialog.kt", l = {}, m = "invokeSuspend")
public final class C761530Tu3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC401801hI<LiveEffect> LL;
    public final /* synthetic */ SingleVoiceEffectSelectorDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C761530Tu3(AbstractC401801hI<? extends LiveEffect> abstractC401801hI, SingleVoiceEffectSelectorDialog singleVoiceEffectSelectorDialog, InterfaceC1364105Vn<? super C761530Tu3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC401801hI;
        this.LLILLJJLI = singleVoiceEffectSelectorDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761530Tu3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C761560Tu6 c761560Tu6;
        C1C7U.LIZ("SingleVoiceEffectSelectorDialog@b852.initData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<T> list = ((C0U74) ListProtector.get(((C403601ha) this.LL).LIZ, 0)).LIZIZ;
        C761560Tu6 c761560Tu62 = this.LLILLJJLI.LLIZ;
        if (c761560Tu62 != null && !list.isEmpty()) {
            C21342318fd.LIZ(new C0U5Y(c761560Tu62.LLILLJJLI, list), true).LIZJ(c761560Tu62);
            ((ArrayList) c761560Tu62.LLILLJJLI).clear();
            ((ArrayList) c761560Tu62.LLILLJJLI).addAll(list);
            c761560Tu62.LLILLL = c761560Tu62.LLILZ;
        }
        C259800zU c259800zU = new C259800zU();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        if (C500260Jjc.LJJIIZ(this.LLILLJJLI.LL.LIZ)) {
            Pair pairLJI = C500260Jjc.LJI(list, new AwS591S0100000_12(this.LLILLJJLI, 1143));
            if (pairLJI.getFirst() != null && ((Number) pairLJI.getSecond()).intValue() >= 0) {
                c259800zU.element = pairLJI.getFirst();
                c118300cf.element = ((Number) pairLJI.getSecond()).intValue();
            }
        }
        if (c259800zU.element == 0) {
            Pair pairLJI2 = C500260Jjc.LJI(list, new AwS591S0100000_12(this.LLILLJJLI, 1144));
            c259800zU.element = pairLJI2.getFirst();
            c118300cf.element = ((Number) pairLJI2.getSecond()).intValue();
        }
        T t = c259800zU.element;
        if (t != 0 && (c761560Tu6 = this.LLILLJJLI.LLIZ) != null) {
            c761560Tu6.LLLI(c118300cf.element, (LiveEffect) t);
        }
        SingleVoiceEffectSelectorDialog singleVoiceEffectSelectorDialog = this.LLILLJJLI;
        if (singleVoiceEffectSelectorDialog.LL.LIZ == null) {
            C16F5 c16f5 = singleVoiceEffectSelectorDialog.LLILZIL;
            if (c16f5 != null) {
                c16f5.setText(2131842880);
            }
        } else {
            C16F5 c16f52 = singleVoiceEffectSelectorDialog.LLILZIL;
            if (c16f52 != null) {
                c16f52.setText(2131842881);
            }
        }
        SingleVoiceEffectSelectorDialog singleVoiceEffectSelectorDialog2 = this.LLILLJJLI;
        RunnableC781530UlD runnableC781530UlD = singleVoiceEffectSelectorDialog2.LLILLL;
        if (runnableC781530UlD != null) {
            Boolean.valueOf(HandlerHook.viewPost(runnableC781530UlD, new ARunnableS112S0100000_12(singleVoiceEffectSelectorDialog2, 443)));
        }
        C1390410mHn c1390410mHn = this.LLILLJJLI.LLILZLL;
        if (c1390410mHn != null) {
            C500260Jjc.LJIILIIL(c1390410mHn);
        }
        C1390410mHn c1390410mHn2 = this.LLILLJJLI.LLILZLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZLLL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleVoiceEffectSelectorDialog@b852.initData$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
