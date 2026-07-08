package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643210PKt<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C643210PKt<T> LIZ = new C643210PKt<>();

    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        Aweme aweme2;
        C0PHQ c0phq = C0PHQ.LIZ;
        EComShopCardStruct eComShopCardStruct = ((SearchMixFeedBase) interfaceC594520NTm).shopCard;
        if (eComShopCardStruct != null) {
            aweme2 = eComShopCardStruct.liveEntity;
        } else {
            aweme2 = null;
        }
        if (!Intrinsics.LJFF(aweme2, aweme)) {
            return null;
        }
        return c0phq;
    }

    @Override // X.C0PBX
    public final C0PBZ LIZ(SearchMixFeed searchMixFeed, Aweme aweme, C0PHW c0phw) {
        return LIZIZ(searchMixFeed, aweme);
    }
}
