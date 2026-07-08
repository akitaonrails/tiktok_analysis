package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.SubWaveEmotePageContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.common.utility.Logger;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493130JVn extends C09AY implements Function2<UIAssem, C291001Au<? extends Pair<? extends C0JUN, ? extends C0JUN>>, Unit> {
    public final /* synthetic */ SubWaveEmotePageContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493130JVn(SubWaveEmotePageContentAssem subWaveEmotePageContentAssem) {
        super(2);
        this.LL = subWaveEmotePageContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Pair<? extends C0JUN, ? extends C0JUN>> c291001Au) {
        Integer numValueOf;
        int iHashCode;
        List<InterfaceC1891350zJl> listLJII;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        C20600815jK<InterfaceC1891350zJl> state3;
        C20600815jK<InterfaceC1891350zJl> state4;
        Pair<? extends C0JUN, ? extends C0JUN> pairLIZ = c291001Au.LIZ();
        if (pairLIZ != null) {
            SubWaveEmotePageContentAssem subWaveEmotePageContentAssem = this.LL;
            C0JUN first = pairLIZ.getFirst();
            C0JUN second = pairLIZ.getSecond();
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = subWaveEmotePageContentAssem.LLJI;
            List<InterfaceC1891350zJl> listLJII2 = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state4 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                numValueOf = Integer.valueOf(state4.LJIIIZ(first));
            } else {
                numValueOf = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update start index=");
            sbLIZ.append(numValueOf);
            sbLIZ.append(", ");
            int iHashCode2 = 0;
            if (first != null) {
                iHashCode = first.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(",list=");
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = subWaveEmotePageContentAssem.LLJI;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state3 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                listLJII = state3.LJII();
            } else {
                listLJII = null;
            }
            sbLIZ.append(listLJII);
            Logger.i("subwaveemote", C2188811AlT.LIZIZ(sbLIZ));
            if (numValueOf != null && numValueOf.intValue() > -1) {
                numValueOf.intValue();
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = subWaveEmotePageContentAssem.LLJI;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                    state2.LJIILJJIL(numValueOf.intValue(), second);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update end index=");
                sbLIZ2.append(numValueOf);
                sbLIZ2.append(", ");
                if (second != null) {
                    iHashCode2 = second.hashCode();
                }
                sbLIZ2.append(iHashCode2);
                sbLIZ2.append(",list=");
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = subWaveEmotePageContentAssem.LLJI;
                if (viewOnAttachStateChangeListenerC20604515jv4 != null && (state = viewOnAttachStateChangeListenerC20604515jv4.getState()) != null) {
                    listLJII2 = state.LJII();
                }
                sbLIZ2.append(listLJII2);
                Logger.i("subwaveemote", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return Unit.LIZ;
    }
}
