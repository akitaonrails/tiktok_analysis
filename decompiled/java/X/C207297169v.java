package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.169v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatInputFeatureComponent$handleFollowInputs$2", f = "AiChatInputFeatureComponent.kt", l = {}, m = "invokeSuspend")
public final class C207297169v extends C09AX implements Function2<C18TR<? extends C869590Y9l>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C207297169v(InterfaceC1364105Vn<? super C207297169v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C207297169v c207297169v = new C207297169v(interfaceC1364105Vn);
        c207297169v.LL = obj;
        return c207297169v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatInputFeatureComponent@26d0.handleFollowInputs$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(!(this.LL instanceof C18TS));
        C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.handleFollowInputs$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C18TR<? extends C869590Y9l> c18tr, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c18tr, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
