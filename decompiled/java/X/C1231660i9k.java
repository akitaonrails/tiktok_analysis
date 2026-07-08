package X;

import Y.AComparatorS38S0000000_19;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.LegacyRelationModel$followLoader$1", f = "LegacyRelationModel.kt", l = {}, m = "invokeSuspend")
public final class C1231660i9k extends C09AX implements Function2<List<? extends IMUser>, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public /* synthetic */ Object LL;

    public C1231660i9k(InterfaceC1364105Vn<? super C1231660i9k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1231660i9k c1231660i9k = new C1231660i9k(interfaceC1364105Vn);
        c1231660i9k.LL = obj;
        return c1231660i9k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LegacyRelationModel@11de.followLoader$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS38S0000000_19(6), (Iterable) this.LL);
        C1C7U.LIZIZ("LegacyRelationModel@11de.followLoader$1");
        return listLJLLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends IMUser> list, InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
