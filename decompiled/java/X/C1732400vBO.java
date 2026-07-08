package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveBillboardListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveGetByIdRequestBody;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS5S1401000_26;
import kotlin.jvm.internal.AwS9S1401000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.SeaLiveEffectBillboardDisplayHelper$displayBillboard$1", f = "SeaLiveEffectBillboardDisplayHelper.kt", l = {223, 234}, m = "invokeSuspend")
public final class C1732400vBO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeaLiveEffectRootData LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC1732650vBn LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732400vBO(SeaLiveEffectRootData seaLiveEffectRootData, int i, String str, Context context, String str2, InterfaceC1732650vBn interfaceC1732650vBn, InterfaceC1364105Vn<? super C1732400vBO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = seaLiveEffectRootData;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = context;
        this.LLIZ = str2;
        this.LLIZLLLIL = interfaceC1732650vBn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1732400vBO c1732400vBO = new C1732400vBO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1732400vBO.LLILLJJLI = obj;
        return c1732400vBO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        InterfaceC497601wk interfaceC497601wk;
        Object billboardById = obj;
        C1C7U.LIZ("SeaLiveEffectBillboardDisplayHelper@d078.displayBillboard$1");
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
                    C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.displayBillboard$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(billboardById);
        } else {
            C155000ia.LIZIZ(billboardById);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1732390vBN c1732390vBN = C1732390vBN.LIZ;
            SeaLiveEffectRootData seaLiveEffectRootData = this.LLILLL;
            int i2 = this.LLILZ;
            String str = this.LLILZIL;
            c1732390vBN.getClass();
            C1732390vBN.LJIILLIIL(seaLiveEffectRootData, i2, str);
            C1732640vBm c1732640vBm = C1732390vBN.LIZJ.LLILLJJLI;
            String str2 = this.LLILLL.authorId;
            List listSingletonList = Collections.singletonList(this.LLILZIL);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            billboardById = c1732640vBm.LL.LL.getBillboardById(new SeaLiveGetByIdRequestBody(str2, listSingletonList, C2286608xc.LJ(1)), this);
            if (billboardById == objLJFF) {
                C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.displayBillboard$1");
                return objLJFF;
            }
        }
        c0x52 = (C0X52) billboardById;
        if (c0x52 == null || !c0x52.LIZJ()) {
            z = false;
        }
        if (z && ((Response) c0x52.LIZIZ).isCodeOK() && ((Response) c0x52.LIZIZ).data != 0) {
            SeaLiveEffectRootData seaLiveEffectRootData2 = this.LLILLL;
            SeaLiveEffectRootData seaLiveEffectRootData3 = new SeaLiveEffectRootData(seaLiveEffectRootData2.authorId, seaLiveEffectRootData2.roomId, (Map) null, seaLiveEffectRootData2.scene, seaLiveEffectRootData2.source, 36);
            C1732390vBN c1732390vBN2 = C1732390vBN.LIZ;
            int i3 = this.LLILZ;
            SeaLiveBillboardListData seaLiveBillboardListData = (SeaLiveBillboardListData) ((Response) c0x52.LIZIZ).data;
            AwS9S1401000_26 awS9S1401000_26 = new AwS9S1401000_26(this.LLILLL, interfaceC497601wk, seaLiveEffectRootData3, i3, this.LLILZIL, this.LLIZLLLIL, 0);
            AwS5S1401000_26 awS5S1401000_26 = new AwS5S1401000_26(this.LLILLL, interfaceC497601wk, seaLiveEffectRootData3, this.LLILZ, this.LLILZIL, this.LLIZLLLIL, 0);
            String str3 = this.LLIZ;
            this.LLILLJJLI = null;
            this.LL = 2;
            if (c1732390vBN2.LJIIIIZZ(seaLiveEffectRootData3, i3, seaLiveBillboardListData, awS9S1401000_26, awS5S1401000_26, str3, this) == objLJFF) {
                C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.displayBillboard$1");
                return objLJFF;
            }
        } else {
            if (Intrinsics.LJFF(this.LLILLL.source, "old_msg")) {
                C1732390vBN c1732390vBN3 = C1732390vBN.LIZ;
                String str4 = this.LLILLL.authorId;
                int i4 = this.LLILZ;
                List listSingletonList2 = Collections.singletonList(this.LLILZIL);
                c1732390vBN3.getClass();
                C1732390vBN.LJIILL(interfaceC497601wk, str4, i4, listSingletonList2, false);
            }
            this.LLIZLLLIL.LIZ("get billboard by id api error");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.displayBillboard$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
