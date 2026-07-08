package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263241DiE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedUIContentAssem<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263241DiE(ReusedUIContentAssem<RECEIVER> reusedUIContentAssem) {
        super(0);
        this.LL = reusedUIContentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onResume();
        return Unit.LIZ;
    }
}
