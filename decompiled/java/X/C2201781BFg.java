package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201781BFg extends C09AY implements Function0<IShareStatusKeva> {
    public C2201781BFg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IShareStatusKeva invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IShareStatusKeva.class);
    }
}
