package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.live.common.api.LocalServiceForLiveApi;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductNumResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.widget.LSLiveShopBagWidget$updateProductsAlertNumText$2$response$1", f = "LSLiveShopBagWidget.kt", l = {329}, m = "invokeSuspend")
public final class C1892450zLX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ProductNumResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1892600zLm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892450zLX(C1892600zLm c1892600zLm, InterfaceC1364105Vn<? super C1892450zLX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1892600zLm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892450zLX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        C1C7U.LIZ("LSLiveShopBagWidget@8dbe.updateProductsAlertNumText$2$response$1");
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
            LocalServiceForLiveApi.LIZ.getClass();
            LocalServiceForLiveApi localServiceForLiveApiLIZ = C1173130gdL.LIZ();
            Room room = this.LLILLJJLI.LLIZ;
            String string2 = null;
            if (room != null) {
                string = C2286608xc.LJFF(room.getId()).toString();
            } else {
                string = null;
            }
            Room room2 = this.LLILLJJLI.LLIZ;
            if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null) {
                string2 = C2286608xc.LJFF(interfaceC2262081DgMAuthor.getId()).toString();
            }
            String strLJ = C18JG.LJ(C520160Kac.LIZ(this.LLILLJJLI.LLILLJJLI.getContext()), "c46805.d96209");
            this.LL = 1;
            obj = localServiceForLiveApiLIZ.getRoomProductNum(string, string2, strLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LSLiveShopBagWidget@8dbe.updateProductsAlertNumText$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LSLiveShopBagWidget@8dbe.updateProductsAlertNumText$2$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ProductNumResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
