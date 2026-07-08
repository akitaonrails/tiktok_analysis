package X;

import com.bytedance.android.btm.api.config.ParamKV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.005R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005R extends C09AY implements Function0<Object> {
    public final /* synthetic */ Map<String, List<ParamKV>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C005R(Map<String, List<ParamKV>> map) {
        super(0);
        this.LL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load event config success, size = ");
        sbLIZ.append(this.LL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
