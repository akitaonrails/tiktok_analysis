package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515000KHq extends C09AY implements Function1<Map<String, ? extends String>, Unit> {
    public final /* synthetic */ SubPackagePageDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515000KHq(SubPackagePageDialog subPackagePageDialog) {
        super(1);
        this.LL = subPackagePageDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends String> map) {
        Map<String, ? extends String> map2 = map;
        Map<String, String> map3 = this.LL.LLJJ;
        if (map3 != null) {
            map3.putAll(map2);
        }
        return Unit.LIZ;
    }
}
