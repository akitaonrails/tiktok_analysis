package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0m47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.SortWeightRelationModel$followingLoader$2", f = "SortWeightRelationModel.kt", l = {}, m = "invokeSuspend")
public final class C1381930m47 extends C09AX implements Function2<IMContact, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1368260li4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1381930m47(C1368260li4 c1368260li4, InterfaceC1364105Vn<? super C1381930m47> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1368260li4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1381930m47 c1381930m47 = new C1381930m47(this.LLILLJJLI, interfaceC1364105Vn);
        c1381930m47.LL = obj;
        return c1381930m47;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SortWeightRelationModel@c642.followingLoader$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(new C1382040m4I(this.LLILLJJLI).LIZIZ.LIZ((IMContact) this.LL));
        C1C7U.LIZIZ("SortWeightRelationModel@c642.followingLoader$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IMContact iMContact, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(iMContact, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
