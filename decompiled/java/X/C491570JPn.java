package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491570JPn extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SuggestEmotePageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491570JPn(SuggestEmotePageFragment suggestEmotePageFragment) {
        super(2);
        this.LL = suggestEmotePageFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        Object obj = c291001Au.LIZ;
        if (!((Boolean) obj).booleanValue()) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            SuggestEmotePageFragment suggestEmotePageFragment = this.LL;
            bool.booleanValue();
            Function0<Unit> function0 = suggestEmotePageFragment.LLIZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }
}
