package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM$setUpCountDown$1$2", f = "EmotePollDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C315460CYe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EmotePollDetailVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315460CYe(EmotePollDetailVM emotePollDetailVM, InterfaceC1364105Vn<? super C315460CYe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = emotePollDetailVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315460CYe(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmotePollDetailVM@7fdb.setUpCountDown$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0JRE c0jreWQ2 = this.LL.wQ2();
        if (c0jreWQ2 != null) {
            c0jreWQ2.LLJI = "00:00";
        }
        C0JRE c0jreWQ22 = this.LL.wQ2();
        if (c0jreWQ22 != null) {
            c0jreWQ22.LLJ = 0L;
        }
        this.LL.setState(new C315480CYg());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmotePollDetailVM@7fdb.setUpCountDown$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
