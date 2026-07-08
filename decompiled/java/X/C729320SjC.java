package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729320SjC extends C09AY implements Function0<IStoryThoughtMyDataManager> {
    public C729320SjC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStoryThoughtMyDataManager invoke() {
        return ServiceManager.get().getService(IStoryThoughtMyDataManager.class);
    }
}
