package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PKM<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C0PKM<T> LIZ = new C0PKM<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        C0PHQ c0phq = C0PHQ.LIZ;
        if (!Intrinsics.LJFF(((C0PLT) interfaceC594520NTm).getAweme(), aweme)) {
            return null;
        }
        return c0phq;
    }

    @Override // X.C0PBX
    public final C0PBZ LIZ(SearchMixFeed searchMixFeed, Aweme aweme, C0PHW c0phw) {
        return LIZIZ(searchMixFeed, aweme);
    }
}
