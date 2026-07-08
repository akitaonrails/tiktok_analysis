package Y;

import X.C123100dR;
import X.C12NU;
import X.C1558520qew;
import X.C1664420tPk;
import X.C1697810uHb;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C1858060yS4;
import X.C194350111w;
import X.C194396113q;
import X.C19754712Qv;
import X.C1C7U;
import X.C20632315oP;
import X.C2097908Jt;
import X.InterfaceC19408510wV;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoMixCardSugAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS18S0500000_29 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        IMessageAbility iMessageAbility = (IMessageAbility) ((TakoMixCardSugAssem) this.l0).LLJL.getValue();
        if (iMessageAbility == null || !iMessageAbility.oj()) {
            return;
        }
        C1858060yS4.LJ((C12NU) this.l1, C1558520qew.LJIIL((TakoMixCardSugAssem) this.l0), (View) this.l2, (Message) this.l3, C2097908Jt.LIZJ(new Pair("source_id", ((InterfaceC19408510wV) this.l4).getSourceId())), null, 16);
    }

    public final void LIZ$1() {
        String strLIZ;
        Object next;
        C194350111w c194350111w = (C194350111w) this.l0;
        Function2 function2 = (Function2) this.l1;
        C19754712Qv c19754712Qv = (C19754712Qv) this.l2;
        Effect effect = (Effect) this.l3;
        Function1 function1 = (Function1) this.l4;
        c194350111w.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) c194350111w.LLJILJILJ).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                ((ArrayList) c194350111w.LLJILJIL).clear();
                ((ArrayList) c194350111w.LLJILJIL).addAll(arrayList);
                C1846060y8i c1846060y8i = c194350111w.LLILLJJLI;
                if (c1846060y8i == null) {
                    c1846060y8i = null;
                }
                c1846060y8i.LJIIJJI();
                C1846060y8i c1846060y8i2 = c194350111w.LLILLJJLI;
                if (c1846060y8i2 == null) {
                    c1846060y8i2 = null;
                }
                Iterator it3 = ((ArrayList) c194350111w.LLJILJIL).iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((List) it3.next()).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (C123100dR.LIZ(C194396113q.LIZ((Effect) next))) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Effect effect2 = (Effect) next;
                    String strLIZ2 = effect2 != null ? C194396113q.LIZ(effect2) : null;
                    C1846060y8i c1846060y8i3 = c194350111w.LLILLJJLI;
                    if (c1846060y8i3 == null) {
                        c1846060y8i3 = null;
                    }
                    C1845940y8W c1845940y8WLJIIIZ = c1846060y8i3.LJIIIZ();
                    c1845940y8WLJIIIZ.LIZIZ(strLIZ2);
                    c1846060y8i2.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i2.LLILZLL.size(), c1846060y8i2.LLILZLL.isEmpty());
                }
                Iterator it5 = ((ArrayList) c194350111w.LLJILJIL).iterator();
                loop4: while (it5.hasNext()) {
                    for (Effect effect3 : (List) it5.next()) {
                        String strLIZ3 = C194396113q.LIZ(effect3);
                        if (Intrinsics.LJFF(effect3.getEffectId(), effect != null ? effect.getEffectId() : null) && ((strLIZ = C194396113q.LIZ(effect)) == null || strLIZ.length() == 0)) {
                            C194396113q.LIZIZ(effect, strLIZ3, null, null);
                            break loop4;
                        }
                    }
                }
                C1664420tPk c1664420tPk = c194350111w.LLILZ;
                if (c1664420tPk == null) {
                    c1664420tPk = null;
                }
                List<List<Effect>> list = c194350111w.LLJILJIL;
                c1664420tPk.getClass();
                c1664420tPk.LL = new ArrayList(list);
                c1664420tPk.LLILLJJLI = c19754712Qv;
                c1664420tPk.LLILLL = effect;
                C1664420tPk c1664420tPk2 = c194350111w.LLILZ;
                if (c1664420tPk2 == null) {
                    c1664420tPk2 = null;
                }
                c1664420tPk2.notifyDataSetChanged();
                C20632315oP c20632315oP = c194350111w.LLILLL;
                HandlerHook.viewPost(c20632315oP != null ? c20632315oP : null, new ARunnableS97S0200000_28(function1, c194350111w, 34));
                return;
            }
            Object next2 = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(new ArrayList());
            for (Object obj : (List) next2) {
                if (!((Boolean) function2.invoke(obj, c19754712Qv)).booleanValue()) {
                    ((List) ListProtector.get(arrayList, i)).add(obj);
                }
            }
            i = i2;
        }
    }

    public static final void run$0(ARunnableS18S0500000_29 aRunnableS18S0500000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TakoMixCardSugAssem@9e6a.onBind$1$1$1");
        try {
            aRunnableS18S0500000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoMixCardSugAssem@9e6a.onBind$1$1$1");
    }

    public static final void run$1(ARunnableS18S0500000_29 aRunnableS18S0500000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AEVoiceChangeCategoryView@2176.requestData$1");
        try {
            aRunnableS18S0500000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AEVoiceChangeCategoryView@2176.requestData$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS18S0500000_29(Object obj, C194350111w c194350111w, Function2<? super Effect, ? super C19754712Qv, Boolean> function2, C19754712Qv c19754712Qv, Effect effect, Function1<? super List<List<Effect>>, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = c194350111w;
        this.l2 = function2;
        this.l3 = c19754712Qv;
        this.l4 = effect;
    }
}
