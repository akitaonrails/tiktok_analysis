package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;

/* JADX INFO: renamed from: X.0rLL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnClickListenerC1584810rLL implements View.OnClickListener {
    public final Context LL;
    public boolean LLILLJJLI = true;

    public final FeedFragment LIZ() {
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment fragmentKi = c446900Hfk.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
        if (fragmentKi instanceof FeedFragment) {
            return (FeedFragment) fragmentKi;
        }
        return null;
    }

    public final FeedFragment LIZIZ() {
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment fragmentKi = c446900Hfk.LIZ(c19egLIZIZ).Ki("REPOST_FEED");
        if (fragmentKi instanceof FeedFragment) {
            return (FeedFragment) fragmentKi;
        }
        return null;
    }

    public ViewOnClickListenerC1584810rLL(Context context) {
        this.LL = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x026d, code lost:
    
        r1 = LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0271, code lost:
    
        if (r1 == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0275, code lost:
    
        if ((r1 instanceof X.InterfaceC1587410rPX) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0277, code lost:
    
        r0 = (X.InterfaceC1587410rPX) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x027a, code lost:
    
        if (r0 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x027c, code lost:
    
        r0.xO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027f, code lost:
    
        r1.Oi(false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134 A[PHI: r3 r12
      0x0134: PHI (r3v5 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:56:0x0123, B:44:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r12v8 com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol) = 
      (r12v1 com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol)
      (r12v11 com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol)
     binds: [B:56:0x0123, B:44:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1584810rLL.onClick(android.view.View):void");
    }
}
