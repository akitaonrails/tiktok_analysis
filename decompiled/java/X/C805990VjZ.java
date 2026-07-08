package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0VjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceItemFileCache$offerWith10kbLimit$2", f = "TraceItemFileCache.kt", l = {}, m = "invokeSuspend")
public final class C805990VjZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C806020Vjc LL;
    public final /* synthetic */ TraceItem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805990VjZ(C806020Vjc c806020Vjc, TraceItem traceItem, InterfaceC1364105Vn<? super C805990VjZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c806020Vjc;
        this.LLILLJJLI = traceItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805990VjZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TraceItemFileCache@d8bf.offerWith10kbLimit$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = false;
        try {
            C0VSJ c0vsjLIZLLL = this.LL.LIZLLL();
            if (c0vsjLIZLLL == null) {
                C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith10kbLimit$2");
                return true;
            }
            if (c0vsjLIZLLL.length() > 10240) {
                this.LL.LJ().storeInt("trace_write_index", (this.LL.LJ().getInt("trace_write_index", 0) + 1) % 100000);
                c0vsjLIZLLL = this.LL.LIZLLL();
                if (c0vsjLIZLLL == null) {
                    C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith10kbLimit$2");
                    return false;
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn((File) c0vsjLIZLLL, true), 8192);
            C806020Vjc c806020Vjc = this.LL;
            TraceItem traceItem = this.LLILLJJLI;
            Throwable th = null;
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c806020Vjc.LIZLLL.LJIILL(traceItem));
                sbLIZ.append('\n');
                bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ));
                bufferedWriter.flush();
                C2107108Nh.LIZ(bufferedWriter, null);
                z = true;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(bufferedWriter, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith10kbLimit$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
