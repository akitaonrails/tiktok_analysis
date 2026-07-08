package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0O24, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.ui.assem.MentionListAssem$onViewCreated$10$1", f = "MentionListAssem.kt", l = {}, m = "invokeSuspend")
public final class C0O24 extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>>, Object> {
    public final /* synthetic */ List<InterfaceC1891350zJl> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O24(List<? extends InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C0O24> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O24(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListAssem@54ee.onViewCreated$10$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<AbstractC595720NYc> listLIZIZ = C0O26.LIZIZ(this.LL, AFwS240S0000000_9.get$arr$(59));
        C1C7U.LIZIZ("MentionListAssem@54ee.onViewCreated$10$1");
        return listLIZIZ;
    }
}
