package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.05G9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMUserFeatureInfoHelper$clearCacheForFeature$3", f = "IMUserFeatureInfoHelper.kt", l = {}, m = "invokeSuspend")
public final class C05G9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1725606pK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05G9(EnumC1725606pK enumC1725606pK, InterfaceC1364105Vn<? super C05G9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1725606pK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05G9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserFeatureInfoHelper@a578.clearCacheForFeature$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('_');
        sbLIZ.append(this.LL.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            Set<String> allKey = C1725506pJ.LIZIZ.getAllKey();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : allKey) {
                if (u.LJIIZILJ((String) obj2, strLIZIZ, false)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1725506pJ.LIZIZ.erase((String) it2.next());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to clear Keva cache for feature: ");
            sbLIZ2.append(this.LL.name());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMUserFeatureInfoHelper@a578.clearCacheForFeature$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
