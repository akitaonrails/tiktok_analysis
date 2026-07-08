package X;

import com.ss.android.ugc.aweme.story.api.IStoryApi;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.model.ClientControlParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Shf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728370Shf {
    public static final C728370Shf LIZ = new C728370Shf();

    public static C11L6 LIZ(C728370Shf c728370Shf, String str, String str2, int i, Function1 function1, int i2) {
        IStoryApi iStoryApi;
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        c728370Shf.getClass();
        String jsonString = new ClientControlParams(Boolean.FALSE, null, null, null).toJsonString();
        if (function1 == null || (iStoryApi = (IStoryApi) function1.invoke(IStoryApi.class)) == null) {
            iStoryApi = StoryApi.LIZIZ;
        }
        return iStoryApi.getUserStoriesSingle(str, str2, i, jsonString).LJIILL(new C09JN() { // from class: X.00P7
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("StoryApiHelper@d003.getUserStories$1");
                C1C7U.LIZIZ("StoryApiHelper@d003.getUserStories$1");
            }
        });
    }
}
