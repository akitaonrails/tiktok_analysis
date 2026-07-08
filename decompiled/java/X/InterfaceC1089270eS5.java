package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0eS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1089270eS5 extends C0KY6 {
    AbstractC1089300eS8<Object> LIZIZ(String str);

    C1089610eSd LIZJ(String str);

    Collection<C443120HZe<C1089700eSm<Object>, List<InterfaceC1089750eSr<Object>>, AbstractC1089300eS8<Object>>> LIZLLL();

    void LJ(C0J0Q c0j0q, Object obj, String str);

    void LJFF(C1089210eRz c1089210eRz);

    @InterfaceC1294060jmO
    Map<String, Object> LJII();

    Object LJIIIIZZ(String str, String str2, String str3);

    C443120HZe<Strategy, C1089610eSd, C1089610eSd> LJIIIZ(Strategy strategy, Map<String, ? extends Object> map, boolean z, String str);

    void prepare();

    void release();
}
