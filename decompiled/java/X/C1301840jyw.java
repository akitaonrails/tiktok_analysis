package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301840jyw extends C09AY implements Function0<InterfaceC1320200kSY<Object>> {
    public final /* synthetic */ C1325710kbR LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1322390kW5 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1324680kZm LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301840jyw(C1325710kbR c1325710kbR, boolean z, String str, C1322390kW5 c1322390kW5, String str2, InterfaceC1324680kZm interfaceC1324680kZm, long j) {
        super(0);
        this.LL = c1325710kbR;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c1322390kW5;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC1324680kZm;
        this.LLIZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1320200kSY<Object> invoke() {
        String str;
        final C1489605sM c1489605sM = new C1489605sM(this.LLILZ, this.LLILZIL, this.LLILZLL);
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(this.LL, "preload_memoryContext");
        final InterfaceC1324680kZm interfaceC1324680kZm = this.LLILZLL;
        final long j = this.LLIZ;
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0jws
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                String message;
                if (interfaceC1320200kSY != null) {
                    InterfaceC1631620sYq<Long, Boolean, String, Unit> interfaceC1631620sYq = c1489605sM;
                    Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - j);
                    Boolean bool = Boolean.FALSE;
                    Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                    if (thLIZLLL != null) {
                        message = thLIZLLL.getMessage();
                    } else {
                        message = null;
                    }
                    interfaceC1631620sYq.invoke(lValueOf, bool, message);
                }
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                C1323050kX9<AbstractC1327750kej> c1323050kX9LIZLLL;
                AnonymousClass0956 anonymousClass0956LIZLLL;
                if (interfaceC1320200kSY != null) {
                    InterfaceC1324680kZm interfaceC1324680kZm2 = interfaceC1324680kZm;
                    InterfaceC1631620sYq<Long, Boolean, String, Unit> interfaceC1631620sYq = c1489605sM;
                    long j2 = j;
                    if (!interfaceC1320200kSY.LIZ()) {
                        return;
                    }
                    C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
                    if (result != null) {
                        ConcurrentHashMap<String, C314730CVj> concurrentHashMap = C314720CVi.LIZ;
                        String string = interfaceC1324680kZm2.toString();
                        if (C314720CVi.LIZIZ && (c1323050kX9LIZLLL = result.LIZLLL()) != null) {
                            if (C314720CVi.LIZJ > 0) {
                                anonymousClass0956LIZLLL = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C313950CSj(string, null), 3);
                            } else {
                                anonymousClass0956LIZLLL = null;
                            }
                            ConcurrentHashMap<String, C314730CVj> concurrentHashMap2 = C314720CVi.LIZ;
                            concurrentHashMap2.put(string, new C314730CVj(c1323050kX9LIZLLL, anonymousClass0956LIZLLL));
                            if (concurrentHashMap2.size() > C314720CVi.LIZLLL) {
                                C1018703yb.LJ("rd_tiktokec_image_memory_keep", C2097908Jt.LIZJ(new Pair("keep_count", Integer.valueOf(concurrentHashMap2.size()))));
                            }
                        }
                    }
                    C1323050kX9<AbstractC1327750kej> result2 = interfaceC1320200kSY.getResult();
                    if (result2 != null) {
                        try {
                            if (result2.get() != null) {
                                interfaceC1631620sYq.invoke(Long.valueOf(SystemClock.elapsedRealtime() - j2), Boolean.TRUE, null);
                            }
                            C1323050kX9.LJII(result2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1323050kX9.LJII(result2);
                            throw th;
                        }
                    }
                }
            }
        }, C15O7.LJI);
        if (this.LLILLJJLI && (str = this.LLILLL) != null) {
            C1326660kcy.LIZ.LIZ(str, interfaceC1320200kSYLJI);
        }
        return interfaceC1320200kSYLJI;
    }
}
