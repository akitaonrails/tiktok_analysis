package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0RI6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RI6 {
    public static final void LIZ(Assembler assembler, BaseCellContentComponent baseCellContentComponent, Function1 function1) {
        Object c098200Yq;
        Object c098200Yq2;
        boolean zBooleanValue;
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        C0RUD c0rud = new C0RUD();
        function1.invoke(c0rud);
        ReusedUIContentAssem<? extends C03H5> reusedUIContentAssem = c0rud.LLJ;
        if (reusedUIContentAssem == null) {
            reusedUIContentAssem = (ReusedUIContentAssem) C13LP.LJJJJZI(c0rud.LIZIZ(c0rud.LL.LL));
        }
        Object obj = null;
        try {
            if ((reusedUIContentAssem instanceof C0RUJ) && (c0ruj2 = (C0RUJ) reusedUIContentAssem) != null) {
                c098200Yq = c0ruj2.T1();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        try {
            if ((reusedUIContentAssem instanceof C0RUJ) && (c0ruj = (C0RUJ) reusedUIContentAssem) != null) {
                c098200Yq2 = Boolean.valueOf(c0ruj.m8());
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        C0RUB c0rubLJI = c0rud.LJI(str, zBooleanValue);
        EnumC695670RQn enumC695670RQn = c0rubLJI.LIZ;
        int i = C693540RIi.LIZ[enumC695670RQn.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                assembler.LQ2(baseCellContentComponent, new AwS377S0200000_11(c0rud, (C0RUD) reusedUIContentAssem, (ReusedUIContentAssem<? extends C03H5>) 151));
                C0RUC.LIZLLL(C724240Sb0.LIZ(baseCellContentComponent), enumC695670RQn, c0rubLJI, reusedUIContentAssem, new AwS412S0200000_11(baseCellContentComponent, reusedUIContentAssem, 95));
            } else {
                assembler.LQ2(baseCellContentComponent, new C0RE7(c0rud, reusedUIContentAssem));
            }
        }
    }
}
