package X;

import Y.ACListenerS53S0201000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS167S0101000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11gX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19564311gX<VM extends RecyclerView.ViewHolder> {
    public final View LIZ;
    public final int LIZIZ;
    public final C19563711gR LIZJ;
    public final Function0<C0FGS> LIZLLL;
    public final InterfaceC1631620sYq<ViewGroup, Integer, Integer, VM> LJ;
    public final InterfaceC1631620sYq<VM, Integer, C0FGT, Unit> LJFF;
    public final InterfaceC1631620sYq<Integer, Integer, C0FGT, Unit> LJI;
    public final RecyclerView LJII;
    public final C01GW LJIIIIZZ;
    public final C19564411gY LJIIIZ;
    public final C0DXP LJIIJ;

    public final GridLayoutManager LIZ() {
        return (GridLayoutManager) this.LJIIIIZZ.getValue();
    }

    public final void LIZIZ() {
        ArrayList arrayList;
        List<C0FGT> list;
        try {
            C0FGS c0fgsInvoke = this.LIZLLL.invoke();
            if (c0fgsInvoke == null || (list = c0fgsInvoke.LIZ) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C0FGT c0fgt : list) {
                    Effect effect = c0fgt.LIZ;
                    String str = c0fgt.LIZIZ;
                    boolean z = c0fgt.LIZJ;
                    EnumC1641420soe enumC1641420soe = c0fgt.LIZLLL;
                    int i = c0fgt.LJ;
                    Effect effect2 = c0fgt.LJFF;
                    c0fgt.getClass();
                    arrayList.add(new C0FGT(effect, str, z, enumC1641420soe, i, effect2));
                }
            }
            LLLI(arrayList);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZJ(int i) {
        List<C0FGT> list;
        C0FGS c0fgsInvoke = this.LIZLLL.invoke();
        if (c0fgsInvoke != null && (list = c0fgsInvoke.LIZ) != null) {
            Iterator<C0FGT> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().LIZJ) {
                    if (i2 <= 0) {
                        break;
                    }
                } else {
                    i2++;
                }
            }
            i2 = 0;
            int i3 = i2 + (LIZ().LLILLJJLI * i);
            int itemCount = LIZ().getItemCount();
            if (i3 < 0) {
                LIZ().scrollToPositionWithOffset(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            } else if (i3 >= itemCount) {
                LIZ().scrollToPositionWithOffset(itemCount - 1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            } else {
                LIZ().scrollToPositionWithOffset(i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.11gW] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.11gY, X.19ry] */
    public C19564311gX(View view, int i, C19563711gR c19563711gR, AwS167S0101000_29 awS167S0101000_29, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq interfaceC1631620sYq2, InterfaceC1631620sYq interfaceC1631620sYq3, RecyclerView.RecycledViewPool recycledViewPool) {
        RecyclerView recyclerView;
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = c19563711gR;
        this.LIZLLL = awS167S0101000_29;
        this.LJ = interfaceC1631620sYq;
        this.LJFF = interfaceC1631620sYq2;
        this.LJI = interfaceC1631620sYq3;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.t11);
        if (recyclerView2 != null) {
            recyclerView2.setRecycledViewPool(recycledViewPool);
            recyclerView2.setHasFixedSize(true);
            recyclerView2.setItemAnimator(null);
            recyclerView = recyclerView2;
        } else {
            recyclerView = 0;
        }
        this.LJII = recyclerView;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, (C19564311gX<RecyclerView.ViewHolder>) 1127));
        final ?? r0 = new AbstractC339510DSr<C0FGT>() { // from class: X.11gW
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C0FGT c0fgt, C0FGT c0fgt2) {
                return Intrinsics.LJFF(c0fgt, c0fgt2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C0FGT c0fgt, C0FGT c0fgt2) {
                String effectId;
                C0FGT c0fgt3 = c0fgt2;
                Effect effect = c0fgt.LIZ;
                String effectId2 = null;
                if (effect != null) {
                    effectId = effect.getEffectId();
                } else {
                    effectId = null;
                }
                Effect effect2 = c0fgt3.LIZ;
                if (effect2 != null) {
                    effectId2 = effect2.getEffectId();
                }
                return Intrinsics.LJFF(effectId, effectId2);
            }
        };
        ?? r1 = new AbstractC2172971A2l<C0FGT, RecyclerView.ViewHolder>(this, r0) { // from class: X.11gY
            public final /* synthetic */ C19564311gX<RecyclerView.ViewHolder> LLILLJJLI;

            {
                this.LLILLJJLI = this;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                List<C0FGT> list;
                C0FGT c0fgt;
                C0FGS c0fgsInvoke = this.LLILLJJLI.LIZLLL.invoke();
                if (c0fgsInvoke != null && (list = c0fgsInvoke.LIZ) != null && (c0fgt = (C0FGT) C13LP.LJJJLZIJ(i2, list)) != null) {
                    this.LLILLJJLI.LJFF.invoke((VM) viewHolder, Integer.valueOf(i2), c0fgt);
                    C786410Ut5.I7(new ACListenerS53S0201000_29(this.LLILLJJLI, i2, c0fgt, 11), viewHolder.itemView);
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                Integer numValueOf;
                InterfaceC1631620sYq<ViewGroup, Integer, Integer, VM> interfaceC1631620sYq4 = this.LLILLJJLI.LJ;
                Integer numValueOf2 = Integer.valueOf(i2);
                RecyclerView recyclerView3 = this.LLILLJJLI.LJII;
                if (recyclerView3 != null) {
                    numValueOf = Integer.valueOf(recyclerView3.getHeight());
                } else {
                    numValueOf = null;
                }
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) interfaceC1631620sYq4.invoke(viewGroup, numValueOf2, numValueOf);
                if (viewHolder != null) {
                    try {
                        View view2 = viewHolder.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolder.itemView.getParent() != null) {
                        boolean zLIZ = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (zLIZ) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(viewHolder.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i2);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = viewHolder.getClass().getName();
                return viewHolder;
            }
        };
        this.LJIIIZ = r1;
        this.LJIIJ = new C0DXP(recyclerView, i, new AwS608S0100000_29(this, (C19564311gX<RecyclerView.ViewHolder>) 877), new AwS608S0100000_29(this, (C19564311gX<RecyclerView.ViewHolder>) 878), 4);
        if (recyclerView != 0) {
            recyclerView.setLayoutManager(LIZ());
            recyclerView.setAdapter(r1);
        }
    }
}
