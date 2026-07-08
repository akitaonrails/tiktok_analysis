package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0PyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662380PyW extends AbstractC654900PmS<SearchUser> implements InterfaceC665680Q9e {
    public final InterfaceC653950Pkv LLILZLL;
    public View LLIZ;
    public RecyclerView.ViewHolder LLIZLLLIL;
    public C653660PkS LLJ;
    public final String LLJI;
    public String LLJIJIL;
    public InterfaceC662610Pyt LLJILJIL;
    public final Fragment LLJILJILJ;
    public int LLJILLL;

    @Override // X.AbstractC683560Qra
    public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        int i;
        RecyclerView.ViewHolder viewHolder = this.LLIZLLLIL;
        if (viewHolder != null) {
            this.LLIZLLLIL = null;
            return viewHolder;
        }
        InterfaceC653950Pkv interfaceC653950Pkv = this.LLILZLL;
        Fragment fragment = this.LLJILJILJ;
        int i2 = ViewOnClickListenerC662370PyV.LLLLIIL;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "search_ui_overdraw_phase_2_optimization_enabled", true, false)) {
            i = R.layout.f0j;
        } else {
            i = R.layout.f0h;
        }
        C650520PfO.LIZ.getClass();
        ViewOnClickListenerC662370PyV viewOnClickListenerC662370PyV = new ViewOnClickListenerC662370PyV(C650520PfO.LIZ(i, viewGroup), fragment, interfaceC653950Pkv);
        viewOnClickListenerC662370PyV.LLJZIJLIL = this.LLIZ;
        return viewOnClickListenerC662370PyV;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLIZLLLIL = LLLI(recyclerView);
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<SearchUser> list) {
        C0PT5 c0pt5 = this.LLILZIL;
        if (c0pt5 != null) {
            c0pt5.LIZLLL = Integer.MIN_VALUE;
        }
        super.setData(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r7v96, types: [X.0PkU] */
    @Override // X.AbstractC683560Qra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFZ(androidx.recyclerview.widget.RecyclerView.ViewHolder r28, int r29) {
        /*
            Method dump skipped, instruction units count: 2489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662380PyW.LLLFZ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public C662380PyW(SearchKeywordPresenter searchKeywordPresenter, C653910Pkr c653910Pkr, Fragment fragment) {
        this.LLILZ = searchKeywordPresenter;
        this.LLILZLL = c653910Pkr;
        this.LLJILJILJ = fragment;
    }

    public C662380PyW(SearchResultParam searchResultParam, C0P9D c0p9d, InterfaceC653950Pkv interfaceC653950Pkv, InterfaceC645400PTe interfaceC645400PTe, String str) {
        super(searchResultParam, c0p9d, interfaceC645400PTe);
        this.LLILZLL = interfaceC653950Pkv;
        this.LLJI = str;
    }
}
