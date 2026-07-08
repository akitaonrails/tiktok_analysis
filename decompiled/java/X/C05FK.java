package X;

import com.ss.android.ugc.aweme.api.component.caption.CommerceTransAndCaptionAssem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05FK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.caption.CommerceTransAndCaptionAssem$registerCaptionToggleChange$2", f = "CommerceTransAndCaptionAssem.kt", l = {}, m = "invokeSuspend")
public final class C05FK extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ CommerceTransAndCaptionAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05FK(CommerceTransAndCaptionAssem commerceTransAndCaptionAssem, InterfaceC1364105Vn<? super C05FK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceTransAndCaptionAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05FK c05fk = new C05FK(this.LLILLJJLI, interfaceC1364105Vn);
        c05fk.LL = ((Boolean) obj).booleanValue();
        return c05fk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceTransAndCaptionAssem@7e9.registerCaptionToggleChange$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        if (z) {
            CommerceTransAndCaptionAssem commerceTransAndCaptionAssem = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI.LLJJJIL);
            sbLIZ.append("_toggle_on");
            commerceTransAndCaptionAssem.Bo(C2188811AlT.LIZIZ(sbLIZ), true);
        }
        Iterator<Function1<Boolean, Unit>> it2 = this.LLILLJJLI.LLJJIJI.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.valueOf(z));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceTransAndCaptionAssem@7e9.registerCaptionToggleChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
