package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160430gIr extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ RavenFragment<CONTEXT> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160430gIr(boolean z, RavenFragment<CONTEXT> ravenFragment, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = ravenFragment;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryFireAllFirstScreenRendered sparkReady=");
        sbLIZ.append(this.LL);
        sbLIZ.append("(complete=");
        sbLIZ.append(this.LLILLJJLI.LLLLIILL);
        sbLIZ.append(", drawEnd=");
        sbLIZ.append(this.LLILLJJLI.LLLLIILLL);
        sbLIZ.append(") mynaReady=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("(drawEnd=");
        sbLIZ.append(this.LLILLJJLI.LLLLILI);
        sbLIZ.append(") ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
