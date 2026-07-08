package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04AV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager$checkDefaultSkuSelection$2", f = "SkuManager.kt", l = {467}, m = "invokeSuspend")
public final class C04AV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SkuManager LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String[] LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04AV(SkuManager skuManager, String str, String[] strArr, int i, InterfaceC1364105Vn<? super C04AV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = skuManager;
        this.LLILLL = str;
        this.LLILZ = strArr;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04AV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkuManager@9073.checkDefaultSkuSelection$2");
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
            C0NJ1 c0nj1Fo = this.LLILLJJLI.fo();
            Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("sku_id", this.LLILLL), new Pair("checked_sku_ids", this.LLILZ), new Pair("quantity", C2286608xc.LJ(this.LLILZIL)));
            this.LL = 1;
            if (c0nj1Fo.LJFF(mapLJIIIIZZ, this) == objLJFF) {
                C1C7U.LIZIZ("SkuManager@9073.checkDefaultSkuSelection$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkuManager@9073.checkDefaultSkuSelection$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
