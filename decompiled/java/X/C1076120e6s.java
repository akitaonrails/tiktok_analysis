package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitNavTabAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0e6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076120e6s extends C09AY implements InterfaceC1631630sYr<UIAssem, C1076030e6j, C1076030e6j, C1076070e6n, Unit> {
    public final /* synthetic */ PoiRevisitNavTabAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1076120e6s(PoiRevisitNavTabAssem poiRevisitNavTabAssem) {
        super(4);
        this.LL = poiRevisitNavTabAssem;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(UIAssem uIAssem, C1076030e6j c1076030e6j, C1076030e6j c1076030e6j2, C1076070e6n c1076070e6n) {
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe navTabState data, areaData=");
        sbLIZ.append(c1076030e6j);
        sbLIZ.append(", categoryData=");
        sbLIZ.append(c1076030e6j2);
        sbLIZ.append(", sortData=");
        sbLIZ.append(c1076070e6n);
        sbLIZ.append('`');
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1076030e6j != null && c1076030e6j2 != null && c1076070e6n != null) {
            C1177670gkf.LIZ.getClass();
            if (C1177670gkf.LIZ() && !C297520BlO.LIZ()) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LLJI;
                if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                    state2.LJIILL(C1697810uHb.LJIIJJI(c1076030e6j, c1076030e6j2, c1076070e6n), null);
                }
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL.LLJI;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    state.LJIILL(C1697810uHb.LJIIJJI(c1076030e6j, c1076030e6j2), null);
                }
            }
        }
        return Unit.LIZ;
    }
}
