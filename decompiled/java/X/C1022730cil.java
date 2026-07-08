package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022730cil extends C09AY implements Function0<IAwemeService> {
    public C1022730cil() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.awemeservice.api.IAwemeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAwemeService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
    }
}
