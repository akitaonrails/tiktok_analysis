package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.113F, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113F extends AbstractC683590Qrd<EffectModel> {
    public final boolean LL;
    public final C113D LLILLJJLI;
    public final C113G LLILLL;
    public final EffectDownloadController LLILZ;
    public final boolean LLILZIL;
    public final Function1<Integer, Unit> LLILZLL;
    public final Function2<EffectModel, Integer, Unit> LLIZ;
    public final List<Integer> LLIZLLLIL;
    public C113J LLJ;

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return 0;
    }

    public final int LLLFZ(EffectModel effectModel) {
        if (C2286708xd.LIZJ(effectModel.resDir)) {
            return 16;
        }
        if (!this.LLILZ.LIZJ(effectModel) && !this.LLILZ.LIZLLL(effectModel)) {
            return 2;
        }
        return 8;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        List<EffectModel> data;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof C113H) && (data = getData()) != null && viewHolder.getBindingAdapterPosition() >= 0 && viewHolder.getBindingAdapterPosition() < data.size()) {
            this.LLILZLL.invoke(Integer.valueOf(viewHolder.getBindingAdapterPosition()));
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<EffectModel> list) {
        super.setData(list);
        ((ArrayList) this.LLIZLLLIL).clear();
        List<EffectModel> data = getData();
        if (data != null) {
            Iterator<EffectModel> it2 = data.iterator();
            while (it2.hasNext()) {
                int iLLLFZ = LLLFZ(it2.next());
                ((ArrayList) this.LLIZLLLIL).add(Integer.valueOf(iLLLFZ));
            }
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void setDataAfterLoadMore(List<EffectModel> list) {
        List<EffectModel> data;
        List<EffectModel> data2;
        List listLJJJJIZL;
        int i = this.mmPreviousCount;
        super.setDataAfterLoadMore(list);
        int iMin = Math.min(i, ((ArrayList) this.LLIZLLLIL).size());
        if (iMin >= 0 && (data = getData()) != null && iMin < data.size() && (data2 = getData()) != null && (listLJJJJIZL = C13LP.LJJJJIZL(data2, iMin)) != null) {
            Iterator it2 = listLJJJJIZL.iterator();
            while (it2.hasNext()) {
                ((ArrayList) this.LLIZLLLIL).add(Integer.valueOf(LLLFZ((EffectModel) it2.next())));
            }
        }
    }

    public final void LLLI(int i, int i2) {
        if (((ArrayList) this.LLIZLLLIL).size() > i && ((Number) ListProtector.get(this.LLIZLLLIL, i)).intValue() != i2) {
            ListProtector.set(this.LLIZLLLIL, i, Integer.valueOf(i2));
            notifyItemChanged(i);
        }
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        EffectModel effectModel;
        List<EffectModel> data = getData();
        if (data != null) {
            effectModel = (EffectModel) ListProtector.get(data, i);
        } else {
            effectModel = null;
        }
        if (viewHolder instanceof C113H) {
            C113H c113h = (C113H) viewHolder;
            c113h.I5(((Number) ListProtector.get(this.LLIZLLLIL, i)).intValue(), effectModel);
            C113J c113j = this.LLJ;
            c113h.LLILZIL = c113j;
            if (effectModel != null) {
                if (c113j != null) {
                    i = c113j.LIZ(i);
                }
                this.LLIZ.invoke(effectModel, Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    @Override // X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateBasicViewHolder(android.view.ViewGroup r8, int r9) {
        /*
            r7 = this;
            android.content.Context r0 = r8.getContext()
            android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
            boolean r0 = X.C357780E0y.LIZ()
            if (r0 == 0) goto L30
            X.113G r1 = r7.LLILLL
            boolean r0 = r1.LJII
            if (r0 != 0) goto L18
            boolean r0 = r1.LJJIJIIJIL
            if (r0 == 0) goto L30
        L18:
            r1 = 2131561818(0x7f0d0d5a, float:1.8749047E38)
        L1b:
            r0 = 0
            android.view.View r1 = X.C786410Ut5.Td(r2, r1, r8, r0)
            X.113H r0 = new X.113H
            X.113G r2 = r7.LLILLL
            boolean r3 = r7.LL
            X.113D r4 = r7.LLILLJJLI
            X.113J r5 = r7.LLJ
            boolean r6 = r7.LLILZIL
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L30:
            r1 = 2131561817(0x7f0d0d59, float:1.8749045E38)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113F.onCreateBasicViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public C113F(boolean z, C113D c113d, C113G c113g, EffectDownloadController effectDownloadController, boolean z2, AwS608S0100000_29 awS608S0100000_29, AwS643S0100000_29 awS643S0100000_29) {
        super(false);
        this.LL = z;
        this.LLILLJJLI = c113d;
        this.LLILLL = c113g;
        this.LLILZ = effectDownloadController;
        this.LLILZIL = z2;
        this.LLILZLL = awS608S0100000_29;
        this.LLIZ = awS643S0100000_29;
        this.LLIZLLLIL = new ArrayList();
    }
}
