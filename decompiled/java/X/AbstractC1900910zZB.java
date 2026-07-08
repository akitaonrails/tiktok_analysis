package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import urg.a;
import urg.a.b;

/* JADX INFO: renamed from: X.0zZB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1900910zZB<HOLDER extends a.b<CACHE_DATA>, CACHE_DATA> {
    public static final /* synthetic */ int LIZIZ = 0;
    public HOLDER LIZ;

    public final synchronized void LIZ() {
        AbstractC1900890zZ9 abstractC1900890zZ9LJ = LJ();
        if (abstractC1900890zZ9LJ != null) {
            abstractC1900890zZ9LJ.LJ(null);
        }
    }

    public abstract HOLDER LIZIZ(String str, String str2);

    public abstract String LJFF();

    public abstract boolean LJI();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:4:0x0003, B:6:0x000a, B:7:0x000c, B:8:0x000f, B:10:0x0025, B:12:0x002d, B:14:0x0031, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:22:0x0045, B:24:0x0059), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final HOLDER LJ() {
        /*
            r9 = this;
            java.lang.Class<X.0zZ9> r8 = X.AbstractC1900890zZ9.class
            monitor-enter(r8)
            boolean r0 = r9.LJI()     // Catch: java.lang.Throwable -> L5e
            r7 = 0
            if (r0 != 0) goto Lf
            r9.LIZ = r7     // Catch: java.lang.Throwable -> L5e
        Lc:
            HOLDER extends urg.a$b<CACHE_DATA> r0 = r9.LIZ     // Catch: java.lang.Throwable -> L5e
            goto L5c
        Lf:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r0.getCurUserId()     // Catch: java.lang.Throwable -> L5e
            X.0zpR r0 = X.C1910990zpR.LIZIZ     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r0.LIZ()     // Catch: java.lang.Throwable -> L5e
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r6)     // Catch: java.lang.Throwable -> L5e
            r3 = 0
            if (r0 == 0) goto L59
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L5e
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L59
            HOLDER extends urg.a$b<CACHE_DATA> r0 = r9.LIZ     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L5e
        L33:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L45
            HOLDER extends urg.a$b<CACHE_DATA> r0 = r9.LIZ     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L3f
            java.lang.String r7 = r0.LIZIZ     // Catch: java.lang.Throwable -> L5e
        L3f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r7)     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto Lc
        L45:
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r9.LJFF()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "uid or language changed. created new DataHolder"
            X.C1720106oR.LJI(r1, r0)     // Catch: java.lang.Throwable -> L5e
            X.0zZ9 r0 = r9.LIZIZ(r6, r5)     // Catch: java.lang.Throwable -> L5e
            r9.LIZ = r0     // Catch: java.lang.Throwable -> L5e
            goto Lc
        L57:
            r0 = r7
            goto L33
        L59:
            r9.LIZ = r7     // Catch: java.lang.Throwable -> L5e
            goto Lc
        L5c:
            monitor-exit(r8)
            return r0
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1900910zZB.LJ():X.0zZ9");
    }

    public final synchronized void LIZJ(BaseNotice baseNotice) {
        AbstractC1900890zZ9 abstractC1900890zZ9LJ = LJ();
        if (abstractC1900890zZ9LJ != null) {
            abstractC1900890zZ9LJ.LIZ(baseNotice);
        }
    }

    public final synchronized void LIZLLL(NoticeDisableActionInfo noticeDisableActionInfo, boolean z) {
        AbstractC1900890zZ9 abstractC1900890zZ9LJ = LJ();
        if (abstractC1900890zZ9LJ != null) {
            abstractC1900890zZ9LJ.LIZIZ(noticeDisableActionInfo, z);
        }
    }
}
