package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612990O2n extends C09AY implements Function0<String> {
    public final /* synthetic */ ReusedAssem<?> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612990O2n(ReusedAssem<?> reusedAssem, boolean z) {
        super(0);
        this.LL = reusedAssem;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" --- component_clazz: ");
        sbLIZ.append(C13LE.LIZ(this.LL.getClass()).LJI());
        sbLIZ.append(" ---- doModifyActive: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
