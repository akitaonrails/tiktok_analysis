package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1746380vXw<T> extends AbstractC1747950vaT<T> {
    public abstract IComponentStrategyService<?> LLLIL();

    @Override // X.AbstractC1747950vaT
    public final void LLLIILIL(C19465311Dn c19465311Dn) {
        Integer numLJIIJJI;
        String string;
        String string2;
        Object obj;
        String string3;
        Object obj2;
        Object obj3;
        Object obj4;
        String string4;
        Map<String, Object> map = this.LLILLL;
        Integer numLJIIJJI2 = null;
        if (map != null && (obj4 = map.get("biz_type")) != null && (string4 = obj4.toString()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string4);
        } else {
            numLJIIJJI = null;
        }
        EnumC955203oM enumC955203oMLIZ = C955103oL.LIZ(numLJIIJJI);
        Map<String, Object> map2 = this.LLILLL;
        if (map2 != null && (obj3 = map2.get("page_name")) != null) {
            string = obj3.toString();
        } else {
            string = null;
        }
        Map<String, Object> map3 = this.LLILLL;
        if (map3 != null && (obj2 = map3.get("region")) != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        Map<String, Object> map4 = this.LLILLL;
        if (map4 != null && (obj = map4.get("template")) != null && (string3 = obj.toString()) != null) {
            numLJIIJJI2 = C2095008Iq.LJIIJJI(string3);
        }
        AnonymousClass0408 anonymousClass0408 = AnonymousClass0408.LIZ;
        if (string == null) {
            string = "";
        }
        anonymousClass0408.getClass();
        IComponentStrategyService<?> iComponentStrategyServiceLIZLLL = AnonymousClass0408.LIZLLL(enumC955203oMLIZ, string, string2, numLJIIJJI2);
        if (iComponentStrategyServiceLIZLLL != null || (iComponentStrategyServiceLIZLLL = LLLIL()) != null) {
            iComponentStrategyServiceLIZLLL.LJ(this, c19465311Dn);
        }
    }

    public AbstractC1746380vXw(LifecycleOwner lifecycleOwner, AbstractC339510DSr abstractC339510DSr, String str, Integer num, String str2, int i) {
        super(lifecycleOwner, (i & 2) != 0 ? new AbstractC339510DSr<T>() { // from class: X.0DKm
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(T t, T t2) {
                return Intrinsics.LJFF(t, t2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(T t, T t2) {
                return Intrinsics.LJFF(t, t2);
            }
        } : abstractC339510DSr, null, C2097608Jq.LJIIIIZZ(new Pair("biz_type", (i & 8) != 0 ? null : num), new Pair("region", (i & 32) != 0 ? null : str2), new Pair("page_name", str), new Pair("template", null), new Pair("biz_env", null)));
    }
}
