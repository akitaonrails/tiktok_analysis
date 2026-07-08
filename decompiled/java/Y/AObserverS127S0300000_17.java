package Y;

import X.C0TZM;
import X.C1082800eHe;
import X.C1088850eRP;
import X.C1099690eit;
import X.C1099730eix;
import X.C1099910ejF;
import X.C1099960ejK;
import X.C1102510enR;
import X.C1102690enj;
import X.C1124680fNC;
import X.C1127540fRo;
import X.C1161920gLG;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1085010eLD;
import X.EnumC1088870eRR;
import X.EnumC1099670eir;
import X.EnumC1102740eno;
import X.InterfaceC1124700fNE;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.CommentForceIconStyle;
import com.bytedance.android.live.CommentWidgetWidthChangeEvent;
import com.bytedance.android.live.setting.LiveToolbarLoadOptimizeSetting;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.other.LiveAudienceToolbarTimeConsumingOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS157S0101000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AObserverS127S0300000_17 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS127S0300000_17 aObserverS127S0300000_17, Object obj) {
        boolean z;
        if (((View) ((C1127540fRo) aObserverS127S0300000_17.l0).LLILZ.getValue()).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!C500260Jjc.LJJIJIIJIL(Boolean.valueOf(z))) {
            ((InterfaceC1124700fNE) aObserverS127S0300000_17.l1).LIZIZ((C1124680fNC) aObserverS127S0300000_17.l2);
        }
    }

    public static final void onChanged$1(AObserverS127S0300000_17 aObserverS127S0300000_17, Object obj) {
        int i;
        EnumC1085010eLD enumC1085010eLD;
        float fLJFF;
        EnumC1099670eir enumC1099670eir;
        if (((C1102510enR) obj).LIZ) {
            i = 0;
        } else {
            i = 8;
        }
        if (LiveToolbarLoadOptimizeSetting.INSTANCE.enableAnimationOptimize(((C1099960ejK) aObserverS127S0300000_17.l0).LIZJ) && !C500260Jjc.LJIIZILJ(((C1099960ejK) aObserverS127S0300000_17.l0).LIZJ) && !Intrinsics.LJFF(((C1099960ejK) aObserverS127S0300000_17.l0).LIZJ.gg0(C0TZM.class), Boolean.FALSE) && !Intrinsics.LJFF(((C1099960ejK) aObserverS127S0300000_17.l0).LIZJ.gg0(C1082800eHe.class), Boolean.TRUE)) {
            C1102690enj c1102690enjHy0 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0(((C1099960ejK) aObserverS127S0300000_17.l0).LIZJ);
            if (c1102690enjHy0 == null) {
                C786410Ut5.LJLLLLLL(i, (View) aObserverS127S0300000_17.l1);
                return;
            }
            EnumC1088870eRR enumC1088870eRRLJFF = c1102690enjHy0.LJFF((EnumC1102740eno) aObserverS127S0300000_17.l2);
            if (enumC1088870eRRLJFF != null) {
                int i2 = C1088850eRP.LIZ[enumC1088870eRRLJFF.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        enumC1085010eLD = EnumC1085010eLD.RIGHT;
                    }
                } else {
                    enumC1085010eLD = EnumC1085010eLD.LEFT;
                }
                if (enumC1085010eLD != null) {
                    if (LiveAudienceToolbarTimeConsumingOptimizeSetting.INSTANCE.optimizeCalculate()) {
                        fLJFF = C1099910ejF.LIZJ(((C1099960ejK) aObserverS127S0300000_17.l0).LIZ()) * 2;
                    } else {
                        fLJFF = C1099910ejF.LJFF(((C1099960ejK) aObserverS127S0300000_17.l0).LIZ());
                    }
                    Pair pair = (Pair) ((C1099960ejK) aObserverS127S0300000_17.l0).LIZJ.gg0(CommentForceIconStyle.class);
                    if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
                        return;
                    }
                    float fLJJI = (C497740JfY.LJJI(C497740JfY.LJIIZILJ()) - fLJFF) - (C1099730eix.LIZ(((C1099960ejK) aObserverS127S0300000_17.l0).LIZLLL) * ((ArrayList) c1102690enjHy0.LIZLLL()).size());
                    DataChannel dataChannel = ((C1099960ejK) aObserverS127S0300000_17.l0).LIZJ;
                    String strName = ((EnumC1102740eno) aObserverS127S0300000_17.l2).name();
                    View view = (View) aObserverS127S0300000_17.l1;
                    if (i == 0) {
                        enumC1099670eir = EnumC1099670eir.SHOW;
                    } else {
                        enumC1099670eir = EnumC1099670eir.HIDE;
                    }
                    dataChannel.LC0(CommentWidgetWidthChangeEvent.class, new C1099690eit(strName, view, enumC1099670eir, enumC1085010eLD, (int) C497740JfY.LIZIZ(fLJJI), new AwS157S0101000_17(i, (View) aObserverS127S0300000_17.l1, 4)));
                    return;
                }
            }
            C786410Ut5.LJLLLLLL(i, (View) aObserverS127S0300000_17.l1);
            return;
        }
        C786410Ut5.LJLLLLLL(i, (View) aObserverS127S0300000_17.l1);
    }

    public AObserverS127S0300000_17(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
