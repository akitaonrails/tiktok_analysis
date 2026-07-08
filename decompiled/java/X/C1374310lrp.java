package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374310lrp extends C09AY implements Function1<C1374320lrq, Unit> {
    public final /* synthetic */ C1374300lro LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ SharePackage LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374310lrp(C1374300lro c1374300lro, Aweme aweme, String str, String str2, String str3, int i, SharePackage sharePackage, int i2) {
        super(1);
        this.LL = c1374300lro;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = i;
        this.LLIZ = sharePackage;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1374320lrq c1374320lrq) {
        C1374300lro c1374300lro = this.LL;
        Aweme aweme = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        int i = this.LLILZLL;
        SharePackage sharePackage = this.LLIZ;
        int i2 = this.LLIZLLLIL;
        c1374300lro.getClass();
        C1374300lro.LIZIZ(aweme, str, str2, str3, i, sharePackage, i2);
        return Unit.LIZ;
    }
}
