package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.tiktok.commercialize.track.TikTokAdEventDependencyProvider;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017000cZW implements TikTokAdEventDependencyProvider {
    public static final C1017000cZW LIZ = new C1017000cZW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(23));

    @Override // com.ss.android.ugc.tiktok.commercialize.track.TikTokAdEventDependencyProvider
    public final AwemeRawAd LIZIZ(Aweme aweme) {
        return ((TikTokAdEventDependencyProvider) LIZIZ.getValue()).LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.tiktok.commercialize.track.TikTokAdEventDependencyProvider
    public final void LIZJ(String str, String str2, CommonAdData commonAdData, Map<String, ? extends Object> map) {
        ((TikTokAdEventDependencyProvider) LIZIZ.getValue()).LIZJ(str, str2, commonAdData, map);
    }

    @Override // com.ss.android.ugc.tiktok.commercialize.track.TikTokAdEventDependencyProvider
    public final void LIZ(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        ((TikTokAdEventDependencyProvider) LIZIZ.getValue()).LIZ(str, str2, str3, str4, str5, map);
    }
}
