package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042140dE4 extends C09AY implements Function1<Map<String, ? extends List<? extends SSPResponse.Rule>>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ AwemeRawAd LLILZ;
    public final /* synthetic */ C259800zU<C1042150dE5> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042140dE4(String str, String str2, long j, AwemeRawAd awemeRawAd, C259800zU<C1042150dE5> c259800zU) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = awemeRawAd;
        this.LLILZIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends List<? extends SSPResponse.Rule>> map) {
        C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        long j = this.LLILLL;
        AwemeRawAd awemeRawAd = this.LLILZ;
        c1042130dE3.getClass();
        C1042130dE3.LJIIIIZZ(str, map, str2, j, awemeRawAd);
        C1042150dE5 c1042150dE5 = this.LLILZIL.element;
        if (c1042150dE5 != null) {
            c1042150dE5.LIZ();
        }
        return Unit.LIZ;
    }
}
