package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.0ivR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261230ivR extends AbstractC654930PmV {
    public final String LLILLL;
    public final InterfaceC1260110itd LLILZ;
    public final InterfaceC645470PTl<AbstractC1620180sGO> LLILZIL;
    public final InterfaceC1400710mYP LLILZLL;
    public boolean LLIZ;
    public final Bundle LLIZLLLIL;

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr, X.AbstractC21673619ry
    public final int getItemCount() {
        return this.mShowFooter ? getBasicItemCount() + 1 : getBasicItemCount();
    }

    @Override // X.AbstractC654930PmV
    public final boolean LLLIIIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() != 0 && viewHolder.getItemViewType() != 110003 && !this.LLILZLL.needCallHolderAttached(viewHolder)) {
            return false;
        }
        return true;
    }

    public final List<Integer> LLLIL(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int iMax = Math.max(0, this.mmPreviousCount - 1); iMax < size; iMax++) {
            Aweme aweme = (Aweme) ListProtector.get(list, iMax);
            AwemeBizExtKt.setOriginalPos(aweme, iMax);
            if (aweme.getIsTop() == 1) {
                list.remove(aweme);
                ListProtector.add(list, i, aweme);
                i++;
                arrayList.add(Integer.valueOf(iMax));
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        int basicItemViewType = super.getBasicItemViewType(i);
        if (basicItemViewType == 0) {
            List<T> list = this.mmItems;
            if ((this.LLILZLL instanceof AbstractC636100OxE) && list != 0 && i < list.size()) {
                return ((AbstractC636100OxE) this.LLILZLL).getDetailAwemeViewType(i, (Aweme) ListProtector.get(list, i));
            }
        }
        return basicItemViewType;
    }

    @Override // X.AbstractC654930PmV, X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        InterfaceC645470PTl<AbstractC1620180sGO> interfaceC645470PTl;
        InterfaceC645470PTl<AbstractC1620180sGO> interfaceC645470PTl2;
        super.onViewAttachedToWindow(viewHolder);
        if (this.LLIZ && ((viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 110003) && (interfaceC645470PTl2 = this.LLILZIL) != null)) {
            interfaceC645470PTl2.Tr(viewHolder);
        }
        if (viewHolder.getItemViewType() == 110001 && (interfaceC645470PTl = this.LLILZIL) != null) {
            interfaceC645470PTl.zt(viewHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683590Qrd
    public final void setData(List<Aweme> list) {
        this.mmPreviousCount = 0;
        if (TextUtils.equals(this.LLILLL, "challenge")) {
            this.mmItems = list;
            Objects.requireNonNull(list);
            LLLIL(list);
            super.setData(this.mmItems);
            return;
        }
        super.setData(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683590Qrd
    public final void setDataAfterLoadMore(List<Aweme> list) {
        if (TextUtils.equals(this.LLILLL, "challenge")) {
            this.mmItems = list;
            Objects.requireNonNull(list);
            List<Integer> listLLLIL = LLLIL(list);
            super.setDataAfterLoadMore(list);
            ArrayList arrayList = (ArrayList) listLLLIL;
            if (arrayList.size() > 0) {
                notifyItemRangeInserted(0, arrayList.size());
                return;
            }
            return;
        }
        super.setDataAfterLoadMore(list);
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<T> list = this.mmItems;
        if ((viewHolder instanceof AbstractC1261240ivS) && list != 0) {
            ((AbstractC1261240ivS) viewHolder).X5((Aweme) ListProtector.get(list, i), i, this.LLIZ, this.LLIZLLLIL);
        }
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        AbstractC1261240ivS abstractC1261240ivSOnCreateDetailAwemeViewHolder;
        InterfaceC1400710mYP interfaceC1400710mYP = this.LLILZLL;
        if (interfaceC1400710mYP instanceof AbstractC636100OxE) {
            abstractC1261240ivSOnCreateDetailAwemeViewHolder = ((AbstractC636100OxE) interfaceC1400710mYP).onCreateDetailAwemeViewHolder(viewGroup, i, this.LLILLL, this.LLILZ);
        } else {
            abstractC1261240ivSOnCreateDetailAwemeViewHolder = this.LLILZLL.onCreateDetailAwemeViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bk3, viewGroup, false), this.LLILLL, this.LLILZ);
        }
        if (abstractC1261240ivSOnCreateDetailAwemeViewHolder != null && abstractC1261240ivSOnCreateDetailAwemeViewHolder.itemView.getParent() != null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DetailAwemeAdapter", abstractC1261240ivSOnCreateDetailAwemeViewHolder.getClass() + " itemView already attached !!");
        }
        return abstractC1261240ivSOnCreateDetailAwemeViewHolder;
    }

    public C1261230ivR(String str, InterfaceC1260110itd interfaceC1260110itd, InterfaceC645470PTl<AbstractC1620180sGO> interfaceC645470PTl, InterfaceC1400710mYP interfaceC1400710mYP, Bundle bundle) {
        this.LLILLL = str;
        this.LLILZ = interfaceC1260110itd;
        this.LLILZIL = interfaceC645470PTl;
        this.LLILZLL = interfaceC1400710mYP;
        this.LLIZLLLIL = bundle;
        setLoadErrorText((CharSequence) null);
    }
}
