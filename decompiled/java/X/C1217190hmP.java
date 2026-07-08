package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditToolBottomNavigation;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217190hmP extends C09AY implements Function2<UIAssem, List<? extends C435160H4o>, Unit> {
    public final /* synthetic */ DecorationEditToolBottomNavigation LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217190hmP(DecorationEditToolBottomNavigation decorationEditToolBottomNavigation) {
        super(2);
        this.LL = decorationEditToolBottomNavigation;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, List<? extends C435160H4o> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        List<? extends C435160H4o> list2 = list;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LL.LLIZLLLIL.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(list2, null);
        }
        return Unit.LIZ;
    }
}
