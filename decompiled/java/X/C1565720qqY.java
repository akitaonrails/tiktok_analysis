package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopTopTabProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565720qqY extends C09AY implements Function0<InterfaceC665370Q7z> {
    public final /* synthetic */ ShopTopTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565720qqY(ShopTopTabProtocol shopTopTabProtocol) {
        super(0);
        this.LL = shopTopTabProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC665370Q7z invoke() {
        C19EG c19egLIZIZ;
        Context context = this.LL.LLILZIL;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            return C1558360qeg.LJI(c19egLIZIZ, null);
        }
        "can not find activity for context".toString();
        throw new IllegalArgumentException("can not find activity for context");
    }
}
