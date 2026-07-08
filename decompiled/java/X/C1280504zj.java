package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280504zj extends C09AY implements Function0<Object> {
    public final /* synthetic */ Map.Entry<String, PageInfo> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280504zj(Map.Entry<String, PageInfo> entry) {
        super(0);
        this.LL = entry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reissue btm_page_show showId=");
        sbLIZ.append(this.LL.getKey());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
