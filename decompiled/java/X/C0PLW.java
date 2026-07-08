package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import defpackage.x;
import j27.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PLW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLW extends C09AY implements Function1<C642240PHa, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ x.d LLILLJJLI;
    public final /* synthetic */ List<C0DQP> LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ s LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ C054000Hq LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PLW(int i, x.d dVar, List<C0DQP> list, C19EG c19eg, s sVar, Map<String, String> map, C054000Hq c054000Hq) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = dVar;
        this.LLILLL = list;
        this.LLILZ = c19eg;
        this.LLILZIL = sVar;
        this.LLILZLL = map;
        this.LLIZ = c054000Hq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C642240PHa c642240PHa) {
        C642240PHa c642240PHa2 = c642240PHa;
        c642240PHa2.LJII = false;
        c642240PHa2.LJIIIIZZ = false;
        c642240PHa2.LJIIIZ = false;
        final int i = this.LL;
        final x.d dVar = this.LLILLJJLI;
        c642240PHa2.LJIILIIL = new C0PIA() { // from class: X.0PLV
            @Override // X.C0PIA
            public final int LIZ(C0PHX c0phx) {
                return i;
            }

            @Override // X.C0PIA
            public final boolean LIZIZ(C0PHX c0phx, C0PHT c0pht) {
                if (!Intrinsics.LJFF(dVar.getShouldBackToEntry(), Boolean.TRUE)) {
                    return true;
                }
                C0PHW c0phw = c0pht.LJ;
                c0phx.LJ();
                return !Intrinsics.LJFF(c0phw, C13LP.LJJLIIIJL(c0phx.LJIIJJI));
            }
        };
        final List<C0DQP> list = this.LLILLL;
        final C19EG c19eg = this.LLILZ;
        final s sVar = this.LLILZIL;
        final Map<String, String> map = this.LLILZLL;
        final C054000Hq c054000Hq = this.LLIZ;
        c642240PHa2.LJIIL = new C0PJP() { // from class: X.0DY2
            @Override // X.C0PJP
            public final boolean LIZIZ(C0PHX c0phx) {
                List<C0DQP> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<C0DQP> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C0DQN c0dqn = it2.next().LJI;
                        if (c0dqn != null && c0dqn.LJI) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // X.C0PJP
            public final void LIZ(C0PHX c0phx, AwS589S0100000_10 awS589S0100000_10, AwS589S0100000_10 awS589S0100000_102) {
                C0DQP next;
                InterfaceC497601wk lifecycleScope;
                LifecycleCoroutineScope lifecycleScope2;
                LifecycleOwner lifecycleOwnerLJFF;
                LifecycleOwner lifecycleOwnerLJFF2;
                Iterator<C0DQP> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C0DQN c0dqn = next.LJI;
                        if (c0dqn != null && c0dqn.LJI) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0DQP c0dqp = next;
                if (c0dqp != null) {
                    C19EG c19eg2 = c19eg;
                    s sVar2 = sVar;
                    Map<String, String> map2 = map;
                    C054000Hq c054000Hq2 = c054000Hq;
                    if (((Boolean) C0BC6.LIZ.getValue()).booleanValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("use scope:");
                        sbLIZ.append(C1906580ziK.LJ());
                        sbLIZ.append(' ');
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (lifecycleOwnerLJFF2 = abstractC1387200mCcLJ.LJFF()) != null) {
                            lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJFF2);
                        } else {
                            lifecycleScope2 = null;
                        }
                        sbLIZ.append(lifecycleScope2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ2 == null || (lifecycleOwnerLJFF = abstractC1387200mCcLJ2.LJFF()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJFF)) == null) {
                            lifecycleScope = C817503Hh.LL;
                        }
                    } else {
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg2);
                    }
                    C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C0DY1(c0dqp, c0phx, awS589S0100000_10, sVar2, map2, c054000Hq2, awS589S0100000_102, null), 2);
                }
            }
        };
        return Unit.LIZ;
    }
}
