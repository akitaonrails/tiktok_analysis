package X;

import com.ss.android.ugc.tools.service.AiChatFeatureServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EP8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EP8 extends C09AY implements Function0<C21292118Ud> {
    public final /* synthetic */ AiChatFeatureServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1EP8(AiChatFeatureServiceImpl aiChatFeatureServiceImpl) {
        super(0);
        this.LL = aiChatFeatureServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C21292118Ud invoke() {
        if (this.LL.LIZIZ().isFeatureEnabled()) {
            return new C21292118Ud();
        }
        return null;
    }
}
