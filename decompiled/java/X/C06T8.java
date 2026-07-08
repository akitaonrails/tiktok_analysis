package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06T8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06T8 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ RavenFragment<Object> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06T8(int i, boolean z, RavenFragment<Object> ravenFragment, boolean z2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = ravenFragment;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldStartFirstFetchSupplement currentCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" shouldFetchMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" triggeredOnce=");
        sbLIZ.append(this.LLILLL.LLLF);
        sbLIZ.append(" result=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
