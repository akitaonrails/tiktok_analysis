package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0snG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1640560snG extends AbstractC1640400sn0<Effect> {
    public final LifecycleOwner LJJIJIL;
    public final InterfaceC1640330smt<Effect> LJJIJL;
    public final int LJJIJLIJ;

    @Override // X.AbstractC1640400sn0
    public final Function0<Integer> LJI() {
        return AFwS199S0000000_12.get$arr$(475);
    }

    @Override // X.AbstractC1640400sn0, X.InterfaceC1640870snl
    public final void vw() {
        super.vw();
        C1231520i9W.LIZLLL();
    }

    @Override // X.AbstractC1640400sn0
    public LifecycleOwner LJIIIZ() {
        return this.LJJIJIL;
    }

    @Override // X.AbstractC1640400sn0
    public int LJIIJ() {
        return this.LJJIJLIJ;
    }

    @Override // X.AbstractC1640400sn0
    public RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, AwS674S0100000_25 awS674S0100000_25) {
        Pair<FrameLayout, C1662850tND> pairLJI;
        if (C300240Bpm.LIZ()) {
            int iLJIIJ = LJIIJ();
            if (iLJIIJ != 3) {
                if (iLJIIJ != 5) {
                    pairLJI = C1640600snK.LIZLLL(viewGroup.getContext());
                } else {
                    Context context = viewGroup.getContext();
                    float f = C1640600snK.LIZIZ;
                    float f2 = C1640600snK.LIZIZ;
                    pairLJI = C1640600snK.LIZ(context, f, f2, (int) C11VU.LIZIZ(f2 + 20.0f, context), (int) C11VU.LIZIZ(C1640600snK.LIZIZ + 20.0f, context), Float.valueOf(10.0f), Float.valueOf(10.0f), Float.valueOf(10.0f), Float.valueOf(10.0f));
                }
            } else {
                pairLJI = C1640600snK.LJI(viewGroup.getContext());
            }
            return new C1638170sjP(pairLJI.getFirst(), pairLJI.getSecond(), awS674S0100000_25, (C1656660tDE) null, (Function0) null, 56);
        }
        Pair<FrameLayout, C1662850tND> pairLIZLLL = C1640600snK.LIZLLL(viewGroup.getContext());
        return new C1638170sjP(pairLIZLLL.getFirst(), pairLIZLLL.getSecond(), awS674S0100000_25, (C1656660tDE) null, (Function0) null, 56);
    }

    @Override // X.AbstractC1640400sn0
    /* JADX INFO: renamed from: LJJIJ, reason: merged with bridge method [inline-methods] */
    public void LIZJ(RecyclerView.ViewHolder viewHolder, int i, Effect effect, EnumC1641420soe enumC1641420soe, Integer num) {
        AbstractC1637470siH abstractC1637470siH;
        if ((viewHolder instanceof C1638170sjP) && (abstractC1637470siH = (AbstractC1637470siH) viewHolder) != null) {
            if (!C1635160seY.LIZIZ(effect) && (C1635160seY.LIZLLL(effect) || C1635160seY.LIZ(effect))) {
                C1231520i9W.LIZ((AbstractC1637470siH) viewHolder);
            } else {
                C1231520i9W.LIZIZ((AbstractC1637470siH) viewHolder);
            }
            abstractC1637470siH.I5(i, enumC1641420soe, num, effect);
        }
    }

    public /* synthetic */ C1640560snG(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt interfaceC1640330smt, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, Function1 function1) {
        this(context, lifecycleOwner, interfaceC1640330smt, interfaceC1640420sn2, viewGroup, i, false, true, true, z, function1);
    }

    public C1640560snG(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt<Effect> interfaceC1640330smt, InterfaceC1640420sn2<Effect> interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, boolean z4, Function1<? super C1640060smS, Unit> function1) {
        super(context, lifecycleOwner, interfaceC1640330smt, interfaceC1640420sn2, viewGroup, i, z, z2, z3, z4, function1);
        this.LJJIJIL = lifecycleOwner;
        this.LJJIJL = interfaceC1640330smt;
        this.LJJIJLIJ = i;
    }
}
