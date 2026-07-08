package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.widget.SeaLiveBillboardBroadcastWidget$onSlotCreated$1", f = "SeaLiveBillboardBroadcastWidget.kt", l = {61}, m = "invokeSuspend")
public final class C598580Ndo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1732340vBI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598580Ndo(C1732340vBI c1732340vBI, InterfaceC1364105Vn<? super C598580Ndo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1732340vBI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598580Ndo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String idStr;
        C1C7U.LIZ("SeaLiveBillboardBroadcastWidget@4237.onSlotCreated$1");
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
            C1732340vBI c1732340vBI = this.LLILLJJLI;
            C1729170v6B c1729170v6B = c1732340vBI.LLJJIJI;
            if (c1729170v6B != null) {
                Room room = c1732340vBI.LLILZIL;
                if (room == null || (idStr = room.getIdStr()) == null) {
                    idStr = CardStruct.IStatusCode.DEFAULT;
                }
                String strLJJIJ = AbstractC1732350vBJ.LJJIJ();
                this.LL = 1;
                Object objLJI = C23250099c.LJI(this, C2126308Ur.LIZ, new C1729140v68(c1729170v6B, strLJJIJ, System.currentTimeMillis(), idStr, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("SeaLiveBillboardBroadcastWidget@4237.onSlotCreated$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveBillboardBroadcastWidget@4237.onSlotCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
