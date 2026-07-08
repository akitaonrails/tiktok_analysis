package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0VjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceItemFileCache$offerWith4kbLimit$2", f = "TraceItemFileCache.kt", l = {}, m = "invokeSuspend")
public final class C805980VjY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C806020Vjc LL;
    public final /* synthetic */ TraceItem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805980VjY(C806020Vjc c806020Vjc, TraceItem traceItem, InterfaceC1364105Vn<? super C805980VjY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c806020Vjc;
        this.LLILLJJLI = traceItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805980VjY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0VSJ c0vsjLIZLLL;
        C1C7U.LIZ("TraceItemFileCache@d8bf.offerWith4kbLimit$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        try {
            c0vsjLIZLLL = this.LL.LIZLLL();
        } catch (IOException e) {
            e = e;
        }
        if (c0vsjLIZLLL == null) {
            C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith4kbLimit$2");
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(GsonProtectorUtils.toJson(this.LL.LIZLLL, this.LLILLJJLI));
        sbLIZ.append('\n');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int length = strLIZIZ.getBytes(Charsets.UTF_8).length;
        if (length > 4096) {
            C806020Vjc c806020Vjc = this.LL;
            TraceItem traceItem = this.LLILLJJLI;
            c806020Vjc.getClass();
            C806020Vjc.LJI(jCurrentTimeMillis, traceItem);
            C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith4kbLimit$2");
            return true;
        }
        if (c0vsjLIZLLL.length() + ((long) length) > 4096) {
            this.LL.LJ().storeInt("trace_write_index", (this.LL.LJ().getInt("trace_write_index", 0) + 1) % 100000);
            c0vsjLIZLLL = this.LL.LIZLLL();
            if (c0vsjLIZLLL == null) {
                C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith4kbLimit$2");
                return false;
            }
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn((File) c0vsjLIZLLL, true), 8192);
        Throwable th = null;
        try {
            bufferedWriter.write(strLIZIZ);
            bufferedWriter.flush();
            C2107108Nh.LIZ(bufferedWriter, null);
            C806020Vjc c806020Vjc2 = this.LL;
            long length2 = c0vsjLIZLLL.length();
            c806020Vjc2.getClass();
            C806020Vjc.LJII(jCurrentTimeMillis, length2, CardStruct.IStatusCode.DEFAULT);
            z = true;
            Boolean boolValueOf = Boolean.valueOf(z);
            C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith4kbLimit$2");
            return boolValueOf;
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
                            try {
                                C2107108Nh.LIZ(bufferedWriter, th);
                                throw th;
                            } catch (IOException e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                this.LL.getClass();
                                C806020Vjc.LJII(jCurrentTimeMillis, -1L, "1");
                                Boolean boolValueOf2 = Boolean.valueOf(z);
                                C1C7U.LIZIZ("TraceItemFileCache@d8bf.offerWith4kbLimit$2");
                                return boolValueOf2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
