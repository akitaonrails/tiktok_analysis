package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.PrefetchCountStrategy;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.093Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C093Q extends AbstractC2255721DQs<InterfaceC23198097c> implements InterfaceC23198097c {
    public static final C093V LLJI = new Object() { // from class: X.093V
    };
    public static final int LLJIJIL = 8;
    public final InterfaceC1624480sNK LL;
    public final int LLILLJJLI;
    public volatile C09AE LLILZLL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(603));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(604));
    public final InterfaceC383701eN LLILZIL = C2191201ApK.LIZ();
    public final Set<String> LLIZ = new LinkedHashSet();
    public final TreeSet<C093T> LLIZLLLIL = C093Z.LIZ(new Comparator() { // from class: X.093S
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C093T c093t = (C093T) obj;
            C093T c093t2 = (C093T) obj2;
            int iLJII = Intrinsics.LJII(c093t2.LIZIZ, c093t.LIZIZ);
            if (iLJII == 0) {
                return c093t.LIZ.getEffectId().compareTo(c093t2.LIZ.getEffectId());
            }
            return iLJII;
        }
    }, new C093T[0]);
    public final InterfaceC23198097c LLJ = this;

    private final InterfaceC497601wk Z1() {
        return (InterfaceC497601wk) this.LLILZ.getValue();
    }

    public final boolean X1() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(Z1(), null);
    }

    @Override // X.InterfaceC23198097c
    public void pause() {
        C23250099c.LIZLLL(Z1(), null, null, new C093M(this, null), 3);
    }

    public final void w2() {
        this.LLILZLL = C23250099c.LIZLLL(Z1(), null, null, new C093N(this, null), 3);
    }

    public InterfaceC23198097c W1() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJ;
    }

    private final void o2(List<? extends Effect> list) {
        C23250099c.LIZLLL(Z1(), null, null, new C093R(this, list, null), 3);
    }

    public C093Q(InterfaceC1624480sNK interfaceC1624480sNK, int i) {
        this.LL = interfaceC1624480sNK;
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC23198097c
    public void nl(int i, Function1<? super Integer, ? extends Effect> function1) {
        Effect effectInvoke;
        Effect effectInvoke2;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        int i2 = i - PrefetchCountStrategy.LIZIZ;
        for (int i3 = PrefetchCountStrategy.LIZJ + i; i2 <= i3; i3--) {
            if (i2 != i && (effectInvoke2 = function1.invoke(Integer.valueOf(i2))) != null) {
                c13dvLIZIZ.add(effectInvoke2);
            }
            if (i3 != i && i2 != i3 && (effectInvoke = function1.invoke(Integer.valueOf(i3))) != null) {
                c13dvLIZIZ.add(effectInvoke);
            }
            i2++;
        }
        List<? extends Effect> listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        if (!listLIZ.isEmpty()) {
            o2(listLIZ);
        }
    }
}
