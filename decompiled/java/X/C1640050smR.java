package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS131S0101000_25;

/* JADX INFO: renamed from: X.0smR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640050smR extends AbstractC1640090smV<C1634100scq<Effect, EnumC1641420soe, Integer>> {
    public final /* synthetic */ C1640500snA LLILLJJLI;

    public C1640050smR(C1640500snA c1640500snA) {
        this.LLILLJJLI = c1640500snA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1640500snA c1640500snA = this.LLILLJJLI;
        Effect effect = (Effect) ((C1634100scq) ListProtector.get(this.LL, i)).LIZ;
        AwS131S0101000_25 awS131S0101000_25 = new AwS131S0101000_25(this, i, 10);
        c1640500snA.getClass();
        if (C1462570oAB.LJIIJ(effect)) {
            return -2147483645;
        }
        return ((Number) awS131S0101000_25.invoke(Integer.valueOf(i))).intValue();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1634100scq<Effect, EnumC1641420soe, Integer> c1634100scqLJJLIIIJJI = LJJLIIIJJI(i);
        this.LLILLJJLI.LIZJ(viewHolder, i, c1634100scqLJJLIIIJJI.LIZ, c1634100scqLJJLIIIJJI.LIZIZ, c1634100scqLJJLIIIJJI.LIZJ);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1640500snA c1640500snA = this.LLILLJJLI;
        RecyclerView.ViewHolder viewHolderLJFF = c1640500snA.LJFF(viewGroup, i, c1640500snA.LJJIIZ);
        Function1<? super RecyclerView.ViewHolder, Unit> function1 = this.LLILLJJLI.LJIIJ.LIZJ;
        if (function1 != null) {
            function1.invoke(viewHolderLJFF);
        }
        if (viewHolderLJFF != null) {
            try {
                View view = viewHolderLJFF.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderLJFF.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLJFF.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLJFF.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLJFF.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLJFF.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLJFF.getClass().getName();
        return viewHolderLJFF;
    }
}
