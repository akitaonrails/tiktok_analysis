package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04j4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1177204j4 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<BaseComponentData> LLILLL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILZ;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ RavenFragment<Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1177204j4(int i, int i2, List<? extends BaseComponentData> list, List<? extends InterfaceC1891350zJl> list2, List<InterfaceC1891350zJl> list3, boolean z, RavenFragment<Object> ravenFragment) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
        this.LLILZLL = z;
        this.LLIZ = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert merge responseSessionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" startIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" components.size=");
        sbLIZ.append(this.LLILLL.size());
        sbLIZ.append(" currentSize=");
        sbLIZ.append(this.LLILZ.size());
        sbLIZ.append(" newSize=");
        sbLIZ.append(this.LLILZIL.size());
        sbLIZ.append(" treatAsSupplementCompletion=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLIZ.fT(Integer.valueOf(this.LL)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
