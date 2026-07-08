package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.SubWaveEmotePageContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493140JVo extends C09AY implements Function2<UIAssem, List<C0JUN>, Unit> {
    public final /* synthetic */ SubWaveEmotePageContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493140JVo(SubWaveEmotePageContentAssem subWaveEmotePageContentAssem) {
        super(2);
        this.LL = subWaveEmotePageContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, List<C0JUN> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        List<C0JUN> list2 = list;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LLJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(list2, null);
        }
        return Unit.LIZ;
    }
}
