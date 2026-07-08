package X;

import com.bytedance.pumbaa.apicalling.core.api.ProcessorConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC825270WYz {
    public final CopyOnWriteArrayList<C0WZ9> LIZ;
    public final CopyOnWriteArrayList<C0WZ9> LIZIZ;
    public final ThreadLocal<Boolean> LIZJ;

    public AbstractC825270WYz() {
        CopyOnWriteArrayList<C0WZ9> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LIZ = copyOnWriteArrayList;
        CopyOnWriteArrayList<C0WZ9> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        this.LIZIZ = copyOnWriteArrayList2;
        this.LIZJ = new ThreadLocal<>();
        C0WZ9 c0wz9 = new C0WZ9() { // from class: X.0WYu
            @Override // X.C0WZ9
            public final String name() {
                return "IdConversionHandler";
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
            @Override // X.C0WZ9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WZ0 LIZ(X.C825210WYt r9) {
                /*
                    Method dump skipped, instruction units count: 230
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C825220WYu.LIZ(X.0WYt):X.0WZ0");
            }
        };
        C825120WYk c825120WYk = new C825120WYk() { // from class: X.0WYm
            @Override // X.C0WZ9
            public final String name() {
                return "SystemApiContextHandler";
            }
        };
        copyOnWriteArrayList.add(c0wz9);
        copyOnWriteArrayList.add(c825120WYk);
        copyOnWriteArrayList2.add(c0wz9);
        copyOnWriteArrayList2.add(c825120WYk);
        final AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(243);
        copyOnWriteArrayList2.add(new C0WZ9(aFwS200S0000000_13) { // from class: X.0WZ6
            public final Function0<ProcessorConfig.GuardFields> LIZ;

            @Override // X.C0WZ9
            public final String name() {
                return "EventReportHandler";
            }

            {
                this.LIZ = aFwS200S0000000_13;
            }

            @Override // X.C0WZ9
            public final C0WZ0 LIZ(C825210WYt c825210WYt) {
                ProcessorConfig.GuardFields guardFieldsInvoke = this.LIZ.invoke();
                if (guardFieldsInvoke == null) {
                    return null;
                }
                C825240WYw.LIZIZ(guardFieldsInvoke, c825210WYt, null);
                return null;
            }
        });
    }

    public static void LIZ(C825210WYt c825210WYt) {
        Object obj;
        Map<String, Object> map = c825210WYt.LJIIIIZZ;
        if (map != null && (obj = map.get("origin_api_id")) != null) {
            obj.toString();
        }
    }

    public final C1280804zm LIZIZ(int i) {
        C0WZ5 c0wz5;
        Boolean boolValueOf;
        try {
            if (C0WZ7.LJ) {
                C0WZ5 c0wz52 = C0WZ7.LJFF;
                boolean z = true;
                if (c0wz52 == null || !c0wz52.enable || Intrinsics.LJFF(this.LIZJ.get(), Boolean.TRUE) || (c0wz5 = C0WZ7.LJFF) == null) {
                    return null;
                }
                List<Integer> list = c0wz5.interceptApiList;
                if (list != null && list.contains(Integer.valueOf(i))) {
                    boolValueOf = null;
                } else {
                    z = false;
                    boolValueOf = Boolean.valueOf(C0WZ1.LIZ(c0wz5, i));
                    if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                        return null;
                    }
                }
                return new C1280804zm(z, boolValueOf);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
