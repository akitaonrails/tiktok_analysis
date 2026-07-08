package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0P4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638970P4l implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            default:
                return null;
        }
    }

    public C638970P4l(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C638970P4l c638970P4l, C15O7 c15o7) {
        C1C7U.LIZ("MultiViewModel@a25.onComplete$2");
        ((MultiViewModel) c638970P4l.l0).LLILZLL.postValue(Boolean.TRUE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiViewModel@a25.onComplete$2");
        return unit;
    }

    public static final Object then$1(C638970P4l c638970P4l, C15O7 c15o7) {
        C1C7U.LIZ("MultiViewModel@a25.onComplete$3");
        ((MultiViewModel) c638970P4l.l0).LLIZ.postValue(Boolean.TRUE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiViewModel@a25.onComplete$3");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$2(X.C638970P4l r5, X.C15O7 r6) {
        /*
            java.lang.Object r3 = r5.l0
            X.0OFt r3 = (X.C616430OFt) r3
            r3.getClass()
            java.lang.String r5 = "CollectActionPresenter@ad76.taskContinue$1L"
            X.C1C7U.LIZ(r5)
            int r0 = r3.LLILZIL
            r4 = 2
            if (r0 != r4) goto L2a
            boolean r0 = r6.LJIILL()
            java.lang.String r2 = "/aweme/v1/aweme/collect/"
            if (r0 != 0) goto L7e
            boolean r0 = r6.LJIILIIL()
            if (r0 != 0) goto L7e
            java.lang.Object r1 = r6.LJIIL()
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            java.lang.String r0 = "net"
            X.C1206780hVc.LIZJ(r2, r0, r1)
        L2a:
            boolean r0 = r6.LJIILL()
            if (r0 != 0) goto L3e
            boolean r0 = r6.LJIILIIL()
            if (r0 != 0) goto L3e
            r3.onSuccess()
        L39:
            X.C1C7U.LIZIZ(r5)
            r0 = 0
            return r0
        L3e:
            int r0 = r3.LLILZIL
            if (r0 != r4) goto L76
            int r1 = r3.LLILZ
            r0 = 1
            if (r1 == r0) goto L49
            if (r1 != 0) goto L76
        L49:
            java.lang.String r1 = r3.LLILZLL
            java.lang.String r0 = "music_dsp"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L76
            int r1 = r3.LLJ
            int r0 = r1 + 1
            r3.LLJ = r0
            r0 = 3
            if (r1 >= r0) goto L76
            r1 = 3000(0xbb8, double:1.482E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.11IB r1 = X.C11NZ.LJLJJLL(r1, r0)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r2 = r1.LJL(r0)
            X.0P4t r1 = new X.0P4t
            r0 = 2
            r1.<init>(r3, r0)
            r2.LIZIZ(r1)
            goto L39
        L76:
            java.lang.Exception r0 = r6.LJIIJJI()
            r3.onFailed(r0)
            goto L39
        L7e:
            java.lang.Exception r0 = r6.LJIIJJI()
            X.C1206780hVc.LIZIZ(r2, r0)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C638970P4l.then$2(X.0P4l, X.15O7):java.lang.Object");
    }
}
