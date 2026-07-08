package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxet.INxETDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1163404gq extends C09AY implements Function0<INxETDebugService> {
    public C1163404gq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.nxet.INxETDebugService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INxETDebugService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(INxETDebugService.class, false, false, false, 14, null);
    }
}
