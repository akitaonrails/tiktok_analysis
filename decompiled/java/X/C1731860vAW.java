package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.widget.ECBillboardBroadcastWidget$onSlotCreated$1", f = "ECBillboardBroadcastWidget.kt", l = {55}, m = "invokeSuspend")
public final class C1731860vAW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1732200vB4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731860vAW(C1732200vB4 c1732200vB4, InterfaceC1364105Vn<? super C1731860vAW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1732200vB4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1731860vAW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String idStr;
        C1C7U.LIZ("ECBillboardBroadcastWidget@75ce.onSlotCreated$1");
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
            C1732200vB4 c1732200vB4 = this.LLILLJJLI;
            C1729220v6G c1729220v6G = c1732200vB4.LLJJIII;
            if (c1729220v6G != null) {
                Room room = c1732200vB4.LLILZIL;
                if (room == null || (idStr = room.getIdStr()) == null) {
                    idStr = CardStruct.IStatusCode.DEFAULT;
                }
                String strLJJIJLIJ = AbstractC1732180vB2.LJJIJLIJ();
                this.LL = 1;
                Object objLJI = C23250099c.LJI(this, C2126308Ur.LIZ, new C1729200v6E(c1729220v6G, strLJJIJLIJ, System.currentTimeMillis(), idStr, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("ECBillboardBroadcastWidget@75ce.onSlotCreated$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECBillboardBroadcastWidget@75ce.onSlotCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
