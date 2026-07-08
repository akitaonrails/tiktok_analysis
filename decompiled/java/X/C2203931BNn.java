package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203931BNn implements InterfaceC801410VcB {
    public final /* synthetic */ InterfaceC1530550pvp<Map<?, ?>> LIZ;
    public final /* synthetic */ InterfaceC1530550pvp<C2204191BOn> LIZIZ;

    @Override // X.InterfaceC801410VcB
    public final void LIZ(Map<String, ? extends Object> map) {
        Object c098200Yq;
        String str;
        InterfaceC1530550pvp<Map<?, ?>> interfaceC1530550pvp = this.LIZ;
        InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp2 = this.LIZIZ;
        try {
            Object obj = map.get("code");
            Object obj2 = map.get("msg");
            Map<?, ?> map2 = null;
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(obj, 1)) {
                Object obj3 = map.get("data");
                if (obj3 instanceof Map) {
                    map2 = (Map) obj3;
                }
                interfaceC1530550pvp.accept(map2);
            } else {
                interfaceC1530550pvp2.accept(new C2204191BOn(((Integer) obj).intValue(), str));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp3 = this.LIZIZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            interfaceC1530550pvp3.accept(new C2204191BOn(thM5exceptionOrNullimpl.getMessage()));
        }
    }

    public C2203931BNn(C1BPO c1bpo, C2204431BPl c2204431BPl) {
        this.LIZ = c1bpo;
        this.LIZIZ = c2204431BPl;
    }
}
