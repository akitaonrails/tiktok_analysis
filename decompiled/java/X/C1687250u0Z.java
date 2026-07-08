package X;

import Y.ARunnableS16S0200100_19;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import njp.a;

/* JADX INFO: renamed from: X.0u0Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem$Input$3$1", f = "TakoAIVideoInputAssem.kt", l = {}, m = "invokeSuspend")
public final class C1687250u0Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1679570toB LLILLJJLI;
    public final /* synthetic */ TakoAIVideoInputAssem LLILLL;
    public final /* synthetic */ C05P0<View> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687250u0Z(boolean z, C1679570toB c1679570toB, TakoAIVideoInputAssem takoAIVideoInputAssem, C05P0<View> c05p0, C05P0<Boolean> c05p02, InterfaceC1364105Vn<? super C1687250u0Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c1679570toB;
        this.LLILLL = takoAIVideoInputAssem;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687250u0Z(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssem@6324.Input$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$3$1");
            return unit;
        }
        if (this.LLILLJJLI.LLILLJJLI != EnumC1679580toC.VOICE) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$3$1");
            return unit2;
        }
        C05P0<View> c05p0 = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoAIVideoInputAssem.LLJJJ;
        View value = c05p0.getValue();
        if (value == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$3$1");
            return unit3;
        }
        if (!this.LLILZIL.getValue().booleanValue()) {
            this.LLILLL.getClass();
            C1860520yW2.LIZ.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_key_ai_video_keyboard_switch_tip_shown");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (!kevaLJIIL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                this.LLILZIL.setValue(Boolean.TRUE);
                int i = C1860640yWE.LIZ;
                HandlerHook.viewPostDelay(value, new ARunnableS16S0200100_19(3000L, value, AFwS214S0000000_25.get$arr$(224), 2), 1000L);
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$3$1");
                return unit4;
            }
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$3$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
