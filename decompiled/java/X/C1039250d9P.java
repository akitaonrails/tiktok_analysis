package X;

import android.content.Context;
import com.ss.android.ugc.aweme.web.business.jump.AdWebJumpUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0d9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039250d9P extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039250d9P(boolean z, Context context, C259800zU<String> c259800zU) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = context;
        this.LLILLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL) {
            AdWebJumpUtils.INSTANCE.startAdsAppActivity(this.LLILLJJLI, this.LLILLL.element, null);
        }
        return Unit.LIZ;
    }
}
