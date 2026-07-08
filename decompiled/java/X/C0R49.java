package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.ShowSearchRSReportPanelMethod;
import kotlin.jvm.internal.AwS124S1100000_10;

/* JADX INFO: renamed from: X.0R49, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R49 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(C0R49 c0r49, DialogInterface dialogInterface) {
        if (C683820Qs0.LLILLL == null) {
            C683820Qs0 c683820Qs0 = (C683820Qs0) c0r49.l0;
            InterfaceC683840Qs2 interfaceC683840Qs2 = (InterfaceC683840Qs2) c0r49.l1;
            c683820Qs0.getClass();
            C1018703yb.LIZLLL("mall_click_search_feedback", new AwS124S1100000_10(interfaceC683840Qs2, "close", 1));
        }
    }

    public static final void onDismiss$1(C0R49 c0r49, DialogInterface dialogInterface) {
        ShowSearchRSReportPanelMethod showSearchRSReportPanelMethod = (ShowSearchRSReportPanelMethod) c0r49.l0;
        C19EG c19eg = showSearchRSReportPanelMethod.activity;
        if (c19eg != null) {
            showSearchRSReportPanelMethod.shouldBlockMediaPlay(c19eg, (Fragment) c0r49.l1, false);
        }
    }

    public C0R49(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
