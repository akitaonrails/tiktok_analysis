package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.GetByIdRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardPCDisplayHelper$displayBillboard$1", f = "BillboardPCDisplayHelper.kt", l = {140, 150}, m = "invokeSuspend")
public final class C1729350v6T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ RootData LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729350v6T(int i, RootData rootData, List<String> list, Context context, InterfaceC1364105Vn<? super C1729350v6T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = i;
        this.LLILZLL = rootData;
        this.LLIZ = list;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1729350v6T c1729350v6T = new C1729350v6T(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1729350v6T.LLILZ = obj;
        return c1729350v6T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        T t;
        Boolean bool;
        InterfaceC497601wk interfaceC497601wk;
        long jCurrentTimeMillis;
        boolean z;
        String str;
        Object billboardById = obj;
        C1C7U.LIZ("BillboardPCDisplayHelper@3037.displayBillboard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean zBooleanValue = false;
        boolean z2 = true;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0x52 = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(billboardById);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.displayBillboard$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.LLILLJJLI;
            str = (String) this.LL;
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            C155000ia.LIZIZ(billboardById);
        } else {
            C155000ia.LIZIZ(billboardById);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            jCurrentTimeMillis = System.currentTimeMillis();
            C1730290v7z c1730290v7z = C1730290v7z.LIZ;
            int i2 = this.LLILZIL;
            c1730290v7z.getClass();
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "template_pc_display";
            } else {
                str = "image_pc_display";
            }
            C1729400v6Y c1729400v6Y = C1729400v6Y.LIZ;
            RootData rootData = this.LLILZLL;
            int i3 = this.LLILZIL;
            c1729400v6Y.getClass();
            c1730290v7z.getClass();
            String strLJI = C1730290v7z.LJI(i3);
            if (strLJI == null) {
                strLJI = "";
            }
            C1728460v52.LIZJ(rootData, "", strLJI, str, "display_total");
            C1728220v4e c1728220v4e = C1729400v6Y.LIZJ.LLILLJJLI;
            String str2 = this.LLILZLL.authorId;
            List<String> list = this.LLIZ;
            int i4 = this.LLILZIL;
            this.LLILZ = interfaceC497601wk;
            this.LL = str;
            this.LLILLJJLI = jCurrentTimeMillis;
            this.LLILLL = 1;
            billboardById = c1728220v4e.LL.LL.getBillboardById(new GetByIdRequestBody(str2, list, i4), this);
            if (billboardById == objLJFF) {
                C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.displayBillboard$1");
                return objLJFF;
            }
        }
        c0x52 = (C0X52) billboardById;
        if (c0x52 == null || !c0x52.LIZJ()) {
            z2 = false;
        }
        if (z2 && ((Response) c0x52.LIZIZ).isCodeOK() && (t = ((Response) c0x52.LIZIZ).data) != 0) {
            RootData rootData2 = this.LLILZLL;
            String str3 = rootData2.roomId;
            String str4 = rootData2.authorId;
            BillboardListData billboardListData = (BillboardListData) t;
            if (billboardListData != null && (bool = billboardListData.isNewUser) != null) {
                zBooleanValue = bool.booleanValue();
            }
            RootData rootData3 = new RootData(str4, str3, zBooleanValue, 24);
            C1729400v6Y c1729400v6Y2 = C1729400v6Y.LIZ;
            Context context = this.LLIZLLLIL;
            int i5 = this.LLILZIL;
            BillboardListData billboardListData2 = (BillboardListData) ((Response) c0x52.LIZIZ).data;
            C1729360v6U c1729360v6U = new C1729360v6U(interfaceC497601wk, rootData3, i5, this.LLIZ, str, jCurrentTimeMillis);
            C1729370v6V c1729370v6V = new C1729370v6V(interfaceC497601wk, rootData3, this.LLILZIL, this.LLIZ, str, jCurrentTimeMillis);
            this.LLILZ = null;
            this.LL = null;
            this.LLILLL = 2;
            if (c1729400v6Y2.LJ(context, rootData3, i5, billboardListData2, false, c1729360v6U, c1729370v6V, this) == objLJFF) {
                C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.displayBillboard$1");
                return objLJFF;
            }
        } else {
            C1729400v6Y c1729400v6Y3 = C1729400v6Y.LIZ;
            String str5 = this.LLILZLL.authorId;
            int i6 = this.LLILZIL;
            List<String> list2 = this.LLIZ;
            c1729400v6Y3.getClass();
            C1729400v6Y.LJIIIIZZ(interfaceC497601wk, str5, i6, list2, false);
            C1729400v6Y.LJIIIZ(this.LLILZLL, this.LLILZIL, str, jCurrentTimeMillis, "api error");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.displayBillboard$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
