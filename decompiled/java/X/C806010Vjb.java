package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0Vjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceItemFileCache$getCurrentBlock$2", f = "TraceItemFileCache.kt", l = {}, m = "invokeSuspend")
public final class C806010Vjb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<TraceItem>>, Object> {
    public final /* synthetic */ C806020Vjc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806010Vjb(C806020Vjc c806020Vjc, InterfaceC1364105Vn<? super C806010Vjb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c806020Vjc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806010Vjb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BufferedReader bufferedReader;
        C806020Vjc c806020Vjc;
        boolean z;
        TraceItem traceItem;
        C1C7U.LIZ("TraceItemFileCache@d8bf.getCurrentBlock$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0VSJ c0vsjLIZJ = this.LL.LIZJ();
        Throwable th = null;
        if (c0vsjLIZJ != null && c0vsjLIZJ.isFile() && c0vsjLIZJ.exists()) {
            int i = this.LL.LJ().getInt("trace_read_index", 0);
            int i2 = this.LL.LJ().getInt("trace_write_index", 0);
            if (i == i2) {
                this.LL.LJ().storeInt("trace_write_index", (i2 + 1) % 100000);
            }
            ArrayList arrayList = new ArrayList();
            try {
                bufferedReader = new BufferedReader(new C0VSF(c0vsjLIZJ), 8192);
                c806020Vjc = this.LL;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                new C259800zU();
                C118300cf c118300cf = new C118300cf();
                do {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    c118300cf.element++;
                    try {
                        if (a0.LJLIIIL(line).toString().length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && (traceItem = (TraceItem) c806020Vjc.LIZLLL.LJII(line, TraceItem.class)) != null) {
                            Boolean.valueOf(arrayList.add(traceItem));
                        }
                    } catch (s e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                } while (c118300cf.element <= 1000);
                C2107108Nh.LIZ(bufferedReader, null);
                C1C7U.LIZIZ("TraceItemFileCache@d8bf.getCurrentBlock$2");
                return arrayList;
            } finally {
            }
        } else {
            C1C7U.LIZIZ("TraceItemFileCache@d8bf.getCurrentBlock$2");
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<TraceItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
