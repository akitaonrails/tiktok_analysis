package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.gamora.editor.mixediting.cache.MixEditingCache;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.cache.MixEditingRecommendListCacheHelper$cache$1", f = "MixEditingRecommendListCacheHelper.kt", l = {}, m = "invokeSuspend")
public final class C2301308zz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ List<C1412860ms0> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2301308zz(int i, List<C1412860ms0> list, InterfaceC1364105Vn<? super C2301308zz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2301308zz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingRecommendListCacheHelper@f5e3.cache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (AnonymousClass0902.LIZ().count() > ((Number) AnonymousClass0900.LIZ.getValue()).intValue()) {
            C201955140j.LIZLLL(C0MJ8.LIZIZ, "CacheHelper", "cache size > MAX_CACHE_SIZE, remove max count cache firstly.");
            Iterator<T> it2 = AnonymousClass0902.LIZ().getAllKey().iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    int i = CastIntegerProtector.parseInt((String) next);
                    do {
                        Object next2 = it2.next();
                        int i2 = CastIntegerProtector.parseInt((String) next2);
                        if (i < i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it2.hasNext());
                }
                AnonymousClass0902.LIZ().erase((String) next);
            } else {
                throw new NoSuchElementException();
            }
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeCache -> count = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemList size = ");
        sbLIZ.append(this.LLILLJJLI.size());
        C201955140j.LIZLLL(c0mj8, "CacheHelper", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0902.LIZ().storeString(String.valueOf(this.LL), C2292508yZ.LIZJ(new MixEditingCache(this.LLILLJJLI, C2286608xc.LJFF(System.currentTimeMillis()))));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixEditingRecommendListCacheHelper@f5e3.cache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
