package X;

import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.experiment.InboxSkylightStoryCacheConfig;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxPreloadComponentV2;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0riy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599460riy extends C09AY implements Function0<C1599420riu> {
    public final /* synthetic */ StoryInboxPreloadComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599460riy(StoryInboxPreloadComponentV2 storyInboxPreloadComponentV2) {
        super(0);
        this.LL = storyInboxPreloadComponentV2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0riu] */
    @Override // kotlin.jvm.functions.Function0
    public final C1599420riu invoke() {
        final StoryInboxPreloadComponentV2 storyInboxPreloadComponentV2 = this.LL;
        return new Observer<C582610Mt9>() { // from class: X.0riu
            @Override // androidx.lifecycle.Observer
            public final void onChanged(C582610Mt9 c582610Mt9) {
                long j;
                MutableLiveData<C582610Mt9> mutableLiveData;
                VideoStateViewModel videoStateViewModel = storyInboxPreloadComponentV2.LL;
                if (videoStateViewModel != null && (mutableLiveData = videoStateViewModel.LLILZIL) != null) {
                    mutableLiveData.removeObserver(this);
                }
                StoryInboxPreloadComponentV2 storyInboxPreloadComponentV22 = storyInboxPreloadComponentV2;
                if (storyInboxPreloadComponentV22.LLILLL.compareAndSet(false, true)) {
                    if (C1209404oG.LIZ()) {
                        j = C1600360rkQ.LIZ().cacheInitDelayTime;
                    } else {
                        j = ((InboxSkylightStoryCacheConfig) C1599440riw.LIZIZ.getValue()).delayTime;
                    }
                    C1598930ri7 c1598930ri7 = C1598930ri7.LIZ;
                    c1598930ri7.resetDataCenterStatus();
                    long millis = TimeUnit.SECONDS.toMillis(j);
                    if (millis <= 0) {
                        c1598930ri7.preloadData();
                    } else {
                        C786410Ut5.LJLIIL(millis, (Handler) storyInboxPreloadComponentV22.LLILLJJLI.getValue(), new Runnable() { // from class: X.0hef
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("StoryInboxPreloadComponentV2@496c.startDataFetch$1");
                                try {
                                    C1598930ri7.LIZ.preloadData();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("StoryInboxPreloadComponentV2@496c.startDataFetch$1");
                            }
                        });
                    }
                }
            }
        };
    }
}
