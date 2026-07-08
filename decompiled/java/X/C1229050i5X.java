package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.manager.PublicGroupStateManager$fetchEntranceCheck$2", f = "PublicGroupStateManager.kt", l = {321}, m = "invokeSuspend")
public final class C1229050i5X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<GroupCompositeType> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229050i5X(List<GroupCompositeType> list, InterfaceC1364105Vn<? super C1229050i5X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1229050i5X(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupStateManager@ce.fetchEntranceCheck$2");
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
            C1229040i5W c1229040i5W = C1229040i5W.LL;
            List<GroupCompositeType> list = this.LLILLJJLI;
            this.LL = 1;
            if (c1229040i5W.LJFF(list, this) == objLJFF) {
                C1C7U.LIZIZ("PublicGroupStateManager@ce.fetchEntranceCheck$2");
                return objLJFF;
            }
        }
        C1229040i5W c1229040i5W2 = C1229040i5W.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLastFetchTime: updated to ");
        sbLIZ.append(System.currentTimeMillis());
        C2188811AlT.LIZIZ(sbLIZ);
        Keva keva = C1229040i5W.LLIZLLLIL;
        if (keva != null) {
            keva.storeLong("last_fetch_time", System.currentTimeMillis());
        }
        C1229040i5W.LLILZLL = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PublicGroupStateManager@ce.fetchEntranceCheck$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
