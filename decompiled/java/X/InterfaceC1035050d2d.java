package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1035050d2d {
    void LIZ(Context context, Aweme aweme);

    void LIZIZ(Context context, Aweme aweme, FollowStatus followStatus);

    void LIZJ(Context context, Banner banner, int i);

    void LIZLLL(Context context, Aweme aweme);

    void LJ(Context context, Aweme aweme);

    void LJFF(Context context, Aweme aweme);

    void LJI(String str, String str2, JSONObject jSONObject, long j);

    void LJII(Collection collection);

    void LJIIIIZZ(Context context, Banner banner, int i);

    void LJIIIZ(Context context, AwemeRawAd awemeRawAd, String str);

    void LJIIJ(Context context, long j, String str, UrlModel urlModel);

    void LJIIJJI(Context context, Aweme aweme);

    void LJIIL(Context context, JSONObject jSONObject, Aweme aweme);

    void LJIILIIL(Context context, Aweme aweme);

    void LJIILJJIL(Context context, Aweme aweme);

    void LJIILL(Context context, Aweme aweme);

    void LJIILLIIL(Context context, Aweme aweme);

    void LJIIZILJ(Context context, Aweme aweme);

    void LJIJ(Context context, Aweme aweme);

    JSONObject LJIJI(Context context, String str, JSONObject jSONObject);

    void LJIJJ(Context context, Aweme aweme);

    void LJIJJLI(Context context, long j, String str, UrlModel urlModel, String str2);

    void LJIL(Context context, Aweme aweme);

    void LJJ(Context context, Aweme aweme, FollowStatus followStatus);

    void LJJI(Context context, Aweme aweme, Map<String, Object> map, String str, String str2);

    void LJJIFFI(long j, Context context, String str, String str2, String str3, JSONObject jSONObject);

    void LJJII(Context context, Aweme aweme, Map<String, String> map);

    void LJJIII(Context context, Aweme aweme);

    void LJJIIJ(Context context, Aweme aweme);

    void LJJIIJZLJL(Context context, Aweme aweme);

    void LJJIIZ(Context context, Aweme aweme);

    void LJJIIZI(Context context, long j, String str, UrlModel urlModel);

    void LJJIJ(Context context, long j, String str, UrlModel urlModel);

    void LJJIJIIJI(Context context, Aweme aweme);

    void LJJIJIIJIL(Context context, Aweme aweme);

    long LJJIJIL(AwemeRawAd awemeRawAd);
}
