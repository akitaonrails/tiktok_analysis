package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.manager.SocialGameExpHitKeva$saveUserExpHitMap$1", f = "SocialGameExpHitManager.kt", l = {}, m = "invokeSuspend")
public final class C1473105ph extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1473105ph(int i, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1473105ph(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialGameExpHitKeva@b55c.saveUserExpHitMap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> map = this.LL;
        int i = this.LLILLJJLI;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Set setLIZIZ = C1473005pg.LIZIZ(i, key);
            if (setLIZIZ != null) {
                Iterator it2 = setLIZIZ.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next());
                }
            }
            if (value != null) {
                C1473205pi c1473205pi = C1473205pi.LIZ;
                try {
                    C1227904rF c1227904rF = C1473205pi.LIZLLL;
                    Type type = C1473205pi.LIZJ;
                    c1227904rF.getClass();
                    Map map2 = (Map) C1227904rF.LIZJ(value, type);
                    if (map2 != null) {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            Object key2 = entry2.getKey();
                            Object value2 = entry2.getValue();
                            if (key2 != null && Intrinsics.LJFF(value2, true)) {
                                linkedHashSet.add(key2);
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String strLIZIZ = C2093608Ic.LIZIZ(linkedHashSet.toString());
            C01GW c01gw = C1473005pg.LIZ;
            ((Keva) c01gw.getValue()).storeString(C1473005pg.LIZ(key), strLIZIZ);
            Keva keva = (Keva) c01gw.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exp_version_");
            sbLIZ.append(key);
            keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialGameExpHitKeva@b55c.saveUserExpHitMap$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
