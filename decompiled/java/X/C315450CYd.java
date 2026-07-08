package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM$setUpCountDown$1$1", f = "EmotePollDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C315450CYd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EmotePollDetailVM LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315450CYd(EmotePollDetailVM emotePollDetailVM, InterfaceC1364105Vn interfaceC1364105Vn, C238400w2 c238400w2) {
        super(2, interfaceC1364105Vn);
        this.LL = emotePollDetailVM;
        this.LLILLJJLI = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315450CYd(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmotePollDetailVM@7fdb.setUpCountDown$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0JRE c0jreWQ2 = this.LL.wQ2();
        if (c0jreWQ2 != null) {
            EmotePollDetailVM emotePollDetailVM = this.LL;
            long j = this.LLILLJJLI.element;
            emotePollDetailVM.getClass();
            long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            long j3 = 60;
            c0jreWQ2.LLJI = C786410Ut5.j4("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
        }
        C0JRE c0jreWQ22 = this.LL.wQ2();
        if (c0jreWQ22 != null) {
            c0jreWQ22.LLJ = this.LLILLJJLI.element / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        this.LL.setState(new C315470CYf());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmotePollDetailVM@7fdb.setUpCountDown$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
