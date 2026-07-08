package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913390ZsP extends C09AY implements Function0<IIMContactUtilService> {
    public C913390ZsP() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMContactUtilService invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IIMContactUtilService.class);
    }
}
