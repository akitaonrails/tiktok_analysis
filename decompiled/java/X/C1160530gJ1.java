package X;

import com.bytedance.hybrid.spark.raven.data.InsertInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gJ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160530gJ1 extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InsertInfo LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160530gJ1(boolean z, InsertInfo insertInfo, int i) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = insertInfo;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRavenResponse onComponentsResponse isLoadMorePartial=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" insert=");
        sbLIZ.append(this.LLILLJJLI != null);
        sbLIZ.append(" bodyComponentsSize=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
