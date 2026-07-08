package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Npj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC605970Npj<RESPONSE_DATA> {
    public final InterfaceC497601wk LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public AnonymousClass0956 LJ;

    public abstract Function1<RESPONSE_DATA, Unit> LIZJ();

    public abstract Map<String, String> LIZLLL();

    public abstract BulletinPeriodicRequestConfig LJ();

    public abstract Function1<InterfaceC1364105Vn<? super RESPONSE_DATA>, Object> LJFF();

    public abstract String LJI();

    public final void LJIIIZ() {
        AnonymousClass0956 anonymousClass0956;
        if (this.LIZIZ == 0 || this.LIZJ >= this.LIZLLL || LJFF() == null || LIZJ() == null || !LJIIIIZZ()) {
            return;
        }
        this.LIZJ = System.currentTimeMillis();
        AnonymousClass0956 anonymousClass09562 = this.LJ;
        if (anonymousClass09562 == null || anonymousClass09562.isCompleted() || ((anonymousClass0956 = this.LJ) != null && anonymousClass0956.isCancelled())) {
            this.LJ = C23250099c.LIZLLL(this.LIZ, C0PEM.LIZJ, null, new C605960Npi(this, null), 2);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJI());
        sbLIZ.append(" Job is already running.");
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJI());
        sbLIZ.append(" cleanup.");
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJ = null;
    }

    public final boolean LJIIIIZZ() {
        Integer num = LJ().enable;
        return num != null && num.intValue() == 1;
    }

    public final void LJIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJI());
        sbLIZ.append(" Job is cancel.");
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public AbstractC605970Npj(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C605980Npk
            if (r0 == 0) goto L60
            r4 = r6
            X.0Npk r4 = (X.C605980Npk) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L66
            X.C155000ia.LIZIZ(r1)
        L22:
            if (r1 == 0) goto L2d
            kotlin.jvm.functions.Function1 r0 = r5.LIZJ()
            if (r0 == 0) goto L2d
            r0.invoke(r1)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r5.LJIIIIZZ()
            if (r0 == 0) goto L2d
            X.0OPQ r0 = X.C0OPQ.LIZ
            java.util.Map r1 = r5.LIZLLL()
            r0.getClass()
            X.09Gk r0 = new X.09Gk
            r0.<init>()
            X.C0OPQ.LIZJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "bulletin_board_auto_poll_fetch"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.jvm.functions.Function1 r0 = r5.LJFF()
            if (r0 == 0) goto L2d
            r4.LLILLL = r2
            java.lang.Object r1 = r0.invoke(r4)
            if (r1 != r3) goto L22
            return r3
        L60:
            X.0Npk r4 = new X.0Npk
            r4.<init>(r5, r6)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC605970Npj.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final void LJII(int i, int i2, long j) {
        long jLongValue;
        if (!LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJI());
            sbLIZ.append(": PeriodicRequest is disable.");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LIZIZ = j;
        Long l = LJ().syncTotalTime;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LIZLLL = j + jLongValue;
        LIZLLL().put("is_author", String.valueOf(i));
        if (i != 1 && i2 != -1) {
            LIZLLL().put("is_subscribed", String.valueOf(i2));
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        Map<String, String> mapLIZLLL = LIZLLL();
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C0OPQ.LIZJ(c2344009Gk, mapLIZLLL);
        C20684815ws.LJIILLIIL("bulletin_board_auto_poll_trigger", c2344009Gk.LIZ);
    }
}
