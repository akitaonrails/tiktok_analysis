package X;

import Y.AObserverS128S0300000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: renamed from: X.0lif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1368630lif<T> extends AbstractC1388700mF2<AbstractC1368540liW<T>, T> {
    public final int LLILLJJLI;
    public final AwS670S0100000_21 LLILLL;
    public View LLILZ;
    public boolean LLILZIL;

    public AbstractC1368630lif() {
        super(null);
        C844470XAv.LIZ.getClass();
        this.LLILLJJLI = (int) C12ES.LIZJ(40.0f, C844470XAv.LIZ());
        this.LLILLL = new AwS670S0100000_21(this, 1);
    }

    public InterfaceC1631620sYq<Integer, Integer, View, Unit> LLLIILIL() {
        return null;
    }

    public abstract InterfaceC1363370laB LLLIL();

    public abstract SharePackage LLLILZ();

    public abstract AbstractC1368540liW LLLJ(ViewGroup viewGroup);

    public abstract boolean LLLJL(T t);

    @Override // X.AbstractC1388700mF2
    public final int LLLI() {
        return (this.LLILZ == null || !this.LLILZIL) ? 0 : 1;
    }

    public final void LLLILZLLLI() {
        boolean z = this.LLILZIL;
        this.LLILZIL = false;
        if (this.LLILZ == null || !z) {
            return;
        }
        notifyItemRemoved(0);
    }

    public final void LLLJIL() {
        boolean z = !this.LLILZIL;
        this.LLILZIL = true;
        if (this.LLILZ == null || !z) {
            return;
        }
        notifyItemInserted(0);
    }

    @Override // X.AbstractC438050HFr
    public int getBasicItemViewType(int i) {
        if (i < LLLI()) {
            return Integer.MAX_VALUE;
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0ZE7 activityStatusParams;
        if (i < LLLI()) {
            return;
        }
        AbstractC1368540liW abstractC1368540liW = (AbstractC1368540liW) viewHolder;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractC1368540liW.itemView.getLayoutParams();
        if (i == getItemCount() - 1) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, this.LLILLJJLI);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 0);
        }
        T tLLLII = LLLII(i);
        if (tLLLII != null) {
            T tLLLII2 = LLLII(i - 1);
            int iLLLI = i - LLLI();
            InterfaceC1363370laB interfaceC1363370laBLLLIL = LLLIL();
            if (interfaceC1363370laBLLLIL != null) {
                activityStatusParams = interfaceC1363370laBLLLIL.getActivityStatusParams();
            } else {
                activityStatusParams = null;
            }
            abstractC1368540liW.I5(tLLLII, tLLLII2, iLLLI, activityStatusParams);
            abstractC1368540liW.LLJI = LLLJL(tLLLII);
            abstractC1368540liW.N5();
            abstractC1368540liW.LL = this.LLILLL;
            if (viewHolder instanceof C1368410liJ) {
                ((C1368410liJ) viewHolder).LLJLILLLLZIIL = new AObserverS128S0300000_21(viewHolder, this, tLLLII, 0);
            }
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            View view = this.LLILZ;
            if (view != null && view.getParent() != null) {
                new Exception("BaseSelectListAdapter Still get a un-detached header");
                final Space space = new Space(viewGroup.getContext());
                return new AbstractC1368540liW<ITEM>(space) { // from class: X.0liV
                    @Override // X.AbstractC1368540liW
                    public final void I5(ITEM item, ITEM item2, int i2, C0ZE7 c0ze7) {
                    }
                };
            }
            final View view2 = this.LLILZ;
            if (view2 != null) {
                return new AbstractC1368540liW<ITEM>(view2) { // from class: X.0liV
                    @Override // X.AbstractC1368540liW
                    public final void I5(ITEM item, ITEM item2, int i2, C0ZE7 c0ze7) {
                    }
                };
            }
            final Space space2 = new Space(viewGroup.getContext());
            return new AbstractC1368540liW<ITEM>(space2) { // from class: X.0liV
                @Override // X.AbstractC1368540liW
                public final void I5(ITEM item, ITEM item2, int i2, C0ZE7 c0ze7) {
                }
            };
        }
        return LLLJ(viewGroup);
    }
}
