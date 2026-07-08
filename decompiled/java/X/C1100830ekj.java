package X;

import com.bytedance.android.livesdk.comp.impl.debug.DebugService;
import debugtool.DebugToolsHelper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ekj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100830ekj extends C09AY implements Function0<InterfaceC2203131BKl> {
    public final /* synthetic */ DebugService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100830ekj(DebugService debugService) {
        super(0);
        this.LL = debugService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2203131BKl invoke() {
        DebugToolsHelper debugToolsHelper = this.LL.LL;
        if (debugToolsHelper != null) {
            return debugToolsHelper.LLILZIL;
        }
        return null;
    }
}
