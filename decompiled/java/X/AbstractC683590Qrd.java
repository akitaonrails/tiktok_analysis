package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Qrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC683590Qrd<T> extends AbstractC683510QrV {
    public static final C683610Qrf Companion = new Object() { // from class: X.0Qrf
    };
    public static final String TAG = AbstractC683590Qrd.class.getSimpleName();
    public List<T> mmItems;
    public int mmPreviousCount;

    public AbstractC683590Qrd() {
        this(false);
    }

    public void clearData() {
        List<T> list = this.mmItems;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC438050HFr
    public int getBasicItemCount() {
        List<T> list = this.mmItems;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List<T> getData() {
        return this.mmItems;
    }

    public final List<T> getMmItems() {
        return this.mmItems;
    }

    public final int getMmPreviousCount() {
        return this.mmPreviousCount;
    }

    public AbstractC683590Qrd(boolean z) {
        if (z) {
            setHasStableIds(true);
        }
        registerAdapterDataObserver(new AbstractC471570IeR(this) { // from class: X.0Qre
            public final /* synthetic */ AbstractC683590Qrd<T> LIZ;

            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                AbstractC683590Qrd<T> abstractC683590Qrd = this.LIZ;
                abstractC683590Qrd.mmPreviousCount = abstractC683590Qrd.getItemCount();
            }

            {
                this.LIZ = this;
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                AbstractC683590Qrd<T> abstractC683590Qrd = this.LIZ;
                abstractC683590Qrd.mmPreviousCount = abstractC683590Qrd.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                AbstractC683590Qrd<T> abstractC683590Qrd = this.LIZ;
                abstractC683590Qrd.mmPreviousCount = abstractC683590Qrd.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                AbstractC683590Qrd<T> abstractC683590Qrd = this.LIZ;
                abstractC683590Qrd.mmPreviousCount = abstractC683590Qrd.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                AbstractC683590Qrd<T> abstractC683590Qrd = this.LIZ;
                abstractC683590Qrd.mmPreviousCount = abstractC683590Qrd.getItemCount();
            }
        });
    }

    public void addData(List<? extends T> list) {
        if (list != null && !list.isEmpty()) {
            List<T> arrayList = this.mmItems;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.mmItems = arrayList;
            if (list != null) {
                arrayList.addAll(list);
                notifyDataSetChanged();
            }
        }
    }

    public final void justSetData(List<T> list) {
        this.mmItems = list;
    }

    @Override // X.AbstractC438050HFr
    public void onShowFooterChanged(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.mmPreviousCount = getItemCount();
    }

    public void setData(List<T> list) {
        this.mmItems = list;
        notifyDataSetChanged();
    }

    public final void setDataAfterLoadLatest(List<T> list) {
        this.mmItems = list;
        notifyItemRangeInserted(0, getItemCount() - this.mmPreviousCount);
    }

    public void setDataAfterLoadMore(List<T> list) {
        this.mmItems = list;
        if (this.mShowFooter) {
            notifyItemRangeInserted(this.mmPreviousCount - 1, getItemCount() - this.mmPreviousCount);
            notifyItemChanged(getItemCount() - 1);
        } else {
            notifyItemRangeInserted(this.mmPreviousCount, getItemCount() - this.mmPreviousCount);
        }
    }

    public final void setMmItems(List<T> list) {
        this.mmItems = list;
    }

    public final void setMmPreviousCount(int i) {
        this.mmPreviousCount = i;
    }

    public void insertData(T t, int i) {
        List<T> arrayList = this.mmItems;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.mmItems = arrayList;
        ListProtector.add(arrayList, i, t);
        notifyItemInserted(i);
    }
}
