package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0siP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637550siP {
    public final LifecycleOwner LIZ;
    public final InterfaceC1213880hh4 LIZIZ;
    public final C1664690tQB<C1637540siO> LIZJ;
    public final C01GW LIZLLL;
    public final List<String> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    public final C1213870hh3 LIZ() {
        return (C1213870hh3) this.LIZLLL.getValue();
    }

    public final void LIZIZ() {
        ViewGroup viewGroup;
        ViewParent parent = LIZ().getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(LIZ(), viewGroup);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            C786410Ut5.LJLLLLLL(0, childAt);
        }
    }

    public C1637550siP(LifecycleOwner lifecycleOwner, Context context, InterfaceC1213880hh4 interfaceC1213880hh4, C1664680tQA c1664680tQA) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = interfaceC1213880hh4;
        this.LIZJ = c1664680tQA;
        this.LIZLLL = C452501pT.LIZIZ(new AwS420S0200000_19(context, this, 219));
        C1631530sYh.LIZ.getClass();
        this.LJ = C1697810uHb.LJIIJJI(C1631530sYh.LIZIZ, "RecordShoot180s", "RecordBottomStory", "RecordBottomDMCamera");
        this.LJFF = C452501pT.LIZIZ(new AwS569S0100000_25(context, 1153));
        this.LJI = C452501pT.LIZIZ(new AwS569S0100000_25(context, 1152));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0siQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1637540siO) obj).LIZJ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 916));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0siS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1637540siO) obj).LIZIZ;
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 940));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0siT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1637540siO) obj).LJIIIIZZ;
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 941));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0siR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1637540siO) obj).LJFF);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 942));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0siN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1637540siO) obj).LJI);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 913));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0sXN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1637540siO) obj).LJII);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 914));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0siM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1637540siO) obj).LJIIIZ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 915));
    }
}
