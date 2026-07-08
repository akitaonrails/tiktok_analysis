package X;

import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729280Sj8 extends C09AY implements Function0<IStoryDraftService> {
    public final /* synthetic */ C729440SjO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729280Sj8(C729440SjO c729440SjO) {
        super(0);
        this.LL = c729440SjO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IStoryDraftService invoke() {
        return ((IExternalService) this.LL.LLJI.getValue()).storyService().storyDraftService();
    }
}
