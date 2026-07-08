package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0q5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536490q5P extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ Function2<byte[], String, Unit> LL;
    public final /* synthetic */ C1536520q5S LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Iterator<String> LLILZ;
    public final /* synthetic */ IResourceServiceX LLILZIL;
    public final /* synthetic */ RequestParams LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1536490q5P(Function2<? super byte[], ? super String, Unit> function2, C1536520q5S c1536520q5S, long j, Iterator<String> it2, IResourceServiceX iResourceServiceX, RequestParams requestParams, String str, String str2) {
        super(1);
        this.LL = function2;
        this.LLILLJJLI = c1536520q5S;
        this.LLILLL = j;
        this.LLILZ = it2;
        this.LLILZIL = iResourceServiceX;
        this.LLILZLL = requestParams;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) throws JSONException {
        C1533790q13 c1533790q132 = c1533790q13;
        byte[] bArrLJIIIZ = c1533790q132.LJIIIZ();
        if (bArrLJIIIZ != null) {
            Function2<byte[], String, Unit> function2 = this.LL;
            C1536520q5S c1536520q5S = this.LLILLJJLI;
            long j = this.LLILLL;
            function2.invoke(bArrLJIIIZ, null);
            boolean z = C1536390q5F.LIZ;
            C1536390q5F.LJ(c1536520q5S.LIZIZ, c1533790q132, null, true, j);
        } else {
            Iterator<String> it2 = this.LLILZ;
            Function2<byte[], String, Unit> function22 = this.LL;
            C1536520q5S c1536520q5S2 = this.LLILLJJLI;
            long j2 = this.LLILLL;
            IResourceServiceX iResourceServiceX = this.LLILZIL;
            RequestParams requestParams = this.LLILZLL;
            String str = this.LLIZ;
            String str2 = this.LLIZLLLIL;
            if (it2.hasNext()) {
                RunnableC1536470q5N.LIZIZ(c1536520q5S2, iResourceServiceX, requestParams, str, str2, function22, j2, it2, it2.next());
            } else {
                function22.invoke(null, c1533790q132.LIZLLL.toString());
                boolean z2 = C1536390q5F.LIZ;
                C1536390q5F.LJ(c1536520q5S2.LIZIZ, c1533790q132, null, false, j2);
            }
        }
        return Unit.LIZ;
    }
}
