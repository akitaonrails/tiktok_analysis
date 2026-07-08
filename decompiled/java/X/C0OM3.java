package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OM3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM3 extends FrameLayout {
    public boolean LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final TuxIconView getIcon() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public final View getRedDot() {
        return (View) this.LLILZ.getValue();
    }

    public C0OM3(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.a73, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LL = true;
        this.LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1860));
        this.LLILZ = C452501pT.LIZIZ(new AwS402S0200000_1(this, context, 117));
    }

    public final void setRedDotVisible(boolean z) {
        int i;
        View redDot = getRedDot();
        if (redDot != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, redDot);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        r2 = X.C0OM6.UNKNOWN;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[PHI: r8
      0x0080: PHI (r8v4 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:27:0x007e, B:25:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[PHI: r8
      0x0084: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:27:0x007e, B:29:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0OM6] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0OM6] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance r22, final X.C0OLV r23, boolean r24, final com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r25) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OM3.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance, X.0OLV, boolean, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel):void");
    }
}
