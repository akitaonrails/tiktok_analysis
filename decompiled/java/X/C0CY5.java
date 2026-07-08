package X;

import com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CY5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CY5 extends C09AY implements Function1<C19EG, Unit> {
    public final /* synthetic */ SocialThoughtRouteAction LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CY5(SocialThoughtRouteAction socialThoughtRouteAction, String str, String str2, String str3) {
        super(1);
        this.LL = socialThoughtRouteAction;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19EG c19eg) {
        this.LL.startLikePanelFlow(c19eg, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
