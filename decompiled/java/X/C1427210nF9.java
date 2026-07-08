package X;

import Y.ARunnableS28S0201000_22;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nF9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427210nF9 extends AbstractC21673619ry<C113H> implements InterfaceC19347710mh {
    public final Scene LL;
    public final Context LLILLJJLI;
    public final RecyclerView LLILLL;
    public final C113G LLILZ;
    public final Function1<String, Boolean> LLILZIL;
    public C1427070nEv LLILZLL;
    public AwS636S0100000_22 LLIZ;
    public Function0<Unit> LLJ;
    public String LLJILJILJ;
    public boolean LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 104));
    public final C01GW LLJI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS566S0100000_22(this, 86));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(44));
    public List<C1427080nEw> LLJILJIL = new ArrayList();
    public final HashSet<String> LLJILLL = new HashSet<>();
    public final C1427220nFA LLJJI = new C1427220nFA(this);

    public final void LLLI() {
        C1427080nEw next;
        String effectId;
        String str = this.LLJILJILJ;
        int i = 0;
        if (str == null || str.length() == 0) {
            return;
        }
        Iterator<C1427080nEw> it2 = this.LLJILJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.key, this.LLJILJILJ)) {
                    break;
                }
            }
        }
        C1427080nEw c1427080nEw = next;
        Effect effect = c1427080nEw != null ? c1427080nEw.LIZJ : null;
        Iterator<C1427080nEw> it3 = this.LLJILJIL.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.LJFF(it3.next().LIZ.key, this.LLJILJILJ)) {
                break;
            } else {
                i++;
            }
        }
        C366400EYc.LIZ.getClass();
        C379390Eu9 c379390Eu9 = C366400EYc.LIZIZ;
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        if (!c379390Eu9.LIZ(effectId)) {
            this.LLJILJILJ = null;
            notifyItemChanged(i);
            return;
        }
        ArrayList arrayList = new ArrayList(this.LLJILJIL);
        C364520EQw.LIZ(arrayList, new AwS601S0100000_22(this, 72));
        this.LLJILJILJ = null;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C1427200nF8(this.LLJILJIL, arrayList), true);
        this.LLJILJIL = arrayList;
        c21341918fZLIZ.LIZJ(this);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJIL.size();
    }

    @Override // X.InterfaceC19347710mh
    public final void Iz(Effect effect) {
        if (effect != null) {
            Iterator<C1427080nEw> it2 = this.LLJILJIL.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZJ.getResourceId(), effect.getResourceId())) {
                    if (i >= 0) {
                        LLLFZ(i, 32);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // X.InterfaceC19347710mh
    public final void Vs(Effect effect) {
        C1427080nEw c1427080nEw;
        EffectModel effectModel;
        Iterator<C1427080nEw> it2 = this.LLJILJIL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().LIZJ.getResourceId(), effect.getResourceId())) {
                if (i >= 0) {
                    LLLFZ(i, 16);
                    C1427070nEv c1427070nEv = this.LLILZLL;
                    if (c1427070nEv != null && c1427070nEv.LJIJ(effect.getEffectId()) && (c1427080nEw = (C1427080nEw) C13LP.LJJJLZIJ(i, this.LLJILJIL)) != null && (effectModel = c1427080nEw.LIZ) != null && Intrinsics.LJFF(effect.getEffectId(), effectModel.key)) {
                        this.LLJJI.LJII(5, i, effectModel);
                    }
                }
            } else {
                i++;
            }
        }
        C1638230sjV.LIZ.LJI(effect, "editEffect_icon");
    }

    @Override // X.InterfaceC19347710mh
    public final void g(Effect effect) {
        Iterator<C1427080nEw> it2 = this.LLJILJIL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LIZJ.getResourceId(), effect.getResourceId())) {
                if (i >= 0) {
                    LLLFZ(i, 8);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LLLFZ(int i, int i2) {
        Integer numValueOf;
        C1427080nEw c1427080nEw = (C1427080nEw) C13LP.LJJJLZIJ(i, this.LLJILJIL);
        if (c1427080nEw != null && (numValueOf = Integer.valueOf(c1427080nEw.LIZIZ)) != null && numValueOf.intValue() != i2) {
            c1427080nEw.LIZIZ = i2;
            notifyItemChanged(i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C113H c113h = (C113H) viewHolder;
        C1427080nEw c1427080nEw = (C1427080nEw) C13LP.LJJJLZIJ(i, this.LLJILJIL);
        if (c1427080nEw != null) {
            c113h.I5(c1427080nEw.LIZIZ, c1427080nEw.LIZ);
            if (!this.LLJILLL.contains(c1427080nEw.LIZ.key)) {
                RecyclerView recyclerView = this.LLILLL;
                if (recyclerView != null) {
                    HandlerHook.viewPost(recyclerView, new ARunnableS28S0201000_22(this, c1427080nEw, i, 0));
                }
                this.LLJILLL.add(c1427080nEw.LIZ.key);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r12, int r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1427210nF9.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    @Override // X.InterfaceC19347710mh
    public final void zf(Effect effect, int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        Iterator<C1427080nEw> it2 = this.LLJILJIL.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LIZJ.getResourceId(), effect.getResourceId())) {
                if (i2 >= 0) {
                    LLLFZ(i2, 9);
                    RecyclerView recyclerView = this.LLILLL;
                    if (recyclerView != null) {
                        viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2);
                    } else {
                        viewHolderFindViewHolderForAdapterPosition = null;
                    }
                    if (viewHolderFindViewHolderForAdapterPosition instanceof C113H) {
                        ((C113H) viewHolderFindViewHolderForAdapterPosition).S5(i, i2);
                        return;
                    }
                    return;
                }
                return;
            }
            i2++;
        }
    }

    public C1427210nF9(C1427030nEr c1427030nEr, Context context, RecyclerView recyclerView, C113G c113g, Function1 function1) {
        this.LL = c1427030nEr;
        this.LLILLJJLI = context;
        this.LLILLL = recyclerView;
        this.LLILZ = c113g;
        this.LLILZIL = function1;
    }
}
