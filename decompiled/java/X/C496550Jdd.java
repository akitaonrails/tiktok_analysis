package X;

import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.profile.cell.HeaderCell;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.cell.HeaderCell$onRequestDataLegacy$2", f = "HeaderCell.kt", l = {276}, m = "invokeSuspend")
public final class C496550Jdd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends PrivilegeCenterConfig, ? extends GetRoomProfileCardResponse.ResponseData>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ HeaderCell LLILLL;
    public final /* synthetic */ GetRoomProfileCardResponse.ResponseData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496550Jdd(HeaderCell headerCell, GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super C496550Jdd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = headerCell;
        this.LLILZ = responseData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C496550Jdd c496550Jdd = new C496550Jdd(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c496550Jdd.LLILLJJLI = obj;
        return c496550Jdd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099G c099gLIZIZ;
        C1C7U.LIZ("HeaderCell@5d5c.onRequestDataLegacy$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            HeaderCell headerCell = this.LLILLL;
            obj = null;
            if (headerCell.LL.LIZJ.LIZLLL && (c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C496810Je3(headerCell, null), 3)) != null) {
                this.LL = 1;
                obj = c099gLIZIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("HeaderCell@5d5c.onRequestDataLegacy$2");
                    return objLJFF;
                }
            }
        }
        Pair pair = new Pair(obj, this.LLILZ);
        C1C7U.LIZIZ("HeaderCell@5d5c.onRequestDataLegacy$2");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends PrivilegeCenterConfig, ? extends GetRoomProfileCardResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
