package X;

import Y.AObserverS227S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sgy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636660sgy extends AbstractC1636650sgx<Effect> {
    public final C19EG LLIZ;
    public final InterfaceC1624480sNK LLIZLLLIL;
    public final InterfaceC1635560sfC LLJ;
    public final C1636520sgk LLJI;
    public final MutableLiveData<AbstractC1406770miB> LLJIJIL;
    public final RecyclerView.LayoutManager LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final Function0<String> LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public final HashSet<String> LLJJIJI;
    public List<? extends Effect> LLJJIJIIJIL;
    public boolean LLJJIJIL;

    @Override // X.AbstractC1636650sgx
    public final /* bridge */ /* synthetic */ int LLLI(Effect effect) {
        throw null;
    }

    @Override // X.AbstractC1636650sgx
    public final void LLLFZ(C1636260sgK<Effect> c1636260sgK) {
        boolean z = this.LLJI.LJII.LJIILL;
        int i = C1636260sgK.LLILZ;
        c1636260sgK.P5(1.1f, z);
    }

    @Override // X.AbstractC1636650sgx
    public final void LLLJ(C1636690sh1 c1636690sh1) {
        super.LLLJ(c1636690sh1);
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 934), new AwS604S0100000_25(this, 935));
        c1636690sh1.LIZ(AFwS229S0000000_2.get$arr$(874), new AwS604S0100000_25(this, 936));
    }

    public final int LLLJIL(Effect effect) {
        if (this.LLJILJILJ == 3) {
            return this.LLJJIJIIJIL.indexOf(effect);
        }
        return super.LLLI(effect);
    }

    public final void LLLJL(C1629950sW9 c1629950sW9) {
        List<Effect> list = c1629950sW9.LIZIZ;
        if (this.LLJILJILJ == 3) {
            this.LLJJI = "recommend";
            Iterator<Effect> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setSearchType("prop_search");
            }
            this.LLJJIJIIJIL = list;
        } else {
            this.LLJJI = "search";
            Iterator<Effect> it3 = list.iterator();
            while (it3.hasNext()) {
                it3.next().setSearchType("prop_search");
            }
        }
        this.LLILZ = new ArrayList(list);
        notifyDataSetChanged();
        this.LLJJIII = c1629950sW9.LIZJ;
    }

    @Override // X.AbstractC1636650sgx, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        LifecycleOwner lifecycleOwnerLIZ;
        super.onAttachedToRecyclerView(recyclerView);
        Scene sceneLIZ = C0EBE.LIZ(recyclerView);
        if (sceneLIZ == null || (lifecycleOwnerLIZ = C565530MFz.LIZ(sceneLIZ)) == null) {
            lifecycleOwnerLIZ = this.LLIZ;
        }
        this.LLIZLLLIL.LJII().LIZ().observe(lifecycleOwnerLIZ, new AObserverS227S0100000_25(this, 42));
        this.LL.kS0().observe(lifecycleOwnerLIZ, new AObserverS227S0100000_25(this, 43));
        this.LL.Ke0().observe(lifecycleOwnerLIZ, new AObserverS227S0100000_25(this, 44));
    }

    @Override // X.AbstractC1636650sgx
    /* JADX INFO: renamed from: LLLIILIL */
    public final void onBindViewHolder(C1636260sgK<Effect> c1636260sgK, int i) {
        super.onBindViewHolder(c1636260sgK, i);
        Effect effectLLLII = LLLII(i);
        if (effectLLLII != null && i > 0 && !this.LLJJIJI.contains(effectLLLII.getEffectId())) {
            this.LLJJIJI.add(effectLLLII.getEffectId());
            this.LLJIJIL.setValue(new C1422010n6l(i, effectLLLII, this.LLJJI, this.LLJJIII, this.LLJJ.invoke()));
        }
    }

    public C1636660sgy(C19EG c19eg, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi interfaceC1631540sYi, C1636520sgk c1636520sgk, MutableLiveData mutableLiveData, RecyclerView.LayoutManager layoutManager, int i, AwS569S0100000_25 awS569S0100000_25) {
        super(interfaceC1631540sYi, c1636520sgk);
        this.LLIZ = c19eg;
        this.LLIZLLLIL = interfaceC1624480sNK;
        this.LLJ = interfaceC1635560sfC;
        this.LLJI = c1636520sgk;
        this.LLJIJIL = mutableLiveData;
        this.LLJILJIL = layoutManager;
        this.LLJILJILJ = 4;
        this.LLJILLL = i;
        this.LLJJ = awS569S0100000_25;
        this.LLJJI = "search";
        this.LLJJIII = CardStruct.IStatusCode.DEFAULT;
        this.LLJJIJI = new HashSet<>();
        this.LLJJIJIIJIL = new ArrayList();
        this.LLILZIL = -1;
    }
}
