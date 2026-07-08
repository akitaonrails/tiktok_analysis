package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491670JPx extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ SuggestEmotePageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491670JPx(SuggestEmotePageFragment suggestEmotePageFragment) {
        super(1);
        this.LL = suggestEmotePageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        SuggestEmotePageFragment suggestEmotePageFragment = this.LL;
        c062p.LIZ = new C0JQ3(suggestEmotePageFragment.LLILZ, suggestEmotePageFragment.LLILZIL, suggestEmotePageFragment.LLIZLLLIL, suggestEmotePageFragment.LLILLL, suggestEmotePageFragment.LLILZLL);
        return Unit.LIZ;
    }
}
