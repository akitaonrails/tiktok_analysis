package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04h4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1164804h4 extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ RavenFragment<CONTEXT> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1164804h4(int i, RavenFragment ravenFragment, String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement wait next preDraw before restore source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" requiredChildCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" maxPreDrawAttempts=");
        sbLIZ.append(4);
        sbLIZ.append(" handlers=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZ.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
