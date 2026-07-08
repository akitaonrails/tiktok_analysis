package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.BaseRelationModel$recentLoader$2$3", f = "BaseRelationModel.kt", l = {}, m = "invokeSuspend")
public final class C0O2B extends C09AX implements Function2<IMContact, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1381890m43 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O2B(C1381890m43 c1381890m43, InterfaceC1364105Vn<? super C0O2B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1381890m43;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O2B c0o2b = new C0O2B(this.LLILLJJLI, interfaceC1364105Vn);
        c0o2b.LL = obj;
        return c0o2b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseRelationModel@f20a.recentLoader$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LLILLJJLI.LIZ((IMContact) this.LL));
        C1C7U.LIZIZ("BaseRelationModel@f20a.recentLoader$2$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IMContact iMContact, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(iMContact, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
