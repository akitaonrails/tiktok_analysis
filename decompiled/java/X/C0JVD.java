package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JVD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JVD extends C09AY implements Function1<C492830JUj, Unit> {
    public final /* synthetic */ SuggestEmotePageViewModel LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JVD(SuggestEmotePageViewModel suggestEmotePageViewModel, Context context) {
        super(1);
        this.LL = suggestEmotePageViewModel;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C492830JUj c492830JUj) {
        SuggestEmotePageViewModel suggestEmotePageViewModel = this.LL;
        C500260Jjc.LJJJJJ(suggestEmotePageViewModel, null, new C0JVK(c492830JUj, suggestEmotePageViewModel, this.LLILLJJLI, null), 3);
        return Unit.LIZ;
    }
}
