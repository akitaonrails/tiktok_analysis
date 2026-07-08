package X;

import com.bytedance.ies.foundation.activity.BaseActivity;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19DK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DK extends C09AY implements Function0<ArrayList<C19DE>> {
    public final /* synthetic */ BaseActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19DK(BaseActivity baseActivity) {
        super(0);
        this.LL = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<C19DE> invoke() {
        return new ArrayList<>((Collection) this.LL.getBaseViewModel().vQ2().LIZ.getValue());
    }
}
