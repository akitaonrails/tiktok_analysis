package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchAssemDebugService;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1156304fh extends C09AY implements Function0<List<? extends C13IQ<? extends ReusedAssem<?>>>> {
    public C1156304fh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C13IQ<? extends ReusedAssem<?>>> invoke() {
        List<C13IQ<? extends ReusedAssem<?>>> listLIZ;
        ISearchAssemDebugService iSearchAssemDebugService = (ISearchAssemDebugService) PluggableExtentionKt.pluggableSpi$default(ISearchAssemDebugService.class, false, false, false, 14, null);
        return (iSearchAssemDebugService == null || (listLIZ = iSearchAssemDebugService.LIZ()) == null) ? C13BV.INSTANCE : listLIZ;
    }
}
