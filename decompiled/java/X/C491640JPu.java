package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491640JPu extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SuggestEmotePageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491640JPu(SuggestEmotePageFragment suggestEmotePageFragment) {
        super(1);
        this.LL = suggestEmotePageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        SuggestEmotePageFragment suggestEmotePageFragment = this.LL;
        assembler2.DQ2(suggestEmotePageFragment, new C491670JPx(suggestEmotePageFragment));
        assembler2.QQ2(this.LL, new C1144604do());
        assembler2.QQ2(this.LL, new C491650JPv());
        assembler2.QQ2(this.LL, new C491660JPw());
        return Unit.LIZ;
    }
}
