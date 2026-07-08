package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1164404h0 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ RavenFragment<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1164404h0(int i, int i2, boolean z, RavenFragment<Object> ravenFragment) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert onNext responseSessionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" bodyLayoutSize=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" treatAsSupplementCompletion=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZ.fT(Integer.valueOf(this.LL)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
