package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.ProductTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06T6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleNativeProductTilesComponent$preloadImage$1", f = "AnoleNativeProductTilesComponent.kt", l = {234, 238}, m = "invokeSuspend")
public final class C06T6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1021680ch4 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06T6(C1021680ch4 c1021680ch4, InterfaceC1364105Vn<? super C06T6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1021680ch4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06T6 c06t6 = new C06T6(this.LLILZIL, interfaceC1364105Vn);
        c06t6.LLILZ = obj;
        return c06t6;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ProductTile> list;
        C118300cf c118300cf;
        int size;
        Iterator it2;
        String str;
        C1C7U.LIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        ?? r14 = 0;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c118300cf = (C118300cf) this.LLILZ;
                    C155000ia.LIZIZ(obj);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preloadImage success count:");
                    sbLIZ.append(c118300cf.element);
                    sbLIZ.append(" isLoadSuccess:");
                    sbLIZ.append(this.LLILZIL.LLLFF);
                    sbLIZ.append(" hasDidShowFail:");
                    sbLIZ.append(this.LLILZIL.LLLFFI);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.LLILLJJLI;
            it2 = (Iterator) this.LL;
            c118300cf = (C118300cf) this.LLILZ;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            C1021680ch4 c1021680ch4 = this.LLILZIL;
            AnoleProductTilesModel anoleProductTilesModel = c1021680ch4.LLJLIL;
            if (anoleProductTilesModel != null) {
                list = anoleProductTilesModel.productTiles;
            } else {
                list = null;
            }
            if (list == null) {
                c1021680ch4.LLLFF = false;
                c1021680ch4.LLLFZ = "data_load_fail";
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1");
                return unit2;
            }
            c118300cf = new C118300cf();
            size = list.size();
            if (size > 4) {
                size = 4;
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < size) {
                ProductTile productTile = (ProductTile) ListProtector.get(list, i2);
                List<String> list2 = productTile.urlList;
                if (list2 != null && !list2.isEmpty()) {
                    str = (String) ListProtector.get(list2, r14);
                } else {
                    str = productTile.uri;
                    if (str == null) {
                        str = "";
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    C1021680ch4 c1021680ch42 = this.LLILZIL;
                    c1021680ch42.LLLFZ = "data_load_fail";
                    c1021680ch42.LLLFF = r14;
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1");
                    return unit3;
                }
                if (C1325420kay.LIZIZ(str)) {
                    c118300cf.element++;
                } else {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C06T4(str, this.LLILZIL, c118300cf, null), 3));
                }
                i2++;
                r14 = 0;
            }
            it2 = arrayList.iterator();
        }
        while (it2.hasNext()) {
            AnonymousClass0957 anonymousClass0957 = (AnonymousClass0957) it2.next();
            this.LLILZ = c118300cf;
            this.LL = it2;
            this.LLILLJJLI = size;
            this.LLILLL = 1;
            if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1");
                return objLJFF;
            }
        }
        C1021680ch4 c1021680ch43 = this.LLILZIL;
        if (c1021680ch43.LLLFFI || c118300cf.element != size) {
            z = false;
        }
        c1021680ch43.LLLFF = z;
        if (z) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C06T5 c06t5 = new C06T5(c1021680ch43, null);
            this.LLILZ = c118300cf;
            this.LL = null;
            this.LLILLL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c06t5) == objLJFF) {
                C1C7U.LIZIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1");
                return objLJFF;
            }
        } else {
            c1021680ch43.LLLFZ = "image_load_failed";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("preloadImage success count:");
        sbLIZ2.append(c118300cf.element);
        sbLIZ2.append(" isLoadSuccess:");
        sbLIZ2.append(this.LLILZIL.LLLFF);
        sbLIZ2.append(" hasDidShowFail:");
        sbLIZ2.append(this.LLILZIL.LLLFFI);
        C2188811AlT.LIZIZ(sbLIZ2);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
