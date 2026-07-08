package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.11Dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19464311Dd {
    public static final void LIZIZ(RecyclerView.ViewHolder viewHolder) {
        viewHolder.resetInternal();
    }

    public static final int LIZ(RecyclerView recyclerView, int i) {
        RecyclerView.RecycledViewPool.ScrapData scrapData = recyclerView.getRecycledViewPool().mScrap.get(i);
        if (scrapData != null) {
            return scrapData.mMaxScrap;
        }
        return -1;
    }
}
