package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZ5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DZ5(C19EG c19eg, String str, String str2) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
        if (socialThoughtService != null) {
            socialThoughtService.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
