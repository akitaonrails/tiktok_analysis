package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Yc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877770Yc3 extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;
    public final boolean LLJIJIL;
    public final C01GW LLJILJIL;

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        this.LLILZLL.LJIJJLI(null);
        AbstractC880120Yfq.LJFF(this, "read", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        C878950Ydx c878950Ydx;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        FilterTabType filterTabType = null;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
            filterTabType = c878950Ydx.LLILLL;
        }
        if (filterTabType != FilterTabType.SPAM) {
            return (this.LLJIJIL || ((Boolean) this.LLJILJIL.getValue()).booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C877770Yc3(Activity activity, C879540Yeu<?> c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        boolean z;
        super(activity, c879540Yeu, interfaceC879010Ye3);
        this.LLJ = 2131831579;
        this.LLJI = R.raw.icon_message_read;
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t != null && c0y8t.getUnreadCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = z;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1475));
    }
}
