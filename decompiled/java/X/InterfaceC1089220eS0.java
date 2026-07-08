package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1089220eS0 {
    AbstractC1089300eS8<Object> LIZIZ(String str);

    Iterator<Pair<Strategy, InterfaceC1089740eSq>> LIZJ();

    <T> void LIZLLL(C1089700eSm<T> c1089700eSm, List<? extends InterfaceC1089750eSr<T>> list, AbstractC1089300eS8<T> abstractC1089300eS8);

    Pair<Strategy, InterfaceC1089740eSq> LJ(String str);

    void LJFF(List<String> list);

    Collection<C443120HZe<C1089700eSm<Object>, List<InterfaceC1089750eSr<Object>>, AbstractC1089300eS8<Object>>> LJI();

    void LJII(Strategy strategy, InterfaceC1089740eSq interfaceC1089740eSq);

    List<Pair<Strategy, InterfaceC1089740eSq>> LJIIIIZZ(String str);

    void prepare();

    void release();
}
