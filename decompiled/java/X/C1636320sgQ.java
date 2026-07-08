package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.services.EffectPrefetchPreloadConfig;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.adapter.LoadingSkeletonEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1636320sgQ extends AbstractC1636650sgx<Effect> {
    public final InterfaceC1624480sNK LLIZ;
    public final InterfaceC1635560sfC LLIZLLLIL;
    public final C1636520sgk LLJ;
    public final InterfaceC1625970sPj LLJI;
    public final InterfaceC1636390sgX LLJIJIL;
    public final C1631250sYF LLJILJIL;
    public final EffectCategoryModel LLJILJILJ;
    public final int LLJILLL;
    public final boolean LLJJ;
    public C1636080sg2 LLJJI;
    public RecyclerView.LayoutManager LLJJIII;
    public int LLJJIJI;
    public final C1636210sgF LLJJIJIIJIL;
    public final HashMap<String, Integer> LLJJIJIL;

    @Override // X.AbstractC1636650sgx
    public void LLLFZ(C1636260sgK<Effect> c1636260sgK) {
        C1641120soA c1641120soA = this.LLJ.LJII;
        c1636260sgK.P5(c1641120soA.LJIILJJIL, c1641120soA.LJIILL);
    }

    @Override // X.AbstractC1636650sgx
    public void LLLJ(C1636690sh1 c1636690sh1) {
        super.LLLJ(c1636690sh1);
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 843), new AwS604S0100000_25(this, 844));
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 846), new AwS604S0100000_25(this, 848));
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 850), new AwS604S0100000_25(this, 851));
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 852), new AwS604S0100000_25(this, 853));
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 854), new AwS604S0100000_25(this, 842));
        LLLLIIIILLL(c1636690sh1);
    }

    public final void LLLJL(C1636260sgK<Effect> c1636260sgK) {
        if (c1636260sgK instanceof ViewOnClickListenerC1636720sh4) {
            ViewOnClickListenerC1636720sh4 viewOnClickListenerC1636720sh4 = (ViewOnClickListenerC1636720sh4) c1636260sgK;
            InterfaceC1631540sYi interfaceC1631540sYi = viewOnClickListenerC1636720sh4.LLIZLLLIL;
            InterfaceC1631540sYi interfaceC1631540sYi2 = this.LL;
            if (interfaceC1631540sYi != interfaceC1631540sYi2) {
                viewOnClickListenerC1636720sh4.LLIZLLLIL = interfaceC1631540sYi2;
            }
        }
        if (c1636260sgK instanceof AbstractViewOnClickListenerC1636290sgN) {
            AbstractViewOnClickListenerC1636290sgN abstractViewOnClickListenerC1636290sgN = (AbstractViewOnClickListenerC1636290sgN) c1636260sgK;
            InterfaceC1631540sYi interfaceC1631540sYi3 = abstractViewOnClickListenerC1636290sgN.LLIZ;
            InterfaceC1631540sYi interfaceC1631540sYi4 = this.LL;
            if (interfaceC1631540sYi3 != interfaceC1631540sYi4) {
                abstractViewOnClickListenerC1636290sgN.LLIZ = interfaceC1631540sYi4;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLL, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(C1636260sgK<Effect> c1636260sgK) {
        boolean z;
        String name;
        InterfaceC1446830nkn interfaceC1446830nkn;
        String name2;
        String name3;
        String name4;
        String name5;
        String id;
        super.onViewAttachedToWindow(c1636260sgK);
        int adapterPosition = c1636260sgK.getAdapterPosition();
        if (adapterPosition == 0) {
            return;
        }
        Effect effectLLLII = LLLII(adapterPosition);
        if (effectLLLII != null && (id = effectLLLII.getId()) != null && a0.LJJIIZI(id, "title", false)) {
            z = true;
        } else {
            z = false;
        }
        String key = null;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CategoryStickerAdapter onViewAttachedToWindow ");
            EffectCategoryModel effectCategoryModel = this.LLJILJILJ;
            if (effectCategoryModel != null) {
                name3 = effectCategoryModel.getName();
            } else {
                name3 = null;
            }
            sbLIZ.append(name3);
            sbLIZ.append(" contains title, pos = ");
            sbLIZ.append(adapterPosition);
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, List<Integer>> mapLJJJLIIL = this.LLIZ.LJJJLIIL();
            EffectCategoryModel effectCategoryModel2 = this.LLJILJILJ;
            if (effectCategoryModel2 != null) {
                name4 = effectCategoryModel2.getName();
            } else {
                name4 = null;
            }
            List<Integer> arrayList = mapLJJJLIIL.get(name4);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.isEmpty() || adapterPosition > ((Number) C13LP.LJJLIIIJJI(arrayList)).intValue()) {
                arrayList.add(Integer.valueOf(adapterPosition));
            }
            Map<String, List<Integer>> mapLJJJLIIL2 = this.LLIZ.LJJJLIIL();
            EffectCategoryModel effectCategoryModel3 = this.LLJILJILJ;
            if (effectCategoryModel3 != null) {
                name5 = effectCategoryModel3.getName();
            } else {
                name5 = null;
            }
            mapLJJJLIIL2.put(name5, arrayList);
            Map<String, List<Integer>> mapLJJJLIIL3 = this.LLIZ.LJJJLIIL();
            EffectCategoryModel effectCategoryModel4 = this.LLJILJILJ;
            if (effectCategoryModel4 != null) {
                key = effectCategoryModel4.getKey();
            }
            mapLJJJLIIL3.put(key, arrayList);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CategoryStickerAdapter onViewAttachedToWindow curSelectTab = ");
        sbLIZ2.append(this.LLJILJIL.LJFF);
        sbLIZ2.append(' ');
        EffectCategoryModel effectCategoryModel5 = this.LLJILJILJ;
        if (effectCategoryModel5 != null) {
            name = effectCategoryModel5.getName();
        } else {
            name = null;
        }
        sbLIZ2.append(name);
        sbLIZ2.append(", curTab = ");
        sbLIZ2.append(this.LLJILLL);
        C2188811AlT.LIZIZ(sbLIZ2);
        Integer num = this.LLJILJIL.LJFF;
        int i = this.LLJILLL;
        if (num != null && num.intValue() == i && c1636260sgK.itemView.getAlpha() == 1.0f && (interfaceC1446830nkn = this.LLJILJIL.LIZ) != null) {
            int adapterPosition2 = c1636260sgK.getAdapterPosition();
            EffectCategoryModel effectCategoryModel6 = this.LLJILJILJ;
            if (effectCategoryModel6 != null) {
                name2 = effectCategoryModel6.getName();
            } else {
                name2 = null;
            }
            EffectCategoryModel effectCategoryModel7 = this.LLJILJILJ;
            if (effectCategoryModel7 != null) {
                key = effectCategoryModel7.getKey();
            }
            interfaceC1446830nkn.LIZIZ(adapterPosition2, name2, key, null, new AwS604S0100000_25(this, 839));
        }
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLLII, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(C1636260sgK<Effect> c1636260sgK) {
        String effectId;
        super.onViewDetachedFromWindow(c1636260sgK);
        if (!C0C0O.LIZ()) {
            EffectPrefetchPreloadConfig effectPrefetchPreloadConfig = EffectPrefetchPreloadConfig.INSTANCE;
            if (!effectPrefetchPreloadConfig.propPanelPreloadEnabled() && !effectPrefetchPreloadConfig.propPanelPrefetchEnabled()) {
                return;
            }
        }
        Effect effectLLLII = LLLII(c1636260sgK.getBindingAdapterPosition());
        Effect effectLJI = this.LLIZ.LJII().LJI();
        String effectId2 = null;
        if (effectLJI != null) {
            effectId = effectLJI.getEffectId();
        } else {
            effectId = null;
        }
        if (effectLLLII != null) {
            effectId2 = effectLLLII.getEffectId();
        }
        if (!Intrinsics.LJFF(effectId, effectId2)) {
            this.LLIZ.LIZLLL(effectLLLII, false);
        }
    }

    public void LLLLIIIILLL(C1636690sh1 c1636690sh1) {
        c1636690sh1.LIZ(AFwS229S0000000_2.get$arr$(874), new AwS604S0100000_25(this, 840));
    }

    @Override // X.AbstractC1636650sgx, X.AbstractC21673619ry
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJJIII = recyclerView.getLayoutManager();
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C1636260sgK c1636260sgK = (C1636260sgK) viewHolder;
        if (C2281551ESb.LIZIZ.LJJIIZI()) {
            c1636260sgK.R5();
        }
        return super.onFailedToRecycleView(c1636260sgK);
    }

    public void setData(List<? extends Effect> list) {
        C0CNO.LIZLLL(0L, new AwS426S0200000_25(this, (C1636320sgQ) C13LP.LLIIII(list), (List<? extends Effect>) 178));
    }

    public static final void LLLJIL(C1636320sgQ c1636320sgQ, List list) {
        c1636320sgQ.getClass();
        c1636320sgQ.LLILZ = new ArrayList(list);
        c1636320sgQ.notifyDataSetChanged();
    }

    @Override // X.AbstractC1636650sgx
    /* JADX INFO: renamed from: LLLIILIL */
    public final void onBindViewHolder(C1636260sgK<Effect> c1636260sgK, int i) {
        if (LLLII(i) instanceof LoadingSkeletonEffect) {
            return;
        }
        LLLJL(c1636260sgK);
        Effect effectLLLII = LLLII(i);
        if (effectLLLII != null) {
            this.LLJJIJIL.put(effectLLLII.getEffectId(), Integer.valueOf(c1636260sgK.getAbsoluteAdapterPosition()));
        }
        super.onBindViewHolder(c1636260sgK, i);
    }

    @Override // X.AbstractC1636650sgx
    /* JADX INFO: renamed from: LLLIL */
    public final void onBindViewHolder(C1636260sgK<Effect> c1636260sgK, int i, List<Object> list) {
        if (LLLII(i) instanceof LoadingSkeletonEffect) {
            return;
        }
        LLLJL(c1636260sgK);
        super.onBindViewHolder(c1636260sgK, i, list);
    }

    @Override // X.AbstractC1636650sgx, X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((C1636260sgK) viewHolder, i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1636320sgQ(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi interfaceC1631540sYi, C1636520sgk c1636520sgk, InterfaceC1625970sPj interfaceC1625970sPj, InterfaceC1636390sgX interfaceC1636390sgX, C1631250sYF c1631250sYF, EffectCategoryModel effectCategoryModel, int i, int i2) {
        this(interfaceC1624480sNK, interfaceC1635560sfC, (InterfaceC1631540sYi<Effect>) interfaceC1631540sYi, c1636520sgk, (i2 & 16) != 0 ? null : interfaceC1625970sPj, (i2 & 32) != 0 ? null : interfaceC1636390sgX, (i2 & 64) != 0 ? new C1631250sYF(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023) : c1631250sYF, (i2 & 128) == 0 ? effectCategoryModel : null, (i2 & 256) != 0 ? Integer.MAX_VALUE : i, false);
    }

    public C1636320sgQ(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi<Effect> interfaceC1631540sYi, C1636520sgk c1636520sgk, InterfaceC1625970sPj interfaceC1625970sPj, InterfaceC1636390sgX interfaceC1636390sgX, C1631250sYF c1631250sYF, EffectCategoryModel effectCategoryModel, int i, boolean z) {
        super(interfaceC1631540sYi, c1636520sgk);
        this.LLIZ = interfaceC1624480sNK;
        this.LLIZLLLIL = interfaceC1635560sfC;
        this.LLJ = c1636520sgk;
        this.LLJI = interfaceC1625970sPj;
        this.LLJIJIL = interfaceC1636390sgX;
        this.LLJILJIL = c1631250sYF;
        this.LLJILJILJ = effectCategoryModel;
        this.LLJILLL = i;
        this.LLJJ = z;
        this.LLJJIJIIJIL = new C1636210sgF();
        this.LLJJIJIL = new HashMap<>(512);
    }
}
