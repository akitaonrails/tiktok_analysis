package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Yfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880110Yfp extends AbstractC880120Yfq {
    public final boolean LLJ;
    public final int LLJI;
    public final int LLJIJIL;

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        boolean z = this.LLJ;
        String str = z ? "unmute" : "mute";
        this.LLILZLL.LJIIIIZZ(!z, new C914150Ztd(this, 15));
        AbstractC880120Yfq.LJFF(this, str, null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        C878950Ydx c878950Ydx;
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t == null) {
            return true;
        }
        if (c0y8t.getConversationType() != AbstractC1711506n3.LIZIZ || (!C880000Yfe.LIZ && C0ZFW.LIZ.LJIIIZ(c0y8t))) {
            InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
            FilterTabType filterTabType = null;
            if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                filterTabType = c878950Ydx.LLILLL;
            }
            if (filterTabType != FilterTabType.SPAM && !AbstractC880120Yfq.LJII(this.LLILZ)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJI;
    }

    public C880110Yfp(Activity activity, C879540Yeu<?> c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        boolean zIsMute;
        int i;
        int i2;
        super(activity, c879540Yeu, interfaceC879010Ye3);
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t != null) {
            zIsMute = c0y8t.isMute();
        } else {
            zIsMute = false;
        }
        this.LLJ = zIsMute;
        if (zIsMute) {
            i = 2131831580;
        } else {
            i = 2131831578;
        }
        this.LLJI = i;
        if (zIsMute) {
            i2 = R.raw.icon_bell;
        } else {
            i2 = R.raw.icon_bell_slash;
        }
        this.LLJIJIL = i2;
    }
}
