package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.SuggestEmotePageContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493060JVg extends C09AY implements Function2<UIAssem, C291001Au<? extends Pair<? extends AbstractC492880JUo, ? extends AbstractC492880JUo>>, Unit> {
    public final /* synthetic */ SuggestEmotePageContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493060JVg(SuggestEmotePageContentAssem suggestEmotePageContentAssem) {
        super(2);
        this.LL = suggestEmotePageContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Pair<? extends AbstractC492880JUo, ? extends AbstractC492880JUo>> c291001Au) {
        C20600815jK<InterfaceC1891350zJl> state;
        Integer numValueOf;
        C20600815jK<InterfaceC1891350zJl> state2;
        Pair<? extends AbstractC492880JUo, ? extends AbstractC492880JUo> pairLIZ = c291001Au.LIZ();
        if (pairLIZ != null) {
            SuggestEmotePageContentAssem suggestEmotePageContentAssem = this.LL;
            AbstractC492880JUo first = pairLIZ.getFirst();
            AbstractC492880JUo second = pairLIZ.getSecond();
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = suggestEmotePageContentAssem.LLJI;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null && (numValueOf = Integer.valueOf(state.LJIIIZ(first))) != null && numValueOf.intValue() > -1) {
                numValueOf.intValue();
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = suggestEmotePageContentAssem.LLJI;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    state2.LJIILJJIL(numValueOf.intValue(), second);
                }
            }
        }
        return Unit.LIZ;
    }
}
