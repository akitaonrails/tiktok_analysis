package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160500gIy extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILZ;
    public final /* synthetic */ RavenFragment<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1160500gIy(String str, int i, int i2, List<? extends InterfaceC1891350zJl> list, RavenFragment<Object> ravenFragment) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = list;
        this.LLILZIL = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishFirstFetchSupplement enter source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" cursor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" next=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" data.size=");
        sbLIZ.append(this.LLILZ.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZIL.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
