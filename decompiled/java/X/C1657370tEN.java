package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.tabs.TabConfigurationSource$tabState$1", f = "TabConfigurationSource.kt", l = {}, m = "invokeSuspend")
public final class C1657370tEN extends C09AX implements InterfaceC1631620sYq<Integer, Integer, InterfaceC1364105Vn<? super C443120HZe<? extends Integer, ? extends Integer, ? extends C1657390tEP>>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1657360tEM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657370tEN(C1657360tEM c1657360tEM, InterfaceC1364105Vn<? super C1657370tEN> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1657360tEM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabConfigurationSource@cbd5.tabState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        C1657380tEO c1657380tEO = (C1657380tEO) ListProtector.get(((C1654080t94) ListProtector.get(this.LLILLL.LLILLJJLI.LIZ.LIZ.LIZ, i)).LIZJ, i2);
        Integer numLJ = C2286608xc.LJ(i);
        Integer numLJ2 = C2286608xc.LJ(i2);
        C1657500tEa c1657500tEa = new C1657500tEa(c1657380tEO.LIZ.LIZ);
        C1657360tEM c1657360tEM = this.LLILLL;
        Map<C1657450tEV, C1657460tEW> map = c1657360tEM.LLILLL;
        C1657450tEV c1657450tEV = c1657380tEO.LIZJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c1657460tEW = linkedHashMap.get(c1657450tEV);
        if (c1657460tEW == null) {
            c1657460tEW = new C1657460tEW(c1657380tEO.LIZJ.LIZ.invoke(c1657360tEM.LL));
            linkedHashMap.put(c1657450tEV, c1657460tEW);
        }
        C443120HZe c443120HZe = new C443120HZe(numLJ, numLJ2, new C1657390tEP(c1657500tEa, (C1657460tEW) c1657460tEW, c1657380tEO.LJ, c1657380tEO.LJFF));
        C1C7U.LIZIZ("TabConfigurationSource@cbd5.tabState$1");
        return c443120HZe;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, Integer num2, InterfaceC1364105Vn<? super C443120HZe<? extends Integer, ? extends Integer, ? extends C1657390tEP>> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C1657370tEN c1657370tEN = new C1657370tEN(this.LLILLL, interfaceC1364105Vn);
        c1657370tEN.LL = iIntValue;
        c1657370tEN.LLILLJJLI = iIntValue2;
        return c1657370tEN.invokeSuspend(Unit.LIZ);
    }
}
