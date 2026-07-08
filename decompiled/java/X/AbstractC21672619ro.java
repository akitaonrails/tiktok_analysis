package X;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: X.19ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21672619ro extends BaseAdapter implements Filterable, InterfaceC21672919rr {
    public boolean LL;
    public Cursor LLILLJJLI;
    public int LLILLL;
    public C21672719rp LLILZ;

    public abstract void LIZIZ(View view, Cursor cursor);

    public abstract View LIZLLL(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.LL || (cursor = this.LLILLJJLI) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19rp] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.LLILZ == null) {
            this.LLILZ = new Filter(this) { // from class: X.19rp
                public final InterfaceC21672919rr LIZ;

                {
                    this.LIZ = this;
                }

                @Override // android.widget.Filter
                public final CharSequence convertResultToString(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    this.LIZ.getClass();
                    if (cursor == null) {
                        return null;
                    }
                    String strLJFF = ViewOnClickListenerC21672519rn.LJFF(cursor.getColumnIndex("suggest_intent_query"), cursor);
                    strLJFF.getClass();
                    return strLJFF;
                }

                @Override // android.widget.Filter
                public final Filter.FilterResults performFiltering(CharSequence charSequence) {
                    InterfaceC21672919rr interfaceC21672919rr = this.LIZ;
                    if (charSequence != null) {
                        interfaceC21672919rr.getClass();
                        charSequence.toString();
                    }
                    interfaceC21672919rr.getClass();
                    throw null;
                }

                @Override // android.widget.Filter
                public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    InterfaceC21672919rr interfaceC21672919rr = this.LIZ;
                    Cursor cursor = ((AbstractC21672619ro) interfaceC21672919rr).LLILLJJLI;
                    Object obj = filterResults.values;
                    if (obj != null && obj != cursor) {
                        ((AbstractC21672619ro) interfaceC21672919rr).LIZJ((Cursor) obj);
                    }
                }
            };
        }
        return this.LLILZ;
    }

    public void LIZJ(Cursor cursor) {
        Cursor cursor2 = this.LLILLJJLI;
        if (cursor != cursor2) {
            this.LLILLJJLI = cursor;
            if (cursor != null) {
                this.LLILLL = cursor.getColumnIndexOrThrow("_id");
                this.LL = true;
                notifyDataSetChanged();
            } else {
                this.LLILLL = -1;
                this.LL = false;
                notifyDataSetInvalidated();
            }
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.LL && (cursor = this.LLILLJJLI) != null) {
            cursor.moveToPosition(i);
            return this.LLILLJJLI;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.LL || (cursor = this.LLILLJJLI) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.LLILLJJLI.getLong(this.LLILLL);
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.LL) {
            return null;
        }
        this.LLILLJJLI.moveToPosition(i);
        if (view == null) {
            view = C786410Ut5.Td(null, 0, viewGroup, false);
        }
        LIZIZ(view, this.LLILLJJLI);
        return view;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.LL) {
            if (this.LLILLJJLI.moveToPosition(i)) {
                if (view == null) {
                    view = LIZLLL(viewGroup);
                }
                LIZIZ(view, this.LLILLJJLI);
                return view;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("couldn't move cursor to position ");
            sbLIZ.append(i);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
