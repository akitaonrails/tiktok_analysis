package X;

import android.os.CountDownTimer;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.19LK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LK extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onTick$1(C19LK c19lk, long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.$t) {
            case 0:
                onFinish$0(this);
                break;
            case 1:
                onFinish$1(this);
                break;
            case 2:
                onFinish$2(this);
                break;
            default:
                super.onFinish();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.$t) {
            case 0:
                onTick$0(this, j);
                break;
            case 1:
                onTick$1(this, j);
                break;
            case 2:
                onTick$2(this, j);
                break;
            default:
                super.onTick(j);
                break;
        }
    }

    public static final void onFinish$0(C19LK c19lk) {
        C21177417u8 c21177417u8 = (C21177417u8) c19lk.l0;
        c21177417u8.LJ = 0L;
        c21177417u8.LIZJ.invoke();
    }

    public static final void onFinish$1(C19LK c19lk) {
        Function0<Unit> function0 = ((C21361718il) c19lk.l0).LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        ((C21361718il) c19lk.l0).LIZ = null;
    }

    public static final void onFinish$2(C19LK c19lk) {
        ((C18SI) c19lk.l0).c3(AFwS278S0000000_32.get$arr$(178));
        C18SI c18si = (C18SI) c19lk.l0;
        c18si.LLJL = C18SK.LL;
        c18si.zf();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19LK(C21361718il c21361718il, int i) {
        super(1500L, 3000L);
        this.$t = i;
        this.l0 = c21361718il;
    }

    public static final void onTick$0(C19LK c19lk, long j) {
        C21177417u8 c21177417u8 = (C21177417u8) c19lk.l0;
        c21177417u8.LJ = c21177417u8.LIZLLL - SystemClock.elapsedRealtime();
        C21177417u8 c21177417u82 = (C21177417u8) c19lk.l0;
        Function1<Long, Unit> function1 = c21177417u82.LIZIZ;
        long j2 = c21177417u82.LJ;
        if (j2 < 0) {
            j2 = 0;
        }
        function1.invoke(Long.valueOf(j2));
    }

    public static final void onTick$2(C19LK c19lk, long j) {
        C1777880wMk c1777880wMk;
        int i = 1;
        if (1 <= j && j < 10001) {
            int iCeil = (int) Math.ceil(j / 1000.0f);
            if (iCeil >= 1) {
                i = iCeil;
            }
            c1777880wMk = new C1777880wMk(i, Integer.valueOf(i));
        } else {
            c1777880wMk = null;
        }
        ((C18SI) c19lk.l0).c3(new AwS611S0100000_32(c1777880wMk, 356));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19LK(C18SI c18si, long j, int i) {
        super(j, 1000L);
        this.$t = i;
        this.l0 = c18si;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19LK(long j, C21177417u8 c21177417u8, long j2, int i) {
        super(j, j2);
        this.$t = i;
        this.l0 = c21177417u8;
    }
}
