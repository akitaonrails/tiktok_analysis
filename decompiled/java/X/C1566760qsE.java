package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfigExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566760qsE extends AbstractC1566470qrl<C1566670qs5> implements Observer<String> {
    @Override // X.InterfaceC1566430qrh
    public final void LIZ() {
        C0CNO.LIZ(C15O7.LJI, new C1566780qsG(this));
    }

    @Override // X.InterfaceC1566430qrh
    public final void destroy() {
        this.LL.clear();
        C1570240qxq.LIZ.removeObserver(this);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0qsH] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        boolean z;
        final String str2;
        String str3 = str;
        if ((NUJAutoRefreshConfigExp.refreshIndex() == 0 || Intrinsics.LJFF(str3, "nuj_after_did")) && C07M8.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(str3, "nuj_after_did")) {
            str2 = "after_did";
        } else if (Intrinsics.LJFF(str3, "nuj_before_swipe_up")) {
            str2 = "before_swipeup";
        } else {
            str2 = "";
        }
        C1602870roT.LIZIZ(str2);
        LIZJ(new C1566670qs5(str3, AFwS213S0000000_24.get$arr$(598), new InterfaceC1566600qry() { // from class: X.0qsH
            @Override // X.InterfaceC1566600qry
            public final void LIZ() {
            }

            @Override // X.InterfaceC1566600qry
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1566600qry
            public final C1566660qs4 LIZJ() {
                return new C1566660qs4(NUJAutoRefreshConfigExp.refreshIndex());
            }

            @Override // X.InterfaceC1566600qry
            public final void LIZIZ(List<? extends Aweme> list) {
                C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(C1DD1.LIZJ(), "vv");
                c19249910Sr.LIZIZ(c2344009Gk, "auto_refresh_req_recv");
                C1602870roT.LIZ(str2, list);
            }
        }, z));
    }
}
