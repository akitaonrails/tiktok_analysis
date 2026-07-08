package X;

import Y.AObserverS230S0100000_28;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.notification.open.component.cell.NoticeLoadingMoreFooterCell;
import com.ss.android.ugc.aweme.notification.open.component.cell.NoticeTemplateCell;
import com.ss.android.ugc.aweme.notification.open.component.viewmodel.NoticeViewModel;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901980zau extends AbstractC1906720ziY {
    public final Fragment LLIZLLLIL;
    public final InterfaceC1902020zay LLJ;
    public final C01GW LLJI = C0DTR.LIZJ(new AwS572S0100000_28(this, 885));
    public final C1901850zah LLJIJIL;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onPause() {
        C1900870zZ7.LIZ = null;
        C1900870zZ7.LIZIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        Iterator it2 = Collections.singletonList(NoticeTemplateCell.class).iterator();
        while (it2.hasNext()) {
            LJIILIIL(it2.next());
        }
        NoticeViewModel noticeViewModel = (NoticeViewModel) this.LLJI.getValue();
        if (noticeViewModel != null) {
            LJIIJ().LIZ(new C1901990zav(this, noticeViewModel), C1901990zav.class);
            noticeViewModel.LLJI.observe(getCurrentLifeCycleOwner(), new AObserverS230S0100000_28(this, 78));
            noticeViewModel.LLJ.observe(getCurrentLifeCycleOwner(), new AObserverS230S0100000_28(this, 79));
        }
    }

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<Boolean> LJIIJJI() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        String str;
        NoticeViewModel noticeViewModel = (NoticeViewModel) this.LLJI.getValue();
        String str2 = null;
        if (noticeViewModel != null) {
            str = noticeViewModel.LLJJ;
        } else {
            str = null;
        }
        C1900870zZ7.LIZ = str;
        NoticeViewModel noticeViewModel2 = (NoticeViewModel) this.LLJI.getValue();
        if (noticeViewModel2 != null) {
            str2 = noticeViewModel2.LLJJ;
        }
        C1900870zZ7.LIZIZ = str2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0zah] */
    public C1901980zau(Fragment fragment, C1901860zai c1901860zai) {
        this.LLIZLLLIL = fragment;
        this.LLJ = c1901860zai;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZLLL = NoticeLoadingMoreFooterCell.class;
        this.LLJIJIL = new AbstractC329610Cw3<Boolean>(c20603715jn) { // from class: X.0zah
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
                NoticeViewModel noticeViewModel = (NoticeViewModel) this.LIZIZ.LLJI.getValue();
                if (noticeViewModel != null) {
                    C1901940zaq c1901940zaq = C1901940zaq.LIZ;
                    noticeViewModel.yQ2(c1901940zaq, C1901960zas.LIZ);
                    noticeViewModel.xQ2(c1901940zaq, interfaceC1364105Vn, null);
                }
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                C1901780zaa c1901780zaa;
                ((Boolean) obj).booleanValue();
                NoticeViewModel noticeViewModel = (NoticeViewModel) this.LIZIZ.LLJI.getValue();
                if (noticeViewModel != null && (c1901780zaa = noticeViewModel.LLJJIII) != null && c1901780zaa.LIZ) {
                    noticeViewModel.xQ2(C1901920zao.LIZ, interfaceC1364105Vn, c1901780zaa);
                }
            }
        };
    }
}
