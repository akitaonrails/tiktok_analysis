package X;

import android.content.Context;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722380uvE extends Filter {
    public final /* synthetic */ C1722370uvD LIZ;

    public C1722380uvE(C1722370uvD c1722370uvD) {
        this.LIZ = c1722370uvD;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Context context;
        String string2;
        String lowerCase;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            this.LIZ.LLILLJJLI.clear();
            C1722370uvD c1722370uvD = this.LIZ;
            c1722370uvD.LLILLJJLI.addAll(c1722370uvD.LLILLL);
        } else {
            ArrayList arrayList = new ArrayList();
            C1722370uvD c1722370uvD2 = this.LIZ;
            ArrayList<C1722410uvH> arrayList2 = c1722370uvD2.LLILLL;
            ArrayList arrayList3 = new ArrayList();
            for (C1722410uvH c1722410uvH : arrayList2) {
                C1722410uvH c1722410uvH2 = c1722410uvH;
                if (a0.LJJIIZI(c1722410uvH2.LIZLLL, string, false) || a0.LJJIIZI(c1722410uvH2.LJ.toLowerCase(Locale.getDefault()), string, false) || ((context = c1722370uvD2.LLILZ) != null && (string2 = context.getString(c1722410uvH2.LIZ)) != null && (lowerCase = string2.toLowerCase(Locale.getDefault())) != null && a0.LJJIIZI(lowerCase, string, false))) {
                    arrayList3.add(c1722410uvH);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.LIZ.LLILLJJLI.clear();
            this.LIZ.LLILLJJLI.addAll(arrayList);
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = this.LIZ.LLILLJJLI;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        ArrayList<C1722410uvH> arrayList;
        C1722370uvD c1722370uvD = this.LIZ;
        if (filterResults != null && filterResults.values != null) {
            arrayList = (ArrayList) filterResults.values;
        } else {
            arrayList = new ArrayList<>();
        }
        c1722370uvD.LLILLJJLI = arrayList;
        this.LIZ.notifyDataSetChanged();
    }
}
