package X;

import android.content.Context;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.route.MinisRouteInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Axd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196351Axd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MinisRouteInterceptor LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ SchemaParserData LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C2196441Axm LLIZLLLIL;
    public final /* synthetic */ MinisMetaResp LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2196351Axd(MinisRouteInterceptor minisRouteInterceptor, int i, int i2, Object obj, Context context, SchemaParserData schemaParserData, long j, C2196441Axm c2196441Axm, MinisMetaResp minisMetaResp) {
        super(0);
        this.LL = minisRouteInterceptor;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = obj;
        this.LLILZIL = context;
        this.LLILZLL = schemaParserData;
        this.LLIZ = j;
        this.LLIZLLLIL = c2196441Axm;
        this.LLJ = minisMetaResp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL.LL) {
            this.LL.LL = true;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleRoute, ");
            sbLIZ.append(this.LL);
            sbLIZ.append(", OnLoginAndLogoutResult, action:");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", result:");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", data:");
            sbLIZ.append(this.LLILZ);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LL.LIZ(this.LLILZIL, this.LLILZLL, true, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        }
        return Unit.LIZ;
    }
}
