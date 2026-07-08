package X;

import com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask$run$1", f = "StorageLegoTask.kt", l = {49}, m = "invokeSuspend")
public final class C1326805He extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StorageLegoTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326805He(StorageLegoTask storageLegoTask, InterfaceC1364105Vn<? super C1326805He> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storageLegoTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1326805He(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageLegoTask@c623.run$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = C1328305Ht.LLILLL;
            C05G1 c05g1 = new C05G1(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C09IC.LJIJJ(anonymousClass0951, this, c05g1);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StorageLegoTask@c623.run$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("login Uid: ");
        sbLIZ.append((String) obj);
        C1327105Hh.LIZIZ("Lego", C2188811AlT.LIZIZ(sbLIZ));
        C1328805Hy.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorageLegoTask@c623.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
