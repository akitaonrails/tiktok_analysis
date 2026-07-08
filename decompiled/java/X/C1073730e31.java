package X;

import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0e31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073730e31 extends C09AY implements Function2<InterfaceC960503pD, Boolean, Unit> {
    public final /* synthetic */ SocialConsentFragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073730e31(SocialConsentFragment socialConsentFragment, String str) {
        super(2);
        this.LL = socialConsentFragment;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC960503pD interfaceC960503pD, Boolean bool) {
        if (bool.booleanValue()) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
            c1389890mGx.LJIIJ(this.LLILLJJLI);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
