package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05P7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.StoryShootButtonKt$StoryShootButton$1$1", f = "StoryShootButton.kt", l = {}, m = "invokeSuspend")
public final class C05P7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1308705Af LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C05P1<Float> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05P7(EnumC1308705Af enumC1308705Af, Function0<Unit> function0, C05P1<Float> c05p1, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05P7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1308705Af;
        this.LLILLJJLI = function0;
        this.LLILLL = c05p1;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05P7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryShootButtonKt@dd25.StoryShootButton$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == EnumC1308705Af.RECORDING && this.LLILLL.getValue().floatValue() >= 1.0f) {
            this.LLILZ.setValue(Boolean.TRUE);
            this.LLILLJJLI.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryShootButtonKt@dd25.StoryShootButton$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
