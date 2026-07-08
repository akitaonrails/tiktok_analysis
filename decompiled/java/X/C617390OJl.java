package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestSettingItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617390OJl {
    public final BulletinPeriodicRequestSettingItem LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public final Function2<Long, InterfaceC1364105Vn<? super BulletinFetchEventResponse>, Object> LIZLLL;
    public final Function1<List<BulletinFetchEvent>, Unit> LJ;
    public final InterfaceC497601wk LJFF;
    public AnonymousClass0956 LJI;

    public final boolean LIZ() {
        long j = this.LIZIZ;
        if (j == 0) {
            return false;
        }
        long j2 = this.LIZJ;
        return (j2 == 0 || j2 <= j || this.LIZLLL == null || this.LJ == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C617410OJn
            if (r0 == 0) goto L64
            r5 = r7
            X.0OJn r5 = (X.C617410OJn) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L49
            if (r0 != r3) goto L6a
            X.C155000ia.LIZIZ(r2)
        L22:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse r2 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse) r2
            if (r2 == 0) goto L46
            java.lang.Long r0 = r2.currentTimeStamp
            if (r0 == 0) goto L30
            long r0 = r0.longValue()
            r6.LIZJ = r0
        L30:
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent> r1 = r2.eventsList
            if (r1 == 0) goto L46
            boolean r0 = X.C866950Xzh.LIZIZ(r1)
            if (r0 == 0) goto L46
            java.lang.String r0 = "BulletinSubscribePeriodicRequestHandler + afterPollingCallback"
            X.C0OPX.LJII(r0)
            kotlin.jvm.functions.Function1<java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent>, kotlin.Unit> r0 = r6.LJ
            if (r0 == 0) goto L46
            r0.invoke(r1)
        L46:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L49:
            X.C155000ia.LIZIZ(r2)
            java.lang.String r0 = "BulletinSubscribePeriodicRequestHandler + fetchBulletinEvents"
            X.C0OPX.LJII(r0)
            kotlin.jvm.functions.Function2<java.lang.Long, X.05Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse>, java.lang.Object> r2 = r6.LIZLLL
            if (r2 == 0) goto L46
            long r0 = r6.LIZJ
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r5.LLILLL = r3
            java.lang.Object r2 = r2.invoke(r0, r5)
            if (r2 != r4) goto L22
            return r4
        L64:
            X.0OJn r5 = new X.0OJn
            r5.<init>(r6, r7)
            goto L12
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C617390OJl.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C617390OJl(BulletinPeriodicRequestSettingItem bulletinPeriodicRequestSettingItem, long j, long j2, C0OJP c0ojp, C0OKD c0okd, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = bulletinPeriodicRequestSettingItem;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c0ojp;
        this.LJ = c0okd;
        this.LJFF = interfaceC497601wk;
    }
}
