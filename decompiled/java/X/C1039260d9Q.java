package X;

import android.content.Context;
import com.ss.android.ugc.aweme.web.business.jump.AdWebJumpUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0d9Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039260d9Q extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039260d9Q(Context context, String str, String str2, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL) {
            AdWebJumpUtils.INSTANCE.startAdsAppActivity(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
