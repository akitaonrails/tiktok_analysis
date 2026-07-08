package X;

import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729290Sj9 extends C09AY implements Function0<IStoryPublishService> {
    public final /* synthetic */ C729440SjO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729290Sj9(C729440SjO c729440SjO) {
        super(0);
        this.LL = c729440SjO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IStoryPublishService invoke() {
        return ((IExternalService) this.LL.LLJI.getValue()).storyService().storyPublishService();
    }
}
