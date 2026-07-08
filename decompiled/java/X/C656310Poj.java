package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Poj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656310Poj extends AbstractC654900PmS<SearchChallenge> {
    public C0PM8 LLILZLL;

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        List<T> list = this.mmItems;
        if (list != 0 && i >= 0 && i < list.size()) {
            return this.LLILZLL.getValue();
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<SearchChallenge> list) {
        this.LLILZIL.LIZLLL = Integer.MIN_VALUE;
        super.setData(list);
    }

    public final C653660PkS LLLII(SearchChallenge searchChallenge, int i) {
        String str;
        String str2;
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ == null) {
            str = "";
            str2 = "";
        } else {
            str = interfaceC649890PeNLIZ.LIZJ().LIZ;
            str2 = interfaceC649890PeNLIZ.LIZJ().LIZIZ;
            interfaceC649890PeNLIZ.LJ();
        }
        LogPbBean logPbBean = searchChallenge.logPbBean;
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
            logPbBean.setImprId("");
        }
        String imprId = logPbBean.getImprId();
        String strLJ = C584850Mwl.LIZ.LJ(imprId);
        this.LLILLL.getEnterMethod();
        InterfaceC644470PPp.LIZ.getClass();
        String strLIZ = C644460PPo.LIZ(2);
        C0PTA.LIZ.getClass();
        String strLIZ2 = C645350PSz.LIZ(2);
        C653660PkS c653660PkS = new C653660PkS();
        c653660PkS.LJIIIIZZ = "search_result";
        c653660PkS.LIZ = false;
        c653660PkS.LJIIJ = str;
        c653660PkS.LJIIJJI = imprId;
        c653660PkS.LJIILJJIL = strLJ;
        c653660PkS.LJIILIIL = logPbBean;
        c653660PkS.LJIILL = i;
        c653660PkS.LJFF = str2;
        c653660PkS.LIZJ = 2;
        c653660PkS.LIZLLL = strLIZ;
        c653660PkS.LJ = strLIZ2;
        return c653660PkS;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0260  */
    @Override // X.AbstractC654900PmS, X.AbstractC683560Qra, X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C656310Poj.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i == C0PM8.NORMAL.getValue()) {
            int i2 = C656320Pok.LLJJIII;
            C650520PfO.LIZ.getClass();
            View viewLIZ = C650520PfO.LIZ(R.layout.ezq, viewGroup);
            ViewOnAttachStateChangeListenerC656330Pol viewOnAttachStateChangeListenerC656330Pol = new ViewOnAttachStateChangeListenerC656330Pol(viewLIZ);
            viewLIZ.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC656330Pol);
            viewLIZ.setTag(R.id.u83, viewOnAttachStateChangeListenerC656330Pol);
            C656320Pok c656320Pok = new C656320Pok(viewLIZ);
            c656320Pok.LLJIJIL = "search_result";
            return c656320Pok;
        }
        int i3 = C656380Poq.LLJIJIL;
        C650520PfO.LIZ.getClass();
        return new C656380Poq(C650520PfO.LIZ(R.layout.ezr, viewGroup));
    }

    public C656310Poj(SearchResultParam searchResultParam, C0P9D c0p9d, InterfaceC645400PTe interfaceC645400PTe) {
        super(searchResultParam, c0p9d, interfaceC645400PTe);
        this.LLILZLL = C0PM8.NORMAL;
    }
}
