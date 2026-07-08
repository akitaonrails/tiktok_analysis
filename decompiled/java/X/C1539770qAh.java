package X;

import com.bytedance.lynx.hybrid.ssr.ILynxSSRDebugger;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539770qAh extends C09AY implements Function1<C1539910qAv, Unit> {
    public final /* synthetic */ LynxView LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539770qAh(LynxView lynxView, Function0<Unit> function0) {
        super(1);
        this.LL = lynxView;
        this.LLILLJJLI = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1539910qAv c1539910qAv) {
        C1539910qAv c1539910qAv2 = c1539910qAv;
        ILynxSSRDebugger iLynxSSRDebugger = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
        if (iLynxSSRDebugger != null) {
            iLynxSSRDebugger.LIZLLL();
        }
        this.LL.updateGlobalProps(C2097908Jt.LIZJ(new Pair("ssrFallbackMode", Integer.valueOf(c1539910qAv2.LIZ.getCode()))));
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
