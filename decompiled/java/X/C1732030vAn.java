package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.BillboardListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.GetByIdRequestBody;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS5S1401000_26;
import kotlin.jvm.internal.AwS9S1401000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.EffectBillboardDisplayHelper$displayBillboard$1", f = "EffectBillboardDisplayHelper.kt", l = {214, 225}, m = "invokeSuspend")
public final class C1732030vAn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EffectRootData LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC1731950vAf LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732030vAn(EffectRootData effectRootData, int i, String str, Context context, String str2, InterfaceC1731950vAf interfaceC1731950vAf, InterfaceC1364105Vn<? super C1732030vAn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectRootData;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = context;
        this.LLIZ = str2;
        this.LLIZLLLIL = interfaceC1731950vAf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1732030vAn c1732030vAn = new C1732030vAn(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1732030vAn.LLILLJJLI = obj;
        return c1732030vAn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        InterfaceC497601wk interfaceC497601wk;
        Object billboardById = obj;
        C1C7U.LIZ("EffectBillboardDisplayHelper@c417.displayBillboard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
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
                    C1C7U.LIZIZ("EffectBillboardDisplayHelper@c417.displayBillboard$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(billboardById);
        } else {
            C155000ia.LIZIZ(billboardById);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1732020vAm c1732020vAm = C1732020vAm.LIZ;
            EffectRootData effectRootData = this.LLILLL;
            int i2 = this.LLILZ;
            String str = this.LLILZIL;
            c1732020vAm.getClass();
            C1732020vAm.LJIIZILJ(effectRootData, i2, str);
            C1732170vB1 c1732170vB1 = C1732020vAm.LIZJ.LLILLJJLI;
            String str2 = this.LLILLL.authorId;
            List listSingletonList = Collections.singletonList(this.LLILZIL);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            billboardById = c1732170vB1.LL.LL.getBillboardById(new GetByIdRequestBody(str2, listSingletonList, C2286608xc.LJ(1)), this);
            if (billboardById == objLJFF) {
                C1C7U.LIZIZ("EffectBillboardDisplayHelper@c417.displayBillboard$1");
                return objLJFF;
            }
        }
        c0x52 = (C0X52) billboardById;
        if (c0x52 == null || !c0x52.LIZJ()) {
            z = false;
        }
        if (z && ((Response) c0x52.LIZIZ).isCodeOK() && ((Response) c0x52.LIZIZ).data != 0) {
            EffectRootData effectRootData2 = this.LLILLL;
            EffectRootData effectRootData3 = new EffectRootData(effectRootData2.authorId, effectRootData2.roomId, (Map) null, effectRootData2.scene, effectRootData2.source, 36);
            C1732020vAm c1732020vAm2 = C1732020vAm.LIZ;
            int i3 = this.LLILZ;
            BillboardListData billboardListData = (BillboardListData) ((Response) c0x52.LIZIZ).data;
            AwS9S1401000_26 awS9S1401000_26 = new AwS9S1401000_26(this.LLILLL, interfaceC497601wk, effectRootData3, i3, this.LLILZIL, this.LLIZLLLIL, 1);
            AwS5S1401000_26 awS5S1401000_26 = new AwS5S1401000_26(this.LLILLL, interfaceC497601wk, effectRootData3, this.LLILZ, this.LLILZIL, this.LLIZLLLIL, 2);
            String str3 = this.LLIZ;
            this.LLILLJJLI = null;
            this.LL = 2;
            if (c1732020vAm2.LJIIIIZZ(effectRootData3, i3, billboardListData, awS9S1401000_26, awS5S1401000_26, str3, this) == objLJFF) {
                C1C7U.LIZIZ("EffectBillboardDisplayHelper@c417.displayBillboard$1");
                return objLJFF;
            }
        } else {
            if (Intrinsics.LJFF(this.LLILLL.source, "old_msg")) {
                C1732020vAm c1732020vAm3 = C1732020vAm.LIZ;
                String str4 = this.LLILLL.authorId;
                int i4 = this.LLILZ;
                List listSingletonList2 = Collections.singletonList(this.LLILZIL);
                c1732020vAm3.getClass();
                C1732020vAm.LJIILLIIL(interfaceC497601wk, str4, i4, listSingletonList2, false);
            }
            this.LLIZLLLIL.LIZ("get billboard by id api error");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectBillboardDisplayHelper@c417.displayBillboard$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
