package X;

import Y.AObserverS227S0100000_25;
import Y.AsS51S0100000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderCategoryViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0snH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1640570snH extends AbstractC1640400sn0<ProviderEffect> implements InterfaceC1641070so5<ProviderEffect> {
    public final LifecycleOwner LJJIJIL;
    public final InterfaceC1640680snS<ProviderEffect> LJJIJL;
    public final int LJJIJLIJ;
    public final boolean LJJIL;
    public final boolean LJJIZ;
    public final boolean LJJJ;
    public String LJJJI;
    public int LJJJIL;
    public C1640650snP LJJJJ;
    public final List<Pair<EffectCategoryResponse, List<ProviderEffect>>> LJJJJI;
    public final C01GW LJJJJIZL;
    public final C01GW LJJJJJ;

    public C1640570snH() {
        throw null;
    }

    @Override // X.InterfaceC1641070so5
    public final void Fp() {
    }

    @Override // X.AbstractC1640400sn0
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        if (this.LJJIZ && this.LJJJ) {
            LJJIJ((RecyclerView.ViewHolder) this.LJJJJIZL.getValue());
        }
        InterfaceC1640680snS<ProviderEffect> interfaceC1640680snS = this.LJJIJL;
        if (interfaceC1640680snS != null) {
            interfaceC1640680snS.init();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0snP, X.19ry<androidx.recyclerview.widget.RecyclerView$ViewHolder>] */
    @Override // X.AbstractC1640400sn0
    public final AbstractC21673619ry<RecyclerView.ViewHolder> LJJIFFI() {
        final AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ryLJJIFFI = super.LJJIFFI();
        if (!this.LJJIZ || this.LJJJ) {
            return abstractC21673619ryLJJIFFI;
        }
        ?? r0 = new AbstractC1640250sml(abstractC21673619ryLJJIFFI) { // from class: X.0snP
            @Override // X.AbstractC1640250sml
            public final void LLLII(RecyclerView.ViewHolder viewHolder) {
                this.LLILZ.LJJIJ(viewHolder);
            }

            @Override // X.AbstractC1640250sml
            public final RecyclerView.ViewHolder LLLIIIIL(ViewGroup viewGroup) {
                this.LLILZ.getClass();
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fvm, viewGroup, false);
                viewTd.setTag(R.id.kmv, Boolean.TRUE);
                TextView textView = (TextView) viewTd.findViewById(R.id.w5z);
                Integer numLIZJ = C1231520i9W.LIZJ(R.attr.a1h, textView.getContext());
                if (numLIZJ != null) {
                    textView.setTextColor(numLIZJ.intValue());
                }
                return new C1640690snT(viewTd, textView, null);
            }
        };
        this.LJJJJ = r0;
        return r0;
    }

    @Override // X.AbstractC1640400sn0, X.InterfaceC1640870snl
    public final void vw() {
        MutableLiveData mutableLiveDataFf;
        super.vw();
        InterfaceC1640680snS<ProviderEffect> interfaceC1640680snS = this.LJJIJL;
        if (interfaceC1640680snS != null && (mutableLiveDataFf = interfaceC1640680snS.Ff()) != null) {
            mutableLiveDataFf.removeObservers(this.LJJIJIL);
        }
        C1231520i9W.LIZLLL();
    }

    @Override // X.InterfaceC1641070so5
    public final String Ff() {
        return this.LJJJI;
    }

    @Override // X.AbstractC1640400sn0
    public final LifecycleOwner LJIIIZ() {
        return this.LJJIJIL;
    }

    @Override // X.AbstractC1640400sn0
    public final int LJIIJ() {
        return this.LJJIJLIJ;
    }

    public static final C1640690snT LJJIJIIJI(View view) {
        TextView textView = (TextView) view.findViewById(R.id.w5z);
        Integer numLIZJ = C1231520i9W.LIZJ(R.attr.a1h, textView.getContext());
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        C1640690snT c1640690snT = new C1640690snT(view, textView, null);
        C786410Ut5.LJLLLLLL(0, c1640690snT.itemView);
        return c1640690snT;
    }

    @Override // X.InterfaceC1641070so5
    public final void Ep(String str) {
        InterfaceC1640680snS<ProviderEffect> interfaceC1640680snS = this.LJJIJL;
        if (interfaceC1640680snS != null) {
            interfaceC1640680snS.Ep(str);
        }
    }

    @Override // X.AbstractC1640400sn0
    public final void LJIILIIL(LifecycleOwner lifecycleOwner) {
        super.LJIILIIL(lifecycleOwner);
        InterfaceC1640680snS<ProviderEffect> interfaceC1640680snS = this.LJJIJL;
        if (interfaceC1640680snS != null) {
            interfaceC1640680snS.Ff().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 110));
            C228600uS.LIZ(interfaceC1640680snS.getSubtitle()).observe(lifecycleOwner, new AObserverS227S0100000_25(this, 111));
            boolean z = interfaceC1640680snS instanceof InfoStickerProviderCategoryViewModel;
        }
        LJIIJJI().addOnScrollListener(new AsS51S0100000_25(this, 5));
    }

    @Override // X.AbstractC1640400sn0
    public final int LJIILLIIL(int i) {
        C1640650snP c1640650snP;
        if (this.LJJIZ && !this.LJJJ && (c1640650snP = this.LJJJJ) != null) {
            i -= c1640650snP.LLLI();
        }
        return super.LJIILLIIL(i);
    }

    @Override // X.AbstractC1640400sn0
    public final View LJJII(ViewGroup viewGroup) {
        if (this.LJJIZ && this.LJJJ) {
            return C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.fv4, viewGroup, this.LJJIL);
        }
        return super.LJJII(viewGroup);
    }

    @Override // X.AbstractC1640400sn0
    public final C1636150sg9 LJJIIJZLJL(View view) {
        C1636150sg9 c1636150sg9LJJIIJZLJL = super.LJJIIJZLJL(view);
        c1636150sg9LJJIIJZLJL.LLILLJJLI.put(EnumC1641470soj.EMPTY, AFwS252S0000000_16.get$arr$(545));
        return c1636150sg9LJJIIJZLJL;
    }

    @Override // X.AbstractC1640400sn0
    public final RecyclerView LJJIIZ(View view) {
        RecyclerView recyclerViewLJJIIZ = super.LJJIIZ(view);
        if (this.LJJIJLIJ >= 4) {
            recyclerViewLJJIIZ.setFadingEdgeLength((int) C11VU.LIZIZ(8.0f, view.getContext()));
            recyclerViewLJJIIZ.setVerticalFadingEdgeEnabled(true);
            int iLIZIZ = (int) C11VU.LIZIZ(3.0f, view.getContext());
            recyclerViewLJJIIZ.setPadding(iLIZIZ, 0, iLIZIZ, 0);
        }
        return recyclerViewLJJIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJ(RecyclerView.ViewHolder viewHolder) {
        C1640690snT c1640690snT;
        TextView textView;
        MutableLiveData subtitle;
        InterfaceC1640680snS<ProviderEffect> interfaceC1640680snS;
        MutableLiveData mutableLiveDataFf;
        String str;
        String str2 = null;
        if ((viewHolder instanceof C1640690snT) && (c1640690snT = (C1640690snT) viewHolder) != null && (textView = c1640690snT.LL) != null) {
            C786410Ut5.LJLLLLLL(0, viewHolder.itemView);
            if ((!((ArrayList) this.LJJJJI).isEmpty()) && ((interfaceC1640680snS = this.LJJIJL) == null || (mutableLiveDataFf = interfaceC1640680snS.Ff()) == null || (str = (String) mutableLiveDataFf.getValue()) == null || str.length() == 0)) {
                textView.setText(((EffectCategoryResponse) ((Pair) C13LP.LJJJJZI(this.LJJJJI)).getFirst()).getName());
                return;
            }
            InterfaceC1640680snS<ProviderEffect> interfaceC1640680snS2 = this.LJJIJL;
            if (interfaceC1640680snS2 != null && (subtitle = interfaceC1640680snS2.getSubtitle()) != null) {
                str2 = (String) subtitle.getValue();
            }
            textView.setText(str2);
        }
    }

    public final void LJJIJIIJIL(int i) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        AbstractC1637470siH abstractC1637470siH;
        boolean z;
        RecyclerView.LayoutManager layoutManager = LJIIJJI().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = LJIIJJI().findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C1638210sjT) && (abstractC1637470siH = (AbstractC1637470siH) viewHolderFindViewHolderForAdapterPosition) != null) {
                C1324800kZy imageView = abstractC1637470siH.LL.getImageView();
                if ((imageView instanceof C1324790kZx) && imageView != null) {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    imageView.LIZJ(z);
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC1640400sn0
    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, AwS674S0100000_25 awS674S0100000_25) {
        Pair<FrameLayout, C1662850tND> pairLJ;
        if (C300240Bpm.LIZ()) {
            Pair<FrameLayout, C1662850tND> pairLJI = C1640600snK.LJI(viewGroup.getContext());
            return new C1638210sjT(pairLJI.getFirst(), pairLJI.getSecond(), awS674S0100000_25);
        }
        if (this.LJJIJLIJ >= 4) {
            pairLJ = C1640600snK.LJFF(viewGroup.getContext());
        } else {
            pairLJ = C1640600snK.LJ(viewGroup.getContext());
        }
        return new C1638210sjT(pairLJ.getFirst(), pairLJ.getSecond(), awS674S0100000_25);
    }

    @Override // X.AbstractC1640400sn0
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, int i, ProviderEffect providerEffect, EnumC1641420soe enumC1641420soe, Integer num) {
        AbstractC1637470siH abstractC1637470siH;
        boolean z;
        ProviderEffect providerEffect2 = providerEffect;
        if ((viewHolder instanceof C1638210sjT) && (abstractC1637470siH = (AbstractC1637470siH) viewHolder) != null) {
            if (C1635160seY.LJ(providerEffect2)) {
                C1231520i9W.LIZ((AbstractC1637470siH) viewHolder);
            } else {
                C1231520i9W.LIZIZ((AbstractC1637470siH) viewHolder);
            }
            int i2 = this.LJJJIL;
            abstractC1637470siH.I5(i, enumC1641420soe, num, providerEffect2);
            C1324800kZy imageView = abstractC1637470siH.LL.getImageView();
            if ((imageView instanceof C1324790kZx) && imageView != null) {
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                imageView.LIZJ(z);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1640570snH(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640680snS interfaceC1640680snS, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, Function1 function1) {
        boolean z2 = true;
        super(context, lifecycleOwner, interfaceC1640680snS, interfaceC1640420sn2, viewGroup, i, z2, z2, z2, false, function1, 512);
        this.LJJIJIL = lifecycleOwner;
        this.LJJIJL = interfaceC1640680snS;
        this.LJJIJLIJ = i;
        this.LJJIL = true;
        this.LJJIZ = true;
        this.LJJJ = z;
        this.LJJJJI = new ArrayList();
        this.LJJJJIZL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 941));
        this.LJJJJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 939));
    }
}
