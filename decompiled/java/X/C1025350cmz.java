package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0cmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025350cmz implements IAdTaskDepend {
    public static final C1025350cmz LIZIZ = new C1025350cmz();
    public final /* synthetic */ IAdTaskDepend LIZ = AdTaskDependImpl.LIZLLL();

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZ(Context context, AwemeRawAd awemeRawAd, String str, String str2, int i) {
        return this.LIZ.LIZ(context, awemeRawAd, str, str2, i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZIZ(Context context, String str) {
        return this.LIZ.LIZIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZJ(Context context, Aweme aweme, String str) {
        return this.LIZ.LIZJ(context, aweme, str);
    }
}
