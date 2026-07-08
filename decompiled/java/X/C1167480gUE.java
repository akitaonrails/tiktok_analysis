package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167480gUE extends C09AY implements Function1<C1167470gUD, C1167470gUD> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ UrlModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167480gUE(String str, UrlModel urlModel, int i, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = urlModel;
        this.LLILLL = i;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1167470gUD invoke(C1167470gUD c1167470gUD) {
        C1167470gUD c1167470gUD2 = c1167470gUD;
        String str = this.LL;
        if (str == null) {
            str = c1167470gUD2.LLILLL;
        }
        UrlModel urlModel = c1167470gUD2.LLILLJJLI;
        if (urlModel == null) {
            urlModel = this.LLILLJJLI;
        }
        int i = this.LLILLL;
        if (i == 0) {
            i = c1167470gUD2.LLILZIL;
        }
        return C1167470gUD.LIZ(c1167470gUD2, null, urlModel, str, this.LLILZ, i, 0, false, null, null, 0, null, null, null, null, null, 32737);
    }
}
