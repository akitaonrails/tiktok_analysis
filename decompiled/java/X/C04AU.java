package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.04AU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager$updateCheckSalePropId$1", f = "SkuManager.kt", l = {312, 349}, m = "invokeSuspend")
public final class C04AU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SkuManager LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ SkuManager LLILZ;
    public final /* synthetic */ String[] LLILZIL;
    public final /* synthetic */ Function1<SkuItem, Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ ImageSelectData LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ View LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C04AU(SkuManager skuManager, String[] strArr, Function1<? super SkuItem, Unit> function1, int i, ImageSelectData imageSelectData, String str, View view, InterfaceC1364105Vn<? super C04AU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = skuManager;
        this.LLILZIL = strArr;
        this.LLILZLL = function1;
        this.LLIZ = i;
        this.LLIZLLLIL = imageSelectData;
        this.LLJ = str;
        this.LLJI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04AU(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SkuManager skuManager;
        String[] strArr;
        View view;
        String[] strArrLIZIZ;
        C1C7U.LIZ("SkuManager@9073.updateCheckSalePropId$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    view = (View) this.LLILLJJLI;
                    skuManager = this.LL;
                    C155000ia.LIZIZ(obj);
                    PdpViewModel.iS2(skuManager.ho().lX(), view, 16, null, false, null, null, false, null, null, 1020);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SkuManager@9073.updateCheckSalePropId$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SkuManager skuManager2 = this.LLILZ;
            String[] strArr2 = this.LLILZIL;
            Function1<SkuItem, Unit> function1 = this.LLILZLL;
            this.LLILLL = 1;
            if (skuManager2.uo(strArr2, true, function1, this) == objLJFF) {
                C1C7U.LIZIZ("SkuManager@9073.updateCheckSalePropId$1");
                return objLJFF;
            }
        }
        SkuPanelState skuPanelState = this.LLILZ.LLILLJJLI;
        if (skuPanelState != null) {
            int i2 = this.LLIZ;
            ImageSelectData imageSelectData = this.LLIZLLLIL;
            ArrayList<Integer> arrayList = skuPanelState.clickSpecGroupIds;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(C2286608xc.LJ(i2))) {
                arrayList.add(C2286608xc.LJ(i2));
            }
            skuPanelState.clickSpecGroupIds = arrayList;
            if (imageSelectData != null && imageSelectData.image != null) {
                skuPanelState.clickImageSource = imageSelectData;
            }
        }
        this.LLILZ.ho().lX().BS2(this.LLILZ.LLILLJJLI, true, true, false, AnonymousClass0449.SWITCH_SKU, true);
        skuManager = this.LLILZ;
        SkuPanelState skuPanelState2 = skuManager.LLILLJJLI;
        if (skuPanelState2 != null && (strArr = skuPanelState2.checkedSkuIds) != null) {
            int i3 = this.LLIZ;
            String str = this.LLJ;
            view = this.LLJI;
            boolean z = !Intrinsics.LJFF(C13LQ.LJJIIZ(i3, strArr), "");
            boolean zIsEmpty = true ^ ((ArrayList) C04AW.LIZ(skuManager.ko())).isEmpty();
            if (z && zIsEmpty) {
                if (C04AW.LIZJ(skuManager.G42(), (String[]) strArr.clone()) == 0 && (strArrLIZIZ = C04AW.LIZIZ(str, skuManager.G42())) != null) {
                    SkuPanelState skuPanelState3 = skuManager.LLILLJJLI;
                    if (skuPanelState3 != null) {
                        skuPanelState3.checkedSkuIds = strArrLIZIZ;
                    }
                    C0NJ1 c0nj1Fo = skuManager.fo();
                    Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("checked_sku_ids", strArrLIZIZ));
                    this.LL = skuManager;
                    this.LLILLJJLI = view;
                    this.LLILLL = 2;
                    if (c0nj1Fo.LJFF(mapLIZJ, this) == objLJFF) {
                        C1C7U.LIZIZ("SkuManager@9073.updateCheckSalePropId$1");
                        return objLJFF;
                    }
                    PdpViewModel.iS2(skuManager.ho().lX(), view, 16, null, false, null, null, false, null, null, 1020);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SkuManager@9073.updateCheckSalePropId$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
