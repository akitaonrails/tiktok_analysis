package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dEE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042240dEE extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C013C LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042240dEE(Aweme aweme, C013C c013c) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        AwemeRawAd awemeRawAd;
        String str2 = str;
        C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
        Aweme aweme = this.LL;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (C1042130dE3.LJIIJJI(awemeRawAd, str2, false)) {
            this.LLILLJJLI.element = true;
        }
        return Boolean.valueOf(this.LLILLJJLI.element);
    }
}
