package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.RecentSharedSortManager$shareWithNoCheck$3", f = "RecentSharedSortManager.kt", l = {}, m = "invokeSuspend")
public final class C805450Vih extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArrayList<C796400VLy> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805450Vih(ArrayList<C796400VLy> arrayList, InterfaceC1364105Vn<? super C805450Vih> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805450Vih(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecentSharedSortManager@1185.shareWithNoCheck$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0I0B.LJFF.LIZJ();
        C797560VQk.LIZIZ(C894660Z7w.LIZ()).LIZ().LJI(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecentSharedSortManager@1185.shareWithNoCheck$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
