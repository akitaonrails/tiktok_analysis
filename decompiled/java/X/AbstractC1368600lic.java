package X;

import Y.ACListenerS155S0100000_21;
import Y.AObserverS128S0300000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1368600lic<T> extends AbstractC1388700mF2<AbstractC1368500liS<T>, T> {
    public final int LLILLJJLI;
    public final AwS670S0100000_21 LLILLL;
    public View LLILZ;
    public boolean LLILZIL;

    public AbstractC1368600lic() {
        super(null);
        C0I0B.LJFF.LIZJ();
        this.LLILLJJLI = (int) C12ES.LIZJ(40.0f, C894660Z7w.LIZ());
        this.LLILLL = new AwS670S0100000_21(this, 16);
    }

    @Override // X.AbstractC1388700mF2
    public final int LLLI() {
        return (this.LLILZ == null || !this.LLILZIL) ? 0 : 1;
    }

    public final void LLLIILIL() {
        boolean z = this.LLILZIL;
        this.LLILZIL = false;
        if (this.LLILZ == null || !z) {
            return;
        }
        notifyItemRemoved(0);
    }

    public final void LLLIL() {
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
        AbstractC1368500liS abstractC1368500liS = (AbstractC1368500liS) viewHolder;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractC1368500liS.itemView.getLayoutParams();
        if (i == getItemCount() - 1) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, this.LLILLJJLI);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 0);
        }
        T tLLLII = LLLII(i);
        if (tLLLII != null) {
            T tLLLII2 = LLLII(i - 1);
            int iLLLI = i - LLLI();
            C1368580lia c1368580lia = (C1368580lia) this;
            InterfaceC1363370laB interfaceC1363370laB = c1368580lia.LLJI;
            if (interfaceC1363370laB != null) {
                activityStatusParams = interfaceC1363370laB.getActivityStatusParams();
            } else {
                activityStatusParams = null;
            }
            abstractC1368500liS.I5(tLLLII, tLLLII2, iLLLI, activityStatusParams);
            abstractC1368500liS.LLJ = c1368580lia.LLLJ((IMContact) tLLLII);
            abstractC1368500liS.N5();
            abstractC1368500liS.LL = this.LLILLL;
            if (viewHolder instanceof C1368440liM) {
                ((C1368440liM) viewHolder).LLJJLIIIJLLLLLLLZ = new AObserverS128S0300000_21(viewHolder, this, tLLLII, 1);
            }
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(final ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            View view = this.LLILZ;
            if (view != null && view.getParent() != null) {
                new Exception("BaseSelectListAdapter Still get a un-detached header");
                final Space space = new Space(viewGroup.getContext());
                return new AbstractC1368500liS<ITEM>(space) { // from class: X.0liU
                    @Override // X.AbstractC1368500liS
                    public final void I5(ITEM item, ITEM item2, int i2, C0ZE7 c0ze7) {
                    }
                };
            }
            final View view2 = this.LLILZ;
            return new AbstractC1368500liS<ITEM>(view2) { // from class: X.0liU
                @Override // X.AbstractC1368500liS
                public final void I5(ITEM item, ITEM item2, int i2, C0ZE7 c0ze7) {
                }
            };
        }
        C1368580lia c1368580lia = (C1368580lia) this;
        if (i == 2) {
            final ShareDialogViewModel shareDialogViewModel = c1368580lia.LLIZ;
            return new AbstractC1368500liS<IMContact>(viewGroup, shareDialogViewModel) { // from class: X.0liZ
                {
                    super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cos, viewGroup, false));
                    C786410Ut5.I7(new ACListenerS155S0100000_21(shareDialogViewModel, 158), this.itemView);
                }

                @Override // X.AbstractC1368500liS
                public final /* bridge */ /* synthetic */ void I5(IMContact iMContact, IMContact iMContact2, int i2, C0ZE7 c0ze7) {
                }
            };
        }
        InterfaceC1369040ljK interfaceC1369040ljK = c1368580lia.LLJILJILJ;
        if (Intrinsics.LJFF(interfaceC1369040ljK, C1369050ljL.LIZ)) {
            return new C1368440liM(viewGroup, c1368580lia.LLIZ, c1368580lia.LLILZLL, c1368580lia.LLIZLLLIL, c1368580lia.LLJ, c1368580lia.LLJILJIL, c1368580lia.LLJILLL);
        }
        if (interfaceC1369040ljK instanceof C1366330lex) {
            ShareDialogViewModel shareDialogViewModel2 = c1368580lia.LLIZ;
            SharePackage sharePackage = c1368580lia.LLILZLL;
            C1366330lex c1366330lex = (C1366330lex) c1368580lia.LLJILJILJ;
            return new C1368450liN(viewGroup, shareDialogViewModel2, sharePackage, c1366330lex.LIZ, c1366330lex.LIZIZ, c1368580lia.LLJILJIL);
        }
        throw new C1954807lC();
    }
}
