package X;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: X.19X0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19X0 implements ListAdapter, SpinnerAdapter {
    public final SpinnerAdapter LL;
    public final ListAdapter LLILLJJLI;

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.LLILLJJLI;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.LL;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.LL;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.LL;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.LL;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.LLILLJJLI;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.LL;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.LL;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C19X0(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.LL = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.LLILLJJLI = (ListAdapter) spinnerAdapter;
        }
        if (theme != null) {
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                C19X3.LIZ((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else {
                if (!(spinnerAdapter instanceof C19X9)) {
                    return;
                }
                C19X9 c19x9 = (C19X9) spinnerAdapter;
                if (c19x9.getDropDownViewTheme() != null) {
                    return;
                }
                c19x9.LIZ();
            }
        }
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.LL;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }
}
