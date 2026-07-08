package X;

import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.strategies.CompileStrategyJsonStruct;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440770nb1<R extends BaseCompileConfigParams> {
    public final CompileStrategyJsonStruct LIZ;
    public final Function1<InterfaceC1440780nb2<R>, InterfaceC1440780nb2<R>> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1440770nb1)) {
            return false;
        }
        C1440770nb1 c1440770nb1 = (C1440770nb1) obj;
        return Intrinsics.LJFF(this.LIZ, c1440770nb1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1440770nb1.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompileStrategyCreatorParams(jsonStruct=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creator=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1440770nb1(CompileStrategyJsonStruct compileStrategyJsonStruct, Function1<? super InterfaceC1440780nb2<R>, ? extends InterfaceC1440780nb2<R>> function1) {
        this.LIZ = compileStrategyJsonStruct;
        this.LIZIZ = function1;
    }
}
