package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0q5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536510q5R extends C09AY implements Function1<C1532310pyf, Unit> {
    public final /* synthetic */ Runnable LL;
    public final /* synthetic */ C1536520q5S LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ AbstractC1299910jvp<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536510q5R(RunnableC1536470q5N runnableC1536470q5N, C1536520q5S c1536520q5S, long j, AbstractC1299910jvp abstractC1299910jvp) {
        super(1);
        this.LL = runnableC1536470q5N;
        this.LLILLJJLI = c1536520q5S;
        this.LLILLL = j;
        this.LLILZ = abstractC1299910jvp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1532310pyf c1532310pyf) throws JSONException {
        C1532310pyf c1532310pyf2 = c1532310pyf;
        byte[] bArrLJIIJ = c1532310pyf2.LJIIJ();
        if (bArrLJIIJ != null) {
            C1536520q5S c1536520q5S = this.LLILLJJLI;
            long j = this.LLILLL;
            AbstractC1299910jvp<String> abstractC1299910jvp = this.LLILZ;
            String str = new String(bArrLJIIJ, Charsets.UTF_8);
            boolean z = C1536390q5F.LIZ;
            C1536390q5F.LJ(c1536520q5S.LIZIZ, null, c1532310pyf2, true, j);
            abstractC1299910jvp.LIZ(C1299210juh.LIZ(str));
        } else {
            this.LL.run();
        }
        return Unit.LIZ;
    }
}
