package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160510gIz extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ RavenFragment<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160510gIz(int i, int i2, RavenFragment ravenFragment, String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement visibility commit source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" callback=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" expectedInsertStart=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" expectedInsertCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZIL.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
