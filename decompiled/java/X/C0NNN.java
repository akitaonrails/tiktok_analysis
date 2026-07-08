package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.countdown.CountDownManager$startCountDown$1", f = "CountDownManager.kt", l = {121}, m = "invokeSuspend")
public final class C0NNN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NOH LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NNN(C0NOH c0noh, long j, InterfaceC1364105Vn<? super C0NNN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0noh;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NNN c0nnn = new C0NNN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0nnn.LLILLJJLI = obj;
        return c0nnn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        long j;
        C1C7U.LIZ("CountDownManager@6f96.startCountDown$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (this.LLILLL.LIZJ != 3 && C2296808zG.LJI(interfaceC497601wk)) {
            this.LLILLL.LIZIZ = SystemClock.elapsedRealtime();
            C0NOH c0noh = this.LLILLL;
            long j2 = c0noh.LJFF;
            long j3 = c0noh.LJI;
            long j4 = c0noh.LIZIZ;
            boolean z = false;
            if (j2 <= j4 && j4 < j3) {
                z = true;
            }
            if (z) {
                c0noh.LIZJ = 2;
                j = j3 - j4;
                c0noh.LIZ = j;
                long j5 = this.LLILZ;
                if (j > j5) {
                    j = j5;
                }
            } else if (j4 >= j3) {
                c0noh.LIZ = 0L;
                c0noh.LIZJ = 3;
                j = -1;
            } else {
                c0noh.LIZ = j3 - j4;
                c0noh.LIZJ = 4;
                j = j2 - j4;
            }
            Iterator it2 = ((ArrayList) c0noh.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1631620sYq) it2.next()).invoke(Integer.valueOf(c0noh.LIZJ), Integer.valueOf(c0noh.LIZLLL), Long.valueOf(c0noh.LIZ));
            }
            c0noh.LIZLLL = c0noh.LIZJ;
            if (j <= 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CountDownManager@6f96.startCountDown$1");
                return unit;
            }
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("CountDownManager@6f96.startCountDown$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CountDownManager@6f96.startCountDown$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
