package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Opb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631370Opb {
    /* JADX WARN: Incorrect types in method signature: <ITEM:Ljava/lang/Object;ASSEM:Lcom/bytedance/assem/arch/reused/ReusedAssem<+LX/03H5;>;:LX/0Rxx<TITEM;>;>(TASSEM;)TITEM; */
    public static final Object LIZ(ReusedAssem reusedAssem) {
        C724270Sb3 c724270Sb3 = reusedAssem.LLJI;
        if (c724270Sb3 != null) {
            return c724270Sb3.LL;
        }
        return null;
    }

    public static final int LIZIZ(ReusedAssem<? extends C03H5> reusedAssem) {
        Function0<Integer> function0;
        C724270Sb3 c724270Sb3 = reusedAssem.LLJI;
        if (c724270Sb3 != null && (function0 = c724270Sb3.LLIZ) != null) {
            return function0.invoke().intValue();
        }
        return -1;
    }
}
