package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC330680Cxm extends InterfaceC149400hg {
    void LLLLLZL(Aweme aweme, InterfaceC330550CxZ interfaceC330550CxZ, List list);

    InterfaceC330550CxZ LLLZ(String str, Aweme aweme, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z);

    boolean LLLZL(Aweme aweme);

    InterfaceC330550CxZ O(String str, Aweme aweme, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z);

    boolean e(Aweme aweme);

    C330530CxX getCache();
}
